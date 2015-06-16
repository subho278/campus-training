import java.net.*;
import java.io.*;

public class Server {
	public static void main(String[] args) throws IOException {

		if (args.length != 1) {
			System.err.println("Usage: java KnockKnockServer <port number>");
			System.exit(1);
		}

		int portNumber = Integer.parseInt(args[0]);

		try (ServerSocket serverSocket = new ServerSocket(portNumber);
				Socket clientSocket = serverSocket.accept();
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {

			String inputLine, outputLine;

			// Initiate conversation with client
			Protocol p = new Protocol();
			outputLine = p.processInput(null);
			out.println(outputLine);

			while ((inputLine = in.readLine()) != null) {
				outputLine = p.processInput(inputLine);
				out.println(outputLine);
				if (outputLine.equals("DONE")) {
					File transferFile = new File("/home/zemoso02/assignments.txt");
					FileInputStream input = new FileInputStream(transferFile);
					OutputStream output = clientSocket.getOutputStream();
					byte[] buf = new byte[(int)transferFile.length()];
					int bytesRead;
					while ((bytesRead = input.read(buf)) != -1) {
						output.write(buf, 0, bytesRead);
					}
					break;
				}
			}
		} catch (IOException e) {
			System.out
					.println("Exception caught when trying to listen on port "
							+ portNumber + " or listening for a connection");
			System.out.println(e.getMessage());
		}
	}
}