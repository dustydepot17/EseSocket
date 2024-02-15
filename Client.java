public class Client {
	public static void main (String args[]) throws IOException{
		String hostname = "localhost";
		int port = 12345;

		try (Socket socket = new Socket(hostname, port);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
			String fromserver;
			while (( fromserver = in.readLine()) != null) {
				System.out.println("Server: " + fromserver);
				break;
			}
		}
	}
}	