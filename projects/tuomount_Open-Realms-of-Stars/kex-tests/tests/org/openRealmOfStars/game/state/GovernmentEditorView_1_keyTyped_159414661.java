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

public class GovernmentEditorView_1_keyTyped_159414661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1915181;
     Object term1915182;

    public GovernmentEditorView_1_keyTyped_159414661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1915181 = newInstance(Class.forName("org.openRealmOfStars.game.state.GovernmentEditorView$1"));
        setField(term1915181, term1915181.getClass(), "this$0", null);
        term1915182 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term1915194 = (byte[]) newByteArray(4);
        Object term1915201 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1915202 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term1915203 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1915204 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1915205 = (Object[]) newArray("java.security.Principal", 9);
        Object term1915208 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1915213 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1915223 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term1915182, term1915182.getClass(), "isProxyActive", false);
        setIntField(term1915182, term1915182.getClass(), "keyCode", -174289690);
        setCharField(term1915182, term1915182.getClass(), "keyChar", 'T');
        setIntField(term1915182, term1915182.getClass(), "keyLocation", -894043716);
        setLongField(term1915182, term1915182.getClass(), "rawCode", 7489064039921396098L);
        setLongField(term1915182, term1915182.getClass(), "primaryLevelUnicode", 6843866297465638866L);
        setLongField(term1915182, term1915182.getClass(), "scancode", -4023935540989049732L);
        setLongField(term1915182, term1915182.getClass(), "extendedKeyCode", 855932984568615096L);
        setField(term1915182, term1915182.getClass(), "originalSource", null);
        setLongField(term1915182, term1915182.getClass(), "when", -1616722610139554082L);
        setIntField(term1915182, term1915182.getClass(), "modifiers", -1276550791);
        setBooleanField(term1915182, term1915182.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term1915194, 0, (byte) 70);
        setByteElement(term1915194, 2, (byte) 10);
        setByteElement(term1915194, 3, (byte) -16);
        setField(term1915182, term1915182.getClass(), "bdata", term1915194);
        setIntField(term1915182, term1915182.getClass(), "id", -1103681249);
        setBooleanField(term1915182, term1915182.getClass(), "consumed", true);
        setField(term1915204, term1915204.getClass(), "location", null);
        setField(term1915204, term1915204.getClass(), "signers", null);
        setField(term1915204, term1915204.getClass(), "certs", null);
        setField(term1915204, term1915204.getClass(), "sp", null);
        setField(term1915204, term1915204.getClass(), "factory", null);
        setField(term1915204, term1915204.getClass(), "locationNoFragString", null);
        setField(term1915203, term1915203.getClass(), "codesource", term1915204);
        setField(term1915203, term1915203.getClass(), "classloader", null);
        setField(term1915203, term1915203.getClass(), "principals", term1915205);
        setField(term1915203, term1915203.getClass(), "permissions", null);
        setBooleanField(term1915203, term1915203.getClass(), "hasAllPerm", false);
        setBooleanField(term1915203, term1915203.getClass(), "staticPermissions", false);
        setField(term1915203, term1915203.getClass(), "key", null);
        setElement(term1915202, 0, term1915203);
        setField(term1915208, term1915208.getClass(), "codesource", null);
        setField(term1915208, term1915208.getClass(), "classloader", null);
        setField(term1915208, term1915208.getClass(), "principals", null);
        setField(term1915208, term1915208.getClass(), "permissions", null);
        setBooleanField(term1915208, term1915208.getClass(), "hasAllPerm", false);
        setBooleanField(term1915208, term1915208.getClass(), "staticPermissions", false);
        setField(term1915208, term1915208.getClass(), "key", null);
        setElement(term1915202, 1, term1915208);
        setField(term1915201, term1915201.getClass(), "context", term1915202);
        setBooleanField(term1915201, term1915201.getClass(), "isPrivileged", false);
        setBooleanField(term1915201, term1915201.getClass(), "isAuthorized", false);
        setField(term1915213, term1915213.getClass(), "context", null);
        setBooleanField(term1915213, term1915213.getClass(), "isPrivileged", false);
        setBooleanField(term1915213, term1915213.getClass(), "isAuthorized", false);
        setField(term1915213, term1915213.getClass(), "privilegedContext", null);
        setField(term1915213, term1915213.getClass(), "combiner", null);
        setField(term1915213, term1915213.getClass(), "permissions", null);
        setField(term1915213, term1915213.getClass(), "parent", null);
        setBooleanField(term1915213, term1915213.getClass(), "isWrapped", false);
        setBooleanField(term1915213, term1915213.getClass(), "isLimited", false);
        setField(term1915213, term1915213.getClass(), "limitedContext", null);
        setField(term1915201, term1915201.getClass(), "privilegedContext", term1915213);
        setField(term1915201, term1915201.getClass(), "combiner", null);
        setField(term1915201, term1915201.getClass(), "permissions", null);
        setField(term1915201, term1915201.getClass(), "parent", null);
        setBooleanField(term1915201, term1915201.getClass(), "isWrapped", false);
        setBooleanField(term1915201, term1915201.getClass(), "isLimited", false);
        setField(term1915201, term1915201.getClass(), "limitedContext", null);
        setField(term1915182, term1915182.getClass(), "acc", term1915201);
        setBooleanField(term1915182, term1915182.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term1915182, term1915182.getClass(), "isPosted", true);
        setBooleanField(term1915182, term1915182.getClass(), "isSystemGenerated", false);
        setField(term1915182, term1915182.getClass(), "source", term1915223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.GovernmentEditorView$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term1915182;
        callMethod(klass, "keyTyped", argTypes, term1915181, args);
    }

};


