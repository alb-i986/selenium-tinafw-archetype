#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ui;

import me.alb_i986.selenium.tinafw.ui.BaseWebPage;
import me.alb_i986.selenium.tinafw.ui.WebPage;
import org.openqa.selenium.WebDriver;

public abstract class MyBaseWebPage extends BaseWebPage {

    public MyBaseWebPage(WebDriver driver, WebPage previous) {
        super(driver, previous);
    }
}
