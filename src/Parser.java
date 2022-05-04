
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Scanner;
//  # заголовки <h1>
//  * курсив <em></em>
// ** жирный <strong></strong>
// *** жирный курсив <strong><em></em></strong>
//  > цитата >> глубокая цитата  <blockquote></blockquote>
// [^1] примечания
// список -,-,- или +,+,+
//   [пример](http://example.com/ "Необязательная подсказка")
public class Parser{
    public static void main(String[] args) throws IOException {
        //Path MarkFile = Path.of("C://Users//oleg//Documents//Markdown");
        //String str = Files.readString(MarkFile);
        String str="#жопа";
        String  s;
        header html = new header(str);
        System.out.println( "    eeeeeeeeee");
        s = header.htmlhstr("#жопа");
        System.out.println(s );

    }
}