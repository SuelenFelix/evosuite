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

public class Board_12_mouseClicked_3469234882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225211;
     Object term225212;

    public Board_12_mouseClicked_3469234882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225211 = newInstance(Class.forName("core.Board$12"));
        setField(term225211, term225211.getClass(), "this$0", null);
        term225212 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term225225 = (byte[]) newByteArray(7);
        Object term225235 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term225236 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term225237 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225238 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term225239 = (Object[]) newArray("java.security.Principal", 8);
        Object term225242 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225245 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225248 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225251 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225254 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225257 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225260 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225265 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term225275 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term225212, term225212.getClass(), "x", 1232958763);
        setIntField(term225212, term225212.getClass(), "y", -1702132549);
        setIntField(term225212, term225212.getClass(), "xAbs", -1786136772);
        setIntField(term225212, term225212.getClass(), "yAbs", -1510967747);
        setIntField(term225212, term225212.getClass(), "clickCount", -2014792457);
        setBooleanField(term225212, term225212.getClass(), "causedByTouchEvent", true);
        setIntField(term225212, term225212.getClass(), "button", 1957633116);
        setBooleanField(term225212, term225212.getClass(), "popupTrigger", false);
        setBooleanField(term225212, term225212.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term225212, term225212.getClass(), "when", 5246058710498845622L);
        setIntField(term225212, term225212.getClass(), "modifiers", 1428598210);
        setBooleanField(term225212, term225212.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term225225, 0, (byte) -112);
        setByteElement(term225225, 1, (byte) 81);
        setByteElement(term225225, 2, (byte) 65);
        setByteElement(term225225, 3, (byte) -44);
        setByteElement(term225225, 4, (byte) 33);
        setByteElement(term225225, 5, (byte) -74);
        setByteElement(term225225, 6, (byte) -84);
        setField(term225212, term225212.getClass(), "bdata", term225225);
        setIntField(term225212, term225212.getClass(), "id", 1071776561);
        setBooleanField(term225212, term225212.getClass(), "consumed", false);
        setField(term225238, term225238.getClass(), "location", null);
        setField(term225238, term225238.getClass(), "signers", null);
        setField(term225238, term225238.getClass(), "certs", null);
        setField(term225238, term225238.getClass(), "sp", null);
        setField(term225238, term225238.getClass(), "factory", null);
        setField(term225238, term225238.getClass(), "locationNoFragString", null);
        setField(term225237, term225237.getClass(), "codesource", term225238);
        setField(term225237, term225237.getClass(), "classloader", null);
        setField(term225237, term225237.getClass(), "principals", term225239);
        setField(term225237, term225237.getClass(), "permissions", null);
        setBooleanField(term225237, term225237.getClass(), "hasAllPerm", false);
        setBooleanField(term225237, term225237.getClass(), "staticPermissions", false);
        setField(term225237, term225237.getClass(), "key", null);
        setElement(term225236, 0, term225237);
        setField(term225242, term225242.getClass(), "codesource", null);
        setField(term225242, term225242.getClass(), "classloader", null);
        setField(term225242, term225242.getClass(), "principals", null);
        setField(term225242, term225242.getClass(), "permissions", null);
        setBooleanField(term225242, term225242.getClass(), "hasAllPerm", false);
        setBooleanField(term225242, term225242.getClass(), "staticPermissions", false);
        setField(term225242, term225242.getClass(), "key", null);
        setElement(term225236, 1, term225242);
        setField(term225245, term225245.getClass(), "codesource", null);
        setField(term225245, term225245.getClass(), "classloader", null);
        setField(term225245, term225245.getClass(), "principals", null);
        setField(term225245, term225245.getClass(), "permissions", null);
        setBooleanField(term225245, term225245.getClass(), "hasAllPerm", false);
        setBooleanField(term225245, term225245.getClass(), "staticPermissions", false);
        setField(term225245, term225245.getClass(), "key", null);
        setElement(term225236, 2, term225245);
        setField(term225248, term225248.getClass(), "codesource", null);
        setField(term225248, term225248.getClass(), "classloader", null);
        setField(term225248, term225248.getClass(), "principals", null);
        setField(term225248, term225248.getClass(), "permissions", null);
        setBooleanField(term225248, term225248.getClass(), "hasAllPerm", false);
        setBooleanField(term225248, term225248.getClass(), "staticPermissions", false);
        setField(term225248, term225248.getClass(), "key", null);
        setElement(term225236, 3, term225248);
        setField(term225251, term225251.getClass(), "codesource", null);
        setField(term225251, term225251.getClass(), "classloader", null);
        setField(term225251, term225251.getClass(), "principals", null);
        setField(term225251, term225251.getClass(), "permissions", null);
        setBooleanField(term225251, term225251.getClass(), "hasAllPerm", false);
        setBooleanField(term225251, term225251.getClass(), "staticPermissions", false);
        setField(term225251, term225251.getClass(), "key", null);
        setElement(term225236, 4, term225251);
        setField(term225254, term225254.getClass(), "codesource", null);
        setField(term225254, term225254.getClass(), "classloader", null);
        setField(term225254, term225254.getClass(), "principals", null);
        setField(term225254, term225254.getClass(), "permissions", null);
        setBooleanField(term225254, term225254.getClass(), "hasAllPerm", false);
        setBooleanField(term225254, term225254.getClass(), "staticPermissions", false);
        setField(term225254, term225254.getClass(), "key", null);
        setElement(term225236, 5, term225254);
        setField(term225257, term225257.getClass(), "codesource", null);
        setField(term225257, term225257.getClass(), "classloader", null);
        setField(term225257, term225257.getClass(), "principals", null);
        setField(term225257, term225257.getClass(), "permissions", null);
        setBooleanField(term225257, term225257.getClass(), "hasAllPerm", false);
        setBooleanField(term225257, term225257.getClass(), "staticPermissions", false);
        setField(term225257, term225257.getClass(), "key", null);
        setElement(term225236, 6, term225257);
        setField(term225260, term225260.getClass(), "codesource", null);
        setField(term225260, term225260.getClass(), "classloader", null);
        setField(term225260, term225260.getClass(), "principals", null);
        setField(term225260, term225260.getClass(), "permissions", null);
        setBooleanField(term225260, term225260.getClass(), "hasAllPerm", false);
        setBooleanField(term225260, term225260.getClass(), "staticPermissions", false);
        setField(term225260, term225260.getClass(), "key", null);
        setElement(term225236, 7, term225260);
        setField(term225235, term225235.getClass(), "context", term225236);
        setBooleanField(term225235, term225235.getClass(), "isPrivileged", false);
        setBooleanField(term225235, term225235.getClass(), "isAuthorized", true);
        setField(term225265, term225265.getClass(), "context", null);
        setBooleanField(term225265, term225265.getClass(), "isPrivileged", false);
        setBooleanField(term225265, term225265.getClass(), "isAuthorized", false);
        setField(term225265, term225265.getClass(), "privilegedContext", null);
        setField(term225265, term225265.getClass(), "combiner", null);
        setField(term225265, term225265.getClass(), "permissions", null);
        setField(term225265, term225265.getClass(), "parent", null);
        setBooleanField(term225265, term225265.getClass(), "isWrapped", false);
        setBooleanField(term225265, term225265.getClass(), "isLimited", false);
        setField(term225265, term225265.getClass(), "limitedContext", null);
        setField(term225235, term225235.getClass(), "privilegedContext", term225265);
        setField(term225235, term225235.getClass(), "combiner", null);
        setField(term225235, term225235.getClass(), "permissions", null);
        setField(term225235, term225235.getClass(), "parent", null);
        setBooleanField(term225235, term225235.getClass(), "isWrapped", false);
        setBooleanField(term225235, term225235.getClass(), "isLimited", false);
        setField(term225235, term225235.getClass(), "limitedContext", null);
        setField(term225212, term225212.getClass(), "acc", term225235);
        setBooleanField(term225212, term225212.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term225212, term225212.getClass(), "isPosted", false);
        setBooleanField(term225212, term225212.getClass(), "isSystemGenerated", true);
        setField(term225212, term225212.getClass(), "source", term225275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$12");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term225212;
        callMethod(klass, "mouseClicked", argTypes, term225211, args);
    }

};


