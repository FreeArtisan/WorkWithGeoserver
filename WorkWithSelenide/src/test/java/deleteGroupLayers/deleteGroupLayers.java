package test.java.deleteGroupLayers;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.Wait;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.withText;

public class deleteGroupLayers {
    @Test
    void deleteGroupLayer() {
        try{
            open ("https://smart-dev.reinform-int.ru/geoserver/web/");
            $("#username").setValue("admin");
            $("#password").setValue("P@ssw0rd").pressEnter();
            $("[alt = 'Группы слоев']").click();
            $("#filter").setValue("testgroupname").pressEnter();
            $(".selection").click();
            $(".remove-link").click();
            $(".button-group.rightwise").find(withText("ОК")).click();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}