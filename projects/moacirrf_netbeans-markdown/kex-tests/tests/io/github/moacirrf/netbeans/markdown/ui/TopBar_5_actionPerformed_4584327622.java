package io.github.moacirrf.netbeans.markdown.ui;

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
import static io.github.moacirrf.netbeans.markdown.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TopBar_5_actionPerformed_4584327622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73450;
     Object term73451;

    public TopBar_5_actionPerformed_4584327622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73450 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar$5"));
        setField(term73450, term73450.getClass(), "this$0", null);
        term73451 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term73466 = (byte[]) newByteArray(6);
        Object term73475 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term73476 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term73477 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term73478 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term73479 = (Object[]) newArray("java.security.Principal", 7);
        Object term73482 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term73485 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term73488 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term73491 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term73496 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term73506 = newInstance(Class.forName("java.lang.Object"));
        setField(term73451, term73451.getClass(), "actionCommand", "PgPzMSEjjX");
        setLongField(term73451, term73451.getClass(), "when", -4325723315152823407L);
        setIntField(term73451, term73451.getClass(), "modifiers", -1972436591);
        setByteElement(term73466, 0, (byte) -81);
        setByteElement(term73466, 1, (byte) 102);
        setByteElement(term73466, 2, (byte) -118);
        setByteElement(term73466, 3, (byte) -126);
        setByteElement(term73466, 4, (byte) -91);
        setByteElement(term73466, 5, (byte) -104);
        setField(term73451, term73451.getClass(), "bdata", term73466);
        setIntField(term73451, term73451.getClass(), "id", 68922753);
        setBooleanField(term73451, term73451.getClass(), "consumed", true);
        setField(term73478, term73478.getClass(), "location", null);
        setField(term73478, term73478.getClass(), "signers", null);
        setField(term73478, term73478.getClass(), "certs", null);
        setField(term73478, term73478.getClass(), "sp", null);
        setField(term73478, term73478.getClass(), "factory", null);
        setField(term73478, term73478.getClass(), "locationNoFragString", null);
        setField(term73477, term73477.getClass(), "codesource", term73478);
        setField(term73477, term73477.getClass(), "classloader", null);
        setField(term73477, term73477.getClass(), "principals", term73479);
        setField(term73477, term73477.getClass(), "permissions", null);
        setBooleanField(term73477, term73477.getClass(), "hasAllPerm", false);
        setBooleanField(term73477, term73477.getClass(), "staticPermissions", false);
        setField(term73477, term73477.getClass(), "key", null);
        setElement(term73476, 0, term73477);
        setField(term73482, term73482.getClass(), "codesource", null);
        setField(term73482, term73482.getClass(), "classloader", null);
        setField(term73482, term73482.getClass(), "principals", null);
        setField(term73482, term73482.getClass(), "permissions", null);
        setBooleanField(term73482, term73482.getClass(), "hasAllPerm", false);
        setBooleanField(term73482, term73482.getClass(), "staticPermissions", false);
        setField(term73482, term73482.getClass(), "key", null);
        setElement(term73476, 1, term73482);
        setField(term73485, term73485.getClass(), "codesource", null);
        setField(term73485, term73485.getClass(), "classloader", null);
        setField(term73485, term73485.getClass(), "principals", null);
        setField(term73485, term73485.getClass(), "permissions", null);
        setBooleanField(term73485, term73485.getClass(), "hasAllPerm", false);
        setBooleanField(term73485, term73485.getClass(), "staticPermissions", false);
        setField(term73485, term73485.getClass(), "key", null);
        setElement(term73476, 2, term73485);
        setField(term73488, term73488.getClass(), "codesource", null);
        setField(term73488, term73488.getClass(), "classloader", null);
        setField(term73488, term73488.getClass(), "principals", null);
        setField(term73488, term73488.getClass(), "permissions", null);
        setBooleanField(term73488, term73488.getClass(), "hasAllPerm", false);
        setBooleanField(term73488, term73488.getClass(), "staticPermissions", false);
        setField(term73488, term73488.getClass(), "key", null);
        setElement(term73476, 3, term73488);
        setField(term73491, term73491.getClass(), "codesource", null);
        setField(term73491, term73491.getClass(), "classloader", null);
        setField(term73491, term73491.getClass(), "principals", null);
        setField(term73491, term73491.getClass(), "permissions", null);
        setBooleanField(term73491, term73491.getClass(), "hasAllPerm", false);
        setBooleanField(term73491, term73491.getClass(), "staticPermissions", false);
        setField(term73491, term73491.getClass(), "key", null);
        setElement(term73476, 4, term73491);
        setField(term73475, term73475.getClass(), "context", term73476);
        setBooleanField(term73475, term73475.getClass(), "isPrivileged", false);
        setBooleanField(term73475, term73475.getClass(), "isAuthorized", true);
        setField(term73496, term73496.getClass(), "context", null);
        setBooleanField(term73496, term73496.getClass(), "isPrivileged", false);
        setBooleanField(term73496, term73496.getClass(), "isAuthorized", false);
        setField(term73496, term73496.getClass(), "privilegedContext", null);
        setField(term73496, term73496.getClass(), "combiner", null);
        setField(term73496, term73496.getClass(), "permissions", null);
        setField(term73496, term73496.getClass(), "parent", null);
        setBooleanField(term73496, term73496.getClass(), "isWrapped", false);
        setBooleanField(term73496, term73496.getClass(), "isLimited", false);
        setField(term73496, term73496.getClass(), "limitedContext", null);
        setField(term73475, term73475.getClass(), "privilegedContext", term73496);
        setField(term73475, term73475.getClass(), "combiner", null);
        setField(term73475, term73475.getClass(), "permissions", null);
        setField(term73475, term73475.getClass(), "parent", null);
        setBooleanField(term73475, term73475.getClass(), "isWrapped", false);
        setBooleanField(term73475, term73475.getClass(), "isLimited", false);
        setField(term73475, term73475.getClass(), "limitedContext", null);
        setField(term73451, term73451.getClass(), "acc", term73475);
        setBooleanField(term73451, term73451.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term73451, term73451.getClass(), "isPosted", true);
        setBooleanField(term73451, term73451.getClass(), "isSystemGenerated", true);
        setField(term73451, term73451.getClass(), "source", term73506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar$5");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term73451;
        callMethod(klass, "actionPerformed", argTypes, term73450, args);
    }

};


