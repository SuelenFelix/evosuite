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

public class About_1_mouseClicked_3205683572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30803;
     Object term30804;

    public About_1_mouseClicked_3205683572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30803 = newInstance(Class.forName("core.About$1"));
        setField(term30803, term30803.getClass(), "this$0", null);
        term30804 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term30817 = (byte[]) newByteArray(3);
        Object term30823 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term30824 = (Object[]) newArray("java.security.ProtectionDomain", 4);
        Object term30825 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term30826 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term30827 = (Object[]) newArray("java.security.Principal", 6);
        Object term30830 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term30833 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term30836 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term30841 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term30851 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term30804, term30804.getClass(), "x", -25637976);
        setIntField(term30804, term30804.getClass(), "y", 1555897383);
        setIntField(term30804, term30804.getClass(), "xAbs", 202001407);
        setIntField(term30804, term30804.getClass(), "yAbs", 158873461);
        setIntField(term30804, term30804.getClass(), "clickCount", -430151637);
        setBooleanField(term30804, term30804.getClass(), "causedByTouchEvent", true);
        setIntField(term30804, term30804.getClass(), "button", -1697741339);
        setBooleanField(term30804, term30804.getClass(), "popupTrigger", false);
        setBooleanField(term30804, term30804.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term30804, term30804.getClass(), "when", 2442117782898005296L);
        setIntField(term30804, term30804.getClass(), "modifiers", 98922530);
        setBooleanField(term30804, term30804.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term30817, 0, (byte) 47);
        setByteElement(term30817, 1, (byte) 48);
        setByteElement(term30817, 2, (byte) 89);
        setField(term30804, term30804.getClass(), "bdata", term30817);
        setIntField(term30804, term30804.getClass(), "id", -1388471422);
        setBooleanField(term30804, term30804.getClass(), "consumed", true);
        setField(term30826, term30826.getClass(), "location", null);
        setField(term30826, term30826.getClass(), "signers", null);
        setField(term30826, term30826.getClass(), "certs", null);
        setField(term30826, term30826.getClass(), "sp", null);
        setField(term30826, term30826.getClass(), "factory", null);
        setField(term30826, term30826.getClass(), "locationNoFragString", null);
        setField(term30825, term30825.getClass(), "codesource", term30826);
        setField(term30825, term30825.getClass(), "classloader", null);
        setField(term30825, term30825.getClass(), "principals", term30827);
        setField(term30825, term30825.getClass(), "permissions", null);
        setBooleanField(term30825, term30825.getClass(), "hasAllPerm", false);
        setBooleanField(term30825, term30825.getClass(), "staticPermissions", false);
        setField(term30825, term30825.getClass(), "key", null);
        setElement(term30824, 0, term30825);
        setField(term30830, term30830.getClass(), "codesource", null);
        setField(term30830, term30830.getClass(), "classloader", null);
        setField(term30830, term30830.getClass(), "principals", null);
        setField(term30830, term30830.getClass(), "permissions", null);
        setBooleanField(term30830, term30830.getClass(), "hasAllPerm", false);
        setBooleanField(term30830, term30830.getClass(), "staticPermissions", false);
        setField(term30830, term30830.getClass(), "key", null);
        setElement(term30824, 1, term30830);
        setField(term30833, term30833.getClass(), "codesource", null);
        setField(term30833, term30833.getClass(), "classloader", null);
        setField(term30833, term30833.getClass(), "principals", null);
        setField(term30833, term30833.getClass(), "permissions", null);
        setBooleanField(term30833, term30833.getClass(), "hasAllPerm", false);
        setBooleanField(term30833, term30833.getClass(), "staticPermissions", false);
        setField(term30833, term30833.getClass(), "key", null);
        setElement(term30824, 2, term30833);
        setField(term30836, term30836.getClass(), "codesource", null);
        setField(term30836, term30836.getClass(), "classloader", null);
        setField(term30836, term30836.getClass(), "principals", null);
        setField(term30836, term30836.getClass(), "permissions", null);
        setBooleanField(term30836, term30836.getClass(), "hasAllPerm", false);
        setBooleanField(term30836, term30836.getClass(), "staticPermissions", false);
        setField(term30836, term30836.getClass(), "key", null);
        setElement(term30824, 3, term30836);
        setField(term30823, term30823.getClass(), "context", term30824);
        setBooleanField(term30823, term30823.getClass(), "isPrivileged", false);
        setBooleanField(term30823, term30823.getClass(), "isAuthorized", true);
        setField(term30841, term30841.getClass(), "context", null);
        setBooleanField(term30841, term30841.getClass(), "isPrivileged", false);
        setBooleanField(term30841, term30841.getClass(), "isAuthorized", false);
        setField(term30841, term30841.getClass(), "privilegedContext", null);
        setField(term30841, term30841.getClass(), "combiner", null);
        setField(term30841, term30841.getClass(), "permissions", null);
        setField(term30841, term30841.getClass(), "parent", null);
        setBooleanField(term30841, term30841.getClass(), "isWrapped", false);
        setBooleanField(term30841, term30841.getClass(), "isLimited", false);
        setField(term30841, term30841.getClass(), "limitedContext", null);
        setField(term30823, term30823.getClass(), "privilegedContext", term30841);
        setField(term30823, term30823.getClass(), "combiner", null);
        setField(term30823, term30823.getClass(), "permissions", null);
        setField(term30823, term30823.getClass(), "parent", null);
        setBooleanField(term30823, term30823.getClass(), "isWrapped", false);
        setBooleanField(term30823, term30823.getClass(), "isLimited", false);
        setField(term30823, term30823.getClass(), "limitedContext", null);
        setField(term30804, term30804.getClass(), "acc", term30823);
        setBooleanField(term30804, term30804.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term30804, term30804.getClass(), "isPosted", true);
        setBooleanField(term30804, term30804.getClass(), "isSystemGenerated", false);
        setField(term30804, term30804.getClass(), "source", term30851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term30804;
        callMethod(klass, "mouseClicked", argTypes, term30803, args);
    }

};


