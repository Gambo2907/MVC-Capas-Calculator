package mvc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
	   		   modelo.operaciones = true;
	           vista.txtPantalla.requestFocus();
    	
	     	if (modelo.resultados == true && !vista.txtPantalla.getText().isEmpty() && modelo.oper == "nula") {
	     		if( !vista.txtPantalla.getText().isEmpty()) {
	     			modelo.cadena = "";
		     		vista.txtPantalla.setText("");
		           	 modelo.cadena += 1;
		                vista.txtPantalla.setText(modelo.cadena);
		                modelo.activado = true;
		                modelo.binario = false;
		        		 	modelo.primo = false;
		        		 	modelo.resultados = false;
		        		 	modelo.memorias = false;
		        		 	modelo.operaciones = true;
		                vista.txtPantalla.requestFocus();
	     		}
	     		
	             
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
   		   modelo.operaciones = true;
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
	        		 	modelo.operaciones = true;
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
   		   modelo.operaciones = true;
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
	        		 	modelo.operaciones = true;
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
   		 modelo.operaciones = true;
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
	        		 	modelo.operaciones = true;
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
   		modelo.operaciones = true;
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
	        		 	modelo.operaciones = true;
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
   		modelo.operaciones = true;
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
	        		 	modelo.operaciones = true;
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
      		 modelo.operaciones = true;
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
  	        		 	modelo.operaciones = true;
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
     		 modelo.operaciones = true;
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
 	        		 	modelo.operaciones = true;
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
    		   modelo.operaciones = true;
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
	        		 	modelo.operaciones = true;
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
       		modelo.operaciones = true;
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
           		modelo.operaciones = true;
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
    		modelo.operaciones = false;
    		modelo.oper = "nula";
        	vista.txtPantalla.requestFocus();
        }
        if(e.getSource() == vista.btnPunto) {
        	if (!modelo.punto == true && !vista.txtPantalla.getText().isEmpty() && modelo.cadena != "NaN") {
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
        	if(modelo.cadena == ""|| modelo.cadena == "NaN") {
        		modelo.cadena = "";
        		modelo.activado = false;
        	}
        	if(modelo.activado == true && modelo.oper == "nula") {
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "+");
        		modelo.cadena = "";
        		modelo.oper = "+";
        		modelo.punto = false;
        		modelo.resultados = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		modelo.activado = false;
        		vista.txtPantalla.requestFocus();
        	
        	}
        	else if(modelo.operaciones == true && modelo.oper != "nula") {
        		if(modelo.oper != "/" && modelo.resultado != Double.NaN) {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
            		modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "+");
        			modelo.num1 = modelo.resultado;
        			modelo.cadena = "";
        			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.operaciones = false;
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
            		modelo.operaciones = false;
            		modelo.oper = "+";
        			vista.txtPantalla.requestFocus();
        		}else if(modelo.oper == "/" && modelo.resultado != Double.NaN) {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			if(modelo.num2 != 0) {
            			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "+");
            			modelo.num1 = modelo.resultado;
            			modelo.cadena = "";
            			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
            			modelo.bitacora.add(modelo.resultadoBitacora);
            			Modelo.escribirBitacora(modelo.bitacora);
            			modelo.operaciones = false;
            			modelo.punto = false;
            			modelo.activado = true;
            			modelo.binario = false;
                		modelo.primo = false;
                		modelo.memorias = false;
                		modelo.resultados = true;
                		modelo.operaciones = false;
                		modelo.oper = "+";
            			vista.txtPantalla.requestFocus();
        			}else {
        				modelo.cadena = "";
        				vista.txtPantalla.setText("NaN");
        				modelo.punto = true;
            			modelo.activado = false;
            			modelo.binario = true;
                		modelo.primo = true;
                		modelo.memorias = false;
                		modelo.resultados = false;
                		modelo.operaciones = false;
        			}
        		}
    			
    			
        	}
        	
        	
        	
        	
        }
        if(e.getSource() == vista.btnResta) {
        	if(modelo.cadena == ""|| modelo.cadena == "NaN") {
        		modelo.cadena = "";
        		modelo.activado = false;
        	}
        	if(modelo.activado==true && modelo.oper == "nula") {
        		
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "-");
        		modelo.cadena = "";
        		modelo.oper = "-";
        		modelo.punto = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		modelo.resultados = false;
        		vista.txtPantalla.requestFocus();
        		modelo.activado = false;
        		
        	}
        	else if(modelo.operaciones == true && modelo.oper != "nula" ) {
        		if(modelo.oper != "/" && modelo.resultado != Double.NaN) {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "-");
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.num1 = modelo.resultado;
        			modelo.cadena = "";
        			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.operaciones = false;
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
            		modelo.operaciones = false;
            		modelo.oper = "-";
        			vista.txtPantalla.requestFocus();
        		}
        		else if (modelo.oper == "/" && modelo.resultado != Double.NaN) {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			if(modelo.num2 != 0) {
        				vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "-");
            			modelo.num1 = modelo.resultado;
            			modelo.cadena = "";
            			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
            			modelo.bitacora.add(modelo.resultadoBitacora);
            			Modelo.escribirBitacora(modelo.bitacora);
            			modelo.operaciones = false;
            			modelo.punto = false;
            			modelo.activado = true;
            			modelo.binario = false;
                		modelo.primo = false;
                		modelo.memorias = false;
                		modelo.resultados = true;
                		modelo.operaciones = false;
                		modelo.oper = "-";
            			vista.txtPantalla.requestFocus();
        			}else {
        				modelo.cadena = "";
        				vista.txtPantalla.setText("NaN");
        				modelo.punto = true;
            			modelo.activado = false;
            			modelo.binario = true;
                		modelo.primo = true;
                		modelo.memorias = false;
                		modelo.resultados = false;
                		modelo.operaciones = false;
        			}
        			
        		}
    			
        	}
        	
        }
        if(e.getSource() == vista.btnMulti) {
        	if(modelo.cadena == "" || modelo.cadena == "NaN") {
        		modelo.cadena = "";
        		modelo.activado = false;
        	}
        	if(modelo.activado==true && modelo.oper == "nula") {
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "*");
        		modelo.cadena = "";
        		modelo.oper = "*";
        		modelo.punto = false;
        		modelo.resultados = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		vista.txtPantalla.requestFocus();
        		modelo.activado = false;
        		
        	}
        	else if(modelo.operaciones == true && modelo.oper != "nula" ) {
        		if(modelo.oper != "/" && modelo.resultado != Double.NaN) {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "*");
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.num1 = modelo.resultado;
        			modelo.cadena = "";
        			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.operaciones = false;
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
            		modelo.operaciones = false;
            		modelo.oper = "*";
        			vista.txtPantalla.requestFocus();
        		} else if(modelo.oper == "/" && modelo.resultado != Double.NaN) {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			if(modelo.num2 != 0) {
        				vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "*");
            			modelo.num1 = modelo.resultado;
            			modelo.cadena = "";
            			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
            			modelo.bitacora.add(modelo.resultadoBitacora);
            			Modelo.escribirBitacora(modelo.bitacora);
            			modelo.punto = false;
            			modelo.activado = true;
            			modelo.binario = false;
                		modelo.primo = false;
                		modelo.memorias = false;
                		modelo.resultados = true;
                		modelo.operaciones = false;
                		modelo.oper = "*";
            			vista.txtPantalla.requestFocus();
        			} else {
        				modelo.cadena = "";
        				vista.txtPantalla.setText("NaN");
        				modelo.punto = true;
            			modelo.activado = false;
            			modelo.binario = true;
                		modelo.primo = true;
                		modelo.memorias = false;
                		modelo.resultados = false;
                		modelo.operaciones = false;
        			}
        			
        		}
        	}
        	
        	
        }
        if(e.getSource() == vista.btnDivision) {
        	if(modelo.cadena == ""|| modelo.cadena == "NaN") {
        		modelo.cadena = "";
        		modelo.activado = false;
        	}
        	if(modelo.activado==true && modelo.oper == "nula") {
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "/");
        		modelo.cadena = "";
        		modelo.oper = "/";
        		modelo.punto = false;
        		modelo.resultados = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		vista.txtPantalla.requestFocus();
        		modelo.activado = false;
        		
        		
        	}else if(modelo.operaciones == true && modelo.oper != "nula" && modelo.resultado != Double.NaN) {
        		if(modelo.oper != "/") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "/");
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.num1 = modelo.resultado;
        			modelo.cadena = "";
        			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
            		modelo.operaciones = false;
            		modelo.oper = "/";
        			vista.txtPantalla.requestFocus();
        		}
        		else if(modelo.oper == "/") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			if(modelo.num2 != 0) {
        				vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "/");
            			modelo.num1 = modelo.resultado;
            			modelo.cadena = "";
            			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
            			modelo.bitacora.add(modelo.resultadoBitacora);
            			Modelo.escribirBitacora(modelo.bitacora);
            			modelo.punto = false;
            			modelo.activado = true;
            			modelo.binario = false;
                		modelo.primo = false;
                		modelo.memorias = false;
                		modelo.resultados = true;
                		modelo.operaciones = false;
                		modelo.oper = "/";
            			vista.txtPantalla.requestFocus();
        			}else {
        				modelo.cadena = "";
        				vista.txtPantalla.setText("NaN");
        				modelo.punto = true;
            			modelo.activado = false;
            			modelo.binario = true;
                		modelo.primo = true;
                		modelo.memorias = false;
                		modelo.resultados = false;
                		modelo.operaciones = false;
        			}
        			
        		}
        	}
        	
        	
        }
        if(e.getSource() == vista.btnIgual) {
        	if(modelo.activado == true) {
        		if(modelo.oper != "nula") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)));
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.cadena = (String.valueOf(modelo.resultado));
        			modelo.resultadoBitacora = (Double.toString(modelo.num1) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.oper = "nula";
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
            		modelo.operaciones = false;
        			vista.txtPantalla.requestFocus();
        			
        		}
        		
        		else {
        			vista.txtPantalla.setText(modelo.cadena);
        			modelo.resultadoBitacora = (modelo.cadena + " = " + modelo.cadena);
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.resultados = true;
            		modelo.binario = false;
            		modelo.primo = false;
        			modelo.memorias = false;
        			modelo.operaciones = false;
        		}
        	}
        }
        
        
       
        
        if(e.getSource() == vista.btnPrimo) {
        	if(modelo.binario == false && modelo.memorias == false && modelo.cadena != "NaN" && modelo.cadena != "" && modelo.resultado != Double.NaN) {
        		double parser = Double.parseDouble(modelo.cadena);
            	modelo.numero = (int) parser;
            	if(modelo.esPrimo(modelo.numero) == true) {
            		vista.txtPantalla.setText("True");
            		modelo.memorias = true;
            		modelo.activado = false;
            		modelo.binario = true;
            		modelo.primo = true;
            		modelo.operaciones = false;
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
            		modelo.operaciones = false;
            		modelo.cadena = "0";
            		
            	}
        		
        	}
        	
        }
        if(e.getSource() == vista.btnBinario) {
        	if(modelo.primo == false && modelo.memorias == false && modelo.cadena != "NaN" && modelo.cadena != "" && modelo.resultado != Double.NaN) {
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
            	modelo.operaciones = false;
        		modelo.cadena = "0";
        		vista.txtPantalla.requestFocus();
        	}
        	
        }
        if(e.getSource() == vista.btnMemoria) {
        	if(modelo.binario == false && modelo.primo == false && modelo.cadena != "NaN" && modelo.cadena != "" && modelo.resultado != Double.NaN) {
        		double parser = Double.parseDouble(modelo.cadena);
            	modelo.agregarNumero(parser);
            	vista.txtPantalla.setText(modelo.cadena + " add");
            	modelo.memorias = false;
            	modelo.binario = false;
            	modelo.primo = false;
            	modelo.activado = true;
            	modelo.operaciones = false;
            	vista.txtPantalla.requestFocus();
        	}
        	
        }
        if(e.getSource() == vista.btnAvg) {
        	if(modelo.binario == false && modelo.primo == false && modelo.cadena != "NaN" && modelo.cadena != "" && modelo.resultado != Double.NaN) {
        		vista.txtPantalla.setText(Double.toString(modelo.calcularPromedio()));
        		modelo.cadena = "";
            	modelo.cadena = Double.toString(modelo.calcularPromedio());
            	modelo.activado = true;
            	modelo.memorias = false;
            	modelo.binario = false;
            	modelo.primo = false;
            	modelo.operaciones = false;
            	vista.txtPantalla.requestFocus();
        	}
        	
        	
        }
        if(e.getSource() == vista.btnData) {
        	try {
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\GitHub\\MVC-Capas-Calculator\\Modelado_CalculadoraMVC_Capas\\src\\mvc\\Bitacora.txt"));
                String line;

                while ((line = br.readLine()) != null) {
                    String[] data = line.split(","); // Suponiendo que los datos están separados por comas

                    // Agregar una nueva fila a la tabla con los datos del archivo
                    vista.model.addRow(data);
                    
                }

                br.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
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
    		modelo.operaciones =true;
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
           		 	modelo.operaciones = true;
                   
        	}
    		
		}else if (keyChar == '*') {
			if(modelo.cadena == ""|| modelo.cadena == "NaN") {
        		modelo.cadena = "";
        		modelo.activado = false;
        	}
        	if(modelo.activado==true && modelo.oper == "nula") {
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "*");
        		modelo.cadena = "";
        		modelo.oper = "*";
        		modelo.punto = false;
        		modelo.resultados = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		modelo.activado = false;
        		
        		
        	}else if(modelo.operaciones == true && modelo.oper != "nula" && modelo.resultado != Double.NaN) {
        		if(modelo.oper != "/") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "*");
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.num1 = modelo.resultado;
        			modelo.cadena = "";
        			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.operaciones = false;
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
            		modelo.operaciones = false;
            		modelo.oper = "*";
        			vista.txtPantalla.requestFocus();
        		}
        		else if(modelo.oper == "/") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			if(modelo.num2 != 0) {
        				vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "*");
            			modelo.num1 = modelo.resultado;
            			modelo.cadena = "";
            			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
            			modelo.bitacora.add(modelo.resultadoBitacora);
            			Modelo.escribirBitacora(modelo.bitacora);
            			modelo.operaciones = false;
            			modelo.punto = false;
            			modelo.activado = true;
            			modelo.binario = false;
                		modelo.primo = false;
                		modelo.memorias = false;
                		modelo.resultados = true;
                		modelo.operaciones = false;
                		modelo.oper = "*";
            			vista.txtPantalla.requestFocus();
        			}else {
        				modelo.cadena = "";
        				vista.txtPantalla.setText("NaN");
        				modelo.punto = true;
            			modelo.activado = false;
            			modelo.binario = true;
                		modelo.primo = true;
                		modelo.memorias = false;
                		modelo.resultados = false;
                		modelo.operaciones = false;
        			}
        			
        		}
        	}
        }else if (keyChar == '+') {
        	if(modelo.cadena == ""|| modelo.cadena == "NaN") {
        		modelo.cadena = "";
        		modelo.activado = false;
        	}
        	if(modelo.activado==true && modelo.oper == "nula") {
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "+");
        		modelo.cadena = "";
        		modelo.oper = "+";
        		modelo.punto = false;
        		modelo.resultados = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		
        		modelo.activado = false;
        		
        		
        	}else if(modelo.operaciones == true && modelo.oper != "nula" && modelo.resultado != Double.NaN) {
        		if(modelo.oper != "/") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "+");
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.num1 = modelo.resultado;
        			modelo.cadena = "";
        			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.operaciones = false;
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
            		modelo.operaciones = false;
            		modelo.oper = "+";
        			vista.txtPantalla.requestFocus();
        		}
        		else if(modelo.oper == "/") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			if(modelo.num2 != 0) {
        				vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "+");
            			modelo.num1 = modelo.resultado;
            			modelo.cadena = "";
            			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
            			modelo.bitacora.add(modelo.resultadoBitacora);
            			Modelo.escribirBitacora(modelo.bitacora);
            			modelo.operaciones = false;
            			modelo.punto = false;
            			modelo.activado = true;
            			modelo.binario = false;
                		modelo.primo = false;
                		modelo.memorias = false;
                		modelo.resultados = true;
                		modelo.operaciones = false;
                		modelo.oper = "+";
            			vista.txtPantalla.requestFocus();
        			}else {
        				modelo.cadena = "";
        				vista.txtPantalla.setText("NaN");
        				modelo.punto = true;
            			modelo.activado = false;
            			modelo.binario = true;
                		modelo.primo = true;
                		modelo.memorias = false;
                		modelo.resultados = false;
                		modelo.operaciones = false;
        			}
        			
        		}
        	}
        	
        }else if (keyChar == '-') {
        	if(modelo.cadena == ""|| modelo.cadena == "NaN") {
        		modelo.cadena = "";
        		modelo.activado = false;
        	}
        	if(modelo.activado==true && modelo.oper == "nula") {
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "-");
        		modelo.cadena = "";
        		modelo.oper = "-";
        		modelo.punto = false;
        		modelo.resultados = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		
        		modelo.activado = false;
        		
        		
        	}else if(modelo.operaciones == true && modelo.oper != "nula" && modelo.resultado != Double.NaN) {
        		if(modelo.oper != "/") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "-");
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.num1 = modelo.resultado;
        			modelo.cadena = "";
        			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.operaciones = false;
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
            		modelo.operaciones = false;
            		modelo.oper = "-";
        			vista.txtPantalla.requestFocus();
        		}
        		else if(modelo.oper == "/") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			if(modelo.num2 != 0) {
        				vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "-");
            			modelo.num1 = modelo.resultado;
            			modelo.cadena = "";
            			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
            			modelo.bitacora.add(modelo.resultadoBitacora);
            			Modelo.escribirBitacora(modelo.bitacora);
            			modelo.operaciones = false;
            			modelo.punto = false;
            			modelo.activado = true;
            			modelo.binario = false;
                		modelo.primo = false;
                		modelo.memorias = false;
                		modelo.resultados = true;
                		modelo.operaciones = false;
                		modelo.oper = "-";
            			vista.txtPantalla.requestFocus();
        			}else {
        				modelo.cadena = "";
        				vista.txtPantalla.setText("NaN");
        				modelo.punto = true;
            			modelo.activado = false;
            			modelo.binario = true;
                		modelo.primo = true;
                		modelo.memorias = false;
                		modelo.resultados = false;
                		modelo.operaciones = false;
        			}
        			
        		}
        	}
        		
        }else if (keyChar == '/') {
        	if(modelo.cadena == ""|| modelo.cadena == "NaN") {
        		modelo.cadena = "";
        		modelo.activado = false;
        	}
        	if(modelo.activado==true && modelo.oper == "nula") {
        		modelo.num1 = Double.parseDouble(modelo.cadena);
        		vista.txtPantalla.setText(modelo.cadena + "/");
        		modelo.cadena = "";
        		modelo.oper = "/";
        		modelo.punto = false;
        		modelo.resultados = false;
        		modelo.memorias = true;
        		modelo.binario = true;
        		modelo.primo = true;
        		vista.txtPantalla.requestFocus();
        		modelo.activado = false;
        		
        		
        	}else if(modelo.operaciones == true && modelo.oper != "nula" && modelo.resultado != Double.NaN) {
        		if(modelo.oper != "/") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "/");
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.num1 = modelo.resultado;
        			modelo.cadena = "";
        			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.operaciones = false;
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
            		modelo.operaciones = false;
            		modelo.oper = "/";
        			vista.txtPantalla.requestFocus();
        		}
        		else if(modelo.oper == "/") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			if(modelo.num2 != 0) {
        				vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)) + "/");
            			modelo.num1 = modelo.resultado;
            			modelo.cadena = "";
            			modelo.resultadoBitacora = (Double.toString(modelo.numfijo) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
            			modelo.bitacora.add(modelo.resultadoBitacora);
            			Modelo.escribirBitacora(modelo.bitacora);
            			modelo.punto = false;
            			modelo.activado = true;
            			modelo.binario = false;
                		modelo.primo = false;
                		modelo.memorias = false;
                		modelo.resultados = true;
                		modelo.operaciones = false;
                		modelo.oper = "/";
            			vista.txtPantalla.requestFocus();
        			}else {
        				modelo.cadena = "";
        				vista.txtPantalla.setText("NaN");
        				modelo.punto = true;
            			modelo.activado = false;
            			modelo.binario = true;
                		modelo.primo = true;
                		modelo.memorias = false;
                		modelo.resultados = false;
                		modelo.operaciones = false;
        			}
        			
        		}
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
        		if(modelo.oper != "nula") {
        			modelo.num2 = Double.parseDouble(modelo.cadena);
        			vista.txtPantalla.setText(String.valueOf(modelo.operaciones(modelo.num1, modelo.num2, modelo.oper)));
        			modelo.resultado = modelo.operaciones(modelo.num1, modelo.num2, modelo.oper);
        			modelo.cadena = (String.valueOf(modelo.resultado));
        			modelo.resultadoBitacora = (Double.toString(modelo.num1) + modelo.oper + Double.toString(modelo.num2) + " = " + Double.toString(modelo.resultado));
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.oper = "nula";
        			modelo.punto = false;
        			modelo.activado = true;
        			modelo.binario = false;
            		modelo.primo = false;
            		modelo.memorias = false;
            		modelo.resultados = true;
            		modelo.operaciones = false;
        			vista.txtPantalla.requestFocus();
        			
        		}
        		
        		else {
        			vista.txtPantalla.setText(modelo.cadena);
        			modelo.resultadoBitacora = (modelo.cadena + " = " + modelo.cadena);
        			modelo.bitacora.add(modelo.resultadoBitacora);
        			Modelo.escribirBitacora(modelo.bitacora);
        			modelo.resultados = true;
            		modelo.binario = false;
            		modelo.primo = false;
        			modelo.memorias = false;
        			modelo.operaciones = false;
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
    		modelo.operaciones = false;
		}
		// TODO Auto-generated method stub
		
	}
	


}
