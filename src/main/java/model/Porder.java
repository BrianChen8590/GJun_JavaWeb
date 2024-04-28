package model;

/**
 * 訂單表單
 */
public class Porder {

	private Integer id;
	private String memberno;
	private String porderno;
	private Integer a;
	private Integer b;
	private Integer c;

	public Porder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Porder(String memberno, String porderno, Integer a, Integer b, Integer c) {
		super();
		this.memberno = memberno;
		this.porderno = porderno;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMemberno() {
		return memberno;
	}

	public void setMemberno(String memberno) {
		this.memberno = memberno;
	}

	public String getPorderno() {
		return porderno;
	}

	public void setPorderno(String porderno) {
		this.porderno = porderno;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	public Integer getC() {
		return c;
	}

	public void setC(Integer c) {
		this.c = c;
	}

}
