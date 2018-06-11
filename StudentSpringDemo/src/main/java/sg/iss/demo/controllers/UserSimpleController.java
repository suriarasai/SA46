package sg.iss.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserSimpleController {

	@RequestMapping(method = RequestMethod.GET)
    public String getIndexPage() {
        return "UserManagement";
    }


}
