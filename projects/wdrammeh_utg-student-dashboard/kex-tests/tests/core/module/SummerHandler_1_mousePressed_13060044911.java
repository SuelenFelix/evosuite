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

public class SummerHandler_1_mousePressed_13060044911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97928;
     Object term97929;

    public SummerHandler_1_mousePressed_13060044911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97928 = newInstance(Class.forName("core.module.SummerHandler$1"));
        setField(term97928, term97928.getClass(), "this$0", null);
        term97929 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term97942 = (byte[]) newByteArray(4);
        Object term97949 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term97950 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term97951 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term97952 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term97953 = (Object[]) newArray("java.security.Principal", 5);
        Object term97958 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term97968 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term97929, term97929.getClass(), "x", -280113263);
        setIntField(term97929, term97929.getClass(), "y", 529625347);
        setIntField(term97929, term97929.getClass(), "xAbs", 1409095253);
        setIntField(term97929, term97929.getClass(), "yAbs", 315179039);
        setIntField(term97929, term97929.getClass(), "clickCount", -1835923897);
        setBooleanField(term97929, term97929.getClass(), "causedByTouchEvent", true);
        setIntField(term97929, term97929.getClass(), "button", -341287775);
        setBooleanField(term97929, term97929.getClass(), "popupTrigger", false);
        setBooleanField(term97929, term97929.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term97929, term97929.getClass(), "when", 1967728129628047933L);
        setIntField(term97929, term97929.getClass(), "modifiers", -1651110911);
        setBooleanField(term97929, term97929.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term97942, 0, (byte) 44);
        setByteElement(term97942, 1, (byte) -63);
        setByteElement(term97942, 2, (byte) 15);
        setByteElement(term97942, 3, (byte) 45);
        setField(term97929, term97929.getClass(), "bdata", term97942);
        setIntField(term97929, term97929.getClass(), "id", -1934033808);
        setBooleanField(term97929, term97929.getClass(), "consumed", true);
        setField(term97952, term97952.getClass(), "location", null);
        setField(term97952, term97952.getClass(), "signers", null);
        setField(term97952, term97952.getClass(), "certs", null);
        setField(term97952, term97952.getClass(), "sp", null);
        setField(term97952, term97952.getClass(), "factory", null);
        setField(term97952, term97952.getClass(), "locationNoFragString", null);
        setField(term97951, term97951.getClass(), "codesource", term97952);
        setField(term97951, term97951.getClass(), "classloader", null);
        setField(term97951, term97951.getClass(), "principals", term97953);
        setField(term97951, term97951.getClass(), "permissions", null);
        setBooleanField(term97951, term97951.getClass(), "hasAllPerm", false);
        setBooleanField(term97951, term97951.getClass(), "staticPermissions", false);
        setField(term97951, term97951.getClass(), "key", null);
        setElement(term97950, 0, term97951);
        setField(term97949, term97949.getClass(), "context", term97950);
        setBooleanField(term97949, term97949.getClass(), "isPrivileged", false);
        setBooleanField(term97949, term97949.getClass(), "isAuthorized", true);
        setField(term97958, term97958.getClass(), "context", null);
        setBooleanField(term97958, term97958.getClass(), "isPrivileged", false);
        setBooleanField(term97958, term97958.getClass(), "isAuthorized", false);
        setField(term97958, term97958.getClass(), "privilegedContext", null);
        setField(term97958, term97958.getClass(), "combiner", null);
        setField(term97958, term97958.getClass(), "permissions", null);
        setField(term97958, term97958.getClass(), "parent", null);
        setBooleanField(term97958, term97958.getClass(), "isWrapped", false);
        setBooleanField(term97958, term97958.getClass(), "isLimited", false);
        setField(term97958, term97958.getClass(), "limitedContext", null);
        setField(term97949, term97949.getClass(), "privilegedContext", term97958);
        setField(term97949, term97949.getClass(), "combiner", null);
        setField(term97949, term97949.getClass(), "permissions", null);
        setField(term97949, term97949.getClass(), "parent", null);
        setBooleanField(term97949, term97949.getClass(), "isWrapped", false);
        setBooleanField(term97949, term97949.getClass(), "isLimited", false);
        setField(term97949, term97949.getClass(), "limitedContext", null);
        setField(term97929, term97929.getClass(), "acc", term97949);
        setBooleanField(term97929, term97929.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term97929, term97929.getClass(), "isPosted", false);
        setBooleanField(term97929, term97929.getClass(), "isSystemGenerated", false);
        setField(term97929, term97929.getClass(), "source", term97968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term97929;
        callMethod(klass, "mousePressed", argTypes, term97928, args);
    }

};


