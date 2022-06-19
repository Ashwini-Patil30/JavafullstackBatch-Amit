package PersistenceAbstract_Que6;

public abstract class Persistence {
	abstract void persist();
	}

	class FilePersistence extends Persistence{
		void persist() {
		System.out.println("this data is from FilePersistence");
	}
	}
	
	class DataPersistence extends Persistence{
		void persist() {
		System.out.println("this data is from DataPersistence");
	}
}
