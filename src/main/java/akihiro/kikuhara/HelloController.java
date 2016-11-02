package akihiro.kikuhara;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String index(Model model){
		model.addAttribute("msg","testMessage");
		return "index";
	}
	
	//@ModelAttribute で入力された内容をFormクラスにセットできる
	@RequestMapping(value="/",method=RequestMethod.POST)
	public String send(@ModelAttribute TestForm form,Model model){
		model.addAttribute("form",form);
		return "index";
	}
}
