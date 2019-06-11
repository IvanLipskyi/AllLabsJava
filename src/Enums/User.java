package Enums;

public class User {
    private String login;
    private String password;
    private String name;
    private Post post = Post.ANONIM;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User(String login, String password, Post post){
        this.post = post;
        this.password = password;
        this.login = login;
    }
}
