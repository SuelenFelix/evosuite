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

public class StatusPanel_2_actionPerformed_4252639651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33159;
     Object term33160;

    public StatusPanel_2_actionPerformed_4252639651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33159 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel$2"));
        setField(term33159, term33159.getClass(), "this$0", null);
        term33160 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term33175 = (byte[]) newByteArray(2);
        Object term33180 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term33181 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term33182 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term33183 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term33184 = (Object[]) newArray("java.security.Principal", 3);
        Object term33187 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term33190 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term33193 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term33196 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term33199 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term33204 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term33214 = newInstance(Class.forName("java.lang.Object"));
        setField(term33160, term33160.getClass(), "actionCommand", "cudZvLMQon");
        setLongField(term33160, term33160.getClass(), "when", 2120084523938730454L);
        setIntField(term33160, term33160.getClass(), "modifiers", 908108726);
        setByteElement(term33175, 0, (byte) -104);
        setByteElement(term33175, 1, (byte) -89);
        setField(term33160, term33160.getClass(), "bdata", term33175);
        setIntField(term33160, term33160.getClass(), "id", 1023209512);
        setBooleanField(term33160, term33160.getClass(), "consumed", true);
        setField(term33183, term33183.getClass(), "location", null);
        setField(term33183, term33183.getClass(), "signers", null);
        setField(term33183, term33183.getClass(), "certs", null);
        setField(term33183, term33183.getClass(), "sp", null);
        setField(term33183, term33183.getClass(), "factory", null);
        setField(term33183, term33183.getClass(), "locationNoFragString", null);
        setField(term33182, term33182.getClass(), "codesource", term33183);
        setField(term33182, term33182.getClass(), "classloader", null);
        setField(term33182, term33182.getClass(), "principals", term33184);
        setField(term33182, term33182.getClass(), "permissions", null);
        setBooleanField(term33182, term33182.getClass(), "hasAllPerm", false);
        setBooleanField(term33182, term33182.getClass(), "staticPermissions", false);
        setField(term33182, term33182.getClass(), "key", null);
        setElement(term33181, 0, term33182);
        setField(term33187, term33187.getClass(), "codesource", null);
        setField(term33187, term33187.getClass(), "classloader", null);
        setField(term33187, term33187.getClass(), "principals", null);
        setField(term33187, term33187.getClass(), "permissions", null);
        setBooleanField(term33187, term33187.getClass(), "hasAllPerm", false);
        setBooleanField(term33187, term33187.getClass(), "staticPermissions", false);
        setField(term33187, term33187.getClass(), "key", null);
        setElement(term33181, 1, term33187);
        setField(term33190, term33190.getClass(), "codesource", null);
        setField(term33190, term33190.getClass(), "classloader", null);
        setField(term33190, term33190.getClass(), "principals", null);
        setField(term33190, term33190.getClass(), "permissions", null);
        setBooleanField(term33190, term33190.getClass(), "hasAllPerm", false);
        setBooleanField(term33190, term33190.getClass(), "staticPermissions", false);
        setField(term33190, term33190.getClass(), "key", null);
        setElement(term33181, 2, term33190);
        setField(term33193, term33193.getClass(), "codesource", null);
        setField(term33193, term33193.getClass(), "classloader", null);
        setField(term33193, term33193.getClass(), "principals", null);
        setField(term33193, term33193.getClass(), "permissions", null);
        setBooleanField(term33193, term33193.getClass(), "hasAllPerm", false);
        setBooleanField(term33193, term33193.getClass(), "staticPermissions", false);
        setField(term33193, term33193.getClass(), "key", null);
        setElement(term33181, 3, term33193);
        setField(term33196, term33196.getClass(), "codesource", null);
        setField(term33196, term33196.getClass(), "classloader", null);
        setField(term33196, term33196.getClass(), "principals", null);
        setField(term33196, term33196.getClass(), "permissions", null);
        setBooleanField(term33196, term33196.getClass(), "hasAllPerm", false);
        setBooleanField(term33196, term33196.getClass(), "staticPermissions", false);
        setField(term33196, term33196.getClass(), "key", null);
        setElement(term33181, 4, term33196);
        setField(term33199, term33199.getClass(), "codesource", null);
        setField(term33199, term33199.getClass(), "classloader", null);
        setField(term33199, term33199.getClass(), "principals", null);
        setField(term33199, term33199.getClass(), "permissions", null);
        setBooleanField(term33199, term33199.getClass(), "hasAllPerm", false);
        setBooleanField(term33199, term33199.getClass(), "staticPermissions", false);
        setField(term33199, term33199.getClass(), "key", null);
        setElement(term33181, 5, term33199);
        setField(term33180, term33180.getClass(), "context", term33181);
        setBooleanField(term33180, term33180.getClass(), "isPrivileged", false);
        setBooleanField(term33180, term33180.getClass(), "isAuthorized", true);
        setField(term33204, term33204.getClass(), "context", null);
        setBooleanField(term33204, term33204.getClass(), "isPrivileged", false);
        setBooleanField(term33204, term33204.getClass(), "isAuthorized", false);
        setField(term33204, term33204.getClass(), "privilegedContext", null);
        setField(term33204, term33204.getClass(), "combiner", null);
        setField(term33204, term33204.getClass(), "permissions", null);
        setField(term33204, term33204.getClass(), "parent", null);
        setBooleanField(term33204, term33204.getClass(), "isWrapped", false);
        setBooleanField(term33204, term33204.getClass(), "isLimited", false);
        setField(term33204, term33204.getClass(), "limitedContext", null);
        setField(term33180, term33180.getClass(), "privilegedContext", term33204);
        setField(term33180, term33180.getClass(), "combiner", null);
        setField(term33180, term33180.getClass(), "permissions", null);
        setField(term33180, term33180.getClass(), "parent", null);
        setBooleanField(term33180, term33180.getClass(), "isWrapped", false);
        setBooleanField(term33180, term33180.getClass(), "isLimited", false);
        setField(term33180, term33180.getClass(), "limitedContext", null);
        setField(term33160, term33160.getClass(), "acc", term33180);
        setBooleanField(term33160, term33160.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term33160, term33160.getClass(), "isPosted", true);
        setBooleanField(term33160, term33160.getClass(), "isSystemGenerated", true);
        setField(term33160, term33160.getClass(), "source", term33214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term33160;
        callMethod(klass, "actionPerformed", argTypes, term33159, args);
    }

};


