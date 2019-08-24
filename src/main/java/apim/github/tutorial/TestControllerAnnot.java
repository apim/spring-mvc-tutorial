package apim.github.tutorial;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestControllerAnnot {

	@RequestMapping("/test.form_annot")
	public String handleRequestForTest(Map<String, Object> model) {
		model.put("message", "Hello World to Spring MVC with Annotation");
		return "show_message";
	}

}
