package ManagerBook_with_BassicMethod;

public class Author {
    private String nameAuthor;
    private Day dayBirth;

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public Day getDayBirth() {
        return dayBirth;
    }

    public void setDayBirth(Day dayBirth) {
        this.dayBirth = dayBirth;
    }

    public Author(String nameAuthor, Day dayBirth) {
        this.nameAuthor = nameAuthor;
        this.dayBirth = dayBirth;
    }
}



