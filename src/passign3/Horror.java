package passign3;

class Horror extends Movie implements Rateable {

    private int numOfDeaths;

    public Horror() {

    }

    public Horror(String title) {
        setTitle(title);
    }

    public Horror(String title, int releaseYear) {
        setTitle(title);
        setReleaseYear(releaseYear);
    }

    public Horror(String title, int releaseYear, String genre, int numOfDeaths) {
        setTitle(title);
        setReleaseYear(releaseYear);
        setGenre(genre);
        setNumOfDeaths(numOfDeaths);
    }

    @Override
    public void vote(int numVotes, int voteScore) {
        setNumVotes(numVotes);
        setVoteScore(voteScore);
    }

    @Override
    public String getInfo() {

        return getTitle() + ", " + getGenre() + ", " + getReleaseYear() + " (" + getRating()
                + "): " + getNumOfDeaths() + " deaths";
    }

    public int getNumOfDeaths() {
        return numOfDeaths;
    }

    public void setNumOfDeaths(int numOfDeaths) {
        this.numOfDeaths = numOfDeaths;
    }
}
