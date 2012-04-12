package cc.ensor.study.web;

import cc.ensor.study.service.DateService;
import cc.ensor.study.web.model.HomeModel;
import com.google.common.annotations.VisibleForTesting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @Autowired
    @VisibleForTesting
    DateService dateService;

    @ModelAttribute("model")
    private HomeModel defaultvalue() {
        HomeModel homeModel = new HomeModel();
        homeModel.setName("Hey There");
        return homeModel;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHome(@ModelAttribute("model") HomeModel model) {
        System.out.println(dateService.getNow());
        return "home";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String saveHome(@Valid @ModelAttribute("model") HomeModel model, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
        }
        return "redirect:/home/";
    }

    @RequestMapping(value = "/abc/{reqName}", method = RequestMethod.GET)
    public String showHomeWithParamInUrl(@ModelAttribute("model") HomeModel model, @PathVariable("reqName") String reqName) {
        model.setName(reqName);
        return "home";
    }

    @RequestMapping(value = "/def", method = RequestMethod.GET)
    public
    @ResponseBody
    String showHomel(HttpServletRequest request) {
        return "<h1>This is going to the body</h1>";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public
    @ResponseBody
    String test(@RequestBody HomeModel model) {
        return model.getName();
    }


}
