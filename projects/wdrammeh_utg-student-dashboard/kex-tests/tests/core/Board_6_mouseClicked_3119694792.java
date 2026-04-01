package core;

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
import static core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Board_6_mouseClicked_3119694792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342914;
     Object term342915;

    public Board_6_mouseClicked_3119694792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342914 = newInstance(Class.forName("core.Board$6"));
        setField(term342914, term342914.getClass(), "this$0", null);
        term342915 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term342928 = (byte[]) newByteArray(8);
        Object term342939 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term342940 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term342941 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342942 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term342943 = (Object[]) newArray("java.security.Principal", 4);
        Object term342946 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342949 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342952 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342955 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term342960 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term342970 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term342915, term342915.getClass(), "x", -1287204441);
        setIntField(term342915, term342915.getClass(), "y", 1826016641);
        setIntField(term342915, term342915.getClass(), "xAbs", 1726886771);
        setIntField(term342915, term342915.getClass(), "yAbs", 1045689376);
        setIntField(term342915, term342915.getClass(), "clickCount", 767458787);
        setBooleanField(term342915, term342915.getClass(), "causedByTouchEvent", true);
        setIntField(term342915, term342915.getClass(), "button", 2103721338);
        setBooleanField(term342915, term342915.getClass(), "popupTrigger", false);
        setBooleanField(term342915, term342915.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term342915, term342915.getClass(), "when", 7799452759993694308L);
        setIntField(term342915, term342915.getClass(), "modifiers", 621330308);
        setBooleanField(term342915, term342915.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term342928, 0, (byte) 20);
        setByteElement(term342928, 1, (byte) -114);
        setByteElement(term342928, 2, (byte) 93);
        setByteElement(term342928, 3, (byte) -60);
        setByteElement(term342928, 4, (byte) -4);
        setByteElement(term342928, 5, (byte) 28);
        setByteElement(term342928, 6, (byte) 94);
        setField(term342915, term342915.getClass(), "bdata", term342928);
        setIntField(term342915, term342915.getClass(), "id", -1597424060);
        setBooleanField(term342915, term342915.getClass(), "consumed", false);
        setField(term342942, term342942.getClass(), "location", null);
        setField(term342942, term342942.getClass(), "signers", null);
        setField(term342942, term342942.getClass(), "certs", null);
        setField(term342942, term342942.getClass(), "sp", null);
        setField(term342942, term342942.getClass(), "factory", null);
        setField(term342942, term342942.getClass(), "locationNoFragString", null);
        setField(term342941, term342941.getClass(), "codesource", term342942);
        setField(term342941, term342941.getClass(), "classloader", null);
        setField(term342941, term342941.getClass(), "principals", term342943);
        setField(term342941, term342941.getClass(), "permissions", null);
        setBooleanField(term342941, term342941.getClass(), "hasAllPerm", false);
        setBooleanField(term342941, term342941.getClass(), "staticPermissions", false);
        setField(term342941, term342941.getClass(), "key", null);
        setElement(term342940, 0, term342941);
        setField(term342946, term342946.getClass(), "codesource", null);
        setField(term342946, term342946.getClass(), "classloader", null);
        setField(term342946, term342946.getClass(), "principals", null);
        setField(term342946, term342946.getClass(), "permissions", null);
        setBooleanField(term342946, term342946.getClass(), "hasAllPerm", false);
        setBooleanField(term342946, term342946.getClass(), "staticPermissions", false);
        setField(term342946, term342946.getClass(), "key", null);
        setElement(term342940, 1, term342946);
        setField(term342949, term342949.getClass(), "codesource", null);
        setField(term342949, term342949.getClass(), "classloader", null);
        setField(term342949, term342949.getClass(), "principals", null);
        setField(term342949, term342949.getClass(), "permissions", null);
        setBooleanField(term342949, term342949.getClass(), "hasAllPerm", false);
        setBooleanField(term342949, term342949.getClass(), "staticPermissions", false);
        setField(term342949, term342949.getClass(), "key", null);
        setElement(term342940, 2, term342949);
        setField(term342952, term342952.getClass(), "codesource", null);
        setField(term342952, term342952.getClass(), "classloader", null);
        setField(term342952, term342952.getClass(), "principals", null);
        setField(term342952, term342952.getClass(), "permissions", null);
        setBooleanField(term342952, term342952.getClass(), "hasAllPerm", false);
        setBooleanField(term342952, term342952.getClass(), "staticPermissions", false);
        setField(term342952, term342952.getClass(), "key", null);
        setElement(term342940, 3, term342952);
        setField(term342955, term342955.getClass(), "codesource", null);
        setField(term342955, term342955.getClass(), "classloader", null);
        setField(term342955, term342955.getClass(), "principals", null);
        setField(term342955, term342955.getClass(), "permissions", null);
        setBooleanField(term342955, term342955.getClass(), "hasAllPerm", false);
        setBooleanField(term342955, term342955.getClass(), "staticPermissions", false);
        setField(term342955, term342955.getClass(), "key", null);
        setElement(term342940, 4, term342955);
        setField(term342939, term342939.getClass(), "context", term342940);
        setBooleanField(term342939, term342939.getClass(), "isPrivileged", true);
        setBooleanField(term342939, term342939.getClass(), "isAuthorized", true);
        setField(term342960, term342960.getClass(), "context", null);
        setBooleanField(term342960, term342960.getClass(), "isPrivileged", false);
        setBooleanField(term342960, term342960.getClass(), "isAuthorized", false);
        setField(term342960, term342960.getClass(), "privilegedContext", null);
        setField(term342960, term342960.getClass(), "combiner", null);
        setField(term342960, term342960.getClass(), "permissions", null);
        setField(term342960, term342960.getClass(), "parent", null);
        setBooleanField(term342960, term342960.getClass(), "isWrapped", false);
        setBooleanField(term342960, term342960.getClass(), "isLimited", false);
        setField(term342960, term342960.getClass(), "limitedContext", null);
        setField(term342939, term342939.getClass(), "privilegedContext", term342960);
        setField(term342939, term342939.getClass(), "combiner", null);
        setField(term342939, term342939.getClass(), "permissions", null);
        setField(term342939, term342939.getClass(), "parent", null);
        setBooleanField(term342939, term342939.getClass(), "isWrapped", false);
        setBooleanField(term342939, term342939.getClass(), "isLimited", false);
        setField(term342939, term342939.getClass(), "limitedContext", null);
        setField(term342915, term342915.getClass(), "acc", term342939);
        setBooleanField(term342915, term342915.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term342915, term342915.getClass(), "isPosted", false);
        setBooleanField(term342915, term342915.getClass(), "isSystemGenerated", true);
        setField(term342915, term342915.getClass(), "source", term342970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$6");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term342915;
        callMethod(klass, "mouseClicked", argTypes, term342914, args);
    }

};


