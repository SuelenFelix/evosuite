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

public class ModuleHandler_ModuleYear_1_mousePressed_800517712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327535;
     Object term327536;

    public ModuleHandler_ModuleYear_1_mousePressed_800517712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327535 = newInstance(Class.forName("core.module.ModuleHandler$ModuleYear$1"));
        setField(term327535, term327535.getClass(), "this$0", null);
        term327536 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term327549 = (byte[]) newByteArray(1);
        Object term327553 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term327554 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term327555 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term327556 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term327557 = (Object[]) newArray("java.security.Principal", 4);
        Object term327560 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term327563 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term327566 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term327569 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term327572 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term327575 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term327578 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term327583 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term327593 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term327536, term327536.getClass(), "x", 748487022);
        setIntField(term327536, term327536.getClass(), "y", -706230330);
        setIntField(term327536, term327536.getClass(), "xAbs", -926446006);
        setIntField(term327536, term327536.getClass(), "yAbs", 572417171);
        setIntField(term327536, term327536.getClass(), "clickCount", 46222099);
        setBooleanField(term327536, term327536.getClass(), "causedByTouchEvent", false);
        setIntField(term327536, term327536.getClass(), "button", 1985711069);
        setBooleanField(term327536, term327536.getClass(), "popupTrigger", false);
        setBooleanField(term327536, term327536.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term327536, term327536.getClass(), "when", -5207216109884759743L);
        setIntField(term327536, term327536.getClass(), "modifiers", -1497378582);
        setBooleanField(term327536, term327536.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term327549, 0, (byte) 114);
        setField(term327536, term327536.getClass(), "bdata", term327549);
        setIntField(term327536, term327536.getClass(), "id", -449740668);
        setBooleanField(term327536, term327536.getClass(), "consumed", true);
        setField(term327556, term327556.getClass(), "location", null);
        setField(term327556, term327556.getClass(), "signers", null);
        setField(term327556, term327556.getClass(), "certs", null);
        setField(term327556, term327556.getClass(), "sp", null);
        setField(term327556, term327556.getClass(), "factory", null);
        setField(term327556, term327556.getClass(), "locationNoFragString", null);
        setField(term327555, term327555.getClass(), "codesource", term327556);
        setField(term327555, term327555.getClass(), "classloader", null);
        setField(term327555, term327555.getClass(), "principals", term327557);
        setField(term327555, term327555.getClass(), "permissions", null);
        setBooleanField(term327555, term327555.getClass(), "hasAllPerm", false);
        setBooleanField(term327555, term327555.getClass(), "staticPermissions", false);
        setField(term327555, term327555.getClass(), "key", null);
        setElement(term327554, 0, term327555);
        setField(term327560, term327560.getClass(), "codesource", null);
        setField(term327560, term327560.getClass(), "classloader", null);
        setField(term327560, term327560.getClass(), "principals", null);
        setField(term327560, term327560.getClass(), "permissions", null);
        setBooleanField(term327560, term327560.getClass(), "hasAllPerm", false);
        setBooleanField(term327560, term327560.getClass(), "staticPermissions", false);
        setField(term327560, term327560.getClass(), "key", null);
        setElement(term327554, 1, term327560);
        setField(term327563, term327563.getClass(), "codesource", null);
        setField(term327563, term327563.getClass(), "classloader", null);
        setField(term327563, term327563.getClass(), "principals", null);
        setField(term327563, term327563.getClass(), "permissions", null);
        setBooleanField(term327563, term327563.getClass(), "hasAllPerm", false);
        setBooleanField(term327563, term327563.getClass(), "staticPermissions", false);
        setField(term327563, term327563.getClass(), "key", null);
        setElement(term327554, 2, term327563);
        setField(term327566, term327566.getClass(), "codesource", null);
        setField(term327566, term327566.getClass(), "classloader", null);
        setField(term327566, term327566.getClass(), "principals", null);
        setField(term327566, term327566.getClass(), "permissions", null);
        setBooleanField(term327566, term327566.getClass(), "hasAllPerm", false);
        setBooleanField(term327566, term327566.getClass(), "staticPermissions", false);
        setField(term327566, term327566.getClass(), "key", null);
        setElement(term327554, 3, term327566);
        setField(term327569, term327569.getClass(), "codesource", null);
        setField(term327569, term327569.getClass(), "classloader", null);
        setField(term327569, term327569.getClass(), "principals", null);
        setField(term327569, term327569.getClass(), "permissions", null);
        setBooleanField(term327569, term327569.getClass(), "hasAllPerm", false);
        setBooleanField(term327569, term327569.getClass(), "staticPermissions", false);
        setField(term327569, term327569.getClass(), "key", null);
        setElement(term327554, 4, term327569);
        setField(term327572, term327572.getClass(), "codesource", null);
        setField(term327572, term327572.getClass(), "classloader", null);
        setField(term327572, term327572.getClass(), "principals", null);
        setField(term327572, term327572.getClass(), "permissions", null);
        setBooleanField(term327572, term327572.getClass(), "hasAllPerm", false);
        setBooleanField(term327572, term327572.getClass(), "staticPermissions", false);
        setField(term327572, term327572.getClass(), "key", null);
        setElement(term327554, 5, term327572);
        setField(term327575, term327575.getClass(), "codesource", null);
        setField(term327575, term327575.getClass(), "classloader", null);
        setField(term327575, term327575.getClass(), "principals", null);
        setField(term327575, term327575.getClass(), "permissions", null);
        setBooleanField(term327575, term327575.getClass(), "hasAllPerm", false);
        setBooleanField(term327575, term327575.getClass(), "staticPermissions", false);
        setField(term327575, term327575.getClass(), "key", null);
        setElement(term327554, 6, term327575);
        setField(term327578, term327578.getClass(), "codesource", null);
        setField(term327578, term327578.getClass(), "classloader", null);
        setField(term327578, term327578.getClass(), "principals", null);
        setField(term327578, term327578.getClass(), "permissions", null);
        setBooleanField(term327578, term327578.getClass(), "hasAllPerm", false);
        setBooleanField(term327578, term327578.getClass(), "staticPermissions", false);
        setField(term327578, term327578.getClass(), "key", null);
        setElement(term327554, 7, term327578);
        setField(term327553, term327553.getClass(), "context", term327554);
        setBooleanField(term327553, term327553.getClass(), "isPrivileged", false);
        setBooleanField(term327553, term327553.getClass(), "isAuthorized", false);
        setField(term327583, term327583.getClass(), "context", null);
        setBooleanField(term327583, term327583.getClass(), "isPrivileged", false);
        setBooleanField(term327583, term327583.getClass(), "isAuthorized", false);
        setField(term327583, term327583.getClass(), "privilegedContext", null);
        setField(term327583, term327583.getClass(), "combiner", null);
        setField(term327583, term327583.getClass(), "permissions", null);
        setField(term327583, term327583.getClass(), "parent", null);
        setBooleanField(term327583, term327583.getClass(), "isWrapped", false);
        setBooleanField(term327583, term327583.getClass(), "isLimited", false);
        setField(term327583, term327583.getClass(), "limitedContext", null);
        setField(term327553, term327553.getClass(), "privilegedContext", term327583);
        setField(term327553, term327553.getClass(), "combiner", null);
        setField(term327553, term327553.getClass(), "permissions", null);
        setField(term327553, term327553.getClass(), "parent", null);
        setBooleanField(term327553, term327553.getClass(), "isWrapped", false);
        setBooleanField(term327553, term327553.getClass(), "isLimited", false);
        setField(term327553, term327553.getClass(), "limitedContext", null);
        setField(term327536, term327536.getClass(), "acc", term327553);
        setBooleanField(term327536, term327536.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term327536, term327536.getClass(), "isPosted", false);
        setBooleanField(term327536, term327536.getClass(), "isSystemGenerated", false);
        setField(term327536, term327536.getClass(), "source", term327593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleYear$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term327536;
        callMethod(klass, "mousePressed", argTypes, term327535, args);
    }

};


