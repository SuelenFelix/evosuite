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

public class SpaceRaceEditorView_1_keyReleased_20107673512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1913661;
     Object term1913662;

    public SpaceRaceEditorView_1_keyReleased_20107673512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1913661 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView$1"));
        setField(term1913661, term1913661.getClass(), "this$0", null);
        term1913662 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term1913674 = (byte[]) newByteArray(3);
        Object term1913680 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1913681 = (Object[]) newArray("java.security.ProtectionDomain", 4);
        Object term1913682 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1913683 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1913684 = (Object[]) newArray("java.security.Principal", 2);
        Object term1913687 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1913690 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1913693 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1913698 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1913708 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term1913662, term1913662.getClass(), "isProxyActive", true);
        setIntField(term1913662, term1913662.getClass(), "keyCode", 163916531);
        setCharField(term1913662, term1913662.getClass(), "keyChar", 'p');
        setIntField(term1913662, term1913662.getClass(), "keyLocation", 1929198661);
        setLongField(term1913662, term1913662.getClass(), "rawCode", -900457279156388404L);
        setLongField(term1913662, term1913662.getClass(), "primaryLevelUnicode", 1084801489398441516L);
        setLongField(term1913662, term1913662.getClass(), "scancode", 6273754186658578034L);
        setLongField(term1913662, term1913662.getClass(), "extendedKeyCode", 3620247240684476031L);
        setField(term1913662, term1913662.getClass(), "originalSource", null);
        setLongField(term1913662, term1913662.getClass(), "when", 8313800941204938919L);
        setIntField(term1913662, term1913662.getClass(), "modifiers", 709605965);
        setBooleanField(term1913662, term1913662.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term1913674, 0, (byte) 68);
        setByteElement(term1913674, 1, (byte) 5);
        setByteElement(term1913674, 2, (byte) 110);
        setField(term1913662, term1913662.getClass(), "bdata", term1913674);
        setIntField(term1913662, term1913662.getClass(), "id", -1433367361);
        setBooleanField(term1913662, term1913662.getClass(), "consumed", true);
        setField(term1913683, term1913683.getClass(), "location", null);
        setField(term1913683, term1913683.getClass(), "signers", null);
        setField(term1913683, term1913683.getClass(), "certs", null);
        setField(term1913683, term1913683.getClass(), "sp", null);
        setField(term1913683, term1913683.getClass(), "factory", null);
        setField(term1913683, term1913683.getClass(), "locationNoFragString", null);
        setField(term1913682, term1913682.getClass(), "codesource", term1913683);
        setField(term1913682, term1913682.getClass(), "classloader", null);
        setField(term1913682, term1913682.getClass(), "principals", term1913684);
        setField(term1913682, term1913682.getClass(), "permissions", null);
        setBooleanField(term1913682, term1913682.getClass(), "hasAllPerm", false);
        setBooleanField(term1913682, term1913682.getClass(), "staticPermissions", false);
        setField(term1913682, term1913682.getClass(), "key", null);
        setElement(term1913681, 0, term1913682);
        setField(term1913687, term1913687.getClass(), "codesource", null);
        setField(term1913687, term1913687.getClass(), "classloader", null);
        setField(term1913687, term1913687.getClass(), "principals", null);
        setField(term1913687, term1913687.getClass(), "permissions", null);
        setBooleanField(term1913687, term1913687.getClass(), "hasAllPerm", false);
        setBooleanField(term1913687, term1913687.getClass(), "staticPermissions", false);
        setField(term1913687, term1913687.getClass(), "key", null);
        setElement(term1913681, 1, term1913687);
        setField(term1913690, term1913690.getClass(), "codesource", null);
        setField(term1913690, term1913690.getClass(), "classloader", null);
        setField(term1913690, term1913690.getClass(), "principals", null);
        setField(term1913690, term1913690.getClass(), "permissions", null);
        setBooleanField(term1913690, term1913690.getClass(), "hasAllPerm", false);
        setBooleanField(term1913690, term1913690.getClass(), "staticPermissions", false);
        setField(term1913690, term1913690.getClass(), "key", null);
        setElement(term1913681, 2, term1913690);
        setField(term1913693, term1913693.getClass(), "codesource", null);
        setField(term1913693, term1913693.getClass(), "classloader", null);
        setField(term1913693, term1913693.getClass(), "principals", null);
        setField(term1913693, term1913693.getClass(), "permissions", null);
        setBooleanField(term1913693, term1913693.getClass(), "hasAllPerm", false);
        setBooleanField(term1913693, term1913693.getClass(), "staticPermissions", false);
        setField(term1913693, term1913693.getClass(), "key", null);
        setElement(term1913681, 3, term1913693);
        setField(term1913680, term1913680.getClass(), "context", term1913681);
        setBooleanField(term1913680, term1913680.getClass(), "isPrivileged", false);
        setBooleanField(term1913680, term1913680.getClass(), "isAuthorized", false);
        setField(term1913698, term1913698.getClass(), "context", null);
        setBooleanField(term1913698, term1913698.getClass(), "isPrivileged", false);
        setBooleanField(term1913698, term1913698.getClass(), "isAuthorized", false);
        setField(term1913698, term1913698.getClass(), "privilegedContext", null);
        setField(term1913698, term1913698.getClass(), "combiner", null);
        setField(term1913698, term1913698.getClass(), "permissions", null);
        setField(term1913698, term1913698.getClass(), "parent", null);
        setBooleanField(term1913698, term1913698.getClass(), "isWrapped", false);
        setBooleanField(term1913698, term1913698.getClass(), "isLimited", false);
        setField(term1913698, term1913698.getClass(), "limitedContext", null);
        setField(term1913680, term1913680.getClass(), "privilegedContext", term1913698);
        setField(term1913680, term1913680.getClass(), "combiner", null);
        setField(term1913680, term1913680.getClass(), "permissions", null);
        setField(term1913680, term1913680.getClass(), "parent", null);
        setBooleanField(term1913680, term1913680.getClass(), "isWrapped", false);
        setBooleanField(term1913680, term1913680.getClass(), "isLimited", false);
        setField(term1913680, term1913680.getClass(), "limitedContext", null);
        setField(term1913662, term1913662.getClass(), "acc", term1913680);
        setBooleanField(term1913662, term1913662.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term1913662, term1913662.getClass(), "isPosted", false);
        setBooleanField(term1913662, term1913662.getClass(), "isSystemGenerated", true);
        setField(term1913662, term1913662.getClass(), "source", term1913708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term1913662;
        callMethod(klass, "keyReleased", argTypes, term1913661, args);
    }

};


