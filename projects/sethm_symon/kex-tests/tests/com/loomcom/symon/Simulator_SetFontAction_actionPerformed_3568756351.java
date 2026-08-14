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

public class Simulator_SetFontAction_actionPerformed_3568756351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96149;
     Object term96158;

    public Simulator_SetFontAction_actionPerformed_3568756351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96149 = newInstance(Class.forName("com.loomcom.symon.Simulator$SetFontAction"));
        Object term96152 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term96153 = newInstance(Class.forName("java.lang.Object"));
        Object term96154 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term96156 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term96157 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term96149, term96149.getClass(), "size", -1367263864);
        setField(term96149, term96149.getClass(), "this$0", null);
        setBooleanField(term96149, term96149.getClass(), "enabled", false);
        setField(term96152, term96152.getClass(), "table", term96153);
        setField(term96149, term96149.getClass(), "arrayTable", term96152);
        setBooleanField(term96154, term96154.getClass(), "notifyOnEDT", false);
        setField(term96156, term96156.getClass(), "map", null);
        setField(term96154, term96154.getClass(), "map", term96156);
        setField(term96154, term96154.getClass(), "source", term96157);
        setField(term96149, term96149.getClass(), "changeSupport", term96154);
        term96158 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term96173 = (byte[]) newByteArray(2);
        Object term96178 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term96179 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term96180 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term96181 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term96182 = (Object[]) newArray("java.security.Principal", 0);
        Object term96185 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term96188 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term96191 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term96194 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term96197 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term96202 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term96212 = newInstance(Class.forName("java.lang.Object"));
        setField(term96158, term96158.getClass(), "actionCommand", "fzeqPnzpnt");
        setLongField(term96158, term96158.getClass(), "when", 1528628920302068646L);
        setIntField(term96158, term96158.getClass(), "modifiers", 1810292112);
        setByteElement(term96173, 0, (byte) 116);
        setByteElement(term96173, 1, (byte) -81);
        setField(term96158, term96158.getClass(), "bdata", term96173);
        setIntField(term96158, term96158.getClass(), "id", 385619995);
        setBooleanField(term96158, term96158.getClass(), "consumed", false);
        setField(term96181, term96181.getClass(), "location", null);
        setField(term96181, term96181.getClass(), "signers", null);
        setField(term96181, term96181.getClass(), "certs", null);
        setField(term96181, term96181.getClass(), "sp", null);
        setField(term96181, term96181.getClass(), "factory", null);
        setField(term96181, term96181.getClass(), "locationNoFragString", null);
        setField(term96180, term96180.getClass(), "codesource", term96181);
        setField(term96180, term96180.getClass(), "classloader", null);
        setField(term96180, term96180.getClass(), "principals", term96182);
        setField(term96180, term96180.getClass(), "permissions", null);
        setBooleanField(term96180, term96180.getClass(), "hasAllPerm", false);
        setBooleanField(term96180, term96180.getClass(), "staticPermissions", false);
        setField(term96180, term96180.getClass(), "key", null);
        setElement(term96179, 0, term96180);
        setField(term96185, term96185.getClass(), "codesource", null);
        setField(term96185, term96185.getClass(), "classloader", null);
        setField(term96185, term96185.getClass(), "principals", null);
        setField(term96185, term96185.getClass(), "permissions", null);
        setBooleanField(term96185, term96185.getClass(), "hasAllPerm", false);
        setBooleanField(term96185, term96185.getClass(), "staticPermissions", false);
        setField(term96185, term96185.getClass(), "key", null);
        setElement(term96179, 1, term96185);
        setField(term96188, term96188.getClass(), "codesource", null);
        setField(term96188, term96188.getClass(), "classloader", null);
        setField(term96188, term96188.getClass(), "principals", null);
        setField(term96188, term96188.getClass(), "permissions", null);
        setBooleanField(term96188, term96188.getClass(), "hasAllPerm", false);
        setBooleanField(term96188, term96188.getClass(), "staticPermissions", false);
        setField(term96188, term96188.getClass(), "key", null);
        setElement(term96179, 2, term96188);
        setField(term96191, term96191.getClass(), "codesource", null);
        setField(term96191, term96191.getClass(), "classloader", null);
        setField(term96191, term96191.getClass(), "principals", null);
        setField(term96191, term96191.getClass(), "permissions", null);
        setBooleanField(term96191, term96191.getClass(), "hasAllPerm", false);
        setBooleanField(term96191, term96191.getClass(), "staticPermissions", false);
        setField(term96191, term96191.getClass(), "key", null);
        setElement(term96179, 3, term96191);
        setField(term96194, term96194.getClass(), "codesource", null);
        setField(term96194, term96194.getClass(), "classloader", null);
        setField(term96194, term96194.getClass(), "principals", null);
        setField(term96194, term96194.getClass(), "permissions", null);
        setBooleanField(term96194, term96194.getClass(), "hasAllPerm", false);
        setBooleanField(term96194, term96194.getClass(), "staticPermissions", false);
        setField(term96194, term96194.getClass(), "key", null);
        setElement(term96179, 4, term96194);
        setField(term96197, term96197.getClass(), "codesource", null);
        setField(term96197, term96197.getClass(), "classloader", null);
        setField(term96197, term96197.getClass(), "principals", null);
        setField(term96197, term96197.getClass(), "permissions", null);
        setBooleanField(term96197, term96197.getClass(), "hasAllPerm", false);
        setBooleanField(term96197, term96197.getClass(), "staticPermissions", false);
        setField(term96197, term96197.getClass(), "key", null);
        setElement(term96179, 5, term96197);
        setField(term96178, term96178.getClass(), "context", term96179);
        setBooleanField(term96178, term96178.getClass(), "isPrivileged", true);
        setBooleanField(term96178, term96178.getClass(), "isAuthorized", true);
        setField(term96202, term96202.getClass(), "context", null);
        setBooleanField(term96202, term96202.getClass(), "isPrivileged", false);
        setBooleanField(term96202, term96202.getClass(), "isAuthorized", false);
        setField(term96202, term96202.getClass(), "privilegedContext", null);
        setField(term96202, term96202.getClass(), "combiner", null);
        setField(term96202, term96202.getClass(), "permissions", null);
        setField(term96202, term96202.getClass(), "parent", null);
        setBooleanField(term96202, term96202.getClass(), "isWrapped", false);
        setBooleanField(term96202, term96202.getClass(), "isLimited", false);
        setField(term96202, term96202.getClass(), "limitedContext", null);
        setField(term96178, term96178.getClass(), "privilegedContext", term96202);
        setField(term96178, term96178.getClass(), "combiner", null);
        setField(term96178, term96178.getClass(), "permissions", null);
        setField(term96178, term96178.getClass(), "parent", null);
        setBooleanField(term96178, term96178.getClass(), "isWrapped", false);
        setBooleanField(term96178, term96178.getClass(), "isLimited", false);
        setField(term96178, term96178.getClass(), "limitedContext", null);
        setField(term96158, term96158.getClass(), "acc", term96178);
        setBooleanField(term96158, term96158.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term96158, term96158.getClass(), "isPosted", true);
        setBooleanField(term96158, term96158.getClass(), "isSystemGenerated", true);
        setField(term96158, term96158.getClass(), "source", term96212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$SetFontAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term96158;
        callMethod(klass, "actionPerformed", argTypes, term96149, args);
    }

};


