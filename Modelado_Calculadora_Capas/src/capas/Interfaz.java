package capas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;









public class Interfaz extends JFrame {
	public Logica logica;
	public JPanel contentPane;
	public JTextField txtPantalla;
	public JButton btnBinario;
	public JButton btnPrimo;
	public JButton btnData;
	public JButton btn7;
	public JButton btn8;
	public JButton btn9;
	public JButton btn4;
	public JButton btn5;
	public JButton btn6;
	public JButton btn1;
	public JButton btn2;
	public JButton btn3;
	public JButton btnC;
	public JButton btnCero;
	public JButton btnPunto;
	public JButton btnDivision;
	public JButton btnMulti;
	public JButton btnResta;
	public JButton btnSuma;
	public JButton btnIgual;
	public JButton btnAvg;
	public JButton btnMemoria;
	public JFrame ventanaEmergente;
	public JLabel labeldata;
	public JPanel panel;
	public JTable table;
	public DefaultTableModel model;
	public  JScrollPane scrollPane;
	
	public Interfaz(Logica logica) {
		this.logica = logica;
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ventanaEmergente = new JFrame("Data");
        ventanaEmergente.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        ventanaEmergente.setResizable(false);
        ventanaEmergente.setSize(800, 700);
        panel = new JPanel();
        labeldata = new JLabel();
        labeldata.setSize(700, 600);
        panel.add(labeldata);
        ventanaEmergente.add(panel);
        
        table = new JTable();
        model = (DefaultTableModel) table.getModel();
       
        
        model.addColumn("Bitacora");
        
        
       scrollPane = new JScrollPane(table);
       ventanaEmergente.add(scrollPane);

        ventanaEmergente.pack();
        
		
		
		
		txtPantalla = new JTextField();
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPantalla.setEditable(false);
		txtPantalla.setBounds(10, 11, 264, 48);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);
		txtPantalla.setText("0");
		
