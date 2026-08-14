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

public class MouseListenerBuilder_1_mouseClicked_18150276091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109335;
     Object term109336;

    public MouseListenerBuilder_1_mouseClicked_18150276091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109335 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.MouseListenerBuilder$1"));
        setField(term109335, term109335.getClass(), "val$eventPerformed", null);
        term109336 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term109349 = (byte[]) newByteArray(7);
        Object term109359 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term109360 = (Object[]) newArray("java.security.ProtectionDomain", 3);
        Object term109361 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109362 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term109363 = (Object[]) newArray("java.security.Principal", 6);
        Object term109366 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109369 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109374 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term109384 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term109336, term109336.getClass(), "x", 1671229683);
        setIntField(term109336, term109336.getClass(), "y", 34167717);
        setIntField(term109336, term109336.getClass(), "xAbs", -514195141);
        setIntField(term109336, term109336.getClass(), "yAbs", -297946422);
        setIntField(term109336, term109336.getClass(), "clickCount", 385463636);
        setBooleanField(term109336, term109336.getClass(), "causedByTouchEvent", false);
        setIntField(term109336, term109336.getClass(), "button", -1677599962);
        setBooleanField(term109336, term109336.getClass(), "popupTrigger", false);
        setBooleanField(term109336, term109336.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term109336, term109336.getClass(), "when", -5892135042702373494L);
        setIntField(term109336, term109336.getClass(), "modifiers", -1790275458);
        setBooleanField(term109336, term109336.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term109349, 0, (byte) -97);
        setByteElement(term109349, 1, (byte) -24);
        setByteElement(term109349, 2, (byte) 88);
        setByteElement(term109349, 3, (byte) 96);
        setByteElement(term109349, 4, (byte) 70);
        setByteElement(term109349, 5, (byte) 48);
        setByteElement(term109349, 6, (byte) -46);
        setField(term109336, term109336.getClass(), "bdata", term109349);
        setIntField(term109336, term109336.getClass(), "id", -497534255);
        setBooleanField(term109336, term109336.getClass(), "consumed", false);
        setField(term109362, term109362.getClass(), "location", null);
        setField(term109362, term109362.getClass(), "signers", null);
        setField(term109362, term109362.getClass(), "certs", null);
        setField(term109362, term109362.getClass(), "sp", null);
        setField(term109362, term109362.getClass(), "factory", null);
        setField(term109362, term109362.getClass(), "locationNoFragString", null);
        setField(term109361, term109361.getClass(), "codesource", term109362);
        setField(term109361, term109361.getClass(), "classloader", null);
        setField(term109361, term109361.getClass(), "principals", term109363);
        setField(term109361, term109361.getClass(), "permissions", null);
        setBooleanField(term109361, term109361.getClass(), "hasAllPerm", false);
        setBooleanField(term109361, term109361.getClass(), "staticPermissions", false);
        setField(term109361, term109361.getClass(), "key", null);
        setElement(term109360, 0, term109361);
        setField(term109366, term109366.getClass(), "codesource", null);
        setField(term109366, term109366.getClass(), "classloader", null);
        setField(term109366, term109366.getClass(), "principals", null);
        setField(term109366, term109366.getClass(), "permissions", null);
        setBooleanField(term109366, term109366.getClass(), "hasAllPerm", false);
        setBooleanField(term109366, term109366.getClass(), "staticPermissions", false);
        setField(term109366, term109366.getClass(), "key", null);
        setElement(term109360, 1, term109366);
        setField(term109369, term109369.getClass(), "codesource", null);
        setField(term109369, term109369.getClass(), "classloader", null);
        setField(term109369, term109369.getClass(), "principals", null);
        setField(term109369, term109369.getClass(), "permissions", null);
        setBooleanField(term109369, term109369.getClass(), "hasAllPerm", false);
        setBooleanField(term109369, term109369.getClass(), "staticPermissions", false);
        setField(term109369, term109369.getClass(), "key", null);
        setElement(term109360, 2, term109369);
        setField(term109359, term109359.getClass(), "context", term109360);
        setBooleanField(term109359, term109359.getClass(), "isPrivileged", false);
        setBooleanField(term109359, term109359.getClass(), "isAuthorized", true);
        setField(term109374, term109374.getClass(), "context", null);
        setBooleanField(term109374, term109374.getClass(), "isPrivileged", false);
        setBooleanField(term109374, term109374.getClass(), "isAuthorized", false);
        setField(term109374, term109374.getClass(), "privilegedContext", null);
        setField(term109374, term109374.getClass(), "combiner", null);
        setField(term109374, term109374.getClass(), "permissions", null);
        setField(term109374, term109374.getClass(), "parent", null);
        setBooleanField(term109374, term109374.getClass(), "isWrapped", false);
        setBooleanField(term109374, term109374.getClass(), "isLimited", false);
        setField(term109374, term109374.getClass(), "limitedContext", null);
        setField(term109359, term109359.getClass(), "privilegedContext", term109374);
        setField(term109359, term109359.getClass(), "combiner", null);
        setField(term109359, term109359.getClass(), "permissions", null);
        setField(term109359, term109359.getClass(), "parent", null);
        setBooleanField(term109359, term109359.getClass(), "isWrapped", false);
        setBooleanField(term109359, term109359.getClass(), "isLimited", false);
        setField(term109359, term109359.getClass(), "limitedContext", null);
        setField(term109336, term109336.getClass(), "acc", term109359);
        setBooleanField(term109336, term109336.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term109336, term109336.getClass(), "isPosted", false);
        setBooleanField(term109336, term109336.getClass(), "isSystemGenerated", true);
        setField(term109336, term109336.getClass(), "source", term109384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.MouseListenerBuilder$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term109336;
        callMethod(klass, "mouseClicked", argTypes, term109335, args);
    }

};


