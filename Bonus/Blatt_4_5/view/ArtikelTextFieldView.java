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

public class ArtikelTextFieldView implements Observer {

	private ArtikelTextFieldController a_controller;
	private ArtikelModelInterface a_model;
	private JFrame frame;
	private JLabel artikelbezeichnung;
	private JLabel artikelpreis;
	private JTextField artikelpreisEdit;
	private JButton preisAendernBtn;

	public ArtikelTextFieldView(ArtikelModelInterface artikelModelInterface) {
		a_model = artikelModelInterface;
		a_model.register(this);
		a_controller = new ArtikelTextFieldController(artikelModelInterface, this);
		createComponents();
	}

	public void createComponents() {

		frame = new JFrame("Artikel");

		artikelbezeichnung = new JLabel("Bezeichnung: " + a_model.getBezeichnung());
		artikelpreis = new JLabel("Preis: " + a_model.getPreis() + "€");

		preisAendernBtn = new JButton("Preis ändern");
		preisAendernBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a_controller.setPreis(Double.valueOf(artikelpreisEdit.getText()));
			}

		});

		frame.setLayout(new GridLayout(3, 1));
		frame.add(artikelbezeichnung);
		frame.add(artikelpreis);
		artikelpreisEdit = new JTextField();
		artikelpreisEdit.setColumns(10);
		frame.add(artikelpreisEdit);
		frame.add(preisAendernBtn);

		frame.setSize(300, 150);

		frame.setVisible(true);

	}

	@Override
	public void update() {
		artikelpreis.setText("Preis: " + a_model.getPreis() + "€");
		artikelbezeichnung.setText("Bezeichnung: " + a_model.getBezeichnung());
		frame.setVisible(true);

	}

}
