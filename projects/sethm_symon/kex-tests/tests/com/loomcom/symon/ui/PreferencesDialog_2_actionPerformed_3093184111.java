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

public class PreferencesDialog_2_actionPerformed_3093184111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17112;
     Object term17113;

    public PreferencesDialog_2_actionPerformed_3093184111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17112 = newInstance(Class.forName("com.loomcom.symon.ui.PreferencesDialog$2"));
        setField(term17112, term17112.getClass(), "this$0", null);
        term17113 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term17128 = (byte[]) newByteArray(9);
        Object term17140 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term17141 = (Object[]) newArray("java.security.ProtectionDomain", 7);
        Object term17142 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term17143 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term17144 = (Object[]) newArray("java.security.Principal", 3);
        Object term17147 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term17150 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term17153 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term17156 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term17159 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term17162 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term17167 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term17177 = newInstance(Class.forName("java.lang.Object"));
        setField(term17113, term17113.getClass(), "actionCommand", "ytSBIKXogI");
        setLongField(term17113, term17113.getClass(), "when", 2486810210675247493L);
        setIntField(term17113, term17113.getClass(), "modifiers", -1697741155);
        setByteElement(term17128, 0, (byte) -61);
        setByteElement(term17128, 1, (byte) -85);
        setByteElement(term17128, 2, (byte) -22);
        setByteElement(term17128, 3, (byte) 93);
        setByteElement(term17128, 4, (byte) 69);
        setByteElement(term17128, 5, (byte) -74);
        setByteElement(term17128, 6, (byte) -123);
        setByteElement(term17128, 7, (byte) -23);
        setByteElement(term17128, 8, (byte) 100);
        setField(term17113, term17113.getClass(), "bdata", term17128);
        setIntField(term17113, term17113.getClass(), "id", 1295839803);
        setBooleanField(term17113, term17113.getClass(), "consumed", true);
        setField(term17143, term17143.getClass(), "location", null);
        setField(term17143, term17143.getClass(), "signers", null);
        setField(term17143, term17143.getClass(), "certs", null);
        setField(term17143, term17143.getClass(), "sp", null);
        setField(term17143, term17143.getClass(), "factory", null);
        setField(term17143, term17143.getClass(), "locationNoFragString", null);
        setField(term17142, term17142.getClass(), "codesource", term17143);
        setField(term17142, term17142.getClass(), "classloader", null);
        setField(term17142, term17142.getClass(), "principals", term17144);
        setField(term17142, term17142.getClass(), "permissions", null);
        setBooleanField(term17142, term17142.getClass(), "hasAllPerm", false);
        setBooleanField(term17142, term17142.getClass(), "staticPermissions", false);
        setField(term17142, term17142.getClass(), "key", null);
        setElement(term17141, 0, term17142);
        setField(term17147, term17147.getClass(), "codesource", null);
        setField(term17147, term17147.getClass(), "classloader", null);
        setField(term17147, term17147.getClass(), "principals", null);
        setField(term17147, term17147.getClass(), "permissions", null);
        setBooleanField(term17147, term17147.getClass(), "hasAllPerm", false);
        setBooleanField(term17147, term17147.getClass(), "staticPermissions", false);
        setField(term17147, term17147.getClass(), "key", null);
        setElement(term17141, 1, term17147);
        setField(term17150, term17150.getClass(), "codesource", null);
        setField(term17150, term17150.getClass(), "classloader", null);
        setField(term17150, term17150.getClass(), "principals", null);
        setField(term17150, term17150.getClass(), "permissions", null);
        setBooleanField(term17150, term17150.getClass(), "hasAllPerm", false);
        setBooleanField(term17150, term17150.getClass(), "staticPermissions", false);
        setField(term17150, term17150.getClass(), "key", null);
        setElement(term17141, 2, term17150);
        setField(term17153, term17153.getClass(), "codesource", null);
        setField(term17153, term17153.getClass(), "classloader", null);
        setField(term17153, term17153.getClass(), "principals", null);
        setField(term17153, term17153.getClass(), "permissions", null);
        setBooleanField(term17153, term17153.getClass(), "hasAllPerm", false);
        setBooleanField(term17153, term17153.getClass(), "staticPermissions", false);
        setField(term17153, term17153.getClass(), "key", null);
        setElement(term17141, 3, term17153);
        setField(term17156, term17156.getClass(), "codesource", null);
        setField(term17156, term17156.getClass(), "classloader", null);
        setField(term17156, term17156.getClass(), "principals", null);
        setField(term17156, term17156.getClass(), "permissions", null);
        setBooleanField(term17156, term17156.getClass(), "hasAllPerm", false);
        setBooleanField(term17156, term17156.getClass(), "staticPermissions", false);
        setField(term17156, term17156.getClass(), "key", null);
        setElement(term17141, 4, term17156);
        setField(term17159, term17159.getClass(), "codesource", null);
        setField(term17159, term17159.getClass(), "classloader", null);
        setField(term17159, term17159.getClass(), "principals", null);
        setField(term17159, term17159.getClass(), "permissions", null);
        setBooleanField(term17159, term17159.getClass(), "hasAllPerm", false);
        setBooleanField(term17159, term17159.getClass(), "staticPermissions", false);
        setField(term17159, term17159.getClass(), "key", null);
        setElement(term17141, 5, term17159);
        setField(term17162, term17162.getClass(), "codesource", null);
        setField(term17162, term17162.getClass(), "classloader", null);
        setField(term17162, term17162.getClass(), "principals", null);
        setField(term17162, term17162.getClass(), "permissions", null);
        setBooleanField(term17162, term17162.getClass(), "hasAllPerm", false);
        setBooleanField(term17162, term17162.getClass(), "staticPermissions", false);
        setField(term17162, term17162.getClass(), "key", null);
        setElement(term17141, 6, term17162);
        setField(term17140, term17140.getClass(), "context", term17141);
        setBooleanField(term17140, term17140.getClass(), "isPrivileged", false);
        setBooleanField(term17140, term17140.getClass(), "isAuthorized", false);
        setField(term17167, term17167.getClass(), "context", null);
        setBooleanField(term17167, term17167.getClass(), "isPrivileged", false);
        setBooleanField(term17167, term17167.getClass(), "isAuthorized", false);
        setField(term17167, term17167.getClass(), "privilegedContext", null);
        setField(term17167, term17167.getClass(), "combiner", null);
        setField(term17167, term17167.getClass(), "permissions", null);
        setField(term17167, term17167.getClass(), "parent", null);
        setBooleanField(term17167, term17167.getClass(), "isWrapped", false);
        setBooleanField(term17167, term17167.getClass(), "isLimited", false);
        setField(term17167, term17167.getClass(), "limitedContext", null);
        setField(term17140, term17140.getClass(), "privilegedContext", term17167);
        setField(term17140, term17140.getClass(), "combiner", null);
        setField(term17140, term17140.getClass(), "permissions", null);
        setField(term17140, term17140.getClass(), "parent", null);
        setBooleanField(term17140, term17140.getClass(), "isWrapped", false);
        setBooleanField(term17140, term17140.getClass(), "isLimited", false);
        setField(term17140, term17140.getClass(), "limitedContext", null);
        setField(term17113, term17113.getClass(), "acc", term17140);
        setBooleanField(term17113, term17113.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term17113, term17113.getClass(), "isPosted", false);
        setBooleanField(term17113, term17113.getClass(), "isSystemGenerated", false);
        setField(term17113, term17113.getClass(), "source", term17177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.PreferencesDialog$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term17113;
        callMethod(klass, "actionPerformed", argTypes, term17112, args);
    }

};


