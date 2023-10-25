package mvc;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.SwingConstants;


public class Vista extends JFrame {

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
	public Vista() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ventanaEmergente = new JFrame("Data");
        ventanaEmergente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ventanaEmergente.setResizable(false);
        ventanaEmergente.setSize(800, 700);
        panel = new JPanel();
        labeldata = new JLabel();
        labeldata.setSize(700, 600);
        panel.add(labeldata);
        ventanaEmergente.add(panel);
        
		
		
		
		txtPantalla = new JTextField();
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPantalla.setEditable(false);
		txtPantalla.setBounds(10, 11, 264, 48);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		btnBinario = new JButton("Binario");
		btnBinario.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnBinario.setBounds(10, 78, 144, 32);
		contentPane.add(btnBinario);
		
		btnPrimo = new JButton("Primo");
		btnPrimo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPrimo.setBounds(10, 121, 144, 32);
		contentPane.add(btnPrimo);
		
		btnData = new JButton("Data");
		btnData.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnData.setBounds(164, 81, 103, 72);
		contentPane.add(btnData);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn7.setBounds(10, 180, 39, 32);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn8.setBounds(59, 180, 39, 32);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn9.setBounds(108, 180, 39, 32);
		contentPane.add(btn9);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn4.setBounds(10, 223, 39, 32);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn5.setBounds(59, 223, 39, 32);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn6.setBounds(108, 223, 39, 32);
		contentPane.add(btn6);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn1.setBounds(10, 266, 39, 32);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn2.setBounds(59, 266, 39, 32);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btn3.setBounds(108, 266, 39, 32);
		contentPane.add(btn3);
		
		btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnC.setBounds(10, 309, 39, 32);
		contentPane.add(btnC);
		
		btnCero = new JButton("0");
		btnCero.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCero.setBounds(59, 309, 39, 32);
		contentPane.add(btnCero);
		
		btnPunto = new JButton(".");
		btnPunto.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnPunto.setBounds(108, 309, 39, 32);
		contentPane.add(btnPunto);
		
		btnDivision = new JButton("/");
		btnDivision.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnDivision.setBounds(164, 180, 39, 32);
		contentPane.add(btnDivision);
		
		btnMulti = new JButton("X");
		btnMulti.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnMulti.setBounds(164, 223, 39, 32);
		contentPane.add(btnMulti);
		
		btnResta = new JButton("-");
		btnResta.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnResta.setBounds(164, 266, 39, 32);
		contentPane.add(btnResta);
		
		btnSuma = new JButton("+");
		btnSuma.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnSuma.setBounds(164, 309, 39, 32);
		contentPane.add(btnSuma);
		
		btnIgual = new JButton("=");
		btnIgual.setBounds(213, 266, 55, 75);
		contentPane.add(btnIgual);
		
		btnAvg = new JButton("Avg");
		btnAvg.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnAvg.setBounds(213, 180, 54, 32);
		contentPane.add(btnAvg);
		
		btnMemoria = new JButton("M+");
		btnMemoria.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnMemoria.setBounds(213, 223, 54, 32);
		contentPane.add(btnMemoria);
		
		
		
	}
}
