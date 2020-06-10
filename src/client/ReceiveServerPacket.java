package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JScrollPane;

import com.fasterxml.jackson.databind.ObjectMapper;

import operator.ChattingOperator;
import vo.Packet;

public class ReceiveServerPacket extends Thread {
	private Socket socket;
	ClientPacketController cpc = new ClientPacketController();

	public ReceiveServerPacket(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		ObjectMapper mapper = new ObjectMapper();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"))) {

			while (true) {
				String packetStr = br.readLine();
//				System.out.println(packetStr);
				Packet packet = mapper.readValue(packetStr, Packet.class);
				cpc.packetController(packet);
			}
		} catch (Exception e) {
			// 종료시 실행 구역
			e.printStackTrace();
		}
	} // run
} // class