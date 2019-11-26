package controller;

import model.ArtikelModel;
import model.ArtikelModelInterface;
import model.KundeModel;
import view.ArtikelLableView;
import view.ArtikelTextFieldView;

public class ArtikelTextFieldController implements ArtikelControllerInterface{

		private ArtikelModelInterface a_model;
		private ArtikelTextFieldView t_view;
		
		public ArtikelTextFieldController (ArtikelModelInterface a_model,ArtikelTextFieldView t_view){
			this.a_model = a_model;
			this.t_view = t_view;
		}
	
		public void setPreis(double preis){
			this.a_model.setPreis(preis);
			
		}
}