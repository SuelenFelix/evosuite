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

public class ShipDesignView_2_keyReleased_20741818623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1923241;
     Object term1923242;

    public ShipDesignView_2_keyReleased_20741818623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1923241 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView$2"));
        setField(term1923241, term1923241.getClass(), "this$0", null);
        term1923242 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term1923254 = (byte[]) newByteArray(2);
        Object term1923259 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1923260 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term1923261 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923262 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1923263 = (Object[]) newArray("java.security.Principal", 9);
        Object term1923266 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923269 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923272 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923275 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923278 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1923283 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1923293 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term1923242, term1923242.getClass(), "isProxyActive", true);
        setIntField(term1923242, term1923242.getClass(), "keyCode", 1894969827);
        setCharField(term1923242, term1923242.getClass(), "keyChar", 'j');
        setIntField(term1923242, term1923242.getClass(), "keyLocation", -833122149);
        setLongField(term1923242, term1923242.getClass(), "rawCode", 1457594663983990440L);
        setLongField(term1923242, term1923242.getClass(), "primaryLevelUnicode", 3452833434644634217L);
        setLongField(term1923242, term1923242.getClass(), "scancode", -8603648071751666348L);
        setLongField(term1923242, term1923242.getClass(), "extendedKeyCode", -7884871963229073324L);
        setField(term1923242, term1923242.getClass(), "originalSource", null);
        setLongField(term1923242, term1923242.getClass(), "when", -8649738738252714180L);
        setIntField(term1923242, term1923242.getClass(), "modifiers", -786573126);
        setBooleanField(term1923242, term1923242.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term1923254, 0, (byte) 122);
        setByteElement(term1923254, 1, (byte) -65);
        setField(term1923242, term1923242.getClass(), "bdata", term1923254);
        setIntField(term1923242, term1923242.getClass(), "id", 339617241);
        setBooleanField(term1923242, term1923242.getClass(), "consumed", false);
        setField(term1923262, term1923262.getClass(), "location", null);
        setField(term1923262, term1923262.getClass(), "signers", null);
        setField(term1923262, term1923262.getClass(), "certs", null);
        setField(term1923262, term1923262.getClass(), "sp", null);
        setField(term1923262, term1923262.getClass(), "factory", null);
        setField(term1923262, term1923262.getClass(), "locationNoFragString", null);
        setField(term1923261, term1923261.getClass(), "codesource", term1923262);
        setField(term1923261, term1923261.getClass(), "classloader", null);
        setField(term1923261, term1923261.getClass(), "principals", term1923263);
        setField(term1923261, term1923261.getClass(), "permissions", null);
        setBooleanField(term1923261, term1923261.getClass(), "hasAllPerm", false);
        setBooleanField(term1923261, term1923261.getClass(), "staticPermissions", false);
        setField(term1923261, term1923261.getClass(), "key", null);
        setElement(term1923260, 0, term1923261);
        setField(term1923266, term1923266.getClass(), "codesource", null);
        setField(term1923266, term1923266.getClass(), "classloader", null);
        setField(term1923266, term1923266.getClass(), "principals", null);
        setField(term1923266, term1923266.getClass(), "permissions", null);
        setBooleanField(term1923266, term1923266.getClass(), "hasAllPerm", false);
        setBooleanField(term1923266, term1923266.getClass(), "staticPermissions", false);
        setField(term1923266, term1923266.getClass(), "key", null);
        setElement(term1923260, 1, term1923266);
        setField(term1923269, term1923269.getClass(), "codesource", null);
        setField(term1923269, term1923269.getClass(), "classloader", null);
        setField(term1923269, term1923269.getClass(), "principals", null);
        setField(term1923269, term1923269.getClass(), "permissions", null);
        setBooleanField(term1923269, term1923269.getClass(), "hasAllPerm", false);
        setBooleanField(term1923269, term1923269.getClass(), "staticPermissions", false);
        setField(term1923269, term1923269.getClass(), "key", null);
        setElement(term1923260, 2, term1923269);
        setField(term1923272, term1923272.getClass(), "codesource", null);
        setField(term1923272, term1923272.getClass(), "classloader", null);
        setField(term1923272, term1923272.getClass(), "principals", null);
        setField(term1923272, term1923272.getClass(), "permissions", null);
        setBooleanField(term1923272, term1923272.getClass(), "hasAllPerm", false);
        setBooleanField(term1923272, term1923272.getClass(), "staticPermissions", false);
        setField(term1923272, term1923272.getClass(), "key", null);
        setElement(term1923260, 3, term1923272);
        setField(term1923275, term1923275.getClass(), "codesource", null);
        setField(term1923275, term1923275.getClass(), "classloader", null);
        setField(term1923275, term1923275.getClass(), "principals", null);
        setField(term1923275, term1923275.getClass(), "permissions", null);
        setBooleanField(term1923275, term1923275.getClass(), "hasAllPerm", false);
        setBooleanField(term1923275, term1923275.getClass(), "staticPermissions", false);
        setField(term1923275, term1923275.getClass(), "key", null);
        setElement(term1923260, 4, term1923275);
        setField(term1923278, term1923278.getClass(), "codesource", null);
        setField(term1923278, term1923278.getClass(), "classloader", null);
        setField(term1923278, term1923278.getClass(), "principals", null);
        setField(term1923278, term1923278.getClass(), "permissions", null);
        setBooleanField(term1923278, term1923278.getClass(), "hasAllPerm", false);
        setBooleanField(term1923278, term1923278.getClass(), "staticPermissions", false);
        setField(term1923278, term1923278.getClass(), "key", null);
        setElement(term1923260, 5, term1923278);
        setField(term1923259, term1923259.getClass(), "context", term1923260);
        setBooleanField(term1923259, term1923259.getClass(), "isPrivileged", false);
        setBooleanField(term1923259, term1923259.getClass(), "isAuthorized", true);
        setField(term1923283, term1923283.getClass(), "context", null);
        setBooleanField(term1923283, term1923283.getClass(), "isPrivileged", false);
        setBooleanField(term1923283, term1923283.getClass(), "isAuthorized", false);
        setField(term1923283, term1923283.getClass(), "privilegedContext", null);
        setField(term1923283, term1923283.getClass(), "combiner", null);
        setField(term1923283, term1923283.getClass(), "permissions", null);
        setField(term1923283, term1923283.getClass(), "parent", null);
        setBooleanField(term1923283, term1923283.getClass(), "isWrapped", false);
        setBooleanField(term1923283, term1923283.getClass(), "isLimited", false);
        setField(term1923283, term1923283.getClass(), "limitedContext", null);
        setField(term1923259, term1923259.getClass(), "privilegedContext", term1923283);
        setField(term1923259, term1923259.getClass(), "combiner", null);
        setField(term1923259, term1923259.getClass(), "permissions", null);
        setField(term1923259, term1923259.getClass(), "parent", null);
        setBooleanField(term1923259, term1923259.getClass(), "isWrapped", false);
        setBooleanField(term1923259, term1923259.getClass(), "isLimited", false);
        setField(term1923259, term1923259.getClass(), "limitedContext", null);
        setField(term1923242, term1923242.getClass(), "acc", term1923259);
        setBooleanField(term1923242, term1923242.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term1923242, term1923242.getClass(), "isPosted", false);
        setBooleanField(term1923242, term1923242.getClass(), "isSystemGenerated", true);
        setField(term1923242, term1923242.getClass(), "source", term1923293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term1923242;
        callMethod(klass, "keyReleased", argTypes, term1923241, args);
    }

};


