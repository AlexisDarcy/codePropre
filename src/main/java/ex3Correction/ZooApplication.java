package ex3Correction;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", Comportement.HERBIVORE, Type.MAMMIFERE));
		zoo.addAnimal(new Animal("Zèbre", Comportement.HERBIVORE, Type.MAMMIFERE));
		zoo.addAnimal(new Animal("Lion", Comportement.CARNIVORE, Type.MAMMIFERE));
		zoo.addAnimal(new Animal("Panthère", Comportement.CARNIVORE, Type.MAMMIFERE));
		zoo.addAnimal(new Animal("Requin blanc", Comportement.CARNIVORE, Type.POISSON));
		zoo.addAnimal(new Animal("Truite dorée", Comportement.HERBIVORE, Type.POISSON));
		zoo.addAnimal(new Animal("Boa constrictor", Comportement.CARNIVORE, Type.REPTILE ));
		zoo.addAnimal(new Animal("Python", Comportement.CARNIVORE, Type.REPTILE ));
		
		zoo.afficherListeAnimaux();
		
		for(Zone zone : zoo.getListZone()){
			System.out.println("________________________" + zone.getClass().getSimpleName() + "________________________");
			System.out.println("Nombre d'animaux : " + zone.compterAnimaux());
			System.out.println("Nourriture : " + zone.calculerKgsNourritureParJour() + " Kg");
			zone.afficherListeAnimaux();
		}
	}

}
