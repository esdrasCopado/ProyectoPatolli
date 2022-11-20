import java.net.*;
import java.io.*;

public class ChatClient {
  private String hostname;
  private int port;
  private String userName;

  public ChatClient(String hostname, int port) {
    this.hostname = hostname;
    this.port = port;
  }

  public static void main(String[] args) {


    ChatClient client = new ChatClient("localhost", 8010);
    client.execute();
  }

  public void execute() {
    try {
      Socket socket = new Socket(hostname, port);
      System.out.println("Conectado al Servidor de Chat.");
      new UserReadClientThread(socket, this).start();
      new UserWriteClientThread(socket, this).start();
    } catch (UnknownHostException ex) {
      System.out.println("No se encontró el servidor: " + ex.getMessage());
    } catch (IOException ex) {
      System.out.println("Error: " + ex.getMessage());
    }
  }

  void setUserName(String userName) {
    this.userName = userName;
  }

  String getUserName() {
    return this.userName;
  }
}