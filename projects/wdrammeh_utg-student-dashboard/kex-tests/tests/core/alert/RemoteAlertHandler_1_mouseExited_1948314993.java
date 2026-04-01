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

public class RemoteAlertHandler_1_mouseExited_1948314993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1307;
     Object term1308;

    public RemoteAlertHandler_1_mouseExited_1948314993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1307 = newInstance(Class.forName("core.alert.RemoteAlertHandler$1"));
        term1308 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term1321 = (byte[]) newByteArray(3);
        Object term1327 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1328 = (Object[]) newArray("java.security.ProtectionDomain", 7);
        Object term1329 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1330 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1331 = (Object[]) newArray("java.security.Principal", 6);
        Object term1334 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1337 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1340 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1343 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1346 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1349 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1354 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1364 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term1308, term1308.getClass(), "x", -505439934);
        setIntField(term1308, term1308.getClass(), "y", -344842608);
        setIntField(term1308, term1308.getClass(), "xAbs", 941650513);
        setIntField(term1308, term1308.getClass(), "yAbs", 444029505);
        setIntField(term1308, term1308.getClass(), "clickCount", -1034506028);
        setBooleanField(term1308, term1308.getClass(), "causedByTouchEvent", false);
        setIntField(term1308, term1308.getClass(), "button", -1263114719);
        setBooleanField(term1308, term1308.getClass(), "popupTrigger", true);
        setBooleanField(term1308, term1308.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term1308, term1308.getClass(), "when", 7411271909051562686L);
        setIntField(term1308, term1308.getClass(), "modifiers", -894662986);
        setBooleanField(term1308, term1308.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term1321, 0, (byte) -111);
        setByteElement(term1321, 1, (byte) 23);
        setByteElement(term1321, 2, (byte) -15);
        setField(term1308, term1308.getClass(), "bdata", term1321);
        setIntField(term1308, term1308.getClass(), "id", 304775596);
        setBooleanField(term1308, term1308.getClass(), "consumed", true);
        setField(term1330, term1330.getClass(), "location", null);
        setField(term1330, term1330.getClass(), "signers", null);
        setField(term1330, term1330.getClass(), "certs", null);
        setField(term1330, term1330.getClass(), "sp", null);
        setField(term1330, term1330.getClass(), "factory", null);
        setField(term1330, term1330.getClass(), "locationNoFragString", null);
        setField(term1329, term1329.getClass(), "codesource", term1330);
        setField(term1329, term1329.getClass(), "classloader", null);
        setField(term1329, term1329.getClass(), "principals", term1331);
        setField(term1329, term1329.getClass(), "permissions", null);
        setBooleanField(term1329, term1329.getClass(), "hasAllPerm", false);
        setBooleanField(term1329, term1329.getClass(), "staticPermissions", false);
        setField(term1329, term1329.getClass(), "key", null);
        setElement(term1328, 0, term1329);
        setField(term1334, term1334.getClass(), "codesource", null);
        setField(term1334, term1334.getClass(), "classloader", null);
        setField(term1334, term1334.getClass(), "principals", null);
        setField(term1334, term1334.getClass(), "permissions", null);
        setBooleanField(term1334, term1334.getClass(), "hasAllPerm", false);
        setBooleanField(term1334, term1334.getClass(), "staticPermissions", false);
        setField(term1334, term1334.getClass(), "key", null);
        setElement(term1328, 1, term1334);
        setField(term1337, term1337.getClass(), "codesource", null);
        setField(term1337, term1337.getClass(), "classloader", null);
        setField(term1337, term1337.getClass(), "principals", null);
        setField(term1337, term1337.getClass(), "permissions", null);
        setBooleanField(term1337, term1337.getClass(), "hasAllPerm", false);
        setBooleanField(term1337, term1337.getClass(), "staticPermissions", false);
        setField(term1337, term1337.getClass(), "key", null);
        setElement(term1328, 2, term1337);
        setField(term1340, term1340.getClass(), "codesource", null);
        setField(term1340, term1340.getClass(), "classloader", null);
        setField(term1340, term1340.getClass(), "principals", null);
        setField(term1340, term1340.getClass(), "permissions", null);
        setBooleanField(term1340, term1340.getClass(), "hasAllPerm", false);
        setBooleanField(term1340, term1340.getClass(), "staticPermissions", false);
        setField(term1340, term1340.getClass(), "key", null);
        setElement(term1328, 3, term1340);
        setField(term1343, term1343.getClass(), "codesource", null);
        setField(term1343, term1343.getClass(), "classloader", null);
        setField(term1343, term1343.getClass(), "principals", null);
        setField(term1343, term1343.getClass(), "permissions", null);
        setBooleanField(term1343, term1343.getClass(), "hasAllPerm", false);
        setBooleanField(term1343, term1343.getClass(), "staticPermissions", false);
        setField(term1343, term1343.getClass(), "key", null);
        setElement(term1328, 4, term1343);
        setField(term1346, term1346.getClass(), "codesource", null);
        setField(term1346, term1346.getClass(), "classloader", null);
        setField(term1346, term1346.getClass(), "principals", null);
        setField(term1346, term1346.getClass(), "permissions", null);
        setBooleanField(term1346, term1346.getClass(), "hasAllPerm", false);
        setBooleanField(term1346, term1346.getClass(), "staticPermissions", false);
        setField(term1346, term1346.getClass(), "key", null);
        setElement(term1328, 5, term1346);
        setField(term1349, term1349.getClass(), "codesource", null);
        setField(term1349, term1349.getClass(), "classloader", null);
        setField(term1349, term1349.getClass(), "principals", null);
        setField(term1349, term1349.getClass(), "permissions", null);
        setBooleanField(term1349, term1349.getClass(), "hasAllPerm", false);
        setBooleanField(term1349, term1349.getClass(), "staticPermissions", false);
        setField(term1349, term1349.getClass(), "key", null);
        setElement(term1328, 6, term1349);
        setField(term1327, term1327.getClass(), "context", term1328);
        setBooleanField(term1327, term1327.getClass(), "isPrivileged", true);
        setBooleanField(term1327, term1327.getClass(), "isAuthorized", false);
        setField(term1354, term1354.getClass(), "context", null);
        setBooleanField(term1354, term1354.getClass(), "isPrivileged", false);
        setBooleanField(term1354, term1354.getClass(), "isAuthorized", false);
        setField(term1354, term1354.getClass(), "privilegedContext", null);
        setField(term1354, term1354.getClass(), "combiner", null);
        setField(term1354, term1354.getClass(), "permissions", null);
        setField(term1354, term1354.getClass(), "parent", null);
        setBooleanField(term1354, term1354.getClass(), "isWrapped", false);
        setBooleanField(term1354, term1354.getClass(), "isLimited", false);
        setField(term1354, term1354.getClass(), "limitedContext", null);
        setField(term1327, term1327.getClass(), "privilegedContext", term1354);
        setField(term1327, term1327.getClass(), "combiner", null);
        setField(term1327, term1327.getClass(), "permissions", null);
        setField(term1327, term1327.getClass(), "parent", null);
        setBooleanField(term1327, term1327.getClass(), "isWrapped", false);
        setBooleanField(term1327, term1327.getClass(), "isLimited", false);
        setField(term1327, term1327.getClass(), "limitedContext", null);
        setField(term1308, term1308.getClass(), "acc", term1327);
        setBooleanField(term1308, term1308.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term1308, term1308.getClass(), "isPosted", false);
        setBooleanField(term1308, term1308.getClass(), "isSystemGenerated", false);
        setField(term1308, term1308.getClass(), "source", term1364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.alert.RemoteAlertHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term1308;
        callMethod(klass, "mouseExited", argTypes, term1307, args);
    }

};


