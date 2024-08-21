package pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    public SelenideElement enterUsername() {
        return $x("//input[@placeholder='Username']");
    }

    public SelenideElement enterPassword() {
        return $x("//input[@placeholder='Password']");
    }

    public SelenideElement loginButton() {
        return $x("//button[text()=' Login ']");
    }

    public SelenideElement goToDashboard() {
        return $x("//h6[text()='Dashboard']");
    }

    public SelenideElement errorMessage1() {
        return $x("//span[text()='Required']");
    }
    public SelenideElement errorMessage2() {
        return $x("//p[text()='Invalid credentials']");
    }

}
