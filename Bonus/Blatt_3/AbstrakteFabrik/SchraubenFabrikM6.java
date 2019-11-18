package AbstrakteFabrik;

public class SchraubenFabrikM6 implements IAbstrakteFabrik {

	public ISchraube erzeugeSchraube() {
		
		return new SchraubeM6();
	}

	public IMutter erzeugeMutter() {
		
		return new MutterM6();
	}

}
