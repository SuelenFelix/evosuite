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
import java.util.ArrayList;
import java.lang.Object;

public class ModuleAnalysis_6_mouseClicked_20109639381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287408;
     Object term287425;

    public ModuleAnalysis_6_mouseClicked_20109639381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term287421 = new ArrayList();
        term287408 = newInstance(Class.forName("core.module.ModuleAnalysis$6"));
        setField(term287408, term287408.getClass(), "val$semTex", "WnEAVdCxna");
        setField(term287408, term287408.getClass(), "val$fractionalSem", term287421);
        setField(term287408, term287408.getClass(), "this$0", null);
        term287425 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term287438 = (byte[]) newByteArray(8);
        Object term287449 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term287450 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term287451 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term287452 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term287453 = (Object[]) newArray("java.security.Principal", 1);
        Object term287456 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term287459 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term287462 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term287465 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term287468 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term287473 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term287483 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term287425, term287425.getClass(), "x", -1455026066);
        setIntField(term287425, term287425.getClass(), "y", -169160528);
        setIntField(term287425, term287425.getClass(), "xAbs", 951748736);
        setIntField(term287425, term287425.getClass(), "yAbs", 787260842);
        setIntField(term287425, term287425.getClass(), "clickCount", -137516512);
        setBooleanField(term287425, term287425.getClass(), "causedByTouchEvent", true);
        setIntField(term287425, term287425.getClass(), "button", -585134115);
        setBooleanField(term287425, term287425.getClass(), "popupTrigger", true);
        setBooleanField(term287425, term287425.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term287425, term287425.getClass(), "when", -532956263280568707L);
        setIntField(term287425, term287425.getClass(), "modifiers", 1435872700);
        setBooleanField(term287425, term287425.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term287438, 0, (byte) -120);
        setByteElement(term287438, 1, (byte) 96);
        setByteElement(term287438, 2, (byte) -41);
        setByteElement(term287438, 3, (byte) -88);
        setByteElement(term287438, 4, (byte) 39);
        setByteElement(term287438, 5, (byte) -1);
        setByteElement(term287438, 6, (byte) 117);
        setByteElement(term287438, 7, (byte) 43);
        setField(term287425, term287425.getClass(), "bdata", term287438);
        setIntField(term287425, term287425.getClass(), "id", 1421496660);
        setBooleanField(term287425, term287425.getClass(), "consumed", true);
        setField(term287452, term287452.getClass(), "location", null);
        setField(term287452, term287452.getClass(), "signers", null);
        setField(term287452, term287452.getClass(), "certs", null);
        setField(term287452, term287452.getClass(), "sp", null);
        setField(term287452, term287452.getClass(), "factory", null);
        setField(term287452, term287452.getClass(), "locationNoFragString", null);
        setField(term287451, term287451.getClass(), "codesource", term287452);
        setField(term287451, term287451.getClass(), "classloader", null);
        setField(term287451, term287451.getClass(), "principals", term287453);
        setField(term287451, term287451.getClass(), "permissions", null);
        setBooleanField(term287451, term287451.getClass(), "hasAllPerm", false);
        setBooleanField(term287451, term287451.getClass(), "staticPermissions", false);
        setField(term287451, term287451.getClass(), "key", null);
        setElement(term287450, 0, term287451);
        setField(term287456, term287456.getClass(), "codesource", null);
        setField(term287456, term287456.getClass(), "classloader", null);
        setField(term287456, term287456.getClass(), "principals", null);
        setField(term287456, term287456.getClass(), "permissions", null);
        setBooleanField(term287456, term287456.getClass(), "hasAllPerm", false);
        setBooleanField(term287456, term287456.getClass(), "staticPermissions", false);
        setField(term287456, term287456.getClass(), "key", null);
        setElement(term287450, 1, term287456);
        setField(term287459, term287459.getClass(), "codesource", null);
        setField(term287459, term287459.getClass(), "classloader", null);
        setField(term287459, term287459.getClass(), "principals", null);
        setField(term287459, term287459.getClass(), "permissions", null);
        setBooleanField(term287459, term287459.getClass(), "hasAllPerm", false);
        setBooleanField(term287459, term287459.getClass(), "staticPermissions", false);
        setField(term287459, term287459.getClass(), "key", null);
        setElement(term287450, 2, term287459);
        setField(term287462, term287462.getClass(), "codesource", null);
        setField(term287462, term287462.getClass(), "classloader", null);
        setField(term287462, term287462.getClass(), "principals", null);
        setField(term287462, term287462.getClass(), "permissions", null);
        setBooleanField(term287462, term287462.getClass(), "hasAllPerm", false);
        setBooleanField(term287462, term287462.getClass(), "staticPermissions", false);
        setField(term287462, term287462.getClass(), "key", null);
        setElement(term287450, 3, term287462);
        setField(term287465, term287465.getClass(), "codesource", null);
        setField(term287465, term287465.getClass(), "classloader", null);
        setField(term287465, term287465.getClass(), "principals", null);
        setField(term287465, term287465.getClass(), "permissions", null);
        setBooleanField(term287465, term287465.getClass(), "hasAllPerm", false);
        setBooleanField(term287465, term287465.getClass(), "staticPermissions", false);
        setField(term287465, term287465.getClass(), "key", null);
        setElement(term287450, 4, term287465);
        setField(term287468, term287468.getClass(), "codesource", null);
        setField(term287468, term287468.getClass(), "classloader", null);
        setField(term287468, term287468.getClass(), "principals", null);
        setField(term287468, term287468.getClass(), "permissions", null);
        setBooleanField(term287468, term287468.getClass(), "hasAllPerm", false);
        setBooleanField(term287468, term287468.getClass(), "staticPermissions", false);
        setField(term287468, term287468.getClass(), "key", null);
        setElement(term287450, 5, term287468);
        setField(term287449, term287449.getClass(), "context", term287450);
        setBooleanField(term287449, term287449.getClass(), "isPrivileged", true);
        setBooleanField(term287449, term287449.getClass(), "isAuthorized", true);
        setField(term287473, term287473.getClass(), "context", null);
        setBooleanField(term287473, term287473.getClass(), "isPrivileged", false);
        setBooleanField(term287473, term287473.getClass(), "isAuthorized", false);
        setField(term287473, term287473.getClass(), "privilegedContext", null);
        setField(term287473, term287473.getClass(), "combiner", null);
        setField(term287473, term287473.getClass(), "permissions", null);
        setField(term287473, term287473.getClass(), "parent", null);
        setBooleanField(term287473, term287473.getClass(), "isWrapped", false);
        setBooleanField(term287473, term287473.getClass(), "isLimited", false);
        setField(term287473, term287473.getClass(), "limitedContext", null);
        setField(term287449, term287449.getClass(), "privilegedContext", term287473);
        setField(term287449, term287449.getClass(), "combiner", null);
        setField(term287449, term287449.getClass(), "permissions", null);
        setField(term287449, term287449.getClass(), "parent", null);
        setBooleanField(term287449, term287449.getClass(), "isWrapped", false);
        setBooleanField(term287449, term287449.getClass(), "isLimited", false);
        setField(term287449, term287449.getClass(), "limitedContext", null);
        setField(term287425, term287425.getClass(), "acc", term287449);
        setBooleanField(term287425, term287425.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term287425, term287425.getClass(), "isPosted", false);
        setBooleanField(term287425, term287425.getClass(), "isSystemGenerated", false);
        setField(term287425, term287425.getClass(), "source", term287483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$6");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term287425;
        callMethod(klass, "mouseClicked", argTypes, term287408, args);
    }

};


