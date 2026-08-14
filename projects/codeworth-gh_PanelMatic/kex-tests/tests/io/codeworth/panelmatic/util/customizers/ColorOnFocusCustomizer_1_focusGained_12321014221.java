package io.codeworth.panelmatic.util.customizers;

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
import static io.codeworth.panelmatic.util.customizers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ColorOnFocusCustomizer_1_focusGained_12321014221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102;
     Object term103;

    public ColorOnFocusCustomizer_1_focusGained_12321014221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102 = newInstance(Class.forName("io.codeworth.panelmatic.util.customizers.ColorOnFocusCustomizer$1"));
        setField(term102, term102.getClass(), "this$0", null);
        term103 = newInstance(Class.forName("java.awt.event.FocusEvent"));
        Object term104 = newInstance(Class.forName("java.awt.event.FocusEvent$Cause"));
        byte[] term133 = (byte[]) newByteArray(5);
        Object term141 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term142 = (Object[]) newArray("java.security.ProtectionDomain", 4);
        Object term143 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term144 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term145 = (Object[]) newArray("java.security.Principal", 1);
        Object term148 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term151 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term154 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term159 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term169 = newInstance(Class.forName("java.lang.Object"));
        setField(term104, term104.getClass(), "name", "CLEAR_GLOBAL_FOCUS_OWNER");
        setIntField(term104, term104.getClass(), "ordinal", 10);
        setField(term103, term103.getClass(), "cause", term104);
        setBooleanField(term103, term103.getClass(), "temporary", false);
        setField(term103, term103.getClass(), "opposite", null);
        setByteElement(term133, 0, (byte) 47);
        setByteElement(term133, 1, (byte) 48);
        setByteElement(term133, 2, (byte) 89);
        setByteElement(term133, 3, (byte) 75);
        setByteElement(term133, 4, (byte) 18);
        setField(term103, term103.getClass(), "bdata", term133);
        setIntField(term103, term103.getClass(), "id", 568599855);
        setBooleanField(term103, term103.getClass(), "consumed", true);
        setField(term144, term144.getClass(), "location", null);
        setField(term144, term144.getClass(), "signers", null);
        setField(term144, term144.getClass(), "certs", null);
        setField(term144, term144.getClass(), "sp", null);
        setField(term144, term144.getClass(), "factory", null);
        setField(term144, term144.getClass(), "locationNoFragString", null);
        setField(term143, term143.getClass(), "codesource", term144);
        setField(term143, term143.getClass(), "classloader", null);
        setField(term143, term143.getClass(), "principals", term145);
        setField(term143, term143.getClass(), "permissions", null);
        setBooleanField(term143, term143.getClass(), "hasAllPerm", false);
        setBooleanField(term143, term143.getClass(), "staticPermissions", false);
        setField(term143, term143.getClass(), "key", null);
        setElement(term142, 0, term143);
        setField(term148, term148.getClass(), "codesource", null);
        setField(term148, term148.getClass(), "classloader", null);
        setField(term148, term148.getClass(), "principals", null);
        setField(term148, term148.getClass(), "permissions", null);
        setBooleanField(term148, term148.getClass(), "hasAllPerm", false);
        setBooleanField(term148, term148.getClass(), "staticPermissions", false);
        setField(term148, term148.getClass(), "key", null);
        setElement(term142, 1, term148);
        setField(term151, term151.getClass(), "codesource", null);
        setField(term151, term151.getClass(), "classloader", null);
        setField(term151, term151.getClass(), "principals", null);
        setField(term151, term151.getClass(), "permissions", null);
        setBooleanField(term151, term151.getClass(), "hasAllPerm", false);
        setBooleanField(term151, term151.getClass(), "staticPermissions", false);
        setField(term151, term151.getClass(), "key", null);
        setElement(term142, 2, term151);
        setField(term154, term154.getClass(), "codesource", null);
        setField(term154, term154.getClass(), "classloader", null);
        setField(term154, term154.getClass(), "principals", null);
        setField(term154, term154.getClass(), "permissions", null);
        setBooleanField(term154, term154.getClass(), "hasAllPerm", false);
        setBooleanField(term154, term154.getClass(), "staticPermissions", false);
        setField(term154, term154.getClass(), "key", null);
        setElement(term142, 3, term154);
        setField(term141, term141.getClass(), "context", term142);
        setBooleanField(term141, term141.getClass(), "isPrivileged", true);
        setBooleanField(term141, term141.getClass(), "isAuthorized", false);
        setField(term159, term159.getClass(), "context", null);
        setBooleanField(term159, term159.getClass(), "isPrivileged", false);
        setBooleanField(term159, term159.getClass(), "isAuthorized", false);
        setField(term159, term159.getClass(), "privilegedContext", null);
        setField(term159, term159.getClass(), "combiner", null);
        setField(term159, term159.getClass(), "permissions", null);
        setField(term159, term159.getClass(), "parent", null);
        setBooleanField(term159, term159.getClass(), "isWrapped", false);
        setBooleanField(term159, term159.getClass(), "isLimited", false);
        setField(term159, term159.getClass(), "limitedContext", null);
        setField(term141, term141.getClass(), "privilegedContext", term159);
        setField(term141, term141.getClass(), "combiner", null);
        setField(term141, term141.getClass(), "permissions", null);
        setField(term141, term141.getClass(), "parent", null);
        setBooleanField(term141, term141.getClass(), "isWrapped", false);
        setBooleanField(term141, term141.getClass(), "isLimited", false);
        setField(term141, term141.getClass(), "limitedContext", null);
        setField(term103, term103.getClass(), "acc", term141);
        setBooleanField(term103, term103.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term103, term103.getClass(), "isPosted", false);
        setBooleanField(term103, term103.getClass(), "isSystemGenerated", false);
        setField(term103, term103.getClass(), "source", term169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.util.customizers.ColorOnFocusCustomizer$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.FocusEvent");
        Object[] args = new Object[1];
        args[0] = term103;
        callMethod(klass, "focusGained", argTypes, term102, args);
    }

};


