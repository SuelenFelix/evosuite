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
     Object term343880;
     Object term343881;

    public Board_9_mouseClicked_3119695722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343880 = newInstance(Class.forName("core.Board$9"));
        setField(term343880, term343880.getClass(), "this$0", null);
        term343881 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term343894 = (byte[]) newByteArray(6);
        Object term343903 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term343904 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term343905 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343906 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term343907 = (Object[]) newArray("java.security.Principal", 4);
        Object term343910 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343913 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343916 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343919 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343922 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343925 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343928 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343933 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term343943 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term343881, term343881.getClass(), "x", -121679722);
        setIntField(term343881, term343881.getClass(), "y", -1283714004);
        setIntField(term343881, term343881.getClass(), "xAbs", -1085038483);
        setIntField(term343881, term343881.getClass(), "yAbs", 1089796055);
        setIntField(term343881, term343881.getClass(), "clickCount", -456321892);
        setBooleanField(term343881, term343881.getClass(), "causedByTouchEvent", true);
        setIntField(term343881, term343881.getClass(), "button", 1803068346);
        setBooleanField(term343881, term343881.getClass(), "popupTrigger", false);
        setBooleanField(term343881, term343881.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term343881, term343881.getClass(), "when", -1571034605670661708L);
        setIntField(term343881, term343881.getClass(), "modifiers", 1598485572);
        setBooleanField(term343881, term343881.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term343894, 0, (byte) -96);
        setByteElement(term343894, 1, (byte) -88);
        setByteElement(term343894, 2, (byte) -73);
        setByteElement(term343894, 3, (byte) 105);
        setByteElement(term343894, 4, (byte) -86);
        setByteElement(term343894, 5, (byte) 84);
        setField(term343881, term343881.getClass(), "bdata", term343894);
        setIntField(term343881, term343881.getClass(), "id", 1328348146);
        setBooleanField(term343881, term343881.getClass(), "consumed", true);
        setField(term343906, term343906.getClass(), "location", null);
        setField(term343906, term343906.getClass(), "signers", null);
        setField(term343906, term343906.getClass(), "certs", null);
        setField(term343906, term343906.getClass(), "sp", null);
        setField(term343906, term343906.getClass(), "factory", null);
        setField(term343906, term343906.getClass(), "locationNoFragString", null);
        setField(term343905, term343905.getClass(), "codesource", term343906);
        setField(term343905, term343905.getClass(), "classloader", null);
        setField(term343905, term343905.getClass(), "principals", term343907);
        setField(term343905, term343905.getClass(), "permissions", null);
        setBooleanField(term343905, term343905.getClass(), "hasAllPerm", false);
        setBooleanField(term343905, term343905.getClass(), "staticPermissions", false);
        setField(term343905, term343905.getClass(), "key", null);
        setElement(term343904, 0, term343905);
        setField(term343910, term343910.getClass(), "codesource", null);
        setField(term343910, term343910.getClass(), "classloader", null);
        setField(term343910, term343910.getClass(), "principals", null);
        setField(term343910, term343910.getClass(), "permissions", null);
        setBooleanField(term343910, term343910.getClass(), "hasAllPerm", false);
        setBooleanField(term343910, term343910.getClass(), "staticPermissions", false);
        setField(term343910, term343910.getClass(), "key", null);
        setElement(term343904, 1, term343910);
        setField(term343913, term343913.getClass(), "codesource", null);
        setField(term343913, term343913.getClass(), "classloader", null);
        setField(term343913, term343913.getClass(), "principals", null);
        setField(term343913, term343913.getClass(), "permissions", null);
        setBooleanField(term343913, term343913.getClass(), "hasAllPerm", false);
        setBooleanField(term343913, term343913.getClass(), "staticPermissions", false);
        setField(term343913, term343913.getClass(), "key", null);
        setElement(term343904, 2, term343913);
        setField(term343916, term343916.getClass(), "codesource", null);
        setField(term343916, term343916.getClass(), "classloader", null);
        setField(term343916, term343916.getClass(), "principals", null);
        setField(term343916, term343916.getClass(), "permissions", null);
        setBooleanField(term343916, term343916.getClass(), "hasAllPerm", false);
        setBooleanField(term343916, term343916.getClass(), "staticPermissions", false);
        setField(term343916, term343916.getClass(), "key", null);
        setElement(term343904, 3, term343916);
        setField(term343919, term343919.getClass(), "codesource", null);
        setField(term343919, term343919.getClass(), "classloader", null);
        setField(term343919, term343919.getClass(), "principals", null);
        setField(term343919, term343919.getClass(), "permissions", null);
        setBooleanField(term343919, term343919.getClass(), "hasAllPerm", false);
        setBooleanField(term343919, term343919.getClass(), "staticPermissions", false);
        setField(term343919, term343919.getClass(), "key", null);
        setElement(term343904, 4, term343919);
        setField(term343922, term343922.getClass(), "codesource", null);
        setField(term343922, term343922.getClass(), "classloader", null);
        setField(term343922, term343922.getClass(), "principals", null);
        setField(term343922, term343922.getClass(), "permissions", null);
        setBooleanField(term343922, term343922.getClass(), "hasAllPerm", false);
        setBooleanField(term343922, term343922.getClass(), "staticPermissions", false);
        setField(term343922, term343922.getClass(), "key", null);
        setElement(term343904, 5, term343922);
        setField(term343925, term343925.getClass(), "codesource", null);
        setField(term343925, term343925.getClass(), "classloader", null);
        setField(term343925, term343925.getClass(), "principals", null);
        setField(term343925, term343925.getClass(), "permissions", null);
        setBooleanField(term343925, term343925.getClass(), "hasAllPerm", false);
        setBooleanField(term343925, term343925.getClass(), "staticPermissions", false);
        setField(term343925, term343925.getClass(), "key", null);
        setElement(term343904, 6, term343925);
        setField(term343928, term343928.getClass(), "codesource", null);
        setField(term343928, term343928.getClass(), "classloader", null);
        setField(term343928, term343928.getClass(), "principals", null);
        setField(term343928, term343928.getClass(), "permissions", null);
        setBooleanField(term343928, term343928.getClass(), "hasAllPerm", false);
        setBooleanField(term343928, term343928.getClass(), "staticPermissions", false);
        setField(term343928, term343928.getClass(), "key", null);
        setElement(term343904, 7, term343928);
        setField(term343903, term343903.getClass(), "context", term343904);
        setBooleanField(term343903, term343903.getClass(), "isPrivileged", false);
        setBooleanField(term343903, term343903.getClass(), "isAuthorized", false);
        setField(term343933, term343933.getClass(), "context", null);
        setBooleanField(term343933, term343933.getClass(), "isPrivileged", false);
        setBooleanField(term343933, term343933.getClass(), "isAuthorized", false);
        setField(term343933, term343933.getClass(), "privilegedContext", null);
        setField(term343933, term343933.getClass(), "combiner", null);
        setField(term343933, term343933.getClass(), "permissions", null);
        setField(term343933, term343933.getClass(), "parent", null);
        setBooleanField(term343933, term343933.getClass(), "isWrapped", false);
        setBooleanField(term343933, term343933.getClass(), "isLimited", false);
        setField(term343933, term343933.getClass(), "limitedContext", null);
        setField(term343903, term343903.getClass(), "privilegedContext", term343933);
        setField(term343903, term343903.getClass(), "combiner", null);
        setField(term343903, term343903.getClass(), "permissions", null);
        setField(term343903, term343903.getClass(), "parent", null);
        setBooleanField(term343903, term343903.getClass(), "isWrapped", false);
        setBooleanField(term343903, term343903.getClass(), "isLimited", false);
        setField(term343903, term343903.getClass(), "limitedContext", null);
        setField(term343881, term343881.getClass(), "acc", term343903);
        setBooleanField(term343881, term343881.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term343881, term343881.getClass(), "isPosted", true);
        setBooleanField(term343881, term343881.getClass(), "isSystemGenerated", false);
        setField(term343881, term343881.getClass(), "source", term343943);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$9");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term343881;
        callMethod(klass, "mouseClicked", argTypes, term343880, args);
    }

};


