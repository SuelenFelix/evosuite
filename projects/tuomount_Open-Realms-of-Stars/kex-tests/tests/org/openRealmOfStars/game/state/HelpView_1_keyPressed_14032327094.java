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

public class HelpView_1_keyPressed_14032327094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83704;
     Object term83705;

    public HelpView_1_keyPressed_14032327094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83704 = newInstance(Class.forName("org.openRealmOfStars.game.state.HelpView$1"));
        setField(term83704, term83704.getClass(), "this$0", null);
        term83705 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term83717 = (byte[]) newByteArray(0);
        Object term83720 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term83721 = (Object[]) newArray("java.security.ProtectionDomain", 9);
        Object term83722 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83723 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term83724 = (Object[]) newArray("java.security.Principal", 0);
        Object term83727 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83730 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83733 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83736 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83739 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83742 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83745 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83748 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83753 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term83763 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term83705, term83705.getClass(), "isProxyActive", true);
        setIntField(term83705, term83705.getClass(), "keyCode", 361169760);
        setCharField(term83705, term83705.getClass(), "keyChar", 'B');
        setIntField(term83705, term83705.getClass(), "keyLocation", 1796450668);
        setLongField(term83705, term83705.getClass(), "rawCode", -8885298608300233488L);
        setLongField(term83705, term83705.getClass(), "primaryLevelUnicode", -4325723315152823407L);
        setLongField(term83705, term83705.getClass(), "scancode", 2535595959091595249L);
        setLongField(term83705, term83705.getClass(), "extendedKeyCode", -5476826692763582090L);
        setField(term83705, term83705.getClass(), "originalSource", null);
        setLongField(term83705, term83705.getClass(), "when", -872011222785455006L);
        setIntField(term83705, term83705.getClass(), "modifiers", -1052517959);
        setBooleanField(term83705, term83705.getClass(), "canAccessSystemClipboard", true);
        setField(term83705, term83705.getClass(), "bdata", term83717);
        setIntField(term83705, term83705.getClass(), "id", -646227135);
        setBooleanField(term83705, term83705.getClass(), "consumed", false);
        setField(term83723, term83723.getClass(), "location", null);
        setField(term83723, term83723.getClass(), "signers", null);
        setField(term83723, term83723.getClass(), "certs", null);
        setField(term83723, term83723.getClass(), "sp", null);
        setField(term83723, term83723.getClass(), "factory", null);
        setField(term83723, term83723.getClass(), "locationNoFragString", null);
        setField(term83722, term83722.getClass(), "codesource", term83723);
        setField(term83722, term83722.getClass(), "classloader", null);
        setField(term83722, term83722.getClass(), "principals", term83724);
        setField(term83722, term83722.getClass(), "permissions", null);
        setBooleanField(term83722, term83722.getClass(), "hasAllPerm", false);
        setBooleanField(term83722, term83722.getClass(), "staticPermissions", false);
        setField(term83722, term83722.getClass(), "key", null);
        setElement(term83721, 0, term83722);
        setField(term83727, term83727.getClass(), "codesource", null);
        setField(term83727, term83727.getClass(), "classloader", null);
        setField(term83727, term83727.getClass(), "principals", null);
        setField(term83727, term83727.getClass(), "permissions", null);
        setBooleanField(term83727, term83727.getClass(), "hasAllPerm", false);
        setBooleanField(term83727, term83727.getClass(), "staticPermissions", false);
        setField(term83727, term83727.getClass(), "key", null);
        setElement(term83721, 1, term83727);
        setField(term83730, term83730.getClass(), "codesource", null);
        setField(term83730, term83730.getClass(), "classloader", null);
        setField(term83730, term83730.getClass(), "principals", null);
        setField(term83730, term83730.getClass(), "permissions", null);
        setBooleanField(term83730, term83730.getClass(), "hasAllPerm", false);
        setBooleanField(term83730, term83730.getClass(), "staticPermissions", false);
        setField(term83730, term83730.getClass(), "key", null);
        setElement(term83721, 2, term83730);
        setField(term83733, term83733.getClass(), "codesource", null);
        setField(term83733, term83733.getClass(), "classloader", null);
        setField(term83733, term83733.getClass(), "principals", null);
        setField(term83733, term83733.getClass(), "permissions", null);
        setBooleanField(term83733, term83733.getClass(), "hasAllPerm", false);
        setBooleanField(term83733, term83733.getClass(), "staticPermissions", false);
        setField(term83733, term83733.getClass(), "key", null);
        setElement(term83721, 3, term83733);
        setField(term83736, term83736.getClass(), "codesource", null);
        setField(term83736, term83736.getClass(), "classloader", null);
        setField(term83736, term83736.getClass(), "principals", null);
        setField(term83736, term83736.getClass(), "permissions", null);
        setBooleanField(term83736, term83736.getClass(), "hasAllPerm", false);
        setBooleanField(term83736, term83736.getClass(), "staticPermissions", false);
        setField(term83736, term83736.getClass(), "key", null);
        setElement(term83721, 4, term83736);
        setField(term83739, term83739.getClass(), "codesource", null);
        setField(term83739, term83739.getClass(), "classloader", null);
        setField(term83739, term83739.getClass(), "principals", null);
        setField(term83739, term83739.getClass(), "permissions", null);
        setBooleanField(term83739, term83739.getClass(), "hasAllPerm", false);
        setBooleanField(term83739, term83739.getClass(), "staticPermissions", false);
        setField(term83739, term83739.getClass(), "key", null);
        setElement(term83721, 5, term83739);
        setField(term83742, term83742.getClass(), "codesource", null);
        setField(term83742, term83742.getClass(), "classloader", null);
        setField(term83742, term83742.getClass(), "principals", null);
        setField(term83742, term83742.getClass(), "permissions", null);
        setBooleanField(term83742, term83742.getClass(), "hasAllPerm", false);
        setBooleanField(term83742, term83742.getClass(), "staticPermissions", false);
        setField(term83742, term83742.getClass(), "key", null);
        setElement(term83721, 6, term83742);
        setField(term83745, term83745.getClass(), "codesource", null);
        setField(term83745, term83745.getClass(), "classloader", null);
        setField(term83745, term83745.getClass(), "principals", null);
        setField(term83745, term83745.getClass(), "permissions", null);
        setBooleanField(term83745, term83745.getClass(), "hasAllPerm", false);
        setBooleanField(term83745, term83745.getClass(), "staticPermissions", false);
        setField(term83745, term83745.getClass(), "key", null);
        setElement(term83721, 7, term83745);
        setField(term83748, term83748.getClass(), "codesource", null);
        setField(term83748, term83748.getClass(), "classloader", null);
        setField(term83748, term83748.getClass(), "principals", null);
        setField(term83748, term83748.getClass(), "permissions", null);
        setBooleanField(term83748, term83748.getClass(), "hasAllPerm", false);
        setBooleanField(term83748, term83748.getClass(), "staticPermissions", false);
        setField(term83748, term83748.getClass(), "key", null);
        setElement(term83721, 8, term83748);
        setField(term83720, term83720.getClass(), "context", term83721);
        setBooleanField(term83720, term83720.getClass(), "isPrivileged", true);
        setBooleanField(term83720, term83720.getClass(), "isAuthorized", false);
        setField(term83753, term83753.getClass(), "context", null);
        setBooleanField(term83753, term83753.getClass(), "isPrivileged", false);
        setBooleanField(term83753, term83753.getClass(), "isAuthorized", false);
        setField(term83753, term83753.getClass(), "privilegedContext", null);
        setField(term83753, term83753.getClass(), "combiner", null);
        setField(term83753, term83753.getClass(), "permissions", null);
        setField(term83753, term83753.getClass(), "parent", null);
        setBooleanField(term83753, term83753.getClass(), "isWrapped", false);
        setBooleanField(term83753, term83753.getClass(), "isLimited", false);
        setField(term83753, term83753.getClass(), "limitedContext", null);
        setField(term83720, term83720.getClass(), "privilegedContext", term83753);
        setField(term83720, term83720.getClass(), "combiner", null);
        setField(term83720, term83720.getClass(), "permissions", null);
        setField(term83720, term83720.getClass(), "parent", null);
        setBooleanField(term83720, term83720.getClass(), "isWrapped", false);
        setBooleanField(term83720, term83720.getClass(), "isLimited", false);
        setField(term83720, term83720.getClass(), "limitedContext", null);
        setField(term83705, term83705.getClass(), "acc", term83720);
        setBooleanField(term83705, term83705.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term83705, term83705.getClass(), "isPosted", false);
        setBooleanField(term83705, term83705.getClass(), "isSystemGenerated", false);
        setField(term83705, term83705.getClass(), "source", term83763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HelpView$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term83705;
        callMethod(klass, "keyPressed", argTypes, term83704, args);
    }

};


