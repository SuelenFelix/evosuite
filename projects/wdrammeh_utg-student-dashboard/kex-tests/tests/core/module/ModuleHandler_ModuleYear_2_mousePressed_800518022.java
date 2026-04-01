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

public class ModuleHandler_ModuleYear_2_mousePressed_800518022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337196;
     Object term337197;

    public ModuleHandler_ModuleYear_2_mousePressed_800518022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337196 = newInstance(Class.forName("core.module.ModuleHandler$ModuleYear$2"));
        setField(term337196, term337196.getClass(), "this$0", null);
        term337197 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term337210 = (byte[]) newByteArray(4);
        Object term337217 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term337218 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term337219 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term337220 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term337221 = (Object[]) newArray("java.security.Principal", 4);
        Object term337224 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term337227 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term337230 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term337233 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term337238 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term337248 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term337197, term337197.getClass(), "x", 732187274);
        setIntField(term337197, term337197.getClass(), "y", 1495500544);
        setIntField(term337197, term337197.getClass(), "xAbs", -610532968);
        setIntField(term337197, term337197.getClass(), "yAbs", -1034929475);
        setIntField(term337197, term337197.getClass(), "clickCount", 2125774573);
        setBooleanField(term337197, term337197.getClass(), "causedByTouchEvent", false);
        setIntField(term337197, term337197.getClass(), "button", -1338560431);
        setBooleanField(term337197, term337197.getClass(), "popupTrigger", false);
        setBooleanField(term337197, term337197.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term337197, term337197.getClass(), "when", -278716491237139968L);
        setIntField(term337197, term337197.getClass(), "modifiers", 1768827963);
        setBooleanField(term337197, term337197.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term337210, 0, (byte) -72);
        setByteElement(term337210, 1, (byte) 90);
        setByteElement(term337210, 2, (byte) -34);
        setByteElement(term337210, 3, (byte) -2);
        setField(term337197, term337197.getClass(), "bdata", term337210);
        setIntField(term337197, term337197.getClass(), "id", -456155591);
        setBooleanField(term337197, term337197.getClass(), "consumed", false);
        setField(term337220, term337220.getClass(), "location", null);
        setField(term337220, term337220.getClass(), "signers", null);
        setField(term337220, term337220.getClass(), "certs", null);
        setField(term337220, term337220.getClass(), "sp", null);
        setField(term337220, term337220.getClass(), "factory", null);
        setField(term337220, term337220.getClass(), "locationNoFragString", null);
        setField(term337219, term337219.getClass(), "codesource", term337220);
        setField(term337219, term337219.getClass(), "classloader", null);
        setField(term337219, term337219.getClass(), "principals", term337221);
        setField(term337219, term337219.getClass(), "permissions", null);
        setBooleanField(term337219, term337219.getClass(), "hasAllPerm", false);
        setBooleanField(term337219, term337219.getClass(), "staticPermissions", false);
        setField(term337219, term337219.getClass(), "key", null);
        setElement(term337218, 0, term337219);
        setField(term337224, term337224.getClass(), "codesource", null);
        setField(term337224, term337224.getClass(), "classloader", null);
        setField(term337224, term337224.getClass(), "principals", null);
        setField(term337224, term337224.getClass(), "permissions", null);
        setBooleanField(term337224, term337224.getClass(), "hasAllPerm", false);
        setBooleanField(term337224, term337224.getClass(), "staticPermissions", false);
        setField(term337224, term337224.getClass(), "key", null);
        setElement(term337218, 1, term337224);
        setField(term337227, term337227.getClass(), "codesource", null);
        setField(term337227, term337227.getClass(), "classloader", null);
        setField(term337227, term337227.getClass(), "principals", null);
        setField(term337227, term337227.getClass(), "permissions", null);
        setBooleanField(term337227, term337227.getClass(), "hasAllPerm", false);
        setBooleanField(term337227, term337227.getClass(), "staticPermissions", false);
        setField(term337227, term337227.getClass(), "key", null);
        setElement(term337218, 2, term337227);
        setField(term337230, term337230.getClass(), "codesource", null);
        setField(term337230, term337230.getClass(), "classloader", null);
        setField(term337230, term337230.getClass(), "principals", null);
        setField(term337230, term337230.getClass(), "permissions", null);
        setBooleanField(term337230, term337230.getClass(), "hasAllPerm", false);
        setBooleanField(term337230, term337230.getClass(), "staticPermissions", false);
        setField(term337230, term337230.getClass(), "key", null);
        setElement(term337218, 3, term337230);
        setField(term337233, term337233.getClass(), "codesource", null);
        setField(term337233, term337233.getClass(), "classloader", null);
        setField(term337233, term337233.getClass(), "principals", null);
        setField(term337233, term337233.getClass(), "permissions", null);
        setBooleanField(term337233, term337233.getClass(), "hasAllPerm", false);
        setBooleanField(term337233, term337233.getClass(), "staticPermissions", false);
        setField(term337233, term337233.getClass(), "key", null);
        setElement(term337218, 4, term337233);
        setField(term337217, term337217.getClass(), "context", term337218);
        setBooleanField(term337217, term337217.getClass(), "isPrivileged", false);
        setBooleanField(term337217, term337217.getClass(), "isAuthorized", false);
        setField(term337238, term337238.getClass(), "context", null);
        setBooleanField(term337238, term337238.getClass(), "isPrivileged", false);
        setBooleanField(term337238, term337238.getClass(), "isAuthorized", false);
        setField(term337238, term337238.getClass(), "privilegedContext", null);
        setField(term337238, term337238.getClass(), "combiner", null);
        setField(term337238, term337238.getClass(), "permissions", null);
        setField(term337238, term337238.getClass(), "parent", null);
        setBooleanField(term337238, term337238.getClass(), "isWrapped", false);
        setBooleanField(term337238, term337238.getClass(), "isLimited", false);
        setField(term337238, term337238.getClass(), "limitedContext", null);
        setField(term337217, term337217.getClass(), "privilegedContext", term337238);
        setField(term337217, term337217.getClass(), "combiner", null);
        setField(term337217, term337217.getClass(), "permissions", null);
        setField(term337217, term337217.getClass(), "parent", null);
        setBooleanField(term337217, term337217.getClass(), "isWrapped", false);
        setBooleanField(term337217, term337217.getClass(), "isLimited", false);
        setField(term337217, term337217.getClass(), "limitedContext", null);
        setField(term337197, term337197.getClass(), "acc", term337217);
        setBooleanField(term337197, term337197.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term337197, term337197.getClass(), "isPosted", false);
        setBooleanField(term337197, term337197.getClass(), "isSystemGenerated", true);
        setField(term337197, term337197.getClass(), "source", term337248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleYear$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term337197;
        callMethod(klass, "mousePressed", argTypes, term337196, args);
    }

};


