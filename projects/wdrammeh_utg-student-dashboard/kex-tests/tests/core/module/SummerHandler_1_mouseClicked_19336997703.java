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

public class SummerHandler_1_mouseClicked_19336997703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316298;
     Object term316299;

    public SummerHandler_1_mouseClicked_19336997703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316298 = newInstance(Class.forName("core.module.SummerHandler$1"));
        setField(term316298, term316298.getClass(), "this$0", null);
        term316299 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term316312 = (byte[]) newByteArray(8);
        Object term316323 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term316324 = (Object[]) newArray("java.security.ProtectionDomain", 4);
        Object term316325 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term316326 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term316327 = (Object[]) newArray("java.security.Principal", 1);
        Object term316330 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term316333 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term316336 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term316341 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term316351 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term316299, term316299.getClass(), "x", 174682854);
        setIntField(term316299, term316299.getClass(), "y", -1618786023);
        setIntField(term316299, term316299.getClass(), "xAbs", -316033780);
        setIntField(term316299, term316299.getClass(), "yAbs", -1242223364);
        setIntField(term316299, term316299.getClass(), "clickCount", -347672279);
        setBooleanField(term316299, term316299.getClass(), "causedByTouchEvent", false);
        setIntField(term316299, term316299.getClass(), "button", -2001561246);
        setBooleanField(term316299, term316299.getClass(), "popupTrigger", true);
        setBooleanField(term316299, term316299.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term316299, term316299.getClass(), "when", 4525924047960478347L);
        setIntField(term316299, term316299.getClass(), "modifiers", -526492477);
        setBooleanField(term316299, term316299.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term316312, 0, (byte) -63);
        setByteElement(term316312, 1, (byte) 39);
        setByteElement(term316312, 2, (byte) -54);
        setByteElement(term316312, 3, (byte) 9);
        setByteElement(term316312, 4, (byte) 19);
        setByteElement(term316312, 5, (byte) -103);
        setByteElement(term316312, 6, (byte) 61);
        setByteElement(term316312, 7, (byte) -90);
        setField(term316299, term316299.getClass(), "bdata", term316312);
        setIntField(term316299, term316299.getClass(), "id", 934758494);
        setBooleanField(term316299, term316299.getClass(), "consumed", false);
        setField(term316326, term316326.getClass(), "location", null);
        setField(term316326, term316326.getClass(), "signers", null);
        setField(term316326, term316326.getClass(), "certs", null);
        setField(term316326, term316326.getClass(), "sp", null);
        setField(term316326, term316326.getClass(), "factory", null);
        setField(term316326, term316326.getClass(), "locationNoFragString", null);
        setField(term316325, term316325.getClass(), "codesource", term316326);
        setField(term316325, term316325.getClass(), "classloader", null);
        setField(term316325, term316325.getClass(), "principals", term316327);
        setField(term316325, term316325.getClass(), "permissions", null);
        setBooleanField(term316325, term316325.getClass(), "hasAllPerm", false);
        setBooleanField(term316325, term316325.getClass(), "staticPermissions", false);
        setField(term316325, term316325.getClass(), "key", null);
        setElement(term316324, 0, term316325);
        setField(term316330, term316330.getClass(), "codesource", null);
        setField(term316330, term316330.getClass(), "classloader", null);
        setField(term316330, term316330.getClass(), "principals", null);
        setField(term316330, term316330.getClass(), "permissions", null);
        setBooleanField(term316330, term316330.getClass(), "hasAllPerm", false);
        setBooleanField(term316330, term316330.getClass(), "staticPermissions", false);
        setField(term316330, term316330.getClass(), "key", null);
        setElement(term316324, 1, term316330);
        setField(term316333, term316333.getClass(), "codesource", null);
        setField(term316333, term316333.getClass(), "classloader", null);
        setField(term316333, term316333.getClass(), "principals", null);
        setField(term316333, term316333.getClass(), "permissions", null);
        setBooleanField(term316333, term316333.getClass(), "hasAllPerm", false);
        setBooleanField(term316333, term316333.getClass(), "staticPermissions", false);
        setField(term316333, term316333.getClass(), "key", null);
        setElement(term316324, 2, term316333);
        setField(term316336, term316336.getClass(), "codesource", null);
        setField(term316336, term316336.getClass(), "classloader", null);
        setField(term316336, term316336.getClass(), "principals", null);
        setField(term316336, term316336.getClass(), "permissions", null);
        setBooleanField(term316336, term316336.getClass(), "hasAllPerm", false);
        setBooleanField(term316336, term316336.getClass(), "staticPermissions", false);
        setField(term316336, term316336.getClass(), "key", null);
        setElement(term316324, 3, term316336);
        setField(term316323, term316323.getClass(), "context", term316324);
        setBooleanField(term316323, term316323.getClass(), "isPrivileged", false);
        setBooleanField(term316323, term316323.getClass(), "isAuthorized", true);
        setField(term316341, term316341.getClass(), "context", null);
        setBooleanField(term316341, term316341.getClass(), "isPrivileged", false);
        setBooleanField(term316341, term316341.getClass(), "isAuthorized", false);
        setField(term316341, term316341.getClass(), "privilegedContext", null);
        setField(term316341, term316341.getClass(), "combiner", null);
        setField(term316341, term316341.getClass(), "permissions", null);
        setField(term316341, term316341.getClass(), "parent", null);
        setBooleanField(term316341, term316341.getClass(), "isWrapped", false);
        setBooleanField(term316341, term316341.getClass(), "isLimited", false);
        setField(term316341, term316341.getClass(), "limitedContext", null);
        setField(term316323, term316323.getClass(), "privilegedContext", term316341);
        setField(term316323, term316323.getClass(), "combiner", null);
        setField(term316323, term316323.getClass(), "permissions", null);
        setField(term316323, term316323.getClass(), "parent", null);
        setBooleanField(term316323, term316323.getClass(), "isWrapped", false);
        setBooleanField(term316323, term316323.getClass(), "isLimited", false);
        setField(term316323, term316323.getClass(), "limitedContext", null);
        setField(term316299, term316299.getClass(), "acc", term316323);
        setBooleanField(term316299, term316299.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term316299, term316299.getClass(), "isPosted", false);
        setBooleanField(term316299, term316299.getClass(), "isSystemGenerated", true);
        setField(term316299, term316299.getClass(), "source", term316351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term316299;
        callMethod(klass, "mouseClicked", argTypes, term316298, args);
    }

};


