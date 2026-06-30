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

public class AssignmentSelf_3_mouseEntered_14751675701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65448;
     Object term65449;

    public AssignmentSelf_3_mouseEntered_14751675701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65448 = newInstance(Class.forName("core.task.self.AssignmentSelf$3"));
        setField(term65448, term65448.getClass(), "this$0", null);
        term65449 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term65462 = (byte[]) newByteArray(5);
        Object term65470 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term65471 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term65472 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65473 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term65474 = (Object[]) newArray("java.security.Principal", 0);
        Object term65477 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65482 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term65492 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term65449, term65449.getClass(), "x", 1238598518);
        setIntField(term65449, term65449.getClass(), "y", -558146961);
        setIntField(term65449, term65449.getClass(), "xAbs", 1505480070);
        setIntField(term65449, term65449.getClass(), "yAbs", -829088844);
        setIntField(term65449, term65449.getClass(), "clickCount", -31751777);
        setBooleanField(term65449, term65449.getClass(), "causedByTouchEvent", true);
        setIntField(term65449, term65449.getClass(), "button", -246967963);
        setBooleanField(term65449, term65449.getClass(), "popupTrigger", true);
        setBooleanField(term65449, term65449.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term65449, term65449.getClass(), "when", 3288941170644426558L);
        setIntField(term65449, term65449.getClass(), "modifiers", -1777140369);
        setBooleanField(term65449, term65449.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term65462, 0, (byte) 67);
        setByteElement(term65462, 1, (byte) 78);
        setByteElement(term65462, 2, (byte) 87);
        setByteElement(term65462, 3, (byte) 121);
        setByteElement(term65462, 4, (byte) -99);
        setField(term65449, term65449.getClass(), "bdata", term65462);
        setIntField(term65449, term65449.getClass(), "id", 993627098);
        setBooleanField(term65449, term65449.getClass(), "consumed", true);
        setField(term65473, term65473.getClass(), "location", null);
        setField(term65473, term65473.getClass(), "signers", null);
        setField(term65473, term65473.getClass(), "certs", null);
        setField(term65473, term65473.getClass(), "sp", null);
        setField(term65473, term65473.getClass(), "factory", null);
        setField(term65473, term65473.getClass(), "locationNoFragString", null);
        setField(term65472, term65472.getClass(), "codesource", term65473);
        setField(term65472, term65472.getClass(), "classloader", null);
        setField(term65472, term65472.getClass(), "principals", term65474);
        setField(term65472, term65472.getClass(), "permissions", null);
        setBooleanField(term65472, term65472.getClass(), "hasAllPerm", false);
        setBooleanField(term65472, term65472.getClass(), "staticPermissions", false);
        setField(term65472, term65472.getClass(), "key", null);
        setElement(term65471, 0, term65472);
        setField(term65477, term65477.getClass(), "codesource", null);
        setField(term65477, term65477.getClass(), "classloader", null);
        setField(term65477, term65477.getClass(), "principals", null);
        setField(term65477, term65477.getClass(), "permissions", null);
        setBooleanField(term65477, term65477.getClass(), "hasAllPerm", false);
        setBooleanField(term65477, term65477.getClass(), "staticPermissions", false);
        setField(term65477, term65477.getClass(), "key", null);
        setElement(term65471, 1, term65477);
        setField(term65470, term65470.getClass(), "context", term65471);
        setBooleanField(term65470, term65470.getClass(), "isPrivileged", false);
        setBooleanField(term65470, term65470.getClass(), "isAuthorized", false);
        setField(term65482, term65482.getClass(), "context", null);
        setBooleanField(term65482, term65482.getClass(), "isPrivileged", false);
        setBooleanField(term65482, term65482.getClass(), "isAuthorized", false);
        setField(term65482, term65482.getClass(), "privilegedContext", null);
        setField(term65482, term65482.getClass(), "combiner", null);
        setField(term65482, term65482.getClass(), "permissions", null);
        setField(term65482, term65482.getClass(), "parent", null);
        setBooleanField(term65482, term65482.getClass(), "isWrapped", false);
        setBooleanField(term65482, term65482.getClass(), "isLimited", false);
        setField(term65482, term65482.getClass(), "limitedContext", null);
        setField(term65470, term65470.getClass(), "privilegedContext", term65482);
        setField(term65470, term65470.getClass(), "combiner", null);
        setField(term65470, term65470.getClass(), "permissions", null);
        setField(term65470, term65470.getClass(), "parent", null);
        setBooleanField(term65470, term65470.getClass(), "isWrapped", false);
        setBooleanField(term65470, term65470.getClass(), "isLimited", false);
        setField(term65470, term65470.getClass(), "limitedContext", null);
        setField(term65449, term65449.getClass(), "acc", term65470);
        setBooleanField(term65449, term65449.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term65449, term65449.getClass(), "isPosted", true);
        setBooleanField(term65449, term65449.getClass(), "isSystemGenerated", false);
        setField(term65449, term65449.getClass(), "source", term65492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term65449;
        callMethod(klass, "mouseEntered", argTypes, term65448, args);
    }

};


