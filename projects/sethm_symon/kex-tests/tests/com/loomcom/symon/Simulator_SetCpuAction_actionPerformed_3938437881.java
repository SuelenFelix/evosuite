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
import java.lang.String;
import java.lang.Object;

public class Simulator_SetCpuAction_actionPerformed_3938437881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96918;
     Object term96947;

    public Simulator_SetCpuAction_actionPerformed_3938437881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96998 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term96997 = ((Class) term96998).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term96997).setAccessible(true);
        Object enum91 = ((Field) term96997).get((Object) null);
        term96918 = newInstance(Class.forName("com.loomcom.symon.Simulator$SetCpuAction"));
        Object term96941 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term96942 = newInstance(Class.forName("java.lang.Object"));
        Object term96943 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term96945 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term96946 = newInstance(Class.forName("java.lang.Object"));
        setField(term96918, term96918.getClass(), "behavior", enum91);
        setField(term96918, term96918.getClass(), "this$0", null);
        setBooleanField(term96918, term96918.getClass(), "enabled", false);
        setField(term96941, term96941.getClass(), "table", term96942);
        setField(term96918, term96918.getClass(), "arrayTable", term96941);
        setBooleanField(term96943, term96943.getClass(), "notifyOnEDT", false);
        setField(term96945, term96945.getClass(), "map", null);
        setField(term96943, term96943.getClass(), "map", term96945);
        setField(term96943, term96943.getClass(), "source", term96946);
        setField(term96918, term96918.getClass(), "changeSupport", term96943);
        term96947 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term96962 = (byte[]) newByteArray(6);
        Object term96971 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term96972 = (Object[]) newArray("java.security.ProtectionDomain", 3);
        Object term96973 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term96974 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term96975 = (Object[]) newArray("java.security.Principal", 0);
        Object term96978 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term96981 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term96986 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term96996 = newInstance(Class.forName("java.lang.Object"));
        setField(term96947, term96947.getClass(), "actionCommand", "qFGKIJjlmV");
        setLongField(term96947, term96947.getClass(), "when", 8640463098965331396L);
        setIntField(term96947, term96947.getClass(), "modifiers", 398974629);
        setByteElement(term96962, 0, (byte) 102);
        setByteElement(term96962, 1, (byte) -118);
        setByteElement(term96962, 2, (byte) -126);
        setByteElement(term96962, 3, (byte) -91);
        setByteElement(term96962, 4, (byte) -104);
        setByteElement(term96962, 5, (byte) -89);
        setField(term96947, term96947.getClass(), "bdata", term96962);
        setIntField(term96947, term96947.getClass(), "id", -790946306);
        setBooleanField(term96947, term96947.getClass(), "consumed", true);
        setField(term96974, term96974.getClass(), "location", null);
        setField(term96974, term96974.getClass(), "signers", null);
        setField(term96974, term96974.getClass(), "certs", null);
        setField(term96974, term96974.getClass(), "sp", null);
        setField(term96974, term96974.getClass(), "factory", null);
        setField(term96974, term96974.getClass(), "locationNoFragString", null);
        setField(term96973, term96973.getClass(), "codesource", term96974);
        setField(term96973, term96973.getClass(), "classloader", null);
        setField(term96973, term96973.getClass(), "principals", term96975);
        setField(term96973, term96973.getClass(), "permissions", null);
        setBooleanField(term96973, term96973.getClass(), "hasAllPerm", false);
        setBooleanField(term96973, term96973.getClass(), "staticPermissions", false);
        setField(term96973, term96973.getClass(), "key", null);
        setElement(term96972, 0, term96973);
        setField(term96978, term96978.getClass(), "codesource", null);
        setField(term96978, term96978.getClass(), "classloader", null);
        setField(term96978, term96978.getClass(), "principals", null);
        setField(term96978, term96978.getClass(), "permissions", null);
        setBooleanField(term96978, term96978.getClass(), "hasAllPerm", false);
        setBooleanField(term96978, term96978.getClass(), "staticPermissions", false);
        setField(term96978, term96978.getClass(), "key", null);
        setElement(term96972, 1, term96978);
        setField(term96981, term96981.getClass(), "codesource", null);
        setField(term96981, term96981.getClass(), "classloader", null);
        setField(term96981, term96981.getClass(), "principals", null);
        setField(term96981, term96981.getClass(), "permissions", null);
        setBooleanField(term96981, term96981.getClass(), "hasAllPerm", false);
        setBooleanField(term96981, term96981.getClass(), "staticPermissions", false);
        setField(term96981, term96981.getClass(), "key", null);
        setElement(term96972, 2, term96981);
        setField(term96971, term96971.getClass(), "context", term96972);
        setBooleanField(term96971, term96971.getClass(), "isPrivileged", false);
        setBooleanField(term96971, term96971.getClass(), "isAuthorized", false);
        setField(term96986, term96986.getClass(), "context", null);
        setBooleanField(term96986, term96986.getClass(), "isPrivileged", false);
        setBooleanField(term96986, term96986.getClass(), "isAuthorized", false);
        setField(term96986, term96986.getClass(), "privilegedContext", null);
        setField(term96986, term96986.getClass(), "combiner", null);
        setField(term96986, term96986.getClass(), "permissions", null);
        setField(term96986, term96986.getClass(), "parent", null);
        setBooleanField(term96986, term96986.getClass(), "isWrapped", false);
        setBooleanField(term96986, term96986.getClass(), "isLimited", false);
        setField(term96986, term96986.getClass(), "limitedContext", null);
        setField(term96971, term96971.getClass(), "privilegedContext", term96986);
        setField(term96971, term96971.getClass(), "combiner", null);
        setField(term96971, term96971.getClass(), "permissions", null);
        setField(term96971, term96971.getClass(), "parent", null);
        setBooleanField(term96971, term96971.getClass(), "isWrapped", false);
        setBooleanField(term96971, term96971.getClass(), "isLimited", false);
        setField(term96971, term96971.getClass(), "limitedContext", null);
        setField(term96947, term96947.getClass(), "acc", term96971);
        setBooleanField(term96947, term96947.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term96947, term96947.getClass(), "isPosted", true);
        setBooleanField(term96947, term96947.getClass(), "isSystemGenerated", true);
        setField(term96947, term96947.getClass(), "source", term96996);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$SetCpuAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term96947;
        callMethod(klass, "actionPerformed", argTypes, term96918, args);
    }

};


