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
     Object term343874;
     Object term343875;

    public Board_9_mouseClicked_3119695722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343874 = newInstance(Class.forName("core.Board$9"));
        setField(term343874, term343874.getClass(), "this$0", null);
        term343875 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term343888 = (byte[]) newByteArray(6);
        Object term343897 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term343898 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term343899 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343900 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term343901 = (Object[]) newArray("java.security.Principal", 4);
        Object term343904 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343907 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343910 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343913 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343916 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343919 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343922 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term343927 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term343937 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term343875, term343875.getClass(), "x", -121679722);
        setIntField(term343875, term343875.getClass(), "y", -1283714004);
        setIntField(term343875, term343875.getClass(), "xAbs", -1085038483);
        setIntField(term343875, term343875.getClass(), "yAbs", 1089796055);
        setIntField(term343875, term343875.getClass(), "clickCount", -456321892);
        setBooleanField(term343875, term343875.getClass(), "causedByTouchEvent", true);
        setIntField(term343875, term343875.getClass(), "button", 1803068346);
        setBooleanField(term343875, term343875.getClass(), "popupTrigger", false);
        setBooleanField(term343875, term343875.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term343875, term343875.getClass(), "when", -1571034605670661708L);
        setIntField(term343875, term343875.getClass(), "modifiers", 1598485572);
        setBooleanField(term343875, term343875.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term343888, 0, (byte) -96);
        setByteElement(term343888, 1, (byte) -88);
        setByteElement(term343888, 2, (byte) -73);
        setByteElement(term343888, 3, (byte) 105);
        setByteElement(term343888, 4, (byte) -86);
        setByteElement(term343888, 5, (byte) 84);
        setField(term343875, term343875.getClass(), "bdata", term343888);
        setIntField(term343875, term343875.getClass(), "id", 1328348146);
        setBooleanField(term343875, term343875.getClass(), "consumed", true);
        setField(term343900, term343900.getClass(), "location", null);
        setField(term343900, term343900.getClass(), "signers", null);
        setField(term343900, term343900.getClass(), "certs", null);
        setField(term343900, term343900.getClass(), "sp", null);
        setField(term343900, term343900.getClass(), "factory", null);
        setField(term343900, term343900.getClass(), "locationNoFragString", null);
        setField(term343899, term343899.getClass(), "codesource", term343900);
        setField(term343899, term343899.getClass(), "classloader", null);
        setField(term343899, term343899.getClass(), "principals", term343901);
        setField(term343899, term343899.getClass(), "permissions", null);
        setBooleanField(term343899, term343899.getClass(), "hasAllPerm", false);
        setBooleanField(term343899, term343899.getClass(), "staticPermissions", false);
        setField(term343899, term343899.getClass(), "key", null);
        setElement(term343898, 0, term343899);
        setField(term343904, term343904.getClass(), "codesource", null);
        setField(term343904, term343904.getClass(), "classloader", null);
        setField(term343904, term343904.getClass(), "principals", null);
        setField(term343904, term343904.getClass(), "permissions", null);
        setBooleanField(term343904, term343904.getClass(), "hasAllPerm", false);
        setBooleanField(term343904, term343904.getClass(), "staticPermissions", false);
        setField(term343904, term343904.getClass(), "key", null);
        setElement(term343898, 1, term343904);
        setField(term343907, term343907.getClass(), "codesource", null);
        setField(term343907, term343907.getClass(), "classloader", null);
        setField(term343907, term343907.getClass(), "principals", null);
        setField(term343907, term343907.getClass(), "permissions", null);
        setBooleanField(term343907, term343907.getClass(), "hasAllPerm", false);
        setBooleanField(term343907, term343907.getClass(), "staticPermissions", false);
        setField(term343907, term343907.getClass(), "key", null);
        setElement(term343898, 2, term343907);
        setField(term343910, term343910.getClass(), "codesource", null);
        setField(term343910, term343910.getClass(), "classloader", null);
        setField(term343910, term343910.getClass(), "principals", null);
        setField(term343910, term343910.getClass(), "permissions", null);
        setBooleanField(term343910, term343910.getClass(), "hasAllPerm", false);
        setBooleanField(term343910, term343910.getClass(), "staticPermissions", false);
        setField(term343910, term343910.getClass(), "key", null);
        setElement(term343898, 3, term343910);
        setField(term343913, term343913.getClass(), "codesource", null);
        setField(term343913, term343913.getClass(), "classloader", null);
        setField(term343913, term343913.getClass(), "principals", null);
        setField(term343913, term343913.getClass(), "permissions", null);
        setBooleanField(term343913, term343913.getClass(), "hasAllPerm", false);
        setBooleanField(term343913, term343913.getClass(), "staticPermissions", false);
        setField(term343913, term343913.getClass(), "key", null);
        setElement(term343898, 4, term343913);
        setField(term343916, term343916.getClass(), "codesource", null);
        setField(term343916, term343916.getClass(), "classloader", null);
        setField(term343916, term343916.getClass(), "principals", null);
        setField(term343916, term343916.getClass(), "permissions", null);
        setBooleanField(term343916, term343916.getClass(), "hasAllPerm", false);
        setBooleanField(term343916, term343916.getClass(), "staticPermissions", false);
        setField(term343916, term343916.getClass(), "key", null);
        setElement(term343898, 5, term343916);
        setField(term343919, term343919.getClass(), "codesource", null);
        setField(term343919, term343919.getClass(), "classloader", null);
        setField(term343919, term343919.getClass(), "principals", null);
        setField(term343919, term343919.getClass(), "permissions", null);
        setBooleanField(term343919, term343919.getClass(), "hasAllPerm", false);
        setBooleanField(term343919, term343919.getClass(), "staticPermissions", false);
        setField(term343919, term343919.getClass(), "key", null);
        setElement(term343898, 6, term343919);
        setField(term343922, term343922.getClass(), "codesource", null);
        setField(term343922, term343922.getClass(), "classloader", null);
        setField(term343922, term343922.getClass(), "principals", null);
        setField(term343922, term343922.getClass(), "permissions", null);
        setBooleanField(term343922, term343922.getClass(), "hasAllPerm", false);
        setBooleanField(term343922, term343922.getClass(), "staticPermissions", false);
        setField(term343922, term343922.getClass(), "key", null);
        setElement(term343898, 7, term343922);
        setField(term343897, term343897.getClass(), "context", term343898);
        setBooleanField(term343897, term343897.getClass(), "isPrivileged", false);
        setBooleanField(term343897, term343897.getClass(), "isAuthorized", false);
        setField(term343927, term343927.getClass(), "context", null);
        setBooleanField(term343927, term343927.getClass(), "isPrivileged", false);
        setBooleanField(term343927, term343927.getClass(), "isAuthorized", false);
        setField(term343927, term343927.getClass(), "privilegedContext", null);
        setField(term343927, term343927.getClass(), "combiner", null);
        setField(term343927, term343927.getClass(), "permissions", null);
        setField(term343927, term343927.getClass(), "parent", null);
        setBooleanField(term343927, term343927.getClass(), "isWrapped", false);
        setBooleanField(term343927, term343927.getClass(), "isLimited", false);
        setField(term343927, term343927.getClass(), "limitedContext", null);
        setField(term343897, term343897.getClass(), "privilegedContext", term343927);
        setField(term343897, term343897.getClass(), "combiner", null);
        setField(term343897, term343897.getClass(), "permissions", null);
        setField(term343897, term343897.getClass(), "parent", null);
        setBooleanField(term343897, term343897.getClass(), "isWrapped", false);
        setBooleanField(term343897, term343897.getClass(), "isLimited", false);
        setField(term343897, term343897.getClass(), "limitedContext", null);
        setField(term343875, term343875.getClass(), "acc", term343897);
        setBooleanField(term343875, term343875.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term343875, term343875.getClass(), "isPosted", true);
        setBooleanField(term343875, term343875.getClass(), "isSystemGenerated", false);
        setField(term343875, term343875.getClass(), "source", term343937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$9");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term343875;
        callMethod(klass, "mouseClicked", argTypes, term343874, args);
    }

};


