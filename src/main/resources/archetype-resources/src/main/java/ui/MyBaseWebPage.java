#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ui;

import me.alb_i986.selenium.tinafw.ui.BaseWebPage;
import me.alb_i986.selenium.tinafw.ui.WebPage;
import org.openqa.selenium.WebDriver;

/**
 * User-defined abstract base page.
 * <p>
 * It is supposed to be the common ancestor of all of the page objects,
 * so that common behaviors, if any, can be shared, e.g. accessing the top nav bar.
 * <p>
 * Think of it as a hook: it may be empty at first, but sooner or later
 * it may turn useful.
 */
public abstract class MyBaseWebPage extends BaseWebPage {

    // you may have a TopNavBar common to any page
    // public TopNavBar topNavBar;

    public MyBaseWebPage(WebDriver driver, WebPage previous) {
        super(driver, previous);
    }
}
