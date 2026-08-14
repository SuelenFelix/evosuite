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

public class Simulator_ToggleBreakpointWindowAction_actionPerformed_15162182111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49756;
     Object term49764;

    public Simulator_ToggleBreakpointWindowAction_actionPerformed_15162182111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49756 = newInstance(Class.forName("com.loomcom.symon.Simulator$ToggleBreakpointWindowAction"));
        Object term49758 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term49759 = newInstance(Class.forName("java.lang.Object"));
        Object term49760 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term49762 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term49763 = newInstance(Class.forName("java.lang.Object"));
        setField(term49756, term49756.getClass(), "this$0", null);
        setBooleanField(term49756, term49756.getClass(), "enabled", false);
        setField(term49758, term49758.getClass(), "table", term49759);
        setField(term49756, term49756.getClass(), "arrayTable", term49758);
        setBooleanField(term49760, term49760.getClass(), "notifyOnEDT", true);
        setField(term49762, term49762.getClass(), "map", null);
        setField(term49760, term49760.getClass(), "map", term49762);
        setField(term49760, term49760.getClass(), "source", term49763);
        setField(term49756, term49756.getClass(), "changeSupport", term49760);
        term49764 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term49779 = (byte[]) newByteArray(4);
        Object term49786 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term49787 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term49788 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term49789 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term49790 = (Object[]) newArray("java.security.Principal", 3);
        Object term49795 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term49805 = newInstance(Class.forName("java.lang.Object"));
        setField(term49764, term49764.getClass(), "actionCommand", "vwbEQQNQrx");
        setLongField(term49764, term49764.getClass(), "when", 3662777917800385964L);
        setIntField(term49764, term49764.getClass(), "modifiers", -218759803);
        setByteElement(term49779, 0, (byte) -16);
        setByteElement(term49779, 1, (byte) -112);
        setByteElement(term49779, 2, (byte) -111);
        setByteElement(term49779, 3, (byte) 23);
        setField(term49764, term49764.getClass(), "bdata", term49779);
        setIntField(term49764, term49764.getClass(), "id", 1288936083);
        setBooleanField(term49764, term49764.getClass(), "consumed", true);
        setField(term49789, term49789.getClass(), "location", null);
        setField(term49789, term49789.getClass(), "signers", null);
        setField(term49789, term49789.getClass(), "certs", null);
        setField(term49789, term49789.getClass(), "sp", null);
        setField(term49789, term49789.getClass(), "factory", null);
        setField(term49789, term49789.getClass(), "locationNoFragString", null);
        setField(term49788, term49788.getClass(), "codesource", term49789);
        setField(term49788, term49788.getClass(), "classloader", null);
        setField(term49788, term49788.getClass(), "principals", term49790);
        setField(term49788, term49788.getClass(), "permissions", null);
        setBooleanField(term49788, term49788.getClass(), "hasAllPerm", false);
        setBooleanField(term49788, term49788.getClass(), "staticPermissions", false);
        setField(term49788, term49788.getClass(), "key", null);
        setElement(term49787, 0, term49788);
        setField(term49786, term49786.getClass(), "context", term49787);
        setBooleanField(term49786, term49786.getClass(), "isPrivileged", true);
        setBooleanField(term49786, term49786.getClass(), "isAuthorized", false);
        setField(term49795, term49795.getClass(), "context", null);
        setBooleanField(term49795, term49795.getClass(), "isPrivileged", false);
        setBooleanField(term49795, term49795.getClass(), "isAuthorized", false);
        setField(term49795, term49795.getClass(), "privilegedContext", null);
        setField(term49795, term49795.getClass(), "combiner", null);
        setField(term49795, term49795.getClass(), "permissions", null);
        setField(term49795, term49795.getClass(), "parent", null);
        setBooleanField(term49795, term49795.getClass(), "isWrapped", false);
        setBooleanField(term49795, term49795.getClass(), "isLimited", false);
        setField(term49795, term49795.getClass(), "limitedContext", null);
        setField(term49786, term49786.getClass(), "privilegedContext", term49795);
        setField(term49786, term49786.getClass(), "combiner", null);
        setField(term49786, term49786.getClass(), "permissions", null);
        setField(term49786, term49786.getClass(), "parent", null);
        setBooleanField(term49786, term49786.getClass(), "isWrapped", false);
        setBooleanField(term49786, term49786.getClass(), "isLimited", false);
        setField(term49786, term49786.getClass(), "limitedContext", null);
        setField(term49764, term49764.getClass(), "acc", term49786);
        setBooleanField(term49764, term49764.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term49764, term49764.getClass(), "isPosted", false);
        setBooleanField(term49764, term49764.getClass(), "isSystemGenerated", false);
        setField(term49764, term49764.getClass(), "source", term49805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$ToggleBreakpointWindowAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term49764;
        callMethod(klass, "actionPerformed", argTypes, term49756, args);
    }

};


