/* DO NOT MODIFY THE CONTENTS OF THIS FILE */
// This is NOT the file on which you have to work
/* DO NOT MODIFY THE CONTENTS OF THIS FILE */

package endOfTerm;

public class TestData {

	private static String[] names1 = { "Alemany Alceste, Arnau", "Bonila Bonamusa, Bibiana", "Canilla Closa, Carles",
			"Delhort Dalmau, Diana", "Espert Eroles, Eduard", "Fonoll Famia, Fatima", "Gomis Galet, Gerard",
			"Herrera Huertas, Helena", "Iglesia Ibarra, Ignasi", "Juarez Jurado, Judit" };

	private static String[] names2 = { "Alos Arenes, Anna", "Bertran Ballo, Bernat", "Comas Cano, Cristina",
			"Deulofeu Dones, Didac", "Espriu Egea, Emilia", "Font Fuster, Ferran", "Gallego Gomis, Gina",
			"Herrera Huertas, Hector", "Illana Ingles, Irina", };

	private static String[] names3 = { "Lemos Ledesma, Lluc ", "Mollo Merodio, Marta", "Nafria Nonell, Norbert",
			"Peris Perlasca, Pamela", "Quintana Quiroga, Quirze", };

	private static String[] subjects1 = { "Algebra", "Calculus", "Programming", "Physics", "Computers" };

	private static String[] subjects2 = { "Algebra", "Calculus", "Programming", "Physics", "Computers", "Chemistry " };

	private static String[] subjects3 = { "Statistics", "Databases", "English", };

	private static double[][] marks1 = { { 4, 3, 2, 1, 3.5 }, { 5.5, 4, 6, 6, 8 }, { 3, 6, 5, 5.5, 3 },
			{ 8, 7.5, 9, 9.5, 9 }, { 7, 5.5, 5, 8, 8.9 }, { 6.3, 2, 3.5, 7, 5.5 }, { 2, 7, 3, 5, 4 },
			{ 1.5, 4, 6, 6, 8 }, { 6, 3, 6, 7, 5 }, { 5, 7, 7, 5.5, 8 } };

	private static double[][] marks2 = { { 5, 6.5, 7, 8, 9.5, 3 }, { 2, 1.5, 4, 5, 6, 7 }, { 4.5, 2, 2.5, 6, 1, 5 },
			{ 6, 6, 6, 7, 4, 7 }, { 3, 5, 8, 8, 2, 7 }, { 9, 9.5, 8, 8, 10, 9.5 }, { 7, 6, 5, 4, 1.5, 2 },
			{ 3, 9.5, 8, 7, 6.5, 5 }, { 4, 4, 3, 6, 8, 8 } };

	private static double[][] marks3 = { { 3, 7.5, 4.5 }, { 8, 6, 4 }, { 1, 5, 3 }, { 3, 7, 2 }, { 9, 8.5, 3.5 }, };

	public static String[] getStudents(int gn) {
		switch (gn) {
		case 1:
			return names1;
		case 2:
			return names2;
		case 3:
		default:
			return names3;
		}
	}

	public static String[] getSubjects(int gn) {
		switch (gn) {
		case 1:
			return subjects1;
		case 2:
			return subjects2;
		case 3:
		default:
			return subjects3;
		}
	}
	
	public static double[][] getMarks(int gn) {
		switch (gn) {
		case 1:
			return marks1;
		case 2:
			return marks2;
		case 3:
		default:
			return marks3;
		}
	}

} // TestData utility class ends here