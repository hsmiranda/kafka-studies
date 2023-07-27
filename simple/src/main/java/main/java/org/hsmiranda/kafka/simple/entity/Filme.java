package main.java.org.hsmiranda.kafka.simple.entity;

public class Filme {
    
    private String title;
    private Integer year;


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" +
            " title='" + getTitle() + "'" +
            ", year='" + getYear() + "'" +
            "}";
    }
    
}
