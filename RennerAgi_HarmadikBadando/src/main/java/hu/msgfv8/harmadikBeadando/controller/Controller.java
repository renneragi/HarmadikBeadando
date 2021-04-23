package hu.msgfv8.harmadikBeadando.controller;

import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/harmadik")

public class Controller {

    @GetMapping("")
    public ResponseDTO getUser(@RequestParam(defaultValue = "Felhasznalo") String name){

        String getResponse = String.format("Hello %s", name);

        return ResponseDTO.builder().content(getResponse).build();
    }

    @PostMapping("")
    public ResponseDTO reverseText(@RequestParam(defaultValue = "Alma a fa alatt") String text){

        StringBuilder reverseText = new StringBuilder();
        reverseText.append(text);
        reverseText.reverse();

        return ResponseDTO.builder().content(reverseText.toString()).build();
    }


}
