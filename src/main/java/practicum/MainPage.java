package practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{
    public void open(){
        webDriver.get(URL_DESTINATION);
    }

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    //Кнопка "Заказать" которая находится вверху
    private By firstOrderButton = By.xpath("//button[text() = 'Заказать']");
    //Кнопка "Заказать" которая находится внизу страницы
    private By secondOrderButton = By.xpath("//button[1][text() = 'Заказать']");

    //Первая кнопка из списка вопросов
    private By howMuchButtons =
            By.xpath("//div[text() = 'Сколько это стоит? И как оплатить?']");
    //Первый ответ из списка вопросов
    private By howMuchAnswer =
            By.id("accordion__panel-0");
    //Вторая кнопка из списка вопросов
    private By wantSeveralScootersButtons =
            By.xpath("//div[text() = 'Хочу сразу несколько самокатов! Так можно?']");
    //Второй ответ из списка вопросов
    private By wantSeveralScootersAnswer =
            By.id("accordion__panel-1");
    //Третья кнопка из списка вопросов
    private By rentalTimeButtons =
            By.xpath("//div[text() = 'Как рассчитывается время аренды?']");
    //Третий ответ из списка вопросов
    private By rentalTimeAnswer =
            By.id("accordion__panel-2");
    //Четвертая кнопка из списка вопросов
    private By todayOrderButtons =
            By.xpath("//div[text() = 'Можно ли заказать самокат прямо на сегодня?']");
    //Четвертый ответ из списка вопросов
    private By todayOrderAnswer =
            By.id("accordion__panel-3");
    //Пятая  кнопка из списка вопросов
    private By extendAndEarlierButtons =
            By.xpath("//div[text() = 'Можно ли продлить заказ или вернуть самокат раньше?']");
    //Пятый ответ из списка вопросов
    private By extendAndEarlierAnswer =
            By.id("accordion__panel-4");
    //Шестая кнопка из списка впросов
    private By chargingButtons =
            By.xpath("//div[text() = 'Вы привозите зарядку вместе с самокатом?']");
    //Шестой ответ из списка вопросов
    private By chargingAnswer =
            By.id("accordion__panel-5");
    //Седьмая кнопка из списка вопросов
    private By cancellationButtons =
            By.xpath("//div[text() = 'Можно ли отменить заказ?']");
    //Седьмой ответ из списка вопросов
    private By cancellationAnswer =
            By.id("accordion__panel-6");
    //Восьмая кнопка
    private By farAwayButtons =
            By.xpath("//div[text() = 'Я жизу за МКАДом, привезёте?']");
    //Восьмой ответ из списка вопросов
    private By farAwayAnswer =
            By.id("accordion__panel-7");

    public void makeOrderOne() {
        webDriver.findElement(firstOrderButton).click();
    }

    public void makeOrderTwo() {
        webDriver.findElement(secondOrderButton).click();
    }

    public void clickHowMuchButtons(){
        scroll(howMuchButtons);
        webDriver.findElement(howMuchButtons).click();
    }
    public String getHowMuchAnswer() {
        return webDriver.findElement(howMuchAnswer).getText();
    }
    public void clickWantSeveralScootersButtons(){
        scroll(howMuchButtons);
        webDriver.findElement(wantSeveralScootersButtons).click();
    }
    public String getWantSeveralScootersAnswer() {
        return webDriver.findElement(wantSeveralScootersAnswer).getText();
    }
    public void clickRentalTimeButtons(){
        scroll(howMuchButtons);
        webDriver.findElement(rentalTimeButtons).click();
    }
    public String getRentalTimeAnswer() {
        return webDriver.findElement(rentalTimeAnswer).getText();
    }
    public void clickTodayOrderButtons(){
        scroll(howMuchButtons);
        webDriver.findElement(todayOrderButtons).click();
    }
    public String getTodayOrderAnswer() {
        return webDriver.findElement(todayOrderAnswer).getText();
    }
    public void clickExtendAndEarlierButtons(){
        scroll(howMuchButtons);
        webDriver.findElement(extendAndEarlierButtons).click();
    }
    public String getExtendAndEarlierAnswer() {
        return webDriver.findElement(extendAndEarlierAnswer).getText();
    }

    public void clickChargingButtons(){
        scroll(howMuchButtons);
        webDriver.findElement(chargingButtons).click();
    }
    public String getChargingAnswer() {
        return webDriver.findElement(chargingAnswer).getText();
    }

    public void clickCancellationButtons(){
        scroll(howMuchButtons);
        webDriver.findElement(cancellationButtons).click();
    }
    public String getCancellationAnswer() {
        return webDriver.findElement(cancellationAnswer).getText();
    }
    public void clickFarAwayButtons(){
        scroll(howMuchButtons);
        webDriver.findElement(farAwayButtons).click();
    }
    public String getFarAwayButtonsAnswer() {
        return webDriver.findElement(farAwayAnswer).getText();
    }
    public void scroll(By by) {
        WebElement element = webDriver.findElement(by);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }

}