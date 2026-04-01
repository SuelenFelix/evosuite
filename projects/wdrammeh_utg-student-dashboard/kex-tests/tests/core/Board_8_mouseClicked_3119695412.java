package core;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Board_8_mouseClicked_3119695412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344868;
     Object term344869;

    public Board_8_mouseClicked_3119695412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344868 = newInstance(Class.forName("core.Board$8"));
        setField(term344868, term344868.getClass(), "this$0", null);
        term344869 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term344882 = (byte[]) newByteArray(9);
        Object term344894 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term344895 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term344896 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term344897 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term344898 = (Object[]) newArray("java.security.Principal", 9);
        Object term344903 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term344913 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term344869, term344869.getClass(), "x", 1068101842);
        setIntField(term344869, term344869.getClass(), "y", 1060522715);
        setIntField(term344869, term344869.getClass(), "xAbs", -451590147);
        setIntField(term344869, term344869.getClass(), "yAbs", -537090894);
        setIntField(term344869, term344869.getClass(), "clickCount", 105089682);
        setBooleanField(term344869, term344869.getClass(), "causedByTouchEvent", false);
        setIntField(term344869, term344869.getClass(), "button", 1304790955);
        setBooleanField(term344869, term344869.getClass(), "popupTrigger", false);
        setBooleanField(term344869, term344869.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term344869, term344869.getClass(), "when", -7983954942068142191L);
        setIntField(term344869, term344869.getClass(), "modifiers", -1412824084);
        setBooleanField(term344869, term344869.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term344882, 0, (byte) -70);
        setByteElement(term344882, 1, (byte) 84);
        setByteElement(term344882, 2, (byte) 114);
        setByteElement(term344882, 3, (byte) 60);
        setByteElement(term344882, 4, (byte) -20);
        setByteElement(term344882, 5, (byte) 100);
        setByteElement(term344882, 6, (byte) -41);
        setByteElement(term344882, 7, (byte) -70);
        setByteElement(term344882, 8, (byte) -5);
        setField(term344869, term344869.getClass(), "bdata", term344882);
        setIntField(term344869, term344869.getClass(), "id", 659034364);
        setBooleanField(term344869, term344869.getClass(), "consumed", false);
        setField(term344897, term344897.getClass(), "location", null);
        setField(term344897, term344897.getClass(), "signers", null);
        setField(term344897, term344897.getClass(), "certs", null);
        setField(term344897, term344897.getClass(), "sp", null);
        setField(term344897, term344897.getClass(), "factory", null);
        setField(term344897, term344897.getClass(), "locationNoFragString", null);
        setField(term344896, term344896.getClass(), "codesource", term344897);
        setField(term344896, term344896.getClass(), "classloader", null);
        setField(term344896, term344896.getClass(), "principals", term344898);
        setField(term344896, term344896.getClass(), "permissions", null);
        setBooleanField(term344896, term344896.getClass(), "hasAllPerm", false);
        setBooleanField(term344896, term344896.getClass(), "staticPermissions", false);
        setField(term344896, term344896.getClass(), "key", null);
        setElement(term344895, 0, term344896);
        setField(term344894, term344894.getClass(), "context", term344895);
        setBooleanField(term344894, term344894.getClass(), "isPrivileged", true);
        setBooleanField(term344894, term344894.getClass(), "isAuthorized", true);
        setField(term344903, term344903.getClass(), "context", null);
        setBooleanField(term344903, term344903.getClass(), "isPrivileged", false);
        setBooleanField(term344903, term344903.getClass(), "isAuthorized", false);
        setField(term344903, term344903.getClass(), "privilegedContext", null);
        setField(term344903, term344903.getClass(), "combiner", null);
        setField(term344903, term344903.getClass(), "permissions", null);
        setField(term344903, term344903.getClass(), "parent", null);
        setBooleanField(term344903, term344903.getClass(), "isWrapped", false);
        setBooleanField(term344903, term344903.getClass(), "isLimited", false);
        setField(term344903, term344903.getClass(), "limitedContext", null);
        setField(term344894, term344894.getClass(), "privilegedContext", term344903);
        setField(term344894, term344894.getClass(), "combiner", null);
        setField(term344894, term344894.getClass(), "permissions", null);
        setField(term344894, term344894.getClass(), "parent", null);
        setBooleanField(term344894, term344894.getClass(), "isWrapped", false);
        setBooleanField(term344894, term344894.getClass(), "isLimited", false);
        setField(term344894, term344894.getClass(), "limitedContext", null);
        setField(term344869, term344869.getClass(), "acc", term344894);
        setBooleanField(term344869, term344869.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term344869, term344869.getClass(), "isPosted", false);
        setBooleanField(term344869, term344869.getClass(), "isSystemGenerated", false);
        setField(term344869, term344869.getClass(), "source", term344913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$8");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term344869;
        callMethod(klass, "mouseClicked", argTypes, term344868, args);
    }

};


