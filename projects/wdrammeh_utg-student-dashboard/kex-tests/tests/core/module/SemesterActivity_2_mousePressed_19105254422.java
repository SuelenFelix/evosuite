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

public class SemesterActivity_2_mousePressed_19105254422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101973;
     Object term101974;

    public SemesterActivity_2_mousePressed_19105254422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101973 = newInstance(Class.forName("core.module.SemesterActivity$2"));
        setField(term101973, term101973.getClass(), "this$0", null);
        term101974 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term101987 = (byte[]) newByteArray(4);
        Object term101994 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term101995 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term101996 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term101997 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term101998 = (Object[]) newArray("java.security.Principal", 4);
        Object term102001 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term102004 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term102007 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term102010 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term102013 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term102018 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term102028 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term101974, term101974.getClass(), "x", -1286686332);
        setIntField(term101974, term101974.getClass(), "y", -284885486);
        setIntField(term101974, term101974.getClass(), "xAbs", 1791984446);
        setIntField(term101974, term101974.getClass(), "yAbs", 804070622);
        setIntField(term101974, term101974.getClass(), "clickCount", 1850364894);
        setBooleanField(term101974, term101974.getClass(), "causedByTouchEvent", true);
        setIntField(term101974, term101974.getClass(), "button", 915367534);
        setBooleanField(term101974, term101974.getClass(), "popupTrigger", false);
        setBooleanField(term101974, term101974.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term101974, term101974.getClass(), "when", 6617340557564669657L);
        setIntField(term101974, term101974.getClass(), "modifiers", 1949983666);
        setBooleanField(term101974, term101974.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term101987, 0, (byte) 82);
        setByteElement(term101987, 1, (byte) -89);
        setByteElement(term101987, 2, (byte) 24);
        setByteElement(term101987, 3, (byte) 123);
        setField(term101974, term101974.getClass(), "bdata", term101987);
        setIntField(term101974, term101974.getClass(), "id", 154111854);
        setBooleanField(term101974, term101974.getClass(), "consumed", true);
        setField(term101997, term101997.getClass(), "location", null);
        setField(term101997, term101997.getClass(), "signers", null);
        setField(term101997, term101997.getClass(), "certs", null);
        setField(term101997, term101997.getClass(), "sp", null);
        setField(term101997, term101997.getClass(), "factory", null);
        setField(term101997, term101997.getClass(), "locationNoFragString", null);
        setField(term101996, term101996.getClass(), "codesource", term101997);
        setField(term101996, term101996.getClass(), "classloader", null);
        setField(term101996, term101996.getClass(), "principals", term101998);
        setField(term101996, term101996.getClass(), "permissions", null);
        setBooleanField(term101996, term101996.getClass(), "hasAllPerm", false);
        setBooleanField(term101996, term101996.getClass(), "staticPermissions", false);
        setField(term101996, term101996.getClass(), "key", null);
        setElement(term101995, 0, term101996);
        setField(term102001, term102001.getClass(), "codesource", null);
        setField(term102001, term102001.getClass(), "classloader", null);
        setField(term102001, term102001.getClass(), "principals", null);
        setField(term102001, term102001.getClass(), "permissions", null);
        setBooleanField(term102001, term102001.getClass(), "hasAllPerm", false);
        setBooleanField(term102001, term102001.getClass(), "staticPermissions", false);
        setField(term102001, term102001.getClass(), "key", null);
        setElement(term101995, 1, term102001);
        setField(term102004, term102004.getClass(), "codesource", null);
        setField(term102004, term102004.getClass(), "classloader", null);
        setField(term102004, term102004.getClass(), "principals", null);
        setField(term102004, term102004.getClass(), "permissions", null);
        setBooleanField(term102004, term102004.getClass(), "hasAllPerm", false);
        setBooleanField(term102004, term102004.getClass(), "staticPermissions", false);
        setField(term102004, term102004.getClass(), "key", null);
        setElement(term101995, 2, term102004);
        setField(term102007, term102007.getClass(), "codesource", null);
        setField(term102007, term102007.getClass(), "classloader", null);
        setField(term102007, term102007.getClass(), "principals", null);
        setField(term102007, term102007.getClass(), "permissions", null);
        setBooleanField(term102007, term102007.getClass(), "hasAllPerm", false);
        setBooleanField(term102007, term102007.getClass(), "staticPermissions", false);
        setField(term102007, term102007.getClass(), "key", null);
        setElement(term101995, 3, term102007);
        setField(term102010, term102010.getClass(), "codesource", null);
        setField(term102010, term102010.getClass(), "classloader", null);
        setField(term102010, term102010.getClass(), "principals", null);
        setField(term102010, term102010.getClass(), "permissions", null);
        setBooleanField(term102010, term102010.getClass(), "hasAllPerm", false);
        setBooleanField(term102010, term102010.getClass(), "staticPermissions", false);
        setField(term102010, term102010.getClass(), "key", null);
        setElement(term101995, 4, term102010);
        setField(term102013, term102013.getClass(), "codesource", null);
        setField(term102013, term102013.getClass(), "classloader", null);
        setField(term102013, term102013.getClass(), "principals", null);
        setField(term102013, term102013.getClass(), "permissions", null);
        setBooleanField(term102013, term102013.getClass(), "hasAllPerm", false);
        setBooleanField(term102013, term102013.getClass(), "staticPermissions", false);
        setField(term102013, term102013.getClass(), "key", null);
        setElement(term101995, 5, term102013);
        setField(term101994, term101994.getClass(), "context", term101995);
        setBooleanField(term101994, term101994.getClass(), "isPrivileged", false);
        setBooleanField(term101994, term101994.getClass(), "isAuthorized", true);
        setField(term102018, term102018.getClass(), "context", null);
        setBooleanField(term102018, term102018.getClass(), "isPrivileged", false);
        setBooleanField(term102018, term102018.getClass(), "isAuthorized", false);
        setField(term102018, term102018.getClass(), "privilegedContext", null);
        setField(term102018, term102018.getClass(), "combiner", null);
        setField(term102018, term102018.getClass(), "permissions", null);
        setField(term102018, term102018.getClass(), "parent", null);
        setBooleanField(term102018, term102018.getClass(), "isWrapped", false);
        setBooleanField(term102018, term102018.getClass(), "isLimited", false);
        setField(term102018, term102018.getClass(), "limitedContext", null);
        setField(term101994, term101994.getClass(), "privilegedContext", term102018);
        setField(term101994, term101994.getClass(), "combiner", null);
        setField(term101994, term101994.getClass(), "permissions", null);
        setField(term101994, term101994.getClass(), "parent", null);
        setBooleanField(term101994, term101994.getClass(), "isWrapped", false);
        setBooleanField(term101994, term101994.getClass(), "isLimited", false);
        setField(term101994, term101994.getClass(), "limitedContext", null);
        setField(term101974, term101974.getClass(), "acc", term101994);
        setBooleanField(term101974, term101974.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term101974, term101974.getClass(), "isPosted", false);
        setBooleanField(term101974, term101974.getClass(), "isSystemGenerated", false);
        setField(term101974, term101974.getClass(), "source", term102028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SemesterActivity$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term101974;
        callMethod(klass, "mousePressed", argTypes, term101973, args);
    }

};


