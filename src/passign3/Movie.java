package passign3;

abstract class Movie {

    private String title;
    private String genre;
    private int releaseYear;
    private double numVotes;
    private double voteScore;

    protected Movie() {

    }

    protected Movie(String title) {
        this.title = title;
    }

    protected Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    protected Movie(String title, int releaseYear, String genre) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public abstract String getInfo();

    public double getRating() {
        double variable;
        double cast;
        if (numVotes == 0) {
            return -1;
        } else {
            variable = Math.round((voteScore / numVotes * 100) * 10) / 100;
            return variable / 10;
        }
    }

    @Override
    public String toString() {
        return title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getNumVotes() {
        return numVotes;
    }

    public void setNumVotes(double numVotes) {
        this.numVotes = numVotes;
    }

    public double getVoteScore() {
        return voteScore;
    }

    public void setVoteScore(double voteScore) {
        this.voteScore = voteScore;
    }

}
