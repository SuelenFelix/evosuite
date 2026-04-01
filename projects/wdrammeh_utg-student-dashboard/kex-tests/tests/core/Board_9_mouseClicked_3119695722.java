package core;

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
import static core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Board_9_mouseClicked_3119695722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343866;
     Object term343867;

    public Board_9_mouseClicked_3119695722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343866 = newInstance(Class.forName("core.Board$9"));
        setField(term343866, term343866.getClass(), "this$0", null);
        term343867 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term343880 = (byte[]) newByteArray(6);
        Object term343889 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term343890 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term343891 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343892 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term343893 = (Object[]) newArray("java.security.Principal", 4);
        Object term343896 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343899 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343902 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343905 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343908 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343911 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343914 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343919 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term343929 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term343867, term343867.getClass(), "x", -121679722);
        setIntField(term343867, term343867.getClass(), "y", -1283714004);
        setIntField(term343867, term343867.getClass(), "xAbs", -1085038483);
        setIntField(term343867, term343867.getClass(), "yAbs", 1089796055);
        setIntField(term343867, term343867.getClass(), "clickCount", -456321892);
        setBooleanField(term343867, term343867.getClass(), "causedByTouchEvent", true);
        setIntField(term343867, term343867.getClass(), "button", 1803068346);
        setBooleanField(term343867, term343867.getClass(), "popupTrigger", false);
        setBooleanField(term343867, term343867.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term343867, term343867.getClass(), "when", -1571034605670661708L);
        setIntField(term343867, term343867.getClass(), "modifiers", 1598485572);
        setBooleanField(term343867, term343867.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term343880, 0, (byte) -96);
        setByteElement(term343880, 1, (byte) -88);
        setByteElement(term343880, 2, (byte) -73);
        setByteElement(term343880, 3, (byte) 105);
        setByteElement(term343880, 4, (byte) -86);
        setByteElement(term343880, 5, (byte) 84);
        setField(term343867, term343867.getClass(), "bdata", term343880);
        setIntField(term343867, term343867.getClass(), "id", 1328348146);
        setBooleanField(term343867, term343867.getClass(), "consumed", true);
        setField(term343892, term343892.getClass(), "location", null);
        setField(term343892, term343892.getClass(), "signers", null);
        setField(term343892, term343892.getClass(), "certs", null);
        setField(term343892, term343892.getClass(), "sp", null);
        setField(term343892, term343892.getClass(), "factory", null);
        setField(term343892, term343892.getClass(), "locationNoFragString", null);
        setField(term343891, term343891.getClass(), "codesource", term343892);
        setField(term343891, term343891.getClass(), "classloader", null);
        setField(term343891, term343891.getClass(), "principals", term343893);
        setField(term343891, term343891.getClass(), "permissions", null);
        setBooleanField(term343891, term343891.getClass(), "hasAllPerm", false);
        setBooleanField(term343891, term343891.getClass(), "staticPermissions", false);
        setField(term343891, term343891.getClass(), "key", null);
        setElement(term343890, 0, term343891);
        setField(term343896, term343896.getClass(), "codesource", null);
        setField(term343896, term343896.getClass(), "classloader", null);
        setField(term343896, term343896.getClass(), "principals", null);
        setField(term343896, term343896.getClass(), "permissions", null);
        setBooleanField(term343896, term343896.getClass(), "hasAllPerm", false);
        setBooleanField(term343896, term343896.getClass(), "staticPermissions", false);
        setField(term343896, term343896.getClass(), "key", null);
        setElement(term343890, 1, term343896);
        setField(term343899, term343899.getClass(), "codesource", null);
        setField(term343899, term343899.getClass(), "classloader", null);
        setField(term343899, term343899.getClass(), "principals", null);
        setField(term343899, term343899.getClass(), "permissions", null);
        setBooleanField(term343899, term343899.getClass(), "hasAllPerm", false);
        setBooleanField(term343899, term343899.getClass(), "staticPermissions", false);
        setField(term343899, term343899.getClass(), "key", null);
        setElement(term343890, 2, term343899);
        setField(term343902, term343902.getClass(), "codesource", null);
        setField(term343902, term343902.getClass(), "classloader", null);
        setField(term343902, term343902.getClass(), "principals", null);
        setField(term343902, term343902.getClass(), "permissions", null);
        setBooleanField(term343902, term343902.getClass(), "hasAllPerm", false);
        setBooleanField(term343902, term343902.getClass(), "staticPermissions", false);
        setField(term343902, term343902.getClass(), "key", null);
        setElement(term343890, 3, term343902);
        setField(term343905, term343905.getClass(), "codesource", null);
        setField(term343905, term343905.getClass(), "classloader", null);
        setField(term343905, term343905.getClass(), "principals", null);
        setField(term343905, term343905.getClass(), "permissions", null);
        setBooleanField(term343905, term343905.getClass(), "hasAllPerm", false);
        setBooleanField(term343905, term343905.getClass(), "staticPermissions", false);
        setField(term343905, term343905.getClass(), "key", null);
        setElement(term343890, 4, term343905);
        setField(term343908, term343908.getClass(), "codesource", null);
        setField(term343908, term343908.getClass(), "classloader", null);
        setField(term343908, term343908.getClass(), "principals", null);
        setField(term343908, term343908.getClass(), "permissions", null);
        setBooleanField(term343908, term343908.getClass(), "hasAllPerm", false);
        setBooleanField(term343908, term343908.getClass(), "staticPermissions", false);
        setField(term343908, term343908.getClass(), "key", null);
        setElement(term343890, 5, term343908);
        setField(term343911, term343911.getClass(), "codesource", null);
        setField(term343911, term343911.getClass(), "classloader", null);
        setField(term343911, term343911.getClass(), "principals", null);
        setField(term343911, term343911.getClass(), "permissions", null);
        setBooleanField(term343911, term343911.getClass(), "hasAllPerm", false);
        setBooleanField(term343911, term343911.getClass(), "staticPermissions", false);
        setField(term343911, term343911.getClass(), "key", null);
        setElement(term343890, 6, term343911);
        setField(term343914, term343914.getClass(), "codesource", null);
        setField(term343914, term343914.getClass(), "classloader", null);
        setField(term343914, term343914.getClass(), "principals", null);
        setField(term343914, term343914.getClass(), "permissions", null);
        setBooleanField(term343914, term343914.getClass(), "hasAllPerm", false);
        setBooleanField(term343914, term343914.getClass(), "staticPermissions", false);
        setField(term343914, term343914.getClass(), "key", null);
        setElement(term343890, 7, term343914);
        setField(term343889, term343889.getClass(), "context", term343890);
        setBooleanField(term343889, term343889.getClass(), "isPrivileged", false);
        setBooleanField(term343889, term343889.getClass(), "isAuthorized", false);
        setField(term343919, term343919.getClass(), "context", null);
        setBooleanField(term343919, term343919.getClass(), "isPrivileged", false);
        setBooleanField(term343919, term343919.getClass(), "isAuthorized", false);
        setField(term343919, term343919.getClass(), "privilegedContext", null);
        setField(term343919, term343919.getClass(), "combiner", null);
        setField(term343919, term343919.getClass(), "permissions", null);
        setField(term343919, term343919.getClass(), "parent", null);
        setBooleanField(term343919, term343919.getClass(), "isWrapped", false);
        setBooleanField(term343919, term343919.getClass(), "isLimited", false);
        setField(term343919, term343919.getClass(), "limitedContext", null);
        setField(term343889, term343889.getClass(), "privilegedContext", term343919);
        setField(term343889, term343889.getClass(), "combiner", null);
        setField(term343889, term343889.getClass(), "permissions", null);
        setField(term343889, term343889.getClass(), "parent", null);
        setBooleanField(term343889, term343889.getClass(), "isWrapped", false);
        setBooleanField(term343889, term343889.getClass(), "isLimited", false);
        setField(term343889, term343889.getClass(), "limitedContext", null);
        setField(term343867, term343867.getClass(), "acc", term343889);
        setBooleanField(term343867, term343867.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term343867, term343867.getClass(), "isPosted", true);
        setBooleanField(term343867, term343867.getClass(), "isSystemGenerated", false);
        setField(term343867, term343867.getClass(), "source", term343929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$9");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term343867;
        callMethod(klass, "mouseClicked", argTypes, term343866, args);
    }

};


