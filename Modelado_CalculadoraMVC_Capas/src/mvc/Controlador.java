package mvc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;


public class Controlador implements ActionListener, KeyListener {
	
	private Vista vista;
	private Modelo modelo;

	public Controlador(Vista vista, Modelo modelo)  {
		this.vista = vista;
		this.modelo = modelo;
		this.vista.txtPantalla.addKeyListener(this);
		this.vista.txtPantalla.addActionListener(this);
		this.vista.btn1.addActionListener(this);
		this.vista.btn2.addActionListener(this);
		this.vista.btn3.addActionListener(this);
		this.vista.btn4.addActionListener(this);
		this.vista.btn5.addActionListener(this);
		this.vista.btn6.addActionListener(this);
		this.vista.btn7.addActionListener(this);
		this.vista.btn8.addActionListener(this);
		this.vista.btn9.addActionListener(this);
		this.vista.btnCero.addActionListener(this);
		this.vista.btnIgual.addActionListener(this);
		this.vista.btnSuma.addActionListener(this);
		this.vista.btnResta.addActionListener(this);
		this.vista.btnDivision.addActionListener(this);
		this.vista.btnMulti.addActionListener(this);
		this.vista.btnAvg.addActionListener(this);
		this.vista.btnMemoria.addActionListener(this);
		this.vista.btnBinario.addActionListener(this);
		this.vista.btnC.addActionListener(this);
		this.vista.btnPunto.addActionListener(this);
		this.vista.btnData.addActionListener(this);
		this.vista.btnPrimo.addActionListener(this);
	}
	public void Inicio() {
		vista.setResizable(false);
		vista.setTitle("Calculadora");
		vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vista.setBounds(100, 100, 300, 408);
		vista.txtPantalla.setText("0");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() ==vista.btn1) {
			vista.txtPantalla.setText("");
      	   modelo.cadena += 1;
           vista.txtPantalla.setText(modelo.cadena);
           modelo.activado = true;
           modelo.binario = false;
   		   modelo.primo = false;
   		   modelo.memorias = false;
           vista.txtPantalla.requestFocus();
    	
	     	if (modelo.resultados == true && !vista.txtPantalla.getText().isEmpty()) {
	     		modelo.cadena = "";
	     		vista.txtPantalla.setText("");
	           	 modelo.cadena += 1;
	                vista.txtPantalla.setText(modelo.cadena);
	                modelo.activado = true;
	                modelo.binario = false;
	        		 	modelo.primo = false;
	        		 	modelo.resultados = false;
	        		 	modelo.memorias = false;
	                vista.txtPantalla.requestFocus();
	     	}
			
        }
        if (e.getSource() == vista.btn2) {
        	vista.txtPantalla.setText("");
      	   modelo.cadena += 2;
           vista.txtPantalla.setText(modelo.cadena);
           modelo.activado = true;
           modelo.binario = false;
   		   modelo.primo = false;
   		   modelo.memorias = false;
           vista.txtPantalla.requestFocus();
    	
	     	if (modelo.resultados == true && !vista.txtPantalla.getText().isEmpty()) {
	     		modelo.cadena = "";
	     		vista.txtPantalla.setText("");
	           	 modelo.cadena += 2;
	                vista.txtPantalla.setText(modelo.cadena);
	                modelo.activado = true;
	                modelo.binario = false;
	        		 	modelo.primo = false;
	        		 	modelo.resultados = false;
	        		 	modelo.memorias = false;
	                vista.txtPantalla.requestFocus();
	     	}
       
        }
        if (e.getSource() == vista.btn3) {
        	vista.txtPantalla.setText("");
      	   modelo.cadena += 3;
           vista.txtPantalla.setText(modelo.cadena);
           modelo.activado = true;
           modelo.binario = false;
   		   modelo.primo = false;
   		modelo.memorias = false;
           vista.txtPantalla.requestFocus();
    	
	     	if (modelo.resultados == true && !vista.txtPantalla.getText().isEmpty()) {
	     		modelo.cadena = "";
	     		vista.txtPantalla.setText("");
	           	 modelo.cadena += 3;
	                vista.txtPantalla.setText(modelo.cadena);
	                modelo.activado = true;
	                modelo.binario = false;
	        		 	modelo.primo = false;
	        		 	modelo.resultados = false;
	        		 	modelo.memorias = false;
	                vista.txtPantalla.requestFocus();
	     	}
        }
        if (e.getSource() == vista.btn4) {
        	vista.txtPantalla.setText("");
      	   modelo.cadena += 4;
           vista.txtPantalla.setText(modelo.cadena);
           modelo.activado = true;
           modelo.binario = false;
   		   modelo.primo = false;
   		    modelo.memorias = false;
           vista.txtPantalla.requestFocus();
    	
	     	if (modelo.resultados == true && !vista.txtPantalla.getText().isEmpty()) {
	     		modelo.cadena = "";
	     		vista.txtPantalla.setText("");
	           	 modelo.cadena += 4;
	                vista.txtPantalla.setText(modelo.cadena);
	                modelo.activado = true;
	                modelo.binario = false;
	        		 	modelo.primo = false;
	        		 	modelo.memorias = false;
	        		 	modelo.resultados = false;
	                vista.txtPantalla.requestFocus();
	     	}
        	
        }
        if (e.getSource() == vista.btn5) {
        	vista.txtPantalla.setText("");
      	   modelo.cadena += 5;
           vista.txtPantalla.setText(modelo.cadena);
           modelo.activado = true;
           modelo.binario = false;
   		   modelo.primo = false;
   		   modelo.memorias = false;
           vista.txtPantalla.requestFocus();
    	
	     	if (modelo.resultados == true && !vista.txtPantalla.getText().isEmpty()) {
	     		modelo.cadena = "";
	     		vista.txtPantalla.setText("");
	           	 modelo.cadena += 5;
	                vista.txtPantalla.setText(modelo.cadena);
	                modelo.activado = true;
	                modelo.binario = false;
	        		 	modelo.primo = false;
	        		 	modelo.memorias = false;
	        		 	modelo.resultados = false;
	                vista.txtPantalla.requestFocus();
	     	}
        	
           
        }
        if (e.getSource() == vista.btn6) {
        	vista.txtPantalla.setText("");
      	   modelo.cadena += 6;
           vista.txtPantalla.setText(modelo.cadena);
           modelo.activado = true;
           modelo.binario = false;
   		   modelo.primo = false;
   		  modelo.memorias = false;
           vista.txtPantalla.requestFocus();
    	
	     	if (modelo.resultados == true && !vista.txtPantalla.getText().isEmpty()) {
	     		modelo.cadena = "";
	     		vista.txtPantalla.setText("");
	           	 modelo.cadena += 6;
	                vista.txtPantalla.setText(modelo.cadena);
	                modelo.activado = true;
	                modelo.binario = false;
	        		 	modelo.primo = false;
	        		 	modelo.resultados = false;
	        		 	modelo.memorias = false;
	                vista.txtPantalla.requestFocus();
	     	}
        	
        }
        if (e.getSource() == vista.btn7) {
        
        		vista.txtPantalla.setText("");
         	   modelo.cadena += 7;
              vista.txtPantalla.setText(modelo.cadena);
              modelo.activado = true;
              modelo.binario = false;
      		   modelo.primo = false;
      		   modelo.memorias = false;
              vista.txtPantalla.requestFocus();
       	
  	     	if (modelo.resultados == true && !vista.txtPantalla.getText().isEmpty()) {
  	     		modelo.cadena = "";
  	     		vista.txtPantalla.setText("");
  	           	 modelo.cadena += 7;
  	                vista.txtPantalla.setText(modelo.cadena);
  	                modelo.activado = true;
  	                modelo.binario = false;
  	        		 	modelo.primo = false;
  	        		 	modelo.resultados = false;
  	        		 	modelo.memorias = false;
  	                vista.txtPantalla.requestFocus();
  	     	}
        }
        if (e.getSource() == vista.btn8) {
        	vista.txtPantalla.setText("");
        	   modelo.cadena += 8;
             vista.txtPantalla.setText(modelo.cadena);
             modelo.activado = true;
             modelo.binario = false;
     		   modelo.primo = false;
     		  modelo.memorias = false;
             vista.txtPantalla.requestFocus();
      	
 	     	if (modelo.resultados == true && !vista.txtPantalla.getText().isEmpty()) {
 	     		modelo.cadena = "";
 	     		vista.txtPantalla.setText("");
 	           	 modelo.cadena += 8;
 	                vista.txtPantalla.setText(modelo.cadena);
 	                modelo.activado = true;
 	                modelo.binario = false;
 	        		 	modelo.primo = false;
 	        		 	modelo.resultados = false;
 	        		 	modelo.memorias = false;
 	                vista.txtPantalla.requestFocus();
 	     	}
         }
        	
        	
        if (e.getSource() == vista.btn9) {
        	
        	vista.txtPantalla.setText("");
       	   modelo.cadena += 9;
            vista.txtPantalla.setText(modelo.cadena);
            modelo.activado = true;
            modelo.binario = false;
    		   modelo.primo = false;
    		   modelo.memorias = false;
            vista.txtPantalla.requestFocus();
     	
	     	if (modelo.resultados == true && !vista.txtPantalla.getText().isEmpty()) {
	     		modelo.cadena = "";
	     		vista.txtPantalla.setText("");
	           	 modelo.cadena += 9;
	                vista.txtPantalla.setText(modelo.cadena);
	                modelo.activado = true;
	                modelo.binario = false;
	        		 	modelo.primo = false;
	        		 	modelo.resultados = false;
	        		 	modelo.memorias = false;
	                vista.txtPantalla.requestFocus();
	     	}
        }
        if (e.getSource() == vista.btnCero) {
        	vista.txtPantalla.setText("");
          	   modelo.cadena += 0;
               vista.txtPantalla.setText(modelo.cadena);
               modelo.activado = true;
               modelo.binario = false;
       		   modelo.primo = false;
       		modelo.memorias = false;
               vista.txtPantalla.requestFocus();
        	
        	if (modelo.resultados == true && !vista.txtPantalla.getText().isEmpty()) {
        		modelo.cadena = "";
        		vista.txtPantalla.setText("");
              	 modelo.cadena += 0;
                   vista.txtPantalla.setText(modelo.cadena);
                   modelo.activado = true;
                   modelo.binario = false;
           		 	modelo.primo = false;
           		 	modelo.resultados = false;
           		 modelo.memorias = false;
                   vista.txtPantalla.requestFocus();
        	}
           
        }
        if(e.getSource() == vista.btnC) {
        	vista.txtPantalla.setText("0");
        	modelo.cadena = "0";
        	modelo.activado = false;
        	modelo.punto = false;
        	modelo.binario = false;
    		modelo.primo = false;
    		modelo.resultados = false;
    		modelo.memorias = false;
        	vista.txtPantalla.requestFocus();
        }
        if(e.getSource() == vista.btnPunto) {
        	if (!modelo.punto == true && !vista.txtPantalla.getText().isEmpty()) {
        		modelo.cadena = modelo.cadena + ".";
                vista.txtPantalla.setText(modelo.cadena);
                modelo.punto = true;
                modelo.binario = false;
        		modelo.primo = false;
        		modelo.resultados = false;
        		modelo.memorias = false;
                vista.txtPantalla.requestFocus();
        	}
        	
        }
        if(e.getSource() == vista.btnSuma) {
        	if(modelo.cadena == "") {
        		//modelo.cadena = (String.valueOf(modelo.resultado));
        		modelo.activado = false;
        	}
        	if(modelo.activado==true) {
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "+");
        		modelo.cadena = "";
        		modelo.oper = "suma";
        		modelo.punto = false;
        		modelo.resultados = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		vista.txtPantalla.requestFocus();
        		//modelo.activado = false;
        		
        	}
        }
        if(e.getSource() == vista.btnResta) {
        	//modelo.cadena = (String.valueOf(modelo.resultado));
        	if(modelo.cadena == "") {
        		modelo.activado = false;
        	}
        	if(modelo.activado==true) {
        		
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "-");
        		modelo.cadena = "";
        		modelo.oper = "resta";
        		modelo.punto = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		modelo.resultados = false;
        		vista.txtPantalla.requestFocus();
        		//modelo.activado = false;
        		
        	}
        	
        }
        if(e.getSource() == vista.btnMulti) {
        	if(modelo.cadena == "") {
        		
        		modelo.activado = false;
        	}
        	if(modelo.activado==true) {
        		
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "*");
        		modelo.cadena = "";
        		modelo.oper = "multiplicacion";
        		modelo.punto = false;
        		modelo.resultados = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		vista.txtPantalla.requestFocus();
        		//modelo.activado = false;
        		
        	}
        	
        }
        if(e.getSource() == vista.btnDivision) {
        	if(modelo.cadena == "") {
        		//modelo.cadena = (String.valueOf(modelo.resultado));
        		modelo.activado = false;
        	}
        	if(modelo.activado==true) {
        		
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "/");
        		modelo.cadena = "";
        		modelo.oper = "division";
        		modelo.punto = false;
        		modelo.resultados = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		vista.txtPantalla.requestFocus();
        		//modelo.activado = false;
        	}
        	
        }
        if(e.getSource()== vista.btnIgual) {
        	if(modelo.activado == true) {
        		if(modelo.oper == "nula") {
        			
        			vista.txtPantalla.setText(modelo.cadena);
        			modelo.resultadoBitacora = (modelo.cadena + " = " + modelo.cadena);
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.memorias = false;
            		modelo.binario = false;
            		modelo.primo = false;
        			modelo.resultados = true;
        		}else if(modelo.oper == "suma") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)));
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.cadena = (String.valueOf(modelo.resultado));
        			modelo.resultadoBitacora = (Double.toString(modelo.num1) + " + " + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.oper = "nula";
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
        			vista.txtPantalla.requestFocus();
        			
        			
        		}else if(modelo.oper == "resta") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)));
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.cadena = (String.valueOf(modelo.resultado));
        			modelo.resultadoBitacora = (Double.toString(modelo.num1) + " - " + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.punto = false;
        			modelo.oper = "nula";
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
        			vista.txtPantalla.requestFocus();
        			
        		}else if(modelo.oper == "multiplicacion") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)));
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.cadena = (String.valueOf(modelo.resultado));
        			modelo.resultadoBitacora = (Double.toString(modelo.num1) + " * " + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.oper = "nula";
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
        			vista.txtPantalla.requestFocus();
        			
        		}else if(modelo.oper == "division") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)));
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.cadena = (String.valueOf(modelo.resultado));
        			modelo.resultadoBitacora = (Double.toString(modelo.num1) + " / " + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.oper = "nula";
        			modelo.punto = false;
        			modelo.activado = false;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
        			vista.txtPantalla.requestFocus();
        			modelo.resultados = true;
        			if(modelo.resultado == Double.NaN) {
        				modelo.cadena = "0";
        				modelo.punto = false;
            			modelo.activado = false;
            			modelo.binario = true;
                		modelo.primo = true;
                		modelo.memorias = true;
        			}
        		}
        		
        	}
        }
        if(e.getSource() == vista.btnPrimo) {
        	if(modelo.binario == false && modelo.memorias == false) {
        		double parser = Double.parseDouble(modelo.cadena);
            	modelo.numero = (int) parser;
            	if(modelo.esPrimo(modelo.numero) == true) {
            		vista.txtPantalla.setText("True");
            		modelo.memorias = true;
            		modelo.activado = false;
            		modelo.binario = true;
            		modelo.primo = true;
            		modelo.cadena = "0";
            		modelo.resultadoBitacora = ("Primo " + Integer.toString(modelo.numero) + " true");
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
            		
            	}else {
            		vista.txtPantalla.setText("false");
            		modelo.activado = false;
            		vista.txtPantalla.requestFocus();
            		modelo.resultadoBitacora = ("Primo " + Integer.toString(modelo.numero) + " false");
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.memorias = true;
            		modelo.binario = false;
            		modelo.primo = true;
            		modelo.cadena = "0";
            		
            	}
        		
        	}
        	
        }
        if(e.getSource() == vista.btnBinario) {
        	if(modelo.primo == false && modelo.memorias == false) {
        		double parser = Double.parseDouble(modelo.cadena);
            	modelo.numero = (int) parser;
            	vista.txtPantalla.setText(modelo.decimalABinario(modelo.numero));
            	modelo.resultadoBitacora = ("Binario " + Double.toString(parser) + " = " + modelo.decimalABinario(modelo.numero));
    			modelo.bitacora.add(modelo.resultadoBitacora);
    			Modelo.escribirBitacora(modelo.bitacora);
            	modelo.activado = false;
            	modelo.binario = true;
            	modelo.primo = false;
            	modelo.memorias = false;
        		modelo.cadena = "0";
        		vista.txtPantalla.requestFocus();
        	}
        	
        }
        if(e.getSource() == vista.btnMemoria) {
        	if(modelo.binario == false && modelo.primo == false) {
        		double parser = Double.parseDouble(modelo.cadena);
            	modelo.agregarNumero(parser);
            	vista.txtPantalla.setText(modelo.cadena + " add to memory");
            	modelo.memorias = true;
            	modelo.activado = false;
            	modelo.binario = false;
            	modelo.primo = false;
            	modelo.cadena = "0";
        	}
        	
        }
        if(e.getSource() == vista.btnAvg) {
        	if(modelo.binario == false && modelo.primo == false) {
        		vista.txtPantalla.setText(Double.toString(modelo.calcularPromedio()));
            	modelo.cadena = Double.toString(modelo.calcularPromedio());
            	modelo.memorias = false;
            	modelo.binario = false;
            	modelo.primo = false;
        	}
        	
        	
        }
        if(e.getSource() == vista.btnData) {
        	modelo.LeerArchivoDeTexto();
        	vista.labeldata.setText(modelo.contenidoComoString);
        	vista.ventanaEmergente.setVisible(true);
        }
        
        
  
	
	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char keyChar = e.getKeyChar();
		if (Character.isDigit(keyChar)) {
			modelo.cadena += keyChar;
            vista.txtPantalla.setText(vista.txtPantalla.getText() + keyChar);
            modelo.activado = true;
            modelo.binario = false;
    		modelo.primo = false;
    		modelo.memorias = false;
    		if (modelo.resultados == true && !vista.txtPantalla.getText().isEmpty()) {
        		modelo.cadena = "";
        		vista.txtPantalla.setText("");
              	 modelo.cadena += keyChar;
                   vista.txtPantalla.setText(modelo.cadena);
                   modelo.activado = true;
                   modelo.binario = false;
           		 	modelo.primo = false;
           		 	modelo.resultados = false;
           		 	modelo.memorias = false;
                   vista.txtPantalla.requestFocus();
        	}
    		
		}else if (keyChar == '*') {
			if(modelo.cadena == "") {
        		modelo.activado = false;
        		} if(modelo.activado==true) {
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "*");
        		modelo.cadena = "";
        		modelo.oper = "multiplicacion";
        		modelo.punto = false;
        		modelo.resultados = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		//modelo.activado = false;
        		}
        }else if (keyChar == '+') {
			if(modelo.cadena == "") {
        		modelo.activado = false;
        		} if(modelo.activado==true) {
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "+");
        		modelo.cadena = "";
        		modelo.oper = "suma";
        		modelo.punto = false;
        		modelo.resultados = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        	
        		}
        }else if (keyChar == '-') {
			if(modelo.cadena == "") {
        		modelo.activado = false;
        		} if(modelo.activado==true) {
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "-");
        		modelo.cadena = "";
        		modelo.oper = "resta";
        		modelo.punto = false;
        		modelo.resultados = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		
        		}
        }else if (keyChar == '/') {
			if(modelo.cadena == "") {
        		modelo.activado = false;
        		} if(modelo.activado==true) {
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "/");
        		modelo.cadena = "";
        		modelo.oper = "division";
        		modelo.punto = false;
        		modelo.resultados = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		
        		}
        } else if(keyChar == '.') {
        	if (!modelo.punto == true && !vista.txtPantalla.getText().isEmpty()) {
        		modelo.cadena = modelo.cadena + ".";
                vista.txtPantalla.setText(modelo.cadena);
                modelo.punto = true;
                modelo.resultados = false;
                modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        	}
        	
        }
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
        	if(modelo.activado == true) {
        		if(modelo.oper == "nula") {
        			vista.txtPantalla.setText(modelo.cadena);
        			modelo.resultadoBitacora = (modelo.cadena + " = " + modelo.cadena);
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.resultados = true;
            		modelo.binario = false;
            		modelo.primo = false;
        			modelo.memorias = false;
        		}else if(modelo.oper == "suma") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)));
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.cadena = (String.valueOf(modelo.resultado));
        			modelo.resultadoBitacora = (Double.toString(modelo.num1) + " + " + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.oper = "nula";
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
        			
        			
        		}else if(modelo.oper == "resta") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)));
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.resultadoBitacora = (Double.toString(modelo.num1) + " - " + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.cadena = (String.valueOf(modelo.resultado));
        			modelo.punto = false;
        			modelo.oper = "nula";
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
        			
            		
        		}else if(modelo.oper == "multiplicacion") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)));
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.resultadoBitacora = (Double.toString(modelo.num1) + " * " + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.cadena = (String.valueOf(modelo.resultado));
        			modelo.oper = "nula";
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
        			
            		
        		}else if(modelo.oper == "division") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)));
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.cadena = (String.valueOf(modelo.resultado));
        			modelo.resultadoBitacora = (Double.toString(modelo.num1) + " / " + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.oper = "nula";
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
        			if(modelo.resultado == Double.NaN) {
        				modelo.cadena = "0";
        			}
        		}
        		
        	}
        	
		}else if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			vista.txtPantalla.setText("0");
        	modelo.cadena = "0";
        	modelo.activado = false;
        	modelo.punto = false;
        	modelo.binario = false;
    		modelo.primo = false;
    		modelo.memorias = false;
    		modelo.resultados = false;
		}
		// TODO Auto-generated method stub
		
	}
	


}
