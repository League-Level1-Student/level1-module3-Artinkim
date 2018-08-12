public class NetflixRunner {
	public static void main(String[] args) {
		Movie m1 = new Movie("red", 6);
		Movie m2 = new Movie("james bond", 8);
		Movie m3 = new Movie("mission imposible", 10);
		Movie m4 = new Movie("Ferris bueller's day off", 9);
		Movie m5 = new Movie("the room", 4);
		m3.getTicketPrice();
		NetflixQueue n = new NetflixQueue();
		n.addMovie(m1);
		n.addMovie(m2);
		n.addMovie(m3);
		n.addMovie(m4);
		n.addMovie(m5);
		System.out.println(n.movies);
		System.out.println("The best movie is" + n.getBestMovie());
		System.out.println("The second best movie is" + n.getMovie(1));

	}
}
