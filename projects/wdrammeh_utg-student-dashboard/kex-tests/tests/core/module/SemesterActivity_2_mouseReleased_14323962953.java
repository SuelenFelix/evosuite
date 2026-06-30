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

public class SemesterActivity_2_mouseReleased_14323962953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102033;
     Object term102034;

    public SemesterActivity_2_mouseReleased_14323962953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102033 = newInstance(Class.forName("core.module.SemesterActivity$2"));
        setField(term102033, term102033.getClass(), "this$0", null);
        term102034 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term102047 = (byte[]) newByteArray(7);
        Object term102057 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term102058 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term102059 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term102060 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term102061 = (Object[]) newArray("java.security.Principal", 4);
        Object term102064 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term102067 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term102070 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term102073 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term102076 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term102081 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term102091 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term102034, term102034.getClass(), "x", 998679955);
        setIntField(term102034, term102034.getClass(), "y", 953741504);
        setIntField(term102034, term102034.getClass(), "xAbs", 1389452261);
        setIntField(term102034, term102034.getClass(), "yAbs", 1615957955);
        setIntField(term102034, term102034.getClass(), "clickCount", 1779370220);
        setBooleanField(term102034, term102034.getClass(), "causedByTouchEvent", false);
        setIntField(term102034, term102034.getClass(), "button", -1716046610);
        setBooleanField(term102034, term102034.getClass(), "popupTrigger", true);
        setBooleanField(term102034, term102034.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term102034, term102034.getClass(), "when", 1439298019805881866L);
        setIntField(term102034, term102034.getClass(), "modifiers", 65264024);
        setBooleanField(term102034, term102034.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term102047, 0, (byte) -101);
        setByteElement(term102047, 1, (byte) -102);
        setByteElement(term102047, 2, (byte) -95);
        setByteElement(term102047, 3, (byte) -2);
        setByteElement(term102047, 4, (byte) 28);
        setByteElement(term102047, 5, (byte) 84);
        setByteElement(term102047, 6, (byte) 85);
        setField(term102034, term102034.getClass(), "bdata", term102047);
        setIntField(term102034, term102034.getClass(), "id", -252449812);
        setBooleanField(term102034, term102034.getClass(), "consumed", false);
        setField(term102060, term102060.getClass(), "location", null);
        setField(term102060, term102060.getClass(), "signers", null);
        setField(term102060, term102060.getClass(), "certs", null);
        setField(term102060, term102060.getClass(), "sp", null);
        setField(term102060, term102060.getClass(), "factory", null);
        setField(term102060, term102060.getClass(), "locationNoFragString", null);
        setField(term102059, term102059.getClass(), "codesource", term102060);
        setField(term102059, term102059.getClass(), "classloader", null);
        setField(term102059, term102059.getClass(), "principals", term102061);
        setField(term102059, term102059.getClass(), "permissions", null);
        setBooleanField(term102059, term102059.getClass(), "hasAllPerm", false);
        setBooleanField(term102059, term102059.getClass(), "staticPermissions", false);
        setField(term102059, term102059.getClass(), "key", null);
        setElement(term102058, 0, term102059);
        setField(term102064, term102064.getClass(), "codesource", null);
        setField(term102064, term102064.getClass(), "classloader", null);
        setField(term102064, term102064.getClass(), "principals", null);
        setField(term102064, term102064.getClass(), "permissions", null);
        setBooleanField(term102064, term102064.getClass(), "hasAllPerm", false);
        setBooleanField(term102064, term102064.getClass(), "staticPermissions", false);
        setField(term102064, term102064.getClass(), "key", null);
        setElement(term102058, 1, term102064);
        setField(term102067, term102067.getClass(), "codesource", null);
        setField(term102067, term102067.getClass(), "classloader", null);
        setField(term102067, term102067.getClass(), "principals", null);
        setField(term102067, term102067.getClass(), "permissions", null);
        setBooleanField(term102067, term102067.getClass(), "hasAllPerm", false);
        setBooleanField(term102067, term102067.getClass(), "staticPermissions", false);
        setField(term102067, term102067.getClass(), "key", null);
        setElement(term102058, 2, term102067);
        setField(term102070, term102070.getClass(), "codesource", null);
        setField(term102070, term102070.getClass(), "classloader", null);
        setField(term102070, term102070.getClass(), "principals", null);
        setField(term102070, term102070.getClass(), "permissions", null);
        setBooleanField(term102070, term102070.getClass(), "hasAllPerm", false);
        setBooleanField(term102070, term102070.getClass(), "staticPermissions", false);
        setField(term102070, term102070.getClass(), "key", null);
        setElement(term102058, 3, term102070);
        setField(term102073, term102073.getClass(), "codesource", null);
        setField(term102073, term102073.getClass(), "classloader", null);
        setField(term102073, term102073.getClass(), "principals", null);
        setField(term102073, term102073.getClass(), "permissions", null);
        setBooleanField(term102073, term102073.getClass(), "hasAllPerm", false);
        setBooleanField(term102073, term102073.getClass(), "staticPermissions", false);
        setField(term102073, term102073.getClass(), "key", null);
        setElement(term102058, 4, term102073);
        setField(term102076, term102076.getClass(), "codesource", null);
        setField(term102076, term102076.getClass(), "classloader", null);
        setField(term102076, term102076.getClass(), "principals", null);
        setField(term102076, term102076.getClass(), "permissions", null);
        setBooleanField(term102076, term102076.getClass(), "hasAllPerm", false);
        setBooleanField(term102076, term102076.getClass(), "staticPermissions", false);
        setField(term102076, term102076.getClass(), "key", null);
        setElement(term102058, 5, term102076);
        setField(term102057, term102057.getClass(), "context", term102058);
        setBooleanField(term102057, term102057.getClass(), "isPrivileged", true);
        setBooleanField(term102057, term102057.getClass(), "isAuthorized", true);
        setField(term102081, term102081.getClass(), "context", null);
        setBooleanField(term102081, term102081.getClass(), "isPrivileged", false);
        setBooleanField(term102081, term102081.getClass(), "isAuthorized", false);
        setField(term102081, term102081.getClass(), "privilegedContext", null);
        setField(term102081, term102081.getClass(), "combiner", null);
        setField(term102081, term102081.getClass(), "permissions", null);
        setField(term102081, term102081.getClass(), "parent", null);
        setBooleanField(term102081, term102081.getClass(), "isWrapped", false);
        setBooleanField(term102081, term102081.getClass(), "isLimited", false);
        setField(term102081, term102081.getClass(), "limitedContext", null);
        setField(term102057, term102057.getClass(), "privilegedContext", term102081);
        setField(term102057, term102057.getClass(), "combiner", null);
        setField(term102057, term102057.getClass(), "permissions", null);
        setField(term102057, term102057.getClass(), "parent", null);
        setBooleanField(term102057, term102057.getClass(), "isWrapped", false);
        setBooleanField(term102057, term102057.getClass(), "isLimited", false);
        setField(term102057, term102057.getClass(), "limitedContext", null);
        setField(term102034, term102034.getClass(), "acc", term102057);
        setBooleanField(term102034, term102034.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term102034, term102034.getClass(), "isPosted", false);
        setBooleanField(term102034, term102034.getClass(), "isSystemGenerated", false);
        setField(term102034, term102034.getClass(), "source", term102091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SemesterActivity$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term102034;
        callMethod(klass, "mouseReleased", argTypes, term102033, args);
    }

};


