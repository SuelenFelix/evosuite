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

public class ModuleAnalysis_1_mouseClicked_20109637831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296855;
     Object term296856;

    public ModuleAnalysis_1_mouseClicked_20109637831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296855 = newInstance(Class.forName("core.module.ModuleAnalysis$1"));
        setField(term296855, term296855.getClass(), "this$0", null);
        term296856 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term296869 = (byte[]) newByteArray(4);
        Object term296876 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term296877 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term296878 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term296879 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term296880 = (Object[]) newArray("java.security.Principal", 8);
        Object term296883 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term296886 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term296889 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term296892 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term296895 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term296900 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term296910 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term296856, term296856.getClass(), "x", 1678025090);
        setIntField(term296856, term296856.getClass(), "y", 714453255);
        setIntField(term296856, term296856.getClass(), "xAbs", 2096762388);
        setIntField(term296856, term296856.getClass(), "yAbs", -1646872343);
        setIntField(term296856, term296856.getClass(), "clickCount", -140841633);
        setBooleanField(term296856, term296856.getClass(), "causedByTouchEvent", true);
        setIntField(term296856, term296856.getClass(), "button", 1970986976);
        setBooleanField(term296856, term296856.getClass(), "popupTrigger", false);
        setBooleanField(term296856, term296856.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term296856, term296856.getClass(), "when", 6465987664600701876L);
        setIntField(term296856, term296856.getClass(), "modifiers", 530909877);
        setBooleanField(term296856, term296856.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term296869, 0, (byte) -75);
        setByteElement(term296869, 1, (byte) 69);
        setByteElement(term296869, 2, (byte) -6);
        setByteElement(term296869, 3, (byte) 107);
        setField(term296856, term296856.getClass(), "bdata", term296869);
        setIntField(term296856, term296856.getClass(), "id", -123945804);
        setBooleanField(term296856, term296856.getClass(), "consumed", true);
        setField(term296879, term296879.getClass(), "location", null);
        setField(term296879, term296879.getClass(), "signers", null);
        setField(term296879, term296879.getClass(), "certs", null);
        setField(term296879, term296879.getClass(), "sp", null);
        setField(term296879, term296879.getClass(), "factory", null);
        setField(term296879, term296879.getClass(), "locationNoFragString", null);
        setField(term296878, term296878.getClass(), "codesource", term296879);
        setField(term296878, term296878.getClass(), "classloader", null);
        setField(term296878, term296878.getClass(), "principals", term296880);
        setField(term296878, term296878.getClass(), "permissions", null);
        setBooleanField(term296878, term296878.getClass(), "hasAllPerm", false);
        setBooleanField(term296878, term296878.getClass(), "staticPermissions", false);
        setField(term296878, term296878.getClass(), "key", null);
        setElement(term296877, 0, term296878);
        setField(term296883, term296883.getClass(), "codesource", null);
        setField(term296883, term296883.getClass(), "classloader", null);
        setField(term296883, term296883.getClass(), "principals", null);
        setField(term296883, term296883.getClass(), "permissions", null);
        setBooleanField(term296883, term296883.getClass(), "hasAllPerm", false);
        setBooleanField(term296883, term296883.getClass(), "staticPermissions", false);
        setField(term296883, term296883.getClass(), "key", null);
        setElement(term296877, 1, term296883);
        setField(term296886, term296886.getClass(), "codesource", null);
        setField(term296886, term296886.getClass(), "classloader", null);
        setField(term296886, term296886.getClass(), "principals", null);
        setField(term296886, term296886.getClass(), "permissions", null);
        setBooleanField(term296886, term296886.getClass(), "hasAllPerm", false);
        setBooleanField(term296886, term296886.getClass(), "staticPermissions", false);
        setField(term296886, term296886.getClass(), "key", null);
        setElement(term296877, 2, term296886);
        setField(term296889, term296889.getClass(), "codesource", null);
        setField(term296889, term296889.getClass(), "classloader", null);
        setField(term296889, term296889.getClass(), "principals", null);
        setField(term296889, term296889.getClass(), "permissions", null);
        setBooleanField(term296889, term296889.getClass(), "hasAllPerm", false);
        setBooleanField(term296889, term296889.getClass(), "staticPermissions", false);
        setField(term296889, term296889.getClass(), "key", null);
        setElement(term296877, 3, term296889);
        setField(term296892, term296892.getClass(), "codesource", null);
        setField(term296892, term296892.getClass(), "classloader", null);
        setField(term296892, term296892.getClass(), "principals", null);
        setField(term296892, term296892.getClass(), "permissions", null);
        setBooleanField(term296892, term296892.getClass(), "hasAllPerm", false);
        setBooleanField(term296892, term296892.getClass(), "staticPermissions", false);
        setField(term296892, term296892.getClass(), "key", null);
        setElement(term296877, 4, term296892);
        setField(term296895, term296895.getClass(), "codesource", null);
        setField(term296895, term296895.getClass(), "classloader", null);
        setField(term296895, term296895.getClass(), "principals", null);
        setField(term296895, term296895.getClass(), "permissions", null);
        setBooleanField(term296895, term296895.getClass(), "hasAllPerm", false);
        setBooleanField(term296895, term296895.getClass(), "staticPermissions", false);
        setField(term296895, term296895.getClass(), "key", null);
        setElement(term296877, 5, term296895);
        setField(term296876, term296876.getClass(), "context", term296877);
        setBooleanField(term296876, term296876.getClass(), "isPrivileged", false);
        setBooleanField(term296876, term296876.getClass(), "isAuthorized", true);
        setField(term296900, term296900.getClass(), "context", null);
        setBooleanField(term296900, term296900.getClass(), "isPrivileged", false);
        setBooleanField(term296900, term296900.getClass(), "isAuthorized", false);
        setField(term296900, term296900.getClass(), "privilegedContext", null);
        setField(term296900, term296900.getClass(), "combiner", null);
        setField(term296900, term296900.getClass(), "permissions", null);
        setField(term296900, term296900.getClass(), "parent", null);
        setBooleanField(term296900, term296900.getClass(), "isWrapped", false);
        setBooleanField(term296900, term296900.getClass(), "isLimited", false);
        setField(term296900, term296900.getClass(), "limitedContext", null);
        setField(term296876, term296876.getClass(), "privilegedContext", term296900);
        setField(term296876, term296876.getClass(), "combiner", null);
        setField(term296876, term296876.getClass(), "permissions", null);
        setField(term296876, term296876.getClass(), "parent", null);
        setBooleanField(term296876, term296876.getClass(), "isWrapped", false);
        setBooleanField(term296876, term296876.getClass(), "isLimited", false);
        setField(term296876, term296876.getClass(), "limitedContext", null);
        setField(term296856, term296856.getClass(), "acc", term296876);
        setBooleanField(term296856, term296856.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term296856, term296856.getClass(), "isPosted", true);
        setBooleanField(term296856, term296856.getClass(), "isSystemGenerated", false);
        setField(term296856, term296856.getClass(), "source", term296910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term296856;
        callMethod(klass, "mouseClicked", argTypes, term296855, args);
    }

};


