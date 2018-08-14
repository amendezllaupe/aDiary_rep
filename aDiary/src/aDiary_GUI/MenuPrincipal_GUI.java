package aDiary_GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import aDiary.MenuPrincipal;
import aDiary.Propietario;
import aDiary.Recompensa;

public class MenuPrincipal_GUI extends JFrame implements ActionListener{
	
	private MenuPrincipal menu;
	private JButton horarioButton;
	private JButton historialButton;
	private JButton configuracionButton;
	private JButton usuarioButton;
	private JProgressBar progresoMisiones;
	
	private JTextField stringMision;
	
	private JCheckBox checkBox;
	
	private Propietario usrActivo;
	
	
	public MenuPrincipal_GUI(String nombreUsr, String title) {
		super(title);
		initComponents(nombreUsr);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		elementSize();
		addWindow();
		
		this.historialButton.addActionListener(this);
		this.horarioButton.addActionListener(this);
		this.configuracionButton.addActionListener(this);
		this.usuarioButton.addActionListener(this);
		
		this.checkBox.addActionListener(this);
		
	}
	
	public void initComponents(String nombreUsr) {
		this.horarioButton = new JButton("Horario");
		this.historialButton = new JButton("Historial de misiones");
		this.configuracionButton = new JButton("Configuraci�n");
		this.usuarioButton = new JButton(nombreUsr);
		
		this.stringMision = new JTextField();
		this.stringMision.setEditable(false);
		
		this.checkBox = new JCheckBox();
		
	
	}
	
	public void elementSize() {
		this.setSize(800,480);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		this.horarioButton.setBounds(550, 80, 150, 35);
		this.historialButton.setBounds(550, 140, 150, 35);
		this.configuracionButton.setBounds(550, 200, 150, 35);
		this.usuarioButton.setBounds(550, 320, 150, 70);
		
		this.stringMision.setBounds(20, 80, 250, 30);
		this.checkBox.setBounds(280, 80, 20,20);
	}
	
	private void addWindow() {
		this.add(this.historialButton);
		this.add(this.horarioButton);
		this.add(this.configuracionButton);
		this.add(this.usuarioButton);
		this.add(this.stringMision);
		this.add(this.checkBox);
		this.add(new JLabel());
	}


	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource() == this.configuracionButton) {
			Config_GUI config = new Config_GUI("Configurci�n");
			config.setUsrActivo(this.usrActivo);
			config.setVisible(true);
			this.dispose();
		}else if(ae.getSource() == this.checkBox && this.checkBox.isSelected()){
			this.menu.getMisionesDia().getMisiones().get(0).setIsCompleted(true);
			Recompensa recompensa = new Recompensa();
			this.stringMision.setText(this.menu.getMisionesDia().getMisiones().get(0).getMision() + "   " + this.menu.getMisionesDia().getMisiones().get(0).getIsCompleted());
			JOptionPane.showMessageDialog(this,"Su recompensa es: " + recompensa.getRecompensa().get(0));
		}else if(ae.getSource() == this.checkBox && !this.checkBox.isSelected()){
			this.menu.getMisionesDia().getMisiones().get(0).setIsCompleted(false);
			this.stringMision.setText(this.menu.getMisionesDia().getMisiones().get(0).getMision() + "   " + this.menu.getMisionesDia().getMisiones().get(0).getIsCompleted());
		}
	}
	
	public void initSearchMisiones() {
		this.menu = new MenuPrincipal();
		this.menu.setPropietarioActivo(this.usrActivo);
		this.menu.obtenerMisionesDia();
		this.stringMision.setText(this.menu.getMisionesDia().getMisiones().get(0).getMision() +"   " + this.menu.getMisionesDia().getMisiones().get(0).getIsCompleted());
	}

	/**
	 * @return the usrActivo
	 */
	public Propietario getUsrActivo() {
		return usrActivo;
	}

	/**
	 * @param usrActivo the usrActivo to set
	 */
	public void setUsrActivo(Propietario usrActivo) {
		this.usrActivo = usrActivo;
	}

}
