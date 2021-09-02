package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class morseController {
    public String[] valores = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "", "", "?"};

    public String[] letras = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---",
            "...--", "....-", ".....", "-....", "--...", "---..", "----.", ".-.-.-", "--..--", "..--.."};

    //Exemplo de chamada -> http://localhost:8080/convLetra/A
    @GetMapping("convLetra/{codigo}")
    public String morse(@PathVariable String codigo) {
        String morse = "";
        for (int j = 0; j < codigo.length(); j++) {
            for (int i = 0; i < valores.length; i++) {
                if ((String.valueOf(codigo.charAt(j))).equals(String.valueOf(valores[i]))) {
                    morse += " " + letras[i];
                }
            }
        }
        return morse;
    }
}
