#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.config;

import me.alb_i986.selenium.tinafw.config.Config;
import me.alb_i986.selenium.tinafw.config.PropertiesUtils;

/**
 * This class shows how it is possible to add user-defined properties.
 * <p>
 * Defines a static method for each of the user-defined properties,
 * which should rely on {@link Config#getOptionalProperty(String)}
 * or {@link Config#getRequiredProperty(String)}.
 * <p>
 * In this example, we have defined the following additional properties:
 *
 * <pre>
 * my.namespace.username = user
 * my.namespace.password = pass
 * a_multi_value_prop = value1, value2, value3
 * </pre>
 *
 * @see Config
 */
public class MyConfig extends Config {

    public static final String NAMESPACE = "my.namespace";
    private static final String PREFIX = NAMESPACE + ".";

    // property names
    private static final String USERNAME = PREFIX + "username";
    private static final String PASSWORD = PREFIX + "password";
    public static final String MULTI_VALUE_PROP = PREFIX + "a_multi_value_prop";

    public static String getUsername() {
        return getOptionalProperty(USERNAME);
    }

    public static String getPassword() {
        return getOptionalProperty(PASSWORD);
    }

    public static String[] getMultiValueProp() {
        String value = getOptionalProperty(MULTI_VALUE_PROP);
        return (value == null) ? null : PropertiesUtils.split(value);
    }

}
