#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ui;

import me.alb_i986.selenium.tinafw.ui.WebPage;
import org.openqa.selenium.WebDriver;

public class MyHomePage extends MyBaseWebPage {

    public MyHomePage(WebDriver driver, WebPage previous) {
        super(driver, previous);
    }
}
