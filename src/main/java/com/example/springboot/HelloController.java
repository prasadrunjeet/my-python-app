package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/gandhi")
    @ResponseBody
    public String gandhiPage() {
        return "<!DOCTYPE html>" +
               "<html>" +
               "<head>" +
               "    <title>Mahatma Gandhi</title>" +
               "    <style>" +
               "        body { background-color:rgb(83, 72, 133); font-family: Arial, sans-serif; padding: 30px; }" +
               "        h1 { color: #2e8b57; text-decoration: underline; }" +
               "        h2 { color:rgb(43, 226, 156); text-decoration: underline dotted; }" +
               "        p { color: #333; line-height: 1.6; font-size: 18px; }" +
               "        .highlight { color: #d2691e; font-weight: bold; text-decoration: underline; }" +  // Changed here
               "        .quote { font-style: italic; color: #555; background-color: #e6f7ff; padding: 10px; border-left: 5px solid #2e8b57; }" +
               "    </style>" +
               "</head>" +
               "<body>" +
               "    <h1>Mahatma Gandhi</h1>" +
               "    <h2>Father of the Nation</h2>" +
               "    <p><span class='highlight'>Mohandas Karamchand Gandhi</span> was an Indian lawyer, anti-colonial nationalist, and political ethicist who employed nonviolent resistance to lead the successful campaign for India's independence from British rule.</p>" +
               "    <p>He inspired movements for civil rights and freedom across the world and is lovingly called <span class='highlight'>Bapu</span> and <span class='highlight'>Mahatma</span>.</p>" +
               "    <div class='quote'>“Be the change that you wish to see in the world.”</div>" +
               "</body>" +
               "</html>";
    }
}
