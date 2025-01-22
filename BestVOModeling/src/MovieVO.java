public class MovieVO {
    private String title;
    private String date;
    private String actor;
    private String genre;
    private int runtime;
    private int grade;

    public MovieVO(){}

    public MovieVO(String title, String date, String actor, String genre, int runtime, int grade){
        this.title = title;
        this.date = date;
        this.actor = actor;
        this.genre = genre;
        this.runtime = runtime;
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", actor='" + actor + '\'' +
                ", genre='" + genre + '\'' +
                ", runtime=" + runtime +
                ", grade=" + grade +
                '}';
    }
}
