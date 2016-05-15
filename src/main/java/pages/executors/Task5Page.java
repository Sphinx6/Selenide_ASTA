package pages.executors;

import com.codeborne.selenide.SelenideElement;
import pages.locators.Task5Locators;
import util.helpers.RandomStringGenerator;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;

public class Task5Page {

    private List<String> data = new ArrayList<>();
    private String filePath = "src/main/resources/Task5Data.txt";

    public Task5Locators locators;

    public Task5Page(Task5Locators locators){
        this.locators = locators;
    }


    public void generateRandomData(){
        RandomStringGenerator gen = new RandomStringGenerator();
        Random r = new Random();

        for(int i = 0; i < 20; ++i){
            data.add(String.format("%s, %s, %d",
                    gen.getRandomString(10), gen.getRandomString(15), r.nextInt(999999999-100000000)+100000000));
        }
    }

    public void createFile() throws IOException {
        Path file = Paths.get(filePath);
        Files.write(file, data, Charset.forName("UTF-8"));
    }

    public void uploadFile(){
        File f = new File(filePath);
        locators.uploadButton.uploadFile(f);
    }

    public List<String> getUploadedData(){
        List<String> data = new ArrayList<>();
        locators.rows.shouldHaveSize(20);
        for(SelenideElement row : locators.rows){
            data.add(row.text().replace(" ",", "));
        }
        return data;
    }

    public void assertData(List<String> uploadedData){
        for(int i = 0; i < uploadedData.size(); ++i){
            assert data.get(i).equals(uploadedData.get(i)) :
                    String.format("Incorrect data at row %d: %s|%s", i, data.get(i), uploadedData.get(i));
        }
    }
}
