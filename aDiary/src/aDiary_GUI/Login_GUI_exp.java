package aDiary_GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import aDiary.Login;
import aDiary.Propietario;
import aDiary_data.ManejoDatos;

public class Login_GUI_exp extends JFrame implements ActionListener{

	private JButton ingresoButton;
	private JButton creacionUsuarioButton;
    private JTextField nombreUsuarioTF;
    private JPasswordField contrase�aTF;
    private JLabel nombreUsuarioLabel;
    private JLabel contrase�aLabel;
    
    public Login_GUI_exp(String title){
        super(title);
        
        ManejoDatos init = new ManejoDatos();
        init.init();
        
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        elementSize();
        addWindow();
        
        this.ingresoButton.addActionListener(this);
        this.creacionUsuarioButton.addActionListener(this);
    }
    
    public void initComponents(){
        this.contrase�aLabel = new JLabel("Contrase�a");
        this.nombreUsuarioLabel = new JLabel("Usuario");
        this.nombreUsuarioTF = new JTextField("");
        this.contrase�aTF = new JPasswordField("");
        this.ingresoButton = new JButton("INGRESAR");
        this.creacionUsuarioButton = new JButton("CREAR CUENTA");
    }
    
    public void elementSize(){
    	this.setSize(260, 350);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        this.nombreUsuarioLabel.setBounds(50, 30, 150, 25);
        this.nombreUsuarioTF.setBounds(50, 60, 150, 25);
        this.contrase�aLabel.setBounds(50, 100, 150, 25);
        this.contrase�aTF.setBounds(50, 130, 150, 25);
        this.ingresoButton.setBounds(50, 200, 150, 35);
        this.creacionUsuarioButton.setBounds(50, 250, 150, 35);
    }
    
    public void addWindow(){
        this.add(this.nombreUsuarioLabel);
        this.add(this.nombreUsuarioTF);
        this.add(this.contrase�aLabel);
        this.add(this.contrase�aTF);
        this.add(this.ingresoButton);
        this.add(this.creacionUsuarioButton);
        this.add(new JLabel());
    }

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource() == this.ingresoButton) {
			Login login = new Login();
			login.setNombreIngresado(this.nombreUsuarioTF.getText());
			String password = new String(this.contrase�aTF.getPassword());
			login.setContrasenaIngresada(password);
			if(login.validarLogin()) {
				ManejoDatos manejo = new ManejoDatos();
				Propietario usr = manejo.creacionPropietario(login.getNombreIngresado(), login.getContrasenaIngresada());
				MenuPrincipal_GUI menu = new MenuPrincipal_GUI(usr.getNombre(), "Menu");
				menu.setUsrActivo(usr);
				menu.initSearchMisiones();
				menu.setVisible(true);
				this.dispose();
			}else {
				JOptionPane.showMessageDialog(this, "Usuario o Contrase�a erroneos");
			}
		}else if(ae.getSource() == this.creacionUsuarioButton) {
			CreacionUsuario_GUI_exp creacionUsr= new CreacionUsuario_GUI_exp("Crear Usuario");
			creacionUsr.setVisible(true);
			this.dispose();
		}
	}
    
}
