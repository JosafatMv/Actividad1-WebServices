//Josafat Muñoz Valverde 4°B

package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {
    public static void main(String[] args) throws IOException, XmlRpcException {

        Scanner teclado = new Scanner(System.in);

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        config.isEnabledForExtensions();
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        //Object[] numbers = {5.0, 5D};
        //Double response = (Double) client.execute("Methods.addition", numbers);
        //System.out.println("Result -> " + response);


        //------------------ 1---------------------
//        System.out.println("Escriba su nombre:");
//        String name = teclado.nextLine();
//
//        System.out.println("Escriba su peso en kg:");
//        double weight = teclado.nextDouble();
//
//        System.out.println("Escriba su altura en metros:");
//        double height = teclado.nextDouble();
//
//        Object[] userInfo = {name, weight, height};
//        String response = (String) client.execute("Methods.imc", userInfo);
//        System.out.println(response);

        //------------------ 2---------------------
//        System.out.println("Ingrese el primer número:");
//        double num1 = teclado.nextDouble();
//
//        System.out.println("Ingrese el segundo número:");
//        double num2 = teclado.nextDouble();
//
//        System.out.println("Ingrese el tercer número:");
//        double num3 = teclado.nextDouble();
//
//        System.out.println("Ingrese el cuarto número:");
//        double num4 = teclado.nextDouble();
//
//        Object[] numbers = {num1, num2, num3, num4};
//        String response = (String) client.execute("Methods.operations", numbers);
//        System.out.println(response);

        //------------------ 3 ---------------------
//        System.out.println("Ingrese el límite inferior:");
//        int lowerLimit = teclado.nextInt();
//
//        System.out.println("Ingrese el límite superior:");
//        int upperLimit = teclado.nextInt();
//
//        Object[] numbers = {lowerLimit, upperLimit};
//        String response = (String) client.execute("Methods.sumLimits", numbers);
//        System.out.println(response);

        //------------------ 4 ---------------------}
        Integer[] numbers = new Integer[5];

        System.out.println("Ingrese el primer número");
        numbers[0] = teclado.nextInt();

        System.out.println("Ingrese el segundo número");
        numbers[1] = teclado.nextInt();

        System.out.println("Ingrese el tercer número");
        numbers[2] = teclado.nextInt();

        System.out.println("Ingrese el cuarto número");
        numbers[3] = teclado.nextInt();

        System.out.println("Ingrese el quinto número");
        numbers[4] = teclado.nextInt();

        Object[] numbersObj = {numbers};
        String response = (String) client.execute("Methods.orderNumbers", numbersObj);
        System.out.println(response);

    }
}
