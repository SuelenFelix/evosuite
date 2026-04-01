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

public class SpaceRaceEditorView_1_keyPressed_126007523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1913712;
     Object term1913713;

    public SpaceRaceEditorView_1_keyPressed_126007523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1913712 = newInstance(Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView$1"));
        setField(term1913712, term1913712.getClass(), "this$0", null);
        term1913713 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term1913725 = (byte[]) newByteArray(0);
        Object term1913728 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1913729 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term1913730 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1913731 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1913732 = (Object[]) newArray("java.security.Principal", 7);
        Object term1913735 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1913738 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1913741 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1913744 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1913747 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1913750 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1913753 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1913758 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1913768 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term1913713, term1913713.getClass(), "isProxyActive", true);
        setIntField(term1913713, term1913713.getClass(), "keyCode", -106646808);
        setCharField(term1913713, term1913713.getClass(), "keyChar", 'O');
        setIntField(term1913713, term1913713.getClass(), "keyLocation", 1861674350);
        setLongField(term1913713, term1913713.getClass(), "rawCode", -1214968196781083707L);
        setLongField(term1913713, term1913713.getClass(), "primaryLevelUnicode", -1804015692891701666L);
        setLongField(term1913713, term1913713.getClass(), "scancode", -6432617521836576658L);
        setLongField(term1913713, term1913713.getClass(), "extendedKeyCode", -2255965562447970862L);
        setField(term1913713, term1913713.getClass(), "originalSource", null);
        setLongField(term1913713, term1913713.getClass(), "when", 148047808219672941L);
        setIntField(term1913713, term1913713.getClass(), "modifiers", -956282549);
        setBooleanField(term1913713, term1913713.getClass(), "canAccessSystemClipboard", true);
        setField(term1913713, term1913713.getClass(), "bdata", term1913725);
        setIntField(term1913713, term1913713.getClass(), "id", -141631895);
        setBooleanField(term1913713, term1913713.getClass(), "consumed", false);
        setField(term1913731, term1913731.getClass(), "location", null);
        setField(term1913731, term1913731.getClass(), "signers", null);
        setField(term1913731, term1913731.getClass(), "certs", null);
        setField(term1913731, term1913731.getClass(), "sp", null);
        setField(term1913731, term1913731.getClass(), "factory", null);
        setField(term1913731, term1913731.getClass(), "locationNoFragString", null);
        setField(term1913730, term1913730.getClass(), "codesource", term1913731);
        setField(term1913730, term1913730.getClass(), "classloader", null);
        setField(term1913730, term1913730.getClass(), "principals", term1913732);
        setField(term1913730, term1913730.getClass(), "permissions", null);
        setBooleanField(term1913730, term1913730.getClass(), "hasAllPerm", false);
        setBooleanField(term1913730, term1913730.getClass(), "staticPermissions", false);
        setField(term1913730, term1913730.getClass(), "key", null);
        setElement(term1913729, 0, term1913730);
        setField(term1913735, term1913735.getClass(), "codesource", null);
        setField(term1913735, term1913735.getClass(), "classloader", null);
        setField(term1913735, term1913735.getClass(), "principals", null);
        setField(term1913735, term1913735.getClass(), "permissions", null);
        setBooleanField(term1913735, term1913735.getClass(), "hasAllPerm", false);
        setBooleanField(term1913735, term1913735.getClass(), "staticPermissions", false);
        setField(term1913735, term1913735.getClass(), "key", null);
        setElement(term1913729, 1, term1913735);
        setField(term1913738, term1913738.getClass(), "codesource", null);
        setField(term1913738, term1913738.getClass(), "classloader", null);
        setField(term1913738, term1913738.getClass(), "principals", null);
        setField(term1913738, term1913738.getClass(), "permissions", null);
        setBooleanField(term1913738, term1913738.getClass(), "hasAllPerm", false);
        setBooleanField(term1913738, term1913738.getClass(), "staticPermissions", false);
        setField(term1913738, term1913738.getClass(), "key", null);
        setElement(term1913729, 2, term1913738);
        setField(term1913741, term1913741.getClass(), "codesource", null);
        setField(term1913741, term1913741.getClass(), "classloader", null);
        setField(term1913741, term1913741.getClass(), "principals", null);
        setField(term1913741, term1913741.getClass(), "permissions", null);
        setBooleanField(term1913741, term1913741.getClass(), "hasAllPerm", false);
        setBooleanField(term1913741, term1913741.getClass(), "staticPermissions", false);
        setField(term1913741, term1913741.getClass(), "key", null);
        setElement(term1913729, 3, term1913741);
        setField(term1913744, term1913744.getClass(), "codesource", null);
        setField(term1913744, term1913744.getClass(), "classloader", null);
        setField(term1913744, term1913744.getClass(), "principals", null);
        setField(term1913744, term1913744.getClass(), "permissions", null);
        setBooleanField(term1913744, term1913744.getClass(), "hasAllPerm", false);
        setBooleanField(term1913744, term1913744.getClass(), "staticPermissions", false);
        setField(term1913744, term1913744.getClass(), "key", null);
        setElement(term1913729, 4, term1913744);
        setField(term1913747, term1913747.getClass(), "codesource", null);
        setField(term1913747, term1913747.getClass(), "classloader", null);
        setField(term1913747, term1913747.getClass(), "principals", null);
        setField(term1913747, term1913747.getClass(), "permissions", null);
        setBooleanField(term1913747, term1913747.getClass(), "hasAllPerm", false);
        setBooleanField(term1913747, term1913747.getClass(), "staticPermissions", false);
        setField(term1913747, term1913747.getClass(), "key", null);
        setElement(term1913729, 5, term1913747);
        setField(term1913750, term1913750.getClass(), "codesource", null);
        setField(term1913750, term1913750.getClass(), "classloader", null);
        setField(term1913750, term1913750.getClass(), "principals", null);
        setField(term1913750, term1913750.getClass(), "permissions", null);
        setBooleanField(term1913750, term1913750.getClass(), "hasAllPerm", false);
        setBooleanField(term1913750, term1913750.getClass(), "staticPermissions", false);
        setField(term1913750, term1913750.getClass(), "key", null);
        setElement(term1913729, 6, term1913750);
        setField(term1913753, term1913753.getClass(), "codesource", null);
        setField(term1913753, term1913753.getClass(), "classloader", null);
        setField(term1913753, term1913753.getClass(), "principals", null);
        setField(term1913753, term1913753.getClass(), "permissions", null);
        setBooleanField(term1913753, term1913753.getClass(), "hasAllPerm", false);
        setBooleanField(term1913753, term1913753.getClass(), "staticPermissions", false);
        setField(term1913753, term1913753.getClass(), "key", null);
        setElement(term1913729, 7, term1913753);
        setField(term1913728, term1913728.getClass(), "context", term1913729);
        setBooleanField(term1913728, term1913728.getClass(), "isPrivileged", false);
        setBooleanField(term1913728, term1913728.getClass(), "isAuthorized", true);
        setField(term1913758, term1913758.getClass(), "context", null);
        setBooleanField(term1913758, term1913758.getClass(), "isPrivileged", false);
        setBooleanField(term1913758, term1913758.getClass(), "isAuthorized", false);
        setField(term1913758, term1913758.getClass(), "privilegedContext", null);
        setField(term1913758, term1913758.getClass(), "combiner", null);
        setField(term1913758, term1913758.getClass(), "permissions", null);
        setField(term1913758, term1913758.getClass(), "parent", null);
        setBooleanField(term1913758, term1913758.getClass(), "isWrapped", false);
        setBooleanField(term1913758, term1913758.getClass(), "isLimited", false);
        setField(term1913758, term1913758.getClass(), "limitedContext", null);
        setField(term1913728, term1913728.getClass(), "privilegedContext", term1913758);
        setField(term1913728, term1913728.getClass(), "combiner", null);
        setField(term1913728, term1913728.getClass(), "permissions", null);
        setField(term1913728, term1913728.getClass(), "parent", null);
        setBooleanField(term1913728, term1913728.getClass(), "isWrapped", false);
        setBooleanField(term1913728, term1913728.getClass(), "isLimited", false);
        setField(term1913728, term1913728.getClass(), "limitedContext", null);
        setField(term1913713, term1913713.getClass(), "acc", term1913728);
        setBooleanField(term1913713, term1913713.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term1913713, term1913713.getClass(), "isPosted", false);
        setBooleanField(term1913713, term1913713.getClass(), "isSystemGenerated", false);
        setField(term1913713, term1913713.getClass(), "source", term1913768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SpaceRaceEditorView$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term1913713;
        callMethod(klass, "keyPressed", argTypes, term1913712, args);
    }

};


