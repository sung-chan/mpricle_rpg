package rpg.miracle.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import rpg.miracle.service.memberService;
import rpg.miracle.vo.MemberVo;
import rpg.miracle.vo.NowVo;

//컨트롤러
@Controller
public class HardcoreController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="memberService")
	private memberService memberService;
	
	@RequestMapping(value="/hard.do")
	public ModelAndView mainPage() throws Exception{
		ModelAndView mv = new ModelAndView("/hardcore");
		
		NowVo nowVo = new NowVo();
		nowVo.setId("admin");
		
		return mv;
	}
}
