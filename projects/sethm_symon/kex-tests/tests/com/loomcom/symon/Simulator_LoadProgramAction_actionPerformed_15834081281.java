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

public class Simulator_LoadProgramAction_actionPerformed_15834081281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210853;
     Object term210861;

    public Simulator_LoadProgramAction_actionPerformed_15834081281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210853 = newInstance(Class.forName("com.loomcom.symon.Simulator$LoadProgramAction"));
        Object term210855 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term210856 = newInstance(Class.forName("java.lang.Object"));
        Object term210857 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term210859 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term210860 = newInstance(Class.forName("java.lang.Object"));
        setField(term210853, term210853.getClass(), "this$0", null);
        setBooleanField(term210853, term210853.getClass(), "enabled", false);
        setField(term210855, term210855.getClass(), "table", term210856);
        setField(term210853, term210853.getClass(), "arrayTable", term210855);
        setBooleanField(term210857, term210857.getClass(), "notifyOnEDT", true);
        setField(term210859, term210859.getClass(), "map", null);
        setField(term210857, term210857.getClass(), "map", term210859);
        setField(term210857, term210857.getClass(), "source", term210860);
        setField(term210853, term210853.getClass(), "changeSupport", term210857);
        term210861 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term210876 = (byte[]) newByteArray(3);
        Object term210882 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term210883 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term210884 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term210885 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term210886 = (Object[]) newArray("java.security.Principal", 6);
        Object term210889 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term210894 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term210904 = newInstance(Class.forName("java.lang.Object"));
        setField(term210861, term210861.getClass(), "actionCommand", "POPYycoDBy");
        setLongField(term210861, term210861.getClass(), "when", -6478060368064484690L);
        setIntField(term210861, term210861.getClass(), "modifiers", 1940850013);
        setByteElement(term210876, 0, (byte) 9);
        setByteElement(term210876, 1, (byte) 19);
        setByteElement(term210876, 2, (byte) -103);
        setField(term210861, term210861.getClass(), "bdata", term210876);
        setIntField(term210861, term210861.getClass(), "id", 2014370043);
        setBooleanField(term210861, term210861.getClass(), "consumed", false);
        setField(term210885, term210885.getClass(), "location", null);
        setField(term210885, term210885.getClass(), "signers", null);
        setField(term210885, term210885.getClass(), "certs", null);
        setField(term210885, term210885.getClass(), "sp", null);
        setField(term210885, term210885.getClass(), "factory", null);
        setField(term210885, term210885.getClass(), "locationNoFragString", null);
        setField(term210884, term210884.getClass(), "codesource", term210885);
        setField(term210884, term210884.getClass(), "classloader", null);
        setField(term210884, term210884.getClass(), "principals", term210886);
        setField(term210884, term210884.getClass(), "permissions", null);
        setBooleanField(term210884, term210884.getClass(), "hasAllPerm", false);
        setBooleanField(term210884, term210884.getClass(), "staticPermissions", false);
        setField(term210884, term210884.getClass(), "key", null);
        setElement(term210883, 0, term210884);
        setField(term210889, term210889.getClass(), "codesource", null);
        setField(term210889, term210889.getClass(), "classloader", null);
        setField(term210889, term210889.getClass(), "principals", null);
        setField(term210889, term210889.getClass(), "permissions", null);
        setBooleanField(term210889, term210889.getClass(), "hasAllPerm", false);
        setBooleanField(term210889, term210889.getClass(), "staticPermissions", false);
        setField(term210889, term210889.getClass(), "key", null);
        setElement(term210883, 1, term210889);
        setField(term210882, term210882.getClass(), "context", term210883);
        setBooleanField(term210882, term210882.getClass(), "isPrivileged", true);
        setBooleanField(term210882, term210882.getClass(), "isAuthorized", false);
        setField(term210894, term210894.getClass(), "context", null);
        setBooleanField(term210894, term210894.getClass(), "isPrivileged", false);
        setBooleanField(term210894, term210894.getClass(), "isAuthorized", false);
        setField(term210894, term210894.getClass(), "privilegedContext", null);
        setField(term210894, term210894.getClass(), "combiner", null);
        setField(term210894, term210894.getClass(), "permissions", null);
        setField(term210894, term210894.getClass(), "parent", null);
        setBooleanField(term210894, term210894.getClass(), "isWrapped", false);
        setBooleanField(term210894, term210894.getClass(), "isLimited", false);
        setField(term210894, term210894.getClass(), "limitedContext", null);
        setField(term210882, term210882.getClass(), "privilegedContext", term210894);
        setField(term210882, term210882.getClass(), "combiner", null);
        setField(term210882, term210882.getClass(), "permissions", null);
        setField(term210882, term210882.getClass(), "parent", null);
        setBooleanField(term210882, term210882.getClass(), "isWrapped", false);
        setBooleanField(term210882, term210882.getClass(), "isLimited", false);
        setField(term210882, term210882.getClass(), "limitedContext", null);
        setField(term210861, term210861.getClass(), "acc", term210882);
        setBooleanField(term210861, term210861.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term210861, term210861.getClass(), "isPosted", false);
        setBooleanField(term210861, term210861.getClass(), "isSystemGenerated", true);
        setField(term210861, term210861.getClass(), "source", term210904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$LoadProgramAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term210861;
        callMethod(klass, "actionPerformed", argTypes, term210853, args);
    }

};


