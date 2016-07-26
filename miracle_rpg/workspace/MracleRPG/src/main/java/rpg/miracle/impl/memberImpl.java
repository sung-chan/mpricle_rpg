package rpg.miracle.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import rpg.miracle.dao.memberDao;
import rpg.miracle.service.memberService;
import rpg.miracle.vo.MemberVo;

//impl
@Service("memberService")
public class memberImpl implements memberService {
	
		@Resource(name="memberDao")
		private memberDao memberDao;

		@Override
		public List<MemberVo> select(MemberVo memberVo) throws Exception {
			return memberDao.select(memberVo);
		}
}
