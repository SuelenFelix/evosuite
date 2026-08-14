package com.loomcom.symon.ui;

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
import static com.loomcom.symon.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StatusPanel_1_actionPerformed_4252639962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112821;
     Object term112822;

    public StatusPanel_1_actionPerformed_4252639962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112821 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel$1"));
        setField(term112821, term112821.getClass(), "this$0", null);
        term112822 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term112837 = (byte[]) newByteArray(7);
        Object term112847 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term112848 = (Object[]) newArray("java.security.ProtectionDomain", 0);
        Object term112851 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term112852 = (Object[]) newArray("java.security.ProtectionDomain", 3);
        Object term112853 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term112856 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term112859 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term112864 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term112876 = newInstance(Class.forName("java.lang.Object"));
        setField(term112822, term112822.getClass(), "actionCommand", "RTTvrwwhou");
        setLongField(term112822, term112822.getClass(), "when", -4187265590402169996L);
        setIntField(term112822, term112822.getClass(), "modifiers", -782282859);
        setByteElement(term112837, 0, (byte) -97);
        setByteElement(term112837, 1, (byte) -24);
        setByteElement(term112837, 2, (byte) 88);
        setByteElement(term112837, 3, (byte) 96);
        setByteElement(term112837, 4, (byte) 70);
        setByteElement(term112837, 5, (byte) 48);
        setByteElement(term112837, 6, (byte) -46);
        setField(term112822, term112822.getClass(), "bdata", term112837);
        setIntField(term112822, term112822.getClass(), "id", -289872820);
        setBooleanField(term112822, term112822.getClass(), "consumed", true);
        setField(term112847, term112847.getClass(), "context", term112848);
        setBooleanField(term112847, term112847.getClass(), "isPrivileged", false);
        setBooleanField(term112847, term112847.getClass(), "isAuthorized", false);
        setField(term112853, term112853.getClass(), "codesource", null);
        setField(term112853, term112853.getClass(), "classloader", null);
        setField(term112853, term112853.getClass(), "principals", null);
        setField(term112853, term112853.getClass(), "permissions", null);
        setBooleanField(term112853, term112853.getClass(), "hasAllPerm", false);
        setBooleanField(term112853, term112853.getClass(), "staticPermissions", false);
        setField(term112853, term112853.getClass(), "key", null);
        setElement(term112852, 0, term112853);
        setField(term112856, term112856.getClass(), "codesource", null);
        setField(term112856, term112856.getClass(), "classloader", null);
        setField(term112856, term112856.getClass(), "principals", null);
        setField(term112856, term112856.getClass(), "permissions", null);
        setBooleanField(term112856, term112856.getClass(), "hasAllPerm", false);
        setBooleanField(term112856, term112856.getClass(), "staticPermissions", false);
        setField(term112856, term112856.getClass(), "key", null);
        setElement(term112852, 1, term112856);
        setField(term112859, term112859.getClass(), "codesource", null);
        setField(term112859, term112859.getClass(), "classloader", null);
        setField(term112859, term112859.getClass(), "principals", null);
        setField(term112859, term112859.getClass(), "permissions", null);
        setBooleanField(term112859, term112859.getClass(), "hasAllPerm", false);
        setBooleanField(term112859, term112859.getClass(), "staticPermissions", false);
        setField(term112859, term112859.getClass(), "key", null);
        setElement(term112852, 2, term112859);
        setField(term112851, term112851.getClass(), "context", term112852);
        setBooleanField(term112851, term112851.getClass(), "isPrivileged", false);
        setBooleanField(term112851, term112851.getClass(), "isAuthorized", true);
        setField(term112864, term112864.getClass(), "context", null);
        setBooleanField(term112864, term112864.getClass(), "isPrivileged", false);
        setBooleanField(term112864, term112864.getClass(), "isAuthorized", false);
        setField(term112864, term112864.getClass(), "privilegedContext", null);
        setField(term112864, term112864.getClass(), "combiner", null);
        setField(term112864, term112864.getClass(), "permissions", null);
        setField(term112864, term112864.getClass(), "parent", null);
        setBooleanField(term112864, term112864.getClass(), "isWrapped", false);
        setBooleanField(term112864, term112864.getClass(), "isLimited", false);
        setField(term112864, term112864.getClass(), "limitedContext", null);
        setField(term112851, term112851.getClass(), "privilegedContext", term112864);
        setField(term112851, term112851.getClass(), "combiner", null);
        setField(term112851, term112851.getClass(), "permissions", null);
        setField(term112851, term112851.getClass(), "parent", null);
        setBooleanField(term112851, term112851.getClass(), "isWrapped", false);
        setBooleanField(term112851, term112851.getClass(), "isLimited", false);
        setField(term112851, term112851.getClass(), "limitedContext", null);
        setField(term112847, term112847.getClass(), "privilegedContext", term112851);
        setField(term112847, term112847.getClass(), "combiner", null);
        setField(term112847, term112847.getClass(), "permissions", null);
        setField(term112847, term112847.getClass(), "parent", null);
        setBooleanField(term112847, term112847.getClass(), "isWrapped", false);
        setBooleanField(term112847, term112847.getClass(), "isLimited", false);
        setField(term112847, term112847.getClass(), "limitedContext", null);
        setField(term112822, term112822.getClass(), "acc", term112847);
        setBooleanField(term112822, term112822.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term112822, term112822.getClass(), "isPosted", true);
        setBooleanField(term112822, term112822.getClass(), "isSystemGenerated", false);
        setField(term112822, term112822.getClass(), "source", term112876);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term112822;
        callMethod(klass, "actionPerformed", argTypes, term112821, args);
    }

};


