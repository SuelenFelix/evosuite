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

public class Simulator_SelectMachineAction_actionPerformed_11043463551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154493;
     Object term154501;

    public Simulator_SelectMachineAction_actionPerformed_11043463551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154493 = newInstance(Class.forName("com.loomcom.symon.Simulator$SelectMachineAction"));
        Object term154495 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term154496 = newInstance(Class.forName("java.lang.Object"));
        Object term154497 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term154499 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term154500 = newInstance(Class.forName("java.lang.Object"));
        setField(term154493, term154493.getClass(), "this$0", null);
        setBooleanField(term154493, term154493.getClass(), "enabled", false);
        setField(term154495, term154495.getClass(), "table", term154496);
        setField(term154493, term154493.getClass(), "arrayTable", term154495);
        setBooleanField(term154497, term154497.getClass(), "notifyOnEDT", true);
        setField(term154499, term154499.getClass(), "map", null);
        setField(term154497, term154497.getClass(), "map", term154499);
        setField(term154497, term154497.getClass(), "source", term154500);
        setField(term154493, term154493.getClass(), "changeSupport", term154497);
        term154501 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term154516 = (byte[]) newByteArray(9);
        Object term154528 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term154529 = (Object[]) newArray("java.security.ProtectionDomain", 7);
        Object term154530 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term154531 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term154532 = (Object[]) newArray("java.security.Principal", 1);
        Object term154535 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term154538 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term154541 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term154544 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term154547 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term154550 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term154555 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term154565 = newInstance(Class.forName("java.lang.Object"));
        setField(term154501, term154501.getClass(), "actionCommand", "hgFbWAUtsu");
        setLongField(term154501, term154501.getClass(), "when", -8121348431673567857L);
        setIntField(term154501, term154501.getClass(), "modifiers", 701324276);
        setByteElement(term154516, 0, (byte) -25);
        setByteElement(term154516, 1, (byte) 114);
        setByteElement(term154516, 2, (byte) 105);
        setByteElement(term154516, 3, (byte) -95);
        setByteElement(term154516, 4, (byte) -6);
        setByteElement(term154516, 5, (byte) 51);
        setByteElement(term154516, 6, (byte) 122);
        setByteElement(term154516, 7, (byte) 84);
        setByteElement(term154516, 8, (byte) -36);
        setField(term154501, term154501.getClass(), "bdata", term154516);
        setIntField(term154501, term154501.getClass(), "id", -2141408767);
        setBooleanField(term154501, term154501.getClass(), "consumed", true);
        setField(term154531, term154531.getClass(), "location", null);
        setField(term154531, term154531.getClass(), "signers", null);
        setField(term154531, term154531.getClass(), "certs", null);
        setField(term154531, term154531.getClass(), "sp", null);
        setField(term154531, term154531.getClass(), "factory", null);
        setField(term154531, term154531.getClass(), "locationNoFragString", null);
        setField(term154530, term154530.getClass(), "codesource", term154531);
        setField(term154530, term154530.getClass(), "classloader", null);
        setField(term154530, term154530.getClass(), "principals", term154532);
        setField(term154530, term154530.getClass(), "permissions", null);
        setBooleanField(term154530, term154530.getClass(), "hasAllPerm", false);
        setBooleanField(term154530, term154530.getClass(), "staticPermissions", false);
        setField(term154530, term154530.getClass(), "key", null);
        setElement(term154529, 0, term154530);
        setField(term154535, term154535.getClass(), "codesource", null);
        setField(term154535, term154535.getClass(), "classloader", null);
        setField(term154535, term154535.getClass(), "principals", null);
        setField(term154535, term154535.getClass(), "permissions", null);
        setBooleanField(term154535, term154535.getClass(), "hasAllPerm", false);
        setBooleanField(term154535, term154535.getClass(), "staticPermissions", false);
        setField(term154535, term154535.getClass(), "key", null);
        setElement(term154529, 1, term154535);
        setField(term154538, term154538.getClass(), "codesource", null);
        setField(term154538, term154538.getClass(), "classloader", null);
        setField(term154538, term154538.getClass(), "principals", null);
        setField(term154538, term154538.getClass(), "permissions", null);
        setBooleanField(term154538, term154538.getClass(), "hasAllPerm", false);
        setBooleanField(term154538, term154538.getClass(), "staticPermissions", false);
        setField(term154538, term154538.getClass(), "key", null);
        setElement(term154529, 2, term154538);
        setField(term154541, term154541.getClass(), "codesource", null);
        setField(term154541, term154541.getClass(), "classloader", null);
        setField(term154541, term154541.getClass(), "principals", null);
        setField(term154541, term154541.getClass(), "permissions", null);
        setBooleanField(term154541, term154541.getClass(), "hasAllPerm", false);
        setBooleanField(term154541, term154541.getClass(), "staticPermissions", false);
        setField(term154541, term154541.getClass(), "key", null);
        setElement(term154529, 3, term154541);
        setField(term154544, term154544.getClass(), "codesource", null);
        setField(term154544, term154544.getClass(), "classloader", null);
        setField(term154544, term154544.getClass(), "principals", null);
        setField(term154544, term154544.getClass(), "permissions", null);
        setBooleanField(term154544, term154544.getClass(), "hasAllPerm", false);
        setBooleanField(term154544, term154544.getClass(), "staticPermissions", false);
        setField(term154544, term154544.getClass(), "key", null);
        setElement(term154529, 4, term154544);
        setField(term154547, term154547.getClass(), "codesource", null);
        setField(term154547, term154547.getClass(), "classloader", null);
        setField(term154547, term154547.getClass(), "principals", null);
        setField(term154547, term154547.getClass(), "permissions", null);
        setBooleanField(term154547, term154547.getClass(), "hasAllPerm", false);
        setBooleanField(term154547, term154547.getClass(), "staticPermissions", false);
        setField(term154547, term154547.getClass(), "key", null);
        setElement(term154529, 5, term154547);
        setField(term154550, term154550.getClass(), "codesource", null);
        setField(term154550, term154550.getClass(), "classloader", null);
        setField(term154550, term154550.getClass(), "principals", null);
        setField(term154550, term154550.getClass(), "permissions", null);
        setBooleanField(term154550, term154550.getClass(), "hasAllPerm", false);
        setBooleanField(term154550, term154550.getClass(), "staticPermissions", false);
        setField(term154550, term154550.getClass(), "key", null);
        setElement(term154529, 6, term154550);
        setField(term154528, term154528.getClass(), "context", term154529);
        setBooleanField(term154528, term154528.getClass(), "isPrivileged", false);
        setBooleanField(term154528, term154528.getClass(), "isAuthorized", false);
        setField(term154555, term154555.getClass(), "context", null);
        setBooleanField(term154555, term154555.getClass(), "isPrivileged", false);
        setBooleanField(term154555, term154555.getClass(), "isAuthorized", false);
        setField(term154555, term154555.getClass(), "privilegedContext", null);
        setField(term154555, term154555.getClass(), "combiner", null);
        setField(term154555, term154555.getClass(), "permissions", null);
        setField(term154555, term154555.getClass(), "parent", null);
        setBooleanField(term154555, term154555.getClass(), "isWrapped", false);
        setBooleanField(term154555, term154555.getClass(), "isLimited", false);
        setField(term154555, term154555.getClass(), "limitedContext", null);
        setField(term154528, term154528.getClass(), "privilegedContext", term154555);
        setField(term154528, term154528.getClass(), "combiner", null);
        setField(term154528, term154528.getClass(), "permissions", null);
        setField(term154528, term154528.getClass(), "parent", null);
        setBooleanField(term154528, term154528.getClass(), "isWrapped", false);
        setBooleanField(term154528, term154528.getClass(), "isLimited", false);
        setField(term154528, term154528.getClass(), "limitedContext", null);
        setField(term154501, term154501.getClass(), "acc", term154528);
        setBooleanField(term154501, term154501.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term154501, term154501.getClass(), "isPosted", true);
        setBooleanField(term154501, term154501.getClass(), "isSystemGenerated", false);
        setField(term154501, term154501.getClass(), "source", term154565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$SelectMachineAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term154501;
        callMethod(klass, "actionPerformed", argTypes, term154493, args);
    }

};


