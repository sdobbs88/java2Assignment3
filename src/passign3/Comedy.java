package passign3;

class Comedy extends Movie implements Rateable {

    private boolean hasProfanity;

    public Comedy() {

    }

    public Comedy(String title) {
        setTitle(title);
    }

    public Comedy(String title, int releaseYear) {
        setTitle(title);
        setReleaseYear(releaseYear);
    }

    public Comedy(String title, int releaseYear, String genre, boolean hasProfanity) {
        setTitle(title);
        setReleaseYear(releaseYear);
        setGenre(genre);
        setHasProfanity(hasProfanity);
    }

    @Override
    public String getInfo() {
        String output;
        String profanity;

        if (getHasProfanity()) {
            profanity = "Profanity";
        } else {
            profanity = "No Profanity";
        }

        StringBuilder sb1 = new StringBuilder();

        if (getRating() == -1) {
            sb1.append("No ratings");
        } else {
            sb1.append(getRating());
        }

        output = getTitle() + ", " + getGenre() + ", " + getReleaseYear() + " (" + sb1
                + "): " + profanity;

        return output;
    }

    @Override
    public void vote(int numVotes, int voteScore) {
        setNumVotes(numVotes);
        setVoteScore(voteScore);
    }

    public boolean getHasProfanity() {
        return hasProfanity;
    }

    public void setHasProfanity(boolean hasProfanity) {
        this.hasProfanity = hasProfanity;
    }

}
