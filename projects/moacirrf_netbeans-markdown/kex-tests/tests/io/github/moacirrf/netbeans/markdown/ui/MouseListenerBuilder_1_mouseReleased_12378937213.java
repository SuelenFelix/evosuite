package io.github.moacirrf.netbeans.markdown.ui;

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
import static io.github.moacirrf.netbeans.markdown.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MouseListenerBuilder_1_mouseReleased_12378937213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109455;
     Object term109456;

    public MouseListenerBuilder_1_mouseReleased_12378937213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109455 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.MouseListenerBuilder$1"));
        setField(term109455, term109455.getClass(), "val$eventPerformed", null);
        term109456 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term109469 = (byte[]) newByteArray(9);
        Object term109481 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term109482 = (Object[]) newArray("java.security.ProtectionDomain", 3);
        Object term109483 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109484 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term109485 = (Object[]) newArray("java.security.Principal", 9);
        Object term109488 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109491 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109496 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term109506 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term109456, term109456.getClass(), "x", -763576148);
        setIntField(term109456, term109456.getClass(), "y", 1568948514);
        setIntField(term109456, term109456.getClass(), "xAbs", -1511130237);
        setIntField(term109456, term109456.getClass(), "yAbs", 452088587);
        setIntField(term109456, term109456.getClass(), "clickCount", -1630069454);
        setBooleanField(term109456, term109456.getClass(), "causedByTouchEvent", true);
        setIntField(term109456, term109456.getClass(), "button", 1499735894);
        setBooleanField(term109456, term109456.getClass(), "popupTrigger", false);
        setBooleanField(term109456, term109456.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term109456, term109456.getClass(), "when", -6823727938421990489L);
        setIntField(term109456, term109456.getClass(), "modifiers", 716486048);
        setBooleanField(term109456, term109456.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term109469, 0, (byte) -112);
        setByteElement(term109469, 1, (byte) 81);
        setByteElement(term109469, 2, (byte) 65);
        setByteElement(term109469, 3, (byte) -44);
        setByteElement(term109469, 4, (byte) 33);
        setByteElement(term109469, 5, (byte) -74);
        setByteElement(term109469, 6, (byte) -84);
        setByteElement(term109469, 7, (byte) -53);
        setByteElement(term109469, 8, (byte) -93);
        setField(term109456, term109456.getClass(), "bdata", term109469);
        setIntField(term109456, term109456.getClass(), "id", -466708718);
        setBooleanField(term109456, term109456.getClass(), "consumed", false);
        setField(term109484, term109484.getClass(), "location", null);
        setField(term109484, term109484.getClass(), "signers", null);
        setField(term109484, term109484.getClass(), "certs", null);
        setField(term109484, term109484.getClass(), "sp", null);
        setField(term109484, term109484.getClass(), "factory", null);
        setField(term109484, term109484.getClass(), "locationNoFragString", null);
        setField(term109483, term109483.getClass(), "codesource", term109484);
        setField(term109483, term109483.getClass(), "classloader", null);
        setField(term109483, term109483.getClass(), "principals", term109485);
        setField(term109483, term109483.getClass(), "permissions", null);
        setBooleanField(term109483, term109483.getClass(), "hasAllPerm", false);
        setBooleanField(term109483, term109483.getClass(), "staticPermissions", false);
        setField(term109483, term109483.getClass(), "key", null);
        setElement(term109482, 0, term109483);
        setField(term109488, term109488.getClass(), "codesource", null);
        setField(term109488, term109488.getClass(), "classloader", null);
        setField(term109488, term109488.getClass(), "principals", null);
        setField(term109488, term109488.getClass(), "permissions", null);
        setBooleanField(term109488, term109488.getClass(), "hasAllPerm", false);
        setBooleanField(term109488, term109488.getClass(), "staticPermissions", false);
        setField(term109488, term109488.getClass(), "key", null);
        setElement(term109482, 1, term109488);
        setField(term109491, term109491.getClass(), "codesource", null);
        setField(term109491, term109491.getClass(), "classloader", null);
        setField(term109491, term109491.getClass(), "principals", null);
        setField(term109491, term109491.getClass(), "permissions", null);
        setBooleanField(term109491, term109491.getClass(), "hasAllPerm", false);
        setBooleanField(term109491, term109491.getClass(), "staticPermissions", false);
        setField(term109491, term109491.getClass(), "key", null);
        setElement(term109482, 2, term109491);
        setField(term109481, term109481.getClass(), "context", term109482);
        setBooleanField(term109481, term109481.getClass(), "isPrivileged", false);
        setBooleanField(term109481, term109481.getClass(), "isAuthorized", false);
        setField(term109496, term109496.getClass(), "context", null);
        setBooleanField(term109496, term109496.getClass(), "isPrivileged", false);
        setBooleanField(term109496, term109496.getClass(), "isAuthorized", false);
        setField(term109496, term109496.getClass(), "privilegedContext", null);
        setField(term109496, term109496.getClass(), "combiner", null);
        setField(term109496, term109496.getClass(), "permissions", null);
        setField(term109496, term109496.getClass(), "parent", null);
        setBooleanField(term109496, term109496.getClass(), "isWrapped", false);
        setBooleanField(term109496, term109496.getClass(), "isLimited", false);
        setField(term109496, term109496.getClass(), "limitedContext", null);
        setField(term109481, term109481.getClass(), "privilegedContext", term109496);
        setField(term109481, term109481.getClass(), "combiner", null);
        setField(term109481, term109481.getClass(), "permissions", null);
        setField(term109481, term109481.getClass(), "parent", null);
        setBooleanField(term109481, term109481.getClass(), "isWrapped", false);
        setBooleanField(term109481, term109481.getClass(), "isLimited", false);
        setField(term109481, term109481.getClass(), "limitedContext", null);
        setField(term109456, term109456.getClass(), "acc", term109481);
        setBooleanField(term109456, term109456.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term109456, term109456.getClass(), "isPosted", false);
        setBooleanField(term109456, term109456.getClass(), "isSystemGenerated", false);
        setField(term109456, term109456.getClass(), "source", term109506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.MouseListenerBuilder$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term109456;
        callMethod(klass, "mouseReleased", argTypes, term109455, args);
    }

};


