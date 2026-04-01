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

public class MiscHandler_1_mouseReleased_9242773212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305006;
     Object term305007;

    public MiscHandler_1_mouseReleased_9242773212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305006 = newInstance(Class.forName("core.module.MiscHandler$1"));
        setField(term305006, term305006.getClass(), "this$0", null);
        term305007 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term305020 = (byte[]) newByteArray(2);
        Object term305025 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term305026 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term305027 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term305028 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term305029 = (Object[]) newArray("java.security.Principal", 6);
        Object term305034 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term305044 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term305007, term305007.getClass(), "x", 138913824);
        setIntField(term305007, term305007.getClass(), "y", -637767208);
        setIntField(term305007, term305007.getClass(), "xAbs", 844890845);
        setIntField(term305007, term305007.getClass(), "yAbs", -989538894);
        setIntField(term305007, term305007.getClass(), "clickCount", 1316863342);
        setBooleanField(term305007, term305007.getClass(), "causedByTouchEvent", true);
        setIntField(term305007, term305007.getClass(), "button", 735033722);
        setBooleanField(term305007, term305007.getClass(), "popupTrigger", false);
        setBooleanField(term305007, term305007.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term305007, term305007.getClass(), "when", 6636235983121346803L);
        setIntField(term305007, term305007.getClass(), "modifiers", -1409886459);
        setBooleanField(term305007, term305007.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term305020, 0, (byte) -106);
        setByteElement(term305020, 1, (byte) -124);
        setField(term305007, term305007.getClass(), "bdata", term305020);
        setIntField(term305007, term305007.getClass(), "id", 666379561);
        setBooleanField(term305007, term305007.getClass(), "consumed", false);
        setField(term305028, term305028.getClass(), "location", null);
        setField(term305028, term305028.getClass(), "signers", null);
        setField(term305028, term305028.getClass(), "certs", null);
        setField(term305028, term305028.getClass(), "sp", null);
        setField(term305028, term305028.getClass(), "factory", null);
        setField(term305028, term305028.getClass(), "locationNoFragString", null);
        setField(term305027, term305027.getClass(), "codesource", term305028);
        setField(term305027, term305027.getClass(), "classloader", null);
        setField(term305027, term305027.getClass(), "principals", term305029);
        setField(term305027, term305027.getClass(), "permissions", null);
        setBooleanField(term305027, term305027.getClass(), "hasAllPerm", false);
        setBooleanField(term305027, term305027.getClass(), "staticPermissions", false);
        setField(term305027, term305027.getClass(), "key", null);
        setElement(term305026, 0, term305027);
        setField(term305025, term305025.getClass(), "context", term305026);
        setBooleanField(term305025, term305025.getClass(), "isPrivileged", true);
        setBooleanField(term305025, term305025.getClass(), "isAuthorized", false);
        setField(term305034, term305034.getClass(), "context", null);
        setBooleanField(term305034, term305034.getClass(), "isPrivileged", false);
        setBooleanField(term305034, term305034.getClass(), "isAuthorized", false);
        setField(term305034, term305034.getClass(), "privilegedContext", null);
        setField(term305034, term305034.getClass(), "combiner", null);
        setField(term305034, term305034.getClass(), "permissions", null);
        setField(term305034, term305034.getClass(), "parent", null);
        setBooleanField(term305034, term305034.getClass(), "isWrapped", false);
        setBooleanField(term305034, term305034.getClass(), "isLimited", false);
        setField(term305034, term305034.getClass(), "limitedContext", null);
        setField(term305025, term305025.getClass(), "privilegedContext", term305034);
        setField(term305025, term305025.getClass(), "combiner", null);
        setField(term305025, term305025.getClass(), "permissions", null);
        setField(term305025, term305025.getClass(), "parent", null);
        setBooleanField(term305025, term305025.getClass(), "isWrapped", false);
        setBooleanField(term305025, term305025.getClass(), "isLimited", false);
        setField(term305025, term305025.getClass(), "limitedContext", null);
        setField(term305007, term305007.getClass(), "acc", term305025);
        setBooleanField(term305007, term305007.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term305007, term305007.getClass(), "isPosted", true);
        setBooleanField(term305007, term305007.getClass(), "isSystemGenerated", false);
        setField(term305007, term305007.getClass(), "source", term305044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term305007;
        callMethod(klass, "mouseReleased", argTypes, term305006, args);
    }

};


