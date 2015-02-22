#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.tasks;

import ${package}.ui.MyLoginPage;
import me.alb_i986.selenium.tinafw.tasks.ImLoggedInBase;
import me.alb_i986.selenium.tinafw.ui.LoginPage;

public class ImLoggedIn extends ImLoggedInBase {

	@Override
    @SuppressWarnings("unchecked")
    protected <P extends LoginPage<?>> Class<P> loginPageClass() {
        return (Class<P>) MyLoginPage.class;
    }
}
