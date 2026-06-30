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

public class SemesterActivity_2_mouseClicked_8552624071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101925;
     Object term101926;

    public SemesterActivity_2_mouseClicked_8552624071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101925 = newInstance(Class.forName("core.module.SemesterActivity$2"));
        setField(term101925, term101925.getClass(), "this$0", null);
        term101926 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term101939 = (byte[]) newByteArray(4);
        Object term101946 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term101947 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term101948 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term101949 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term101950 = (Object[]) newArray("java.security.Principal", 4);
        Object term101953 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term101958 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term101968 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term101926, term101926.getClass(), "x", 1904515443);
        setIntField(term101926, term101926.getClass(), "y", 1361126430);
        setIntField(term101926, term101926.getClass(), "xAbs", 1728588701);
        setIntField(term101926, term101926.getClass(), "yAbs", -355769268);
        setIntField(term101926, term101926.getClass(), "clickCount", -114460662);
        setBooleanField(term101926, term101926.getClass(), "causedByTouchEvent", true);
        setIntField(term101926, term101926.getClass(), "button", -355376034);
        setBooleanField(term101926, term101926.getClass(), "popupTrigger", false);
        setBooleanField(term101926, term101926.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term101926, term101926.getClass(), "when", 1233889271256172047L);
        setIntField(term101926, term101926.getClass(), "modifiers", 588390599);
        setBooleanField(term101926, term101926.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term101939, 0, (byte) -74);
        setByteElement(term101939, 1, (byte) -84);
        setByteElement(term101939, 2, (byte) -53);
        setByteElement(term101939, 3, (byte) -93);
        setField(term101926, term101926.getClass(), "bdata", term101939);
        setIntField(term101926, term101926.getClass(), "id", -95969566);
        setBooleanField(term101926, term101926.getClass(), "consumed", true);
        setField(term101949, term101949.getClass(), "location", null);
        setField(term101949, term101949.getClass(), "signers", null);
        setField(term101949, term101949.getClass(), "certs", null);
        setField(term101949, term101949.getClass(), "sp", null);
        setField(term101949, term101949.getClass(), "factory", null);
        setField(term101949, term101949.getClass(), "locationNoFragString", null);
        setField(term101948, term101948.getClass(), "codesource", term101949);
        setField(term101948, term101948.getClass(), "classloader", null);
        setField(term101948, term101948.getClass(), "principals", term101950);
        setField(term101948, term101948.getClass(), "permissions", null);
        setBooleanField(term101948, term101948.getClass(), "hasAllPerm", false);
        setBooleanField(term101948, term101948.getClass(), "staticPermissions", false);
        setField(term101948, term101948.getClass(), "key", null);
        setElement(term101947, 0, term101948);
        setField(term101953, term101953.getClass(), "codesource", null);
        setField(term101953, term101953.getClass(), "classloader", null);
        setField(term101953, term101953.getClass(), "principals", null);
        setField(term101953, term101953.getClass(), "permissions", null);
        setBooleanField(term101953, term101953.getClass(), "hasAllPerm", false);
        setBooleanField(term101953, term101953.getClass(), "staticPermissions", false);
        setField(term101953, term101953.getClass(), "key", null);
        setElement(term101947, 1, term101953);
        setField(term101946, term101946.getClass(), "context", term101947);
        setBooleanField(term101946, term101946.getClass(), "isPrivileged", true);
        setBooleanField(term101946, term101946.getClass(), "isAuthorized", true);
        setField(term101958, term101958.getClass(), "context", null);
        setBooleanField(term101958, term101958.getClass(), "isPrivileged", false);
        setBooleanField(term101958, term101958.getClass(), "isAuthorized", false);
        setField(term101958, term101958.getClass(), "privilegedContext", null);
        setField(term101958, term101958.getClass(), "combiner", null);
        setField(term101958, term101958.getClass(), "permissions", null);
        setField(term101958, term101958.getClass(), "parent", null);
        setBooleanField(term101958, term101958.getClass(), "isWrapped", false);
        setBooleanField(term101958, term101958.getClass(), "isLimited", false);
        setField(term101958, term101958.getClass(), "limitedContext", null);
        setField(term101946, term101946.getClass(), "privilegedContext", term101958);
        setField(term101946, term101946.getClass(), "combiner", null);
        setField(term101946, term101946.getClass(), "permissions", null);
        setField(term101946, term101946.getClass(), "parent", null);
        setBooleanField(term101946, term101946.getClass(), "isWrapped", false);
        setBooleanField(term101946, term101946.getClass(), "isLimited", false);
        setField(term101946, term101946.getClass(), "limitedContext", null);
        setField(term101926, term101926.getClass(), "acc", term101946);
        setBooleanField(term101926, term101926.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term101926, term101926.getClass(), "isPosted", true);
        setBooleanField(term101926, term101926.getClass(), "isSystemGenerated", false);
        setField(term101926, term101926.getClass(), "source", term101968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SemesterActivity$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term101926;
        callMethod(klass, "mouseClicked", argTypes, term101925, args);
    }

};


