package rdp;
import java.net.Socket;
import javax.swing.JOptionPane;
public class Start {
	static String port="4907";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ip=JOptionPane.showInputDialog("please enter server ip");
		new Start().initialize(ip, Integer.parseInt(port));
	}
	
	public void initialize(String ip, int port) {
		try {
			Socket sc=new Socket(ip,port);
			System.out.println("Connecting to the server");
			Authentification frame1=new Authentification(sc);
			frame1.setSize(300,80);
			frame1.setLocation(500,300);
			frame1.setVisible(true);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
