import ru.netology.post.FormDate;
import ru.netology.post.Post;

public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        post.name = "Семён";
        post.patronymic = "Семёныч";
        post.surname = "Горбунков";
        post.phone = "+7 (999) 999-99-99";
        post.passport = "4444 № 44444444";
        post.subscription = String.valueOf(true);

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1969;


    }
}
