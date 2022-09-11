//Josafat Muñoz Valverde 4°B

package server;

import java.io.IOException;
import java.util.Arrays;

public class Methods {

    public double addition(double num1, double num2) {
        return num1+num2;
    }

    public String imc(String name, double weight, double height){

        double imc = weight / (height * height);
        return "Hola "+name+" tu IMC es "+imc;
    }

    public String operations(double num1, double num2, double num3, double num4) {

        double product = num1*num2*num3*num4;
        double avg = (num1+num2+num3+num4) / 4;
        double addition = num1+num2+num3+num4;

        return "Hola, el producto es: "+product+" , la sumas es: "+addition+" y el promedio es: "+avg;
    }

    public String sumLimits(int lowerLimit, int upperLimit) {

        int sum = 0;
        if (lowerLimit > upperLimit) {
            return "Error, el límite inferior es mayor al límite superior.";
        }

        for (int i=lowerLimit; i<=upperLimit; i++) sum+=i;

        return "La suma de los numeros entre "+lowerLimit+" y "+upperLimit+ " es: "+sum;
    }

    public String orderNumbers(Object[] numbers) throws IOException, ClassNotFoundException {

        Arrays.sort(numbers);

        String message = "Los numeros ordenados son los siguientes: \n";
        for (Object number : numbers) {
            message+=" "+number;
        }

        return message;

    }

}
