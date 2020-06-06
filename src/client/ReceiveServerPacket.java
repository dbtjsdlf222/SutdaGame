package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;

import vo.Protocol;
import vo.Packet;

public class ReceiveServerPacket extends Thread {
	private Socket socket;

	public ReceiveServerPacket(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		ObjectMapper mapper = new ObjectMapper();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"))) {
			ChattingOperator co = ChattingOperator.getInstance();
			
			while (true) {
				String packetStr = br.readLine();
				Packet packet = mapper.readValue(packetStr, Packet.class);

				switch (packet.getAction()) {
					case Protocol.MESSAGE:
						co.chatArea.append(packet.getPlayerVO().getNic()+": "+ packet.getMotion()+"\n");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // run
} // class