package chistotest.test.currentusersgithubapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    // Retrofit + json. Из (api - запроса например: https://api.github.com/search/users?q=language:java+location:lagos.
    // Мы выбираем  необходимые нам значения, например: login, id, avatar, followers и т.д...
    // В моём случае - я достаю 3 переменные (login, avatar, html)
public class Item {

    @SerializedName("login")
    @Expose
    private String login;

    @SerializedName("avatar")
    @Expose
    private String avatarUrl;

    @SerializedName("html_url")
    @Expose
    private String htmlUrl;

    public Item(String login, String avatarUrl, String htmlUrl){
        this.login = login;
        this.avatarUrl = avatarUrl;
        this.htmlUrl =htmlUrl;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login) {
            this.login = login;
    }

    public String getAvatarUrl() {
            return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
    }
}