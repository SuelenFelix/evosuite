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

public class StatusPanel_4_actionPerformed_4252639032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106721;
     Object term106722;

    public StatusPanel_4_actionPerformed_4252639032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106721 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel$4"));
        setField(term106721, term106721.getClass(), "this$0", null);
        term106722 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term106737 = (byte[]) newByteArray(9);
        Object term106749 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term106750 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term106751 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term106752 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term106753 = (Object[]) newArray("java.security.Principal", 2);
        Object term106756 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term106759 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term106762 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term106765 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term106768 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term106771 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term106774 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term106779 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term106789 = newInstance(Class.forName("java.lang.Object"));
        setField(term106722, term106722.getClass(), "actionCommand", "FlHzxEfFzI");
        setLongField(term106722, term106722.getClass(), "when", 6545086285386938562L);
        setIntField(term106722, term106722.getClass(), "modifiers", -1482271539);
        setByteElement(term106737, 0, (byte) 45);
        setByteElement(term106737, 1, (byte) -39);
        setByteElement(term106737, 2, (byte) -20);
        setByteElement(term106737, 3, (byte) 10);
        setByteElement(term106737, 4, (byte) 77);
        setByteElement(term106737, 5, (byte) 14);
        setByteElement(term106737, 6, (byte) -101);
        setByteElement(term106737, 7, (byte) 35);
        setByteElement(term106737, 8, (byte) 66);
        setField(term106722, term106722.getClass(), "bdata", term106737);
        setIntField(term106722, term106722.getClass(), "id", 52686140);
        setBooleanField(term106722, term106722.getClass(), "consumed", true);
        setField(term106752, term106752.getClass(), "location", null);
        setField(term106752, term106752.getClass(), "signers", null);
        setField(term106752, term106752.getClass(), "certs", null);
        setField(term106752, term106752.getClass(), "sp", null);
        setField(term106752, term106752.getClass(), "factory", null);
        setField(term106752, term106752.getClass(), "locationNoFragString", null);
        setField(term106751, term106751.getClass(), "codesource", term106752);
        setField(term106751, term106751.getClass(), "classloader", null);
        setField(term106751, term106751.getClass(), "principals", term106753);
        setField(term106751, term106751.getClass(), "permissions", null);
        setBooleanField(term106751, term106751.getClass(), "hasAllPerm", false);
        setBooleanField(term106751, term106751.getClass(), "staticPermissions", false);
        setField(term106751, term106751.getClass(), "key", null);
        setElement(term106750, 0, term106751);
        setField(term106756, term106756.getClass(), "codesource", null);
        setField(term106756, term106756.getClass(), "classloader", null);
        setField(term106756, term106756.getClass(), "principals", null);
        setField(term106756, term106756.getClass(), "permissions", null);
        setBooleanField(term106756, term106756.getClass(), "hasAllPerm", false);
        setBooleanField(term106756, term106756.getClass(), "staticPermissions", false);
        setField(term106756, term106756.getClass(), "key", null);
        setElement(term106750, 1, term106756);
        setField(term106759, term106759.getClass(), "codesource", null);
        setField(term106759, term106759.getClass(), "classloader", null);
        setField(term106759, term106759.getClass(), "principals", null);
        setField(term106759, term106759.getClass(), "permissions", null);
        setBooleanField(term106759, term106759.getClass(), "hasAllPerm", false);
        setBooleanField(term106759, term106759.getClass(), "staticPermissions", false);
        setField(term106759, term106759.getClass(), "key", null);
        setElement(term106750, 2, term106759);
        setField(term106762, term106762.getClass(), "codesource", null);
        setField(term106762, term106762.getClass(), "classloader", null);
        setField(term106762, term106762.getClass(), "principals", null);
        setField(term106762, term106762.getClass(), "permissions", null);
        setBooleanField(term106762, term106762.getClass(), "hasAllPerm", false);
        setBooleanField(term106762, term106762.getClass(), "staticPermissions", false);
        setField(term106762, term106762.getClass(), "key", null);
        setElement(term106750, 3, term106762);
        setField(term106765, term106765.getClass(), "codesource", null);
        setField(term106765, term106765.getClass(), "classloader", null);
        setField(term106765, term106765.getClass(), "principals", null);
        setField(term106765, term106765.getClass(), "permissions", null);
        setBooleanField(term106765, term106765.getClass(), "hasAllPerm", false);
        setBooleanField(term106765, term106765.getClass(), "staticPermissions", false);
        setField(term106765, term106765.getClass(), "key", null);
        setElement(term106750, 4, term106765);
        setField(term106768, term106768.getClass(), "codesource", null);
        setField(term106768, term106768.getClass(), "classloader", null);
        setField(term106768, term106768.getClass(), "principals", null);
        setField(term106768, term106768.getClass(), "permissions", null);
        setBooleanField(term106768, term106768.getClass(), "hasAllPerm", false);
        setBooleanField(term106768, term106768.getClass(), "staticPermissions", false);
        setField(term106768, term106768.getClass(), "key", null);
        setElement(term106750, 5, term106768);
        setField(term106771, term106771.getClass(), "codesource", null);
        setField(term106771, term106771.getClass(), "classloader", null);
        setField(term106771, term106771.getClass(), "principals", null);
        setField(term106771, term106771.getClass(), "permissions", null);
        setBooleanField(term106771, term106771.getClass(), "hasAllPerm", false);
        setBooleanField(term106771, term106771.getClass(), "staticPermissions", false);
        setField(term106771, term106771.getClass(), "key", null);
        setElement(term106750, 6, term106771);
        setField(term106774, term106774.getClass(), "codesource", null);
        setField(term106774, term106774.getClass(), "classloader", null);
        setField(term106774, term106774.getClass(), "principals", null);
        setField(term106774, term106774.getClass(), "permissions", null);
        setBooleanField(term106774, term106774.getClass(), "hasAllPerm", false);
        setBooleanField(term106774, term106774.getClass(), "staticPermissions", false);
        setField(term106774, term106774.getClass(), "key", null);
        setElement(term106750, 7, term106774);
        setField(term106749, term106749.getClass(), "context", term106750);
        setBooleanField(term106749, term106749.getClass(), "isPrivileged", true);
        setBooleanField(term106749, term106749.getClass(), "isAuthorized", true);
        setField(term106779, term106779.getClass(), "context", null);
        setBooleanField(term106779, term106779.getClass(), "isPrivileged", false);
        setBooleanField(term106779, term106779.getClass(), "isAuthorized", false);
        setField(term106779, term106779.getClass(), "privilegedContext", null);
        setField(term106779, term106779.getClass(), "combiner", null);
        setField(term106779, term106779.getClass(), "permissions", null);
        setField(term106779, term106779.getClass(), "parent", null);
        setBooleanField(term106779, term106779.getClass(), "isWrapped", false);
        setBooleanField(term106779, term106779.getClass(), "isLimited", false);
        setField(term106779, term106779.getClass(), "limitedContext", null);
        setField(term106749, term106749.getClass(), "privilegedContext", term106779);
        setField(term106749, term106749.getClass(), "combiner", null);
        setField(term106749, term106749.getClass(), "permissions", null);
        setField(term106749, term106749.getClass(), "parent", null);
        setBooleanField(term106749, term106749.getClass(), "isWrapped", false);
        setBooleanField(term106749, term106749.getClass(), "isLimited", false);
        setField(term106749, term106749.getClass(), "limitedContext", null);
        setField(term106722, term106722.getClass(), "acc", term106749);
        setBooleanField(term106722, term106722.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term106722, term106722.getClass(), "isPosted", true);
        setBooleanField(term106722, term106722.getClass(), "isSystemGenerated", false);
        setField(term106722, term106722.getClass(), "source", term106789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel$4");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term106722;
        callMethod(klass, "actionPerformed", argTypes, term106721, args);
    }

};


