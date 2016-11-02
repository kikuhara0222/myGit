package akihiro.kikuhara;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("msg", "testMessage");
		return "index";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String send(@RequestParam(value="check1",required=false)boolean check1,
			@RequestParam(value="check2",required=false)boolean check2,
			@RequestParam(value="select1",required=false)String radio1,Model model) {
		
		String retMsg = "";
		
		try{
			retMsg = "check1:" + check1 + " check2:"+check2 +
					" radio:" + radio1;
		}catch (NullPointerException e){
			retMsg = "入力無";
		}
		
		model.addAttribute("msg",retMsg);
		
		return "index";
	}
}
