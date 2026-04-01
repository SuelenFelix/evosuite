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

public class Board_7_mouseClicked_3119695102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341933;
     Object term341934;

    public Board_7_mouseClicked_3119695102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341933 = newInstance(Class.forName("core.Board$7"));
        setField(term341933, term341933.getClass(), "this$0", null);
        term341934 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term341947 = (byte[]) newByteArray(3);
        Object term341953 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term341954 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term341955 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term341956 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term341957 = (Object[]) newArray("java.security.Principal", 9);
        Object term341960 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term341965 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term341975 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term341934, term341934.getClass(), "x", 630174216);
        setIntField(term341934, term341934.getClass(), "y", -1081282297);
        setIntField(term341934, term341934.getClass(), "xAbs", 1331103887);
        setIntField(term341934, term341934.getClass(), "yAbs", 637911543);
        setIntField(term341934, term341934.getClass(), "clickCount", -779100899);
        setBooleanField(term341934, term341934.getClass(), "causedByTouchEvent", false);
        setIntField(term341934, term341934.getClass(), "button", -1750603840);
        setBooleanField(term341934, term341934.getClass(), "popupTrigger", true);
        setBooleanField(term341934, term341934.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term341934, term341934.getClass(), "when", 7950532649535587877L);
        setIntField(term341934, term341934.getClass(), "modifiers", 2088919651);
        setBooleanField(term341934, term341934.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term341947, 0, (byte) -52);
        setByteElement(term341947, 1, (byte) -33);
        setByteElement(term341947, 2, (byte) 16);
        setField(term341934, term341934.getClass(), "bdata", term341947);
        setIntField(term341934, term341934.getClass(), "id", 949997254);
        setBooleanField(term341934, term341934.getClass(), "consumed", false);
        setField(term341956, term341956.getClass(), "location", null);
        setField(term341956, term341956.getClass(), "signers", null);
        setField(term341956, term341956.getClass(), "certs", null);
        setField(term341956, term341956.getClass(), "sp", null);
        setField(term341956, term341956.getClass(), "factory", null);
        setField(term341956, term341956.getClass(), "locationNoFragString", null);
        setField(term341955, term341955.getClass(), "codesource", term341956);
        setField(term341955, term341955.getClass(), "classloader", null);
        setField(term341955, term341955.getClass(), "principals", term341957);
        setField(term341955, term341955.getClass(), "permissions", null);
        setBooleanField(term341955, term341955.getClass(), "hasAllPerm", false);
        setBooleanField(term341955, term341955.getClass(), "staticPermissions", false);
        setField(term341955, term341955.getClass(), "key", null);
        setElement(term341954, 0, term341955);
        setField(term341960, term341960.getClass(), "codesource", null);
        setField(term341960, term341960.getClass(), "classloader", null);
        setField(term341960, term341960.getClass(), "principals", null);
        setField(term341960, term341960.getClass(), "permissions", null);
        setBooleanField(term341960, term341960.getClass(), "hasAllPerm", false);
        setBooleanField(term341960, term341960.getClass(), "staticPermissions", false);
        setField(term341960, term341960.getClass(), "key", null);
        setElement(term341954, 1, term341960);
        setField(term341953, term341953.getClass(), "context", term341954);
        setBooleanField(term341953, term341953.getClass(), "isPrivileged", true);
        setBooleanField(term341953, term341953.getClass(), "isAuthorized", false);
        setField(term341965, term341965.getClass(), "context", null);
        setBooleanField(term341965, term341965.getClass(), "isPrivileged", false);
        setBooleanField(term341965, term341965.getClass(), "isAuthorized", false);
        setField(term341965, term341965.getClass(), "privilegedContext", null);
        setField(term341965, term341965.getClass(), "combiner", null);
        setField(term341965, term341965.getClass(), "permissions", null);
        setField(term341965, term341965.getClass(), "parent", null);
        setBooleanField(term341965, term341965.getClass(), "isWrapped", false);
        setBooleanField(term341965, term341965.getClass(), "isLimited", false);
        setField(term341965, term341965.getClass(), "limitedContext", null);
        setField(term341953, term341953.getClass(), "privilegedContext", term341965);
        setField(term341953, term341953.getClass(), "combiner", null);
        setField(term341953, term341953.getClass(), "permissions", null);
        setField(term341953, term341953.getClass(), "parent", null);
        setBooleanField(term341953, term341953.getClass(), "isWrapped", false);
        setBooleanField(term341953, term341953.getClass(), "isLimited", false);
        setField(term341953, term341953.getClass(), "limitedContext", null);
        setField(term341934, term341934.getClass(), "acc", term341953);
        setBooleanField(term341934, term341934.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term341934, term341934.getClass(), "isPosted", true);
        setBooleanField(term341934, term341934.getClass(), "isSystemGenerated", true);
        setField(term341934, term341934.getClass(), "source", term341975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$7");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term341934;
        callMethod(klass, "mouseClicked", argTypes, term341933, args);
    }

};


