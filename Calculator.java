package Devoir2_300174393;

import java.lang.Math;

public class Calculator {
    
    public double first = 0;
    public double second = 0;
    public double result = 0;
    public String oP; 

    public Calculator(){

    }

    // check l'opreation et ensuite exécute la méthode aproprier
    public void operation(String str){
        switch(str){
            case "+":
            add();
            break;
            case "-":
            subtract();
            break;
            case "*":
            multiply();
            break;
            case "/":
            divide();
            break;
            case "!":
            factorial();
            break;
            case "POW":
            pow();
            break;
            case "sqrt":
            rootSquare();
            break;
            case "ln":
            nepLog();
            break;
        }
    }

    public void add(){
        result = first + second;
    }

    public void subtract(){
        result = first - second;
    }

    public void multiply(){
        result = first*second;
    }

    public void divide(){
        result = first/second;
    }

    public void factorial(){
        result = 1; 
        for(int i=1;i<=first;i++){    
            result=result*i;    
        }  
    }
    public void pow(){
        result = Math.pow(first,second);
    }
    public void rootSquare(){
        result = Math.sqrt(second);
    }
    public void nepLog(){
        result = Math.log(second);
    }
}
