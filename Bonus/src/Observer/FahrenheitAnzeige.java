
package Observer;

	import java.awt.FlowLayout;

	import javax.swing.JFrame;
	import javax.swing.JLabel;

	public class FahrenheitAnzeige implements Anzeige {

		private JLabel tempLabel = new JLabel("Fahrenheit:");
		private JLabel tempValue = new JLabel("UNDEF");
		private JFrame mainWindow = new JFrame("Fahrenheitanzeige");
		private FlowLayout flow = new FlowLayout();
		
		
		public FahrenheitAnzeige()
		{
			mainWindow.getContentPane().setLayout(flow);
			mainWindow.add(tempLabel);
			mainWindow.add(tempValue);
			mainWindow.pack();
			mainWindow.setVisible(true);
			
		}

		

		@Override
		public void aktualisieren(Fuehler fuehler) {
			int temp = Integer.parseInt(fuehler.gibZustand());
			double fahrenheitTemp = temp*1.8 + 32;
			String tempText = Double.valueOf(fahrenheitTemp).toString();
			tempValue.setText(tempText);

		}
		


	}



