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

public class StatusPanel_5_actionPerformed_4252638721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27119;
     Object term27120;

    public StatusPanel_5_actionPerformed_4252638721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27119 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel$5"));
        setField(term27119, term27119.getClass(), "this$0", null);
        term27120 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term27135 = (byte[]) newByteArray(5);
        Object term27143 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term27144 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term27145 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term27146 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term27147 = (Object[]) newArray("java.security.Principal", 2);
        Object term27150 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term27153 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term27156 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term27159 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term27162 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term27167 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term27177 = newInstance(Class.forName("java.lang.Object"));
        setField(term27120, term27120.getClass(), "actionCommand", "dpNsDgfPso");
        setLongField(term27120, term27120.getClass(), "when", -4502405999831680926L);
        setIntField(term27120, term27120.getClass(), "modifiers", 719656595);
        setByteElement(term27135, 0, (byte) 116);
        setByteElement(term27135, 1, (byte) -81);
        setByteElement(term27135, 2, (byte) 102);
        setByteElement(term27135, 3, (byte) -118);
        setByteElement(term27135, 4, (byte) -126);
        setField(term27120, term27120.getClass(), "bdata", term27135);
        setIntField(term27120, term27120.getClass(), "id", -1516995753);
        setBooleanField(term27120, term27120.getClass(), "consumed", true);
        setField(term27146, term27146.getClass(), "location", null);
        setField(term27146, term27146.getClass(), "signers", null);
        setField(term27146, term27146.getClass(), "certs", null);
        setField(term27146, term27146.getClass(), "sp", null);
        setField(term27146, term27146.getClass(), "factory", null);
        setField(term27146, term27146.getClass(), "locationNoFragString", null);
        setField(term27145, term27145.getClass(), "codesource", term27146);
        setField(term27145, term27145.getClass(), "classloader", null);
        setField(term27145, term27145.getClass(), "principals", term27147);
        setField(term27145, term27145.getClass(), "permissions", null);
        setBooleanField(term27145, term27145.getClass(), "hasAllPerm", false);
        setBooleanField(term27145, term27145.getClass(), "staticPermissions", false);
        setField(term27145, term27145.getClass(), "key", null);
        setElement(term27144, 0, term27145);
        setField(term27150, term27150.getClass(), "codesource", null);
        setField(term27150, term27150.getClass(), "classloader", null);
        setField(term27150, term27150.getClass(), "principals", null);
        setField(term27150, term27150.getClass(), "permissions", null);
        setBooleanField(term27150, term27150.getClass(), "hasAllPerm", false);
        setBooleanField(term27150, term27150.getClass(), "staticPermissions", false);
        setField(term27150, term27150.getClass(), "key", null);
        setElement(term27144, 1, term27150);
        setField(term27153, term27153.getClass(), "codesource", null);
        setField(term27153, term27153.getClass(), "classloader", null);
        setField(term27153, term27153.getClass(), "principals", null);
        setField(term27153, term27153.getClass(), "permissions", null);
        setBooleanField(term27153, term27153.getClass(), "hasAllPerm", false);
        setBooleanField(term27153, term27153.getClass(), "staticPermissions", false);
        setField(term27153, term27153.getClass(), "key", null);
        setElement(term27144, 2, term27153);
        setField(term27156, term27156.getClass(), "codesource", null);
        setField(term27156, term27156.getClass(), "classloader", null);
        setField(term27156, term27156.getClass(), "principals", null);
        setField(term27156, term27156.getClass(), "permissions", null);
        setBooleanField(term27156, term27156.getClass(), "hasAllPerm", false);
        setBooleanField(term27156, term27156.getClass(), "staticPermissions", false);
        setField(term27156, term27156.getClass(), "key", null);
        setElement(term27144, 3, term27156);
        setField(term27159, term27159.getClass(), "codesource", null);
        setField(term27159, term27159.getClass(), "classloader", null);
        setField(term27159, term27159.getClass(), "principals", null);
        setField(term27159, term27159.getClass(), "permissions", null);
        setBooleanField(term27159, term27159.getClass(), "hasAllPerm", false);
        setBooleanField(term27159, term27159.getClass(), "staticPermissions", false);
        setField(term27159, term27159.getClass(), "key", null);
        setElement(term27144, 4, term27159);
        setField(term27162, term27162.getClass(), "codesource", null);
        setField(term27162, term27162.getClass(), "classloader", null);
        setField(term27162, term27162.getClass(), "principals", null);
        setField(term27162, term27162.getClass(), "permissions", null);
        setBooleanField(term27162, term27162.getClass(), "hasAllPerm", false);
        setBooleanField(term27162, term27162.getClass(), "staticPermissions", false);
        setField(term27162, term27162.getClass(), "key", null);
        setElement(term27144, 5, term27162);
        setField(term27143, term27143.getClass(), "context", term27144);
        setBooleanField(term27143, term27143.getClass(), "isPrivileged", false);
        setBooleanField(term27143, term27143.getClass(), "isAuthorized", false);
        setField(term27167, term27167.getClass(), "context", null);
        setBooleanField(term27167, term27167.getClass(), "isPrivileged", false);
        setBooleanField(term27167, term27167.getClass(), "isAuthorized", false);
        setField(term27167, term27167.getClass(), "privilegedContext", null);
        setField(term27167, term27167.getClass(), "combiner", null);
        setField(term27167, term27167.getClass(), "permissions", null);
        setField(term27167, term27167.getClass(), "parent", null);
        setBooleanField(term27167, term27167.getClass(), "isWrapped", false);
        setBooleanField(term27167, term27167.getClass(), "isLimited", false);
        setField(term27167, term27167.getClass(), "limitedContext", null);
        setField(term27143, term27143.getClass(), "privilegedContext", term27167);
        setField(term27143, term27143.getClass(), "combiner", null);
        setField(term27143, term27143.getClass(), "permissions", null);
        setField(term27143, term27143.getClass(), "parent", null);
        setBooleanField(term27143, term27143.getClass(), "isWrapped", false);
        setBooleanField(term27143, term27143.getClass(), "isLimited", false);
        setField(term27143, term27143.getClass(), "limitedContext", null);
        setField(term27120, term27120.getClass(), "acc", term27143);
        setBooleanField(term27120, term27120.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term27120, term27120.getClass(), "isPosted", true);
        setBooleanField(term27120, term27120.getClass(), "isSystemGenerated", false);
        setField(term27120, term27120.getClass(), "source", term27177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel$5");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term27120;
        callMethod(klass, "actionPerformed", argTypes, term27119, args);
    }

};


