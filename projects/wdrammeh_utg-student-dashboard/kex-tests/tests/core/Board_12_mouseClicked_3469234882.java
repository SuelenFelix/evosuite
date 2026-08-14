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
     Object term225217;
     Object term225218;

    public Board_12_mouseClicked_3469234882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225217 = newInstance(Class.forName("core.Board$12"));
        setField(term225217, term225217.getClass(), "this$0", null);
        term225218 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term225231 = (byte[]) newByteArray(7);
        Object term225241 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term225242 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term225243 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225244 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term225245 = (Object[]) newArray("java.security.Principal", 8);
        Object term225248 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225251 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225254 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225257 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225260 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225263 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225266 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225271 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term225281 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term225218, term225218.getClass(), "x", 1232958763);
        setIntField(term225218, term225218.getClass(), "y", -1702132549);
        setIntField(term225218, term225218.getClass(), "xAbs", -1786136772);
        setIntField(term225218, term225218.getClass(), "yAbs", -1510967747);
        setIntField(term225218, term225218.getClass(), "clickCount", -2014792457);
        setBooleanField(term225218, term225218.getClass(), "causedByTouchEvent", true);
        setIntField(term225218, term225218.getClass(), "button", 1957633116);
        setBooleanField(term225218, term225218.getClass(), "popupTrigger", false);
        setBooleanField(term225218, term225218.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term225218, term225218.getClass(), "when", 5246058710498845622L);
        setIntField(term225218, term225218.getClass(), "modifiers", 1428598210);
        setBooleanField(term225218, term225218.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term225231, 0, (byte) -112);
        setByteElement(term225231, 1, (byte) 81);
        setByteElement(term225231, 2, (byte) 65);
        setByteElement(term225231, 3, (byte) -44);
        setByteElement(term225231, 4, (byte) 33);
        setByteElement(term225231, 5, (byte) -74);
        setByteElement(term225231, 6, (byte) -84);
        setField(term225218, term225218.getClass(), "bdata", term225231);
        setIntField(term225218, term225218.getClass(), "id", 1071776561);
        setBooleanField(term225218, term225218.getClass(), "consumed", false);
        setField(term225244, term225244.getClass(), "location", null);
        setField(term225244, term225244.getClass(), "signers", null);
        setField(term225244, term225244.getClass(), "certs", null);
        setField(term225244, term225244.getClass(), "sp", null);
        setField(term225244, term225244.getClass(), "factory", null);
        setField(term225244, term225244.getClass(), "locationNoFragString", null);
        setField(term225243, term225243.getClass(), "codesource", term225244);
        setField(term225243, term225243.getClass(), "classloader", null);
        setField(term225243, term225243.getClass(), "principals", term225245);
        setField(term225243, term225243.getClass(), "permissions", null);
        setBooleanField(term225243, term225243.getClass(), "hasAllPerm", false);
        setBooleanField(term225243, term225243.getClass(), "staticPermissions", false);
        setField(term225243, term225243.getClass(), "key", null);
        setElement(term225242, 0, term225243);
        setField(term225248, term225248.getClass(), "codesource", null);
        setField(term225248, term225248.getClass(), "classloader", null);
        setField(term225248, term225248.getClass(), "principals", null);
        setField(term225248, term225248.getClass(), "permissions", null);
        setBooleanField(term225248, term225248.getClass(), "hasAllPerm", false);
        setBooleanField(term225248, term225248.getClass(), "staticPermissions", false);
        setField(term225248, term225248.getClass(), "key", null);
        setElement(term225242, 1, term225248);
        setField(term225251, term225251.getClass(), "codesource", null);
        setField(term225251, term225251.getClass(), "classloader", null);
        setField(term225251, term225251.getClass(), "principals", null);
        setField(term225251, term225251.getClass(), "permissions", null);
        setBooleanField(term225251, term225251.getClass(), "hasAllPerm", false);
        setBooleanField(term225251, term225251.getClass(), "staticPermissions", false);
        setField(term225251, term225251.getClass(), "key", null);
        setElement(term225242, 2, term225251);
        setField(term225254, term225254.getClass(), "codesource", null);
        setField(term225254, term225254.getClass(), "classloader", null);
        setField(term225254, term225254.getClass(), "principals", null);
        setField(term225254, term225254.getClass(), "permissions", null);
        setBooleanField(term225254, term225254.getClass(), "hasAllPerm", false);
        setBooleanField(term225254, term225254.getClass(), "staticPermissions", false);
        setField(term225254, term225254.getClass(), "key", null);
        setElement(term225242, 3, term225254);
        setField(term225257, term225257.getClass(), "codesource", null);
        setField(term225257, term225257.getClass(), "classloader", null);
        setField(term225257, term225257.getClass(), "principals", null);
        setField(term225257, term225257.getClass(), "permissions", null);
        setBooleanField(term225257, term225257.getClass(), "hasAllPerm", false);
        setBooleanField(term225257, term225257.getClass(), "staticPermissions", false);
        setField(term225257, term225257.getClass(), "key", null);
        setElement(term225242, 4, term225257);
        setField(term225260, term225260.getClass(), "codesource", null);
        setField(term225260, term225260.getClass(), "classloader", null);
        setField(term225260, term225260.getClass(), "principals", null);
        setField(term225260, term225260.getClass(), "permissions", null);
        setBooleanField(term225260, term225260.getClass(), "hasAllPerm", false);
        setBooleanField(term225260, term225260.getClass(), "staticPermissions", false);
        setField(term225260, term225260.getClass(), "key", null);
        setElement(term225242, 5, term225260);
        setField(term225263, term225263.getClass(), "codesource", null);
        setField(term225263, term225263.getClass(), "classloader", null);
        setField(term225263, term225263.getClass(), "principals", null);
        setField(term225263, term225263.getClass(), "permissions", null);
        setBooleanField(term225263, term225263.getClass(), "hasAllPerm", false);
        setBooleanField(term225263, term225263.getClass(), "staticPermissions", false);
        setField(term225263, term225263.getClass(), "key", null);
        setElement(term225242, 6, term225263);
        setField(term225266, term225266.getClass(), "codesource", null);
        setField(term225266, term225266.getClass(), "classloader", null);
        setField(term225266, term225266.getClass(), "principals", null);
        setField(term225266, term225266.getClass(), "permissions", null);
        setBooleanField(term225266, term225266.getClass(), "hasAllPerm", false);
        setBooleanField(term225266, term225266.getClass(), "staticPermissions", false);
        setField(term225266, term225266.getClass(), "key", null);
        setElement(term225242, 7, term225266);
        setField(term225241, term225241.getClass(), "context", term225242);
        setBooleanField(term225241, term225241.getClass(), "isPrivileged", false);
        setBooleanField(term225241, term225241.getClass(), "isAuthorized", true);
        setField(term225271, term225271.getClass(), "context", null);
        setBooleanField(term225271, term225271.getClass(), "isPrivileged", false);
        setBooleanField(term225271, term225271.getClass(), "isAuthorized", false);
        setField(term225271, term225271.getClass(), "privilegedContext", null);
        setField(term225271, term225271.getClass(), "combiner", null);
        setField(term225271, term225271.getClass(), "permissions", null);
        setField(term225271, term225271.getClass(), "parent", null);
        setBooleanField(term225271, term225271.getClass(), "isWrapped", false);
        setBooleanField(term225271, term225271.getClass(), "isLimited", false);
        setField(term225271, term225271.getClass(), "limitedContext", null);
        setField(term225241, term225241.getClass(), "privilegedContext", term225271);
        setField(term225241, term225241.getClass(), "combiner", null);
        setField(term225241, term225241.getClass(), "permissions", null);
        setField(term225241, term225241.getClass(), "parent", null);
        setBooleanField(term225241, term225241.getClass(), "isWrapped", false);
        setBooleanField(term225241, term225241.getClass(), "isLimited", false);
        setField(term225241, term225241.getClass(), "limitedContext", null);
        setField(term225218, term225218.getClass(), "acc", term225241);
        setBooleanField(term225218, term225218.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term225218, term225218.getClass(), "isPosted", false);
        setBooleanField(term225218, term225218.getClass(), "isSystemGenerated", true);
        setField(term225218, term225218.getClass(), "source", term225281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$12");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term225218;
        callMethod(klass, "mouseClicked", argTypes, term225217, args);
    }

};


