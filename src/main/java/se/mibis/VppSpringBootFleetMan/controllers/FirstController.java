package se.mibis.VppSpringBootFleetMan.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

        @GetMapping("/home.html")
        public ModelAndView firstPage() {

                Date dateAndTime = new Date();

                // TODO: Add a proper view resolver
                return new ModelAndView("welcome", "dateAndTime", dateAndTime);

        }
}
