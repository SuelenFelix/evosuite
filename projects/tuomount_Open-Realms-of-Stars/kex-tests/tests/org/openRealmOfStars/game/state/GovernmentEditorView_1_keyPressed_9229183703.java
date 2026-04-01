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

public class GovernmentEditorView_1_keyPressed_9229183703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1915288;
     Object term1915289;

    public GovernmentEditorView_1_keyPressed_9229183703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1915288 = newInstance(Class.forName("org.openRealmOfStars.game.state.GovernmentEditorView$1"));
        setField(term1915288, term1915288.getClass(), "this$0", null);
        term1915289 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term1915301 = (byte[]) newByteArray(9);
        Object term1915313 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1915314 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term1915315 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1915316 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1915317 = (Object[]) newArray("java.security.Principal", 7);
        Object term1915320 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1915323 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1915326 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1915329 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1915334 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1915344 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term1915289, term1915289.getClass(), "isProxyActive", true);
        setIntField(term1915289, term1915289.getClass(), "keyCode", 713686802);
        setCharField(term1915289, term1915289.getClass(), "keyChar", 'S');
        setIntField(term1915289, term1915289.getClass(), "keyLocation", -964895850);
        setLongField(term1915289, term1915289.getClass(), "rawCode", -2924531382671518368L);
        setLongField(term1915289, term1915289.getClass(), "primaryLevelUnicode", -3948863953565024517L);
        setLongField(term1915289, term1915289.getClass(), "scancode", -6587807377747738663L);
        setLongField(term1915289, term1915289.getClass(), "extendedKeyCode", -6301101997917060727L);
        setField(term1915289, term1915289.getClass(), "originalSource", null);
        setLongField(term1915289, term1915289.getClass(), "when", 8166095254618543564L);
        setIntField(term1915289, term1915289.getClass(), "modifiers", 827967355);
        setBooleanField(term1915289, term1915289.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term1915301, 0, (byte) 99);
        setByteElement(term1915301, 1, (byte) 13);
        setByteElement(term1915301, 2, (byte) 13);
        setByteElement(term1915301, 3, (byte) 118);
        setByteElement(term1915301, 4, (byte) 24);
        setByteElement(term1915301, 5, (byte) -1);
        setByteElement(term1915301, 6, (byte) -117);
        setByteElement(term1915301, 7, (byte) 125);
        setByteElement(term1915301, 8, (byte) 50);
        setField(term1915289, term1915289.getClass(), "bdata", term1915301);
        setIntField(term1915289, term1915289.getClass(), "id", 163156503);
        setBooleanField(term1915289, term1915289.getClass(), "consumed", false);
        setField(term1915316, term1915316.getClass(), "location", null);
        setField(term1915316, term1915316.getClass(), "signers", null);
        setField(term1915316, term1915316.getClass(), "certs", null);
        setField(term1915316, term1915316.getClass(), "sp", null);
        setField(term1915316, term1915316.getClass(), "factory", null);
        setField(term1915316, term1915316.getClass(), "locationNoFragString", null);
        setField(term1915315, term1915315.getClass(), "codesource", term1915316);
        setField(term1915315, term1915315.getClass(), "classloader", null);
        setField(term1915315, term1915315.getClass(), "principals", term1915317);
        setField(term1915315, term1915315.getClass(), "permissions", null);
        setBooleanField(term1915315, term1915315.getClass(), "hasAllPerm", false);
        setBooleanField(term1915315, term1915315.getClass(), "staticPermissions", false);
        setField(term1915315, term1915315.getClass(), "key", null);
        setElement(term1915314, 0, term1915315);
        setField(term1915320, term1915320.getClass(), "codesource", null);
        setField(term1915320, term1915320.getClass(), "classloader", null);
        setField(term1915320, term1915320.getClass(), "principals", null);
        setField(term1915320, term1915320.getClass(), "permissions", null);
        setBooleanField(term1915320, term1915320.getClass(), "hasAllPerm", false);
        setBooleanField(term1915320, term1915320.getClass(), "staticPermissions", false);
        setField(term1915320, term1915320.getClass(), "key", null);
        setElement(term1915314, 1, term1915320);
        setField(term1915323, term1915323.getClass(), "codesource", null);
        setField(term1915323, term1915323.getClass(), "classloader", null);
        setField(term1915323, term1915323.getClass(), "principals", null);
        setField(term1915323, term1915323.getClass(), "permissions", null);
        setBooleanField(term1915323, term1915323.getClass(), "hasAllPerm", false);
        setBooleanField(term1915323, term1915323.getClass(), "staticPermissions", false);
        setField(term1915323, term1915323.getClass(), "key", null);
        setElement(term1915314, 2, term1915323);
        setField(term1915326, term1915326.getClass(), "codesource", null);
        setField(term1915326, term1915326.getClass(), "classloader", null);
        setField(term1915326, term1915326.getClass(), "principals", null);
        setField(term1915326, term1915326.getClass(), "permissions", null);
        setBooleanField(term1915326, term1915326.getClass(), "hasAllPerm", false);
        setBooleanField(term1915326, term1915326.getClass(), "staticPermissions", false);
        setField(term1915326, term1915326.getClass(), "key", null);
        setElement(term1915314, 3, term1915326);
        setField(term1915329, term1915329.getClass(), "codesource", null);
        setField(term1915329, term1915329.getClass(), "classloader", null);
        setField(term1915329, term1915329.getClass(), "principals", null);
        setField(term1915329, term1915329.getClass(), "permissions", null);
        setBooleanField(term1915329, term1915329.getClass(), "hasAllPerm", false);
        setBooleanField(term1915329, term1915329.getClass(), "staticPermissions", false);
        setField(term1915329, term1915329.getClass(), "key", null);
        setElement(term1915314, 4, term1915329);
        setField(term1915313, term1915313.getClass(), "context", term1915314);
        setBooleanField(term1915313, term1915313.getClass(), "isPrivileged", true);
        setBooleanField(term1915313, term1915313.getClass(), "isAuthorized", false);
        setField(term1915334, term1915334.getClass(), "context", null);
        setBooleanField(term1915334, term1915334.getClass(), "isPrivileged", false);
        setBooleanField(term1915334, term1915334.getClass(), "isAuthorized", false);
        setField(term1915334, term1915334.getClass(), "privilegedContext", null);
        setField(term1915334, term1915334.getClass(), "combiner", null);
        setField(term1915334, term1915334.getClass(), "permissions", null);
        setField(term1915334, term1915334.getClass(), "parent", null);
        setBooleanField(term1915334, term1915334.getClass(), "isWrapped", false);
        setBooleanField(term1915334, term1915334.getClass(), "isLimited", false);
        setField(term1915334, term1915334.getClass(), "limitedContext", null);
        setField(term1915313, term1915313.getClass(), "privilegedContext", term1915334);
        setField(term1915313, term1915313.getClass(), "combiner", null);
        setField(term1915313, term1915313.getClass(), "permissions", null);
        setField(term1915313, term1915313.getClass(), "parent", null);
        setBooleanField(term1915313, term1915313.getClass(), "isWrapped", false);
        setBooleanField(term1915313, term1915313.getClass(), "isLimited", false);
        setField(term1915313, term1915313.getClass(), "limitedContext", null);
        setField(term1915289, term1915289.getClass(), "acc", term1915313);
        setBooleanField(term1915289, term1915289.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term1915289, term1915289.getClass(), "isPosted", false);
        setBooleanField(term1915289, term1915289.getClass(), "isSystemGenerated", true);
        setField(term1915289, term1915289.getClass(), "source", term1915344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.GovernmentEditorView$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term1915289;
        callMethod(klass, "keyPressed", argTypes, term1915288, args);
    }

};


