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

public class Board_11_mouseClicked_3469234572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226191;
     Object term226192;

    public Board_11_mouseClicked_3469234572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226191 = newInstance(Class.forName("core.Board$11"));
        setField(term226191, term226191.getClass(), "this$0", null);
        term226192 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term226205 = (byte[]) newByteArray(4);
        Object term226212 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term226213 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term226214 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226215 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term226216 = (Object[]) newArray("java.security.Principal", 3);
        Object term226219 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226222 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226225 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226228 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226231 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226234 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226237 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226242 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term226252 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term226192, term226192.getClass(), "x", 1961351136);
        setIntField(term226192, term226192.getClass(), "y", -1546528470);
        setIntField(term226192, term226192.getClass(), "xAbs", -1518971561);
        setIntField(term226192, term226192.getClass(), "yAbs", 1513663171);
        setIntField(term226192, term226192.getClass(), "clickCount", 1527034193);
        setBooleanField(term226192, term226192.getClass(), "causedByTouchEvent", false);
        setIntField(term226192, term226192.getClass(), "button", 1309545946);
        setBooleanField(term226192, term226192.getClass(), "popupTrigger", true);
        setBooleanField(term226192, term226192.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term226192, term226192.getClass(), "when", 4394651392080968777L);
        setIntField(term226192, term226192.getClass(), "modifiers", -1457812682);
        setBooleanField(term226192, term226192.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term226205, 0, (byte) -53);
        setByteElement(term226205, 1, (byte) -93);
        setByteElement(term226205, 2, (byte) 82);
        setByteElement(term226205, 3, (byte) -89);
        setField(term226192, term226192.getClass(), "bdata", term226205);
        setIntField(term226192, term226192.getClass(), "id", -161850441);
        setBooleanField(term226192, term226192.getClass(), "consumed", false);
        setField(term226215, term226215.getClass(), "location", null);
        setField(term226215, term226215.getClass(), "signers", null);
        setField(term226215, term226215.getClass(), "certs", null);
        setField(term226215, term226215.getClass(), "sp", null);
        setField(term226215, term226215.getClass(), "factory", null);
        setField(term226215, term226215.getClass(), "locationNoFragString", null);
        setField(term226214, term226214.getClass(), "codesource", term226215);
        setField(term226214, term226214.getClass(), "classloader", null);
        setField(term226214, term226214.getClass(), "principals", term226216);
        setField(term226214, term226214.getClass(), "permissions", null);
        setBooleanField(term226214, term226214.getClass(), "hasAllPerm", false);
        setBooleanField(term226214, term226214.getClass(), "staticPermissions", false);
        setField(term226214, term226214.getClass(), "key", null);
        setElement(term226213, 0, term226214);
        setField(term226219, term226219.getClass(), "codesource", null);
        setField(term226219, term226219.getClass(), "classloader", null);
        setField(term226219, term226219.getClass(), "principals", null);
        setField(term226219, term226219.getClass(), "permissions", null);
        setBooleanField(term226219, term226219.getClass(), "hasAllPerm", false);
        setBooleanField(term226219, term226219.getClass(), "staticPermissions", false);
        setField(term226219, term226219.getClass(), "key", null);
        setElement(term226213, 1, term226219);
        setField(term226222, term226222.getClass(), "codesource", null);
        setField(term226222, term226222.getClass(), "classloader", null);
        setField(term226222, term226222.getClass(), "principals", null);
        setField(term226222, term226222.getClass(), "permissions", null);
        setBooleanField(term226222, term226222.getClass(), "hasAllPerm", false);
        setBooleanField(term226222, term226222.getClass(), "staticPermissions", false);
        setField(term226222, term226222.getClass(), "key", null);
        setElement(term226213, 2, term226222);
        setField(term226225, term226225.getClass(), "codesource", null);
        setField(term226225, term226225.getClass(), "classloader", null);
        setField(term226225, term226225.getClass(), "principals", null);
        setField(term226225, term226225.getClass(), "permissions", null);
        setBooleanField(term226225, term226225.getClass(), "hasAllPerm", false);
        setBooleanField(term226225, term226225.getClass(), "staticPermissions", false);
        setField(term226225, term226225.getClass(), "key", null);
        setElement(term226213, 3, term226225);
        setField(term226228, term226228.getClass(), "codesource", null);
        setField(term226228, term226228.getClass(), "classloader", null);
        setField(term226228, term226228.getClass(), "principals", null);
        setField(term226228, term226228.getClass(), "permissions", null);
        setBooleanField(term226228, term226228.getClass(), "hasAllPerm", false);
        setBooleanField(term226228, term226228.getClass(), "staticPermissions", false);
        setField(term226228, term226228.getClass(), "key", null);
        setElement(term226213, 4, term226228);
        setField(term226231, term226231.getClass(), "codesource", null);
        setField(term226231, term226231.getClass(), "classloader", null);
        setField(term226231, term226231.getClass(), "principals", null);
        setField(term226231, term226231.getClass(), "permissions", null);
        setBooleanField(term226231, term226231.getClass(), "hasAllPerm", false);
        setBooleanField(term226231, term226231.getClass(), "staticPermissions", false);
        setField(term226231, term226231.getClass(), "key", null);
        setElement(term226213, 5, term226231);
        setField(term226234, term226234.getClass(), "codesource", null);
        setField(term226234, term226234.getClass(), "classloader", null);
        setField(term226234, term226234.getClass(), "principals", null);
        setField(term226234, term226234.getClass(), "permissions", null);
        setBooleanField(term226234, term226234.getClass(), "hasAllPerm", false);
        setBooleanField(term226234, term226234.getClass(), "staticPermissions", false);
        setField(term226234, term226234.getClass(), "key", null);
        setElement(term226213, 6, term226234);
        setField(term226237, term226237.getClass(), "codesource", null);
        setField(term226237, term226237.getClass(), "classloader", null);
        setField(term226237, term226237.getClass(), "principals", null);
        setField(term226237, term226237.getClass(), "permissions", null);
        setBooleanField(term226237, term226237.getClass(), "hasAllPerm", false);
        setBooleanField(term226237, term226237.getClass(), "staticPermissions", false);
        setField(term226237, term226237.getClass(), "key", null);
        setElement(term226213, 7, term226237);
        setField(term226212, term226212.getClass(), "context", term226213);
        setBooleanField(term226212, term226212.getClass(), "isPrivileged", false);
        setBooleanField(term226212, term226212.getClass(), "isAuthorized", false);
        setField(term226242, term226242.getClass(), "context", null);
        setBooleanField(term226242, term226242.getClass(), "isPrivileged", false);
        setBooleanField(term226242, term226242.getClass(), "isAuthorized", false);
        setField(term226242, term226242.getClass(), "privilegedContext", null);
        setField(term226242, term226242.getClass(), "combiner", null);
        setField(term226242, term226242.getClass(), "permissions", null);
        setField(term226242, term226242.getClass(), "parent", null);
        setBooleanField(term226242, term226242.getClass(), "isWrapped", false);
        setBooleanField(term226242, term226242.getClass(), "isLimited", false);
        setField(term226242, term226242.getClass(), "limitedContext", null);
        setField(term226212, term226212.getClass(), "privilegedContext", term226242);
        setField(term226212, term226212.getClass(), "combiner", null);
        setField(term226212, term226212.getClass(), "permissions", null);
        setField(term226212, term226212.getClass(), "parent", null);
        setBooleanField(term226212, term226212.getClass(), "isWrapped", false);
        setBooleanField(term226212, term226212.getClass(), "isLimited", false);
        setField(term226212, term226212.getClass(), "limitedContext", null);
        setField(term226192, term226192.getClass(), "acc", term226212);
        setBooleanField(term226192, term226192.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term226192, term226192.getClass(), "isPosted", false);
        setBooleanField(term226192, term226192.getClass(), "isSystemGenerated", false);
        setField(term226192, term226192.getClass(), "source", term226252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$11");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term226192;
        callMethod(klass, "mouseClicked", argTypes, term226191, args);
    }

};


