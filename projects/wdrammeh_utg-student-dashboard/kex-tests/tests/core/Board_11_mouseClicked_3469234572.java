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
     Object term226177;
     Object term226178;

    public Board_11_mouseClicked_3469234572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226177 = newInstance(Class.forName("core.Board$11"));
        setField(term226177, term226177.getClass(), "this$0", null);
        term226178 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term226191 = (byte[]) newByteArray(4);
        Object term226198 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term226199 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term226200 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226201 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term226202 = (Object[]) newArray("java.security.Principal", 3);
        Object term226205 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226208 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226211 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226214 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226217 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226220 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226223 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term226228 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term226238 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term226178, term226178.getClass(), "x", 1961351136);
        setIntField(term226178, term226178.getClass(), "y", -1546528470);
        setIntField(term226178, term226178.getClass(), "xAbs", -1518971561);
        setIntField(term226178, term226178.getClass(), "yAbs", 1513663171);
        setIntField(term226178, term226178.getClass(), "clickCount", 1527034193);
        setBooleanField(term226178, term226178.getClass(), "causedByTouchEvent", false);
        setIntField(term226178, term226178.getClass(), "button", 1309545946);
        setBooleanField(term226178, term226178.getClass(), "popupTrigger", true);
        setBooleanField(term226178, term226178.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term226178, term226178.getClass(), "when", 4394651392080968777L);
        setIntField(term226178, term226178.getClass(), "modifiers", -1457812682);
        setBooleanField(term226178, term226178.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term226191, 0, (byte) -53);
        setByteElement(term226191, 1, (byte) -93);
        setByteElement(term226191, 2, (byte) 82);
        setByteElement(term226191, 3, (byte) -89);
        setField(term226178, term226178.getClass(), "bdata", term226191);
        setIntField(term226178, term226178.getClass(), "id", -161850441);
        setBooleanField(term226178, term226178.getClass(), "consumed", false);
        setField(term226201, term226201.getClass(), "location", null);
        setField(term226201, term226201.getClass(), "signers", null);
        setField(term226201, term226201.getClass(), "certs", null);
        setField(term226201, term226201.getClass(), "sp", null);
        setField(term226201, term226201.getClass(), "factory", null);
        setField(term226201, term226201.getClass(), "locationNoFragString", null);
        setField(term226200, term226200.getClass(), "codesource", term226201);
        setField(term226200, term226200.getClass(), "classloader", null);
        setField(term226200, term226200.getClass(), "principals", term226202);
        setField(term226200, term226200.getClass(), "permissions", null);
        setBooleanField(term226200, term226200.getClass(), "hasAllPerm", false);
        setBooleanField(term226200, term226200.getClass(), "staticPermissions", false);
        setField(term226200, term226200.getClass(), "key", null);
        setElement(term226199, 0, term226200);
        setField(term226205, term226205.getClass(), "codesource", null);
        setField(term226205, term226205.getClass(), "classloader", null);
        setField(term226205, term226205.getClass(), "principals", null);
        setField(term226205, term226205.getClass(), "permissions", null);
        setBooleanField(term226205, term226205.getClass(), "hasAllPerm", false);
        setBooleanField(term226205, term226205.getClass(), "staticPermissions", false);
        setField(term226205, term226205.getClass(), "key", null);
        setElement(term226199, 1, term226205);
        setField(term226208, term226208.getClass(), "codesource", null);
        setField(term226208, term226208.getClass(), "classloader", null);
        setField(term226208, term226208.getClass(), "principals", null);
        setField(term226208, term226208.getClass(), "permissions", null);
        setBooleanField(term226208, term226208.getClass(), "hasAllPerm", false);
        setBooleanField(term226208, term226208.getClass(), "staticPermissions", false);
        setField(term226208, term226208.getClass(), "key", null);
        setElement(term226199, 2, term226208);
        setField(term226211, term226211.getClass(), "codesource", null);
        setField(term226211, term226211.getClass(), "classloader", null);
        setField(term226211, term226211.getClass(), "principals", null);
        setField(term226211, term226211.getClass(), "permissions", null);
        setBooleanField(term226211, term226211.getClass(), "hasAllPerm", false);
        setBooleanField(term226211, term226211.getClass(), "staticPermissions", false);
        setField(term226211, term226211.getClass(), "key", null);
        setElement(term226199, 3, term226211);
        setField(term226214, term226214.getClass(), "codesource", null);
        setField(term226214, term226214.getClass(), "classloader", null);
        setField(term226214, term226214.getClass(), "principals", null);
        setField(term226214, term226214.getClass(), "permissions", null);
        setBooleanField(term226214, term226214.getClass(), "hasAllPerm", false);
        setBooleanField(term226214, term226214.getClass(), "staticPermissions", false);
        setField(term226214, term226214.getClass(), "key", null);
        setElement(term226199, 4, term226214);
        setField(term226217, term226217.getClass(), "codesource", null);
        setField(term226217, term226217.getClass(), "classloader", null);
        setField(term226217, term226217.getClass(), "principals", null);
        setField(term226217, term226217.getClass(), "permissions", null);
        setBooleanField(term226217, term226217.getClass(), "hasAllPerm", false);
        setBooleanField(term226217, term226217.getClass(), "staticPermissions", false);
        setField(term226217, term226217.getClass(), "key", null);
        setElement(term226199, 5, term226217);
        setField(term226220, term226220.getClass(), "codesource", null);
        setField(term226220, term226220.getClass(), "classloader", null);
        setField(term226220, term226220.getClass(), "principals", null);
        setField(term226220, term226220.getClass(), "permissions", null);
        setBooleanField(term226220, term226220.getClass(), "hasAllPerm", false);
        setBooleanField(term226220, term226220.getClass(), "staticPermissions", false);
        setField(term226220, term226220.getClass(), "key", null);
        setElement(term226199, 6, term226220);
        setField(term226223, term226223.getClass(), "codesource", null);
        setField(term226223, term226223.getClass(), "classloader", null);
        setField(term226223, term226223.getClass(), "principals", null);
        setField(term226223, term226223.getClass(), "permissions", null);
        setBooleanField(term226223, term226223.getClass(), "hasAllPerm", false);
        setBooleanField(term226223, term226223.getClass(), "staticPermissions", false);
        setField(term226223, term226223.getClass(), "key", null);
        setElement(term226199, 7, term226223);
        setField(term226198, term226198.getClass(), "context", term226199);
        setBooleanField(term226198, term226198.getClass(), "isPrivileged", false);
        setBooleanField(term226198, term226198.getClass(), "isAuthorized", false);
        setField(term226228, term226228.getClass(), "context", null);
        setBooleanField(term226228, term226228.getClass(), "isPrivileged", false);
        setBooleanField(term226228, term226228.getClass(), "isAuthorized", false);
        setField(term226228, term226228.getClass(), "privilegedContext", null);
        setField(term226228, term226228.getClass(), "combiner", null);
        setField(term226228, term226228.getClass(), "permissions", null);
        setField(term226228, term226228.getClass(), "parent", null);
        setBooleanField(term226228, term226228.getClass(), "isWrapped", false);
        setBooleanField(term226228, term226228.getClass(), "isLimited", false);
        setField(term226228, term226228.getClass(), "limitedContext", null);
        setField(term226198, term226198.getClass(), "privilegedContext", term226228);
        setField(term226198, term226198.getClass(), "combiner", null);
        setField(term226198, term226198.getClass(), "permissions", null);
        setField(term226198, term226198.getClass(), "parent", null);
        setBooleanField(term226198, term226198.getClass(), "isWrapped", false);
        setBooleanField(term226198, term226198.getClass(), "isLimited", false);
        setField(term226198, term226198.getClass(), "limitedContext", null);
        setField(term226178, term226178.getClass(), "acc", term226198);
        setBooleanField(term226178, term226178.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term226178, term226178.getClass(), "isPosted", false);
        setBooleanField(term226178, term226178.getClass(), "isSystemGenerated", false);
        setField(term226178, term226178.getClass(), "source", term226238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$11");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term226178;
        callMethod(klass, "mouseClicked", argTypes, term226177, args);
    }

};


