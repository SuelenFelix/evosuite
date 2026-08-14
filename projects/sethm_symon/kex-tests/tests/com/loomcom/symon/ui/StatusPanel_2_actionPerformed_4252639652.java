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

public class StatusPanel_2_actionPerformed_4252639652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115854;
     Object term115855;

    public StatusPanel_2_actionPerformed_4252639652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115854 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel$2"));
        setField(term115854, term115854.getClass(), "this$0", null);
        term115855 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term115870 = (byte[]) newByteArray(6);
        Object term115879 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term115880 = (Object[]) newArray("java.security.ProtectionDomain", 0);
        Object term115883 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term115884 = (Object[]) newArray("java.security.ProtectionDomain", 4);
        Object term115885 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term115888 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term115891 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term115894 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term115899 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term115911 = newInstance(Class.forName("java.lang.Object"));
        setField(term115855, term115855.getClass(), "actionCommand", "kVAmKknVln");
        setLongField(term115855, term115855.getClass(), "when", -8033044954947064558L);
        setIntField(term115855, term115855.getClass(), "modifiers", 2007310608);
        setByteElement(term115870, 0, (byte) -128);
        setByteElement(term115870, 1, (byte) 66);
        setByteElement(term115870, 2, (byte) -112);
        setByteElement(term115870, 3, (byte) 81);
        setByteElement(term115870, 4, (byte) 65);
        setByteElement(term115870, 5, (byte) -44);
        setField(term115855, term115855.getClass(), "bdata", term115870);
        setIntField(term115855, term115855.getClass(), "id", 462157519);
        setBooleanField(term115855, term115855.getClass(), "consumed", false);
        setField(term115879, term115879.getClass(), "context", term115880);
        setBooleanField(term115879, term115879.getClass(), "isPrivileged", true);
        setBooleanField(term115879, term115879.getClass(), "isAuthorized", true);
        setField(term115885, term115885.getClass(), "codesource", null);
        setField(term115885, term115885.getClass(), "classloader", null);
        setField(term115885, term115885.getClass(), "principals", null);
        setField(term115885, term115885.getClass(), "permissions", null);
        setBooleanField(term115885, term115885.getClass(), "hasAllPerm", false);
        setBooleanField(term115885, term115885.getClass(), "staticPermissions", false);
        setField(term115885, term115885.getClass(), "key", null);
        setElement(term115884, 0, term115885);
        setField(term115888, term115888.getClass(), "codesource", null);
        setField(term115888, term115888.getClass(), "classloader", null);
        setField(term115888, term115888.getClass(), "principals", null);
        setField(term115888, term115888.getClass(), "permissions", null);
        setBooleanField(term115888, term115888.getClass(), "hasAllPerm", false);
        setBooleanField(term115888, term115888.getClass(), "staticPermissions", false);
        setField(term115888, term115888.getClass(), "key", null);
        setElement(term115884, 1, term115888);
        setField(term115891, term115891.getClass(), "codesource", null);
        setField(term115891, term115891.getClass(), "classloader", null);
        setField(term115891, term115891.getClass(), "principals", null);
        setField(term115891, term115891.getClass(), "permissions", null);
        setBooleanField(term115891, term115891.getClass(), "hasAllPerm", false);
        setBooleanField(term115891, term115891.getClass(), "staticPermissions", false);
        setField(term115891, term115891.getClass(), "key", null);
        setElement(term115884, 2, term115891);
        setField(term115894, term115894.getClass(), "codesource", null);
        setField(term115894, term115894.getClass(), "classloader", null);
        setField(term115894, term115894.getClass(), "principals", null);
        setField(term115894, term115894.getClass(), "permissions", null);
        setBooleanField(term115894, term115894.getClass(), "hasAllPerm", false);
        setBooleanField(term115894, term115894.getClass(), "staticPermissions", false);
        setField(term115894, term115894.getClass(), "key", null);
        setElement(term115884, 3, term115894);
        setField(term115883, term115883.getClass(), "context", term115884);
        setBooleanField(term115883, term115883.getClass(), "isPrivileged", true);
        setBooleanField(term115883, term115883.getClass(), "isAuthorized", false);
        setField(term115899, term115899.getClass(), "context", null);
        setBooleanField(term115899, term115899.getClass(), "isPrivileged", false);
        setBooleanField(term115899, term115899.getClass(), "isAuthorized", false);
        setField(term115899, term115899.getClass(), "privilegedContext", null);
        setField(term115899, term115899.getClass(), "combiner", null);
        setField(term115899, term115899.getClass(), "permissions", null);
        setField(term115899, term115899.getClass(), "parent", null);
        setBooleanField(term115899, term115899.getClass(), "isWrapped", false);
        setBooleanField(term115899, term115899.getClass(), "isLimited", false);
        setField(term115899, term115899.getClass(), "limitedContext", null);
        setField(term115883, term115883.getClass(), "privilegedContext", term115899);
        setField(term115883, term115883.getClass(), "combiner", null);
        setField(term115883, term115883.getClass(), "permissions", null);
        setField(term115883, term115883.getClass(), "parent", null);
        setBooleanField(term115883, term115883.getClass(), "isWrapped", false);
        setBooleanField(term115883, term115883.getClass(), "isLimited", false);
        setField(term115883, term115883.getClass(), "limitedContext", null);
        setField(term115879, term115879.getClass(), "privilegedContext", term115883);
        setField(term115879, term115879.getClass(), "combiner", null);
        setField(term115879, term115879.getClass(), "permissions", null);
        setField(term115879, term115879.getClass(), "parent", null);
        setBooleanField(term115879, term115879.getClass(), "isWrapped", false);
        setBooleanField(term115879, term115879.getClass(), "isLimited", false);
        setField(term115879, term115879.getClass(), "limitedContext", null);
        setField(term115855, term115855.getClass(), "acc", term115879);
        setBooleanField(term115855, term115855.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term115855, term115855.getClass(), "isPosted", false);
        setBooleanField(term115855, term115855.getClass(), "isSystemGenerated", false);
        setField(term115855, term115855.getClass(), "source", term115911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term115855;
        callMethod(klass, "actionPerformed", argTypes, term115854, args);
    }

};


