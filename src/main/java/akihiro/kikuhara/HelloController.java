package akihiro.kikuhara;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("msg", "ようこそ。");
		return "index";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String send(Model model) {

		TestData color1 = new TestData();
		TestData color2 = new TestData();
		TestData color3 = new TestData();

		color1.setColorName("あか");
		color1.setColorKanji("赤");
		color2.setColorName("みどり");
		color2.setColorKanji("緑");
		color3.setColorName("あお");
		color3.setColorKanji("青");

		ArrayList<TestData> dataAry = new ArrayList<TestData>();
		dataAry.add(color1);
		dataAry.add(color2);
		dataAry.add(color3);

		model.addAttribute("msg", "三原色");
		model.addAttribute("colors", dataAry);

		return "index";
	}

	@RequestMapping(value = "/page1")
	public String page1(Model model) {
		model.addAttribute("name", "てすと");
		return "page1";
	}
	
	@RequestMapping(value="/page2",method=RequestMethod.GET)
	public String page2(Model model){
		return "page2";
	}
	
	@RequestMapping(value="/page2",method=RequestMethod.POST)
	public String page2(@ModelAttribute Page2Form form,Model model){
		model.addAttribute("form", form);	
		return "page2";
	}

}
