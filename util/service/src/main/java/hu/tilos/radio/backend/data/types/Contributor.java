package hu.tilos.radio.backend.data.types;

public class Contributor {

    private AuthorSimple author;

    private String nick;

    private Integer id;

    public AuthorSimple getAuthor() {
        return author;
    }

    public void setAuthor(AuthorSimple author) {
        this.author = author;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
