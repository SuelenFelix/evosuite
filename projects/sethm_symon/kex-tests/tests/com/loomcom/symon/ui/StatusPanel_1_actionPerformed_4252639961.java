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

public class StatusPanel_1_actionPerformed_4252639961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30136;
     Object term30137;

    public StatusPanel_1_actionPerformed_4252639961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30136 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel$1"));
        setField(term30136, term30136.getClass(), "this$0", null);
        term30137 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term30152 = (byte[]) newByteArray(1);
        Object term30156 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term30157 = (Object[]) newArray("java.security.ProtectionDomain", 3);
        Object term30158 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term30159 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term30160 = (Object[]) newArray("java.security.Principal", 7);
        Object term30163 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term30166 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term30171 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term30181 = newInstance(Class.forName("java.lang.Object"));
        setField(term30137, term30137.getClass(), "actionCommand", "EeBVbzjcCI");
        setLongField(term30137, term30137.getClass(), "when", 1967728129628047933L);
        setIntField(term30137, term30137.getClass(), "modifiers", 768407648);
        setByteElement(term30152, 0, (byte) -91);
        setField(term30137, term30137.getClass(), "bdata", term30152);
        setIntField(term30137, term30137.getClass(), "id", -350454594);
        setBooleanField(term30137, term30137.getClass(), "consumed", true);
        setField(term30159, term30159.getClass(), "location", null);
        setField(term30159, term30159.getClass(), "signers", null);
        setField(term30159, term30159.getClass(), "certs", null);
        setField(term30159, term30159.getClass(), "sp", null);
        setField(term30159, term30159.getClass(), "factory", null);
        setField(term30159, term30159.getClass(), "locationNoFragString", null);
        setField(term30158, term30158.getClass(), "codesource", term30159);
        setField(term30158, term30158.getClass(), "classloader", null);
        setField(term30158, term30158.getClass(), "principals", term30160);
        setField(term30158, term30158.getClass(), "permissions", null);
        setBooleanField(term30158, term30158.getClass(), "hasAllPerm", false);
        setBooleanField(term30158, term30158.getClass(), "staticPermissions", false);
        setField(term30158, term30158.getClass(), "key", null);
        setElement(term30157, 0, term30158);
        setField(term30163, term30163.getClass(), "codesource", null);
        setField(term30163, term30163.getClass(), "classloader", null);
        setField(term30163, term30163.getClass(), "principals", null);
        setField(term30163, term30163.getClass(), "permissions", null);
        setBooleanField(term30163, term30163.getClass(), "hasAllPerm", false);
        setBooleanField(term30163, term30163.getClass(), "staticPermissions", false);
        setField(term30163, term30163.getClass(), "key", null);
        setElement(term30157, 1, term30163);
        setField(term30166, term30166.getClass(), "codesource", null);
        setField(term30166, term30166.getClass(), "classloader", null);
        setField(term30166, term30166.getClass(), "principals", null);
        setField(term30166, term30166.getClass(), "permissions", null);
        setBooleanField(term30166, term30166.getClass(), "hasAllPerm", false);
        setBooleanField(term30166, term30166.getClass(), "staticPermissions", false);
        setField(term30166, term30166.getClass(), "key", null);
        setElement(term30157, 2, term30166);
        setField(term30156, term30156.getClass(), "context", term30157);
        setBooleanField(term30156, term30156.getClass(), "isPrivileged", true);
        setBooleanField(term30156, term30156.getClass(), "isAuthorized", true);
        setField(term30171, term30171.getClass(), "context", null);
        setBooleanField(term30171, term30171.getClass(), "isPrivileged", false);
        setBooleanField(term30171, term30171.getClass(), "isAuthorized", false);
        setField(term30171, term30171.getClass(), "privilegedContext", null);
        setField(term30171, term30171.getClass(), "combiner", null);
        setField(term30171, term30171.getClass(), "permissions", null);
        setField(term30171, term30171.getClass(), "parent", null);
        setBooleanField(term30171, term30171.getClass(), "isWrapped", false);
        setBooleanField(term30171, term30171.getClass(), "isLimited", false);
        setField(term30171, term30171.getClass(), "limitedContext", null);
        setField(term30156, term30156.getClass(), "privilegedContext", term30171);
        setField(term30156, term30156.getClass(), "combiner", null);
        setField(term30156, term30156.getClass(), "permissions", null);
        setField(term30156, term30156.getClass(), "parent", null);
        setBooleanField(term30156, term30156.getClass(), "isWrapped", false);
        setBooleanField(term30156, term30156.getClass(), "isLimited", false);
        setField(term30156, term30156.getClass(), "limitedContext", null);
        setField(term30137, term30137.getClass(), "acc", term30156);
        setBooleanField(term30137, term30137.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term30137, term30137.getClass(), "isPosted", true);
        setBooleanField(term30137, term30137.getClass(), "isSystemGenerated", true);
        setField(term30137, term30137.getClass(), "source", term30181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term30137;
        callMethod(klass, "actionPerformed", argTypes, term30136, args);
    }

};


