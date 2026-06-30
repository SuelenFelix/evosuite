package core.alert;

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
import static core.alert.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Notification_1_mouseExited_14412819723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2495;
     Object term2496;

    public Notification_1_mouseExited_14412819723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2495 = newInstance(Class.forName("core.alert.Notification$1"));
        setField(term2495, term2495.getClass(), "this$0", null);
        term2496 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term2509 = (byte[]) newByteArray(2);
        Object term2514 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term2515 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term2516 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2517 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term2518 = (Object[]) newArray("java.security.Principal", 8);
        Object term2521 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2524 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2527 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2530 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2533 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2536 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2539 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2544 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term2554 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2496, term2496.getClass(), "x", 1202361360);
        setIntField(term2496, term2496.getClass(), "y", -2015048153);
        setIntField(term2496, term2496.getClass(), "xAbs", -2063457669);
        setIntField(term2496, term2496.getClass(), "yAbs", -1222006000);
        setIntField(term2496, term2496.getClass(), "clickCount", 2095798786);
        setBooleanField(term2496, term2496.getClass(), "causedByTouchEvent", false);
        setIntField(term2496, term2496.getClass(), "button", -1565502840);
        setBooleanField(term2496, term2496.getClass(), "popupTrigger", false);
        setBooleanField(term2496, term2496.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term2496, term2496.getClass(), "when", -7237588299778557629L);
        setIntField(term2496, term2496.getClass(), "modifiers", 344323424);
        setBooleanField(term2496, term2496.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term2509, 0, (byte) 98);
        setByteElement(term2509, 1, (byte) 67);
        setField(term2496, term2496.getClass(), "bdata", term2509);
        setIntField(term2496, term2496.getClass(), "id", 9726679);
        setBooleanField(term2496, term2496.getClass(), "consumed", false);
        setField(term2517, term2517.getClass(), "location", null);
        setField(term2517, term2517.getClass(), "signers", null);
        setField(term2517, term2517.getClass(), "certs", null);
        setField(term2517, term2517.getClass(), "sp", null);
        setField(term2517, term2517.getClass(), "factory", null);
        setField(term2517, term2517.getClass(), "locationNoFragString", null);
        setField(term2516, term2516.getClass(), "codesource", term2517);
        setField(term2516, term2516.getClass(), "classloader", null);
        setField(term2516, term2516.getClass(), "principals", term2518);
        setField(term2516, term2516.getClass(), "permissions", null);
        setBooleanField(term2516, term2516.getClass(), "hasAllPerm", false);
        setBooleanField(term2516, term2516.getClass(), "staticPermissions", false);
        setField(term2516, term2516.getClass(), "key", null);
        setElement(term2515, 0, term2516);
        setField(term2521, term2521.getClass(), "codesource", null);
        setField(term2521, term2521.getClass(), "classloader", null);
        setField(term2521, term2521.getClass(), "principals", null);
        setField(term2521, term2521.getClass(), "permissions", null);
        setBooleanField(term2521, term2521.getClass(), "hasAllPerm", false);
        setBooleanField(term2521, term2521.getClass(), "staticPermissions", false);
        setField(term2521, term2521.getClass(), "key", null);
        setElement(term2515, 1, term2521);
        setField(term2524, term2524.getClass(), "codesource", null);
        setField(term2524, term2524.getClass(), "classloader", null);
        setField(term2524, term2524.getClass(), "principals", null);
        setField(term2524, term2524.getClass(), "permissions", null);
        setBooleanField(term2524, term2524.getClass(), "hasAllPerm", false);
        setBooleanField(term2524, term2524.getClass(), "staticPermissions", false);
        setField(term2524, term2524.getClass(), "key", null);
        setElement(term2515, 2, term2524);
        setField(term2527, term2527.getClass(), "codesource", null);
        setField(term2527, term2527.getClass(), "classloader", null);
        setField(term2527, term2527.getClass(), "principals", null);
        setField(term2527, term2527.getClass(), "permissions", null);
        setBooleanField(term2527, term2527.getClass(), "hasAllPerm", false);
        setBooleanField(term2527, term2527.getClass(), "staticPermissions", false);
        setField(term2527, term2527.getClass(), "key", null);
        setElement(term2515, 3, term2527);
        setField(term2530, term2530.getClass(), "codesource", null);
        setField(term2530, term2530.getClass(), "classloader", null);
        setField(term2530, term2530.getClass(), "principals", null);
        setField(term2530, term2530.getClass(), "permissions", null);
        setBooleanField(term2530, term2530.getClass(), "hasAllPerm", false);
        setBooleanField(term2530, term2530.getClass(), "staticPermissions", false);
        setField(term2530, term2530.getClass(), "key", null);
        setElement(term2515, 4, term2530);
        setField(term2533, term2533.getClass(), "codesource", null);
        setField(term2533, term2533.getClass(), "classloader", null);
        setField(term2533, term2533.getClass(), "principals", null);
        setField(term2533, term2533.getClass(), "permissions", null);
        setBooleanField(term2533, term2533.getClass(), "hasAllPerm", false);
        setBooleanField(term2533, term2533.getClass(), "staticPermissions", false);
        setField(term2533, term2533.getClass(), "key", null);
        setElement(term2515, 5, term2533);
        setField(term2536, term2536.getClass(), "codesource", null);
        setField(term2536, term2536.getClass(), "classloader", null);
        setField(term2536, term2536.getClass(), "principals", null);
        setField(term2536, term2536.getClass(), "permissions", null);
        setBooleanField(term2536, term2536.getClass(), "hasAllPerm", false);
        setBooleanField(term2536, term2536.getClass(), "staticPermissions", false);
        setField(term2536, term2536.getClass(), "key", null);
        setElement(term2515, 6, term2536);
        setField(term2539, term2539.getClass(), "codesource", null);
        setField(term2539, term2539.getClass(), "classloader", null);
        setField(term2539, term2539.getClass(), "principals", null);
        setField(term2539, term2539.getClass(), "permissions", null);
        setBooleanField(term2539, term2539.getClass(), "hasAllPerm", false);
        setBooleanField(term2539, term2539.getClass(), "staticPermissions", false);
        setField(term2539, term2539.getClass(), "key", null);
        setElement(term2515, 7, term2539);
        setField(term2514, term2514.getClass(), "context", term2515);
        setBooleanField(term2514, term2514.getClass(), "isPrivileged", true);
        setBooleanField(term2514, term2514.getClass(), "isAuthorized", true);
        setField(term2544, term2544.getClass(), "context", null);
        setBooleanField(term2544, term2544.getClass(), "isPrivileged", false);
        setBooleanField(term2544, term2544.getClass(), "isAuthorized", false);
        setField(term2544, term2544.getClass(), "privilegedContext", null);
        setField(term2544, term2544.getClass(), "combiner", null);
        setField(term2544, term2544.getClass(), "permissions", null);
        setField(term2544, term2544.getClass(), "parent", null);
        setBooleanField(term2544, term2544.getClass(), "isWrapped", false);
        setBooleanField(term2544, term2544.getClass(), "isLimited", false);
        setField(term2544, term2544.getClass(), "limitedContext", null);
        setField(term2514, term2514.getClass(), "privilegedContext", term2544);
        setField(term2514, term2514.getClass(), "combiner", null);
        setField(term2514, term2514.getClass(), "permissions", null);
        setField(term2514, term2514.getClass(), "parent", null);
        setBooleanField(term2514, term2514.getClass(), "isWrapped", false);
        setBooleanField(term2514, term2514.getClass(), "isLimited", false);
        setField(term2514, term2514.getClass(), "limitedContext", null);
        setField(term2496, term2496.getClass(), "acc", term2514);
        setBooleanField(term2496, term2496.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term2496, term2496.getClass(), "isPosted", false);
        setBooleanField(term2496, term2496.getClass(), "isSystemGenerated", true);
        setField(term2496, term2496.getClass(), "source", term2554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.alert.Notification$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term2496;
        callMethod(klass, "mouseExited", argTypes, term2495, args);
    }

};


