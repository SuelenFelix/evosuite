package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SummerHandler_1_mousePressed_13060044911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316176;
     Object term316177;

    public SummerHandler_1_mousePressed_13060044911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316176 = newInstance(Class.forName("core.module.SummerHandler$1"));
        setField(term316176, term316176.getClass(), "this$0", null);
        term316177 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term316190 = (byte[]) newByteArray(7);
        Object term316200 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term316201 = (Object[]) newArray("java.security.ProtectionDomain", 0);
        Object term316204 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term316205 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term316206 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term316209 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term316212 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term316215 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term316218 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term316223 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term316235 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term316177, term316177.getClass(), "x", -91129577);
        setIntField(term316177, term316177.getClass(), "y", 1629059877);
        setIntField(term316177, term316177.getClass(), "xAbs", -649940550);
        setIntField(term316177, term316177.getClass(), "yAbs", 36785954);
        setIntField(term316177, term316177.getClass(), "clickCount", -907057089);
        setBooleanField(term316177, term316177.getClass(), "causedByTouchEvent", false);
        setIntField(term316177, term316177.getClass(), "button", -1740998635);
        setBooleanField(term316177, term316177.getClass(), "popupTrigger", true);
        setBooleanField(term316177, term316177.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term316177, term316177.getClass(), "when", -8398381579707958144L);
        setIntField(term316177, term316177.getClass(), "modifiers", 183857482);
        setBooleanField(term316177, term316177.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term316190, 0, (byte) -4);
        setByteElement(term316190, 1, (byte) -27);
        setByteElement(term316190, 2, (byte) 120);
        setByteElement(term316190, 3, (byte) -25);
        setByteElement(term316190, 4, (byte) 114);
        setByteElement(term316190, 5, (byte) 105);
        setByteElement(term316190, 6, (byte) -95);
        setField(term316177, term316177.getClass(), "bdata", term316190);
        setIntField(term316177, term316177.getClass(), "id", -1845135476);
        setBooleanField(term316177, term316177.getClass(), "consumed", true);
        setField(term316200, term316200.getClass(), "context", term316201);
        setBooleanField(term316200, term316200.getClass(), "isPrivileged", false);
        setBooleanField(term316200, term316200.getClass(), "isAuthorized", true);
        setField(term316206, term316206.getClass(), "codesource", null);
        setField(term316206, term316206.getClass(), "classloader", null);
        setField(term316206, term316206.getClass(), "principals", null);
        setField(term316206, term316206.getClass(), "permissions", null);
        setBooleanField(term316206, term316206.getClass(), "hasAllPerm", false);
        setBooleanField(term316206, term316206.getClass(), "staticPermissions", false);
        setField(term316206, term316206.getClass(), "key", null);
        setElement(term316205, 0, term316206);
        setField(term316209, term316209.getClass(), "codesource", null);
        setField(term316209, term316209.getClass(), "classloader", null);
        setField(term316209, term316209.getClass(), "principals", null);
        setField(term316209, term316209.getClass(), "permissions", null);
        setBooleanField(term316209, term316209.getClass(), "hasAllPerm", false);
        setBooleanField(term316209, term316209.getClass(), "staticPermissions", false);
        setField(term316209, term316209.getClass(), "key", null);
        setElement(term316205, 1, term316209);
        setField(term316212, term316212.getClass(), "codesource", null);
        setField(term316212, term316212.getClass(), "classloader", null);
        setField(term316212, term316212.getClass(), "principals", null);
        setField(term316212, term316212.getClass(), "permissions", null);
        setBooleanField(term316212, term316212.getClass(), "hasAllPerm", false);
        setBooleanField(term316212, term316212.getClass(), "staticPermissions", false);
        setField(term316212, term316212.getClass(), "key", null);
        setElement(term316205, 2, term316212);
        setField(term316215, term316215.getClass(), "codesource", null);
        setField(term316215, term316215.getClass(), "classloader", null);
        setField(term316215, term316215.getClass(), "principals", null);
        setField(term316215, term316215.getClass(), "permissions", null);
        setBooleanField(term316215, term316215.getClass(), "hasAllPerm", false);
        setBooleanField(term316215, term316215.getClass(), "staticPermissions", false);
        setField(term316215, term316215.getClass(), "key", null);
        setElement(term316205, 3, term316215);
        setField(term316218, term316218.getClass(), "codesource", null);
        setField(term316218, term316218.getClass(), "classloader", null);
        setField(term316218, term316218.getClass(), "principals", null);
        setField(term316218, term316218.getClass(), "permissions", null);
        setBooleanField(term316218, term316218.getClass(), "hasAllPerm", false);
        setBooleanField(term316218, term316218.getClass(), "staticPermissions", false);
        setField(term316218, term316218.getClass(), "key", null);
        setElement(term316205, 4, term316218);
        setField(term316204, term316204.getClass(), "context", term316205);
        setBooleanField(term316204, term316204.getClass(), "isPrivileged", true);
        setBooleanField(term316204, term316204.getClass(), "isAuthorized", false);
        setField(term316223, term316223.getClass(), "context", null);
        setBooleanField(term316223, term316223.getClass(), "isPrivileged", false);
        setBooleanField(term316223, term316223.getClass(), "isAuthorized", false);
        setField(term316223, term316223.getClass(), "privilegedContext", null);
        setField(term316223, term316223.getClass(), "combiner", null);
        setField(term316223, term316223.getClass(), "permissions", null);
        setField(term316223, term316223.getClass(), "parent", null);
        setBooleanField(term316223, term316223.getClass(), "isWrapped", false);
        setBooleanField(term316223, term316223.getClass(), "isLimited", false);
        setField(term316223, term316223.getClass(), "limitedContext", null);
        setField(term316204, term316204.getClass(), "privilegedContext", term316223);
        setField(term316204, term316204.getClass(), "combiner", null);
        setField(term316204, term316204.getClass(), "permissions", null);
        setField(term316204, term316204.getClass(), "parent", null);
        setBooleanField(term316204, term316204.getClass(), "isWrapped", false);
        setBooleanField(term316204, term316204.getClass(), "isLimited", false);
        setField(term316204, term316204.getClass(), "limitedContext", null);
        setField(term316200, term316200.getClass(), "privilegedContext", term316204);
        setField(term316200, term316200.getClass(), "combiner", null);
        setField(term316200, term316200.getClass(), "permissions", null);
        setField(term316200, term316200.getClass(), "parent", null);
        setBooleanField(term316200, term316200.getClass(), "isWrapped", false);
        setBooleanField(term316200, term316200.getClass(), "isLimited", false);
        setField(term316200, term316200.getClass(), "limitedContext", null);
        setField(term316177, term316177.getClass(), "acc", term316200);
        setBooleanField(term316177, term316177.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term316177, term316177.getClass(), "isPosted", true);
        setBooleanField(term316177, term316177.getClass(), "isSystemGenerated", true);
        setField(term316177, term316177.getClass(), "source", term316235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term316177;
        callMethod(klass, "mousePressed", argTypes, term316176, args);
    }

};


