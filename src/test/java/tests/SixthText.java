package tests;

import steps.DocumentEditPageSteps;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

public class SixthText {

    @Story("Шестой тест")//типа папка
    @DisplayName("Поиск в оглавлении 163 Статьи")//название
    @Test
    public void testSixthText() {
        DocumentEditPageSteps objDEPS = new DocumentEditPageSteps();
        objDEPS.clickContents();
        objDEPS.inputTextInSearchBox2("статья 163");
        objDEPS.clickSearchButton();
        objDEPS.clickOnHeader();
    }
}
