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

public class StatusPanel_3_actionPerformed_4252639342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103628;
     Object term103629;

    public StatusPanel_3_actionPerformed_4252639342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103628 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel$3"));
        setField(term103628, term103628.getClass(), "this$0", null);
        term103629 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term103644 = (byte[]) newByteArray(0);
        Object term103647 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term103648 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term103649 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term103650 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term103651 = (Object[]) newArray("java.security.Principal", 0);
        Object term103654 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term103657 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term103660 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term103663 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term103666 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term103669 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term103672 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term103677 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term103687 = newInstance(Class.forName("java.lang.Object"));
        setField(term103629, term103629.getClass(), "actionCommand", "bKBSncrMEZ");
        setLongField(term103629, term103629.getClass(), "when", -8985577692063635272L);
        setIntField(term103629, term103629.getClass(), "modifiers", -433967657);
        setField(term103629, term103629.getClass(), "bdata", term103644);
        setIntField(term103629, term103629.getClass(), "id", 1411661019);
        setBooleanField(term103629, term103629.getClass(), "consumed", false);
        setField(term103650, term103650.getClass(), "location", null);
        setField(term103650, term103650.getClass(), "signers", null);
        setField(term103650, term103650.getClass(), "certs", null);
        setField(term103650, term103650.getClass(), "sp", null);
        setField(term103650, term103650.getClass(), "factory", null);
        setField(term103650, term103650.getClass(), "locationNoFragString", null);
        setField(term103649, term103649.getClass(), "codesource", term103650);
        setField(term103649, term103649.getClass(), "classloader", null);
        setField(term103649, term103649.getClass(), "principals", term103651);
        setField(term103649, term103649.getClass(), "permissions", null);
        setBooleanField(term103649, term103649.getClass(), "hasAllPerm", false);
        setBooleanField(term103649, term103649.getClass(), "staticPermissions", false);
        setField(term103649, term103649.getClass(), "key", null);
        setElement(term103648, 0, term103649);
        setField(term103654, term103654.getClass(), "codesource", null);
        setField(term103654, term103654.getClass(), "classloader", null);
        setField(term103654, term103654.getClass(), "principals", null);
        setField(term103654, term103654.getClass(), "permissions", null);
        setBooleanField(term103654, term103654.getClass(), "hasAllPerm", false);
        setBooleanField(term103654, term103654.getClass(), "staticPermissions", false);
        setField(term103654, term103654.getClass(), "key", null);
        setElement(term103648, 1, term103654);
        setField(term103657, term103657.getClass(), "codesource", null);
        setField(term103657, term103657.getClass(), "classloader", null);
        setField(term103657, term103657.getClass(), "principals", null);
        setField(term103657, term103657.getClass(), "permissions", null);
        setBooleanField(term103657, term103657.getClass(), "hasAllPerm", false);
        setBooleanField(term103657, term103657.getClass(), "staticPermissions", false);
        setField(term103657, term103657.getClass(), "key", null);
        setElement(term103648, 2, term103657);
        setField(term103660, term103660.getClass(), "codesource", null);
        setField(term103660, term103660.getClass(), "classloader", null);
        setField(term103660, term103660.getClass(), "principals", null);
        setField(term103660, term103660.getClass(), "permissions", null);
        setBooleanField(term103660, term103660.getClass(), "hasAllPerm", false);
        setBooleanField(term103660, term103660.getClass(), "staticPermissions", false);
        setField(term103660, term103660.getClass(), "key", null);
        setElement(term103648, 3, term103660);
        setField(term103663, term103663.getClass(), "codesource", null);
        setField(term103663, term103663.getClass(), "classloader", null);
        setField(term103663, term103663.getClass(), "principals", null);
        setField(term103663, term103663.getClass(), "permissions", null);
        setBooleanField(term103663, term103663.getClass(), "hasAllPerm", false);
        setBooleanField(term103663, term103663.getClass(), "staticPermissions", false);
        setField(term103663, term103663.getClass(), "key", null);
        setElement(term103648, 4, term103663);
        setField(term103666, term103666.getClass(), "codesource", null);
        setField(term103666, term103666.getClass(), "classloader", null);
        setField(term103666, term103666.getClass(), "principals", null);
        setField(term103666, term103666.getClass(), "permissions", null);
        setBooleanField(term103666, term103666.getClass(), "hasAllPerm", false);
        setBooleanField(term103666, term103666.getClass(), "staticPermissions", false);
        setField(term103666, term103666.getClass(), "key", null);
        setElement(term103648, 5, term103666);
        setField(term103669, term103669.getClass(), "codesource", null);
        setField(term103669, term103669.getClass(), "classloader", null);
        setField(term103669, term103669.getClass(), "principals", null);
        setField(term103669, term103669.getClass(), "permissions", null);
        setBooleanField(term103669, term103669.getClass(), "hasAllPerm", false);
        setBooleanField(term103669, term103669.getClass(), "staticPermissions", false);
        setField(term103669, term103669.getClass(), "key", null);
        setElement(term103648, 6, term103669);
        setField(term103672, term103672.getClass(), "codesource", null);
        setField(term103672, term103672.getClass(), "classloader", null);
        setField(term103672, term103672.getClass(), "principals", null);
        setField(term103672, term103672.getClass(), "permissions", null);
        setBooleanField(term103672, term103672.getClass(), "hasAllPerm", false);
        setBooleanField(term103672, term103672.getClass(), "staticPermissions", false);
        setField(term103672, term103672.getClass(), "key", null);
        setElement(term103648, 7, term103672);
        setField(term103647, term103647.getClass(), "context", term103648);
        setBooleanField(term103647, term103647.getClass(), "isPrivileged", false);
        setBooleanField(term103647, term103647.getClass(), "isAuthorized", true);
        setField(term103677, term103677.getClass(), "context", null);
        setBooleanField(term103677, term103677.getClass(), "isPrivileged", false);
        setBooleanField(term103677, term103677.getClass(), "isAuthorized", false);
        setField(term103677, term103677.getClass(), "privilegedContext", null);
        setField(term103677, term103677.getClass(), "combiner", null);
        setField(term103677, term103677.getClass(), "permissions", null);
        setField(term103677, term103677.getClass(), "parent", null);
        setBooleanField(term103677, term103677.getClass(), "isWrapped", false);
        setBooleanField(term103677, term103677.getClass(), "isLimited", false);
        setField(term103677, term103677.getClass(), "limitedContext", null);
        setField(term103647, term103647.getClass(), "privilegedContext", term103677);
        setField(term103647, term103647.getClass(), "combiner", null);
        setField(term103647, term103647.getClass(), "permissions", null);
        setField(term103647, term103647.getClass(), "parent", null);
        setBooleanField(term103647, term103647.getClass(), "isWrapped", false);
        setBooleanField(term103647, term103647.getClass(), "isLimited", false);
        setField(term103647, term103647.getClass(), "limitedContext", null);
        setField(term103629, term103629.getClass(), "acc", term103647);
        setBooleanField(term103629, term103629.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term103629, term103629.getClass(), "isPosted", true);
        setBooleanField(term103629, term103629.getClass(), "isSystemGenerated", true);
        setField(term103629, term103629.getClass(), "source", term103687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term103629;
        callMethod(klass, "actionPerformed", argTypes, term103628, args);
    }

};


