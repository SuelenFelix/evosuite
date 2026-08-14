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

public class ColorOnFocusCustomizer_1_focusLost_5849765242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199;
     Object term200;

    public ColorOnFocusCustomizer_1_focusLost_5849765242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199 = newInstance(Class.forName("io.codeworth.panelmatic.util.customizers.ColorOnFocusCustomizer$1"));
        setField(term199, term199.getClass(), "this$0", null);
        term200 = newInstance(Class.forName("java.awt.event.FocusEvent"));
        Object term201 = newInstance(Class.forName("java.awt.event.FocusEvent$Cause"));
        byte[] term213 = (byte[]) newByteArray(6);
        Object term222 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term223 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term224 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term226 = (Object[]) newArray("java.security.Principal", 1);
        Object term229 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term234 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term244 = newInstance(Class.forName("java.lang.Object"));
        setField(term201, term201.getClass(), "name", "UNKNOWN");
        setIntField(term201, term201.getClass(), "ordinal", 0);
        setField(term200, term200.getClass(), "cause", term201);
        setBooleanField(term200, term200.getClass(), "temporary", true);
        setField(term200, term200.getClass(), "opposite", null);
        setByteElement(term213, 0, (byte) -58);
        setByteElement(term213, 1, (byte) -29);
        setByteElement(term213, 2, (byte) -54);
        setByteElement(term213, 3, (byte) -10);
        setByteElement(term213, 4, (byte) 79);
        setByteElement(term213, 5, (byte) -119);
        setField(term200, term200.getClass(), "bdata", term213);
        setIntField(term200, term200.getClass(), "id", -1922583790);
        setBooleanField(term200, term200.getClass(), "consumed", true);
        setField(term225, term225.getClass(), "location", null);
        setField(term225, term225.getClass(), "signers", null);
        setField(term225, term225.getClass(), "certs", null);
        setField(term225, term225.getClass(), "sp", null);
        setField(term225, term225.getClass(), "factory", null);
        setField(term225, term225.getClass(), "locationNoFragString", null);
        setField(term224, term224.getClass(), "codesource", term225);
        setField(term224, term224.getClass(), "classloader", null);
        setField(term224, term224.getClass(), "principals", term226);
        setField(term224, term224.getClass(), "permissions", null);
        setBooleanField(term224, term224.getClass(), "hasAllPerm", false);
        setBooleanField(term224, term224.getClass(), "staticPermissions", false);
        setField(term224, term224.getClass(), "key", null);
        setElement(term223, 0, term224);
        setField(term229, term229.getClass(), "codesource", null);
        setField(term229, term229.getClass(), "classloader", null);
        setField(term229, term229.getClass(), "principals", null);
        setField(term229, term229.getClass(), "permissions", null);
        setBooleanField(term229, term229.getClass(), "hasAllPerm", false);
        setBooleanField(term229, term229.getClass(), "staticPermissions", false);
        setField(term229, term229.getClass(), "key", null);
        setElement(term223, 1, term229);
        setField(term222, term222.getClass(), "context", term223);
        setBooleanField(term222, term222.getClass(), "isPrivileged", false);
        setBooleanField(term222, term222.getClass(), "isAuthorized", true);
        setField(term234, term234.getClass(), "context", null);
        setBooleanField(term234, term234.getClass(), "isPrivileged", false);
        setBooleanField(term234, term234.getClass(), "isAuthorized", false);
        setField(term234, term234.getClass(), "privilegedContext", null);
        setField(term234, term234.getClass(), "combiner", null);
        setField(term234, term234.getClass(), "permissions", null);
        setField(term234, term234.getClass(), "parent", null);
        setBooleanField(term234, term234.getClass(), "isWrapped", false);
        setBooleanField(term234, term234.getClass(), "isLimited", false);
        setField(term234, term234.getClass(), "limitedContext", null);
        setField(term222, term222.getClass(), "privilegedContext", term234);
        setField(term222, term222.getClass(), "combiner", null);
        setField(term222, term222.getClass(), "permissions", null);
        setField(term222, term222.getClass(), "parent", null);
        setBooleanField(term222, term222.getClass(), "isWrapped", false);
        setBooleanField(term222, term222.getClass(), "isLimited", false);
        setField(term222, term222.getClass(), "limitedContext", null);
        setField(term200, term200.getClass(), "acc", term222);
        setBooleanField(term200, term200.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term200, term200.getClass(), "isPosted", true);
        setBooleanField(term200, term200.getClass(), "isSystemGenerated", true);
        setField(term200, term200.getClass(), "source", term244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.util.customizers.ColorOnFocusCustomizer$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.FocusEvent");
        Object[] args = new Object[1];
        args[0] = term200;
        callMethod(klass, "focusLost", argTypes, term199, args);
    }

};


