package com.loomcom.symon.ui;

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
import static com.loomcom.symon.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StatusPanel_4_actionPerformed_4252639031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24070;
     Object term24071;

    public StatusPanel_4_actionPerformed_4252639031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24070 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel$4"));
        setField(term24070, term24070.getClass(), "this$0", null);
        term24071 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term24086 = (byte[]) newByteArray(7);
        Object term24096 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term24097 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term24098 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term24099 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term24100 = (Object[]) newArray("java.security.Principal", 5);
        Object term24105 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term24115 = newInstance(Class.forName("java.lang.Object"));
        setField(term24071, term24071.getClass(), "actionCommand", "swZVeJAxjt");
        setLongField(term24071, term24071.getClass(), "when", -7672528020740371001L);
        setIntField(term24071, term24071.getClass(), "modifiers", -1420269858);
        setByteElement(term24086, 0, (byte) -57);
        setByteElement(term24086, 1, (byte) -103);
        setByteElement(term24086, 2, (byte) 98);
        setByteElement(term24086, 3, (byte) 79);
        setByteElement(term24086, 4, (byte) 61);
        setByteElement(term24086, 5, (byte) -92);
        setByteElement(term24086, 6, (byte) -42);
        setField(term24071, term24071.getClass(), "bdata", term24086);
        setIntField(term24071, term24071.getClass(), "id", -2119545015);
        setBooleanField(term24071, term24071.getClass(), "consumed", false);
        setField(term24099, term24099.getClass(), "location", null);
        setField(term24099, term24099.getClass(), "signers", null);
        setField(term24099, term24099.getClass(), "certs", null);
        setField(term24099, term24099.getClass(), "sp", null);
        setField(term24099, term24099.getClass(), "factory", null);
        setField(term24099, term24099.getClass(), "locationNoFragString", null);
        setField(term24098, term24098.getClass(), "codesource", term24099);
        setField(term24098, term24098.getClass(), "classloader", null);
        setField(term24098, term24098.getClass(), "principals", term24100);
        setField(term24098, term24098.getClass(), "permissions", null);
        setBooleanField(term24098, term24098.getClass(), "hasAllPerm", false);
        setBooleanField(term24098, term24098.getClass(), "staticPermissions", false);
        setField(term24098, term24098.getClass(), "key", null);
        setElement(term24097, 0, term24098);
        setField(term24096, term24096.getClass(), "context", term24097);
        setBooleanField(term24096, term24096.getClass(), "isPrivileged", false);
        setBooleanField(term24096, term24096.getClass(), "isAuthorized", true);
        setField(term24105, term24105.getClass(), "context", null);
        setBooleanField(term24105, term24105.getClass(), "isPrivileged", false);
        setBooleanField(term24105, term24105.getClass(), "isAuthorized", false);
        setField(term24105, term24105.getClass(), "privilegedContext", null);
        setField(term24105, term24105.getClass(), "combiner", null);
        setField(term24105, term24105.getClass(), "permissions", null);
        setField(term24105, term24105.getClass(), "parent", null);
        setBooleanField(term24105, term24105.getClass(), "isWrapped", false);
        setBooleanField(term24105, term24105.getClass(), "isLimited", false);
        setField(term24105, term24105.getClass(), "limitedContext", null);
        setField(term24096, term24096.getClass(), "privilegedContext", term24105);
        setField(term24096, term24096.getClass(), "combiner", null);
        setField(term24096, term24096.getClass(), "permissions", null);
        setField(term24096, term24096.getClass(), "parent", null);
        setBooleanField(term24096, term24096.getClass(), "isWrapped", false);
        setBooleanField(term24096, term24096.getClass(), "isLimited", false);
        setField(term24096, term24096.getClass(), "limitedContext", null);
        setField(term24071, term24071.getClass(), "acc", term24096);
        setBooleanField(term24071, term24071.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term24071, term24071.getClass(), "isPosted", false);
        setBooleanField(term24071, term24071.getClass(), "isSystemGenerated", true);
        setField(term24071, term24071.getClass(), "source", term24115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel$4");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term24071;
        callMethod(klass, "actionPerformed", argTypes, term24070, args);
    }

};


