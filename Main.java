package org.AFKER.Maps;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame{
	private GoogleAPI google = new GoogleAPI();
	private String location = "»ï¹®µ¿";
	private JLabel GoogleMap;
	public Main() {
		google.DownLoadMap(location);
		GoogleMap = new JLabel(google.getMap(location));
		google.FileDelete(location);
		add(GoogleMap); 
		setTitle("Google Maps");
		setVisible(true);
		pack();
	}

}