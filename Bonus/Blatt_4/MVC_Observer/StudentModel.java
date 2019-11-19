package MVC_Observer;


public class StudentModel implements IModel {
	private String name;
	private String number;
	private int semester=0;

	private IView view;
	
	public StudentModel(String sname, String snumber, int ssemester)
	{
		name = sname;
		number = snumber;
		semester = ssemester;
	}
	
	public void increaseSemester()
	{
		semester++;
		benachrichtigen();
		
	}
	
	public void anmelden(IView view) {
		this.view = view;
	}
	
	@Override
	public void abmelden(IView view) {
		this.view = null;
		
	}

	
	private void benachrichtigen() {
		
		// hier vervollständigen
		view.aktualisieren(this);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	
	public String getSemester()
	{
		return new String(this.semester + "");
		
		// hier vervollständigen
	}

	
}