package chistotest.test.currentusersgithubapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemResponse {

    // items - это 4-ая строка API запроса. https://api.github.com/search/users?q=language:java+location:tyumen -> по запросу, в interface (Service.java).
    // Подробнее: Информация о каждом пользователе, содержится в "items". items: [
    //                                                                             { 0-вой пользователь }, 1-ый по запросу
    //                                                                             { 1-ый пользователь },
    //                                                                             { N-ый пользователь },
    //                                                                             {    .......        },
    //                                                                             { конец списка пользователей}.

    @SerializedName("items")
    @Expose
    private List<Item> items;

    // Получение из запроса - всех доступных данных.
    public List<Item> getItems(){
        return items;
    }

    // Для изменения переменной -  items. (обновление данных)
    public void setItems(List<Item> items) {
        this.items = items;
    }
}
