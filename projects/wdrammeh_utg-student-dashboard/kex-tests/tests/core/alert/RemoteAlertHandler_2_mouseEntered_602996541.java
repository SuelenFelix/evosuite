package core.alert;

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
import static core.alert.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RemoteAlertHandler_2_mouseEntered_602996541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1012;
     Object term1013;

    public RemoteAlertHandler_2_mouseEntered_602996541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1012 = newInstance(Class.forName("core.alert.RemoteAlertHandler$2"));
        term1013 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term1026 = (byte[]) newByteArray(3);
        Object term1032 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1033 = (Object[]) newArray("java.security.ProtectionDomain", 4);
        Object term1034 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1035 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1036 = (Object[]) newArray("java.security.Principal", 2);
        Object term1039 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1042 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1045 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1050 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1060 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term1013, term1013.getClass(), "x", -203030934);
        setIntField(term1013, term1013.getClass(), "y", -1179120542);
        setIntField(term1013, term1013.getClass(), "xAbs", -73683645);
        setIntField(term1013, term1013.getClass(), "yAbs", -226514366);
        setIntField(term1013, term1013.getClass(), "clickCount", 1193880199);
        setBooleanField(term1013, term1013.getClass(), "causedByTouchEvent", true);
        setIntField(term1013, term1013.getClass(), "button", -1087774327);
        setBooleanField(term1013, term1013.getClass(), "popupTrigger", true);
        setBooleanField(term1013, term1013.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term1013, term1013.getClass(), "when", 2442117782898005296L);
        setIntField(term1013, term1013.getClass(), "modifiers", -1530420153);
        setBooleanField(term1013, term1013.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term1026, 0, (byte) 47);
        setByteElement(term1026, 1, (byte) 48);
        setByteElement(term1026, 2, (byte) 89);
        setField(term1013, term1013.getClass(), "bdata", term1026);
        setIntField(term1013, term1013.getClass(), "id", -469968304);
        setBooleanField(term1013, term1013.getClass(), "consumed", false);
        setField(term1035, term1035.getClass(), "location", null);
        setField(term1035, term1035.getClass(), "signers", null);
        setField(term1035, term1035.getClass(), "certs", null);
        setField(term1035, term1035.getClass(), "sp", null);
        setField(term1035, term1035.getClass(), "factory", null);
        setField(term1035, term1035.getClass(), "locationNoFragString", null);
        setField(term1034, term1034.getClass(), "codesource", term1035);
        setField(term1034, term1034.getClass(), "classloader", null);
        setField(term1034, term1034.getClass(), "principals", term1036);
        setField(term1034, term1034.getClass(), "permissions", null);
        setBooleanField(term1034, term1034.getClass(), "hasAllPerm", false);
        setBooleanField(term1034, term1034.getClass(), "staticPermissions", false);
        setField(term1034, term1034.getClass(), "key", null);
        setElement(term1033, 0, term1034);
        setField(term1039, term1039.getClass(), "codesource", null);
        setField(term1039, term1039.getClass(), "classloader", null);
        setField(term1039, term1039.getClass(), "principals", null);
        setField(term1039, term1039.getClass(), "permissions", null);
        setBooleanField(term1039, term1039.getClass(), "hasAllPerm", false);
        setBooleanField(term1039, term1039.getClass(), "staticPermissions", false);
        setField(term1039, term1039.getClass(), "key", null);
        setElement(term1033, 1, term1039);
        setField(term1042, term1042.getClass(), "codesource", null);
        setField(term1042, term1042.getClass(), "classloader", null);
        setField(term1042, term1042.getClass(), "principals", null);
        setField(term1042, term1042.getClass(), "permissions", null);
        setBooleanField(term1042, term1042.getClass(), "hasAllPerm", false);
        setBooleanField(term1042, term1042.getClass(), "staticPermissions", false);
        setField(term1042, term1042.getClass(), "key", null);
        setElement(term1033, 2, term1042);
        setField(term1045, term1045.getClass(), "codesource", null);
        setField(term1045, term1045.getClass(), "classloader", null);
        setField(term1045, term1045.getClass(), "principals", null);
        setField(term1045, term1045.getClass(), "permissions", null);
        setBooleanField(term1045, term1045.getClass(), "hasAllPerm", false);
        setBooleanField(term1045, term1045.getClass(), "staticPermissions", false);
        setField(term1045, term1045.getClass(), "key", null);
        setElement(term1033, 3, term1045);
        setField(term1032, term1032.getClass(), "context", term1033);
        setBooleanField(term1032, term1032.getClass(), "isPrivileged", true);
        setBooleanField(term1032, term1032.getClass(), "isAuthorized", true);
        setField(term1050, term1050.getClass(), "context", null);
        setBooleanField(term1050, term1050.getClass(), "isPrivileged", false);
        setBooleanField(term1050, term1050.getClass(), "isAuthorized", false);
        setField(term1050, term1050.getClass(), "privilegedContext", null);
        setField(term1050, term1050.getClass(), "combiner", null);
        setField(term1050, term1050.getClass(), "permissions", null);
        setField(term1050, term1050.getClass(), "parent", null);
        setBooleanField(term1050, term1050.getClass(), "isWrapped", false);
        setBooleanField(term1050, term1050.getClass(), "isLimited", false);
        setField(term1050, term1050.getClass(), "limitedContext", null);
        setField(term1032, term1032.getClass(), "privilegedContext", term1050);
        setField(term1032, term1032.getClass(), "combiner", null);
        setField(term1032, term1032.getClass(), "permissions", null);
        setField(term1032, term1032.getClass(), "parent", null);
        setBooleanField(term1032, term1032.getClass(), "isWrapped", false);
        setBooleanField(term1032, term1032.getClass(), "isLimited", false);
        setField(term1032, term1032.getClass(), "limitedContext", null);
        setField(term1013, term1013.getClass(), "acc", term1032);
        setBooleanField(term1013, term1013.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term1013, term1013.getClass(), "isPosted", true);
        setBooleanField(term1013, term1013.getClass(), "isSystemGenerated", true);
        setField(term1013, term1013.getClass(), "source", term1060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.alert.RemoteAlertHandler$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term1013;
        callMethod(klass, "mouseEntered", argTypes, term1012, args);
    }

};


