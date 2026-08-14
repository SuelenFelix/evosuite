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

public class ChangeDetectorCustomizer_1_actionPerformed_8073963261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302;
     Object term303;

    public ChangeDetectorCustomizer_1_actionPerformed_8073963261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term302 = newInstance(Class.forName("io.codeworth.panelmatic.util.customizers.ChangeDetectorCustomizer$1"));
        setField(term302, term302.getClass(), "this$0", null);
        term303 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term318 = (byte[]) newByteArray(6);
        Object term327 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term328 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term329 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term330 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term331 = (Object[]) newArray("java.security.Principal", 3);
        Object term334 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term337 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term340 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term348 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term358 = newInstance(Class.forName("java.lang.Object"));
        setField(term303, term303.getClass(), "actionCommand", "jJCZpVmanW");
        setLongField(term303, term303.getClass(), "when", 2442117782898005296L);
        setIntField(term303, term303.getClass(), "modifiers", 1227103734);
        setByteElement(term318, 0, (byte) -66);
        setByteElement(term318, 1, (byte) 83);
        setByteElement(term318, 2, (byte) 74);
        setByteElement(term318, 3, (byte) -71);
        setByteElement(term318, 4, (byte) 49);
        setByteElement(term318, 5, (byte) -54);
        setField(term303, term303.getClass(), "bdata", term318);
        setIntField(term303, term303.getClass(), "id", -1339778481);
        setBooleanField(term303, term303.getClass(), "consumed", false);
        setField(term330, term330.getClass(), "location", null);
        setField(term330, term330.getClass(), "signers", null);
        setField(term330, term330.getClass(), "certs", null);
        setField(term330, term330.getClass(), "sp", null);
        setField(term330, term330.getClass(), "factory", null);
        setField(term330, term330.getClass(), "locationNoFragString", null);
        setField(term329, term329.getClass(), "codesource", term330);
        setField(term329, term329.getClass(), "classloader", null);
        setField(term329, term329.getClass(), "principals", term331);
        setField(term329, term329.getClass(), "permissions", null);
        setBooleanField(term329, term329.getClass(), "hasAllPerm", false);
        setBooleanField(term329, term329.getClass(), "staticPermissions", false);
        setField(term329, term329.getClass(), "key", null);
        setElement(term328, 0, term329);
        setField(term334, term334.getClass(), "codesource", null);
        setField(term334, term334.getClass(), "classloader", null);
        setField(term334, term334.getClass(), "principals", null);
        setField(term334, term334.getClass(), "permissions", null);
        setBooleanField(term334, term334.getClass(), "hasAllPerm", false);
        setBooleanField(term334, term334.getClass(), "staticPermissions", false);
        setField(term334, term334.getClass(), "key", null);
        setElement(term328, 1, term334);
        setField(term337, term337.getClass(), "codesource", null);
        setField(term337, term337.getClass(), "classloader", null);
        setField(term337, term337.getClass(), "principals", null);
        setField(term337, term337.getClass(), "permissions", null);
        setBooleanField(term337, term337.getClass(), "hasAllPerm", false);
        setBooleanField(term337, term337.getClass(), "staticPermissions", false);
        setField(term337, term337.getClass(), "key", null);
        setElement(term328, 2, term337);
        setField(term340, term340.getClass(), "codesource", null);
        setField(term340, term340.getClass(), "classloader", null);
        setField(term340, term340.getClass(), "principals", null);
        setField(term340, term340.getClass(), "permissions", null);
        setBooleanField(term340, term340.getClass(), "hasAllPerm", false);
        setBooleanField(term340, term340.getClass(), "staticPermissions", false);
        setField(term340, term340.getClass(), "key", null);
        setElement(term328, 3, term340);
        setField(term343, term343.getClass(), "codesource", null);
        setField(term343, term343.getClass(), "classloader", null);
        setField(term343, term343.getClass(), "principals", null);
        setField(term343, term343.getClass(), "permissions", null);
        setBooleanField(term343, term343.getClass(), "hasAllPerm", false);
        setBooleanField(term343, term343.getClass(), "staticPermissions", false);
        setField(term343, term343.getClass(), "key", null);
        setElement(term328, 4, term343);
        setField(term327, term327.getClass(), "context", term328);
        setBooleanField(term327, term327.getClass(), "isPrivileged", true);
        setBooleanField(term327, term327.getClass(), "isAuthorized", true);
        setField(term348, term348.getClass(), "context", null);
        setBooleanField(term348, term348.getClass(), "isPrivileged", false);
        setBooleanField(term348, term348.getClass(), "isAuthorized", false);
        setField(term348, term348.getClass(), "privilegedContext", null);
        setField(term348, term348.getClass(), "combiner", null);
        setField(term348, term348.getClass(), "permissions", null);
        setField(term348, term348.getClass(), "parent", null);
        setBooleanField(term348, term348.getClass(), "isWrapped", false);
        setBooleanField(term348, term348.getClass(), "isLimited", false);
        setField(term348, term348.getClass(), "limitedContext", null);
        setField(term327, term327.getClass(), "privilegedContext", term348);
        setField(term327, term327.getClass(), "combiner", null);
        setField(term327, term327.getClass(), "permissions", null);
        setField(term327, term327.getClass(), "parent", null);
        setBooleanField(term327, term327.getClass(), "isWrapped", false);
        setBooleanField(term327, term327.getClass(), "isLimited", false);
        setField(term327, term327.getClass(), "limitedContext", null);
        setField(term303, term303.getClass(), "acc", term327);
        setBooleanField(term303, term303.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term303, term303.getClass(), "isPosted", true);
        setBooleanField(term303, term303.getClass(), "isSystemGenerated", true);
        setField(term303, term303.getClass(), "source", term358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.util.customizers.ChangeDetectorCustomizer$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term303;
        callMethod(klass, "actionPerformed", argTypes, term302, args);
    }

};


