package PersistenceAbstract_Que6;

public class ClientMain {

	public static void main(String[] args) {
		Persistence fp=new FilePersistence();
		fp.persist();
		Persistence dp=new DataPersistence();
		dp.persist();

	}

}
