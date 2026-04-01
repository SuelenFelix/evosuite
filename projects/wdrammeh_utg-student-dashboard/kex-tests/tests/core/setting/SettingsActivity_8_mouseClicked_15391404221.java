package core.setting;

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
import static core.setting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SettingsActivity_8_mouseClicked_15391404221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147132;
     Object term147133;

    public SettingsActivity_8_mouseClicked_15391404221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147132 = newInstance(Class.forName("core.setting.SettingsActivity$8"));
        term147133 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term147146 = (byte[]) newByteArray(0);
        Object term147149 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term147150 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term147151 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term147152 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term147153 = (Object[]) newArray("java.security.Principal", 5);
        Object term147156 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term147159 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term147162 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term147165 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term147170 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term147180 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term147133, term147133.getClass(), "x", 1077647088);
        setIntField(term147133, term147133.getClass(), "y", -705176810);
        setIntField(term147133, term147133.getClass(), "xAbs", -1584779593);
        setIntField(term147133, term147133.getClass(), "yAbs", 303007547);
        setIntField(term147133, term147133.getClass(), "clickCount", 1498738343);
        setBooleanField(term147133, term147133.getClass(), "causedByTouchEvent", false);
        setIntField(term147133, term147133.getClass(), "button", -1635571857);
        setBooleanField(term147133, term147133.getClass(), "popupTrigger", true);
        setBooleanField(term147133, term147133.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term147133, term147133.getClass(), "when", 5671808784468963649L);
        setIntField(term147133, term147133.getClass(), "modifiers", 1407309162);
        setBooleanField(term147133, term147133.getClass(), "canAccessSystemClipboard", false);
        setField(term147133, term147133.getClass(), "bdata", term147146);
        setIntField(term147133, term147133.getClass(), "id", -534033672);
        setBooleanField(term147133, term147133.getClass(), "consumed", false);
        setField(term147152, term147152.getClass(), "location", null);
        setField(term147152, term147152.getClass(), "signers", null);
        setField(term147152, term147152.getClass(), "certs", null);
        setField(term147152, term147152.getClass(), "sp", null);
        setField(term147152, term147152.getClass(), "factory", null);
        setField(term147152, term147152.getClass(), "locationNoFragString", null);
        setField(term147151, term147151.getClass(), "codesource", term147152);
        setField(term147151, term147151.getClass(), "classloader", null);
        setField(term147151, term147151.getClass(), "principals", term147153);
        setField(term147151, term147151.getClass(), "permissions", null);
        setBooleanField(term147151, term147151.getClass(), "hasAllPerm", false);
        setBooleanField(term147151, term147151.getClass(), "staticPermissions", false);
        setField(term147151, term147151.getClass(), "key", null);
        setElement(term147150, 0, term147151);
        setField(term147156, term147156.getClass(), "codesource", null);
        setField(term147156, term147156.getClass(), "classloader", null);
        setField(term147156, term147156.getClass(), "principals", null);
        setField(term147156, term147156.getClass(), "permissions", null);
        setBooleanField(term147156, term147156.getClass(), "hasAllPerm", false);
        setBooleanField(term147156, term147156.getClass(), "staticPermissions", false);
        setField(term147156, term147156.getClass(), "key", null);
        setElement(term147150, 1, term147156);
        setField(term147159, term147159.getClass(), "codesource", null);
        setField(term147159, term147159.getClass(), "classloader", null);
        setField(term147159, term147159.getClass(), "principals", null);
        setField(term147159, term147159.getClass(), "permissions", null);
        setBooleanField(term147159, term147159.getClass(), "hasAllPerm", false);
        setBooleanField(term147159, term147159.getClass(), "staticPermissions", false);
        setField(term147159, term147159.getClass(), "key", null);
        setElement(term147150, 2, term147159);
        setField(term147162, term147162.getClass(), "codesource", null);
        setField(term147162, term147162.getClass(), "classloader", null);
        setField(term147162, term147162.getClass(), "principals", null);
        setField(term147162, term147162.getClass(), "permissions", null);
        setBooleanField(term147162, term147162.getClass(), "hasAllPerm", false);
        setBooleanField(term147162, term147162.getClass(), "staticPermissions", false);
        setField(term147162, term147162.getClass(), "key", null);
        setElement(term147150, 3, term147162);
        setField(term147165, term147165.getClass(), "codesource", null);
        setField(term147165, term147165.getClass(), "classloader", null);
        setField(term147165, term147165.getClass(), "principals", null);
        setField(term147165, term147165.getClass(), "permissions", null);
        setBooleanField(term147165, term147165.getClass(), "hasAllPerm", false);
        setBooleanField(term147165, term147165.getClass(), "staticPermissions", false);
        setField(term147165, term147165.getClass(), "key", null);
        setElement(term147150, 4, term147165);
        setField(term147149, term147149.getClass(), "context", term147150);
        setBooleanField(term147149, term147149.getClass(), "isPrivileged", true);
        setBooleanField(term147149, term147149.getClass(), "isAuthorized", true);
        setField(term147170, term147170.getClass(), "context", null);
        setBooleanField(term147170, term147170.getClass(), "isPrivileged", false);
        setBooleanField(term147170, term147170.getClass(), "isAuthorized", false);
        setField(term147170, term147170.getClass(), "privilegedContext", null);
        setField(term147170, term147170.getClass(), "combiner", null);
        setField(term147170, term147170.getClass(), "permissions", null);
        setField(term147170, term147170.getClass(), "parent", null);
        setBooleanField(term147170, term147170.getClass(), "isWrapped", false);
        setBooleanField(term147170, term147170.getClass(), "isLimited", false);
        setField(term147170, term147170.getClass(), "limitedContext", null);
        setField(term147149, term147149.getClass(), "privilegedContext", term147170);
        setField(term147149, term147149.getClass(), "combiner", null);
        setField(term147149, term147149.getClass(), "permissions", null);
        setField(term147149, term147149.getClass(), "parent", null);
        setBooleanField(term147149, term147149.getClass(), "isWrapped", false);
        setBooleanField(term147149, term147149.getClass(), "isLimited", false);
        setField(term147149, term147149.getClass(), "limitedContext", null);
        setField(term147133, term147133.getClass(), "acc", term147149);
        setBooleanField(term147133, term147133.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term147133, term147133.getClass(), "isPosted", false);
        setBooleanField(term147133, term147133.getClass(), "isSystemGenerated", true);
        setField(term147133, term147133.getClass(), "source", term147180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$8");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term147133;
        callMethod(klass, "mouseClicked", argTypes, term147132, args);
    }

};


