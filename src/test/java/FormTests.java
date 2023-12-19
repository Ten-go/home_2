import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FormTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void RegistrationFormTests() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        $("#firstName").setValue("Tengiz");
        $("#lastName").setValue("Usupov");
        $("#userEmail").setValue("usupov.ten@gmail.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("8999783445");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").click();
        $(byValue("1999")).click();
        $(".react-datepicker__month-select").selectOption("February");
        $("[aria-label='Choose Friday, February 12th, 1999']").click();
        $("#subjectsInput").val("Math").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("[for='hobbies-checkbox-3']").click();
        $("#uploadPicture").uploadFromClasspath("img/image.png");
        $("#currentAddress").setValue("Belyaeva 16 str.");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").pressEnter();

        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(
                text("Tengiz Usupov"),
                text("usupov.ten@gmail.com"),
                text("Male"),
                text("8999783445"),
                text("12 February,1999"),
                text("Math"),
                text("Sports, Music"),
                text("image.png"),
                text("Belyaeva 16 str."),
                text("NCR Delhi"));

    }
}
