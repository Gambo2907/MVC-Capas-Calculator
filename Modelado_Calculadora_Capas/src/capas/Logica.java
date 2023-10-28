package capas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Logica {
	public double num1, resultado, num2;
	public String oper = "nula", cadena = "0";
	public boolean activado = true;
	public boolean punto;
	public boolean primo;
	public boolean binario;
	public boolean memorias;
	public boolean resultados;
	public boolean constantes;
	public int numero;
	String lineas;
	public String operacion;
	public String resultadoBitacora;
	FileWriter archivo;
	PrintWriter linea;
	public List<String> bitacora = new ArrayList<>();
	public LinkedList<Double> memoria = new LinkedList<>();
	public String contenidoComoString;
	
	
	public double operaciones(double num1, double num2, String oper) {
		switch (oper) {
        case "+":
            return num1 + num2;
           
        case "-":
        	
            return num1 - num2;
            
        case "*":
        	
            return num1 * num2;
      
        case "/":
            if (num2 != 0) {
            	
                return num1 / num2;
            }
            return Double.NaN; // Handle division by zero
        default:
        	return Double.NaN;
		}
	}
	public boolean esPrimo(int numero) {
		if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
		
	}

	public String decimalABinario(int numero) {
		if (numero == 0) {
            return "0";
        }
        StringBuilder binario = new StringBuilder();
        while (numero > 0) {
            int residuo = numero % 2;
            binario.insert(0, residuo);
            numero = numero / 2;
        }
        return binario.toString();
	}

	public static void escribirBitacora(List<String>bitacora){
		String archivoRegistro = "C:\\Users\\User\\Documents\\GitHub\\MVC-Capas-Calculator\\Modelado_Calculadora_Capas\\src\\capas\\Bitacora.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivoRegistro));
            for (String resultadoBitacora : bitacora) {
                writer.write(resultadoBitacora);
                writer.newLine(); // Agrega una nueva línea
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	public void agregarNumero(double numero) {
        if (memoria.size() >= 10) {
            memoria.removeFirst(); // Elimina el número más antiguo si la memoria está llena
        }
        memoria.add(numero);
    }
	
	public double calcularPromedio() {
        if (memoria.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (double numero_promedio : memoria) {
            sum += numero_promedio;
        }

        return (double) sum / memoria.size();
    }
	
	
	

}
