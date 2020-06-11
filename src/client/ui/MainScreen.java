package client.ui;import java.awt.BorderLayout;import java.awt.Color;import java.awt.Container;import java.awt.GridLayout;import java.awt.Image;import java.awt.Toolkit;import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import java.util.ArrayList;import javax.swing.GroupLayout;import javax.swing.GroupLayout.Alignment;import client.Background;import javax.swing.ImageIcon;import javax.swing.JButton;import javax.swing.JFrame;import javax.swing.JLabel;import javax.swing.JPanel;import javax.swing.JTextField;import music.MusicPlayer;import vo.PlayerVO;public class MainScreen extends JFrame {	public final int SCREEN_WIDTH = 1280;	public final int SCREEN_HEIGHT = 720;	private Container content;	private Background back = new Background();	private JTextField tf;	private JButton btn1, btn2, btn3, btn4, btn5, btn6;	private JPanel[] panlist = new JPanel[5];	public static void exitPlayer(PlayerVO vo) {	}	public MainScreen() {		this.mainScreen();			}	public void mainScreen() {		for (int i = 0; i < panlist.length; i++) {			panlist[i] = new JPanel();			if (i == 0) {				panlist[i].setBounds(420, 440, 420, 180);			} else if (i == 1) {				panlist[i].setBounds(0, 215, 350, 180);			} else if (i == 2) {				panlist[i].setBounds(0, 30, 350, 180);			} else if (i == 3) {				panlist[i].setBounds(910, 30, 350, 180);			} else if (i == 4) {				panlist[i].setBounds(910, 215, 350, 180);			}			panlist[i].setLayout(null);			panlist[i].setBackground(new Color(0, 0, 0, 122));			add(panlist[i]);		}		JPanel pan = new JPanel();		pan.setBounds(0, 620, 1280, 60);		pan.setLayout(new GridLayout(1, 6));		pan.setOpaque(false);		add(pan); // 배팅 버튼 패널//		if (turn == myturn) {		JButton btn1 = new JButton(new ImageIcon(MainScreen.class.getResource("../../img/Allin.PNG")));		btn1.setOpaque(false);		pan.add(btn1);		JButton btn2 = new JButton(new ImageIcon(MainScreen.class.getResource("../../img/Half.PNG")));		btn2.setOpaque(false);		pan.add(btn2);		JButton btn3 = new JButton(new ImageIcon(MainScreen.class.getResource("../../img/Quater.PNG")));				btn3.setOpaque(false);		pan.add(btn3);		JButton btn4 = new JButton(new ImageIcon(MainScreen.class.getResource("../../img/Bbing.PNG")));		btn4.setOpaque(false);		pan.add(btn4);		JButton btn5 = new JButton(new ImageIcon(MainScreen.class.getResource("../../img/Call.PNG")));		btn5.setOpaque(false);		pan.add(btn5);		JButton btn6 = new JButton(new ImageIcon(MainScreen.class.getResource("../../img/Die.PNG")));		btn6.setOpaque(false);		pan.add(btn6);		ActionListener action = new ActionListener() {			@Override			public void actionPerformed(ActionEvent e) {				System.out.println(e.getSource());				System.out.println(btn1);				if (e.getSource() == btn1) {					tf.setText("올인 배팅");				} else if (e.getSource() == btn2) {					tf.setText("하프 배팅");				} else if (e.getSource() == btn3) {					tf.setText("쿼터 배팅");				} else if (e.getSource() == btn4) {					tf.setText("삥 배팅");				} else if (e.getSource() == btn5) {					tf.setText("콜 배팅");				} else if (e.getSource() == btn6) {					tf.setText("다이 배팅");				}			}		};		btn1.addActionListener(action);		btn2.addActionListener(action);		btn3.addActionListener(action);		btn4.addActionListener(action);		btn5.addActionListener(action);		btn6.addActionListener(action); // 버튼 클릭 시 텍스트 표시//		}else {//			//		}	//비활성화 버튼		JPanel pan6 = new JPanel();		pan6.setBounds(410, 100, 440, 300);		pan6.setBackground(new Color(0, 0, 0, 122));		add(pan6); // 배팅 금액 패널		JLabel littleMoney = new JLabel(new ImageIcon(MainScreen.class.getResource("../../img/littleMoney.PNG")));		JLabel manyMoney = new JLabel(new ImageIcon(MainScreen.class.getResource("../../img/manyMoney.PNG")));		littleMoney.setBounds(10, 10, 420, 280);		manyMoney.setBounds(10, 10, 420, 280);		tf = new JTextField(15);		pan.add(tf);		tf.setBounds(300, 300, 400, 150);//		if(stackMoney >= 10000000) {//		pan6.add(littleMoney);//		}else {		pan6.add(manyMoney);//		}		pan6.add(tf);		setTitle("섯다 온라인 게임");		back.mainImage();		content = getContentPane();		content.add(back, BorderLayout.CENTER);		back.setOpaque(false);		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);		setResizable(false);		setVisible(true); // 배경화면		new Thread(new MusicPlayer()).start(); // 배경음악		Toolkit toolkit = Toolkit.getDefaultToolkit();		Image img = toolkit.getImage(MainScreen.class.getResource("../../img/titleIcon.jpg"));		setIconImage(img);		GroupLayout groupLayout = new GroupLayout(getContentPane());		groupLayout.setHorizontalGroup(				groupLayout.createParallelGroup(Alignment.LEADING).addGap(0, 1274, Short.MAX_VALUE));		groupLayout				.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGap(0, 691, Short.MAX_VALUE));		getContentPane().setLayout(groupLayout);	}		public void enterPlayer(ArrayList<PlayerVO> voList) {				for (int i = 0; i < voList.size(); i++) {			JLabel card1 = new JLabel(new ImageIcon(MainScreen.class.getResource("../../img/Pae.PNG")));			JLabel card2 = new JLabel(new ImageIcon(MainScreen.class.getResource("../../img/Pae.PNG")));			JTextField nicText = new JTextField(voList.get(i).getNic());			JTextField moneyText = new JTextField(voList.get(i).getMoney() + "");			JLabel profile = new JLabel(new ImageIcon(MainScreen.class.getResource("../../img/" + voList.get(i).getCha() + ".PNG")));			if (i == 1 || i == 2) {				card1.setBounds(170, 10, 110, 160);				card1.setOpaque(false);				card2.setBounds(230, 10, 110, 160);				card2.setOpaque(false);				profile.setBounds(10, 20, 110, 100);				profile.setOpaque(false);				nicText.setBounds(220, 120, 110, 20);				nicText.setOpaque(false);				moneyText.setBounds(220, 150, 110, 20);				moneyText.setOpaque(false);			} else if (i == 3 || i == 4) {				card1.setBounds(10, 10, 110, 160);				card1.setOpaque(false);				card2.setBounds(70, 10, 110, 160);				card2.setOpaque(false);				profile.setBounds(220, 20, 110, 100);				profile.setOpaque(false);				nicText.setBounds(10, 120, 110, 20);				nicText.setOpaque(false);				moneyText.setBounds(10, 150, 110, 20);				moneyText.setOpaque(false);			} else {				card1.setBounds(180, 10, 110, 160);				card1.setOpaque(false);				card2.setBounds(300, 10, 110, 160);				card2.setOpaque(false);				profile.setBounds(10, 20, 130, 100);				profile.setOpaque(false);				nicText.setBounds(20, 120, 110, 20);				nicText.setOpaque(false);				moneyText.setBounds(20, 150, 110, 20);				moneyText.setOpaque(false);			}			panlist[i].add(card1);			panlist[i].add(card2);			panlist[i].add(profile);						panlist[i].add(nicText);			panlist[i].add(moneyText);						nicText.setHorizontalAlignment(JLabel.CENTER);			moneyText.setHorizontalAlignment(JLabel.CENTER);			nicText.setForeground(Color.white);			moneyText.setForeground(Color.white);			add(panlist[i]);		}	}	public static void main(String[] args) {		ArrayList<PlayerVO> voList = new ArrayList<PlayerVO>();		voList.add(new PlayerVO("1hyo", 1, 600000));		voList.add(new PlayerVO("2hyo", 0, 34600000));		voList.add(new PlayerVO("3hyo", 1, 1345000));		voList.add(new PlayerVO("4hyo", 0, 120000));		voList.add(new PlayerVO("5hyo", 1, 4000));		MainScreen ms = new MainScreen();		//		ms.enterPlayer(voList);	}}