		txtPantalla.addKeyListener((KeyListener) new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isDigit(keyChar)) {
					logica.cadena += keyChar;
		            txtPantalla.setText(txtPantalla.getText() + keyChar);
		            logica.activado = true;
		            logica.binario = false;
		    		logica.primo = false;
		    		logica.memorias = false;
		    		if (logica.resultados == true && !txtPantalla.getText().isEmpty()) {
		        		logica.cadena = "";
		        		txtPantalla.setText("");
		              	 logica.cadena += keyChar;
		                   txtPantalla.setText(logica.cadena);
		                   logica.activado = true;
		                   logica.binario = false;
		           		 	logica.primo = false;
		           		 	logica.resultados = false;
		           		    logica.memorias = false;
		                   txtPantalla.requestFocus();
		        	}
		    		
				}else if (keyChar == '*') {
					if(logica.cadena == "" || logica.cadena == "NaN") {
		        		logica.activado = false;
		        		} if(logica.activado==true) {
		        		logica.num1 = Double.parseDouble(logica.cadena);
		        		txtPantalla.setText(logica.cadena + "*");
		        		logica.cadena = "";
		        		logica.oper = "*";
		        		logica.punto = false;
		        		logica.resultados = false;
		        		logica.binario = true;
		        		logica.primo = true;
		        		logica.memorias = true;
		        		//logica.activado = false;
		        		}
		        }else if (keyChar == '+' ) {
					if(logica.cadena == "" || logica.cadena == "NaN") {
		        		logica.activado = false;
		        		} if(logica.activado==true) {
		        		logica.num1 = Double.parseDouble(logica.cadena);
		        		txtPantalla.setText(logica.cadena + "+");
		        		logica.cadena = "";
		        		logica.oper = "+";
		        		logica.punto = false;
		        		logica.resultados = false;
		        		logica.binario = true;
		        		logica.primo = true;
		        		logica.memorias = true;
		        	
		        		}
		        }else if (keyChar == '-' ) {
					if(logica.cadena == "" || logica.cadena == "NaN") {
		        		logica.activado = false;
		        		} if(logica.activado==true) {
		        		logica.num1 = Double.parseDouble(logica.cadena);
		        		txtPantalla.setText(logica.cadena + "-");
		        		logica.cadena = "";
		        		logica.oper = "-";
		        		logica.punto = false;
		        		logica.resultados = false;
		        		logica.binario = true;
		        		logica.primo = true;
		        		logica.memorias = true;
		        		
		        		}
		        }else if (keyChar == '/') {
					if(logica.cadena == "" || logica.cadena == "NaN") {
		        		logica.activado = false;
		        		} if(logica.activado==true) {
		        		logica.num1 = Double.parseDouble(logica.cadena);
		        		txtPantalla.setText(logica.cadena + "/");
		        		logica.cadena = "";
		        		logica.oper = "/";
		        		logica.punto = false;
		        		logica.resultados = false;
		        		logica.binario = true;
		        		logica.primo = true;
		        		logica.memorias = true;
		        		
		        		}
		        } else if(keyChar == '.') {
		        	if (!logica.punto == true && !txtPantalla.getText().isEmpty()) {
		        		logica.cadena = logica.cadena + ".";
		                txtPantalla.setText(logica.cadena);
		                logica.punto = true;
		                logica.resultados = false;
		        	}
		        	
		        }
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(logica.activado == true) {
		        		if(logica.oper != "nula") {
		        			logica.num2 = Double.parseDouble(logica.cadena);
		        			txtPantalla.setText(String.valueOf(logica.operaciones(logica.num1, logica.num2, logica.oper)));
		        			logica.resultado = logica.operaciones(logica.num1, logica.num2, logica.oper);
		        			logica.cadena = (String.valueOf(logica.resultado));
		        			logica.resultadoBitacora = (Double.toString(logica.num1) + logica.oper + Double.toString(logica.num2) + " = " + Double.toString(logica.resultado));
		        			logica.bitacora.add(logica.resultadoBitacora);
		        			Logica.escribirBitacora(logica.bitacora);
		        			logica.oper = "nula";
		        			logica.punto = false;
		        			logica.activado = true;
		        			logica.binario = false;
		            		logica.primo = false;
		            		logica.memorias = false;
		            		logica.resultados = true;
		            		logica.constantes = false;
		        			txtPantalla.requestFocus();
		        			
		        		}
		        		
		        		else {
		        			txtPantalla.setText(logica.cadena);
		        			logica.resultadoBitacora = (logica.cadena + " = " + logica.cadena);
		        			logica.bitacora.add(logica.resultadoBitacora);
		        			Logica.escribirBitacora(logica.bitacora);
		        			logica.resultados = true;
		            		logica.binario = false;
		            		logica.primo = false;
		        			logica.memorias = false;
		        		}
		        	}
		        	
				}else if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
					txtPantalla.setText("0");
		        	logica.cadena = "0";
		        	logica.activado = false;
		        	logica.punto = false;
		        	logica.binario = false;
		    		logica.primo = false;
		    		logica.memorias = false;
		    		logica.resultados = false;
				}
				
			}
			
		});
		
		btnBinario = new JButton("Binario");
		btnBinario.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnBinario.setBounds(10, 78, 144, 32);
		contentPane.add(btnBinario);
		btnBinario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(logica.primo == false && logica.memorias == false && logica.cadena != "NaN" && logica.cadena != "") {
	        		double parser = Double.parseDouble(logica.cadena);
	            	logica.numero = (int) parser;
	            	txtPantalla.setText(logica.decimalABinario(logica.numero));
	            	logica.resultadoBitacora = ("Binario " + Double.toString(parser) + " = " + logica.decimalABinario(logica.numero));
	    			logica.bitacora.add(logica.resultadoBitacora);
	    			Logica.escribirBitacora(logica.bitacora);
	            	logica.activado = false;
	            	logica.binario = true;
	            	logica.primo = false;
	            	logica.memorias = false;
	        		logica.cadena = "0";
	        		txtPantalla.requestFocus();
	        	}
			}
		});
		
		btnPrimo = new JButton("Primo");
		btnPrimo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPrimo.setBounds(10, 121, 144, 32);
		contentPane.add(btnPrimo);
		btnPrimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(logica.binario == false && logica.memorias == false && logica.cadena != "NaN" && logica.cadena != "") {
	        		double parser = Double.parseDouble(logica.cadena);
	            	logica.numero = (int) parser;
	            	if(logica.esPrimo(logica.numero) == true) {
	            		txtPantalla.setText("True");
	            		logica.memorias = true;
	            		logica.activado = false;
	            		logica.binario = true;
	            		logica.primo = true;
	            		logica.cadena = "0";
	            		logica.resultadoBitacora = ("Primo " + Integer.toString(logica.numero) + " true");
	        			logica.bitacora.add(logica.resultadoBitacora);
	        			Logica.escribirBitacora(logica.bitacora);
	            		
	            	}else {
	            		txtPantalla.setText("false");
	            		logica.activado = false;
	            		txtPantalla.requestFocus();
	            		logica.resultadoBitacora = ("Primo " + Integer.toString(logica.numero) + " false");
	        			logica.bitacora.add(logica.resultadoBitacora);
	        			Logica.escribirBitacora(logica.bitacora);
	        			logica.memorias = true;
	            		logica.binario = false;
	            		logica.primo = true;
	            		logica.cadena = "0";
	            		
	            	}
	        		
	        	}
			}
		});
		
		
		btnData = new JButton("Data");
		btnData.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnData.setBounds(164, 81, 103, 72);
		contentPane.add(btnData);
		btnData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
	                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\GitHub\\MVC-Capas-Calculator\\Modelado_Calculadora_Capas\\src\\capas\\Bitacora.txt"));
	                String line;

	                while ((line = br.readLine()) != null) {
	                    String[] data = line.split(","); // Suponiendo que los datos están separados por comas

	                    // Agregar una nueva fila a la tabla con los datos del archivo
	                    model.addRow(data);
	                    
	                    
	                }

	                br.close();
	            } catch (Exception e1) {
	                e1.printStackTrace();
	            }
				ventanaEmergente.setVisible(true);
			}
		});
		
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn7.setBounds(10, 180, 39, 32);
		contentPane.add(btn7);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
		       	   logica.cadena += 7;
		            txtPantalla.setText(logica.cadena);
		            logica.activado = true;
		            logica.binario = false;
		    		logica.primo = false;
		    		logica.memorias = false;
		            txtPantalla.requestFocus();
		     	
			     	if (logica.resultados == true && !txtPantalla.getText().isEmpty()) {
			     		logica.cadena = "";
			     		txtPantalla.setText("");
			           	 logica.cadena += 7;
			                txtPantalla.setText(logica.cadena);
			                logica.activado = true;
			                logica.binario = false;
			        		 	logica.primo = false;
			        		 	logica.resultados = false;
			        		 	logica.memorias = false;
			                txtPantalla.requestFocus();
			     	}
			}
		});
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn8.setBounds(59, 180, 39, 32);
		contentPane.add(btn8);
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
		       	   logica.cadena += 8;
		            txtPantalla.setText(logica.cadena);
		            logica.activado = true;
		            logica.binario = false;
		    		   logica.primo = false;
		    		   logica.memorias = false;
		            txtPantalla.requestFocus();
		     	
			     	if (logica.resultados == true && !txtPantalla.getText().isEmpty()) {
			     		logica.cadena = "";
			     		txtPantalla.setText("");
			           	 logica.cadena += 8;
			                txtPantalla.setText(logica.cadena);
			                logica.activado = true;
			                logica.binario = false;
			        		 	logica.primo = false;
			        		 	logica.resultados = false;
			        		 	logica.memorias = false;
			                txtPantalla.requestFocus();
			     	}
			}
		});
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn9.setBounds(108, 180, 39, 32);
		contentPane.add(btn9);
		
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
		       	   logica.cadena += 9;
		            txtPantalla.setText(logica.cadena);
		            logica.activado = true;
		            logica.binario = false;
		    		   logica.primo = false;
		            txtPantalla.requestFocus();
		     	
			     	if (logica.resultados == true && !txtPantalla.getText().isEmpty()) {
			     		logica.cadena = "";
			     		txtPantalla.setText("");
			           	 logica.cadena += 9;
			                txtPantalla.setText(logica.cadena);
			                logica.activado = true;
			                logica.binario = false;
			        		 	logica.primo = false;
			        		 	logica.resultados = false;
			        		 	logica.memorias = false;
			                txtPantalla.requestFocus();
			     	}
			}
		});
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn4.setBounds(10, 223, 39, 32);
		contentPane.add(btn4);
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
		       	   logica.cadena += 4;
		            txtPantalla.setText(logica.cadena);
		            logica.activado = true;
		            logica.binario = false;
		    		   logica.primo = false;
		    		   logica.memorias = false;
		            txtPantalla.requestFocus();
		     	
			     	if (logica.resultados == true && !txtPantalla.getText().isEmpty()) {
			     		logica.cadena = "";
			     		txtPantalla.setText("");
			           	 logica.cadena += 4;
			                txtPantalla.setText(logica.cadena);
			                logica.activado = true;
			                logica.binario = false;
			        		 	logica.primo = false;
			        		 	logica.resultados = false;
			        		 	logica.memorias = false;
			                txtPantalla.requestFocus();
			     	}
			}
		});
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn5.setBounds(59, 223, 39, 32);
		contentPane.add(btn5);
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
		       	   logica.cadena += 5;
		            txtPantalla.setText(logica.cadena);
		            logica.activado = true;
		            logica.binario = false;
		    		   logica.primo = false;
		    		   logica.memorias = false;
		            txtPantalla.requestFocus();
		     	
			     	if (logica.resultados == true && !txtPantalla.getText().isEmpty()) {
			     		logica.cadena = "";
			     		txtPantalla.setText("");
			           	 logica.cadena += 5;
			                txtPantalla.setText(logica.cadena);
			                logica.activado = true;
			                logica.binario = false;
			        		 	logica.primo = false;
			        		 	logica.resultados = false;
			        		 	logica.memorias = false;
			                txtPantalla.requestFocus();
			     	}
			}
		});
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn6.setBounds(108, 223, 39, 32);
		contentPane.add(btn6);
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
		       	   logica.cadena += 6;
		            txtPantalla.setText(logica.cadena);
		            logica.activado = true;
		            logica.binario = false;
		    		   logica.primo = false;
		    		   logica.memorias = false;
		            txtPantalla.requestFocus();
		     	
			     	if (logica.resultados == true && !txtPantalla.getText().isEmpty()) {
			     		logica.cadena = "";
			     		txtPantalla.setText("");
			           	 logica.cadena += 6;
			                txtPantalla.setText(logica.cadena);
			                logica.activado = true;
			                logica.binario = false;
			        		 	logica.primo = false;
			        		 	logica.resultados = false;
			        		 	logica.memorias = false;
			                txtPantalla.requestFocus();
			     	}
			}
		});
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn1.setBounds(10, 266, 39, 32);
		contentPane.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
		       	   logica.cadena += 1;
		            txtPantalla.setText(logica.cadena);
		            logica.activado = true;
		            logica.binario = false;
		    		   logica.primo = false;
		    		   logica.memorias = false;
		            txtPantalla.requestFocus();
		     	
			     	if (logica.resultados == true && !txtPantalla.getText().isEmpty()) {
			     		logica.cadena = "";
			     		txtPantalla.setText("");
			           	 logica.cadena += 1;
			                txtPantalla.setText(logica.cadena);
			                logica.activado = true;
			                logica.binario = false;
			        		 	logica.primo = false;
			        		 	logica.resultados = false;
			        		 	logica.memorias = false;
			                txtPantalla.requestFocus();
			     	}
			}
		});
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn2.setBounds(59, 266, 39, 32);
		contentPane.add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
		       	   logica.cadena += 2;
		            txtPantalla.setText(logica.cadena);
		            logica.activado = true;
		            logica.binario = false;
		    		   logica.primo = false;
		    		   logica.memorias = false;
		            txtPantalla.requestFocus();
		     	
			     	if (logica.resultados == true && !txtPantalla.getText().isEmpty()) {
			     		logica.cadena = "";
			     		txtPantalla.setText("");
			           	 logica.cadena += 2;
			                txtPantalla.setText(logica.cadena);
			                logica.activado = true;
			                logica.binario = false;
			        		 	logica.primo = false;
			        		 	logica.resultados = false;
			        		 	logica.memorias = false;
			                txtPantalla.requestFocus();
			     	}
			}
		});
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn3.setBounds(108, 266, 39, 32);
		contentPane.add(btn3);
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
		       	   logica.cadena += 3;
		            txtPantalla.setText(logica.cadena);
		            logica.activado = true;
		            logica.binario = false;
		    		   logica.primo = false;
		    		   logica.memorias = false;
		            txtPantalla.requestFocus();
		     	
			     	if (logica.resultados == true && !txtPantalla.getText().isEmpty()) {
			     		logica.cadena = "";
			     		txtPantalla.setText("");
			           	 logica.cadena += 3;
			                txtPantalla.setText(logica.cadena);
			                logica.activado = true;
			                logica.binario = false;
			        		 	logica.primo = false;
			        		 	logica.resultados = false;
			        		 	logica.memorias = false;
			                txtPantalla.requestFocus();
			     	}
			}
		});
		
		btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnC.setBounds(10, 309, 39, 32);
		contentPane.add(btnC);
		
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("0");
	        	logica.cadena = "0";
	        	logica.activado = false;
	        	logica.punto = false;
	        	logica.binario = false;
	    		logica.primo = false;
	    		logica.resultados = false;
	    		logica.memorias = false;
	        	txtPantalla.requestFocus();
			}
		});
		
		btnCero = new JButton("0");
		btnCero.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCero.setBounds(59, 309, 39, 32);
		contentPane.add(btnCero);
		
		btnCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
	          	   logica.cadena += 0;
	               txtPantalla.setText(logica.cadena);
	               logica.activado = true;
	               logica.binario = false;
	       		   logica.primo = false;
	       		   logica.memorias = false;
	               txtPantalla.requestFocus();
	        	
	        	if (logica.resultados == true && !txtPantalla.getText().isEmpty()) {
	        		logica.cadena = "";
	        		txtPantalla.setText("");
	              	 logica.cadena += 0;
	                   txtPantalla.setText(logica.cadena);
	                   logica.activado = true;
	                   logica.binario = false;
	           		 	logica.primo = false;
	           		 	logica.resultados = false;
	           		 	logica.memorias = false;
	                   txtPantalla.requestFocus();
	        	}
			}
		});
		
		btnPunto = new JButton(".");
		btnPunto.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnPunto.setBounds(108, 309, 39, 32);
		contentPane.add(btnPunto);
		
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!logica.punto == true && !txtPantalla.getText().isEmpty()) {
	        		logica.cadena = logica.cadena + ".";
	                txtPantalla.setText(logica.cadena);
	                logica.punto = true;
	                logica.binario = false;
	        		logica.primo = false;
	        		logica.resultados = false;
	        		logica.memorias = false;
	                txtPantalla.requestFocus();
	        	}
			}
		});
		
		btnDivision = new JButton("/");
		btnDivision.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnDivision.setBounds(164, 180, 39, 32);
		contentPane.add(btnDivision);
		
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(logica.cadena == ""|| logica.cadena == "NaN") {
	        		logica.activado = false;
	        	}
	        	if(logica.activado==true) {
	        		
	        		logica.num1 = Double.parseDouble(logica.cadena);
	        		txtPantalla.setText(logica.cadena + "/");
	        		logica.cadena = "";
	        		logica.oper = "/";
	        		logica.punto = false;
	        		logica.resultados = false;
	        		logica.binario = true;
	        		logica.primo = true;
	        		logica.memorias = true;
	        		txtPantalla.requestFocus();
	        		//logica.activado = false;
	        	}
			}
		});
		
		btnMulti = new JButton("X");
		btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnMulti.setBounds(164, 223, 39, 32);
		contentPane.add(btnMulti);
		
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(logica.cadena == "" || logica.cadena == "NaN") {
	        		logica.activado = false;
	        	}
	        	if(logica.activado==true) {
	        		
	        		logica.num1 = Double.parseDouble(logica.cadena);
	        		txtPantalla.setText(logica.cadena + "*");
	        		logica.cadena = "";
	        		logica.oper = "*";
	        		logica.punto = false;
	        		logica.resultados = false;
	        		logica.binario = true;
	        		logica.primo = true;
	        		logica.memorias = true;
	        		txtPantalla.requestFocus();
	        		//logica.activado = false;
	        	}
			}
		});
		
		btnResta = new JButton("-");
		btnResta.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnResta.setBounds(164, 266, 39, 32);
		contentPane.add(btnResta);
		
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(logica.cadena == ""|| logica.cadena == "NaN") {
	        		logica.activado = false;
	        	}
	        	if(logica.activado==true) {
	        		
	        		logica.num1 = Double.parseDouble(logica.cadena);
	        		txtPantalla.setText(logica.cadena + "-");
	        		logica.cadena = "";
	        		logica.oper = "-";
	        		logica.punto = false;
	        		logica.resultados = false;
	        		logica.binario = true;
	        		logica.primo = true;
	        		logica.memorias = true;
	        		txtPantalla.requestFocus();
	        		//logica.activado = false;
	        	}
			}
		});
		
		btnSuma = new JButton("+");
		btnSuma.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnSuma.setBounds(164, 309, 39, 32);
		contentPane.add(btnSuma);
		
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(logica.cadena == ""|| logica.cadena == "NaN") {
	        		logica.activado = false;
	        	}
	        	if(logica.activado==true) {
	        		
	        		logica.num1 = Double.parseDouble(logica.cadena);
	        		txtPantalla.setText(logica.cadena + "+");
	        		logica.cadena = "";
	        		logica.oper = "+";
	        		logica.punto = false;
	        		logica.resultados = false;
	        		logica.binario = true;
	        		logica.primo = true;
	        		logica.memorias = true;
	        		txtPantalla.requestFocus();
	        		//logica.activado = false;
	        	}
			}
		});
		
		btnIgual = new JButton("=");
		btnIgual.setBounds(213, 266, 55, 75);
		contentPane.add(btnIgual);
		
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(logica.activado == true) {
	        		if(logica.oper != "nula") {
	        			logica.num2 = Double.parseDouble(logica.cadena);
	        			txtPantalla.setText(String.valueOf(logica.operaciones(logica.num1, logica.num2, logica.oper)));
	        			logica.resultado = logica.operaciones(logica.num1, logica.num2, logica.oper);
	        			logica.cadena = (String.valueOf(logica.resultado));
	        			logica.resultadoBitacora = (Double.toString(logica.num1) + logica.oper + Double.toString(logica.num2) + " = " + Double.toString(logica.resultado));
	        			logica.bitacora.add(logica.resultadoBitacora);
	        			Logica.escribirBitacora(logica.bitacora);
	        			logica.oper = "nula";
	        			logica.punto = false;
	        			logica.activado = true;
	        			logica.binario = false;
	            		logica.primo = false;
	            		logica.memorias = false;
	            		logica.resultados = true;
	            		logica.constantes = false;
	        			txtPantalla.requestFocus();
	        			
	        		}
	        		
	        		else {
	        			txtPantalla.setText(logica.cadena);
	        			logica.resultadoBitacora = (logica.cadena + " = " + logica.cadena);
	        			logica.bitacora.add(logica.resultadoBitacora);
	        			Logica.escribirBitacora(logica.bitacora);
	        			logica.resultados = true;
	            		logica.binario = false;
	            		logica.primo = false;
	        			logica.memorias = false;
	        		}
	        	}
				
			}
		});
		
		btnAvg = new JButton("Avg");
		btnAvg.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnAvg.setBounds(213, 180, 54, 32);
		contentPane.add(btnAvg);
		
		btnAvg.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(logica.binario == false && logica.primo == false && logica.cadena != "NaN" && logica.cadena != "") {
	        		txtPantalla.setText(Double.toString(logica.calcularPromedio()));
	            	logica.cadena = Double.toString(logica.calcularPromedio());
	            	logica.memorias = false;
	            	logica.binario = false;
	            	logica.primo = false;
	        	}
			}
		});
		
		btnMemoria = new JButton("M+");
		btnMemoria.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnMemoria.setBounds(213, 223, 54, 32);
		contentPane.add(btnMemoria);
		btnMemoria.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(logica.binario == false && logica.primo == false && logica.cadena != "NaN" && logica.cadena != "" ) {
	        		double parser = Double.parseDouble(logica.cadena);
	            	logica.agregarNumero(parser);
	            	txtPantalla.setText(logica.cadena + " add to memory");
	            	logica.memorias = true;
	            	logica.activado = false;
	            	logica.binario = false;
	            	logica.primo = false;
	            	logica.cadena = "0";
	        	}
			}
		});
		
		
		
		
		
	}
	
	

}
