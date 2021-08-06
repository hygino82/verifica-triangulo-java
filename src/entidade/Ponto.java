package entidade;

public class Ponto {
	private Double x;
	private Double y;

	public Ponto() {

	}

	public Ponto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ")";
	}
}
