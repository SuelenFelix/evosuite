package com.loomcom.symon;

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
import static com.loomcom.symon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Simulator_ToggleVideoWindowAction_actionPerformed_3073516091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137428;
     Object term137436;

    public Simulator_ToggleVideoWindowAction_actionPerformed_3073516091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137428 = newInstance(Class.forName("com.loomcom.symon.Simulator$ToggleVideoWindowAction"));
        Object term137430 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term137431 = newInstance(Class.forName("java.lang.Object"));
        Object term137432 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term137434 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term137435 = newInstance(Class.forName("java.lang.Object"));
        setField(term137428, term137428.getClass(), "this$0", null);
        setBooleanField(term137428, term137428.getClass(), "enabled", false);
        setField(term137430, term137430.getClass(), "table", term137431);
        setField(term137428, term137428.getClass(), "arrayTable", term137430);
        setBooleanField(term137432, term137432.getClass(), "notifyOnEDT", true);
        setField(term137434, term137434.getClass(), "map", null);
        setField(term137432, term137432.getClass(), "map", term137434);
        setField(term137432, term137432.getClass(), "source", term137435);
        setField(term137428, term137428.getClass(), "changeSupport", term137432);
        term137436 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term137451 = (byte[]) newByteArray(6);
        Object term137460 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term137461 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term137462 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term137463 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term137464 = (Object[]) newArray("java.security.Principal", 6);
        Object term137467 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term137470 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term137473 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term137476 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term137479 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term137484 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term137494 = newInstance(Class.forName("java.lang.Object"));
        setField(term137436, term137436.getClass(), "actionCommand", "DGRqjjdhzy");
        setLongField(term137436, term137436.getClass(), "when", -7006877527579112761L);
        setIntField(term137436, term137436.getClass(), "modifiers", 1400302967);
        setByteElement(term137451, 0, (byte) -93);
        setByteElement(term137451, 1, (byte) 82);
        setByteElement(term137451, 2, (byte) -89);
        setByteElement(term137451, 3, (byte) 24);
        setByteElement(term137451, 4, (byte) 123);
        setByteElement(term137451, 5, (byte) -101);
        setField(term137436, term137436.getClass(), "bdata", term137451);
        setIntField(term137436, term137436.getClass(), "id", 692198729);
        setBooleanField(term137436, term137436.getClass(), "consumed", false);
        setField(term137463, term137463.getClass(), "location", null);
        setField(term137463, term137463.getClass(), "signers", null);
        setField(term137463, term137463.getClass(), "certs", null);
        setField(term137463, term137463.getClass(), "sp", null);
        setField(term137463, term137463.getClass(), "factory", null);
        setField(term137463, term137463.getClass(), "locationNoFragString", null);
        setField(term137462, term137462.getClass(), "codesource", term137463);
        setField(term137462, term137462.getClass(), "classloader", null);
        setField(term137462, term137462.getClass(), "principals", term137464);
        setField(term137462, term137462.getClass(), "permissions", null);
        setBooleanField(term137462, term137462.getClass(), "hasAllPerm", false);
        setBooleanField(term137462, term137462.getClass(), "staticPermissions", false);
        setField(term137462, term137462.getClass(), "key", null);
        setElement(term137461, 0, term137462);
        setField(term137467, term137467.getClass(), "codesource", null);
        setField(term137467, term137467.getClass(), "classloader", null);
        setField(term137467, term137467.getClass(), "principals", null);
        setField(term137467, term137467.getClass(), "permissions", null);
        setBooleanField(term137467, term137467.getClass(), "hasAllPerm", false);
        setBooleanField(term137467, term137467.getClass(), "staticPermissions", false);
        setField(term137467, term137467.getClass(), "key", null);
        setElement(term137461, 1, term137467);
        setField(term137470, term137470.getClass(), "codesource", null);
        setField(term137470, term137470.getClass(), "classloader", null);
        setField(term137470, term137470.getClass(), "principals", null);
        setField(term137470, term137470.getClass(), "permissions", null);
        setBooleanField(term137470, term137470.getClass(), "hasAllPerm", false);
        setBooleanField(term137470, term137470.getClass(), "staticPermissions", false);
        setField(term137470, term137470.getClass(), "key", null);
        setElement(term137461, 2, term137470);
        setField(term137473, term137473.getClass(), "codesource", null);
        setField(term137473, term137473.getClass(), "classloader", null);
        setField(term137473, term137473.getClass(), "principals", null);
        setField(term137473, term137473.getClass(), "permissions", null);
        setBooleanField(term137473, term137473.getClass(), "hasAllPerm", false);
        setBooleanField(term137473, term137473.getClass(), "staticPermissions", false);
        setField(term137473, term137473.getClass(), "key", null);
        setElement(term137461, 3, term137473);
        setField(term137476, term137476.getClass(), "codesource", null);
        setField(term137476, term137476.getClass(), "classloader", null);
        setField(term137476, term137476.getClass(), "principals", null);
        setField(term137476, term137476.getClass(), "permissions", null);
        setBooleanField(term137476, term137476.getClass(), "hasAllPerm", false);
        setBooleanField(term137476, term137476.getClass(), "staticPermissions", false);
        setField(term137476, term137476.getClass(), "key", null);
        setElement(term137461, 4, term137476);
        setField(term137479, term137479.getClass(), "codesource", null);
        setField(term137479, term137479.getClass(), "classloader", null);
        setField(term137479, term137479.getClass(), "principals", null);
        setField(term137479, term137479.getClass(), "permissions", null);
        setBooleanField(term137479, term137479.getClass(), "hasAllPerm", false);
        setBooleanField(term137479, term137479.getClass(), "staticPermissions", false);
        setField(term137479, term137479.getClass(), "key", null);
        setElement(term137461, 5, term137479);
        setField(term137460, term137460.getClass(), "context", term137461);
        setBooleanField(term137460, term137460.getClass(), "isPrivileged", false);
        setBooleanField(term137460, term137460.getClass(), "isAuthorized", false);
        setField(term137484, term137484.getClass(), "context", null);
        setBooleanField(term137484, term137484.getClass(), "isPrivileged", false);
        setBooleanField(term137484, term137484.getClass(), "isAuthorized", false);
        setField(term137484, term137484.getClass(), "privilegedContext", null);
        setField(term137484, term137484.getClass(), "combiner", null);
        setField(term137484, term137484.getClass(), "permissions", null);
        setField(term137484, term137484.getClass(), "parent", null);
        setBooleanField(term137484, term137484.getClass(), "isWrapped", false);
        setBooleanField(term137484, term137484.getClass(), "isLimited", false);
        setField(term137484, term137484.getClass(), "limitedContext", null);
        setField(term137460, term137460.getClass(), "privilegedContext", term137484);
        setField(term137460, term137460.getClass(), "combiner", null);
        setField(term137460, term137460.getClass(), "permissions", null);
        setField(term137460, term137460.getClass(), "parent", null);
        setBooleanField(term137460, term137460.getClass(), "isWrapped", false);
        setBooleanField(term137460, term137460.getClass(), "isLimited", false);
        setField(term137460, term137460.getClass(), "limitedContext", null);
        setField(term137436, term137436.getClass(), "acc", term137460);
        setBooleanField(term137436, term137436.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term137436, term137436.getClass(), "isPosted", true);
        setBooleanField(term137436, term137436.getClass(), "isSystemGenerated", false);
        setField(term137436, term137436.getClass(), "source", term137494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$ToggleVideoWindowAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term137436;
        callMethod(klass, "actionPerformed", argTypes, term137428, args);
    }

};


