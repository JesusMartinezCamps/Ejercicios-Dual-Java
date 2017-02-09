package game;

public class ScoreCard {

	private String scoreCard = "";
	private int totalScore = 0;
	public static String symbols = "-123456789X/";
	private int ball = 0;
	private boolean firstRoll = true;
	private int firstRollPins = 0;
	private boolean spare = false;
	
	/*Constructores*/
	public ScoreCard(){
		this.scoreCard= "";
	}
	public ScoreCard(String scoreCard){
		this.scoreCard = scoreCard;
	}
	
	/*Getter Setters*/
	private void setTotalScore(int total){
		this.totalScore = total;
	}
	public int getTotalScore(){
		return this.totalScore;
	}
	public String getScoreCard(){
		return this.scoreCard;
	}
	private void nextBall(){
		this.ball ++;
	}
	private void setFirstRollPins(int pins){/*Recibe la cantidad de pins tirados y se los suma*/
		this.firstRollPins = pins;
	}
	private int getFirstRollPins(){
		return this.firstRollPins;
	}
	private void setFirstRoll(boolean value){
		this.firstRoll = value;
	}
	private void setSpare(boolean value){
		this.spare = value;
	}
	/*Comprobar "is"*/
	private boolean isFirstRoll(){
		return this.firstRoll;
	}
	private boolean isSpare(){
		return this.spare;
	}
	
	/*Convertir a int el valor*/
	private int scorePin(char pin){
		int newScore = 0;
		newScore = Character.getNumericValue(pin);
		return newScore;
	}
	/*Interfaz publica*/
	public static int getSymbolValue(char symbol){
		return symbols.indexOf(symbol);
	}
	
	public void roll(char pins){
		nextBall();/*Suma una posicion para ir avanzando*/
		if(isFirstRoll()){/*Comprueba si firstRoll es true*/
			setFirstRollPins(getSymbolValue(pins));
			setFirstRoll(false);/*Cambia el estado de firstRoll*/
			if(isSpare()){
				setTotalScore(getTotalScore() + getSymbolValue(pins));/*Llama a quien guarda la puntuación, que guarde la suma actual más el valor de la tirada actual*/
			}
		}
		else if(pins == '/'){/*Si el valor actual es /:*/
			setTotalScore(getTotalScore() + 10);
			setSpare(true);
			setFirstRoll(true);		
		}
		else {
			setTotalScore(getTotalScore() + getFirstRollPins() + getSymbolValue(pins));
			setFirstRoll(true);
			setSpare(false);
		}
	}
	public void calculateScore(){
		for(int i=0; i < getScoreCard().length(); i++){
			char pin = getScoreCard().charAt(i);
			roll(pin);
		}		
	}
}
