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

public class GovernmentEditorView_1_keyReleased_13738823272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1915228;
     Object term1915229;

    public GovernmentEditorView_1_keyReleased_13738823272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1915228 = newInstance(Class.forName("org.openRealmOfStars.game.state.GovernmentEditorView$1"));
        setField(term1915228, term1915228.getClass(), "this$0", null);
        term1915229 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term1915241 = (byte[]) newByteArray(9);
        Object term1915253 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1915254 = (Object[]) newArray("java.security.ProtectionDomain", 3);
        Object term1915255 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1915256 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1915257 = (Object[]) newArray("java.security.Principal", 2);
        Object term1915260 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1915263 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1915268 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1915278 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term1915229, term1915229.getClass(), "isProxyActive", false);
        setIntField(term1915229, term1915229.getClass(), "keyCode", -919729492);
        setCharField(term1915229, term1915229.getClass(), "keyChar", 'y');
        setIntField(term1915229, term1915229.getClass(), "keyLocation", -1259979407);
        setLongField(term1915229, term1915229.getClass(), "rawCode", 7495904023107549024L);
        setLongField(term1915229, term1915229.getClass(), "primaryLevelUnicode", 8802866251294305945L);
        setLongField(term1915229, term1915229.getClass(), "scancode", 4513004407927379358L);
        setLongField(term1915229, term1915229.getClass(), "extendedKeyCode", -7115418542247301000L);
        setField(term1915229, term1915229.getClass(), "originalSource", null);
        setLongField(term1915229, term1915229.getClass(), "when", 8034714140377562739L);
        setIntField(term1915229, term1915229.getClass(), "modifiers", 1736725022);
        setBooleanField(term1915229, term1915229.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term1915241, 0, (byte) 29);
        setByteElement(term1915241, 1, (byte) -60);
        setByteElement(term1915241, 2, (byte) -4);
        setByteElement(term1915241, 3, (byte) -59);
        setByteElement(term1915241, 4, (byte) 54);
        setByteElement(term1915241, 5, (byte) 12);
        setByteElement(term1915241, 6, (byte) 117);
        setByteElement(term1915241, 7, (byte) -26);
        setByteElement(term1915241, 8, (byte) 48);
        setField(term1915229, term1915229.getClass(), "bdata", term1915241);
        setIntField(term1915229, term1915229.getClass(), "id", 1783634209);
        setBooleanField(term1915229, term1915229.getClass(), "consumed", true);
        setField(term1915256, term1915256.getClass(), "location", null);
        setField(term1915256, term1915256.getClass(), "signers", null);
        setField(term1915256, term1915256.getClass(), "certs", null);
        setField(term1915256, term1915256.getClass(), "sp", null);
        setField(term1915256, term1915256.getClass(), "factory", null);
        setField(term1915256, term1915256.getClass(), "locationNoFragString", null);
        setField(term1915255, term1915255.getClass(), "codesource", term1915256);
        setField(term1915255, term1915255.getClass(), "classloader", null);
        setField(term1915255, term1915255.getClass(), "principals", term1915257);
        setField(term1915255, term1915255.getClass(), "permissions", null);
        setBooleanField(term1915255, term1915255.getClass(), "hasAllPerm", false);
        setBooleanField(term1915255, term1915255.getClass(), "staticPermissions", false);
        setField(term1915255, term1915255.getClass(), "key", null);
        setElement(term1915254, 0, term1915255);
        setField(term1915260, term1915260.getClass(), "codesource", null);
        setField(term1915260, term1915260.getClass(), "classloader", null);
        setField(term1915260, term1915260.getClass(), "principals", null);
        setField(term1915260, term1915260.getClass(), "permissions", null);
        setBooleanField(term1915260, term1915260.getClass(), "hasAllPerm", false);
        setBooleanField(term1915260, term1915260.getClass(), "staticPermissions", false);
        setField(term1915260, term1915260.getClass(), "key", null);
        setElement(term1915254, 1, term1915260);
        setField(term1915263, term1915263.getClass(), "codesource", null);
        setField(term1915263, term1915263.getClass(), "classloader", null);
        setField(term1915263, term1915263.getClass(), "principals", null);
        setField(term1915263, term1915263.getClass(), "permissions", null);
        setBooleanField(term1915263, term1915263.getClass(), "hasAllPerm", false);
        setBooleanField(term1915263, term1915263.getClass(), "staticPermissions", false);
        setField(term1915263, term1915263.getClass(), "key", null);
        setElement(term1915254, 2, term1915263);
        setField(term1915253, term1915253.getClass(), "context", term1915254);
        setBooleanField(term1915253, term1915253.getClass(), "isPrivileged", true);
        setBooleanField(term1915253, term1915253.getClass(), "isAuthorized", false);
        setField(term1915268, term1915268.getClass(), "context", null);
        setBooleanField(term1915268, term1915268.getClass(), "isPrivileged", false);
        setBooleanField(term1915268, term1915268.getClass(), "isAuthorized", false);
        setField(term1915268, term1915268.getClass(), "privilegedContext", null);
        setField(term1915268, term1915268.getClass(), "combiner", null);
        setField(term1915268, term1915268.getClass(), "permissions", null);
        setField(term1915268, term1915268.getClass(), "parent", null);
        setBooleanField(term1915268, term1915268.getClass(), "isWrapped", false);
        setBooleanField(term1915268, term1915268.getClass(), "isLimited", false);
        setField(term1915268, term1915268.getClass(), "limitedContext", null);
        setField(term1915253, term1915253.getClass(), "privilegedContext", term1915268);
        setField(term1915253, term1915253.getClass(), "combiner", null);
        setField(term1915253, term1915253.getClass(), "permissions", null);
        setField(term1915253, term1915253.getClass(), "parent", null);
        setBooleanField(term1915253, term1915253.getClass(), "isWrapped", false);
        setBooleanField(term1915253, term1915253.getClass(), "isLimited", false);
        setField(term1915253, term1915253.getClass(), "limitedContext", null);
        setField(term1915229, term1915229.getClass(), "acc", term1915253);
        setBooleanField(term1915229, term1915229.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term1915229, term1915229.getClass(), "isPosted", false);
        setBooleanField(term1915229, term1915229.getClass(), "isSystemGenerated", false);
        setField(term1915229, term1915229.getClass(), "source", term1915278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.GovernmentEditorView$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term1915229;
        callMethod(klass, "keyReleased", argTypes, term1915228, args);
    }

};


