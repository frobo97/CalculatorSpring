package com.calculator.Calculator.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebStuff {

    @GetMapping("/calculator")
    public Object squareNumber() {
        return """
                 <script>
                window.addEventListener('DOMContentLoaded', (event) => {
                  let button = document.querySelectorAll('button')
                  let inputBox = document.querySelector('#inputski')
                                
                  for(let i = 0; i < button.length; i++) {
                    button[i].addEventListener('click', function() {
                      inputBox.value += this.innerText
                                
                      return false;
                    })
                  }
                });
                </script>
                                
                <form action="inputski" method="GET">
                  <button onclick="return false">1</button>
                  <button onclick="return false">2</button>
                  <br>
                  <button onclick="return false">3</button>
                  <button onclick="return false">+</button>
                  <button onclick="return false">-</button>
                  <input type="text" id="inputski" name="nr" />
                  <input type="submit" value="calculate" />
                </form>
                """;
    }//                   <br> == radbrytning


}
