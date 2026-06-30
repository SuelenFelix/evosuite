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

public class RemoteAlertHandler_2_mouseClicked_11673402462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1064;
     Object term1065;

    public RemoteAlertHandler_2_mouseClicked_11673402462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1064 = newInstance(Class.forName("core.alert.RemoteAlertHandler$2"));
        term1065 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term1078 = (byte[]) newByteArray(6);
        Object term1087 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1088 = (Object[]) newArray("java.security.ProtectionDomain", 7);
        Object term1089 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1090 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1091 = (Object[]) newArray("java.security.Principal", 5);
        Object term1094 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1097 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1100 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1103 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1106 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1109 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1114 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1124 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term1065, term1065.getClass(), "x", -157887805);
        setIntField(term1065, term1065.getClass(), "y", 1876565163);
        setIntField(term1065, term1065.getClass(), "xAbs", -817164822);
        setIntField(term1065, term1065.getClass(), "yAbs", -1016503459);
        setIntField(term1065, term1065.getClass(), "clickCount", -1968847291);
        setBooleanField(term1065, term1065.getClass(), "causedByTouchEvent", false);
        setIntField(term1065, term1065.getClass(), "button", 579005622);
        setBooleanField(term1065, term1065.getClass(), "popupTrigger", true);
        setBooleanField(term1065, term1065.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term1065, term1065.getClass(), "when", 6375119433582206027L);
        setIntField(term1065, term1065.getClass(), "modifiers", -14890619);
        setBooleanField(term1065, term1065.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term1078, 0, (byte) 75);
        setByteElement(term1078, 1, (byte) 18);
        setByteElement(term1078, 2, (byte) -58);
        setByteElement(term1078, 3, (byte) -29);
        setByteElement(term1078, 4, (byte) -54);
        setByteElement(term1078, 5, (byte) -10);
        setField(term1065, term1065.getClass(), "bdata", term1078);
        setIntField(term1065, term1065.getClass(), "id", 1632125673);
        setBooleanField(term1065, term1065.getClass(), "consumed", true);
        setField(term1090, term1090.getClass(), "location", null);
        setField(term1090, term1090.getClass(), "signers", null);
        setField(term1090, term1090.getClass(), "certs", null);
        setField(term1090, term1090.getClass(), "sp", null);
        setField(term1090, term1090.getClass(), "factory", null);
        setField(term1090, term1090.getClass(), "locationNoFragString", null);
        setField(term1089, term1089.getClass(), "codesource", term1090);
        setField(term1089, term1089.getClass(), "classloader", null);
        setField(term1089, term1089.getClass(), "principals", term1091);
        setField(term1089, term1089.getClass(), "permissions", null);
        setBooleanField(term1089, term1089.getClass(), "hasAllPerm", false);
        setBooleanField(term1089, term1089.getClass(), "staticPermissions", false);
        setField(term1089, term1089.getClass(), "key", null);
        setElement(term1088, 0, term1089);
        setField(term1094, term1094.getClass(), "codesource", null);
        setField(term1094, term1094.getClass(), "classloader", null);
        setField(term1094, term1094.getClass(), "principals", null);
        setField(term1094, term1094.getClass(), "permissions", null);
        setBooleanField(term1094, term1094.getClass(), "hasAllPerm", false);
        setBooleanField(term1094, term1094.getClass(), "staticPermissions", false);
        setField(term1094, term1094.getClass(), "key", null);
        setElement(term1088, 1, term1094);
        setField(term1097, term1097.getClass(), "codesource", null);
        setField(term1097, term1097.getClass(), "classloader", null);
        setField(term1097, term1097.getClass(), "principals", null);
        setField(term1097, term1097.getClass(), "permissions", null);
        setBooleanField(term1097, term1097.getClass(), "hasAllPerm", false);
        setBooleanField(term1097, term1097.getClass(), "staticPermissions", false);
        setField(term1097, term1097.getClass(), "key", null);
        setElement(term1088, 2, term1097);
        setField(term1100, term1100.getClass(), "codesource", null);
        setField(term1100, term1100.getClass(), "classloader", null);
        setField(term1100, term1100.getClass(), "principals", null);
        setField(term1100, term1100.getClass(), "permissions", null);
        setBooleanField(term1100, term1100.getClass(), "hasAllPerm", false);
        setBooleanField(term1100, term1100.getClass(), "staticPermissions", false);
        setField(term1100, term1100.getClass(), "key", null);
        setElement(term1088, 3, term1100);
        setField(term1103, term1103.getClass(), "codesource", null);
        setField(term1103, term1103.getClass(), "classloader", null);
        setField(term1103, term1103.getClass(), "principals", null);
        setField(term1103, term1103.getClass(), "permissions", null);
        setBooleanField(term1103, term1103.getClass(), "hasAllPerm", false);
        setBooleanField(term1103, term1103.getClass(), "staticPermissions", false);
        setField(term1103, term1103.getClass(), "key", null);
        setElement(term1088, 4, term1103);
        setField(term1106, term1106.getClass(), "codesource", null);
        setField(term1106, term1106.getClass(), "classloader", null);
        setField(term1106, term1106.getClass(), "principals", null);
        setField(term1106, term1106.getClass(), "permissions", null);
        setBooleanField(term1106, term1106.getClass(), "hasAllPerm", false);
        setBooleanField(term1106, term1106.getClass(), "staticPermissions", false);
        setField(term1106, term1106.getClass(), "key", null);
        setElement(term1088, 5, term1106);
        setField(term1109, term1109.getClass(), "codesource", null);
        setField(term1109, term1109.getClass(), "classloader", null);
        setField(term1109, term1109.getClass(), "principals", null);
        setField(term1109, term1109.getClass(), "permissions", null);
        setBooleanField(term1109, term1109.getClass(), "hasAllPerm", false);
        setBooleanField(term1109, term1109.getClass(), "staticPermissions", false);
        setField(term1109, term1109.getClass(), "key", null);
        setElement(term1088, 6, term1109);
        setField(term1087, term1087.getClass(), "context", term1088);
        setBooleanField(term1087, term1087.getClass(), "isPrivileged", false);
        setBooleanField(term1087, term1087.getClass(), "isAuthorized", false);
        setField(term1114, term1114.getClass(), "context", null);
        setBooleanField(term1114, term1114.getClass(), "isPrivileged", false);
        setBooleanField(term1114, term1114.getClass(), "isAuthorized", false);
        setField(term1114, term1114.getClass(), "privilegedContext", null);
        setField(term1114, term1114.getClass(), "combiner", null);
        setField(term1114, term1114.getClass(), "permissions", null);
        setField(term1114, term1114.getClass(), "parent", null);
        setBooleanField(term1114, term1114.getClass(), "isWrapped", false);
        setBooleanField(term1114, term1114.getClass(), "isLimited", false);
        setField(term1114, term1114.getClass(), "limitedContext", null);
        setField(term1087, term1087.getClass(), "privilegedContext", term1114);
        setField(term1087, term1087.getClass(), "combiner", null);
        setField(term1087, term1087.getClass(), "permissions", null);
        setField(term1087, term1087.getClass(), "parent", null);
        setBooleanField(term1087, term1087.getClass(), "isWrapped", false);
        setBooleanField(term1087, term1087.getClass(), "isLimited", false);
        setField(term1087, term1087.getClass(), "limitedContext", null);
        setField(term1065, term1065.getClass(), "acc", term1087);
        setBooleanField(term1065, term1065.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term1065, term1065.getClass(), "isPosted", true);
        setBooleanField(term1065, term1065.getClass(), "isSystemGenerated", false);
        setField(term1065, term1065.getClass(), "source", term1124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.alert.RemoteAlertHandler$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term1065;
        callMethod(klass, "mouseClicked", argTypes, term1064, args);
    }

};


