import java.io.*;
import java.net.*;
import java.util.Scanner;
public class UserWriteClientThread extends Thread {
  private PrintWriter writer;
  private Socket socket;
  private ChatClient client;
  private Scanner tec;
  public UserWriteClientThread(Socket socket, ChatClient client) {
    this.socket = socket;
    this.client = client;
     tec= new Scanner(System.in);
    try {
      OutputStream output = socket.getOutputStream();
      writer = new PrintWriter(output, true);
    } catch (IOException ex) {
      System.out.println("Error: " + ex.getMessage());
      ex.printStackTrace();
    }
  }

  public void run() {
	  
    String userName = tec.nextLine();

    String text;

    do {
      text = tec.nextLine();
      writer.println(text);
    } while (!text.equals("bye"));

    try {
      socket.close();
    } catch (IOException ex) {
      System.out.println("Error: " + ex.getMessage());
    }
  }
}