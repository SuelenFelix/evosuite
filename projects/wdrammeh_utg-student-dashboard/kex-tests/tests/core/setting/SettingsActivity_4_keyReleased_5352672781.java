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

public class SettingsActivity_4_keyReleased_5352672781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144383;
     Object term144384;

    public SettingsActivity_4_keyReleased_5352672781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144383 = newInstance(Class.forName("core.setting.SettingsActivity$4"));
        term144384 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term144396 = (byte[]) newByteArray(2);
        Object term144401 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term144402 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term144403 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term144404 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term144405 = (Object[]) newArray("java.security.Principal", 0);
        Object term144408 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term144411 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term144414 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term144417 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term144420 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term144425 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term144435 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term144384, term144384.getClass(), "isProxyActive", false);
        setIntField(term144384, term144384.getClass(), "keyCode", 196952878);
        setCharField(term144384, term144384.getClass(), "keyChar", 'J');
        setIntField(term144384, term144384.getClass(), "keyLocation", 802673242);
        setLongField(term144384, term144384.getClass(), "rawCode", 1667122142089513324L);
        setLongField(term144384, term144384.getClass(), "primaryLevelUnicode", -6342139649364011743L);
        setLongField(term144384, term144384.getClass(), "scancode", -4924950707540628022L);
        setLongField(term144384, term144384.getClass(), "extendedKeyCode", -4393710401270724527L);
        setField(term144384, term144384.getClass(), "originalSource", null);
        setLongField(term144384, term144384.getClass(), "when", -4822736661741380518L);
        setIntField(term144384, term144384.getClass(), "modifiers", -1808638031);
        setBooleanField(term144384, term144384.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term144396, 0, (byte) 71);
        setByteElement(term144396, 1, (byte) 80);
        setField(term144384, term144384.getClass(), "bdata", term144396);
        setIntField(term144384, term144384.getClass(), "id", -1514240086);
        setBooleanField(term144384, term144384.getClass(), "consumed", true);
        setField(term144404, term144404.getClass(), "location", null);
        setField(term144404, term144404.getClass(), "signers", null);
        setField(term144404, term144404.getClass(), "certs", null);
        setField(term144404, term144404.getClass(), "sp", null);
        setField(term144404, term144404.getClass(), "factory", null);
        setField(term144404, term144404.getClass(), "locationNoFragString", null);
        setField(term144403, term144403.getClass(), "codesource", term144404);
        setField(term144403, term144403.getClass(), "classloader", null);
        setField(term144403, term144403.getClass(), "principals", term144405);
        setField(term144403, term144403.getClass(), "permissions", null);
        setBooleanField(term144403, term144403.getClass(), "hasAllPerm", false);
        setBooleanField(term144403, term144403.getClass(), "staticPermissions", false);
        setField(term144403, term144403.getClass(), "key", null);
        setElement(term144402, 0, term144403);
        setField(term144408, term144408.getClass(), "codesource", null);
        setField(term144408, term144408.getClass(), "classloader", null);
        setField(term144408, term144408.getClass(), "principals", null);
        setField(term144408, term144408.getClass(), "permissions", null);
        setBooleanField(term144408, term144408.getClass(), "hasAllPerm", false);
        setBooleanField(term144408, term144408.getClass(), "staticPermissions", false);
        setField(term144408, term144408.getClass(), "key", null);
        setElement(term144402, 1, term144408);
        setField(term144411, term144411.getClass(), "codesource", null);
        setField(term144411, term144411.getClass(), "classloader", null);
        setField(term144411, term144411.getClass(), "principals", null);
        setField(term144411, term144411.getClass(), "permissions", null);
        setBooleanField(term144411, term144411.getClass(), "hasAllPerm", false);
        setBooleanField(term144411, term144411.getClass(), "staticPermissions", false);
        setField(term144411, term144411.getClass(), "key", null);
        setElement(term144402, 2, term144411);
        setField(term144414, term144414.getClass(), "codesource", null);
        setField(term144414, term144414.getClass(), "classloader", null);
        setField(term144414, term144414.getClass(), "principals", null);
        setField(term144414, term144414.getClass(), "permissions", null);
        setBooleanField(term144414, term144414.getClass(), "hasAllPerm", false);
        setBooleanField(term144414, term144414.getClass(), "staticPermissions", false);
        setField(term144414, term144414.getClass(), "key", null);
        setElement(term144402, 3, term144414);
        setField(term144417, term144417.getClass(), "codesource", null);
        setField(term144417, term144417.getClass(), "classloader", null);
        setField(term144417, term144417.getClass(), "principals", null);
        setField(term144417, term144417.getClass(), "permissions", null);
        setBooleanField(term144417, term144417.getClass(), "hasAllPerm", false);
        setBooleanField(term144417, term144417.getClass(), "staticPermissions", false);
        setField(term144417, term144417.getClass(), "key", null);
        setElement(term144402, 4, term144417);
        setField(term144420, term144420.getClass(), "codesource", null);
        setField(term144420, term144420.getClass(), "classloader", null);
        setField(term144420, term144420.getClass(), "principals", null);
        setField(term144420, term144420.getClass(), "permissions", null);
        setBooleanField(term144420, term144420.getClass(), "hasAllPerm", false);
        setBooleanField(term144420, term144420.getClass(), "staticPermissions", false);
        setField(term144420, term144420.getClass(), "key", null);
        setElement(term144402, 5, term144420);
        setField(term144401, term144401.getClass(), "context", term144402);
        setBooleanField(term144401, term144401.getClass(), "isPrivileged", true);
        setBooleanField(term144401, term144401.getClass(), "isAuthorized", false);
        setField(term144425, term144425.getClass(), "context", null);
        setBooleanField(term144425, term144425.getClass(), "isPrivileged", false);
        setBooleanField(term144425, term144425.getClass(), "isAuthorized", false);
        setField(term144425, term144425.getClass(), "privilegedContext", null);
        setField(term144425, term144425.getClass(), "combiner", null);
        setField(term144425, term144425.getClass(), "permissions", null);
        setField(term144425, term144425.getClass(), "parent", null);
        setBooleanField(term144425, term144425.getClass(), "isWrapped", false);
        setBooleanField(term144425, term144425.getClass(), "isLimited", false);
        setField(term144425, term144425.getClass(), "limitedContext", null);
        setField(term144401, term144401.getClass(), "privilegedContext", term144425);
        setField(term144401, term144401.getClass(), "combiner", null);
        setField(term144401, term144401.getClass(), "permissions", null);
        setField(term144401, term144401.getClass(), "parent", null);
        setBooleanField(term144401, term144401.getClass(), "isWrapped", false);
        setBooleanField(term144401, term144401.getClass(), "isLimited", false);
        setField(term144401, term144401.getClass(), "limitedContext", null);
        setField(term144384, term144384.getClass(), "acc", term144401);
        setBooleanField(term144384, term144384.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term144384, term144384.getClass(), "isPosted", true);
        setBooleanField(term144384, term144384.getClass(), "isSystemGenerated", true);
        setField(term144384, term144384.getClass(), "source", term144435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$4");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term144384;
        callMethod(klass, "keyReleased", argTypes, term144383, args);
    }

};


