
public class Card {

	private String type;
	private int att;
	private int def;
	private int pv;
	
	
	public Card() {
		super();
		this.type = "Pig";
		this.att = 1;
		this.def = 0;
		this.pv = 1;
	}
	
	
	public Card(String type, int att, int def, int pv) {
		super();
		this.type = type;
		this.att = att;
		this.def = def;
		this.pv = pv;
	}
	
	
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAtt() {
		return att;
	}
	public void setAtt(int att) {
		this.att = att;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getPv() {
		return pv;
	}
	public void setPv(int pv) {
		this.pv = pv;
	}
	
	
	
}
