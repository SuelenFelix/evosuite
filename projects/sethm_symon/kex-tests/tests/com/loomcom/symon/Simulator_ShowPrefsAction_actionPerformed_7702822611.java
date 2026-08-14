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

public class Simulator_ShowPrefsAction_actionPerformed_7702822611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58452;
     Object term58460;

    public Simulator_ShowPrefsAction_actionPerformed_7702822611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58452 = newInstance(Class.forName("com.loomcom.symon.Simulator$ShowPrefsAction"));
        Object term58454 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term58455 = newInstance(Class.forName("java.lang.Object"));
        Object term58456 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term58458 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term58459 = newInstance(Class.forName("java.lang.Object"));
        setField(term58452, term58452.getClass(), "this$0", null);
        setBooleanField(term58452, term58452.getClass(), "enabled", true);
        setField(term58454, term58454.getClass(), "table", term58455);
        setField(term58452, term58452.getClass(), "arrayTable", term58454);
        setBooleanField(term58456, term58456.getClass(), "notifyOnEDT", false);
        setField(term58458, term58458.getClass(), "map", null);
        setField(term58456, term58456.getClass(), "map", term58458);
        setField(term58456, term58456.getClass(), "source", term58459);
        setField(term58452, term58452.getClass(), "changeSupport", term58456);
        term58460 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term58475 = (byte[]) newByteArray(0);
        Object term58478 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term58479 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term58480 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term58481 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term58482 = (Object[]) newArray("java.security.Principal", 7);
        Object term58487 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term58497 = newInstance(Class.forName("java.lang.Object"));
        setField(term58460, term58460.getClass(), "actionCommand", "EwQBhZjCIT");
        setLongField(term58460, term58460.getClass(), "when", 4115148503664117517L);
        setIntField(term58460, term58460.getClass(), "modifiers", 1834067063);
        setField(term58460, term58460.getClass(), "bdata", term58475);
        setIntField(term58460, term58460.getClass(), "id", -1578513908);
        setBooleanField(term58460, term58460.getClass(), "consumed", true);
        setField(term58481, term58481.getClass(), "location", null);
        setField(term58481, term58481.getClass(), "signers", null);
        setField(term58481, term58481.getClass(), "certs", null);
        setField(term58481, term58481.getClass(), "sp", null);
        setField(term58481, term58481.getClass(), "factory", null);
        setField(term58481, term58481.getClass(), "locationNoFragString", null);
        setField(term58480, term58480.getClass(), "codesource", term58481);
        setField(term58480, term58480.getClass(), "classloader", null);
        setField(term58480, term58480.getClass(), "principals", term58482);
        setField(term58480, term58480.getClass(), "permissions", null);
        setBooleanField(term58480, term58480.getClass(), "hasAllPerm", false);
        setBooleanField(term58480, term58480.getClass(), "staticPermissions", false);
        setField(term58480, term58480.getClass(), "key", null);
        setElement(term58479, 0, term58480);
        setField(term58478, term58478.getClass(), "context", term58479);
        setBooleanField(term58478, term58478.getClass(), "isPrivileged", false);
        setBooleanField(term58478, term58478.getClass(), "isAuthorized", true);
        setField(term58487, term58487.getClass(), "context", null);
        setBooleanField(term58487, term58487.getClass(), "isPrivileged", false);
        setBooleanField(term58487, term58487.getClass(), "isAuthorized", false);
        setField(term58487, term58487.getClass(), "privilegedContext", null);
        setField(term58487, term58487.getClass(), "combiner", null);
        setField(term58487, term58487.getClass(), "permissions", null);
        setField(term58487, term58487.getClass(), "parent", null);
        setBooleanField(term58487, term58487.getClass(), "isWrapped", false);
        setBooleanField(term58487, term58487.getClass(), "isLimited", false);
        setField(term58487, term58487.getClass(), "limitedContext", null);
        setField(term58478, term58478.getClass(), "privilegedContext", term58487);
        setField(term58478, term58478.getClass(), "combiner", null);
        setField(term58478, term58478.getClass(), "permissions", null);
        setField(term58478, term58478.getClass(), "parent", null);
        setBooleanField(term58478, term58478.getClass(), "isWrapped", false);
        setBooleanField(term58478, term58478.getClass(), "isLimited", false);
        setField(term58478, term58478.getClass(), "limitedContext", null);
        setField(term58460, term58460.getClass(), "acc", term58478);
        setBooleanField(term58460, term58460.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term58460, term58460.getClass(), "isPosted", true);
        setBooleanField(term58460, term58460.getClass(), "isSystemGenerated", false);
        setField(term58460, term58460.getClass(), "source", term58497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$ShowPrefsAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term58460;
        callMethod(klass, "actionPerformed", argTypes, term58452, args);
    }

};


