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
     Object term952;
     Object term953;

    public SettingsActivity_4_keyReleased_5352672781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term952 = newInstance(Class.forName("core.setting.SettingsActivity$4"));
        term953 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term965 = (byte[]) newByteArray(1);
        Object term969 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term970 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term971 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term972 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term973 = (Object[]) newArray("java.security.Principal", 7);
        Object term976 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term979 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term982 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term985 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term988 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term993 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1003 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term953, term953.getClass(), "isProxyActive", true);
        setIntField(term953, term953.getClass(), "keyCode", -1371869594);
        setCharField(term953, term953.getClass(), "keyChar", 'P');
        setIntField(term953, term953.getClass(), "keyLocation", -2095575670);
        setLongField(term953, term953.getClass(), "rawCode", 4872422362414183754L);
        setLongField(term953, term953.getClass(), "primaryLevelUnicode", 6811161968424632369L);
        setLongField(term953, term953.getClass(), "scancode", -7237588299778557629L);
        setLongField(term953, term953.getClass(), "extendedKeyCode", 6967924379644551255L);
        setField(term953, term953.getClass(), "originalSource", null);
        setLongField(term953, term953.getClass(), "when", -2813493605142626659L);
        setIntField(term953, term953.getClass(), "modifiers", 1225272962);
        setBooleanField(term953, term953.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term965, 0, (byte) 47);
        setField(term953, term953.getClass(), "bdata", term965);
        setIntField(term953, term953.getClass(), "id", 1324040357);
        setBooleanField(term953, term953.getClass(), "consumed", true);
        setField(term972, term972.getClass(), "location", null);
        setField(term972, term972.getClass(), "signers", null);
        setField(term972, term972.getClass(), "certs", null);
        setField(term972, term972.getClass(), "sp", null);
        setField(term972, term972.getClass(), "factory", null);
        setField(term972, term972.getClass(), "locationNoFragString", null);
        setField(term971, term971.getClass(), "codesource", term972);
        setField(term971, term971.getClass(), "classloader", null);
        setField(term971, term971.getClass(), "principals", term973);
        setField(term971, term971.getClass(), "permissions", null);
        setBooleanField(term971, term971.getClass(), "hasAllPerm", false);
        setBooleanField(term971, term971.getClass(), "staticPermissions", false);
        setField(term971, term971.getClass(), "key", null);
        setElement(term970, 0, term971);
        setField(term976, term976.getClass(), "codesource", null);
        setField(term976, term976.getClass(), "classloader", null);
        setField(term976, term976.getClass(), "principals", null);
        setField(term976, term976.getClass(), "permissions", null);
        setBooleanField(term976, term976.getClass(), "hasAllPerm", false);
        setBooleanField(term976, term976.getClass(), "staticPermissions", false);
        setField(term976, term976.getClass(), "key", null);
        setElement(term970, 1, term976);
        setField(term979, term979.getClass(), "codesource", null);
        setField(term979, term979.getClass(), "classloader", null);
        setField(term979, term979.getClass(), "principals", null);
        setField(term979, term979.getClass(), "permissions", null);
        setBooleanField(term979, term979.getClass(), "hasAllPerm", false);
        setBooleanField(term979, term979.getClass(), "staticPermissions", false);
        setField(term979, term979.getClass(), "key", null);
        setElement(term970, 2, term979);
        setField(term982, term982.getClass(), "codesource", null);
        setField(term982, term982.getClass(), "classloader", null);
        setField(term982, term982.getClass(), "principals", null);
        setField(term982, term982.getClass(), "permissions", null);
        setBooleanField(term982, term982.getClass(), "hasAllPerm", false);
        setBooleanField(term982, term982.getClass(), "staticPermissions", false);
        setField(term982, term982.getClass(), "key", null);
        setElement(term970, 3, term982);
        setField(term985, term985.getClass(), "codesource", null);
        setField(term985, term985.getClass(), "classloader", null);
        setField(term985, term985.getClass(), "principals", null);
        setField(term985, term985.getClass(), "permissions", null);
        setBooleanField(term985, term985.getClass(), "hasAllPerm", false);
        setBooleanField(term985, term985.getClass(), "staticPermissions", false);
        setField(term985, term985.getClass(), "key", null);
        setElement(term970, 4, term985);
        setField(term988, term988.getClass(), "codesource", null);
        setField(term988, term988.getClass(), "classloader", null);
        setField(term988, term988.getClass(), "principals", null);
        setField(term988, term988.getClass(), "permissions", null);
        setBooleanField(term988, term988.getClass(), "hasAllPerm", false);
        setBooleanField(term988, term988.getClass(), "staticPermissions", false);
        setField(term988, term988.getClass(), "key", null);
        setElement(term970, 5, term988);
        setField(term969, term969.getClass(), "context", term970);
        setBooleanField(term969, term969.getClass(), "isPrivileged", true);
        setBooleanField(term969, term969.getClass(), "isAuthorized", false);
        setField(term993, term993.getClass(), "context", null);
        setBooleanField(term993, term993.getClass(), "isPrivileged", false);
        setBooleanField(term993, term993.getClass(), "isAuthorized", false);
        setField(term993, term993.getClass(), "privilegedContext", null);
        setField(term993, term993.getClass(), "combiner", null);
        setField(term993, term993.getClass(), "permissions", null);
        setField(term993, term993.getClass(), "parent", null);
        setBooleanField(term993, term993.getClass(), "isWrapped", false);
        setBooleanField(term993, term993.getClass(), "isLimited", false);
        setField(term993, term993.getClass(), "limitedContext", null);
        setField(term969, term969.getClass(), "privilegedContext", term993);
        setField(term969, term969.getClass(), "combiner", null);
        setField(term969, term969.getClass(), "permissions", null);
        setField(term969, term969.getClass(), "parent", null);
        setBooleanField(term969, term969.getClass(), "isWrapped", false);
        setBooleanField(term969, term969.getClass(), "isLimited", false);
        setField(term969, term969.getClass(), "limitedContext", null);
        setField(term953, term953.getClass(), "acc", term969);
        setBooleanField(term953, term953.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term953, term953.getClass(), "isPosted", true);
        setBooleanField(term953, term953.getClass(), "isSystemGenerated", false);
        setField(term953, term953.getClass(), "source", term1003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$4");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term953;
        callMethod(klass, "keyReleased", argTypes, term952, args);
    }

};


