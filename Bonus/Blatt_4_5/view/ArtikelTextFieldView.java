package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.ArtikelLabelController;
import controller.ArtikelTextFieldController;
import model.ArtikelModelInterface;
import model.KundeModel;
import model.Observer;

public class ArtikelTextFieldView implements Observer{
	
	private ArtikelLabelController a_controller;
	private ArtikelTextFieldController atf_controller;
	private ArtikelModelInterface a_model;
	private JFrame frame;
	private JLabel artikelbezeichnung;
	private JLabel artikelpreis;
	private JTextField artikelpreisEdit;
	private JButton inWarenkorbButton;
	private JButton preisAendern;
	
	public ArtikelTextFieldView(ArtikelModelInterface artikelModelInterface, KundeModel k_model){
		a_model = artikelModelInterface;
		a_model.register(this);
		a_controller = new ArtikelLabelController(artikelModelInterface, this, k_model);
		//atf_controller = new ArtikelTextFieldController(atf_controller);
		
		createComponents();
	}
	
	public void createComponents(){
		
		frame = new JFrame("Artikel");
		
		artikelbezeichnung = new JLabel("Bezeichnung: " + a_model.getBezeichnung());
		artikelpreis = new JLabel("Preis: " + a_model.getPreis() + "€");
		artikelpreisEdit = new JTextField("Neuer Preis: ");
		preisAendern = new JButton ("Preis ändern");
		preisAendern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atf_controller.setPreis(Integer.parseInt(artikelpreisEdit.getText()));
			}
			
		});
		inWarenkorbButton = new JButton("Warenkorb hinzufügen");
		inWarenkorbButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				a_controller.artikelZuWarenkorb();
			}
		});
		
		frame.setLayout(new GridLayout(3,1));
		frame.add(artikelbezeichnung);
		frame.add(artikelpreis);
		frame.add(inWarenkorbButton);
		frame.add(artikelpreisEdit);
		frame.add(preisAendern);
		
		frame.setSize(300, 150);
		
		frame.setVisible(true);

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
