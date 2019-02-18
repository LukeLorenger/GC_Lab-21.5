package luke.MVCLab.mileage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageController {

	@RequestMapping("/")
		public ModelAndView home() {
		
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/mileage-form")
	public ModelAndView showAddForm() {
		return new ModelAndView("mileage-form");
	}
	
	@RequestMapping("/mileage-result")
	public ModelAndView showAddResult(@RequestParam("MPG") int MPG, @RequestParam("Gallons") int Gallons) {
		int result = MPG * Gallons;
		
		ModelAndView mav = new ModelAndView("mileage-result");
		mav.addObject("MPG", MPG);
		mav.addObject("Gallons", Gallons);
		mav.addObject("result", result);
		return mav;
	}
	
}
