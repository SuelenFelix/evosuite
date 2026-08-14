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

public class Simulator_LoadRomAction_actionPerformed_31665161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155367;
     Object term155375;

    public Simulator_LoadRomAction_actionPerformed_31665161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155367 = newInstance(Class.forName("com.loomcom.symon.Simulator$LoadRomAction"));
        Object term155369 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term155370 = newInstance(Class.forName("java.lang.Object"));
        Object term155371 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term155373 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term155374 = newInstance(Class.forName("java.lang.Object"));
        setField(term155367, term155367.getClass(), "this$0", null);
        setBooleanField(term155367, term155367.getClass(), "enabled", false);
        setField(term155369, term155369.getClass(), "table", term155370);
        setField(term155367, term155367.getClass(), "arrayTable", term155369);
        setBooleanField(term155371, term155371.getClass(), "notifyOnEDT", true);
        setField(term155373, term155373.getClass(), "map", null);
        setField(term155371, term155371.getClass(), "map", term155373);
        setField(term155371, term155371.getClass(), "source", term155374);
        setField(term155367, term155367.getClass(), "changeSupport", term155371);
        term155375 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term155390 = (byte[]) newByteArray(4);
        Object term155397 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term155398 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term155399 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term155400 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term155401 = (Object[]) newArray("java.security.Principal", 0);
        Object term155404 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term155407 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term155410 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term155413 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term155418 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term155428 = newInstance(Class.forName("java.lang.Object"));
        setField(term155375, term155375.getClass(), "actionCommand", "YfkhviKZwl");
        setLongField(term155375, term155375.getClass(), "when", -4475453924678388077L);
        setIntField(term155375, term155375.getClass(), "modifiers", -1590495256);
        setByteElement(term155390, 0, (byte) 103);
        setByteElement(term155390, 1, (byte) -63);
        setByteElement(term155390, 2, (byte) 39);
        setByteElement(term155390, 3, (byte) -54);
        setField(term155375, term155375.getClass(), "bdata", term155390);
        setIntField(term155375, term155375.getClass(), "id", 1804035317);
        setBooleanField(term155375, term155375.getClass(), "consumed", true);
        setField(term155400, term155400.getClass(), "location", null);
        setField(term155400, term155400.getClass(), "signers", null);
        setField(term155400, term155400.getClass(), "certs", null);
        setField(term155400, term155400.getClass(), "sp", null);
        setField(term155400, term155400.getClass(), "factory", null);
        setField(term155400, term155400.getClass(), "locationNoFragString", null);
        setField(term155399, term155399.getClass(), "codesource", term155400);
        setField(term155399, term155399.getClass(), "classloader", null);
        setField(term155399, term155399.getClass(), "principals", term155401);
        setField(term155399, term155399.getClass(), "permissions", null);
        setBooleanField(term155399, term155399.getClass(), "hasAllPerm", false);
        setBooleanField(term155399, term155399.getClass(), "staticPermissions", false);
        setField(term155399, term155399.getClass(), "key", null);
        setElement(term155398, 0, term155399);
        setField(term155404, term155404.getClass(), "codesource", null);
        setField(term155404, term155404.getClass(), "classloader", null);
        setField(term155404, term155404.getClass(), "principals", null);
        setField(term155404, term155404.getClass(), "permissions", null);
        setBooleanField(term155404, term155404.getClass(), "hasAllPerm", false);
        setBooleanField(term155404, term155404.getClass(), "staticPermissions", false);
        setField(term155404, term155404.getClass(), "key", null);
        setElement(term155398, 1, term155404);
        setField(term155407, term155407.getClass(), "codesource", null);
        setField(term155407, term155407.getClass(), "classloader", null);
        setField(term155407, term155407.getClass(), "principals", null);
        setField(term155407, term155407.getClass(), "permissions", null);
        setBooleanField(term155407, term155407.getClass(), "hasAllPerm", false);
        setBooleanField(term155407, term155407.getClass(), "staticPermissions", false);
        setField(term155407, term155407.getClass(), "key", null);
        setElement(term155398, 2, term155407);
        setField(term155410, term155410.getClass(), "codesource", null);
        setField(term155410, term155410.getClass(), "classloader", null);
        setField(term155410, term155410.getClass(), "principals", null);
        setField(term155410, term155410.getClass(), "permissions", null);
        setBooleanField(term155410, term155410.getClass(), "hasAllPerm", false);
        setBooleanField(term155410, term155410.getClass(), "staticPermissions", false);
        setField(term155410, term155410.getClass(), "key", null);
        setElement(term155398, 3, term155410);
        setField(term155413, term155413.getClass(), "codesource", null);
        setField(term155413, term155413.getClass(), "classloader", null);
        setField(term155413, term155413.getClass(), "principals", null);
        setField(term155413, term155413.getClass(), "permissions", null);
        setBooleanField(term155413, term155413.getClass(), "hasAllPerm", false);
        setBooleanField(term155413, term155413.getClass(), "staticPermissions", false);
        setField(term155413, term155413.getClass(), "key", null);
        setElement(term155398, 4, term155413);
        setField(term155397, term155397.getClass(), "context", term155398);
        setBooleanField(term155397, term155397.getClass(), "isPrivileged", false);
        setBooleanField(term155397, term155397.getClass(), "isAuthorized", false);
        setField(term155418, term155418.getClass(), "context", null);
        setBooleanField(term155418, term155418.getClass(), "isPrivileged", false);
        setBooleanField(term155418, term155418.getClass(), "isAuthorized", false);
        setField(term155418, term155418.getClass(), "privilegedContext", null);
        setField(term155418, term155418.getClass(), "combiner", null);
        setField(term155418, term155418.getClass(), "permissions", null);
        setField(term155418, term155418.getClass(), "parent", null);
        setBooleanField(term155418, term155418.getClass(), "isWrapped", false);
        setBooleanField(term155418, term155418.getClass(), "isLimited", false);
        setField(term155418, term155418.getClass(), "limitedContext", null);
        setField(term155397, term155397.getClass(), "privilegedContext", term155418);
        setField(term155397, term155397.getClass(), "combiner", null);
        setField(term155397, term155397.getClass(), "permissions", null);
        setField(term155397, term155397.getClass(), "parent", null);
        setBooleanField(term155397, term155397.getClass(), "isWrapped", false);
        setBooleanField(term155397, term155397.getClass(), "isLimited", false);
        setField(term155397, term155397.getClass(), "limitedContext", null);
        setField(term155375, term155375.getClass(), "acc", term155397);
        setBooleanField(term155375, term155375.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term155375, term155375.getClass(), "isPosted", true);
        setBooleanField(term155375, term155375.getClass(), "isSystemGenerated", true);
        setField(term155375, term155375.getClass(), "source", term155428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$LoadRomAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term155375;
        callMethod(klass, "actionPerformed", argTypes, term155367, args);
    }

};


