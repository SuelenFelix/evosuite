package core.task.self;

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
import static core.task.self.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AssignmentSelf_3_mouseExited_12200363863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65573;
     Object term65574;

    public AssignmentSelf_3_mouseExited_12200363863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65573 = newInstance(Class.forName("core.task.self.AssignmentSelf$3"));
        setField(term65573, term65573.getClass(), "this$0", null);
        term65574 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term65587 = (byte[]) newByteArray(2);
        Object term65592 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term65593 = (Object[]) newArray("java.security.ProtectionDomain", 3);
        Object term65594 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65595 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term65596 = (Object[]) newArray("java.security.Principal", 0);
        Object term65599 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65602 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65607 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term65617 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term65574, term65574.getClass(), "x", -1677599962);
        setIntField(term65574, term65574.getClass(), "y", -1790275458);
        setIntField(term65574, term65574.getClass(), "xAbs", -497534255);
        setIntField(term65574, term65574.getClass(), "yAbs", 1588942911);
        setIntField(term65574, term65574.getClass(), "clickCount", -2129828854);
        setBooleanField(term65574, term65574.getClass(), "causedByTouchEvent", true);
        setIntField(term65574, term65574.getClass(), "button", -47438786);
        setBooleanField(term65574, term65574.getClass(), "popupTrigger", true);
        setBooleanField(term65574, term65574.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term65574, term65574.getClass(), "when", 6426732259596412988L);
        setIntField(term65574, term65574.getClass(), "modifiers", -1955400589);
        setBooleanField(term65574, term65574.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term65587, 0, (byte) 118);
        setByteElement(term65587, 1, (byte) 106);
        setField(term65574, term65574.getClass(), "bdata", term65587);
        setIntField(term65574, term65574.getClass(), "id", 626179200);
        setBooleanField(term65574, term65574.getClass(), "consumed", false);
        setField(term65595, term65595.getClass(), "location", null);
        setField(term65595, term65595.getClass(), "signers", null);
        setField(term65595, term65595.getClass(), "certs", null);
        setField(term65595, term65595.getClass(), "sp", null);
        setField(term65595, term65595.getClass(), "factory", null);
        setField(term65595, term65595.getClass(), "locationNoFragString", null);
        setField(term65594, term65594.getClass(), "codesource", term65595);
        setField(term65594, term65594.getClass(), "classloader", null);
        setField(term65594, term65594.getClass(), "principals", term65596);
        setField(term65594, term65594.getClass(), "permissions", null);
        setBooleanField(term65594, term65594.getClass(), "hasAllPerm", false);
        setBooleanField(term65594, term65594.getClass(), "staticPermissions", false);
        setField(term65594, term65594.getClass(), "key", null);
        setElement(term65593, 0, term65594);
        setField(term65599, term65599.getClass(), "codesource", null);
        setField(term65599, term65599.getClass(), "classloader", null);
        setField(term65599, term65599.getClass(), "principals", null);
        setField(term65599, term65599.getClass(), "permissions", null);
        setBooleanField(term65599, term65599.getClass(), "hasAllPerm", false);
        setBooleanField(term65599, term65599.getClass(), "staticPermissions", false);
        setField(term65599, term65599.getClass(), "key", null);
        setElement(term65593, 1, term65599);
        setField(term65602, term65602.getClass(), "codesource", null);
        setField(term65602, term65602.getClass(), "classloader", null);
        setField(term65602, term65602.getClass(), "principals", null);
        setField(term65602, term65602.getClass(), "permissions", null);
        setBooleanField(term65602, term65602.getClass(), "hasAllPerm", false);
        setBooleanField(term65602, term65602.getClass(), "staticPermissions", false);
        setField(term65602, term65602.getClass(), "key", null);
        setElement(term65593, 2, term65602);
        setField(term65592, term65592.getClass(), "context", term65593);
        setBooleanField(term65592, term65592.getClass(), "isPrivileged", false);
        setBooleanField(term65592, term65592.getClass(), "isAuthorized", false);
        setField(term65607, term65607.getClass(), "context", null);
        setBooleanField(term65607, term65607.getClass(), "isPrivileged", false);
        setBooleanField(term65607, term65607.getClass(), "isAuthorized", false);
        setField(term65607, term65607.getClass(), "privilegedContext", null);
        setField(term65607, term65607.getClass(), "combiner", null);
        setField(term65607, term65607.getClass(), "permissions", null);
        setField(term65607, term65607.getClass(), "parent", null);
        setBooleanField(term65607, term65607.getClass(), "isWrapped", false);
        setBooleanField(term65607, term65607.getClass(), "isLimited", false);
        setField(term65607, term65607.getClass(), "limitedContext", null);
        setField(term65592, term65592.getClass(), "privilegedContext", term65607);
        setField(term65592, term65592.getClass(), "combiner", null);
        setField(term65592, term65592.getClass(), "permissions", null);
        setField(term65592, term65592.getClass(), "parent", null);
        setBooleanField(term65592, term65592.getClass(), "isWrapped", false);
        setBooleanField(term65592, term65592.getClass(), "isLimited", false);
        setField(term65592, term65592.getClass(), "limitedContext", null);
        setField(term65574, term65574.getClass(), "acc", term65592);
        setBooleanField(term65574, term65574.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term65574, term65574.getClass(), "isPosted", true);
        setBooleanField(term65574, term65574.getClass(), "isSystemGenerated", false);
        setField(term65574, term65574.getClass(), "source", term65617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term65574;
        callMethod(klass, "mouseExited", argTypes, term65573, args);
    }

};


