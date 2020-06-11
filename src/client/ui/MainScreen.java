package client.ui;import java.awt.BorderLayout;import java.awt.Color;import java.awt.Container;import java.awt.Graphics;import java.awt.GridLayout;import java.awt.Image;import java.awt.Toolkit;import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import java.util.ArrayList;import javax.swing.GroupLayout;import javax.swing.GroupLayout.Alignment;import client.Background;import javax.swing.ImageIcon;import javax.swing.JButton;import javax.swing.JFrame;import javax.swing.JLabel;import javax.swing.JPanel;import javax.swing.JTextField;import music.MusicPlayer;import vo.PlayerVO;public class MainScreen extends JFrame {	public final int SCREEN_WIDTH = 1280;	public final int SCREEN_HEIGHT = 720;	private Container content;	private Background back = new Background();	private JTextField tf;	private JButton btn1, btn2, btn3, btn4, btn5, btn6;	private JPanel[] panlist = new JPanel[5];	private JLabel[] card1 = new JLabel[5];	private JLabel[] card2 = new JLabel[5];	JTextField[] nicText = new JTextField[5];	JTextField[] moneyText = new JTextField[5];	JLabel[] profile = new JLabel[5];	public static void exitPlayer(PlayerVO vo) {	}	public MainScreen() {		this.mainScreen();	}	public void mainScreen() {		for (int i = 0; i < panlist.length; i++) {			panlist[i] = new JPanel();			if (i == 0) {				panlist[i].setBounds(460, 440, 350, 180);			} else if (i == 1) {				panlist[i].setBounds(0, 215, 350, 180);			} else if (i == 2) {				panlist[i].setBounds(0, 30, 350, 180);			} else if (i == 3) {				panlist[i].setBounds(915, 30, 350, 180);			} else if (i == 4) {				panlist[i].setBounds(915, 215, 350, 180);			}			panlist[i].setLayout(null);			panlist[i].setBackground(new Color(0, 0, 0, 122));			add(panlist[i]);		}		JPanel pan = new JPanel();		pan.setBounds(0, 620, 1280, 60);		pan.setLayout(new GridLayout(1, 6));		// pan.setOpaque(false);		add(pan); // 배팅 버튼 패널//		if (turn == myturn) {		JButton btn1 = new JButton(new ImageIcon(MainScreen.class.getResource("../../img/Allin.PNG")));		btn1.setOpaque(false);		pan.add(btn1);		JButton btn2 = new JButton(new ImageIcon(MainScreen.class.getResource("../../img/Half.PNG")));		btn2.setOpaque(false);		pan.add(btn2);		JButton btn3 = new JButton(new ImageIcon(MainScreen.class.getResource("../../img/Quater.PNG")));		btn3.setOpaque(false);		pan.add(btn3);		JButton btn4 = new JButton(new ImageIcon(MainScreen.class.getResource("../../img/Bbing.PNG")));		btn4.setOpaque(false);		pan.add(btn4);		JButton btn5 = new JButton(new ImageIcon(MainScreen.class.getResource("../../img/Call.PNG")));		btn5.setOpaque(false);		pan.add(btn5);		JButton btn6 = new JButton(new ImageIcon(MainScreen.class.getResource("../../img/Die.PNG")));		btn6.setOpaque(false);		pan.add(btn6);		ActionListener action = new ActionListener() {			@Override			public void actionPerformed(ActionEvent e) {				System.out.println(e.getSource());				System.out.println(btn1);				if (e.getSource() == btn1) {					tf.setText("올인");				} else if (e.getSource() == btn2) {					tf.setText("하프");				} else if (e.getSource() == btn3) {					tf.setText("쿼터");				} else if (e.getSource() == btn4) {					tf.setText("삥");				} else if (e.getSource() == btn5) {					tf.setText("콜");				} else if (e.getSource() == btn6) {					tf.setText("다이");				}			}		};		btn1.addActionListener(action);		btn2.addActionListener(action);		btn3.addActionListener(action);		btn4.addActionListener(action);		btn5.addActionListener(action);		btn6.addActionListener(action); // 버튼 클릭 시 텍스트 표시//		}else {//			//		}	//비활성화 버튼		JPanel pan6 = new JPanel();		pan6.setBounds(410, 100, 440, 300);		pan6.setBackground(new Color(0, 0, 0, 122));		add(pan6); // 배팅 금액 패널		JLabel littleMoney = new JLabel(new ImageIcon(MainScreen.class.getResource("../../img/littleMoney.PNG")));		JLabel manyMoney = new JLabel(new ImageIcon(MainScreen.class.getResource("../../img/manyMoney.PNG")));		littleMoney.setBounds(10, 10, 420, 280);		manyMoney.setBounds(10, 10, 420, 280);		tf = new JTextField(15);		pan.add(tf);		tf.setBounds(300, 300, 400, 150);//		if(stackMoney >= 10000000) {//		pan6.add(littleMoney);//		}else {		pan6.add(manyMoney);//		}		pan6.add(tf);		setTitle("섯다 온라인");		back.mainImage();		content = getContentPane();		content.add(back, BorderLayout.CENTER);		back.setOpaque(false);		setSize(SCREEN_WIDTH, SCREEN_HEIGHT);		setResizable(false);		setVisible(true); // 배경화면		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		new Thread(new MusicPlayer()).start(); // 배경음악		Toolkit toolkit = Toolkit.getDefaultToolkit();		Image img = toolkit.getImage(MainScreen.class.getResource("../../img/titleIcon.jpg"));		setIconImage(img);		GroupLayout groupLayout = new GroupLayout(getContentPane());		groupLayout.setHorizontalGroup(				groupLayout.createParallelGroup(Alignment.LEADING).addGap(0, 1274, Short.MAX_VALUE));		groupLayout				.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGap(0, 691, Short.MAX_VALUE));		getContentPane().setLayout(groupLayout);	}	public void enterPlayer(ArrayList<PlayerVO> voList) {		for (int i = 0; i < voList.size(); i++) {			// JTextField nicText = new JTextField(voList.get(i).getNic());			// JTextField nicText2 = new JTextField(voList.get(i).getNic());			// JTextField nicText3 = new JTextField(voList.get(i).getNic());			// JTextField nicText4 = new JTextField(voList.get(i).getNic());			card1[i] = new JLabel(new ImageIcon(MainScreen.class.getResource("../../img/Pae.PNG")));			card2[i] = new JLabel(new ImageIcon(MainScreen.class.getResource("../../img/Pae.PNG")));			nicText[i] = new JTextField(voList.get(i).getNic());			moneyText[i] = new JTextField(voList.get(i).getMoney() + "");			if (i == 1 || i == 2) {				profile[i] = new JLabel(new ImageIcon(						MainScreen.class.getResource("../../img/character/cha" + voList.get(i).getCha() + "_.PNG")));			}			else {				profile[i] = new JLabel(new ImageIcon(						MainScreen.class.getResource("../../img/character/cha" + voList.get(i).getCha() + ".PNG")));			}			if (i == 1) {				panlist[i].add(nicText[i]);				panlist[i].add(moneyText[i]);				panlist[i].add(card1[i]);				panlist[i].add(card2[i]);				panlist[i].add(profile[i]);				profile[i].setBounds(10, 10, 90, 100);				profile[i].setBackground(new Color(35, 60, 3, 122));				profile[i].setOpaque(true);				card1[i].setBounds(115, 10, 110, 160);				// card1.setOpaque(false);				card2[i].setBounds(230, 10, 110, 160);				// card2.setOpaque(false);				nicText[i].setBounds(10, 125, 90, 20);				nicText[i].setOpaque(true);				moneyText[i].setBounds(10, 150, 90, 20);				moneyText[i].setOpaque(true);			} else if (i == 2) {				panlist[i].add(nicText[i]);				panlist[i].add(moneyText[i]);				panlist[i].add(card1[i]);				panlist[i].add(card2[i]);				panlist[i].add(profile[i]);				profile[i].setBounds(10, 10, 90, 100);				profile[i].setBackground(new Color(35, 60, 3, 255));				profile[i].setOpaque(true);				card1[i].setBounds(115, 10, 110, 160);				// card1.setOpaque(false);				card2[i].setBounds(230, 10, 110, 160);				// card2.setOpaque(false);				nicText[i].setBounds(10, 125, 90, 20);				nicText[i].setOpaque(true);				moneyText[i].setBounds(10, 150, 90, 20);				moneyText[i].setOpaque(true);			} else if (i == 3) {				panlist[i].add(nicText[i]);				panlist[i].add(moneyText[i]);				panlist[i].add(card1[i]);				panlist[i].add(card2[i]);				panlist[i].add(profile[i]);				profile[i].setBounds(250, 10, 90, 100);				profile[i].setBackground(new Color(35, 60, 3, 122));				profile[i].setOpaque(true);				card1[i].setBounds(10, 10, 110, 160);				// card1.setOpaque(false);				card2[i].setBounds(125, 10, 110, 160);				// card2.setOpaque(false);				nicText[i].setBounds(250, 125, 90, 20);				nicText[i].setOpaque(true);				moneyText[i].setBounds(250, 150, 90, 20);				moneyText[i].setOpaque(true);			} else if (i == 4) {				panlist[i].add(nicText[i]);				panlist[i].add(moneyText[i]);				panlist[i].add(card1[i]);				panlist[i].add(card2[i]);				panlist[i].add(profile[i]);				profile[i].setBounds(250, 10, 90, 100);				profile[i].setBackground(new Color(35, 60, 3, 122));				profile[i].setOpaque(true);				card1[i].setBounds(10, 10, 110, 160);				// card1.setOpaque(false);				card2[i].setBounds(125, 10, 110, 160);				// card2.setOpaque(false);				nicText[i].setBounds(250, 125, 90, 20);				nicText[i].setOpaque(true);				moneyText[i].setBounds(250, 150, 90, 20);				moneyText[i].setOpaque(true);			} else if (i == 0) {				panlist[i].add(nicText[i]);				panlist[i].add(moneyText[i]);				panlist[i].add(card1[i]);				panlist[i].add(card2[i]);				panlist[i].add(profile[i]);				profile[i].setBounds(10, 10, 90, 100);				profile[i].setBackground(new Color(35, 60, 3, 122));				profile[i].setOpaque(true);				card1[i].setBounds(115, 10, 110, 160);				// card1.setOpaque(false);				card2[i].setBounds(230, 10, 110, 160);				// card2.setOpaque(false);				nicText[i].setBounds(10, 125, 90, 20);				nicText[i].setOpaque(true);				moneyText[i].setBounds(10, 150, 90, 20);				moneyText[i].setOpaque(true);			}//			nicText.setHorizontalAlignment(JLabel.CENTER);//			moneyText.setHorizontalAlignment(JLabel.CENTER);//			nicText.setForeground(Color.white);//			moneyText.setForeground(Color.white);//			add(panlist[i]);		}	}	public static void main(String[] args) {		ArrayList<PlayerVO> voList = new ArrayList<PlayerVO>();		voList.add(new PlayerVO("1hyo", 6, 600000));		voList.add(new PlayerVO("2hyo", 2, 34600000));		voList.add(new PlayerVO("3hyo", 3, 1345000));		voList.add(new PlayerVO("4hyo", 4, 120000));		voList.add(new PlayerVO("5hyo", 5, 4000));		MainScreen ms = new MainScreen();		ms.enterPlayer(voList);	}}