package AbstrakteFabrik;

public class SchraubenFabrikM10 implements IAbstrakteFabrik {

	
	public ISchraube erzeugeSchraube() {
		return new SchraubeM10();
	}

	
	public IMutter erzeugeMutter() {
		return new MutterM10();
	}

}
