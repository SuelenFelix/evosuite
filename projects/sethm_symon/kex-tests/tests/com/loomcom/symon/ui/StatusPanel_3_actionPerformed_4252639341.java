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

public class StatusPanel_3_actionPerformed_4252639341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21046;
     Object term21047;

    public StatusPanel_3_actionPerformed_4252639341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21046 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel$3"));
        setField(term21046, term21046.getClass(), "this$0", null);
        term21047 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term21062 = (byte[]) newByteArray(1);
        Object term21066 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term21067 = (Object[]) newArray("java.security.ProtectionDomain", 0);
        Object term21070 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term21071 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term21072 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term21077 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term21089 = newInstance(Class.forName("java.lang.Object"));
        setField(term21047, term21047.getClass(), "actionCommand", "HqBOwkVqjD");
        setLongField(term21047, term21047.getClass(), "when", 7009926388951271268L);
        setIntField(term21047, term21047.getClass(), "modifiers", -868676396);
        setByteElement(term21062, 0, (byte) 106);
        setField(term21047, term21047.getClass(), "bdata", term21062);
        setIntField(term21047, term21047.getClass(), "id", 1922684808);
        setBooleanField(term21047, term21047.getClass(), "consumed", false);
        setField(term21066, term21066.getClass(), "context", term21067);
        setBooleanField(term21066, term21066.getClass(), "isPrivileged", true);
        setBooleanField(term21066, term21066.getClass(), "isAuthorized", true);
        setField(term21072, term21072.getClass(), "codesource", null);
        setField(term21072, term21072.getClass(), "classloader", null);
        setField(term21072, term21072.getClass(), "principals", null);
        setField(term21072, term21072.getClass(), "permissions", null);
        setBooleanField(term21072, term21072.getClass(), "hasAllPerm", false);
        setBooleanField(term21072, term21072.getClass(), "staticPermissions", false);
        setField(term21072, term21072.getClass(), "key", null);
        setElement(term21071, 0, term21072);
        setField(term21070, term21070.getClass(), "context", term21071);
        setBooleanField(term21070, term21070.getClass(), "isPrivileged", false);
        setBooleanField(term21070, term21070.getClass(), "isAuthorized", true);
        setField(term21077, term21077.getClass(), "context", null);
        setBooleanField(term21077, term21077.getClass(), "isPrivileged", false);
        setBooleanField(term21077, term21077.getClass(), "isAuthorized", false);
        setField(term21077, term21077.getClass(), "privilegedContext", null);
        setField(term21077, term21077.getClass(), "combiner", null);
        setField(term21077, term21077.getClass(), "permissions", null);
        setField(term21077, term21077.getClass(), "parent", null);
        setBooleanField(term21077, term21077.getClass(), "isWrapped", false);
        setBooleanField(term21077, term21077.getClass(), "isLimited", false);
        setField(term21077, term21077.getClass(), "limitedContext", null);
        setField(term21070, term21070.getClass(), "privilegedContext", term21077);
        setField(term21070, term21070.getClass(), "combiner", null);
        setField(term21070, term21070.getClass(), "permissions", null);
        setField(term21070, term21070.getClass(), "parent", null);
        setBooleanField(term21070, term21070.getClass(), "isWrapped", false);
        setBooleanField(term21070, term21070.getClass(), "isLimited", false);
        setField(term21070, term21070.getClass(), "limitedContext", null);
        setField(term21066, term21066.getClass(), "privilegedContext", term21070);
        setField(term21066, term21066.getClass(), "combiner", null);
        setField(term21066, term21066.getClass(), "permissions", null);
        setField(term21066, term21066.getClass(), "parent", null);
        setBooleanField(term21066, term21066.getClass(), "isWrapped", false);
        setBooleanField(term21066, term21066.getClass(), "isLimited", false);
        setField(term21066, term21066.getClass(), "limitedContext", null);
        setField(term21047, term21047.getClass(), "acc", term21066);
        setBooleanField(term21047, term21047.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term21047, term21047.getClass(), "isPosted", true);
        setBooleanField(term21047, term21047.getClass(), "isSystemGenerated", false);
        setField(term21047, term21047.getClass(), "source", term21089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term21047;
        callMethod(klass, "actionPerformed", argTypes, term21046, args);
    }

};


