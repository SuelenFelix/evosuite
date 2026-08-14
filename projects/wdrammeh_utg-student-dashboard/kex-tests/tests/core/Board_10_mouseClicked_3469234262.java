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
     Object term227171;
     Object term227172;

    public Board_10_mouseClicked_3469234262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227171 = newInstance(Class.forName("core.Board$10"));
        setField(term227171, term227171.getClass(), "this$0", null);
        term227172 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term227185 = (byte[]) newByteArray(0);
        Object term227188 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term227189 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term227190 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227191 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term227192 = (Object[]) newArray("java.security.Principal", 4);
        Object term227195 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227198 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227201 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227204 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227207 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227212 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term227222 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term227172, term227172.getClass(), "x", 251039122);
        setIntField(term227172, term227172.getClass(), "y", 459471826);
        setIntField(term227172, term227172.getClass(), "xAbs", -1054011286);
        setIntField(term227172, term227172.getClass(), "yAbs", -1640361091);
        setIntField(term227172, term227172.getClass(), "clickCount", -1908164516);
        setBooleanField(term227172, term227172.getClass(), "causedByTouchEvent", true);
        setIntField(term227172, term227172.getClass(), "button", -1343269854);
        setBooleanField(term227172, term227172.getClass(), "popupTrigger", false);
        setBooleanField(term227172, term227172.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term227172, term227172.getClass(), "when", -7310273014364148916L);
        setIntField(term227172, term227172.getClass(), "modifiers", -731459309);
        setBooleanField(term227172, term227172.getClass(), "canAccessSystemClipboard", false);
        setField(term227172, term227172.getClass(), "bdata", term227185);
        setIntField(term227172, term227172.getClass(), "id", -913468095);
        setBooleanField(term227172, term227172.getClass(), "consumed", false);
        setField(term227191, term227191.getClass(), "location", null);
        setField(term227191, term227191.getClass(), "signers", null);
        setField(term227191, term227191.getClass(), "certs", null);
        setField(term227191, term227191.getClass(), "sp", null);
        setField(term227191, term227191.getClass(), "factory", null);
        setField(term227191, term227191.getClass(), "locationNoFragString", null);
        setField(term227190, term227190.getClass(), "codesource", term227191);
        setField(term227190, term227190.getClass(), "classloader", null);
        setField(term227190, term227190.getClass(), "principals", term227192);
        setField(term227190, term227190.getClass(), "permissions", null);
        setBooleanField(term227190, term227190.getClass(), "hasAllPerm", false);
        setBooleanField(term227190, term227190.getClass(), "staticPermissions", false);
        setField(term227190, term227190.getClass(), "key", null);
        setElement(term227189, 0, term227190);
        setField(term227195, term227195.getClass(), "codesource", null);
        setField(term227195, term227195.getClass(), "classloader", null);
        setField(term227195, term227195.getClass(), "principals", null);
        setField(term227195, term227195.getClass(), "permissions", null);
        setBooleanField(term227195, term227195.getClass(), "hasAllPerm", false);
        setBooleanField(term227195, term227195.getClass(), "staticPermissions", false);
        setField(term227195, term227195.getClass(), "key", null);
        setElement(term227189, 1, term227195);
        setField(term227198, term227198.getClass(), "codesource", null);
        setField(term227198, term227198.getClass(), "classloader", null);
        setField(term227198, term227198.getClass(), "principals", null);
        setField(term227198, term227198.getClass(), "permissions", null);
        setBooleanField(term227198, term227198.getClass(), "hasAllPerm", false);
        setBooleanField(term227198, term227198.getClass(), "staticPermissions", false);
        setField(term227198, term227198.getClass(), "key", null);
        setElement(term227189, 2, term227198);
        setField(term227201, term227201.getClass(), "codesource", null);
        setField(term227201, term227201.getClass(), "classloader", null);
        setField(term227201, term227201.getClass(), "principals", null);
        setField(term227201, term227201.getClass(), "permissions", null);
        setBooleanField(term227201, term227201.getClass(), "hasAllPerm", false);
        setBooleanField(term227201, term227201.getClass(), "staticPermissions", false);
        setField(term227201, term227201.getClass(), "key", null);
        setElement(term227189, 3, term227201);
        setField(term227204, term227204.getClass(), "codesource", null);
        setField(term227204, term227204.getClass(), "classloader", null);
        setField(term227204, term227204.getClass(), "principals", null);
        setField(term227204, term227204.getClass(), "permissions", null);
        setBooleanField(term227204, term227204.getClass(), "hasAllPerm", false);
        setBooleanField(term227204, term227204.getClass(), "staticPermissions", false);
        setField(term227204, term227204.getClass(), "key", null);
        setElement(term227189, 4, term227204);
        setField(term227207, term227207.getClass(), "codesource", null);
        setField(term227207, term227207.getClass(), "classloader", null);
        setField(term227207, term227207.getClass(), "principals", null);
        setField(term227207, term227207.getClass(), "permissions", null);
        setBooleanField(term227207, term227207.getClass(), "hasAllPerm", false);
        setBooleanField(term227207, term227207.getClass(), "staticPermissions", false);
        setField(term227207, term227207.getClass(), "key", null);
        setElement(term227189, 5, term227207);
        setField(term227188, term227188.getClass(), "context", term227189);
        setBooleanField(term227188, term227188.getClass(), "isPrivileged", false);
        setBooleanField(term227188, term227188.getClass(), "isAuthorized", false);
        setField(term227212, term227212.getClass(), "context", null);
        setBooleanField(term227212, term227212.getClass(), "isPrivileged", false);
        setBooleanField(term227212, term227212.getClass(), "isAuthorized", false);
        setField(term227212, term227212.getClass(), "privilegedContext", null);
        setField(term227212, term227212.getClass(), "combiner", null);
        setField(term227212, term227212.getClass(), "permissions", null);
        setField(term227212, term227212.getClass(), "parent", null);
        setBooleanField(term227212, term227212.getClass(), "isWrapped", false);
        setBooleanField(term227212, term227212.getClass(), "isLimited", false);
        setField(term227212, term227212.getClass(), "limitedContext", null);
        setField(term227188, term227188.getClass(), "privilegedContext", term227212);
        setField(term227188, term227188.getClass(), "combiner", null);
        setField(term227188, term227188.getClass(), "permissions", null);
        setField(term227188, term227188.getClass(), "parent", null);
        setBooleanField(term227188, term227188.getClass(), "isWrapped", false);
        setBooleanField(term227188, term227188.getClass(), "isLimited", false);
        setField(term227188, term227188.getClass(), "limitedContext", null);
        setField(term227172, term227172.getClass(), "acc", term227188);
        setBooleanField(term227172, term227172.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term227172, term227172.getClass(), "isPosted", true);
        setBooleanField(term227172, term227172.getClass(), "isSystemGenerated", true);
        setField(term227172, term227172.getClass(), "source", term227222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$10");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term227172;
        callMethod(klass, "mouseClicked", argTypes, term227171, args);
    }

};


