import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonValue;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class Test {

    public static void main(String[] args) {
        try {
            System.out.println("Hello world!");
            String file = FileUtils.readFileToString(new File("/tmp/sample"), Charsets.toCharset("UTF-8"));
            JsonValue value = Json.parse(file);
            System.out.println(value.toString());
        } catch (Exception e) {
            System.out.println(String.format("Oh no! Something went wrong: %s\n", e.getMessage()));
        }
    }
}
