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

public class StatusPanel_5_actionPerformed_4252638722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109834;
     Object term109835;

    public StatusPanel_5_actionPerformed_4252638722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109834 = newInstance(Class.forName("com.loomcom.symon.ui.StatusPanel$5"));
        setField(term109834, term109834.getClass(), "this$0", null);
        term109835 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term109850 = (byte[]) newByteArray(3);
        Object term109856 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term109857 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term109858 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109859 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term109860 = (Object[]) newArray("java.security.Principal", 4);
        Object term109863 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109866 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109869 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109872 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109875 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109880 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term109890 = newInstance(Class.forName("java.lang.Object"));
        setField(term109835, term109835.getClass(), "actionCommand", "DSFGlcaXUb");
        setLongField(term109835, term109835.getClass(), "when", 3951346165629352117L);
        setIntField(term109835, term109835.getClass(), "modifiers", -1058018356);
        setByteElement(term109850, 0, (byte) 123);
        setByteElement(term109850, 1, (byte) -5);
        setByteElement(term109850, 2, (byte) 84);
        setField(term109835, term109835.getClass(), "bdata", term109850);
        setIntField(term109835, term109835.getClass(), "id", -618930598);
        setBooleanField(term109835, term109835.getClass(), "consumed", true);
        setField(term109859, term109859.getClass(), "location", null);
        setField(term109859, term109859.getClass(), "signers", null);
        setField(term109859, term109859.getClass(), "certs", null);
        setField(term109859, term109859.getClass(), "sp", null);
        setField(term109859, term109859.getClass(), "factory", null);
        setField(term109859, term109859.getClass(), "locationNoFragString", null);
        setField(term109858, term109858.getClass(), "codesource", term109859);
        setField(term109858, term109858.getClass(), "classloader", null);
        setField(term109858, term109858.getClass(), "principals", term109860);
        setField(term109858, term109858.getClass(), "permissions", null);
        setBooleanField(term109858, term109858.getClass(), "hasAllPerm", false);
        setBooleanField(term109858, term109858.getClass(), "staticPermissions", false);
        setField(term109858, term109858.getClass(), "key", null);
        setElement(term109857, 0, term109858);
        setField(term109863, term109863.getClass(), "codesource", null);
        setField(term109863, term109863.getClass(), "classloader", null);
        setField(term109863, term109863.getClass(), "principals", null);
        setField(term109863, term109863.getClass(), "permissions", null);
        setBooleanField(term109863, term109863.getClass(), "hasAllPerm", false);
        setBooleanField(term109863, term109863.getClass(), "staticPermissions", false);
        setField(term109863, term109863.getClass(), "key", null);
        setElement(term109857, 1, term109863);
        setField(term109866, term109866.getClass(), "codesource", null);
        setField(term109866, term109866.getClass(), "classloader", null);
        setField(term109866, term109866.getClass(), "principals", null);
        setField(term109866, term109866.getClass(), "permissions", null);
        setBooleanField(term109866, term109866.getClass(), "hasAllPerm", false);
        setBooleanField(term109866, term109866.getClass(), "staticPermissions", false);
        setField(term109866, term109866.getClass(), "key", null);
        setElement(term109857, 2, term109866);
        setField(term109869, term109869.getClass(), "codesource", null);
        setField(term109869, term109869.getClass(), "classloader", null);
        setField(term109869, term109869.getClass(), "principals", null);
        setField(term109869, term109869.getClass(), "permissions", null);
        setBooleanField(term109869, term109869.getClass(), "hasAllPerm", false);
        setBooleanField(term109869, term109869.getClass(), "staticPermissions", false);
        setField(term109869, term109869.getClass(), "key", null);
        setElement(term109857, 3, term109869);
        setField(term109872, term109872.getClass(), "codesource", null);
        setField(term109872, term109872.getClass(), "classloader", null);
        setField(term109872, term109872.getClass(), "principals", null);
        setField(term109872, term109872.getClass(), "permissions", null);
        setBooleanField(term109872, term109872.getClass(), "hasAllPerm", false);
        setBooleanField(term109872, term109872.getClass(), "staticPermissions", false);
        setField(term109872, term109872.getClass(), "key", null);
        setElement(term109857, 4, term109872);
        setField(term109875, term109875.getClass(), "codesource", null);
        setField(term109875, term109875.getClass(), "classloader", null);
        setField(term109875, term109875.getClass(), "principals", null);
        setField(term109875, term109875.getClass(), "permissions", null);
        setBooleanField(term109875, term109875.getClass(), "hasAllPerm", false);
        setBooleanField(term109875, term109875.getClass(), "staticPermissions", false);
        setField(term109875, term109875.getClass(), "key", null);
        setElement(term109857, 5, term109875);
        setField(term109856, term109856.getClass(), "context", term109857);
        setBooleanField(term109856, term109856.getClass(), "isPrivileged", false);
        setBooleanField(term109856, term109856.getClass(), "isAuthorized", false);
        setField(term109880, term109880.getClass(), "context", null);
        setBooleanField(term109880, term109880.getClass(), "isPrivileged", false);
        setBooleanField(term109880, term109880.getClass(), "isAuthorized", false);
        setField(term109880, term109880.getClass(), "privilegedContext", null);
        setField(term109880, term109880.getClass(), "combiner", null);
        setField(term109880, term109880.getClass(), "permissions", null);
        setField(term109880, term109880.getClass(), "parent", null);
        setBooleanField(term109880, term109880.getClass(), "isWrapped", false);
        setBooleanField(term109880, term109880.getClass(), "isLimited", false);
        setField(term109880, term109880.getClass(), "limitedContext", null);
        setField(term109856, term109856.getClass(), "privilegedContext", term109880);
        setField(term109856, term109856.getClass(), "combiner", null);
        setField(term109856, term109856.getClass(), "permissions", null);
        setField(term109856, term109856.getClass(), "parent", null);
        setBooleanField(term109856, term109856.getClass(), "isWrapped", false);
        setBooleanField(term109856, term109856.getClass(), "isLimited", false);
        setField(term109856, term109856.getClass(), "limitedContext", null);
        setField(term109835, term109835.getClass(), "acc", term109856);
        setBooleanField(term109835, term109835.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term109835, term109835.getClass(), "isPosted", true);
        setBooleanField(term109835, term109835.getClass(), "isSystemGenerated", false);
        setField(term109835, term109835.getClass(), "source", term109890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.StatusPanel$5");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term109835;
        callMethod(klass, "actionPerformed", argTypes, term109834, args);
    }

};


