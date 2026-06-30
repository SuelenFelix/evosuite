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

public class ModuleHandler_ModuleYear_1_mouseReleased_3980773763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108629;
     Object term108630;

    public ModuleHandler_ModuleYear_1_mouseReleased_3980773763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108629 = newInstance(Class.forName("core.module.ModuleHandler$ModuleYear$1"));
        setField(term108629, term108629.getClass(), "this$0", null);
        term108630 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term108643 = (byte[]) newByteArray(3);
        Object term108649 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term108650 = (Object[]) newArray("java.security.ProtectionDomain", 9);
        Object term108651 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108652 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term108653 = (Object[]) newArray("java.security.Principal", 9);
        Object term108656 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108659 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108662 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108665 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108668 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108671 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108674 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108677 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108682 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term108692 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term108630, term108630.getClass(), "x", -1527326823);
        setIntField(term108630, term108630.getClass(), "y", 469871899);
        setIntField(term108630, term108630.getClass(), "xAbs", -1348703436);
        setIntField(term108630, term108630.getClass(), "yAbs", -2027012650);
        setIntField(term108630, term108630.getClass(), "clickCount", 1343432022);
        setBooleanField(term108630, term108630.getClass(), "causedByTouchEvent", false);
        setIntField(term108630, term108630.getClass(), "button", -1767079160);
        setBooleanField(term108630, term108630.getClass(), "popupTrigger", true);
        setBooleanField(term108630, term108630.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term108630, term108630.getClass(), "when", -6292278961887936280L);
        setIntField(term108630, term108630.getClass(), "modifiers", -201010601);
        setBooleanField(term108630, term108630.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term108643, 0, (byte) -22);
        setByteElement(term108643, 1, (byte) -5);
        setByteElement(term108643, 2, (byte) -124);
        setField(term108630, term108630.getClass(), "bdata", term108643);
        setIntField(term108630, term108630.getClass(), "id", 2060027076);
        setBooleanField(term108630, term108630.getClass(), "consumed", true);
        setField(term108652, term108652.getClass(), "location", null);
        setField(term108652, term108652.getClass(), "signers", null);
        setField(term108652, term108652.getClass(), "certs", null);
        setField(term108652, term108652.getClass(), "sp", null);
        setField(term108652, term108652.getClass(), "factory", null);
        setField(term108652, term108652.getClass(), "locationNoFragString", null);
        setField(term108651, term108651.getClass(), "codesource", term108652);
        setField(term108651, term108651.getClass(), "classloader", null);
        setField(term108651, term108651.getClass(), "principals", term108653);
        setField(term108651, term108651.getClass(), "permissions", null);
        setBooleanField(term108651, term108651.getClass(), "hasAllPerm", false);
        setBooleanField(term108651, term108651.getClass(), "staticPermissions", false);
        setField(term108651, term108651.getClass(), "key", null);
        setElement(term108650, 0, term108651);
        setField(term108656, term108656.getClass(), "codesource", null);
        setField(term108656, term108656.getClass(), "classloader", null);
        setField(term108656, term108656.getClass(), "principals", null);
        setField(term108656, term108656.getClass(), "permissions", null);
        setBooleanField(term108656, term108656.getClass(), "hasAllPerm", false);
        setBooleanField(term108656, term108656.getClass(), "staticPermissions", false);
        setField(term108656, term108656.getClass(), "key", null);
        setElement(term108650, 1, term108656);
        setField(term108659, term108659.getClass(), "codesource", null);
        setField(term108659, term108659.getClass(), "classloader", null);
        setField(term108659, term108659.getClass(), "principals", null);
        setField(term108659, term108659.getClass(), "permissions", null);
        setBooleanField(term108659, term108659.getClass(), "hasAllPerm", false);
        setBooleanField(term108659, term108659.getClass(), "staticPermissions", false);
        setField(term108659, term108659.getClass(), "key", null);
        setElement(term108650, 2, term108659);
        setField(term108662, term108662.getClass(), "codesource", null);
        setField(term108662, term108662.getClass(), "classloader", null);
        setField(term108662, term108662.getClass(), "principals", null);
        setField(term108662, term108662.getClass(), "permissions", null);
        setBooleanField(term108662, term108662.getClass(), "hasAllPerm", false);
        setBooleanField(term108662, term108662.getClass(), "staticPermissions", false);
        setField(term108662, term108662.getClass(), "key", null);
        setElement(term108650, 3, term108662);
        setField(term108665, term108665.getClass(), "codesource", null);
        setField(term108665, term108665.getClass(), "classloader", null);
        setField(term108665, term108665.getClass(), "principals", null);
        setField(term108665, term108665.getClass(), "permissions", null);
        setBooleanField(term108665, term108665.getClass(), "hasAllPerm", false);
        setBooleanField(term108665, term108665.getClass(), "staticPermissions", false);
        setField(term108665, term108665.getClass(), "key", null);
        setElement(term108650, 4, term108665);
        setField(term108668, term108668.getClass(), "codesource", null);
        setField(term108668, term108668.getClass(), "classloader", null);
        setField(term108668, term108668.getClass(), "principals", null);
        setField(term108668, term108668.getClass(), "permissions", null);
        setBooleanField(term108668, term108668.getClass(), "hasAllPerm", false);
        setBooleanField(term108668, term108668.getClass(), "staticPermissions", false);
        setField(term108668, term108668.getClass(), "key", null);
        setElement(term108650, 5, term108668);
        setField(term108671, term108671.getClass(), "codesource", null);
        setField(term108671, term108671.getClass(), "classloader", null);
        setField(term108671, term108671.getClass(), "principals", null);
        setField(term108671, term108671.getClass(), "permissions", null);
        setBooleanField(term108671, term108671.getClass(), "hasAllPerm", false);
        setBooleanField(term108671, term108671.getClass(), "staticPermissions", false);
        setField(term108671, term108671.getClass(), "key", null);
        setElement(term108650, 6, term108671);
        setField(term108674, term108674.getClass(), "codesource", null);
        setField(term108674, term108674.getClass(), "classloader", null);
        setField(term108674, term108674.getClass(), "principals", null);
        setField(term108674, term108674.getClass(), "permissions", null);
        setBooleanField(term108674, term108674.getClass(), "hasAllPerm", false);
        setBooleanField(term108674, term108674.getClass(), "staticPermissions", false);
        setField(term108674, term108674.getClass(), "key", null);
        setElement(term108650, 7, term108674);
        setField(term108677, term108677.getClass(), "codesource", null);
        setField(term108677, term108677.getClass(), "classloader", null);
        setField(term108677, term108677.getClass(), "principals", null);
        setField(term108677, term108677.getClass(), "permissions", null);
        setBooleanField(term108677, term108677.getClass(), "hasAllPerm", false);
        setBooleanField(term108677, term108677.getClass(), "staticPermissions", false);
        setField(term108677, term108677.getClass(), "key", null);
        setElement(term108650, 8, term108677);
        setField(term108649, term108649.getClass(), "context", term108650);
        setBooleanField(term108649, term108649.getClass(), "isPrivileged", false);
        setBooleanField(term108649, term108649.getClass(), "isAuthorized", false);
        setField(term108682, term108682.getClass(), "context", null);
        setBooleanField(term108682, term108682.getClass(), "isPrivileged", false);
        setBooleanField(term108682, term108682.getClass(), "isAuthorized", false);
        setField(term108682, term108682.getClass(), "privilegedContext", null);
        setField(term108682, term108682.getClass(), "combiner", null);
        setField(term108682, term108682.getClass(), "permissions", null);
        setField(term108682, term108682.getClass(), "parent", null);
        setBooleanField(term108682, term108682.getClass(), "isWrapped", false);
        setBooleanField(term108682, term108682.getClass(), "isLimited", false);
        setField(term108682, term108682.getClass(), "limitedContext", null);
        setField(term108649, term108649.getClass(), "privilegedContext", term108682);
        setField(term108649, term108649.getClass(), "combiner", null);
        setField(term108649, term108649.getClass(), "permissions", null);
        setField(term108649, term108649.getClass(), "parent", null);
        setBooleanField(term108649, term108649.getClass(), "isWrapped", false);
        setBooleanField(term108649, term108649.getClass(), "isLimited", false);
        setField(term108649, term108649.getClass(), "limitedContext", null);
        setField(term108630, term108630.getClass(), "acc", term108649);
        setBooleanField(term108630, term108630.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term108630, term108630.getClass(), "isPosted", false);
        setBooleanField(term108630, term108630.getClass(), "isSystemGenerated", true);
        setField(term108630, term108630.getClass(), "source", term108692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleYear$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term108630;
        callMethod(klass, "mouseReleased", argTypes, term108629, args);
    }

};


