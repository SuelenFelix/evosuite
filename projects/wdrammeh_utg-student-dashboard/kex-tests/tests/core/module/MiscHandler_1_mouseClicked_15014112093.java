package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MiscHandler_1_mouseClicked_15014112093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305047;
     Object term305048;

    public MiscHandler_1_mouseClicked_15014112093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305047 = newInstance(Class.forName("core.module.MiscHandler$1"));
        setField(term305047, term305047.getClass(), "this$0", null);
        term305048 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term305061 = (byte[]) newByteArray(0);
        Object term305064 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term305065 = (Object[]) newArray("java.security.ProtectionDomain", 4);
        Object term305066 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term305067 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term305068 = (Object[]) newArray("java.security.Principal", 1);
        Object term305071 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term305074 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term305077 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term305082 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term305092 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term305048, term305048.getClass(), "x", -1756012081);
        setIntField(term305048, term305048.getClass(), "y", 879317718);
        setIntField(term305048, term305048.getClass(), "xAbs", -1205568351);
        setIntField(term305048, term305048.getClass(), "yAbs", -1038188576);
        setIntField(term305048, term305048.getClass(), "clickCount", -190354157);
        setBooleanField(term305048, term305048.getClass(), "causedByTouchEvent", false);
        setIntField(term305048, term305048.getClass(), "button", 878906837);
        setBooleanField(term305048, term305048.getClass(), "popupTrigger", true);
        setBooleanField(term305048, term305048.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term305048, term305048.getClass(), "when", 146749226579788091L);
        setIntField(term305048, term305048.getClass(), "modifiers", -1578163757);
        setBooleanField(term305048, term305048.getClass(), "canAccessSystemClipboard", false);
        setField(term305048, term305048.getClass(), "bdata", term305061);
        setIntField(term305048, term305048.getClass(), "id", -1361859122);
        setBooleanField(term305048, term305048.getClass(), "consumed", true);
        setField(term305067, term305067.getClass(), "location", null);
        setField(term305067, term305067.getClass(), "signers", null);
        setField(term305067, term305067.getClass(), "certs", null);
        setField(term305067, term305067.getClass(), "sp", null);
        setField(term305067, term305067.getClass(), "factory", null);
        setField(term305067, term305067.getClass(), "locationNoFragString", null);
        setField(term305066, term305066.getClass(), "codesource", term305067);
        setField(term305066, term305066.getClass(), "classloader", null);
        setField(term305066, term305066.getClass(), "principals", term305068);
        setField(term305066, term305066.getClass(), "permissions", null);
        setBooleanField(term305066, term305066.getClass(), "hasAllPerm", false);
        setBooleanField(term305066, term305066.getClass(), "staticPermissions", false);
        setField(term305066, term305066.getClass(), "key", null);
        setElement(term305065, 0, term305066);
        setField(term305071, term305071.getClass(), "codesource", null);
        setField(term305071, term305071.getClass(), "classloader", null);
        setField(term305071, term305071.getClass(), "principals", null);
        setField(term305071, term305071.getClass(), "permissions", null);
        setBooleanField(term305071, term305071.getClass(), "hasAllPerm", false);
        setBooleanField(term305071, term305071.getClass(), "staticPermissions", false);
        setField(term305071, term305071.getClass(), "key", null);
        setElement(term305065, 1, term305071);
        setField(term305074, term305074.getClass(), "codesource", null);
        setField(term305074, term305074.getClass(), "classloader", null);
        setField(term305074, term305074.getClass(), "principals", null);
        setField(term305074, term305074.getClass(), "permissions", null);
        setBooleanField(term305074, term305074.getClass(), "hasAllPerm", false);
        setBooleanField(term305074, term305074.getClass(), "staticPermissions", false);
        setField(term305074, term305074.getClass(), "key", null);
        setElement(term305065, 2, term305074);
        setField(term305077, term305077.getClass(), "codesource", null);
        setField(term305077, term305077.getClass(), "classloader", null);
        setField(term305077, term305077.getClass(), "principals", null);
        setField(term305077, term305077.getClass(), "permissions", null);
        setBooleanField(term305077, term305077.getClass(), "hasAllPerm", false);
        setBooleanField(term305077, term305077.getClass(), "staticPermissions", false);
        setField(term305077, term305077.getClass(), "key", null);
        setElement(term305065, 3, term305077);
        setField(term305064, term305064.getClass(), "context", term305065);
        setBooleanField(term305064, term305064.getClass(), "isPrivileged", false);
        setBooleanField(term305064, term305064.getClass(), "isAuthorized", true);
        setField(term305082, term305082.getClass(), "context", null);
        setBooleanField(term305082, term305082.getClass(), "isPrivileged", false);
        setBooleanField(term305082, term305082.getClass(), "isAuthorized", false);
        setField(term305082, term305082.getClass(), "privilegedContext", null);
        setField(term305082, term305082.getClass(), "combiner", null);
        setField(term305082, term305082.getClass(), "permissions", null);
        setField(term305082, term305082.getClass(), "parent", null);
        setBooleanField(term305082, term305082.getClass(), "isWrapped", false);
        setBooleanField(term305082, term305082.getClass(), "isLimited", false);
        setField(term305082, term305082.getClass(), "limitedContext", null);
        setField(term305064, term305064.getClass(), "privilegedContext", term305082);
        setField(term305064, term305064.getClass(), "combiner", null);
        setField(term305064, term305064.getClass(), "permissions", null);
        setField(term305064, term305064.getClass(), "parent", null);
        setBooleanField(term305064, term305064.getClass(), "isWrapped", false);
        setBooleanField(term305064, term305064.getClass(), "isLimited", false);
        setField(term305064, term305064.getClass(), "limitedContext", null);
        setField(term305048, term305048.getClass(), "acc", term305064);
        setBooleanField(term305048, term305048.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term305048, term305048.getClass(), "isPosted", true);
        setBooleanField(term305048, term305048.getClass(), "isSystemGenerated", true);
        setField(term305048, term305048.getClass(), "source", term305092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term305048;
        callMethod(klass, "mouseClicked", argTypes, term305047, args);
    }

};


