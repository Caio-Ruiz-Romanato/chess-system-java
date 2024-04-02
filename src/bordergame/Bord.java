package bordergame;

public class Bord {

	private int rows;
	private int coluns;
	private Piece[][] pieces;

	public Bord(int rows, int coluns) {
		this.rows = rows;
		this.coluns = coluns;
		pieces = new Piece[rows][coluns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColuns() {
		return coluns;
	}

	public void setColuns(int coluns) {
		this.coluns = coluns;
	}
	
	

}
