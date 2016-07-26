package rpg.miracle.vo;

//vo
public class MonsterVo extends StatusVo {
	public String monster;
	public int m_hp;
	public int m_df;
	public int m_ad;
	public int m_as;
	public int m_gold;
	
	public String getMonster() {
		return monster;
	}
	public void setMonster(String monster) {
		this.monster = monster;
	}
	public int getM_hp() {
		return m_hp;
	}
	public void setM_hp(int m_hp) {
		this.m_hp = m_hp;
	}
	public int getM_df() {
		return m_df;
	}
	public void setM_df(int m_df) {
		this.m_df = m_df;
	}
	public int getM_ad() {
		return m_ad;
	}
	public void setM_ad(int m_ad) {
		this.m_ad = m_ad;
	}
	public int getM_as() {
		return m_as;
	}
	public void setM_as(int m_as) {
		this.m_as = m_as;
	}
	public int getM_gold() {
		return m_gold;
	}
	public void setM_gold(int m_gold) {
		this.m_gold = m_gold;
	}
	
}
