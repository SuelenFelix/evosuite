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

public class TopBar_4_actionPerformed_4584327932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67515;
     Object term67516;

    public TopBar_4_actionPerformed_4584327932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67515 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar$4"));
        setField(term67515, term67515.getClass(), "this$0", null);
        term67516 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term67531 = (byte[]) newByteArray(9);
        Object term67543 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term67544 = (Object[]) newArray("java.security.ProtectionDomain", 4);
        Object term67545 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67546 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term67547 = (Object[]) newArray("java.security.Principal", 3);
        Object term67550 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67553 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67556 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67561 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term67571 = newInstance(Class.forName("java.lang.Object"));
        setField(term67516, term67516.getClass(), "actionCommand", "ekxGuOYIwi");
        setLongField(term67516, term67516.getClass(), "when", 6967924379644551255L);
        setIntField(term67516, term67516.getClass(), "modifiers", 574481092);
        setByteElement(term67531, 0, (byte) -22);
        setByteElement(term67531, 1, (byte) 93);
        setByteElement(term67531, 2, (byte) 69);
        setByteElement(term67531, 3, (byte) -74);
        setByteElement(term67531, 4, (byte) -123);
        setByteElement(term67531, 5, (byte) -23);
        setByteElement(term67531, 6, (byte) 100);
        setByteElement(term67531, 7, (byte) 106);
        setByteElement(term67531, 8, (byte) -57);
        setField(term67516, term67516.getClass(), "bdata", term67531);
        setIntField(term67516, term67516.getClass(), "id", -310528004);
        setBooleanField(term67516, term67516.getClass(), "consumed", true);
        setField(term67546, term67546.getClass(), "location", null);
        setField(term67546, term67546.getClass(), "signers", null);
        setField(term67546, term67546.getClass(), "certs", null);
        setField(term67546, term67546.getClass(), "sp", null);
        setField(term67546, term67546.getClass(), "factory", null);
        setField(term67546, term67546.getClass(), "locationNoFragString", null);
        setField(term67545, term67545.getClass(), "codesource", term67546);
        setField(term67545, term67545.getClass(), "classloader", null);
        setField(term67545, term67545.getClass(), "principals", term67547);
        setField(term67545, term67545.getClass(), "permissions", null);
        setBooleanField(term67545, term67545.getClass(), "hasAllPerm", false);
        setBooleanField(term67545, term67545.getClass(), "staticPermissions", false);
        setField(term67545, term67545.getClass(), "key", null);
        setElement(term67544, 0, term67545);
        setField(term67550, term67550.getClass(), "codesource", null);
        setField(term67550, term67550.getClass(), "classloader", null);
        setField(term67550, term67550.getClass(), "principals", null);
        setField(term67550, term67550.getClass(), "permissions", null);
        setBooleanField(term67550, term67550.getClass(), "hasAllPerm", false);
        setBooleanField(term67550, term67550.getClass(), "staticPermissions", false);
        setField(term67550, term67550.getClass(), "key", null);
        setElement(term67544, 1, term67550);
        setField(term67553, term67553.getClass(), "codesource", null);
        setField(term67553, term67553.getClass(), "classloader", null);
        setField(term67553, term67553.getClass(), "principals", null);
        setField(term67553, term67553.getClass(), "permissions", null);
        setBooleanField(term67553, term67553.getClass(), "hasAllPerm", false);
        setBooleanField(term67553, term67553.getClass(), "staticPermissions", false);
        setField(term67553, term67553.getClass(), "key", null);
        setElement(term67544, 2, term67553);
        setField(term67556, term67556.getClass(), "codesource", null);
        setField(term67556, term67556.getClass(), "classloader", null);
        setField(term67556, term67556.getClass(), "principals", null);
        setField(term67556, term67556.getClass(), "permissions", null);
        setBooleanField(term67556, term67556.getClass(), "hasAllPerm", false);
        setBooleanField(term67556, term67556.getClass(), "staticPermissions", false);
        setField(term67556, term67556.getClass(), "key", null);
        setElement(term67544, 3, term67556);
        setField(term67543, term67543.getClass(), "context", term67544);
        setBooleanField(term67543, term67543.getClass(), "isPrivileged", true);
        setBooleanField(term67543, term67543.getClass(), "isAuthorized", false);
        setField(term67561, term67561.getClass(), "context", null);
        setBooleanField(term67561, term67561.getClass(), "isPrivileged", false);
        setBooleanField(term67561, term67561.getClass(), "isAuthorized", false);
        setField(term67561, term67561.getClass(), "privilegedContext", null);
        setField(term67561, term67561.getClass(), "combiner", null);
        setField(term67561, term67561.getClass(), "permissions", null);
        setField(term67561, term67561.getClass(), "parent", null);
        setBooleanField(term67561, term67561.getClass(), "isWrapped", false);
        setBooleanField(term67561, term67561.getClass(), "isLimited", false);
        setField(term67561, term67561.getClass(), "limitedContext", null);
        setField(term67543, term67543.getClass(), "privilegedContext", term67561);
        setField(term67543, term67543.getClass(), "combiner", null);
        setField(term67543, term67543.getClass(), "permissions", null);
        setField(term67543, term67543.getClass(), "parent", null);
        setBooleanField(term67543, term67543.getClass(), "isWrapped", false);
        setBooleanField(term67543, term67543.getClass(), "isLimited", false);
        setField(term67543, term67543.getClass(), "limitedContext", null);
        setField(term67516, term67516.getClass(), "acc", term67543);
        setBooleanField(term67516, term67516.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term67516, term67516.getClass(), "isPosted", true);
        setBooleanField(term67516, term67516.getClass(), "isSystemGenerated", false);
        setField(term67516, term67516.getClass(), "source", term67571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar$4");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term67516;
        callMethod(klass, "actionPerformed", argTypes, term67515, args);
    }

};


