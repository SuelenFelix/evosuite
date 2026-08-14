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

public class MouseListenerBuilder_1_mouseExited_4528558335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109567;
     Object term109568;

    public MouseListenerBuilder_1_mouseExited_4528558335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109567 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.MouseListenerBuilder$1"));
        setField(term109567, term109567.getClass(), "val$eventPerformed", null);
        term109568 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term109581 = (byte[]) newByteArray(7);
        Object term109591 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term109592 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term109593 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109594 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term109595 = (Object[]) newArray("java.security.Principal", 2);
        Object term109598 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109601 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109604 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109607 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109610 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109613 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109616 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term109621 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term109631 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term109568, term109568.getClass(), "x", 405295896);
        setIntField(term109568, term109568.getClass(), "y", -814977075);
        setIntField(term109568, term109568.getClass(), "xAbs", 808614267);
        setIntField(term109568, term109568.getClass(), "yAbs", 1611734632);
        setIntField(term109568, term109568.getClass(), "clickCount", 868908117);
        setBooleanField(term109568, term109568.getClass(), "causedByTouchEvent", false);
        setIntField(term109568, term109568.getClass(), "button", 1789351397);
        setBooleanField(term109568, term109568.getClass(), "popupTrigger", false);
        setBooleanField(term109568, term109568.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term109568, term109568.getClass(), "when", 1233889271256172047L);
        setIntField(term109568, term109568.getClass(), "modifiers", 2145528170);
        setBooleanField(term109568, term109568.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term109581, 0, (byte) -2);
        setByteElement(term109581, 1, (byte) 28);
        setByteElement(term109581, 2, (byte) 84);
        setByteElement(term109581, 3, (byte) 85);
        setByteElement(term109581, 4, (byte) -17);
        setByteElement(term109581, 5, (byte) -83);
        setByteElement(term109581, 6, (byte) 48);
        setField(term109568, term109568.getClass(), "bdata", term109581);
        setIntField(term109568, term109568.getClass(), "id", -585773976);
        setBooleanField(term109568, term109568.getClass(), "consumed", true);
        setField(term109594, term109594.getClass(), "location", null);
        setField(term109594, term109594.getClass(), "signers", null);
        setField(term109594, term109594.getClass(), "certs", null);
        setField(term109594, term109594.getClass(), "sp", null);
        setField(term109594, term109594.getClass(), "factory", null);
        setField(term109594, term109594.getClass(), "locationNoFragString", null);
        setField(term109593, term109593.getClass(), "codesource", term109594);
        setField(term109593, term109593.getClass(), "classloader", null);
        setField(term109593, term109593.getClass(), "principals", term109595);
        setField(term109593, term109593.getClass(), "permissions", null);
        setBooleanField(term109593, term109593.getClass(), "hasAllPerm", false);
        setBooleanField(term109593, term109593.getClass(), "staticPermissions", false);
        setField(term109593, term109593.getClass(), "key", null);
        setElement(term109592, 0, term109593);
        setField(term109598, term109598.getClass(), "codesource", null);
        setField(term109598, term109598.getClass(), "classloader", null);
        setField(term109598, term109598.getClass(), "principals", null);
        setField(term109598, term109598.getClass(), "permissions", null);
        setBooleanField(term109598, term109598.getClass(), "hasAllPerm", false);
        setBooleanField(term109598, term109598.getClass(), "staticPermissions", false);
        setField(term109598, term109598.getClass(), "key", null);
        setElement(term109592, 1, term109598);
        setField(term109601, term109601.getClass(), "codesource", null);
        setField(term109601, term109601.getClass(), "classloader", null);
        setField(term109601, term109601.getClass(), "principals", null);
        setField(term109601, term109601.getClass(), "permissions", null);
        setBooleanField(term109601, term109601.getClass(), "hasAllPerm", false);
        setBooleanField(term109601, term109601.getClass(), "staticPermissions", false);
        setField(term109601, term109601.getClass(), "key", null);
        setElement(term109592, 2, term109601);
        setField(term109604, term109604.getClass(), "codesource", null);
        setField(term109604, term109604.getClass(), "classloader", null);
        setField(term109604, term109604.getClass(), "principals", null);
        setField(term109604, term109604.getClass(), "permissions", null);
        setBooleanField(term109604, term109604.getClass(), "hasAllPerm", false);
        setBooleanField(term109604, term109604.getClass(), "staticPermissions", false);
        setField(term109604, term109604.getClass(), "key", null);
        setElement(term109592, 3, term109604);
        setField(term109607, term109607.getClass(), "codesource", null);
        setField(term109607, term109607.getClass(), "classloader", null);
        setField(term109607, term109607.getClass(), "principals", null);
        setField(term109607, term109607.getClass(), "permissions", null);
        setBooleanField(term109607, term109607.getClass(), "hasAllPerm", false);
        setBooleanField(term109607, term109607.getClass(), "staticPermissions", false);
        setField(term109607, term109607.getClass(), "key", null);
        setElement(term109592, 4, term109607);
        setField(term109610, term109610.getClass(), "codesource", null);
        setField(term109610, term109610.getClass(), "classloader", null);
        setField(term109610, term109610.getClass(), "principals", null);
        setField(term109610, term109610.getClass(), "permissions", null);
        setBooleanField(term109610, term109610.getClass(), "hasAllPerm", false);
        setBooleanField(term109610, term109610.getClass(), "staticPermissions", false);
        setField(term109610, term109610.getClass(), "key", null);
        setElement(term109592, 5, term109610);
        setField(term109613, term109613.getClass(), "codesource", null);
        setField(term109613, term109613.getClass(), "classloader", null);
        setField(term109613, term109613.getClass(), "principals", null);
        setField(term109613, term109613.getClass(), "permissions", null);
        setBooleanField(term109613, term109613.getClass(), "hasAllPerm", false);
        setBooleanField(term109613, term109613.getClass(), "staticPermissions", false);
        setField(term109613, term109613.getClass(), "key", null);
        setElement(term109592, 6, term109613);
        setField(term109616, term109616.getClass(), "codesource", null);
        setField(term109616, term109616.getClass(), "classloader", null);
        setField(term109616, term109616.getClass(), "principals", null);
        setField(term109616, term109616.getClass(), "permissions", null);
        setBooleanField(term109616, term109616.getClass(), "hasAllPerm", false);
        setBooleanField(term109616, term109616.getClass(), "staticPermissions", false);
        setField(term109616, term109616.getClass(), "key", null);
        setElement(term109592, 7, term109616);
        setField(term109591, term109591.getClass(), "context", term109592);
        setBooleanField(term109591, term109591.getClass(), "isPrivileged", false);
        setBooleanField(term109591, term109591.getClass(), "isAuthorized", true);
        setField(term109621, term109621.getClass(), "context", null);
        setBooleanField(term109621, term109621.getClass(), "isPrivileged", false);
        setBooleanField(term109621, term109621.getClass(), "isAuthorized", false);
        setField(term109621, term109621.getClass(), "privilegedContext", null);
        setField(term109621, term109621.getClass(), "combiner", null);
        setField(term109621, term109621.getClass(), "permissions", null);
        setField(term109621, term109621.getClass(), "parent", null);
        setBooleanField(term109621, term109621.getClass(), "isWrapped", false);
        setBooleanField(term109621, term109621.getClass(), "isLimited", false);
        setField(term109621, term109621.getClass(), "limitedContext", null);
        setField(term109591, term109591.getClass(), "privilegedContext", term109621);
        setField(term109591, term109591.getClass(), "combiner", null);
        setField(term109591, term109591.getClass(), "permissions", null);
        setField(term109591, term109591.getClass(), "parent", null);
        setBooleanField(term109591, term109591.getClass(), "isWrapped", false);
        setBooleanField(term109591, term109591.getClass(), "isLimited", false);
        setField(term109591, term109591.getClass(), "limitedContext", null);
        setField(term109568, term109568.getClass(), "acc", term109591);
        setBooleanField(term109568, term109568.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term109568, term109568.getClass(), "isPosted", false);
        setBooleanField(term109568, term109568.getClass(), "isSystemGenerated", true);
        setField(term109568, term109568.getClass(), "source", term109631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.MouseListenerBuilder$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term109568;
        callMethod(klass, "mouseExited", argTypes, term109567, args);
    }

};


