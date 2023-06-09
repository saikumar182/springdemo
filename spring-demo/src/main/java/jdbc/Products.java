package jdbc;

public class Products {
	 
	private int p_id;
	
	private String p_name;
	
	private double p_price;

	public Products() {
		super();
		
	}

	public Products(int p_id, String p_name, double p_price) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_price = p_price;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public double getP_price() {
		return p_price;
	}

	public void setP_price(double p_price) {
		this.p_price = p_price;
	}

	
	
}
