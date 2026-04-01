package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ShipDesignView_2_keyTyped_8309616412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1923193;
     Object term1923194;

    public ShipDesignView_2_keyTyped_8309616412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1923193 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView$2"));
        setField(term1923193, term1923193.getClass(), "this$0", null);
        term1923194 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term1923206 = (byte[]) newByteArray(6);
        Object term1923215 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1923216 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term1923217 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923218 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1923219 = (Object[]) newArray("java.security.Principal", 1);
        Object term1923224 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1923234 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term1923194, term1923194.getClass(), "isProxyActive", true);
        setIntField(term1923194, term1923194.getClass(), "keyCode", 484667679);
        setCharField(term1923194, term1923194.getClass(), "keyChar", 'M');
        setIntField(term1923194, term1923194.getClass(), "keyLocation", -1588511793);
        setLongField(term1923194, term1923194.getClass(), "rawCode", -4598158870068953328L);
        setLongField(term1923194, term1923194.getClass(), "primaryLevelUnicode", 138235087558060686L);
        setLongField(term1923194, term1923194.getClass(), "scancode", 5381386339318883012L);
        setLongField(term1923194, term1923194.getClass(), "extendedKeyCode", -1333707622307134180L);
        setField(term1923194, term1923194.getClass(), "originalSource", null);
        setLongField(term1923194, term1923194.getClass(), "when", -4360569253593381888L);
        setIntField(term1923194, term1923194.getClass(), "modifiers", 695225143);
        setBooleanField(term1923194, term1923194.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term1923206, 0, (byte) 34);
        setByteElement(term1923206, 1, (byte) -89);
        setByteElement(term1923206, 2, (byte) -118);
        setByteElement(term1923206, 3, (byte) -26);
        setByteElement(term1923206, 4, (byte) -60);
        setByteElement(term1923206, 5, (byte) -70);
        setField(term1923194, term1923194.getClass(), "bdata", term1923206);
        setIntField(term1923194, term1923194.getClass(), "id", 1006383286);
        setBooleanField(term1923194, term1923194.getClass(), "consumed", true);
        setField(term1923218, term1923218.getClass(), "location", null);
        setField(term1923218, term1923218.getClass(), "signers", null);
        setField(term1923218, term1923218.getClass(), "certs", null);
        setField(term1923218, term1923218.getClass(), "sp", null);
        setField(term1923218, term1923218.getClass(), "factory", null);
        setField(term1923218, term1923218.getClass(), "locationNoFragString", null);
        setField(term1923217, term1923217.getClass(), "codesource", term1923218);
        setField(term1923217, term1923217.getClass(), "classloader", null);
        setField(term1923217, term1923217.getClass(), "principals", term1923219);
        setField(term1923217, term1923217.getClass(), "permissions", null);
        setBooleanField(term1923217, term1923217.getClass(), "hasAllPerm", false);
        setBooleanField(term1923217, term1923217.getClass(), "staticPermissions", false);
        setField(term1923217, term1923217.getClass(), "key", null);
        setElement(term1923216, 0, term1923217);
        setField(term1923215, term1923215.getClass(), "context", term1923216);
        setBooleanField(term1923215, term1923215.getClass(), "isPrivileged", false);
        setBooleanField(term1923215, term1923215.getClass(), "isAuthorized", true);
        setField(term1923224, term1923224.getClass(), "context", null);
        setBooleanField(term1923224, term1923224.getClass(), "isPrivileged", false);
        setBooleanField(term1923224, term1923224.getClass(), "isAuthorized", false);
        setField(term1923224, term1923224.getClass(), "privilegedContext", null);
        setField(term1923224, term1923224.getClass(), "combiner", null);
        setField(term1923224, term1923224.getClass(), "permissions", null);
        setField(term1923224, term1923224.getClass(), "parent", null);
        setBooleanField(term1923224, term1923224.getClass(), "isWrapped", false);
        setBooleanField(term1923224, term1923224.getClass(), "isLimited", false);
        setField(term1923224, term1923224.getClass(), "limitedContext", null);
        setField(term1923215, term1923215.getClass(), "privilegedContext", term1923224);
        setField(term1923215, term1923215.getClass(), "combiner", null);
        setField(term1923215, term1923215.getClass(), "permissions", null);
        setField(term1923215, term1923215.getClass(), "parent", null);
        setBooleanField(term1923215, term1923215.getClass(), "isWrapped", false);
        setBooleanField(term1923215, term1923215.getClass(), "isLimited", false);
        setField(term1923215, term1923215.getClass(), "limitedContext", null);
        setField(term1923194, term1923194.getClass(), "acc", term1923215);
        setBooleanField(term1923194, term1923194.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term1923194, term1923194.getClass(), "isPosted", true);
        setBooleanField(term1923194, term1923194.getClass(), "isSystemGenerated", true);
        setField(term1923194, term1923194.getClass(), "source", term1923234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term1923194;
        callMethod(klass, "keyTyped", argTypes, term1923193, args);
    }

};


