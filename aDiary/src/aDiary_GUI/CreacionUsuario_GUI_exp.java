package aDiary_GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import aDiary.CreacionUsuario;
import aDiary.Propietario;


public class CreacionUsuario_GUI_exp extends JFrame implements ActionListener {

	private JButton guardarUsuarioButton;
	private JLabel contraseñaLB;
	private JLabel verificarContraseñaLB;
	private JLabel usuarioLB;
	private JPasswordField contraseñaTF;
	private JPasswordField verificarContraseñaTF;
	private JTextField usuarioTF;
	
	public CreacionUsuario_GUI_exp(String title) {
		super(title);
        
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        elementSize();
        addWindow();
        
        this.guardarUsuarioButton.addActionListener(this);
	}
	
	private void initComponents() {
		this.guardarUsuarioButton = new JButton("Crear Usuario");
		this.contraseñaLB = new JLabel("Contraseña:");
		this.verificarContraseñaLB = new JLabel("Confirmar Contraseña:");
		this.usuarioLB = new JLabel("Nombre de usuario:");
		this.contraseñaTF = new JPasswordField();
		this.verificarContraseñaTF = new JPasswordField();
		this.usuarioTF = new JTextField();
	}
	
	private void elementSize() {
		this.setSize(260, 350);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        this.guardarUsuarioButton.setBounds(50, 260, 150, 35);
        this.usuarioLB.setBounds(50, 20, 150, 25);
        this.usuarioTF.setBounds(50, 60, 150, 25);
        this.contraseñaLB.setBounds(50, 100, 150, 25);
        this.contraseñaTF.setBounds(50, 140, 150, 25);
        this.verificarContraseñaLB.setBounds(50, 180, 150, 25);
        this.verificarContraseñaTF.setBounds(50, 220, 150, 25);
	}
	
	private void addWindow() {
		this.add(this.guardarUsuarioButton);
		this.add(this.contraseñaLB);
		this.add(this.verificarContraseñaLB);
		this.add(this.usuarioLB);
		this.add(this.contraseñaTF);
		this.add(this.verificarContraseñaTF);
		this.add(this.usuarioTF);
		this.add(new JLabel());
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == this.guardarUsuarioButton) {
			CreacionUsuario creacion = new CreacionUsuario();
			creacion.setContrasenaUsrNuevo(new String(this.contraseñaTF.getPassword()));
			creacion.setNombreUsrNuevo(this.usuarioTF.getText());
			creacion.setContraseñaParentalUsrNuevo("default");
			creacion.setPerfilNuevo("admin-" + this.usuarioTF.getText());
			Propietario usr = creacion.crearUsuario(new String(this.verificarContraseñaTF.getPassword()));
			if(usr != null) {
				JOptionPane.showMessageDialog(this, "Operación realizada con exito, presione 'OK' o cierre esta ventana para entrar en la aplicación");
				creacion.guardarUsuario(usr);
				MenuPrincipal_GUI menu = new MenuPrincipal_GUI(usr.getNombre(),"Menu");
				menu.setUsrActivo(usr);
				menu.initSearchMisiones();
				menu.setVisible(true);
				this.dispose();
				
			}else {
				JOptionPane.showMessageDialog(this, "Verificacion de contraseñas incorrect, intente nuevamente");
			}
			
			
			
		}
		
	}

}
