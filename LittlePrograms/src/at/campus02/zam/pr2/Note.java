package at.campus02.zam.pr2;

import java.time.LocalDate;

public class Note {
    public LocalDate date;
    public String title;
    public String description;

    public Note(LocalDate date, String title, String description) {
        this.date = date;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Note{" +
                "date=" + date +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
