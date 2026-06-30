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

public class RemoteAlertHandler_1_mouseEntered_602996851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1184;
     Object term1185;

    public RemoteAlertHandler_1_mouseEntered_602996851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1184 = newInstance(Class.forName("core.alert.RemoteAlertHandler$1"));
        term1185 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term1198 = (byte[]) newByteArray(2);
        Object term1203 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1204 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term1205 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1206 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1207 = (Object[]) newArray("java.security.Principal", 1);
        Object term1210 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1213 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1216 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1219 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1222 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1225 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1228 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1233 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1243 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term1185, term1185.getClass(), "x", -112921587);
        setIntField(term1185, term1185.getClass(), "y", 933028652);
        setIntField(term1185, term1185.getClass(), "xAbs", 287287233);
        setIntField(term1185, term1185.getClass(), "yAbs", 962840079);
        setIntField(term1185, term1185.getClass(), "clickCount", 1540719661);
        setBooleanField(term1185, term1185.getClass(), "causedByTouchEvent", false);
        setIntField(term1185, term1185.getClass(), "button", 1265463001);
        setBooleanField(term1185, term1185.getClass(), "popupTrigger", true);
        setBooleanField(term1185, term1185.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term1185, term1185.getClass(), "when", -8400487765614892086L);
        setIntField(term1185, term1185.getClass(), "modifiers", 335112684);
        setBooleanField(term1185, term1185.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term1198, 0, (byte) -71);
        setByteElement(term1198, 1, (byte) 49);
        setField(term1185, term1185.getClass(), "bdata", term1198);
        setIntField(term1185, term1185.getClass(), "id", 1551099402);
        setBooleanField(term1185, term1185.getClass(), "consumed", false);
        setField(term1206, term1206.getClass(), "location", null);
        setField(term1206, term1206.getClass(), "signers", null);
        setField(term1206, term1206.getClass(), "certs", null);
        setField(term1206, term1206.getClass(), "sp", null);
        setField(term1206, term1206.getClass(), "factory", null);
        setField(term1206, term1206.getClass(), "locationNoFragString", null);
        setField(term1205, term1205.getClass(), "codesource", term1206);
        setField(term1205, term1205.getClass(), "classloader", null);
        setField(term1205, term1205.getClass(), "principals", term1207);
        setField(term1205, term1205.getClass(), "permissions", null);
        setBooleanField(term1205, term1205.getClass(), "hasAllPerm", false);
        setBooleanField(term1205, term1205.getClass(), "staticPermissions", false);
        setField(term1205, term1205.getClass(), "key", null);
        setElement(term1204, 0, term1205);
        setField(term1210, term1210.getClass(), "codesource", null);
        setField(term1210, term1210.getClass(), "classloader", null);
        setField(term1210, term1210.getClass(), "principals", null);
        setField(term1210, term1210.getClass(), "permissions", null);
        setBooleanField(term1210, term1210.getClass(), "hasAllPerm", false);
        setBooleanField(term1210, term1210.getClass(), "staticPermissions", false);
        setField(term1210, term1210.getClass(), "key", null);
        setElement(term1204, 1, term1210);
        setField(term1213, term1213.getClass(), "codesource", null);
        setField(term1213, term1213.getClass(), "classloader", null);
        setField(term1213, term1213.getClass(), "principals", null);
        setField(term1213, term1213.getClass(), "permissions", null);
        setBooleanField(term1213, term1213.getClass(), "hasAllPerm", false);
        setBooleanField(term1213, term1213.getClass(), "staticPermissions", false);
        setField(term1213, term1213.getClass(), "key", null);
        setElement(term1204, 2, term1213);
        setField(term1216, term1216.getClass(), "codesource", null);
        setField(term1216, term1216.getClass(), "classloader", null);
        setField(term1216, term1216.getClass(), "principals", null);
        setField(term1216, term1216.getClass(), "permissions", null);
        setBooleanField(term1216, term1216.getClass(), "hasAllPerm", false);
        setBooleanField(term1216, term1216.getClass(), "staticPermissions", false);
        setField(term1216, term1216.getClass(), "key", null);
        setElement(term1204, 3, term1216);
        setField(term1219, term1219.getClass(), "codesource", null);
        setField(term1219, term1219.getClass(), "classloader", null);
        setField(term1219, term1219.getClass(), "principals", null);
        setField(term1219, term1219.getClass(), "permissions", null);
        setBooleanField(term1219, term1219.getClass(), "hasAllPerm", false);
        setBooleanField(term1219, term1219.getClass(), "staticPermissions", false);
        setField(term1219, term1219.getClass(), "key", null);
        setElement(term1204, 4, term1219);
        setField(term1222, term1222.getClass(), "codesource", null);
        setField(term1222, term1222.getClass(), "classloader", null);
        setField(term1222, term1222.getClass(), "principals", null);
        setField(term1222, term1222.getClass(), "permissions", null);
        setBooleanField(term1222, term1222.getClass(), "hasAllPerm", false);
        setBooleanField(term1222, term1222.getClass(), "staticPermissions", false);
        setField(term1222, term1222.getClass(), "key", null);
        setElement(term1204, 5, term1222);
        setField(term1225, term1225.getClass(), "codesource", null);
        setField(term1225, term1225.getClass(), "classloader", null);
        setField(term1225, term1225.getClass(), "principals", null);
        setField(term1225, term1225.getClass(), "permissions", null);
        setBooleanField(term1225, term1225.getClass(), "hasAllPerm", false);
        setBooleanField(term1225, term1225.getClass(), "staticPermissions", false);
        setField(term1225, term1225.getClass(), "key", null);
        setElement(term1204, 6, term1225);
        setField(term1228, term1228.getClass(), "codesource", null);
        setField(term1228, term1228.getClass(), "classloader", null);
        setField(term1228, term1228.getClass(), "principals", null);
        setField(term1228, term1228.getClass(), "permissions", null);
        setBooleanField(term1228, term1228.getClass(), "hasAllPerm", false);
        setBooleanField(term1228, term1228.getClass(), "staticPermissions", false);
        setField(term1228, term1228.getClass(), "key", null);
        setElement(term1204, 7, term1228);
        setField(term1203, term1203.getClass(), "context", term1204);
        setBooleanField(term1203, term1203.getClass(), "isPrivileged", true);
        setBooleanField(term1203, term1203.getClass(), "isAuthorized", true);
        setField(term1233, term1233.getClass(), "context", null);
        setBooleanField(term1233, term1233.getClass(), "isPrivileged", false);
        setBooleanField(term1233, term1233.getClass(), "isAuthorized", false);
        setField(term1233, term1233.getClass(), "privilegedContext", null);
        setField(term1233, term1233.getClass(), "combiner", null);
        setField(term1233, term1233.getClass(), "permissions", null);
        setField(term1233, term1233.getClass(), "parent", null);
        setBooleanField(term1233, term1233.getClass(), "isWrapped", false);
        setBooleanField(term1233, term1233.getClass(), "isLimited", false);
        setField(term1233, term1233.getClass(), "limitedContext", null);
        setField(term1203, term1203.getClass(), "privilegedContext", term1233);
        setField(term1203, term1203.getClass(), "combiner", null);
        setField(term1203, term1203.getClass(), "permissions", null);
        setField(term1203, term1203.getClass(), "parent", null);
        setBooleanField(term1203, term1203.getClass(), "isWrapped", false);
        setBooleanField(term1203, term1203.getClass(), "isLimited", false);
        setField(term1203, term1203.getClass(), "limitedContext", null);
        setField(term1185, term1185.getClass(), "acc", term1203);
        setBooleanField(term1185, term1185.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term1185, term1185.getClass(), "isPosted", false);
        setBooleanField(term1185, term1185.getClass(), "isSystemGenerated", true);
        setField(term1185, term1185.getClass(), "source", term1243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.alert.RemoteAlertHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term1185;
        callMethod(klass, "mouseEntered", argTypes, term1184, args);
    }

};


