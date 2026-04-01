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

public class HelpView_1_keyTyped_4962558052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83607;
     Object term83608;

    public HelpView_1_keyTyped_4962558052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83607 = newInstance(Class.forName("org.openRealmOfStars.game.state.HelpView$1"));
        setField(term83607, term83607.getClass(), "this$0", null);
        term83608 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term83620 = (byte[]) newByteArray(2);
        Object term83625 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term83626 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term83627 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83628 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term83629 = (Object[]) newArray("java.security.Principal", 3);
        Object term83634 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term83644 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term83608, term83608.getClass(), "isProxyActive", false);
        setIntField(term83608, term83608.getClass(), "keyCode", 804113142);
        setCharField(term83608, term83608.getClass(), "keyChar", 'A');
        setIntField(term83608, term83608.getClass(), "keyLocation", 1426555916);
        setLongField(term83608, term83608.getClass(), "rawCode", 6375119433582206027L);
        setLongField(term83608, term83608.getClass(), "primaryLevelUnicode", -8257434502486459194L);
        setLongField(term83608, term83608.getClass(), "scancode", -8400487765614892086L);
        setLongField(term83608, term83608.getClass(), "extendedKeyCode", 5270370404989704783L);
        setField(term83608, term83608.getClass(), "originalSource", null);
        setLongField(term83608, term83608.getClass(), "when", 7411271909051562686L);
        setIntField(term83608, term83608.getClass(), "modifiers", 96582503);
        setBooleanField(term83608, term83608.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term83620, 0, (byte) 44);
        setByteElement(term83620, 1, (byte) -66);
        setField(term83608, term83608.getClass(), "bdata", term83620);
        setIntField(term83608, term83608.getClass(), "id", -2078044123);
        setBooleanField(term83608, term83608.getClass(), "consumed", false);
        setField(term83628, term83628.getClass(), "location", null);
        setField(term83628, term83628.getClass(), "signers", null);
        setField(term83628, term83628.getClass(), "certs", null);
        setField(term83628, term83628.getClass(), "sp", null);
        setField(term83628, term83628.getClass(), "factory", null);
        setField(term83628, term83628.getClass(), "locationNoFragString", null);
        setField(term83627, term83627.getClass(), "codesource", term83628);
        setField(term83627, term83627.getClass(), "classloader", null);
        setField(term83627, term83627.getClass(), "principals", term83629);
        setField(term83627, term83627.getClass(), "permissions", null);
        setBooleanField(term83627, term83627.getClass(), "hasAllPerm", false);
        setBooleanField(term83627, term83627.getClass(), "staticPermissions", false);
        setField(term83627, term83627.getClass(), "key", null);
        setElement(term83626, 0, term83627);
        setField(term83625, term83625.getClass(), "context", term83626);
        setBooleanField(term83625, term83625.getClass(), "isPrivileged", true);
        setBooleanField(term83625, term83625.getClass(), "isAuthorized", false);
        setField(term83634, term83634.getClass(), "context", null);
        setBooleanField(term83634, term83634.getClass(), "isPrivileged", false);
        setBooleanField(term83634, term83634.getClass(), "isAuthorized", false);
        setField(term83634, term83634.getClass(), "privilegedContext", null);
        setField(term83634, term83634.getClass(), "combiner", null);
        setField(term83634, term83634.getClass(), "permissions", null);
        setField(term83634, term83634.getClass(), "parent", null);
        setBooleanField(term83634, term83634.getClass(), "isWrapped", false);
        setBooleanField(term83634, term83634.getClass(), "isLimited", false);
        setField(term83634, term83634.getClass(), "limitedContext", null);
        setField(term83625, term83625.getClass(), "privilegedContext", term83634);
        setField(term83625, term83625.getClass(), "combiner", null);
        setField(term83625, term83625.getClass(), "permissions", null);
        setField(term83625, term83625.getClass(), "parent", null);
        setBooleanField(term83625, term83625.getClass(), "isWrapped", false);
        setBooleanField(term83625, term83625.getClass(), "isLimited", false);
        setField(term83625, term83625.getClass(), "limitedContext", null);
        setField(term83608, term83608.getClass(), "acc", term83625);
        setBooleanField(term83608, term83608.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term83608, term83608.getClass(), "isPosted", false);
        setBooleanField(term83608, term83608.getClass(), "isSystemGenerated", false);
        setField(term83608, term83608.getClass(), "source", term83644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HelpView$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term83608;
        callMethod(klass, "keyTyped", argTypes, term83607, args);
    }

};


