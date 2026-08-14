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

public class MouseListenerBuilder_1_mousePressed_7597645742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109392;
     Object term109393;

    public MouseListenerBuilder_1_mousePressed_7597645742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109392 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.MouseListenerBuilder$1"));
        setField(term109392, term109392.getClass(), "val$eventPerformed", null);
        term109393 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term109406 = (byte[]) newByteArray(2);
        Object term109411 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term109412 = (Object[]) newArray("java.security.ProtectionDomain", 0);
        Object term109415 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term109416 = (Object[]) newArray("java.security.ProtectionDomain", 7);
        Object term109417 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109420 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109423 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109426 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109429 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109432 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109435 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109440 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term109452 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term109393, term109393.getClass(), "x", -511077684);
        setIntField(term109393, term109393.getClass(), "y", -711507760);
        setIntField(term109393, term109393.getClass(), "xAbs", 1053773809);
        setIntField(term109393, term109393.getClass(), "yAbs", 924127883);
        setIntField(term109393, term109393.getClass(), "clickCount", -751079123);
        setBooleanField(term109393, term109393.getClass(), "causedByTouchEvent", true);
        setIntField(term109393, term109393.getClass(), "button", -110837188);
        setBooleanField(term109393, term109393.getClass(), "popupTrigger", true);
        setBooleanField(term109393, term109393.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term109393, term109393.getClass(), "when", 5262507301787091109L);
        setIntField(term109393, term109393.getClass(), "modifiers", -271094506);
        setBooleanField(term109393, term109393.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term109406, 0, (byte) -128);
        setByteElement(term109406, 1, (byte) 66);
        setField(term109393, term109393.getClass(), "bdata", term109406);
        setIntField(term109393, term109393.getClass(), "id", 455632030);
        setBooleanField(term109393, term109393.getClass(), "consumed", true);
        setField(term109411, term109411.getClass(), "context", term109412);
        setBooleanField(term109411, term109411.getClass(), "isPrivileged", true);
        setBooleanField(term109411, term109411.getClass(), "isAuthorized", false);
        setField(term109417, term109417.getClass(), "codesource", null);
        setField(term109417, term109417.getClass(), "classloader", null);
        setField(term109417, term109417.getClass(), "principals", null);
        setField(term109417, term109417.getClass(), "permissions", null);
        setBooleanField(term109417, term109417.getClass(), "hasAllPerm", false);
        setBooleanField(term109417, term109417.getClass(), "staticPermissions", false);
        setField(term109417, term109417.getClass(), "key", null);
        setElement(term109416, 0, term109417);
        setField(term109420, term109420.getClass(), "codesource", null);
        setField(term109420, term109420.getClass(), "classloader", null);
        setField(term109420, term109420.getClass(), "principals", null);
        setField(term109420, term109420.getClass(), "permissions", null);
        setBooleanField(term109420, term109420.getClass(), "hasAllPerm", false);
        setBooleanField(term109420, term109420.getClass(), "staticPermissions", false);
        setField(term109420, term109420.getClass(), "key", null);
        setElement(term109416, 1, term109420);
        setField(term109423, term109423.getClass(), "codesource", null);
        setField(term109423, term109423.getClass(), "classloader", null);
        setField(term109423, term109423.getClass(), "principals", null);
        setField(term109423, term109423.getClass(), "permissions", null);
        setBooleanField(term109423, term109423.getClass(), "hasAllPerm", false);
        setBooleanField(term109423, term109423.getClass(), "staticPermissions", false);
        setField(term109423, term109423.getClass(), "key", null);
        setElement(term109416, 2, term109423);
        setField(term109426, term109426.getClass(), "codesource", null);
        setField(term109426, term109426.getClass(), "classloader", null);
        setField(term109426, term109426.getClass(), "principals", null);
        setField(term109426, term109426.getClass(), "permissions", null);
        setBooleanField(term109426, term109426.getClass(), "hasAllPerm", false);
        setBooleanField(term109426, term109426.getClass(), "staticPermissions", false);
        setField(term109426, term109426.getClass(), "key", null);
        setElement(term109416, 3, term109426);
        setField(term109429, term109429.getClass(), "codesource", null);
        setField(term109429, term109429.getClass(), "classloader", null);
        setField(term109429, term109429.getClass(), "principals", null);
        setField(term109429, term109429.getClass(), "permissions", null);
        setBooleanField(term109429, term109429.getClass(), "hasAllPerm", false);
        setBooleanField(term109429, term109429.getClass(), "staticPermissions", false);
        setField(term109429, term109429.getClass(), "key", null);
        setElement(term109416, 4, term109429);
        setField(term109432, term109432.getClass(), "codesource", null);
        setField(term109432, term109432.getClass(), "classloader", null);
        setField(term109432, term109432.getClass(), "principals", null);
        setField(term109432, term109432.getClass(), "permissions", null);
        setBooleanField(term109432, term109432.getClass(), "hasAllPerm", false);
        setBooleanField(term109432, term109432.getClass(), "staticPermissions", false);
        setField(term109432, term109432.getClass(), "key", null);
        setElement(term109416, 5, term109432);
        setField(term109435, term109435.getClass(), "codesource", null);
        setField(term109435, term109435.getClass(), "classloader", null);
        setField(term109435, term109435.getClass(), "principals", null);
        setField(term109435, term109435.getClass(), "permissions", null);
        setBooleanField(term109435, term109435.getClass(), "hasAllPerm", false);
        setBooleanField(term109435, term109435.getClass(), "staticPermissions", false);
        setField(term109435, term109435.getClass(), "key", null);
        setElement(term109416, 6, term109435);
        setField(term109415, term109415.getClass(), "context", term109416);
        setBooleanField(term109415, term109415.getClass(), "isPrivileged", false);
        setBooleanField(term109415, term109415.getClass(), "isAuthorized", true);
        setField(term109440, term109440.getClass(), "context", null);
        setBooleanField(term109440, term109440.getClass(), "isPrivileged", false);
        setBooleanField(term109440, term109440.getClass(), "isAuthorized", false);
        setField(term109440, term109440.getClass(), "privilegedContext", null);
        setField(term109440, term109440.getClass(), "combiner", null);
        setField(term109440, term109440.getClass(), "permissions", null);
        setField(term109440, term109440.getClass(), "parent", null);
        setBooleanField(term109440, term109440.getClass(), "isWrapped", false);
        setBooleanField(term109440, term109440.getClass(), "isLimited", false);
        setField(term109440, term109440.getClass(), "limitedContext", null);
        setField(term109415, term109415.getClass(), "privilegedContext", term109440);
        setField(term109415, term109415.getClass(), "combiner", null);
        setField(term109415, term109415.getClass(), "permissions", null);
        setField(term109415, term109415.getClass(), "parent", null);
        setBooleanField(term109415, term109415.getClass(), "isWrapped", false);
        setBooleanField(term109415, term109415.getClass(), "isLimited", false);
        setField(term109415, term109415.getClass(), "limitedContext", null);
        setField(term109411, term109411.getClass(), "privilegedContext", term109415);
        setField(term109411, term109411.getClass(), "combiner", null);
        setField(term109411, term109411.getClass(), "permissions", null);
        setField(term109411, term109411.getClass(), "parent", null);
        setBooleanField(term109411, term109411.getClass(), "isWrapped", false);
        setBooleanField(term109411, term109411.getClass(), "isLimited", false);
        setField(term109411, term109411.getClass(), "limitedContext", null);
        setField(term109393, term109393.getClass(), "acc", term109411);
        setBooleanField(term109393, term109393.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term109393, term109393.getClass(), "isPosted", false);
        setBooleanField(term109393, term109393.getClass(), "isSystemGenerated", false);
        setField(term109393, term109393.getClass(), "source", term109452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.MouseListenerBuilder$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term109393;
        callMethod(klass, "mousePressed", argTypes, term109392, args);
    }

};


