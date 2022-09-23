package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/* Chapter 10.6 Studio: Skills Tracker - Java with Spring Boot */

@Controller
public class SkillsController {

    @RequestMapping(value="")  // Also works with ("") OR nothing at all ()
    @ResponseBody
    public String skillsTracker() {
        String html =
                "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" +
                        "</ol>";
        return html;  // Since return type is String, you can omit String html and put "body code" after return keyword.
    }

    @GetMapping("form")  // Also works with (value="form")
    @ResponseBody
    public String optionForm() {

        /* This is the working version my studio group did in class. */
//        return "<form method='post'>" +
//                "<label for='name'>Name:</label><br>" +
//                "<input type='text' name='name' id='name'/><br>" +
//                "<label for='firstLang'>My favorite language:</label><br>" +
//                "<select id='firstLang' name='firstLang'>" +
//                    "<option value='Java'>Java</option>" +
//                    "<option value='JavaScript'>JavaScript</option>" +
//                    "<option value='Python'>Python</option>" +
//                "</select><br>" +
//                "<label for='secondLang'>My second favorite language:</label><br>" +
//                "<select id='secondLang' name='secondLang'>" +
//                    "<option value='Java'>Java</option>" +
//                    "<option value='JavaScript'>JavaScript</option>" +
//                    "<option value='Python'>Python</option>" +
//                "</select><br>" +
//                "<label for='thirdLang'>My third favorite language:</label><br>" +
//                "<select id='thirdLang' name='thirdLang'>" +
//                    "<option value='Java'>Java</option>" +
//                    "<option value='JavaScript'>JavaScript</option>" +
//                    "<option value='Python'>Python</option>" +
//                "</select><br>" +
//                "<input type='submit' value='Submit'/><br>" +
//                "</form>";

        /* Similar/DRY-er working version from instructor Studio Review w/o <label></label> tags for form text. */
        return "<form method='post'>" +
                "Name: <br>" +
                "<input type='text' name='name' id='name'/><br>" +
                "My favorite language: <br>" +
                "<select id='firstLang' name='firstLang'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select><br>" +
                "My second favorite language: <br>" +
                "<select id='secondLang' name='secondLang'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select><br>" +
                "My third favorite language: <br>" +
                "<select id='thirdLang' name='thirdLang'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'/><br>" +
                "</form>";
    }


    @PostMapping(value="form")  // Also works with just ("form")
    @ResponseBody
    public String namePage(@RequestParam String name, @RequestParam String firstLang, @RequestParam String secondLang, @RequestParam String thirdLang) {
        /* Could also use a String varName = "body code" and then return varName like in skillsTracker() above. */
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                    "<li>" + firstLang + "</li>" +
                    "<li>" + secondLang + "</li>" +
                    "<li>" + thirdLang + "</li>" +
                "</ol>";
    }


}
