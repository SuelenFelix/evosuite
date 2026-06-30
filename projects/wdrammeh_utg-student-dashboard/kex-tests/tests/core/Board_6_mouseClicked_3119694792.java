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

public class Board_6_mouseClicked_3119694792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342922;
     Object term342923;

    public Board_6_mouseClicked_3119694792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342922 = newInstance(Class.forName("core.Board$6"));
        setField(term342922, term342922.getClass(), "this$0", null);
        term342923 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term342936 = (byte[]) newByteArray(8);
        Object term342947 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term342948 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term342949 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342950 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term342951 = (Object[]) newArray("java.security.Principal", 4);
        Object term342954 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342957 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342960 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342963 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342968 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term342978 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term342923, term342923.getClass(), "x", -1287204441);
        setIntField(term342923, term342923.getClass(), "y", 1826016641);
        setIntField(term342923, term342923.getClass(), "xAbs", 1726886771);
        setIntField(term342923, term342923.getClass(), "yAbs", 1045689376);
        setIntField(term342923, term342923.getClass(), "clickCount", 767458787);
        setBooleanField(term342923, term342923.getClass(), "causedByTouchEvent", true);
        setIntField(term342923, term342923.getClass(), "button", 2103721338);
        setBooleanField(term342923, term342923.getClass(), "popupTrigger", false);
        setBooleanField(term342923, term342923.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term342923, term342923.getClass(), "when", 7799452759993694308L);
        setIntField(term342923, term342923.getClass(), "modifiers", 621330308);
        setBooleanField(term342923, term342923.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term342936, 0, (byte) 20);
        setByteElement(term342936, 1, (byte) -114);
        setByteElement(term342936, 2, (byte) 93);
        setByteElement(term342936, 3, (byte) -60);
        setByteElement(term342936, 4, (byte) -4);
        setByteElement(term342936, 5, (byte) 28);
        setByteElement(term342936, 6, (byte) 94);
        setField(term342923, term342923.getClass(), "bdata", term342936);
        setIntField(term342923, term342923.getClass(), "id", -1597424060);
        setBooleanField(term342923, term342923.getClass(), "consumed", false);
        setField(term342950, term342950.getClass(), "location", null);
        setField(term342950, term342950.getClass(), "signers", null);
        setField(term342950, term342950.getClass(), "certs", null);
        setField(term342950, term342950.getClass(), "sp", null);
        setField(term342950, term342950.getClass(), "factory", null);
        setField(term342950, term342950.getClass(), "locationNoFragString", null);
        setField(term342949, term342949.getClass(), "codesource", term342950);
        setField(term342949, term342949.getClass(), "classloader", null);
        setField(term342949, term342949.getClass(), "principals", term342951);
        setField(term342949, term342949.getClass(), "permissions", null);
        setBooleanField(term342949, term342949.getClass(), "hasAllPerm", false);
        setBooleanField(term342949, term342949.getClass(), "staticPermissions", false);
        setField(term342949, term342949.getClass(), "key", null);
        setElement(term342948, 0, term342949);
        setField(term342954, term342954.getClass(), "codesource", null);
        setField(term342954, term342954.getClass(), "classloader", null);
        setField(term342954, term342954.getClass(), "principals", null);
        setField(term342954, term342954.getClass(), "permissions", null);
        setBooleanField(term342954, term342954.getClass(), "hasAllPerm", false);
        setBooleanField(term342954, term342954.getClass(), "staticPermissions", false);
        setField(term342954, term342954.getClass(), "key", null);
        setElement(term342948, 1, term342954);
        setField(term342957, term342957.getClass(), "codesource", null);
        setField(term342957, term342957.getClass(), "classloader", null);
        setField(term342957, term342957.getClass(), "principals", null);
        setField(term342957, term342957.getClass(), "permissions", null);
        setBooleanField(term342957, term342957.getClass(), "hasAllPerm", false);
        setBooleanField(term342957, term342957.getClass(), "staticPermissions", false);
        setField(term342957, term342957.getClass(), "key", null);
        setElement(term342948, 2, term342957);
        setField(term342960, term342960.getClass(), "codesource", null);
        setField(term342960, term342960.getClass(), "classloader", null);
        setField(term342960, term342960.getClass(), "principals", null);
        setField(term342960, term342960.getClass(), "permissions", null);
        setBooleanField(term342960, term342960.getClass(), "hasAllPerm", false);
        setBooleanField(term342960, term342960.getClass(), "staticPermissions", false);
        setField(term342960, term342960.getClass(), "key", null);
        setElement(term342948, 3, term342960);
        setField(term342963, term342963.getClass(), "codesource", null);
        setField(term342963, term342963.getClass(), "classloader", null);
        setField(term342963, term342963.getClass(), "principals", null);
        setField(term342963, term342963.getClass(), "permissions", null);
        setBooleanField(term342963, term342963.getClass(), "hasAllPerm", false);
        setBooleanField(term342963, term342963.getClass(), "staticPermissions", false);
        setField(term342963, term342963.getClass(), "key", null);
        setElement(term342948, 4, term342963);
        setField(term342947, term342947.getClass(), "context", term342948);
        setBooleanField(term342947, term342947.getClass(), "isPrivileged", true);
        setBooleanField(term342947, term342947.getClass(), "isAuthorized", true);
        setField(term342968, term342968.getClass(), "context", null);
        setBooleanField(term342968, term342968.getClass(), "isPrivileged", false);
        setBooleanField(term342968, term342968.getClass(), "isAuthorized", false);
        setField(term342968, term342968.getClass(), "privilegedContext", null);
        setField(term342968, term342968.getClass(), "combiner", null);
        setField(term342968, term342968.getClass(), "permissions", null);
        setField(term342968, term342968.getClass(), "parent", null);
        setBooleanField(term342968, term342968.getClass(), "isWrapped", false);
        setBooleanField(term342968, term342968.getClass(), "isLimited", false);
        setField(term342968, term342968.getClass(), "limitedContext", null);
        setField(term342947, term342947.getClass(), "privilegedContext", term342968);
        setField(term342947, term342947.getClass(), "combiner", null);
        setField(term342947, term342947.getClass(), "permissions", null);
        setField(term342947, term342947.getClass(), "parent", null);
        setBooleanField(term342947, term342947.getClass(), "isWrapped", false);
        setBooleanField(term342947, term342947.getClass(), "isLimited", false);
        setField(term342947, term342947.getClass(), "limitedContext", null);
        setField(term342923, term342923.getClass(), "acc", term342947);
        setBooleanField(term342923, term342923.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term342923, term342923.getClass(), "isPosted", false);
        setBooleanField(term342923, term342923.getClass(), "isSystemGenerated", true);
        setField(term342923, term342923.getClass(), "source", term342978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$6");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term342923;
        callMethod(klass, "mouseClicked", argTypes, term342922, args);
    }

};


