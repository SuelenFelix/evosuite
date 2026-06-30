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

public class Notification_1_mouseClicked_791101962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2428;
     Object term2429;

    public Notification_1_mouseClicked_791101962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2428 = newInstance(Class.forName("core.alert.Notification$1"));
        setField(term2428, term2428.getClass(), "this$0", null);
        term2429 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term2442 = (byte[]) newByteArray(1);
        Object term2446 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term2447 = (Object[]) newArray("java.security.ProtectionDomain", 0);
        Object term2450 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term2451 = (Object[]) newArray("java.security.ProtectionDomain", 9);
        Object term2452 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2455 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2458 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2461 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2464 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2467 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2470 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2473 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2476 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2481 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term2493 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2429, term2429.getClass(), "x", 1107176718);
        setIntField(term2429, term2429.getClass(), "y", 480137250);
        setIntField(term2429, term2429.getClass(), "xAbs", -341152642);
        setIntField(term2429, term2429.getClass(), "yAbs", -2015854073);
        setIntField(term2429, term2429.getClass(), "clickCount", 538259104);
        setBooleanField(term2429, term2429.getClass(), "causedByTouchEvent", true);
        setIntField(term2429, term2429.getClass(), "button", 96566506);
        setBooleanField(term2429, term2429.getClass(), "popupTrigger", false);
        setBooleanField(term2429, term2429.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term2429, term2429.getClass(), "when", 6811161968424632369L);
        setIntField(term2429, term2429.getClass(), "modifiers", -343325701);
        setBooleanField(term2429, term2429.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term2442, 0, (byte) 106);
        setField(term2429, term2429.getClass(), "bdata", term2442);
        setIntField(term2429, term2429.getClass(), "id", 107945604);
        setBooleanField(term2429, term2429.getClass(), "consumed", false);
        setField(term2446, term2446.getClass(), "context", term2447);
        setBooleanField(term2446, term2446.getClass(), "isPrivileged", false);
        setBooleanField(term2446, term2446.getClass(), "isAuthorized", true);
        setField(term2452, term2452.getClass(), "codesource", null);
        setField(term2452, term2452.getClass(), "classloader", null);
        setField(term2452, term2452.getClass(), "principals", null);
        setField(term2452, term2452.getClass(), "permissions", null);
        setBooleanField(term2452, term2452.getClass(), "hasAllPerm", false);
        setBooleanField(term2452, term2452.getClass(), "staticPermissions", false);
        setField(term2452, term2452.getClass(), "key", null);
        setElement(term2451, 0, term2452);
        setField(term2455, term2455.getClass(), "codesource", null);
        setField(term2455, term2455.getClass(), "classloader", null);
        setField(term2455, term2455.getClass(), "principals", null);
        setField(term2455, term2455.getClass(), "permissions", null);
        setBooleanField(term2455, term2455.getClass(), "hasAllPerm", false);
        setBooleanField(term2455, term2455.getClass(), "staticPermissions", false);
        setField(term2455, term2455.getClass(), "key", null);
        setElement(term2451, 1, term2455);
        setField(term2458, term2458.getClass(), "codesource", null);
        setField(term2458, term2458.getClass(), "classloader", null);
        setField(term2458, term2458.getClass(), "principals", null);
        setField(term2458, term2458.getClass(), "permissions", null);
        setBooleanField(term2458, term2458.getClass(), "hasAllPerm", false);
        setBooleanField(term2458, term2458.getClass(), "staticPermissions", false);
        setField(term2458, term2458.getClass(), "key", null);
        setElement(term2451, 2, term2458);
        setField(term2461, term2461.getClass(), "codesource", null);
        setField(term2461, term2461.getClass(), "classloader", null);
        setField(term2461, term2461.getClass(), "principals", null);
        setField(term2461, term2461.getClass(), "permissions", null);
        setBooleanField(term2461, term2461.getClass(), "hasAllPerm", false);
        setBooleanField(term2461, term2461.getClass(), "staticPermissions", false);
        setField(term2461, term2461.getClass(), "key", null);
        setElement(term2451, 3, term2461);
        setField(term2464, term2464.getClass(), "codesource", null);
        setField(term2464, term2464.getClass(), "classloader", null);
        setField(term2464, term2464.getClass(), "principals", null);
        setField(term2464, term2464.getClass(), "permissions", null);
        setBooleanField(term2464, term2464.getClass(), "hasAllPerm", false);
        setBooleanField(term2464, term2464.getClass(), "staticPermissions", false);
        setField(term2464, term2464.getClass(), "key", null);
        setElement(term2451, 4, term2464);
        setField(term2467, term2467.getClass(), "codesource", null);
        setField(term2467, term2467.getClass(), "classloader", null);
        setField(term2467, term2467.getClass(), "principals", null);
        setField(term2467, term2467.getClass(), "permissions", null);
        setBooleanField(term2467, term2467.getClass(), "hasAllPerm", false);
        setBooleanField(term2467, term2467.getClass(), "staticPermissions", false);
        setField(term2467, term2467.getClass(), "key", null);
        setElement(term2451, 5, term2467);
        setField(term2470, term2470.getClass(), "codesource", null);
        setField(term2470, term2470.getClass(), "classloader", null);
        setField(term2470, term2470.getClass(), "principals", null);
        setField(term2470, term2470.getClass(), "permissions", null);
        setBooleanField(term2470, term2470.getClass(), "hasAllPerm", false);
        setBooleanField(term2470, term2470.getClass(), "staticPermissions", false);
        setField(term2470, term2470.getClass(), "key", null);
        setElement(term2451, 6, term2470);
        setField(term2473, term2473.getClass(), "codesource", null);
        setField(term2473, term2473.getClass(), "classloader", null);
        setField(term2473, term2473.getClass(), "principals", null);
        setField(term2473, term2473.getClass(), "permissions", null);
        setBooleanField(term2473, term2473.getClass(), "hasAllPerm", false);
        setBooleanField(term2473, term2473.getClass(), "staticPermissions", false);
        setField(term2473, term2473.getClass(), "key", null);
        setElement(term2451, 7, term2473);
        setField(term2476, term2476.getClass(), "codesource", null);
        setField(term2476, term2476.getClass(), "classloader", null);
        setField(term2476, term2476.getClass(), "principals", null);
        setField(term2476, term2476.getClass(), "permissions", null);
        setBooleanField(term2476, term2476.getClass(), "hasAllPerm", false);
        setBooleanField(term2476, term2476.getClass(), "staticPermissions", false);
        setField(term2476, term2476.getClass(), "key", null);
        setElement(term2451, 8, term2476);
        setField(term2450, term2450.getClass(), "context", term2451);
        setBooleanField(term2450, term2450.getClass(), "isPrivileged", false);
        setBooleanField(term2450, term2450.getClass(), "isAuthorized", false);
        setField(term2481, term2481.getClass(), "context", null);
        setBooleanField(term2481, term2481.getClass(), "isPrivileged", false);
        setBooleanField(term2481, term2481.getClass(), "isAuthorized", false);
        setField(term2481, term2481.getClass(), "privilegedContext", null);
        setField(term2481, term2481.getClass(), "combiner", null);
        setField(term2481, term2481.getClass(), "permissions", null);
        setField(term2481, term2481.getClass(), "parent", null);
        setBooleanField(term2481, term2481.getClass(), "isWrapped", false);
        setBooleanField(term2481, term2481.getClass(), "isLimited", false);
        setField(term2481, term2481.getClass(), "limitedContext", null);
        setField(term2450, term2450.getClass(), "privilegedContext", term2481);
        setField(term2450, term2450.getClass(), "combiner", null);
        setField(term2450, term2450.getClass(), "permissions", null);
        setField(term2450, term2450.getClass(), "parent", null);
        setBooleanField(term2450, term2450.getClass(), "isWrapped", false);
        setBooleanField(term2450, term2450.getClass(), "isLimited", false);
        setField(term2450, term2450.getClass(), "limitedContext", null);
        setField(term2446, term2446.getClass(), "privilegedContext", term2450);
        setField(term2446, term2446.getClass(), "combiner", null);
        setField(term2446, term2446.getClass(), "permissions", null);
        setField(term2446, term2446.getClass(), "parent", null);
        setBooleanField(term2446, term2446.getClass(), "isWrapped", false);
        setBooleanField(term2446, term2446.getClass(), "isLimited", false);
        setField(term2446, term2446.getClass(), "limitedContext", null);
        setField(term2429, term2429.getClass(), "acc", term2446);
        setBooleanField(term2429, term2429.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term2429, term2429.getClass(), "isPosted", false);
        setBooleanField(term2429, term2429.getClass(), "isSystemGenerated", false);
        setField(term2429, term2429.getClass(), "source", term2493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.alert.Notification$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term2429;
        callMethod(klass, "mouseClicked", argTypes, term2428, args);
    }

};


