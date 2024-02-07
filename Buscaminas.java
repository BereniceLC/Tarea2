package programacion;

import javax.swing.*;
import java.awt.*;

public class Buscaminas extends JFrame {
	public Buscaminas() {
		
		setName("Buscaminas");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		JPanel panelito = new JPanel();
		add(panelito);
		panelito.setLayout(new BorderLayout());
		
		JPanel panelP = new JPanel();
		panelP.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(5,5,5,5);
		panelito.add(panelP, BorderLayout.NORTH);
		
		JLabel etiqueta = new JLabel("Nombre jugador:");
		c.gridx = 0;
		c.gridy = 0;
		panelP.add(etiqueta,c);
		JLabel etiqueta2 = new JLabel("Num. minas:");
		c.gridx = 0;
		c.gridy = 1;
		panelP.add(etiqueta2,c);
		
		JTextField name = new JTextField(7);
		c.gridx = 1;
		c.gridy = 0;
		panelP.add(name,c);
		JTextField numero = new JTextField(7);
		c.gridx = 1;
		c.gridy = 1;
		panelP.add(numero,c);
		
		JButton inicio = new JButton("Inicio");
		c.gridx = 2;
		c.gridy = 1;
		panelP.add(inicio,c);
		
		JPanel panelB = new JPanel();
		panelB.setLayout(new GridLayout(7,7));
		panelB.setPreferredSize(new Dimension(50,50));
		panelito.add(panelB, BorderLayout.CENTER);
		for(int i = 0; i<49; i++){
			JButton botoncito = new JButton();
			panelB.add(botoncito);
		}
		JPanel panelS = new JPanel();
		panelito.add(panelS, BorderLayout.SOUTH);
		
		JLabel score = new JLabel("Score: 0");
		panelS.add(score);
		
		
		
		
	}
}
