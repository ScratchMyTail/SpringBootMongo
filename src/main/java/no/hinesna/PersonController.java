package no.hinesna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by christerhansen on 06.10.15.
 */
@Controller
@RequestMapping(value = "/")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/")
    public String hello(Model modelMap){
        modelMap.addAttribute("person", new Person());
        return "hello";
    }

    @RequestMapping(value="/", method = RequestMethod.POST)
    public String savePerson(@ModelAttribute Person person, Model model){
        personRepository.save(person);
        model.addAttribute("personer", personRepository.findAll());
        return "result";
    }
}
