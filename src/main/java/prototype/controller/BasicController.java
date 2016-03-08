package prototype.controller;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import prototype.common.Constants;

@Controller
public class BasicController{

    private static Logger log = LogManager.getLogger(Constants.LOGGER_CONTROLLER);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Map<String, Object> model) {
	    log.debug("Hello World");
		model.put("title", "Hello World");
		return Constants.PATH_INDEX;
	}
}
