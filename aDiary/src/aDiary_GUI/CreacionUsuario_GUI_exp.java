package aDiary_GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CreacionUsuario_GUI_exp extends JFrame implements ActionListener {

	private JButton guardarUsuarioButton;
	private JLabel contraseņaLB;
	private JLabel verificarContraseņaLB;
	private JLabel usuarioLB;
	private JTextField contraseņaTF;
	private JTextField usuarioTF;
	
	public CreacionUsuario_GUI_exp(String title) {
		super(title);
        
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        elementSize();
        addWindow();
	}
	
	private void initComponents() {
		this.guardarUsuarioButton = new JButton("Crear Usuario");
		//this
	}
	
	private void elementSize() {
		
	}
	
	private void addWindow() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
