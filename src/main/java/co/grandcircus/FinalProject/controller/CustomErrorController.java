package co.grandcircus.FinalProject.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

	private static final String PATH = "/error";

	@RequestMapping(value = PATH)
	public String error(Model model, HttpServletRequest httpRequest) {
		String errorMsg = "";
		int httpErrorCode = getErrorCode(httpRequest);
		
		switch (httpErrorCode) {
		case 400: {
			errorMsg = "Http Error Code: 400. Bad Request";
			break;
		}
		case 401: {
			errorMsg = "Hmm... We're very sorry, but Pantry Pal can't conduct any more searches today. We know this is inconvenient, but try coming back tomorrow or making a custom item.";
			break;
		}
		case 404: {
			errorMsg = "Http Error Code: 404. Resource not found";
			break;
		}
		case 500: {
			errorMsg = "Sorry, it looks like we don't have that item in our database.";
			break;
		}
		
		default: {
			errorMsg = "There was an error in showing the page.";
		}

		}
		model.addAttribute("errorMessage", errorMsg);
		return "error";
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}

	private int getErrorCode(HttpServletRequest httpRequest) {
		return (Integer) httpRequest.getAttribute("javax.servlet.error.status_code");

	}
}
