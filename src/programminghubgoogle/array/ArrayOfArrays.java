package programminghubgoogle.array;

public class ArrayOfArrays {

	public static void main(String[] args) {
		String[][] animals = { { "DanaDog", "WallyDog", "JessieDog", "AlexisDog" },
				{ "BibsCat", "DoodleCat", "MilieCat", "SimonCat" },
				{ "ElyFish", "CloieFish", "GoldieFish", "OscarFish" },
				{ "RoscalMule", "GeorgeMule", "GracieMule", "MontyMule" } };

		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i][0] + " : ");

			for (int j = 1; j < animals[i].length; j++) {
				System.out.print(animals[i][j] + " ");
			}
			System.out.println();
		}
	}
}
