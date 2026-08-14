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

public class Simulator_ToggleMemoryWindowAction_actionPerformed_21407817091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98128;
     Object term98136;

    public Simulator_ToggleMemoryWindowAction_actionPerformed_21407817091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98128 = newInstance(Class.forName("com.loomcom.symon.Simulator$ToggleMemoryWindowAction"));
        Object term98130 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term98131 = newInstance(Class.forName("java.lang.Object"));
        Object term98132 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term98134 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term98135 = newInstance(Class.forName("java.lang.Object"));
        setField(term98128, term98128.getClass(), "this$0", null);
        setBooleanField(term98128, term98128.getClass(), "enabled", false);
        setField(term98130, term98130.getClass(), "table", term98131);
        setField(term98128, term98128.getClass(), "arrayTable", term98130);
        setBooleanField(term98132, term98132.getClass(), "notifyOnEDT", false);
        setField(term98134, term98134.getClass(), "map", null);
        setField(term98132, term98132.getClass(), "map", term98134);
        setField(term98132, term98132.getClass(), "source", term98135);
        setField(term98128, term98128.getClass(), "changeSupport", term98132);
        term98136 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term98151 = (byte[]) newByteArray(4);
        Object term98158 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term98159 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term98160 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98161 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term98162 = (Object[]) newArray("java.security.Principal", 5);
        Object term98165 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98168 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98171 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98174 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98177 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98182 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term98192 = newInstance(Class.forName("java.lang.Object"));
        setField(term98136, term98136.getClass(), "actionCommand", "BDIRCxAWLA");
        setLongField(term98136, term98136.getClass(), "when", 6381166215871562039L);
        setIntField(term98136, term98136.getClass(), "modifiers", 1608737678);
        setByteElement(term98151, 0, (byte) 13);
        setByteElement(term98151, 1, (byte) 44);
        setByteElement(term98151, 2, (byte) -63);
        setByteElement(term98151, 3, (byte) 15);
        setField(term98136, term98136.getClass(), "bdata", term98151);
        setIntField(term98136, term98136.getClass(), "id", -1605443550);
        setBooleanField(term98136, term98136.getClass(), "consumed", false);
        setField(term98161, term98161.getClass(), "location", null);
        setField(term98161, term98161.getClass(), "signers", null);
        setField(term98161, term98161.getClass(), "certs", null);
        setField(term98161, term98161.getClass(), "sp", null);
        setField(term98161, term98161.getClass(), "factory", null);
        setField(term98161, term98161.getClass(), "locationNoFragString", null);
        setField(term98160, term98160.getClass(), "codesource", term98161);
        setField(term98160, term98160.getClass(), "classloader", null);
        setField(term98160, term98160.getClass(), "principals", term98162);
        setField(term98160, term98160.getClass(), "permissions", null);
        setBooleanField(term98160, term98160.getClass(), "hasAllPerm", false);
        setBooleanField(term98160, term98160.getClass(), "staticPermissions", false);
        setField(term98160, term98160.getClass(), "key", null);
        setElement(term98159, 0, term98160);
        setField(term98165, term98165.getClass(), "codesource", null);
        setField(term98165, term98165.getClass(), "classloader", null);
        setField(term98165, term98165.getClass(), "principals", null);
        setField(term98165, term98165.getClass(), "permissions", null);
        setBooleanField(term98165, term98165.getClass(), "hasAllPerm", false);
        setBooleanField(term98165, term98165.getClass(), "staticPermissions", false);
        setField(term98165, term98165.getClass(), "key", null);
        setElement(term98159, 1, term98165);
        setField(term98168, term98168.getClass(), "codesource", null);
        setField(term98168, term98168.getClass(), "classloader", null);
        setField(term98168, term98168.getClass(), "principals", null);
        setField(term98168, term98168.getClass(), "permissions", null);
        setBooleanField(term98168, term98168.getClass(), "hasAllPerm", false);
        setBooleanField(term98168, term98168.getClass(), "staticPermissions", false);
        setField(term98168, term98168.getClass(), "key", null);
        setElement(term98159, 2, term98168);
        setField(term98171, term98171.getClass(), "codesource", null);
        setField(term98171, term98171.getClass(), "classloader", null);
        setField(term98171, term98171.getClass(), "principals", null);
        setField(term98171, term98171.getClass(), "permissions", null);
        setBooleanField(term98171, term98171.getClass(), "hasAllPerm", false);
        setBooleanField(term98171, term98171.getClass(), "staticPermissions", false);
        setField(term98171, term98171.getClass(), "key", null);
        setElement(term98159, 3, term98171);
        setField(term98174, term98174.getClass(), "codesource", null);
        setField(term98174, term98174.getClass(), "classloader", null);
        setField(term98174, term98174.getClass(), "principals", null);
        setField(term98174, term98174.getClass(), "permissions", null);
        setBooleanField(term98174, term98174.getClass(), "hasAllPerm", false);
        setBooleanField(term98174, term98174.getClass(), "staticPermissions", false);
        setField(term98174, term98174.getClass(), "key", null);
        setElement(term98159, 4, term98174);
        setField(term98177, term98177.getClass(), "codesource", null);
        setField(term98177, term98177.getClass(), "classloader", null);
        setField(term98177, term98177.getClass(), "principals", null);
        setField(term98177, term98177.getClass(), "permissions", null);
        setBooleanField(term98177, term98177.getClass(), "hasAllPerm", false);
        setBooleanField(term98177, term98177.getClass(), "staticPermissions", false);
        setField(term98177, term98177.getClass(), "key", null);
        setElement(term98159, 5, term98177);
        setField(term98158, term98158.getClass(), "context", term98159);
        setBooleanField(term98158, term98158.getClass(), "isPrivileged", true);
        setBooleanField(term98158, term98158.getClass(), "isAuthorized", false);
        setField(term98182, term98182.getClass(), "context", null);
        setBooleanField(term98182, term98182.getClass(), "isPrivileged", false);
        setBooleanField(term98182, term98182.getClass(), "isAuthorized", false);
        setField(term98182, term98182.getClass(), "privilegedContext", null);
        setField(term98182, term98182.getClass(), "combiner", null);
        setField(term98182, term98182.getClass(), "permissions", null);
        setField(term98182, term98182.getClass(), "parent", null);
        setBooleanField(term98182, term98182.getClass(), "isWrapped", false);
        setBooleanField(term98182, term98182.getClass(), "isLimited", false);
        setField(term98182, term98182.getClass(), "limitedContext", null);
        setField(term98158, term98158.getClass(), "privilegedContext", term98182);
        setField(term98158, term98158.getClass(), "combiner", null);
        setField(term98158, term98158.getClass(), "permissions", null);
        setField(term98158, term98158.getClass(), "parent", null);
        setBooleanField(term98158, term98158.getClass(), "isWrapped", false);
        setBooleanField(term98158, term98158.getClass(), "isLimited", false);
        setField(term98158, term98158.getClass(), "limitedContext", null);
        setField(term98136, term98136.getClass(), "acc", term98158);
        setBooleanField(term98136, term98136.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term98136, term98136.getClass(), "isPosted", false);
        setBooleanField(term98136, term98136.getClass(), "isSystemGenerated", true);
        setField(term98136, term98136.getClass(), "source", term98192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$ToggleMemoryWindowAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term98136;
        callMethod(klass, "actionPerformed", argTypes, term98128, args);
    }

};


