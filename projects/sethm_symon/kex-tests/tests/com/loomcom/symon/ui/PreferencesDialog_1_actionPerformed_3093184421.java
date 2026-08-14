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

public class PreferencesDialog_1_actionPerformed_3093184421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16510;
     Object term16511;

    public PreferencesDialog_1_actionPerformed_3093184421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16510 = newInstance(Class.forName("com.loomcom.symon.ui.PreferencesDialog$1"));
        setField(term16510, term16510.getClass(), "this$0", null);
        term16511 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term16526 = (byte[]) newByteArray(6);
        Object term16535 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term16536 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term16537 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term16538 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term16539 = (Object[]) newArray("java.security.Principal", 1);
        Object term16542 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term16545 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term16548 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term16551 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term16554 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term16557 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term16560 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term16565 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term16575 = newInstance(Class.forName("java.lang.Object"));
        setField(term16511, term16511.getClass(), "actionCommand", "JDswTTCZHV");
        setLongField(term16511, term16511.getClass(), "when", -4365849114644724155L);
        setIntField(term16511, term16511.getClass(), "modifiers", 1466373988);
        setByteElement(term16526, 0, (byte) 80);
        setByteElement(term16526, 1, (byte) 42);
        setByteElement(term16526, 2, (byte) 72);
        setByteElement(term16526, 3, (byte) 111);
        setByteElement(term16526, 4, (byte) 99);
        setByteElement(term16526, 5, (byte) -12);
        setField(term16511, term16511.getClass(), "bdata", term16526);
        setIntField(term16511, term16511.getClass(), "id", -358526505);
        setBooleanField(term16511, term16511.getClass(), "consumed", false);
        setField(term16538, term16538.getClass(), "location", null);
        setField(term16538, term16538.getClass(), "signers", null);
        setField(term16538, term16538.getClass(), "certs", null);
        setField(term16538, term16538.getClass(), "sp", null);
        setField(term16538, term16538.getClass(), "factory", null);
        setField(term16538, term16538.getClass(), "locationNoFragString", null);
        setField(term16537, term16537.getClass(), "codesource", term16538);
        setField(term16537, term16537.getClass(), "classloader", null);
        setField(term16537, term16537.getClass(), "principals", term16539);
        setField(term16537, term16537.getClass(), "permissions", null);
        setBooleanField(term16537, term16537.getClass(), "hasAllPerm", false);
        setBooleanField(term16537, term16537.getClass(), "staticPermissions", false);
        setField(term16537, term16537.getClass(), "key", null);
        setElement(term16536, 0, term16537);
        setField(term16542, term16542.getClass(), "codesource", null);
        setField(term16542, term16542.getClass(), "classloader", null);
        setField(term16542, term16542.getClass(), "principals", null);
        setField(term16542, term16542.getClass(), "permissions", null);
        setBooleanField(term16542, term16542.getClass(), "hasAllPerm", false);
        setBooleanField(term16542, term16542.getClass(), "staticPermissions", false);
        setField(term16542, term16542.getClass(), "key", null);
        setElement(term16536, 1, term16542);
        setField(term16545, term16545.getClass(), "codesource", null);
        setField(term16545, term16545.getClass(), "classloader", null);
        setField(term16545, term16545.getClass(), "principals", null);
        setField(term16545, term16545.getClass(), "permissions", null);
        setBooleanField(term16545, term16545.getClass(), "hasAllPerm", false);
        setBooleanField(term16545, term16545.getClass(), "staticPermissions", false);
        setField(term16545, term16545.getClass(), "key", null);
        setElement(term16536, 2, term16545);
        setField(term16548, term16548.getClass(), "codesource", null);
        setField(term16548, term16548.getClass(), "classloader", null);
        setField(term16548, term16548.getClass(), "principals", null);
        setField(term16548, term16548.getClass(), "permissions", null);
        setBooleanField(term16548, term16548.getClass(), "hasAllPerm", false);
        setBooleanField(term16548, term16548.getClass(), "staticPermissions", false);
        setField(term16548, term16548.getClass(), "key", null);
        setElement(term16536, 3, term16548);
        setField(term16551, term16551.getClass(), "codesource", null);
        setField(term16551, term16551.getClass(), "classloader", null);
        setField(term16551, term16551.getClass(), "principals", null);
        setField(term16551, term16551.getClass(), "permissions", null);
        setBooleanField(term16551, term16551.getClass(), "hasAllPerm", false);
        setBooleanField(term16551, term16551.getClass(), "staticPermissions", false);
        setField(term16551, term16551.getClass(), "key", null);
        setElement(term16536, 4, term16551);
        setField(term16554, term16554.getClass(), "codesource", null);
        setField(term16554, term16554.getClass(), "classloader", null);
        setField(term16554, term16554.getClass(), "principals", null);
        setField(term16554, term16554.getClass(), "permissions", null);
        setBooleanField(term16554, term16554.getClass(), "hasAllPerm", false);
        setBooleanField(term16554, term16554.getClass(), "staticPermissions", false);
        setField(term16554, term16554.getClass(), "key", null);
        setElement(term16536, 5, term16554);
        setField(term16557, term16557.getClass(), "codesource", null);
        setField(term16557, term16557.getClass(), "classloader", null);
        setField(term16557, term16557.getClass(), "principals", null);
        setField(term16557, term16557.getClass(), "permissions", null);
        setBooleanField(term16557, term16557.getClass(), "hasAllPerm", false);
        setBooleanField(term16557, term16557.getClass(), "staticPermissions", false);
        setField(term16557, term16557.getClass(), "key", null);
        setElement(term16536, 6, term16557);
        setField(term16560, term16560.getClass(), "codesource", null);
        setField(term16560, term16560.getClass(), "classloader", null);
        setField(term16560, term16560.getClass(), "principals", null);
        setField(term16560, term16560.getClass(), "permissions", null);
        setBooleanField(term16560, term16560.getClass(), "hasAllPerm", false);
        setBooleanField(term16560, term16560.getClass(), "staticPermissions", false);
        setField(term16560, term16560.getClass(), "key", null);
        setElement(term16536, 7, term16560);
        setField(term16535, term16535.getClass(), "context", term16536);
        setBooleanField(term16535, term16535.getClass(), "isPrivileged", true);
        setBooleanField(term16535, term16535.getClass(), "isAuthorized", false);
        setField(term16565, term16565.getClass(), "context", null);
        setBooleanField(term16565, term16565.getClass(), "isPrivileged", false);
        setBooleanField(term16565, term16565.getClass(), "isAuthorized", false);
        setField(term16565, term16565.getClass(), "privilegedContext", null);
        setField(term16565, term16565.getClass(), "combiner", null);
        setField(term16565, term16565.getClass(), "permissions", null);
        setField(term16565, term16565.getClass(), "parent", null);
        setBooleanField(term16565, term16565.getClass(), "isWrapped", false);
        setBooleanField(term16565, term16565.getClass(), "isLimited", false);
        setField(term16565, term16565.getClass(), "limitedContext", null);
        setField(term16535, term16535.getClass(), "privilegedContext", term16565);
        setField(term16535, term16535.getClass(), "combiner", null);
        setField(term16535, term16535.getClass(), "permissions", null);
        setField(term16535, term16535.getClass(), "parent", null);
        setBooleanField(term16535, term16535.getClass(), "isWrapped", false);
        setBooleanField(term16535, term16535.getClass(), "isLimited", false);
        setField(term16535, term16535.getClass(), "limitedContext", null);
        setField(term16511, term16511.getClass(), "acc", term16535);
        setBooleanField(term16511, term16511.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term16511, term16511.getClass(), "isPosted", false);
        setBooleanField(term16511, term16511.getClass(), "isSystemGenerated", false);
        setField(term16511, term16511.getClass(), "source", term16575);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.PreferencesDialog$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term16511;
        callMethod(klass, "actionPerformed", argTypes, term16510, args);
    }

};


