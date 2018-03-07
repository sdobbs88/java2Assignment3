/* Shaun Dobbs
 * CSCI 1302
 * Assignment 3
 * March 2, 2016
 * Purpose : Create various classes that interface with other classes to 
 * give an output of various movies with a voting system for each movie.
 */
package passign3;

class PAssign3 {

    public static void main(String[] args) {

        Movie[] movieList = {
            new Horror("A Nightmare on Elm Street", 1984, "Horror", 4),
            new Horror("Final Destination 5", 2011, "Horror", 94),
            new Horror("Saw", 2004, "Horror", 6),
            new Comedy("Napoleon Dynamite", 2004, "Comedy", false),
            new Comedy("Zoolander 2", 2016, "Comedy", true),
            new Comedy("Uncle Buck", 1989, "Comedy", true)
        };
        movieList[0].setNumVotes(142808);
        movieList[0].setVoteScore(1071060);
        movieList[1].setNumVotes(80741);
        movieList[1].setVoteScore(476371);
        movieList[2].setNumVotes(287362);
        movieList[2].setVoteScore(2212687);
        movieList[3].setNumVotes(156653);
        movieList[3].setVoteScore(1080905);
        movieList[4].setNumVotes(0);
        movieList[4].setVoteScore(0);
        movieList[5].setNumVotes(60657);
        movieList[5].setVoteScore(418533);

        for (int i = 0; i < movieList.length; i++) {
            System.out.println(movieList[i].getInfo());
        }

    }
}
