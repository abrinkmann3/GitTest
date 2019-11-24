package controller;

import model.ArtikelModel;
import model.ArtikelModelInterface;
import model.KundeModel;
import view.ArtikelLableView;
import view.ArtikelTextFieldView;

public class ArtikelTextFieldController implements ArtikelControllerInterface{

		private ArtikelModel a_model;
		private ArtikelTextFieldView t_view;
		private KundeModel k_model;
		
		public ArtikelTextFieldController (ArtikelModel a_model){
			this.a_model = a_model;
			
		}
		/*
		public void artikelZuWarenkorb(){
			k_model.getWarenkorb().hinzufuegenArtikelZuArtikelliste(a_model);
		}
		
		public void loescheArtikelAusWarenkorb(){
			k_model.getWarenkorb().loescheArtikelAusArtikelliste(a_model);
		}
		*/
		public void setPreis(double preis){
			this.a_model.setPreis(preis);
			this.a_model.notifyObservers();
		}
}