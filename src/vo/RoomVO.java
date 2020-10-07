package vo;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

public class RoomVO {
	private static int increaseRoomNo = 1;
	private int roomNo;		// 방 번호
	private long startMoney; // 시작 금액
	private String roomTitle = "";
	private String roomPw = "";
	private Map<Integer, PlayerVO> playerMap = new ConcurrentHashMap<Integer, PlayerVO>(); // 방안에 있는 사람 리스트
	private float[] cardArr = new float[20]; // 카드각
	private Queue<Float> shuffledCard = new LinkedList<>(); // 위에서 부터 카드 한장씩 배분하기위한 queue
	private Integer masterIndex; // 방장 or 선판 이긴거
	private String master; 		 // 방장(선)이 누구인지
	private long totalMoney; 	 // 총 배팅액의 합
	private long beforeBetMoney;	 	 // 전 플레이어의 배팅액
	private int round; 			 // 몇번째 카드 배팅인지
	private int lastBetIdx;	 	 // 마지막으로 배팅한 플레이어가 몇번째 사람인지
	private int turn; 			 // 누구의 차례인지
	private boolean round1First = false;	// 첫 차례 버튼세팅 조건 변수
	private boolean round2First = false;	// 첫 차례 버튼세팅 조건 변수
	private boolean gameStarted = false;
	private boolean allIn = false;
	
	
	
	public static int getIncreaseRoomNo() {
		return increaseRoomNo;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public long getStartMoney() {
		return startMoney;
	}
	public String getRoomTitle() {
		return roomTitle;
	}
	public String getRoomPw() {
		return roomPw;
	}
	public Map<Integer, PlayerVO> getPlayerMap() {
		return playerMap;
	}
	public float[] getCardArr() {
		return cardArr;
	}
	public Queue<Float> getShuffledCard() {
		return shuffledCard;
	}
	public Integer getMasterIndex() {
		return masterIndex;
	}
	public String getMaster() {
		return master;
	}
	public long getTotalMoney() {
		return totalMoney;
	}
	public long getBeforeBetMoney() {
		return beforeBetMoney;
	}
	public int getRound() {
		return round;
	}
	public int getLastBetIdx() {
		return lastBetIdx;
	}
	public int getTurn() {
		return turn;
	}
	public boolean isRound1First() {
		return round1First;
	}
	public boolean isRound2First() {
		return round2First;
	}
	public boolean isGameStarted() {
		return gameStarted;
	}
	public boolean isAllIn() {
		return allIn;
	}
	public static void setIncreaseRoomNo(int increaseRoomNo) {
		RoomVO.increaseRoomNo = increaseRoomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public void setStartMoney(long startMoney) {
		this.startMoney = startMoney;
	}
	public void setRoomTitle(String roomTitle) {
		this.roomTitle = roomTitle;
	}
	public void setRoomPw(String roomPw) {
		this.roomPw = roomPw;
	}
	public void setPlayerMap(Map<Integer, PlayerVO> playerMap) {
		this.playerMap = playerMap;
	}
	public void setCardArr(float[] cardArr) {
		this.cardArr = cardArr;
	}
	public void setShuffledCard(Queue<Float> shuffledCard) {
		this.shuffledCard = shuffledCard;
	}
	public void setMasterIndex(Integer masterIndex) {
		this.masterIndex = masterIndex;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	public void setTotalMoney(long totalMoney) {
		this.totalMoney = totalMoney;
	}
	public void setBeforeBetMoney(long beforeBetMoney) {
		this.beforeBetMoney = beforeBetMoney;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public void setLastBetIdx(int lastBetIdx) {
		this.lastBetIdx = lastBetIdx;
	}
	public void setTurn(int turn) {
		this.turn = turn;
	}
	public void setRound1First(boolean round1First) {
		this.round1First = round1First;
	}
	public void setRound2First(boolean round2First) {
		this.round2First = round2First;
	}
	public void setGameStarted(boolean gameStarted) {
		this.gameStarted = gameStarted;
	}
	public void setAllIn(boolean allIn) {
		this.allIn = allIn;
	}
	
	
	
	
	
}
