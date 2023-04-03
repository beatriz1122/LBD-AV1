package model;

public class Jogo {
	private int codJogo;
	private String timeA;
	private String timeB;
	private int golsTimeA;
	private int golsTimeB;
	private String dataJogo;
	public int getCodJogo() {
		return codJogo;
	}
	public void setCodJogo(int codJogo) {
		this.codJogo = codJogo;
	}
	public String getTimeA() {
		return timeA;
	}
	public void setTimeA(String timeA) {
		this.timeA = timeA;
	}
	public String getTimeB() {
		return timeB;
	}
	public void setTimeB(String timeB) {
		this.timeB = timeB;
	}
	public int getGolsTimeA() {
		return golsTimeA;
	}
	public void setGolsTimeA(int golsTimeA) {
		this.golsTimeA = golsTimeA;
	}
	public int getGolsTimeB() {
		return golsTimeB;
	}
	public void setGolsTimeB(int golsTimeB) {
		this.golsTimeB = golsTimeB;
	}
	public String getDataJogo() {
		return dataJogo;
	}
	public void setDataJogo(String dataJogo) {
		this.dataJogo = dataJogo;
	}
	@Override
	public String toString() {
		return "Jogo [codJogo=" + codJogo + ", timeA=" + timeA + ", timeB=" + timeB + ", golsTimeA=" + golsTimeA
				+ ", golsTimeB=" + golsTimeB + ", dataJogo=" + dataJogo + "]";
	}
}
