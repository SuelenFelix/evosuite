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

public class RemoteAlertHandler_1_mouseClicked_11673402772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1246;
     Object term1247;

    public RemoteAlertHandler_1_mouseClicked_11673402772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1246 = newInstance(Class.forName("core.alert.RemoteAlertHandler$1"));
        term1247 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term1260 = (byte[]) newByteArray(9);
        Object term1272 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1273 = (Object[]) newArray("java.security.ProtectionDomain", 3);
        Object term1274 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1275 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1276 = (Object[]) newArray("java.security.Principal", 5);
        Object term1279 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1282 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1287 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1297 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term1247, term1247.getClass(), "x", 972867650);
        setIntField(term1247, term1247.getClass(), "y", 1655935355);
        setIntField(term1247, term1247.getClass(), "xAbs", -481533957);
        setIntField(term1247, term1247.getClass(), "yAbs", 1240914516);
        setIntField(term1247, term1247.getClass(), "clickCount", -1465035361);
        setBooleanField(term1247, term1247.getClass(), "causedByTouchEvent", true);
        setIntField(term1247, term1247.getClass(), "button", 1090617576);
        setBooleanField(term1247, term1247.getClass(), "popupTrigger", true);
        setBooleanField(term1247, term1247.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term1247, term1247.getClass(), "when", 5270370404989704783L);
        setIntField(term1247, term1247.getClass(), "modifiers", -1547384488);
        setBooleanField(term1247, term1247.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term1260, 0, (byte) -54);
        setByteElement(term1260, 1, (byte) 67);
        setByteElement(term1260, 2, (byte) 78);
        setByteElement(term1260, 3, (byte) 87);
        setByteElement(term1260, 4, (byte) 121);
        setByteElement(term1260, 5, (byte) -99);
        setByteElement(term1260, 6, (byte) -2);
        setByteElement(term1260, 7, (byte) -16);
        setByteElement(term1260, 8, (byte) -112);
        setField(term1247, term1247.getClass(), "bdata", term1260);
        setIntField(term1247, term1247.getClass(), "id", 1442160736);
        setBooleanField(term1247, term1247.getClass(), "consumed", false);
        setField(term1275, term1275.getClass(), "location", null);
        setField(term1275, term1275.getClass(), "signers", null);
        setField(term1275, term1275.getClass(), "certs", null);
        setField(term1275, term1275.getClass(), "sp", null);
        setField(term1275, term1275.getClass(), "factory", null);
        setField(term1275, term1275.getClass(), "locationNoFragString", null);
        setField(term1274, term1274.getClass(), "codesource", term1275);
        setField(term1274, term1274.getClass(), "classloader", null);
        setField(term1274, term1274.getClass(), "principals", term1276);
        setField(term1274, term1274.getClass(), "permissions", null);
        setBooleanField(term1274, term1274.getClass(), "hasAllPerm", false);
        setBooleanField(term1274, term1274.getClass(), "staticPermissions", false);
        setField(term1274, term1274.getClass(), "key", null);
        setElement(term1273, 0, term1274);
        setField(term1279, term1279.getClass(), "codesource", null);
        setField(term1279, term1279.getClass(), "classloader", null);
        setField(term1279, term1279.getClass(), "principals", null);
        setField(term1279, term1279.getClass(), "permissions", null);
        setBooleanField(term1279, term1279.getClass(), "hasAllPerm", false);
        setBooleanField(term1279, term1279.getClass(), "staticPermissions", false);
        setField(term1279, term1279.getClass(), "key", null);
        setElement(term1273, 1, term1279);
        setField(term1282, term1282.getClass(), "codesource", null);
        setField(term1282, term1282.getClass(), "classloader", null);
        setField(term1282, term1282.getClass(), "principals", null);
        setField(term1282, term1282.getClass(), "permissions", null);
        setBooleanField(term1282, term1282.getClass(), "hasAllPerm", false);
        setBooleanField(term1282, term1282.getClass(), "staticPermissions", false);
        setField(term1282, term1282.getClass(), "key", null);
        setElement(term1273, 2, term1282);
        setField(term1272, term1272.getClass(), "context", term1273);
        setBooleanField(term1272, term1272.getClass(), "isPrivileged", false);
        setBooleanField(term1272, term1272.getClass(), "isAuthorized", false);
        setField(term1287, term1287.getClass(), "context", null);
        setBooleanField(term1287, term1287.getClass(), "isPrivileged", false);
        setBooleanField(term1287, term1287.getClass(), "isAuthorized", false);
        setField(term1287, term1287.getClass(), "privilegedContext", null);
        setField(term1287, term1287.getClass(), "combiner", null);
        setField(term1287, term1287.getClass(), "permissions", null);
        setField(term1287, term1287.getClass(), "parent", null);
        setBooleanField(term1287, term1287.getClass(), "isWrapped", false);
        setBooleanField(term1287, term1287.getClass(), "isLimited", false);
        setField(term1287, term1287.getClass(), "limitedContext", null);
        setField(term1272, term1272.getClass(), "privilegedContext", term1287);
        setField(term1272, term1272.getClass(), "combiner", null);
        setField(term1272, term1272.getClass(), "permissions", null);
        setField(term1272, term1272.getClass(), "parent", null);
        setBooleanField(term1272, term1272.getClass(), "isWrapped", false);
        setBooleanField(term1272, term1272.getClass(), "isLimited", false);
        setField(term1272, term1272.getClass(), "limitedContext", null);
        setField(term1247, term1247.getClass(), "acc", term1272);
        setBooleanField(term1247, term1247.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term1247, term1247.getClass(), "isPosted", true);
        setBooleanField(term1247, term1247.getClass(), "isSystemGenerated", false);
        setField(term1247, term1247.getClass(), "source", term1297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.alert.RemoteAlertHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term1247;
        callMethod(klass, "mouseClicked", argTypes, term1246, args);
    }

};


