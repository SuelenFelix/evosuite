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

public class Board_6_mouseClicked_3119694792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342928;
     Object term342929;

    public Board_6_mouseClicked_3119694792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342928 = newInstance(Class.forName("core.Board$6"));
        setField(term342928, term342928.getClass(), "this$0", null);
        term342929 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term342942 = (byte[]) newByteArray(8);
        Object term342953 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term342954 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term342955 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342956 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term342957 = (Object[]) newArray("java.security.Principal", 4);
        Object term342960 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342963 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342966 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342969 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342974 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term342984 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term342929, term342929.getClass(), "x", -1287204441);
        setIntField(term342929, term342929.getClass(), "y", 1826016641);
        setIntField(term342929, term342929.getClass(), "xAbs", 1726886771);
        setIntField(term342929, term342929.getClass(), "yAbs", 1045689376);
        setIntField(term342929, term342929.getClass(), "clickCount", 767458787);
        setBooleanField(term342929, term342929.getClass(), "causedByTouchEvent", true);
        setIntField(term342929, term342929.getClass(), "button", 2103721338);
        setBooleanField(term342929, term342929.getClass(), "popupTrigger", false);
        setBooleanField(term342929, term342929.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term342929, term342929.getClass(), "when", 7799452759993694308L);
        setIntField(term342929, term342929.getClass(), "modifiers", 621330308);
        setBooleanField(term342929, term342929.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term342942, 0, (byte) 20);
        setByteElement(term342942, 1, (byte) -114);
        setByteElement(term342942, 2, (byte) 93);
        setByteElement(term342942, 3, (byte) -60);
        setByteElement(term342942, 4, (byte) -4);
        setByteElement(term342942, 5, (byte) 28);
        setByteElement(term342942, 6, (byte) 94);
        setField(term342929, term342929.getClass(), "bdata", term342942);
        setIntField(term342929, term342929.getClass(), "id", -1597424060);
        setBooleanField(term342929, term342929.getClass(), "consumed", false);
        setField(term342956, term342956.getClass(), "location", null);
        setField(term342956, term342956.getClass(), "signers", null);
        setField(term342956, term342956.getClass(), "certs", null);
        setField(term342956, term342956.getClass(), "sp", null);
        setField(term342956, term342956.getClass(), "factory", null);
        setField(term342956, term342956.getClass(), "locationNoFragString", null);
        setField(term342955, term342955.getClass(), "codesource", term342956);
        setField(term342955, term342955.getClass(), "classloader", null);
        setField(term342955, term342955.getClass(), "principals", term342957);
        setField(term342955, term342955.getClass(), "permissions", null);
        setBooleanField(term342955, term342955.getClass(), "hasAllPerm", false);
        setBooleanField(term342955, term342955.getClass(), "staticPermissions", false);
        setField(term342955, term342955.getClass(), "key", null);
        setElement(term342954, 0, term342955);
        setField(term342960, term342960.getClass(), "codesource", null);
        setField(term342960, term342960.getClass(), "classloader", null);
        setField(term342960, term342960.getClass(), "principals", null);
        setField(term342960, term342960.getClass(), "permissions", null);
        setBooleanField(term342960, term342960.getClass(), "hasAllPerm", false);
        setBooleanField(term342960, term342960.getClass(), "staticPermissions", false);
        setField(term342960, term342960.getClass(), "key", null);
        setElement(term342954, 1, term342960);
        setField(term342963, term342963.getClass(), "codesource", null);
        setField(term342963, term342963.getClass(), "classloader", null);
        setField(term342963, term342963.getClass(), "principals", null);
        setField(term342963, term342963.getClass(), "permissions", null);
        setBooleanField(term342963, term342963.getClass(), "hasAllPerm", false);
        setBooleanField(term342963, term342963.getClass(), "staticPermissions", false);
        setField(term342963, term342963.getClass(), "key", null);
        setElement(term342954, 2, term342963);
        setField(term342966, term342966.getClass(), "codesource", null);
        setField(term342966, term342966.getClass(), "classloader", null);
        setField(term342966, term342966.getClass(), "principals", null);
        setField(term342966, term342966.getClass(), "permissions", null);
        setBooleanField(term342966, term342966.getClass(), "hasAllPerm", false);
        setBooleanField(term342966, term342966.getClass(), "staticPermissions", false);
        setField(term342966, term342966.getClass(), "key", null);
        setElement(term342954, 3, term342966);
        setField(term342969, term342969.getClass(), "codesource", null);
        setField(term342969, term342969.getClass(), "classloader", null);
        setField(term342969, term342969.getClass(), "principals", null);
        setField(term342969, term342969.getClass(), "permissions", null);
        setBooleanField(term342969, term342969.getClass(), "hasAllPerm", false);
        setBooleanField(term342969, term342969.getClass(), "staticPermissions", false);
        setField(term342969, term342969.getClass(), "key", null);
        setElement(term342954, 4, term342969);
        setField(term342953, term342953.getClass(), "context", term342954);
        setBooleanField(term342953, term342953.getClass(), "isPrivileged", true);
        setBooleanField(term342953, term342953.getClass(), "isAuthorized", true);
        setField(term342974, term342974.getClass(), "context", null);
        setBooleanField(term342974, term342974.getClass(), "isPrivileged", false);
        setBooleanField(term342974, term342974.getClass(), "isAuthorized", false);
        setField(term342974, term342974.getClass(), "privilegedContext", null);
        setField(term342974, term342974.getClass(), "combiner", null);
        setField(term342974, term342974.getClass(), "permissions", null);
        setField(term342974, term342974.getClass(), "parent", null);
        setBooleanField(term342974, term342974.getClass(), "isWrapped", false);
        setBooleanField(term342974, term342974.getClass(), "isLimited", false);
        setField(term342974, term342974.getClass(), "limitedContext", null);
        setField(term342953, term342953.getClass(), "privilegedContext", term342974);
        setField(term342953, term342953.getClass(), "combiner", null);
        setField(term342953, term342953.getClass(), "permissions", null);
        setField(term342953, term342953.getClass(), "parent", null);
        setBooleanField(term342953, term342953.getClass(), "isWrapped", false);
        setBooleanField(term342953, term342953.getClass(), "isLimited", false);
        setField(term342953, term342953.getClass(), "limitedContext", null);
        setField(term342929, term342929.getClass(), "acc", term342953);
        setBooleanField(term342929, term342929.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term342929, term342929.getClass(), "isPosted", false);
        setBooleanField(term342929, term342929.getClass(), "isSystemGenerated", true);
        setField(term342929, term342929.getClass(), "source", term342984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$6");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term342929;
        callMethod(klass, "mouseClicked", argTypes, term342928, args);
    }

};


