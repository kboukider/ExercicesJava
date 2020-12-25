package programminghubgoogle.system;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class FindIpAddressOfMachine {

	public static void main(String[] args) {
		try {
		InetAddress ipAddr = InetAddress.getLocalHost();
		System.out.println("\nIP address of the machine : " + ipAddr.getHostAddress());
		} catch (UnknownHostException ex) {
			ex.printStackTrace();
		}
	}

}
