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
     Object term344882;
     Object term344883;

    public Board_8_mouseClicked_3119695412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344882 = newInstance(Class.forName("core.Board$8"));
        setField(term344882, term344882.getClass(), "this$0", null);
        term344883 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term344896 = (byte[]) newByteArray(9);
        Object term344908 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term344909 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term344910 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term344911 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term344912 = (Object[]) newArray("java.security.Principal", 9);
        Object term344917 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term344927 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term344883, term344883.getClass(), "x", 1068101842);
        setIntField(term344883, term344883.getClass(), "y", 1060522715);
        setIntField(term344883, term344883.getClass(), "xAbs", -451590147);
        setIntField(term344883, term344883.getClass(), "yAbs", -537090894);
        setIntField(term344883, term344883.getClass(), "clickCount", 105089682);
        setBooleanField(term344883, term344883.getClass(), "causedByTouchEvent", false);
        setIntField(term344883, term344883.getClass(), "button", 1304790955);
        setBooleanField(term344883, term344883.getClass(), "popupTrigger", false);
        setBooleanField(term344883, term344883.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term344883, term344883.getClass(), "when", -7983954942068142191L);
        setIntField(term344883, term344883.getClass(), "modifiers", -1412824084);
        setBooleanField(term344883, term344883.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term344896, 0, (byte) -70);
        setByteElement(term344896, 1, (byte) 84);
        setByteElement(term344896, 2, (byte) 114);
        setByteElement(term344896, 3, (byte) 60);
        setByteElement(term344896, 4, (byte) -20);
        setByteElement(term344896, 5, (byte) 100);
        setByteElement(term344896, 6, (byte) -41);
        setByteElement(term344896, 7, (byte) -70);
        setByteElement(term344896, 8, (byte) -5);
        setField(term344883, term344883.getClass(), "bdata", term344896);
        setIntField(term344883, term344883.getClass(), "id", 659034364);
        setBooleanField(term344883, term344883.getClass(), "consumed", false);
        setField(term344911, term344911.getClass(), "location", null);
        setField(term344911, term344911.getClass(), "signers", null);
        setField(term344911, term344911.getClass(), "certs", null);
        setField(term344911, term344911.getClass(), "sp", null);
        setField(term344911, term344911.getClass(), "factory", null);
        setField(term344911, term344911.getClass(), "locationNoFragString", null);
        setField(term344910, term344910.getClass(), "codesource", term344911);
        setField(term344910, term344910.getClass(), "classloader", null);
        setField(term344910, term344910.getClass(), "principals", term344912);
        setField(term344910, term344910.getClass(), "permissions", null);
        setBooleanField(term344910, term344910.getClass(), "hasAllPerm", false);
        setBooleanField(term344910, term344910.getClass(), "staticPermissions", false);
        setField(term344910, term344910.getClass(), "key", null);
        setElement(term344909, 0, term344910);
        setField(term344908, term344908.getClass(), "context", term344909);
        setBooleanField(term344908, term344908.getClass(), "isPrivileged", true);
        setBooleanField(term344908, term344908.getClass(), "isAuthorized", true);
        setField(term344917, term344917.getClass(), "context", null);
        setBooleanField(term344917, term344917.getClass(), "isPrivileged", false);
        setBooleanField(term344917, term344917.getClass(), "isAuthorized", false);
        setField(term344917, term344917.getClass(), "privilegedContext", null);
        setField(term344917, term344917.getClass(), "combiner", null);
        setField(term344917, term344917.getClass(), "permissions", null);
        setField(term344917, term344917.getClass(), "parent", null);
        setBooleanField(term344917, term344917.getClass(), "isWrapped", false);
        setBooleanField(term344917, term344917.getClass(), "isLimited", false);
        setField(term344917, term344917.getClass(), "limitedContext", null);
        setField(term344908, term344908.getClass(), "privilegedContext", term344917);
        setField(term344908, term344908.getClass(), "combiner", null);
        setField(term344908, term344908.getClass(), "permissions", null);
        setField(term344908, term344908.getClass(), "parent", null);
        setBooleanField(term344908, term344908.getClass(), "isWrapped", false);
        setBooleanField(term344908, term344908.getClass(), "isLimited", false);
        setField(term344908, term344908.getClass(), "limitedContext", null);
        setField(term344883, term344883.getClass(), "acc", term344908);
        setBooleanField(term344883, term344883.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term344883, term344883.getClass(), "isPosted", false);
        setBooleanField(term344883, term344883.getClass(), "isSystemGenerated", false);
        setField(term344883, term344883.getClass(), "source", term344927);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$8");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term344883;
        callMethod(klass, "mouseClicked", argTypes, term344882, args);
    }

};


