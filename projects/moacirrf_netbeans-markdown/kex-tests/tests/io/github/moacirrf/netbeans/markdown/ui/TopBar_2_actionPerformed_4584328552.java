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

public class TopBar_2_actionPerformed_4584328552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71515;
     Object term71516;

    public TopBar_2_actionPerformed_4584328552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71515 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar$2"));
        setField(term71515, term71515.getClass(), "this$0", null);
        term71516 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term71531 = (byte[]) newByteArray(6);
        Object term71540 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term71541 = (Object[]) newArray("java.security.ProtectionDomain", 9);
        Object term71542 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term71543 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term71544 = (Object[]) newArray("java.security.Principal", 1);
        Object term71547 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term71550 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term71553 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term71556 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term71559 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term71562 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term71565 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term71568 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term71573 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term71583 = newInstance(Class.forName("java.lang.Object"));
        setField(term71516, term71516.getClass(), "actionCommand", "sZdUNdggUW");
        setLongField(term71516, term71516.getClass(), "when", -8885298608300233488L);
        setIntField(term71516, term71516.getClass(), "modifiers", -310648604);
        setByteElement(term71531, 0, (byte) 98);
        setByteElement(term71531, 1, (byte) 79);
        setByteElement(term71531, 2, (byte) 61);
        setByteElement(term71531, 3, (byte) -92);
        setByteElement(term71531, 4, (byte) -42);
        setByteElement(term71531, 5, (byte) 116);
        setField(term71516, term71516.getClass(), "bdata", term71531);
        setIntField(term71516, term71516.getClass(), "id", -648200466);
        setBooleanField(term71516, term71516.getClass(), "consumed", false);
        setField(term71543, term71543.getClass(), "location", null);
        setField(term71543, term71543.getClass(), "signers", null);
        setField(term71543, term71543.getClass(), "certs", null);
        setField(term71543, term71543.getClass(), "sp", null);
        setField(term71543, term71543.getClass(), "factory", null);
        setField(term71543, term71543.getClass(), "locationNoFragString", null);
        setField(term71542, term71542.getClass(), "codesource", term71543);
        setField(term71542, term71542.getClass(), "classloader", null);
        setField(term71542, term71542.getClass(), "principals", term71544);
        setField(term71542, term71542.getClass(), "permissions", null);
        setBooleanField(term71542, term71542.getClass(), "hasAllPerm", false);
        setBooleanField(term71542, term71542.getClass(), "staticPermissions", false);
        setField(term71542, term71542.getClass(), "key", null);
        setElement(term71541, 0, term71542);
        setField(term71547, term71547.getClass(), "codesource", null);
        setField(term71547, term71547.getClass(), "classloader", null);
        setField(term71547, term71547.getClass(), "principals", null);
        setField(term71547, term71547.getClass(), "permissions", null);
        setBooleanField(term71547, term71547.getClass(), "hasAllPerm", false);
        setBooleanField(term71547, term71547.getClass(), "staticPermissions", false);
        setField(term71547, term71547.getClass(), "key", null);
        setElement(term71541, 1, term71547);
        setField(term71550, term71550.getClass(), "codesource", null);
        setField(term71550, term71550.getClass(), "classloader", null);
        setField(term71550, term71550.getClass(), "principals", null);
        setField(term71550, term71550.getClass(), "permissions", null);
        setBooleanField(term71550, term71550.getClass(), "hasAllPerm", false);
        setBooleanField(term71550, term71550.getClass(), "staticPermissions", false);
        setField(term71550, term71550.getClass(), "key", null);
        setElement(term71541, 2, term71550);
        setField(term71553, term71553.getClass(), "codesource", null);
        setField(term71553, term71553.getClass(), "classloader", null);
        setField(term71553, term71553.getClass(), "principals", null);
        setField(term71553, term71553.getClass(), "permissions", null);
        setBooleanField(term71553, term71553.getClass(), "hasAllPerm", false);
        setBooleanField(term71553, term71553.getClass(), "staticPermissions", false);
        setField(term71553, term71553.getClass(), "key", null);
        setElement(term71541, 3, term71553);
        setField(term71556, term71556.getClass(), "codesource", null);
        setField(term71556, term71556.getClass(), "classloader", null);
        setField(term71556, term71556.getClass(), "principals", null);
        setField(term71556, term71556.getClass(), "permissions", null);
        setBooleanField(term71556, term71556.getClass(), "hasAllPerm", false);
        setBooleanField(term71556, term71556.getClass(), "staticPermissions", false);
        setField(term71556, term71556.getClass(), "key", null);
        setElement(term71541, 4, term71556);
        setField(term71559, term71559.getClass(), "codesource", null);
        setField(term71559, term71559.getClass(), "classloader", null);
        setField(term71559, term71559.getClass(), "principals", null);
        setField(term71559, term71559.getClass(), "permissions", null);
        setBooleanField(term71559, term71559.getClass(), "hasAllPerm", false);
        setBooleanField(term71559, term71559.getClass(), "staticPermissions", false);
        setField(term71559, term71559.getClass(), "key", null);
        setElement(term71541, 5, term71559);
        setField(term71562, term71562.getClass(), "codesource", null);
        setField(term71562, term71562.getClass(), "classloader", null);
        setField(term71562, term71562.getClass(), "principals", null);
        setField(term71562, term71562.getClass(), "permissions", null);
        setBooleanField(term71562, term71562.getClass(), "hasAllPerm", false);
        setBooleanField(term71562, term71562.getClass(), "staticPermissions", false);
        setField(term71562, term71562.getClass(), "key", null);
        setElement(term71541, 6, term71562);
        setField(term71565, term71565.getClass(), "codesource", null);
        setField(term71565, term71565.getClass(), "classloader", null);
        setField(term71565, term71565.getClass(), "principals", null);
        setField(term71565, term71565.getClass(), "permissions", null);
        setBooleanField(term71565, term71565.getClass(), "hasAllPerm", false);
        setBooleanField(term71565, term71565.getClass(), "staticPermissions", false);
        setField(term71565, term71565.getClass(), "key", null);
        setElement(term71541, 7, term71565);
        setField(term71568, term71568.getClass(), "codesource", null);
        setField(term71568, term71568.getClass(), "classloader", null);
        setField(term71568, term71568.getClass(), "principals", null);
        setField(term71568, term71568.getClass(), "permissions", null);
        setBooleanField(term71568, term71568.getClass(), "hasAllPerm", false);
        setBooleanField(term71568, term71568.getClass(), "staticPermissions", false);
        setField(term71568, term71568.getClass(), "key", null);
        setElement(term71541, 8, term71568);
        setField(term71540, term71540.getClass(), "context", term71541);
        setBooleanField(term71540, term71540.getClass(), "isPrivileged", false);
        setBooleanField(term71540, term71540.getClass(), "isAuthorized", true);
        setField(term71573, term71573.getClass(), "context", null);
        setBooleanField(term71573, term71573.getClass(), "isPrivileged", false);
        setBooleanField(term71573, term71573.getClass(), "isAuthorized", false);
        setField(term71573, term71573.getClass(), "privilegedContext", null);
        setField(term71573, term71573.getClass(), "combiner", null);
        setField(term71573, term71573.getClass(), "permissions", null);
        setField(term71573, term71573.getClass(), "parent", null);
        setBooleanField(term71573, term71573.getClass(), "isWrapped", false);
        setBooleanField(term71573, term71573.getClass(), "isLimited", false);
        setField(term71573, term71573.getClass(), "limitedContext", null);
        setField(term71540, term71540.getClass(), "privilegedContext", term71573);
        setField(term71540, term71540.getClass(), "combiner", null);
        setField(term71540, term71540.getClass(), "permissions", null);
        setField(term71540, term71540.getClass(), "parent", null);
        setBooleanField(term71540, term71540.getClass(), "isWrapped", false);
        setBooleanField(term71540, term71540.getClass(), "isLimited", false);
        setField(term71540, term71540.getClass(), "limitedContext", null);
        setField(term71516, term71516.getClass(), "acc", term71540);
        setBooleanField(term71516, term71516.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term71516, term71516.getClass(), "isPosted", true);
        setBooleanField(term71516, term71516.getClass(), "isSystemGenerated", true);
        setField(term71516, term71516.getClass(), "source", term71583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term71516;
        callMethod(klass, "actionPerformed", argTypes, term71515, args);
    }

};


