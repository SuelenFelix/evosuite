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

public class Board_10_mouseClicked_3469234262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227157;
     Object term227158;

    public Board_10_mouseClicked_3469234262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227157 = newInstance(Class.forName("core.Board$10"));
        setField(term227157, term227157.getClass(), "this$0", null);
        term227158 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term227171 = (byte[]) newByteArray(0);
        Object term227174 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term227175 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term227176 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227177 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term227178 = (Object[]) newArray("java.security.Principal", 4);
        Object term227181 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227184 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227187 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227190 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227193 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227198 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term227208 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term227158, term227158.getClass(), "x", 251039122);
        setIntField(term227158, term227158.getClass(), "y", 459471826);
        setIntField(term227158, term227158.getClass(), "xAbs", -1054011286);
        setIntField(term227158, term227158.getClass(), "yAbs", -1640361091);
        setIntField(term227158, term227158.getClass(), "clickCount", -1908164516);
        setBooleanField(term227158, term227158.getClass(), "causedByTouchEvent", true);
        setIntField(term227158, term227158.getClass(), "button", -1343269854);
        setBooleanField(term227158, term227158.getClass(), "popupTrigger", false);
        setBooleanField(term227158, term227158.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term227158, term227158.getClass(), "when", -7310273014364148916L);
        setIntField(term227158, term227158.getClass(), "modifiers", -731459309);
        setBooleanField(term227158, term227158.getClass(), "canAccessSystemClipboard", false);
        setField(term227158, term227158.getClass(), "bdata", term227171);
        setIntField(term227158, term227158.getClass(), "id", -913468095);
        setBooleanField(term227158, term227158.getClass(), "consumed", false);
        setField(term227177, term227177.getClass(), "location", null);
        setField(term227177, term227177.getClass(), "signers", null);
        setField(term227177, term227177.getClass(), "certs", null);
        setField(term227177, term227177.getClass(), "sp", null);
        setField(term227177, term227177.getClass(), "factory", null);
        setField(term227177, term227177.getClass(), "locationNoFragString", null);
        setField(term227176, term227176.getClass(), "codesource", term227177);
        setField(term227176, term227176.getClass(), "classloader", null);
        setField(term227176, term227176.getClass(), "principals", term227178);
        setField(term227176, term227176.getClass(), "permissions", null);
        setBooleanField(term227176, term227176.getClass(), "hasAllPerm", false);
        setBooleanField(term227176, term227176.getClass(), "staticPermissions", false);
        setField(term227176, term227176.getClass(), "key", null);
        setElement(term227175, 0, term227176);
        setField(term227181, term227181.getClass(), "codesource", null);
        setField(term227181, term227181.getClass(), "classloader", null);
        setField(term227181, term227181.getClass(), "principals", null);
        setField(term227181, term227181.getClass(), "permissions", null);
        setBooleanField(term227181, term227181.getClass(), "hasAllPerm", false);
        setBooleanField(term227181, term227181.getClass(), "staticPermissions", false);
        setField(term227181, term227181.getClass(), "key", null);
        setElement(term227175, 1, term227181);
        setField(term227184, term227184.getClass(), "codesource", null);
        setField(term227184, term227184.getClass(), "classloader", null);
        setField(term227184, term227184.getClass(), "principals", null);
        setField(term227184, term227184.getClass(), "permissions", null);
        setBooleanField(term227184, term227184.getClass(), "hasAllPerm", false);
        setBooleanField(term227184, term227184.getClass(), "staticPermissions", false);
        setField(term227184, term227184.getClass(), "key", null);
        setElement(term227175, 2, term227184);
        setField(term227187, term227187.getClass(), "codesource", null);
        setField(term227187, term227187.getClass(), "classloader", null);
        setField(term227187, term227187.getClass(), "principals", null);
        setField(term227187, term227187.getClass(), "permissions", null);
        setBooleanField(term227187, term227187.getClass(), "hasAllPerm", false);
        setBooleanField(term227187, term227187.getClass(), "staticPermissions", false);
        setField(term227187, term227187.getClass(), "key", null);
        setElement(term227175, 3, term227187);
        setField(term227190, term227190.getClass(), "codesource", null);
        setField(term227190, term227190.getClass(), "classloader", null);
        setField(term227190, term227190.getClass(), "principals", null);
        setField(term227190, term227190.getClass(), "permissions", null);
        setBooleanField(term227190, term227190.getClass(), "hasAllPerm", false);
        setBooleanField(term227190, term227190.getClass(), "staticPermissions", false);
        setField(term227190, term227190.getClass(), "key", null);
        setElement(term227175, 4, term227190);
        setField(term227193, term227193.getClass(), "codesource", null);
        setField(term227193, term227193.getClass(), "classloader", null);
        setField(term227193, term227193.getClass(), "principals", null);
        setField(term227193, term227193.getClass(), "permissions", null);
        setBooleanField(term227193, term227193.getClass(), "hasAllPerm", false);
        setBooleanField(term227193, term227193.getClass(), "staticPermissions", false);
        setField(term227193, term227193.getClass(), "key", null);
        setElement(term227175, 5, term227193);
        setField(term227174, term227174.getClass(), "context", term227175);
        setBooleanField(term227174, term227174.getClass(), "isPrivileged", false);
        setBooleanField(term227174, term227174.getClass(), "isAuthorized", false);
        setField(term227198, term227198.getClass(), "context", null);
        setBooleanField(term227198, term227198.getClass(), "isPrivileged", false);
        setBooleanField(term227198, term227198.getClass(), "isAuthorized", false);
        setField(term227198, term227198.getClass(), "privilegedContext", null);
        setField(term227198, term227198.getClass(), "combiner", null);
        setField(term227198, term227198.getClass(), "permissions", null);
        setField(term227198, term227198.getClass(), "parent", null);
        setBooleanField(term227198, term227198.getClass(), "isWrapped", false);
        setBooleanField(term227198, term227198.getClass(), "isLimited", false);
        setField(term227198, term227198.getClass(), "limitedContext", null);
        setField(term227174, term227174.getClass(), "privilegedContext", term227198);
        setField(term227174, term227174.getClass(), "combiner", null);
        setField(term227174, term227174.getClass(), "permissions", null);
        setField(term227174, term227174.getClass(), "parent", null);
        setBooleanField(term227174, term227174.getClass(), "isWrapped", false);
        setBooleanField(term227174, term227174.getClass(), "isLimited", false);
        setField(term227174, term227174.getClass(), "limitedContext", null);
        setField(term227158, term227158.getClass(), "acc", term227174);
        setBooleanField(term227158, term227158.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term227158, term227158.getClass(), "isPosted", true);
        setBooleanField(term227158, term227158.getClass(), "isSystemGenerated", true);
        setField(term227158, term227158.getClass(), "source", term227208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$10");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term227158;
        callMethod(klass, "mouseClicked", argTypes, term227157, args);
    }

};


