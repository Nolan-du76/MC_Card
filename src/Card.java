
public class Card {

	private String nom;
	private int att;
	private int def;
	private int pv;
	private boolean aggr;
	
	
	public Card() {
		super();
		this.nom = "Pig";
		this.att = 1;
		this.def = 0;
		this.pv = 1;
		this.setAggr(false);
	}
	
	
	public Card(String nom, int att, int def, int pv, boolean aggr) {
		super();
		this.nom = nom;
		this.att = att;
		this.def = def;
		this.pv = pv;
		this.setAggr(aggr);
	}
	
	
	
	
	
	public String getType() {
		return nom;
	}
	public void setType(String nom) {
		this.nom = nom;
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


	public boolean isAggr() {
		return aggr;
	}


	public void setAggr(boolean aggr) {
		this.aggr = aggr;
	}
	
	
	
}
