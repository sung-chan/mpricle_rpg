package rpg.miracle.service;

import java.util.List;

import rpg.miracle.vo.MemberVo;

//service
public interface memberService {
	List<MemberVo> select(MemberVo memberVo) throws Exception;
}
