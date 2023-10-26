package capas;

import java.awt.EventQueue;



public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logica logica = new Logica();
					Interfaz interfaz = new Interfaz(logica);
					interfaz.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	
	}

}
