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
     Object term226185;
     Object term226186;

    public Board_11_mouseClicked_3469234572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226185 = newInstance(Class.forName("core.Board$11"));
        setField(term226185, term226185.getClass(), "this$0", null);
        term226186 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term226199 = (byte[]) newByteArray(4);
        Object term226206 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term226207 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term226208 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226209 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term226210 = (Object[]) newArray("java.security.Principal", 3);
        Object term226213 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226216 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226219 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226222 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226225 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226228 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226231 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226236 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term226246 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term226186, term226186.getClass(), "x", 1961351136);
        setIntField(term226186, term226186.getClass(), "y", -1546528470);
        setIntField(term226186, term226186.getClass(), "xAbs", -1518971561);
        setIntField(term226186, term226186.getClass(), "yAbs", 1513663171);
        setIntField(term226186, term226186.getClass(), "clickCount", 1527034193);
        setBooleanField(term226186, term226186.getClass(), "causedByTouchEvent", false);
        setIntField(term226186, term226186.getClass(), "button", 1309545946);
        setBooleanField(term226186, term226186.getClass(), "popupTrigger", true);
        setBooleanField(term226186, term226186.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term226186, term226186.getClass(), "when", 4394651392080968777L);
        setIntField(term226186, term226186.getClass(), "modifiers", -1457812682);
        setBooleanField(term226186, term226186.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term226199, 0, (byte) -53);
        setByteElement(term226199, 1, (byte) -93);
        setByteElement(term226199, 2, (byte) 82);
        setByteElement(term226199, 3, (byte) -89);
        setField(term226186, term226186.getClass(), "bdata", term226199);
        setIntField(term226186, term226186.getClass(), "id", -161850441);
        setBooleanField(term226186, term226186.getClass(), "consumed", false);
        setField(term226209, term226209.getClass(), "location", null);
        setField(term226209, term226209.getClass(), "signers", null);
        setField(term226209, term226209.getClass(), "certs", null);
        setField(term226209, term226209.getClass(), "sp", null);
        setField(term226209, term226209.getClass(), "factory", null);
        setField(term226209, term226209.getClass(), "locationNoFragString", null);
        setField(term226208, term226208.getClass(), "codesource", term226209);
        setField(term226208, term226208.getClass(), "classloader", null);
        setField(term226208, term226208.getClass(), "principals", term226210);
        setField(term226208, term226208.getClass(), "permissions", null);
        setBooleanField(term226208, term226208.getClass(), "hasAllPerm", false);
        setBooleanField(term226208, term226208.getClass(), "staticPermissions", false);
        setField(term226208, term226208.getClass(), "key", null);
        setElement(term226207, 0, term226208);
        setField(term226213, term226213.getClass(), "codesource", null);
        setField(term226213, term226213.getClass(), "classloader", null);
        setField(term226213, term226213.getClass(), "principals", null);
        setField(term226213, term226213.getClass(), "permissions", null);
        setBooleanField(term226213, term226213.getClass(), "hasAllPerm", false);
        setBooleanField(term226213, term226213.getClass(), "staticPermissions", false);
        setField(term226213, term226213.getClass(), "key", null);
        setElement(term226207, 1, term226213);
        setField(term226216, term226216.getClass(), "codesource", null);
        setField(term226216, term226216.getClass(), "classloader", null);
        setField(term226216, term226216.getClass(), "principals", null);
        setField(term226216, term226216.getClass(), "permissions", null);
        setBooleanField(term226216, term226216.getClass(), "hasAllPerm", false);
        setBooleanField(term226216, term226216.getClass(), "staticPermissions", false);
        setField(term226216, term226216.getClass(), "key", null);
        setElement(term226207, 2, term226216);
        setField(term226219, term226219.getClass(), "codesource", null);
        setField(term226219, term226219.getClass(), "classloader", null);
        setField(term226219, term226219.getClass(), "principals", null);
        setField(term226219, term226219.getClass(), "permissions", null);
        setBooleanField(term226219, term226219.getClass(), "hasAllPerm", false);
        setBooleanField(term226219, term226219.getClass(), "staticPermissions", false);
        setField(term226219, term226219.getClass(), "key", null);
        setElement(term226207, 3, term226219);
        setField(term226222, term226222.getClass(), "codesource", null);
        setField(term226222, term226222.getClass(), "classloader", null);
        setField(term226222, term226222.getClass(), "principals", null);
        setField(term226222, term226222.getClass(), "permissions", null);
        setBooleanField(term226222, term226222.getClass(), "hasAllPerm", false);
        setBooleanField(term226222, term226222.getClass(), "staticPermissions", false);
        setField(term226222, term226222.getClass(), "key", null);
        setElement(term226207, 4, term226222);
        setField(term226225, term226225.getClass(), "codesource", null);
        setField(term226225, term226225.getClass(), "classloader", null);
        setField(term226225, term226225.getClass(), "principals", null);
        setField(term226225, term226225.getClass(), "permissions", null);
        setBooleanField(term226225, term226225.getClass(), "hasAllPerm", false);
        setBooleanField(term226225, term226225.getClass(), "staticPermissions", false);
        setField(term226225, term226225.getClass(), "key", null);
        setElement(term226207, 5, term226225);
        setField(term226228, term226228.getClass(), "codesource", null);
        setField(term226228, term226228.getClass(), "classloader", null);
        setField(term226228, term226228.getClass(), "principals", null);
        setField(term226228, term226228.getClass(), "permissions", null);
        setBooleanField(term226228, term226228.getClass(), "hasAllPerm", false);
        setBooleanField(term226228, term226228.getClass(), "staticPermissions", false);
        setField(term226228, term226228.getClass(), "key", null);
        setElement(term226207, 6, term226228);
        setField(term226231, term226231.getClass(), "codesource", null);
        setField(term226231, term226231.getClass(), "classloader", null);
        setField(term226231, term226231.getClass(), "principals", null);
        setField(term226231, term226231.getClass(), "permissions", null);
        setBooleanField(term226231, term226231.getClass(), "hasAllPerm", false);
        setBooleanField(term226231, term226231.getClass(), "staticPermissions", false);
        setField(term226231, term226231.getClass(), "key", null);
        setElement(term226207, 7, term226231);
        setField(term226206, term226206.getClass(), "context", term226207);
        setBooleanField(term226206, term226206.getClass(), "isPrivileged", false);
        setBooleanField(term226206, term226206.getClass(), "isAuthorized", false);
        setField(term226236, term226236.getClass(), "context", null);
        setBooleanField(term226236, term226236.getClass(), "isPrivileged", false);
        setBooleanField(term226236, term226236.getClass(), "isAuthorized", false);
        setField(term226236, term226236.getClass(), "privilegedContext", null);
        setField(term226236, term226236.getClass(), "combiner", null);
        setField(term226236, term226236.getClass(), "permissions", null);
        setField(term226236, term226236.getClass(), "parent", null);
        setBooleanField(term226236, term226236.getClass(), "isWrapped", false);
        setBooleanField(term226236, term226236.getClass(), "isLimited", false);
        setField(term226236, term226236.getClass(), "limitedContext", null);
        setField(term226206, term226206.getClass(), "privilegedContext", term226236);
        setField(term226206, term226206.getClass(), "combiner", null);
        setField(term226206, term226206.getClass(), "permissions", null);
        setField(term226206, term226206.getClass(), "parent", null);
        setBooleanField(term226206, term226206.getClass(), "isWrapped", false);
        setBooleanField(term226206, term226206.getClass(), "isLimited", false);
        setField(term226206, term226206.getClass(), "limitedContext", null);
        setField(term226186, term226186.getClass(), "acc", term226206);
        setBooleanField(term226186, term226186.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term226186, term226186.getClass(), "isPosted", false);
        setBooleanField(term226186, term226186.getClass(), "isSystemGenerated", false);
        setField(term226186, term226186.getClass(), "source", term226246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$11");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term226186;
        callMethod(klass, "mouseClicked", argTypes, term226185, args);
    }

};


