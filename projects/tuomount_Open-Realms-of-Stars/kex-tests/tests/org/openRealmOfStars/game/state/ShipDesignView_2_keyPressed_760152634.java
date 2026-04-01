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

public class ShipDesignView_2_keyPressed_760152634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1923296;
     Object term1923297;

    public ShipDesignView_2_keyPressed_760152634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1923296 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView$2"));
        setField(term1923296, term1923296.getClass(), "this$0", null);
        term1923297 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term1923309 = (byte[]) newByteArray(3);
        Object term1923315 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1923316 = (Object[]) newArray("java.security.ProtectionDomain", 9);
        Object term1923317 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923318 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1923319 = (Object[]) newArray("java.security.Principal", 0);
        Object term1923322 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923325 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923328 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923331 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923334 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923337 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923340 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923343 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923348 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1923358 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term1923297, term1923297.getClass(), "isProxyActive", false);
        setIntField(term1923297, term1923297.getClass(), "keyCode", -1258970175);
        setCharField(term1923297, term1923297.getClass(), "keyChar", 'G');
        setIntField(term1923297, term1923297.getClass(), "keyLocation", -1056616196);
        setLongField(term1923297, term1923297.getClass(), "rawCode", -7278883608542636188L);
        setLongField(term1923297, term1923297.getClass(), "primaryLevelUnicode", -1539859611880912454L);
        setLongField(term1923297, term1923297.getClass(), "scancode", 4100236067313034103L);
        setLongField(term1923297, term1923297.getClass(), "extendedKeyCode", 1195529027276497124L);
        setField(term1923297, term1923297.getClass(), "originalSource", null);
        setLongField(term1923297, term1923297.getClass(), "when", -2783999800714825789L);
        setIntField(term1923297, term1923297.getClass(), "modifiers", -1071708865);
        setBooleanField(term1923297, term1923297.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term1923309, 0, (byte) -67);
        setByteElement(term1923309, 1, (byte) -87);
        setByteElement(term1923309, 2, (byte) -92);
        setField(term1923297, term1923297.getClass(), "bdata", term1923309);
        setIntField(term1923297, term1923297.getClass(), "id", 1677741862);
        setBooleanField(term1923297, term1923297.getClass(), "consumed", false);
        setField(term1923318, term1923318.getClass(), "location", null);
        setField(term1923318, term1923318.getClass(), "signers", null);
        setField(term1923318, term1923318.getClass(), "certs", null);
        setField(term1923318, term1923318.getClass(), "sp", null);
        setField(term1923318, term1923318.getClass(), "factory", null);
        setField(term1923318, term1923318.getClass(), "locationNoFragString", null);
        setField(term1923317, term1923317.getClass(), "codesource", term1923318);
        setField(term1923317, term1923317.getClass(), "classloader", null);
        setField(term1923317, term1923317.getClass(), "principals", term1923319);
        setField(term1923317, term1923317.getClass(), "permissions", null);
        setBooleanField(term1923317, term1923317.getClass(), "hasAllPerm", false);
        setBooleanField(term1923317, term1923317.getClass(), "staticPermissions", false);
        setField(term1923317, term1923317.getClass(), "key", null);
        setElement(term1923316, 0, term1923317);
        setField(term1923322, term1923322.getClass(), "codesource", null);
        setField(term1923322, term1923322.getClass(), "classloader", null);
        setField(term1923322, term1923322.getClass(), "principals", null);
        setField(term1923322, term1923322.getClass(), "permissions", null);
        setBooleanField(term1923322, term1923322.getClass(), "hasAllPerm", false);
        setBooleanField(term1923322, term1923322.getClass(), "staticPermissions", false);
        setField(term1923322, term1923322.getClass(), "key", null);
        setElement(term1923316, 1, term1923322);
        setField(term1923325, term1923325.getClass(), "codesource", null);
        setField(term1923325, term1923325.getClass(), "classloader", null);
        setField(term1923325, term1923325.getClass(), "principals", null);
        setField(term1923325, term1923325.getClass(), "permissions", null);
        setBooleanField(term1923325, term1923325.getClass(), "hasAllPerm", false);
        setBooleanField(term1923325, term1923325.getClass(), "staticPermissions", false);
        setField(term1923325, term1923325.getClass(), "key", null);
        setElement(term1923316, 2, term1923325);
        setField(term1923328, term1923328.getClass(), "codesource", null);
        setField(term1923328, term1923328.getClass(), "classloader", null);
        setField(term1923328, term1923328.getClass(), "principals", null);
        setField(term1923328, term1923328.getClass(), "permissions", null);
        setBooleanField(term1923328, term1923328.getClass(), "hasAllPerm", false);
        setBooleanField(term1923328, term1923328.getClass(), "staticPermissions", false);
        setField(term1923328, term1923328.getClass(), "key", null);
        setElement(term1923316, 3, term1923328);
        setField(term1923331, term1923331.getClass(), "codesource", null);
        setField(term1923331, term1923331.getClass(), "classloader", null);
        setField(term1923331, term1923331.getClass(), "principals", null);
        setField(term1923331, term1923331.getClass(), "permissions", null);
        setBooleanField(term1923331, term1923331.getClass(), "hasAllPerm", false);
        setBooleanField(term1923331, term1923331.getClass(), "staticPermissions", false);
        setField(term1923331, term1923331.getClass(), "key", null);
        setElement(term1923316, 4, term1923331);
        setField(term1923334, term1923334.getClass(), "codesource", null);
        setField(term1923334, term1923334.getClass(), "classloader", null);
        setField(term1923334, term1923334.getClass(), "principals", null);
        setField(term1923334, term1923334.getClass(), "permissions", null);
        setBooleanField(term1923334, term1923334.getClass(), "hasAllPerm", false);
        setBooleanField(term1923334, term1923334.getClass(), "staticPermissions", false);
        setField(term1923334, term1923334.getClass(), "key", null);
        setElement(term1923316, 5, term1923334);
        setField(term1923337, term1923337.getClass(), "codesource", null);
        setField(term1923337, term1923337.getClass(), "classloader", null);
        setField(term1923337, term1923337.getClass(), "principals", null);
        setField(term1923337, term1923337.getClass(), "permissions", null);
        setBooleanField(term1923337, term1923337.getClass(), "hasAllPerm", false);
        setBooleanField(term1923337, term1923337.getClass(), "staticPermissions", false);
        setField(term1923337, term1923337.getClass(), "key", null);
        setElement(term1923316, 6, term1923337);
        setField(term1923340, term1923340.getClass(), "codesource", null);
        setField(term1923340, term1923340.getClass(), "classloader", null);
        setField(term1923340, term1923340.getClass(), "principals", null);
        setField(term1923340, term1923340.getClass(), "permissions", null);
        setBooleanField(term1923340, term1923340.getClass(), "hasAllPerm", false);
        setBooleanField(term1923340, term1923340.getClass(), "staticPermissions", false);
        setField(term1923340, term1923340.getClass(), "key", null);
        setElement(term1923316, 7, term1923340);
        setField(term1923343, term1923343.getClass(), "codesource", null);
        setField(term1923343, term1923343.getClass(), "classloader", null);
        setField(term1923343, term1923343.getClass(), "principals", null);
        setField(term1923343, term1923343.getClass(), "permissions", null);
        setBooleanField(term1923343, term1923343.getClass(), "hasAllPerm", false);
        setBooleanField(term1923343, term1923343.getClass(), "staticPermissions", false);
        setField(term1923343, term1923343.getClass(), "key", null);
        setElement(term1923316, 8, term1923343);
        setField(term1923315, term1923315.getClass(), "context", term1923316);
        setBooleanField(term1923315, term1923315.getClass(), "isPrivileged", true);
        setBooleanField(term1923315, term1923315.getClass(), "isAuthorized", false);
        setField(term1923348, term1923348.getClass(), "context", null);
        setBooleanField(term1923348, term1923348.getClass(), "isPrivileged", false);
        setBooleanField(term1923348, term1923348.getClass(), "isAuthorized", false);
        setField(term1923348, term1923348.getClass(), "privilegedContext", null);
        setField(term1923348, term1923348.getClass(), "combiner", null);
        setField(term1923348, term1923348.getClass(), "permissions", null);
        setField(term1923348, term1923348.getClass(), "parent", null);
        setBooleanField(term1923348, term1923348.getClass(), "isWrapped", false);
        setBooleanField(term1923348, term1923348.getClass(), "isLimited", false);
        setField(term1923348, term1923348.getClass(), "limitedContext", null);
        setField(term1923315, term1923315.getClass(), "privilegedContext", term1923348);
        setField(term1923315, term1923315.getClass(), "combiner", null);
        setField(term1923315, term1923315.getClass(), "permissions", null);
        setField(term1923315, term1923315.getClass(), "parent", null);
        setBooleanField(term1923315, term1923315.getClass(), "isWrapped", false);
        setBooleanField(term1923315, term1923315.getClass(), "isLimited", false);
        setField(term1923315, term1923315.getClass(), "limitedContext", null);
        setField(term1923297, term1923297.getClass(), "acc", term1923315);
        setBooleanField(term1923297, term1923297.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term1923297, term1923297.getClass(), "isPosted", true);
        setBooleanField(term1923297, term1923297.getClass(), "isSystemGenerated", true);
        setField(term1923297, term1923297.getClass(), "source", term1923358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term1923297;
        callMethod(klass, "keyPressed", argTypes, term1923296, args);
    }

};


