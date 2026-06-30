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
     Object term344876;
     Object term344877;

    public Board_8_mouseClicked_3119695412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344876 = newInstance(Class.forName("core.Board$8"));
        setField(term344876, term344876.getClass(), "this$0", null);
        term344877 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term344890 = (byte[]) newByteArray(9);
        Object term344902 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term344903 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term344904 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term344905 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term344906 = (Object[]) newArray("java.security.Principal", 9);
        Object term344911 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term344921 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term344877, term344877.getClass(), "x", 1068101842);
        setIntField(term344877, term344877.getClass(), "y", 1060522715);
        setIntField(term344877, term344877.getClass(), "xAbs", -451590147);
        setIntField(term344877, term344877.getClass(), "yAbs", -537090894);
        setIntField(term344877, term344877.getClass(), "clickCount", 105089682);
        setBooleanField(term344877, term344877.getClass(), "causedByTouchEvent", false);
        setIntField(term344877, term344877.getClass(), "button", 1304790955);
        setBooleanField(term344877, term344877.getClass(), "popupTrigger", false);
        setBooleanField(term344877, term344877.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term344877, term344877.getClass(), "when", -7983954942068142191L);
        setIntField(term344877, term344877.getClass(), "modifiers", -1412824084);
        setBooleanField(term344877, term344877.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term344890, 0, (byte) -70);
        setByteElement(term344890, 1, (byte) 84);
        setByteElement(term344890, 2, (byte) 114);
        setByteElement(term344890, 3, (byte) 60);
        setByteElement(term344890, 4, (byte) -20);
        setByteElement(term344890, 5, (byte) 100);
        setByteElement(term344890, 6, (byte) -41);
        setByteElement(term344890, 7, (byte) -70);
        setByteElement(term344890, 8, (byte) -5);
        setField(term344877, term344877.getClass(), "bdata", term344890);
        setIntField(term344877, term344877.getClass(), "id", 659034364);
        setBooleanField(term344877, term344877.getClass(), "consumed", false);
        setField(term344905, term344905.getClass(), "location", null);
        setField(term344905, term344905.getClass(), "signers", null);
        setField(term344905, term344905.getClass(), "certs", null);
        setField(term344905, term344905.getClass(), "sp", null);
        setField(term344905, term344905.getClass(), "factory", null);
        setField(term344905, term344905.getClass(), "locationNoFragString", null);
        setField(term344904, term344904.getClass(), "codesource", term344905);
        setField(term344904, term344904.getClass(), "classloader", null);
        setField(term344904, term344904.getClass(), "principals", term344906);
        setField(term344904, term344904.getClass(), "permissions", null);
        setBooleanField(term344904, term344904.getClass(), "hasAllPerm", false);
        setBooleanField(term344904, term344904.getClass(), "staticPermissions", false);
        setField(term344904, term344904.getClass(), "key", null);
        setElement(term344903, 0, term344904);
        setField(term344902, term344902.getClass(), "context", term344903);
        setBooleanField(term344902, term344902.getClass(), "isPrivileged", true);
        setBooleanField(term344902, term344902.getClass(), "isAuthorized", true);
        setField(term344911, term344911.getClass(), "context", null);
        setBooleanField(term344911, term344911.getClass(), "isPrivileged", false);
        setBooleanField(term344911, term344911.getClass(), "isAuthorized", false);
        setField(term344911, term344911.getClass(), "privilegedContext", null);
        setField(term344911, term344911.getClass(), "combiner", null);
        setField(term344911, term344911.getClass(), "permissions", null);
        setField(term344911, term344911.getClass(), "parent", null);
        setBooleanField(term344911, term344911.getClass(), "isWrapped", false);
        setBooleanField(term344911, term344911.getClass(), "isLimited", false);
        setField(term344911, term344911.getClass(), "limitedContext", null);
        setField(term344902, term344902.getClass(), "privilegedContext", term344911);
        setField(term344902, term344902.getClass(), "combiner", null);
        setField(term344902, term344902.getClass(), "permissions", null);
        setField(term344902, term344902.getClass(), "parent", null);
        setBooleanField(term344902, term344902.getClass(), "isWrapped", false);
        setBooleanField(term344902, term344902.getClass(), "isLimited", false);
        setField(term344902, term344902.getClass(), "limitedContext", null);
        setField(term344877, term344877.getClass(), "acc", term344902);
        setBooleanField(term344877, term344877.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term344877, term344877.getClass(), "isPosted", false);
        setBooleanField(term344877, term344877.getClass(), "isSystemGenerated", false);
        setField(term344877, term344877.getClass(), "source", term344921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$8");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term344877;
        callMethod(klass, "mouseClicked", argTypes, term344876, args);
    }

};


