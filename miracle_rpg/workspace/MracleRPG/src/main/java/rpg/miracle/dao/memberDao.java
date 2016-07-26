package rpg.miracle.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import rpg.common.dao.AbstractDAO;
import rpg.miracle.vo.MemberVo;

//dao
@Repository("memberDao")
public class memberDao extends AbstractDAO {
	
	@SuppressWarnings("unchecked")
	public List<MemberVo> select(MemberVo memberVo){
		return (List<MemberVo>) selectList("member.select", memberVo);
	}
	
}
