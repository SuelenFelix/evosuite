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

public class MouseListenerBuilder_1_mouseEntered_7079870174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109516;
     Object term109517;

    public MouseListenerBuilder_1_mouseEntered_7079870174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109516 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.MouseListenerBuilder$1"));
        setField(term109516, term109516.getClass(), "val$eventPerformed", null);
        term109517 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term109530 = (byte[]) newByteArray(7);
        Object term109540 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term109541 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term109542 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109543 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term109544 = (Object[]) newArray("java.security.Principal", 2);
        Object term109549 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term109559 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term109517, term109517.getClass(), "x", 1431951992);
        setIntField(term109517, term109517.getClass(), "y", -1608123016);
        setIntField(term109517, term109517.getClass(), "xAbs", -896473214);
        setIntField(term109517, term109517.getClass(), "yAbs", 401203924);
        setIntField(term109517, term109517.getClass(), "clickCount", -1212399479);
        setBooleanField(term109517, term109517.getClass(), "causedByTouchEvent", true);
        setIntField(term109517, term109517.getClass(), "button", 2107679041);
        setBooleanField(term109517, term109517.getClass(), "popupTrigger", false);
        setBooleanField(term109517, term109517.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term109517, term109517.getClass(), "when", -484994522244390100L);
        setIntField(term109517, term109517.getClass(), "modifiers", 2040965507);
        setBooleanField(term109517, term109517.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term109530, 0, (byte) 82);
        setByteElement(term109530, 1, (byte) -89);
        setByteElement(term109530, 2, (byte) 24);
        setByteElement(term109530, 3, (byte) 123);
        setByteElement(term109530, 4, (byte) -101);
        setByteElement(term109530, 5, (byte) -102);
        setByteElement(term109530, 6, (byte) -95);
        setField(term109517, term109517.getClass(), "bdata", term109530);
        setIntField(term109517, term109517.getClass(), "id", -1281083262);
        setBooleanField(term109517, term109517.getClass(), "consumed", false);
        setField(term109543, term109543.getClass(), "location", null);
        setField(term109543, term109543.getClass(), "signers", null);
        setField(term109543, term109543.getClass(), "certs", null);
        setField(term109543, term109543.getClass(), "sp", null);
        setField(term109543, term109543.getClass(), "factory", null);
        setField(term109543, term109543.getClass(), "locationNoFragString", null);
        setField(term109542, term109542.getClass(), "codesource", term109543);
        setField(term109542, term109542.getClass(), "classloader", null);
        setField(term109542, term109542.getClass(), "principals", term109544);
        setField(term109542, term109542.getClass(), "permissions", null);
        setBooleanField(term109542, term109542.getClass(), "hasAllPerm", false);
        setBooleanField(term109542, term109542.getClass(), "staticPermissions", false);
        setField(term109542, term109542.getClass(), "key", null);
        setElement(term109541, 0, term109542);
        setField(term109540, term109540.getClass(), "context", term109541);
        setBooleanField(term109540, term109540.getClass(), "isPrivileged", true);
        setBooleanField(term109540, term109540.getClass(), "isAuthorized", true);
        setField(term109549, term109549.getClass(), "context", null);
        setBooleanField(term109549, term109549.getClass(), "isPrivileged", false);
        setBooleanField(term109549, term109549.getClass(), "isAuthorized", false);
        setField(term109549, term109549.getClass(), "privilegedContext", null);
        setField(term109549, term109549.getClass(), "combiner", null);
        setField(term109549, term109549.getClass(), "permissions", null);
        setField(term109549, term109549.getClass(), "parent", null);
        setBooleanField(term109549, term109549.getClass(), "isWrapped", false);
        setBooleanField(term109549, term109549.getClass(), "isLimited", false);
        setField(term109549, term109549.getClass(), "limitedContext", null);
        setField(term109540, term109540.getClass(), "privilegedContext", term109549);
        setField(term109540, term109540.getClass(), "combiner", null);
        setField(term109540, term109540.getClass(), "permissions", null);
        setField(term109540, term109540.getClass(), "parent", null);
        setBooleanField(term109540, term109540.getClass(), "isWrapped", false);
        setBooleanField(term109540, term109540.getClass(), "isLimited", false);
        setField(term109540, term109540.getClass(), "limitedContext", null);
        setField(term109517, term109517.getClass(), "acc", term109540);
        setBooleanField(term109517, term109517.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term109517, term109517.getClass(), "isPosted", true);
        setBooleanField(term109517, term109517.getClass(), "isSystemGenerated", true);
        setField(term109517, term109517.getClass(), "source", term109559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.MouseListenerBuilder$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term109517;
        callMethod(klass, "mouseEntered", argTypes, term109516, args);
    }

};


