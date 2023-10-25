package mvc;

import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modelo modelo = new Modelo();
					Vista vista = new Vista();
					Controlador controlador = new Controlador(vista, modelo);
					controlador.Inicio();
					vista.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
       
    }

}
