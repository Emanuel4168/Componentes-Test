package test;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

import components.*;
import jdataBoxContainer.*;
import jemc_combo.*;

public class AplTest extends JFrame{
	
	private JPanel north,center,south;
	private JEMCCombo estados1,estados2,estados3;
	private JDataBoxContainer dataContainer;
	private JOrderableCombo ordCombo;

	private AplTest() {
		north = new JPanel(new GridLayout(0,1));
		south = new JPanel();
		createNorth();
		createCenter();
		createSouth();
		
		setSize(800,600);
		setLocationRelativeTo(null);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new AplTest();
	}
	
	private void createNorth() {
		estados1 = new JEMCCombo(JEMCCombo.ORIENTACION_HORIZONTAL);
		estados2 = new JEMCCombo(JEMCCombo.ORIENTACION_HORIZONTAL,"Aguascalientes");
		estados3 = new JEMCCombo(JEMCCombo.ORIENTACION_HORIZONTAL,"Aguascalientes","aguascalientes");
		
		north.add(estados1);
		north.add(estados2);
		north.add(estados3);
		add(north,BorderLayout.NORTH);
	}
	
	private void createCenter() {
		dataContainer = new JDataBoxContainer();
		add(dataContainer);
	}
	
	private void createSouth() {
		ordCombo = new JOrderableCombo();
		for (int i = 0; i < 20; i++) {
			ordCombo.addItem(Rutinas.nextNombre(1, Rutinas.nextInt(1,2)));
		}
		ordCombo.setItem("ITEM", 4);
		
		south.add(ordCombo);
		add(south,BorderLayout.SOUTH);
	}

}
