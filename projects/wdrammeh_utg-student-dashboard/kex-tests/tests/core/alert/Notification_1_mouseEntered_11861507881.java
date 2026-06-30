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

public class Notification_1_mouseEntered_11861507881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2375;
     Object term2376;

    public Notification_1_mouseEntered_11861507881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2375 = newInstance(Class.forName("core.alert.Notification$1"));
        setField(term2375, term2375.getClass(), "this$0", null);
        term2376 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term2389 = (byte[]) newByteArray(2);
        Object term2394 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term2395 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term2396 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2397 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term2398 = (Object[]) newArray("java.security.Principal", 5);
        Object term2401 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2404 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2407 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2410 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term2415 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term2425 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2376, term2376.getClass(), "x", 691577392);
        setIntField(term2376, term2376.getClass(), "y", -893623680);
        setIntField(term2376, term2376.getClass(), "xAbs", -1963434938);
        setIntField(term2376, term2376.getClass(), "yAbs", 906181092);
        setIntField(term2376, term2376.getClass(), "clickCount", 1045657203);
        setBooleanField(term2376, term2376.getClass(), "causedByTouchEvent", false);
        setIntField(term2376, term2376.getClass(), "button", 1386130016);
        setBooleanField(term2376, term2376.getClass(), "popupTrigger", true);
        setBooleanField(term2376, term2376.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term2376, term2376.getClass(), "when", 4872422362414183754L);
        setIntField(term2376, term2376.getClass(), "modifiers", 1072005683);
        setBooleanField(term2376, term2376.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term2389, 0, (byte) 36);
        setByteElement(term2389, 1, (byte) 118);
        setField(term2376, term2376.getClass(), "bdata", term2389);
        setIntField(term2376, term2376.getClass(), "id", 1861318859);
        setBooleanField(term2376, term2376.getClass(), "consumed", false);
        setField(term2397, term2397.getClass(), "location", null);
        setField(term2397, term2397.getClass(), "signers", null);
        setField(term2397, term2397.getClass(), "certs", null);
        setField(term2397, term2397.getClass(), "sp", null);
        setField(term2397, term2397.getClass(), "factory", null);
        setField(term2397, term2397.getClass(), "locationNoFragString", null);
        setField(term2396, term2396.getClass(), "codesource", term2397);
        setField(term2396, term2396.getClass(), "classloader", null);
        setField(term2396, term2396.getClass(), "principals", term2398);
        setField(term2396, term2396.getClass(), "permissions", null);
        setBooleanField(term2396, term2396.getClass(), "hasAllPerm", false);
        setBooleanField(term2396, term2396.getClass(), "staticPermissions", false);
        setField(term2396, term2396.getClass(), "key", null);
        setElement(term2395, 0, term2396);
        setField(term2401, term2401.getClass(), "codesource", null);
        setField(term2401, term2401.getClass(), "classloader", null);
        setField(term2401, term2401.getClass(), "principals", null);
        setField(term2401, term2401.getClass(), "permissions", null);
        setBooleanField(term2401, term2401.getClass(), "hasAllPerm", false);
        setBooleanField(term2401, term2401.getClass(), "staticPermissions", false);
        setField(term2401, term2401.getClass(), "key", null);
        setElement(term2395, 1, term2401);
        setField(term2404, term2404.getClass(), "codesource", null);
        setField(term2404, term2404.getClass(), "classloader", null);
        setField(term2404, term2404.getClass(), "principals", null);
        setField(term2404, term2404.getClass(), "permissions", null);
        setBooleanField(term2404, term2404.getClass(), "hasAllPerm", false);
        setBooleanField(term2404, term2404.getClass(), "staticPermissions", false);
        setField(term2404, term2404.getClass(), "key", null);
        setElement(term2395, 2, term2404);
        setField(term2407, term2407.getClass(), "codesource", null);
        setField(term2407, term2407.getClass(), "classloader", null);
        setField(term2407, term2407.getClass(), "principals", null);
        setField(term2407, term2407.getClass(), "permissions", null);
        setBooleanField(term2407, term2407.getClass(), "hasAllPerm", false);
        setBooleanField(term2407, term2407.getClass(), "staticPermissions", false);
        setField(term2407, term2407.getClass(), "key", null);
        setElement(term2395, 3, term2407);
        setField(term2410, term2410.getClass(), "codesource", null);
        setField(term2410, term2410.getClass(), "classloader", null);
        setField(term2410, term2410.getClass(), "principals", null);
        setField(term2410, term2410.getClass(), "permissions", null);
        setBooleanField(term2410, term2410.getClass(), "hasAllPerm", false);
        setBooleanField(term2410, term2410.getClass(), "staticPermissions", false);
        setField(term2410, term2410.getClass(), "key", null);
        setElement(term2395, 4, term2410);
        setField(term2394, term2394.getClass(), "context", term2395);
        setBooleanField(term2394, term2394.getClass(), "isPrivileged", true);
        setBooleanField(term2394, term2394.getClass(), "isAuthorized", true);
        setField(term2415, term2415.getClass(), "context", null);
        setBooleanField(term2415, term2415.getClass(), "isPrivileged", false);
        setBooleanField(term2415, term2415.getClass(), "isAuthorized", false);
        setField(term2415, term2415.getClass(), "privilegedContext", null);
        setField(term2415, term2415.getClass(), "combiner", null);
        setField(term2415, term2415.getClass(), "permissions", null);
        setField(term2415, term2415.getClass(), "parent", null);
        setBooleanField(term2415, term2415.getClass(), "isWrapped", false);
        setBooleanField(term2415, term2415.getClass(), "isLimited", false);
        setField(term2415, term2415.getClass(), "limitedContext", null);
        setField(term2394, term2394.getClass(), "privilegedContext", term2415);
        setField(term2394, term2394.getClass(), "combiner", null);
        setField(term2394, term2394.getClass(), "permissions", null);
        setField(term2394, term2394.getClass(), "parent", null);
        setBooleanField(term2394, term2394.getClass(), "isWrapped", false);
        setBooleanField(term2394, term2394.getClass(), "isLimited", false);
        setField(term2394, term2394.getClass(), "limitedContext", null);
        setField(term2376, term2376.getClass(), "acc", term2394);
        setBooleanField(term2376, term2376.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term2376, term2376.getClass(), "isPosted", true);
        setBooleanField(term2376, term2376.getClass(), "isSystemGenerated", true);
        setField(term2376, term2376.getClass(), "source", term2425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.alert.Notification$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term2376;
        callMethod(klass, "mouseEntered", argTypes, term2375, args);
    }

};


