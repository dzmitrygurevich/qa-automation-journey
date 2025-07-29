import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
        @Test // 1. Это аннотация TestNG, которая говорит: "этот метод - тест, его нужно запустить"
        public void helloTest() {
            // 2. Эта строчка автоматически скачает и настроит ChromeDriver для тебя
            WebDriverManager.chromedriver().setup();

            // 3. Создаем экземпляр браузера Chrome
            WebDriver driver = new ChromeDriver();

            // 4. Открываем сайт google.com в браузере
            driver.get("https://google.com");

            // 5. Полностью закрываем браузер и завершаем сессию
            driver.quit();
        }
    }

