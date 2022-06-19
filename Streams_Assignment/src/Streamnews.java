import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class News{
int newsId;
String postedByUser;
String commentByUser;
String comment;

public News(int newsId, String postedByUser, String commentByUser, String comment) {
super();
this.newsId = newsId;
this.postedByUser = postedByUser;
this.commentByUser = commentByUser;
this.comment = comment;
}

public int getNewsId() {
return newsId;
}
public String getPostedByUser() {
return postedByUser;
}
public String getCommentByUser() {
return commentByUser;
}
public String getComment() {
return comment;
}

@Override
public String toString() {
return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
+ ", comment=" + comment + "]";
}
}
public class Streamnews { public static void main(String[] args) {
News News1 = new News(1, "Test1", "User1", " News on budget" );
News News2 = new News(1, "Test1", "User2", "news about socialmedia" );
News News3 = new News(2, "Test2", "User3", "This is budget " );
News News4 = new News(3, "Test3", "User4", "this is related to news" ); 
List<News> newsList = new ArrayList<>();
newsList.add(News1);
newsList.add(News2);
newsList.add(News3);
newsList.add(News4); System.out.println(newsList.stream()
.collect(Collectors.groupingBy(News::getNewsId)).keySet()); } }

