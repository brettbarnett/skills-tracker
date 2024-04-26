package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    /*At localhost:8080, add text that states the three possible programming languages someone could be working on.
    You need to have an h1 with the title “Skills Tracker”, an h2, and an ol containing three programming languages of your choosing. */

    @GetMapping("/")
    @ResponseBody
    public String rootPage() {
        String html = "<html><head><title>Welcome To The SkillsTracker</title></head>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Possible programming languages</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String formPage() {
        String html = "<html>\n" +
                "\n" +
                "<head></head>\n" +
                "\n" +
                "<body>\n" +
                "    <form method=\"post\">\n" +
                "        <label>Name:<input type=\"text\" name=\"name\"></label>\n" +
                "        <br />\n" +
                "        <label>My Favorite Language:\n" +
                "            <select name=\"firstChoice\">\n" +
                "                <option>Java</option>\n" +
                "                <option>JavaScript</option>\n" +
                "                <option>Python</option>\n" +
                "            </select>\n" +
                "        </label>\n" +
                "        <br />\n" +
                "        <label>My Second Favorite Language:\n" +
                "            <select name=\"secondChoice\">\n" +
                "            <option>Java</option>\n" +
                "            <option>JavaScript</option>\n" +
                "            <option>Python</option>\n" +
                "        </select>\n" +
                "    </label>\n" +
                "    <br />\n" +
                "    <label>My Third Favorite Language:\n" +
                "        <select name=\"thirdChoice\">\n" +
                "        <option>Java</option>\n" +
                "        <option>JavaScript</option>\n" +
                "        <option>Python</option>\n" +
                "    </select>\n" +
                "</label>\n" +
                "<button type=\"submit\">Submit</button>\n" +
                "    </form>\n" +
                "</body>\n" +
                "\n" +
                "</html>";

        return html;
    }

    @RequestMapping(value="form", method=RequestMethod.POST)
    @ResponseBody
    public String formPost(@RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        String html = "This is what you picked: " +
                firstChoice + "<br />" +
                secondChoice + "<br />" +
                thirdChoice;

        return html;
    }


}
