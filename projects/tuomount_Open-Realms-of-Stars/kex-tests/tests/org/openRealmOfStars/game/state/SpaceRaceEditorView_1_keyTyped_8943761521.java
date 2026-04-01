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

public class SpaceRaceEditorView_1_keyTyped_8943761521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1913617;
     Object term1913618;

    public SpaceRaceEditorView_1_keyTyped_8943761521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1913617 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView$1"));
        setField(term1913617, term1913617.getClass(), "this$0", null);
        term1913618 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term1913630 = (byte[]) newByteArray(4);
        Object term1913637 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1913638 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term1913639 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1913640 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1913641 = (Object[]) newArray("java.security.Principal", 7);
        Object term1913646 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1913656 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term1913618, term1913618.getClass(), "isProxyActive", true);
        setIntField(term1913618, term1913618.getClass(), "keyCode", 1473262792);
        setCharField(term1913618, term1913618.getClass(), "keyChar", 'V');
        setIntField(term1913618, term1913618.getClass(), "keyLocation", 1568016498);
        setLongField(term1913618, term1913618.getClass(), "rawCode", -4822736661741380518L);
        setLongField(term1913618, term1913618.getClass(), "primaryLevelUnicode", -5386201758403679145L);
        setLongField(term1913618, term1913618.getClass(), "scancode", -7268507582722666254L);
        setLongField(term1913618, term1913618.getClass(), "extendedKeyCode", 5671808784468963649L);
        setField(term1913618, term1913618.getClass(), "originalSource", null);
        setLongField(term1913618, term1913618.getClass(), "when", 2297097306706899827L);
        setIntField(term1913618, term1913618.getClass(), "modifiers", -233828990);
        setBooleanField(term1913618, term1913618.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term1913630, 0, (byte) -81);
        setByteElement(term1913630, 1, (byte) -20);
        setByteElement(term1913630, 2, (byte) 115);
        setByteElement(term1913630, 3, (byte) -43);
        setField(term1913618, term1913618.getClass(), "bdata", term1913630);
        setIntField(term1913618, term1913618.getClass(), "id", 301893421);
        setBooleanField(term1913618, term1913618.getClass(), "consumed", false);
        setField(term1913640, term1913640.getClass(), "location", null);
        setField(term1913640, term1913640.getClass(), "signers", null);
        setField(term1913640, term1913640.getClass(), "certs", null);
        setField(term1913640, term1913640.getClass(), "sp", null);
        setField(term1913640, term1913640.getClass(), "factory", null);
        setField(term1913640, term1913640.getClass(), "locationNoFragString", null);
        setField(term1913639, term1913639.getClass(), "codesource", term1913640);
        setField(term1913639, term1913639.getClass(), "classloader", null);
        setField(term1913639, term1913639.getClass(), "principals", term1913641);
        setField(term1913639, term1913639.getClass(), "permissions", null);
        setBooleanField(term1913639, term1913639.getClass(), "hasAllPerm", false);
        setBooleanField(term1913639, term1913639.getClass(), "staticPermissions", false);
        setField(term1913639, term1913639.getClass(), "key", null);
        setElement(term1913638, 0, term1913639);
        setField(term1913637, term1913637.getClass(), "context", term1913638);
        setBooleanField(term1913637, term1913637.getClass(), "isPrivileged", false);
        setBooleanField(term1913637, term1913637.getClass(), "isAuthorized", true);
        setField(term1913646, term1913646.getClass(), "context", null);
        setBooleanField(term1913646, term1913646.getClass(), "isPrivileged", false);
        setBooleanField(term1913646, term1913646.getClass(), "isAuthorized", false);
        setField(term1913646, term1913646.getClass(), "privilegedContext", null);
        setField(term1913646, term1913646.getClass(), "combiner", null);
        setField(term1913646, term1913646.getClass(), "permissions", null);
        setField(term1913646, term1913646.getClass(), "parent", null);
        setBooleanField(term1913646, term1913646.getClass(), "isWrapped", false);
        setBooleanField(term1913646, term1913646.getClass(), "isLimited", false);
        setField(term1913646, term1913646.getClass(), "limitedContext", null);
        setField(term1913637, term1913637.getClass(), "privilegedContext", term1913646);
        setField(term1913637, term1913637.getClass(), "combiner", null);
        setField(term1913637, term1913637.getClass(), "permissions", null);
        setField(term1913637, term1913637.getClass(), "parent", null);
        setBooleanField(term1913637, term1913637.getClass(), "isWrapped", false);
        setBooleanField(term1913637, term1913637.getClass(), "isLimited", false);
        setField(term1913637, term1913637.getClass(), "limitedContext", null);
        setField(term1913618, term1913618.getClass(), "acc", term1913637);
        setBooleanField(term1913618, term1913618.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term1913618, term1913618.getClass(), "isPosted", false);
        setBooleanField(term1913618, term1913618.getClass(), "isSystemGenerated", true);
        setField(term1913618, term1913618.getClass(), "source", term1913656);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term1913618;
        callMethod(klass, "keyTyped", argTypes, term1913617, args);
    }

};


