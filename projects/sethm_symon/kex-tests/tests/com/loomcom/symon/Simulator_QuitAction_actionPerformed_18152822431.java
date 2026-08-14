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

public class Simulator_QuitAction_actionPerformed_18152822431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49175;
     Object term49183;

    public Simulator_QuitAction_actionPerformed_18152822431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49175 = newInstance(Class.forName("com.loomcom.symon.Simulator$QuitAction"));
        Object term49177 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term49178 = newInstance(Class.forName("java.lang.Object"));
        Object term49179 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term49181 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term49182 = newInstance(Class.forName("java.lang.Object"));
        setField(term49175, term49175.getClass(), "this$0", null);
        setBooleanField(term49175, term49175.getClass(), "enabled", false);
        setField(term49177, term49177.getClass(), "table", term49178);
        setField(term49175, term49175.getClass(), "arrayTable", term49177);
        setBooleanField(term49179, term49179.getClass(), "notifyOnEDT", false);
        setField(term49181, term49181.getClass(), "map", null);
        setField(term49179, term49179.getClass(), "map", term49181);
        setField(term49179, term49179.getClass(), "source", term49182);
        setField(term49175, term49175.getClass(), "changeSupport", term49179);
        term49183 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term49198 = (byte[]) newByteArray(4);
        Object term49205 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term49206 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term49207 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term49208 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term49209 = (Object[]) newArray("java.security.Principal", 1);
        Object term49214 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term49224 = newInstance(Class.forName("java.lang.Object"));
        setField(term49183, term49183.getClass(), "actionCommand", "XYtryyobou");
        setLongField(term49183, term49183.getClass(), "when", 3731931947533293029L);
        setIntField(term49183, term49183.getClass(), "modifiers", 658285959);
        setByteElement(term49198, 0, (byte) 87);
        setByteElement(term49198, 1, (byte) 121);
        setByteElement(term49198, 2, (byte) -99);
        setByteElement(term49198, 3, (byte) -2);
        setField(term49183, term49183.getClass(), "bdata", term49198);
        setIntField(term49183, term49183.getClass(), "id", -89362706);
        setBooleanField(term49183, term49183.getClass(), "consumed", true);
        setField(term49208, term49208.getClass(), "location", null);
        setField(term49208, term49208.getClass(), "signers", null);
        setField(term49208, term49208.getClass(), "certs", null);
        setField(term49208, term49208.getClass(), "sp", null);
        setField(term49208, term49208.getClass(), "factory", null);
        setField(term49208, term49208.getClass(), "locationNoFragString", null);
        setField(term49207, term49207.getClass(), "codesource", term49208);
        setField(term49207, term49207.getClass(), "classloader", null);
        setField(term49207, term49207.getClass(), "principals", term49209);
        setField(term49207, term49207.getClass(), "permissions", null);
        setBooleanField(term49207, term49207.getClass(), "hasAllPerm", false);
        setBooleanField(term49207, term49207.getClass(), "staticPermissions", false);
        setField(term49207, term49207.getClass(), "key", null);
        setElement(term49206, 0, term49207);
        setField(term49205, term49205.getClass(), "context", term49206);
        setBooleanField(term49205, term49205.getClass(), "isPrivileged", false);
        setBooleanField(term49205, term49205.getClass(), "isAuthorized", true);
        setField(term49214, term49214.getClass(), "context", null);
        setBooleanField(term49214, term49214.getClass(), "isPrivileged", false);
        setBooleanField(term49214, term49214.getClass(), "isAuthorized", false);
        setField(term49214, term49214.getClass(), "privilegedContext", null);
        setField(term49214, term49214.getClass(), "combiner", null);
        setField(term49214, term49214.getClass(), "permissions", null);
        setField(term49214, term49214.getClass(), "parent", null);
        setBooleanField(term49214, term49214.getClass(), "isWrapped", false);
        setBooleanField(term49214, term49214.getClass(), "isLimited", false);
        setField(term49214, term49214.getClass(), "limitedContext", null);
        setField(term49205, term49205.getClass(), "privilegedContext", term49214);
        setField(term49205, term49205.getClass(), "combiner", null);
        setField(term49205, term49205.getClass(), "permissions", null);
        setField(term49205, term49205.getClass(), "parent", null);
        setBooleanField(term49205, term49205.getClass(), "isWrapped", false);
        setBooleanField(term49205, term49205.getClass(), "isLimited", false);
        setField(term49205, term49205.getClass(), "limitedContext", null);
        setField(term49183, term49183.getClass(), "acc", term49205);
        setBooleanField(term49183, term49183.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term49183, term49183.getClass(), "isPosted", true);
        setBooleanField(term49183, term49183.getClass(), "isSystemGenerated", false);
        setField(term49183, term49183.getClass(), "source", term49224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$QuitAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term49183;
        callMethod(klass, "actionPerformed", argTypes, term49175, args);
    }

};


