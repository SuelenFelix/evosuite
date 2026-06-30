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
     Object term227165;
     Object term227166;

    public Board_10_mouseClicked_3469234262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227165 = newInstance(Class.forName("core.Board$10"));
        setField(term227165, term227165.getClass(), "this$0", null);
        term227166 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term227179 = (byte[]) newByteArray(0);
        Object term227182 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term227183 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term227184 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227185 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term227186 = (Object[]) newArray("java.security.Principal", 4);
        Object term227189 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227192 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227195 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227198 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227201 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term227206 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term227216 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term227166, term227166.getClass(), "x", 251039122);
        setIntField(term227166, term227166.getClass(), "y", 459471826);
        setIntField(term227166, term227166.getClass(), "xAbs", -1054011286);
        setIntField(term227166, term227166.getClass(), "yAbs", -1640361091);
        setIntField(term227166, term227166.getClass(), "clickCount", -1908164516);
        setBooleanField(term227166, term227166.getClass(), "causedByTouchEvent", true);
        setIntField(term227166, term227166.getClass(), "button", -1343269854);
        setBooleanField(term227166, term227166.getClass(), "popupTrigger", false);
        setBooleanField(term227166, term227166.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term227166, term227166.getClass(), "when", -7310273014364148916L);
        setIntField(term227166, term227166.getClass(), "modifiers", -731459309);
        setBooleanField(term227166, term227166.getClass(), "canAccessSystemClipboard", false);
        setField(term227166, term227166.getClass(), "bdata", term227179);
        setIntField(term227166, term227166.getClass(), "id", -913468095);
        setBooleanField(term227166, term227166.getClass(), "consumed", false);
        setField(term227185, term227185.getClass(), "location", null);
        setField(term227185, term227185.getClass(), "signers", null);
        setField(term227185, term227185.getClass(), "certs", null);
        setField(term227185, term227185.getClass(), "sp", null);
        setField(term227185, term227185.getClass(), "factory", null);
        setField(term227185, term227185.getClass(), "locationNoFragString", null);
        setField(term227184, term227184.getClass(), "codesource", term227185);
        setField(term227184, term227184.getClass(), "classloader", null);
        setField(term227184, term227184.getClass(), "principals", term227186);
        setField(term227184, term227184.getClass(), "permissions", null);
        setBooleanField(term227184, term227184.getClass(), "hasAllPerm", false);
        setBooleanField(term227184, term227184.getClass(), "staticPermissions", false);
        setField(term227184, term227184.getClass(), "key", null);
        setElement(term227183, 0, term227184);
        setField(term227189, term227189.getClass(), "codesource", null);
        setField(term227189, term227189.getClass(), "classloader", null);
        setField(term227189, term227189.getClass(), "principals", null);
        setField(term227189, term227189.getClass(), "permissions", null);
        setBooleanField(term227189, term227189.getClass(), "hasAllPerm", false);
        setBooleanField(term227189, term227189.getClass(), "staticPermissions", false);
        setField(term227189, term227189.getClass(), "key", null);
        setElement(term227183, 1, term227189);
        setField(term227192, term227192.getClass(), "codesource", null);
        setField(term227192, term227192.getClass(), "classloader", null);
        setField(term227192, term227192.getClass(), "principals", null);
        setField(term227192, term227192.getClass(), "permissions", null);
        setBooleanField(term227192, term227192.getClass(), "hasAllPerm", false);
        setBooleanField(term227192, term227192.getClass(), "staticPermissions", false);
        setField(term227192, term227192.getClass(), "key", null);
        setElement(term227183, 2, term227192);
        setField(term227195, term227195.getClass(), "codesource", null);
        setField(term227195, term227195.getClass(), "classloader", null);
        setField(term227195, term227195.getClass(), "principals", null);
        setField(term227195, term227195.getClass(), "permissions", null);
        setBooleanField(term227195, term227195.getClass(), "hasAllPerm", false);
        setBooleanField(term227195, term227195.getClass(), "staticPermissions", false);
        setField(term227195, term227195.getClass(), "key", null);
        setElement(term227183, 3, term227195);
        setField(term227198, term227198.getClass(), "codesource", null);
        setField(term227198, term227198.getClass(), "classloader", null);
        setField(term227198, term227198.getClass(), "principals", null);
        setField(term227198, term227198.getClass(), "permissions", null);
        setBooleanField(term227198, term227198.getClass(), "hasAllPerm", false);
        setBooleanField(term227198, term227198.getClass(), "staticPermissions", false);
        setField(term227198, term227198.getClass(), "key", null);
        setElement(term227183, 4, term227198);
        setField(term227201, term227201.getClass(), "codesource", null);
        setField(term227201, term227201.getClass(), "classloader", null);
        setField(term227201, term227201.getClass(), "principals", null);
        setField(term227201, term227201.getClass(), "permissions", null);
        setBooleanField(term227201, term227201.getClass(), "hasAllPerm", false);
        setBooleanField(term227201, term227201.getClass(), "staticPermissions", false);
        setField(term227201, term227201.getClass(), "key", null);
        setElement(term227183, 5, term227201);
        setField(term227182, term227182.getClass(), "context", term227183);
        setBooleanField(term227182, term227182.getClass(), "isPrivileged", false);
        setBooleanField(term227182, term227182.getClass(), "isAuthorized", false);
        setField(term227206, term227206.getClass(), "context", null);
        setBooleanField(term227206, term227206.getClass(), "isPrivileged", false);
        setBooleanField(term227206, term227206.getClass(), "isAuthorized", false);
        setField(term227206, term227206.getClass(), "privilegedContext", null);
        setField(term227206, term227206.getClass(), "combiner", null);
        setField(term227206, term227206.getClass(), "permissions", null);
        setField(term227206, term227206.getClass(), "parent", null);
        setBooleanField(term227206, term227206.getClass(), "isWrapped", false);
        setBooleanField(term227206, term227206.getClass(), "isLimited", false);
        setField(term227206, term227206.getClass(), "limitedContext", null);
        setField(term227182, term227182.getClass(), "privilegedContext", term227206);
        setField(term227182, term227182.getClass(), "combiner", null);
        setField(term227182, term227182.getClass(), "permissions", null);
        setField(term227182, term227182.getClass(), "parent", null);
        setBooleanField(term227182, term227182.getClass(), "isWrapped", false);
        setBooleanField(term227182, term227182.getClass(), "isLimited", false);
        setField(term227182, term227182.getClass(), "limitedContext", null);
        setField(term227166, term227166.getClass(), "acc", term227182);
        setBooleanField(term227166, term227166.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term227166, term227166.getClass(), "isPosted", true);
        setBooleanField(term227166, term227166.getClass(), "isSystemGenerated", true);
        setField(term227166, term227166.getClass(), "source", term227216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$10");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term227166;
        callMethod(klass, "mouseClicked", argTypes, term227165, args);
    }

};


