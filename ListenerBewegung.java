

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerBewegung implements ActionListener {
	private DionaRap_Hauptfenster brett;

	public ListenerBewegung(DionaRap_Hauptfenster brett) {
		this.brett=brett;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) { // Auslöser des ActionEvent besorgen
		String befehl = event.getActionCommand();
		System.out.println("Action: "+befehl);
		brett.requestFocus(); // um KeyListener aktiv zu lassen

	}

}
