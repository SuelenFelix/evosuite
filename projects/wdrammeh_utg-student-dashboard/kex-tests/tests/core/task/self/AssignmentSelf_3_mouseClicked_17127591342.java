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

public class AssignmentSelf_3_mouseClicked_17127591342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65498;
     Object term65499;

    public AssignmentSelf_3_mouseClicked_17127591342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65498 = newInstance(Class.forName("core.task.self.AssignmentSelf$3"));
        setField(term65498, term65498.getClass(), "this$0", null);
        term65499 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term65512 = (byte[]) newByteArray(7);
        Object term65522 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term65523 = (Object[]) newArray("java.security.ProtectionDomain", 9);
        Object term65524 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65525 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term65526 = (Object[]) newArray("java.security.Principal", 5);
        Object term65529 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65532 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65535 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65538 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65541 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65544 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65547 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65550 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65555 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term65565 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term65499, term65499.getClass(), "x", -1367122405);
        setIntField(term65499, term65499.getClass(), "y", -1703625118);
        setIntField(term65499, term65499.getClass(), "xAbs", 1104108112);
        setIntField(term65499, term65499.getClass(), "yAbs", 1648665618);
        setIntField(term65499, term65499.getClass(), "clickCount", 633765954);
        setBooleanField(term65499, term65499.getClass(), "causedByTouchEvent", false);
        setIntField(term65499, term65499.getClass(), "button", 269110087);
        setBooleanField(term65499, term65499.getClass(), "popupTrigger", false);
        setBooleanField(term65499, term65499.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term65499, term65499.getClass(), "when", -8338004844694486146L);
        setIntField(term65499, term65499.getClass(), "modifiers", 1545119095);
        setBooleanField(term65499, term65499.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term65512, 0, (byte) -2);
        setByteElement(term65512, 1, (byte) -16);
        setByteElement(term65512, 2, (byte) -112);
        setByteElement(term65512, 3, (byte) -111);
        setByteElement(term65512, 4, (byte) 23);
        setByteElement(term65512, 5, (byte) -15);
        setByteElement(term65512, 6, (byte) 36);
        setField(term65499, term65499.getClass(), "bdata", term65512);
        setIntField(term65499, term65499.getClass(), "id", 1671229683);
        setBooleanField(term65499, term65499.getClass(), "consumed", false);
        setField(term65525, term65525.getClass(), "location", null);
        setField(term65525, term65525.getClass(), "signers", null);
        setField(term65525, term65525.getClass(), "certs", null);
        setField(term65525, term65525.getClass(), "sp", null);
        setField(term65525, term65525.getClass(), "factory", null);
        setField(term65525, term65525.getClass(), "locationNoFragString", null);
        setField(term65524, term65524.getClass(), "codesource", term65525);
        setField(term65524, term65524.getClass(), "classloader", null);
        setField(term65524, term65524.getClass(), "principals", term65526);
        setField(term65524, term65524.getClass(), "permissions", null);
        setBooleanField(term65524, term65524.getClass(), "hasAllPerm", false);
        setBooleanField(term65524, term65524.getClass(), "staticPermissions", false);
        setField(term65524, term65524.getClass(), "key", null);
        setElement(term65523, 0, term65524);
        setField(term65529, term65529.getClass(), "codesource", null);
        setField(term65529, term65529.getClass(), "classloader", null);
        setField(term65529, term65529.getClass(), "principals", null);
        setField(term65529, term65529.getClass(), "permissions", null);
        setBooleanField(term65529, term65529.getClass(), "hasAllPerm", false);
        setBooleanField(term65529, term65529.getClass(), "staticPermissions", false);
        setField(term65529, term65529.getClass(), "key", null);
        setElement(term65523, 1, term65529);
        setField(term65532, term65532.getClass(), "codesource", null);
        setField(term65532, term65532.getClass(), "classloader", null);
        setField(term65532, term65532.getClass(), "principals", null);
        setField(term65532, term65532.getClass(), "permissions", null);
        setBooleanField(term65532, term65532.getClass(), "hasAllPerm", false);
        setBooleanField(term65532, term65532.getClass(), "staticPermissions", false);
        setField(term65532, term65532.getClass(), "key", null);
        setElement(term65523, 2, term65532);
        setField(term65535, term65535.getClass(), "codesource", null);
        setField(term65535, term65535.getClass(), "classloader", null);
        setField(term65535, term65535.getClass(), "principals", null);
        setField(term65535, term65535.getClass(), "permissions", null);
        setBooleanField(term65535, term65535.getClass(), "hasAllPerm", false);
        setBooleanField(term65535, term65535.getClass(), "staticPermissions", false);
        setField(term65535, term65535.getClass(), "key", null);
        setElement(term65523, 3, term65535);
        setField(term65538, term65538.getClass(), "codesource", null);
        setField(term65538, term65538.getClass(), "classloader", null);
        setField(term65538, term65538.getClass(), "principals", null);
        setField(term65538, term65538.getClass(), "permissions", null);
        setBooleanField(term65538, term65538.getClass(), "hasAllPerm", false);
        setBooleanField(term65538, term65538.getClass(), "staticPermissions", false);
        setField(term65538, term65538.getClass(), "key", null);
        setElement(term65523, 4, term65538);
        setField(term65541, term65541.getClass(), "codesource", null);
        setField(term65541, term65541.getClass(), "classloader", null);
        setField(term65541, term65541.getClass(), "principals", null);
        setField(term65541, term65541.getClass(), "permissions", null);
        setBooleanField(term65541, term65541.getClass(), "hasAllPerm", false);
        setBooleanField(term65541, term65541.getClass(), "staticPermissions", false);
        setField(term65541, term65541.getClass(), "key", null);
        setElement(term65523, 5, term65541);
        setField(term65544, term65544.getClass(), "codesource", null);
        setField(term65544, term65544.getClass(), "classloader", null);
        setField(term65544, term65544.getClass(), "principals", null);
        setField(term65544, term65544.getClass(), "permissions", null);
        setBooleanField(term65544, term65544.getClass(), "hasAllPerm", false);
        setBooleanField(term65544, term65544.getClass(), "staticPermissions", false);
        setField(term65544, term65544.getClass(), "key", null);
        setElement(term65523, 6, term65544);
        setField(term65547, term65547.getClass(), "codesource", null);
        setField(term65547, term65547.getClass(), "classloader", null);
        setField(term65547, term65547.getClass(), "principals", null);
        setField(term65547, term65547.getClass(), "permissions", null);
        setBooleanField(term65547, term65547.getClass(), "hasAllPerm", false);
        setBooleanField(term65547, term65547.getClass(), "staticPermissions", false);
        setField(term65547, term65547.getClass(), "key", null);
        setElement(term65523, 7, term65547);
        setField(term65550, term65550.getClass(), "codesource", null);
        setField(term65550, term65550.getClass(), "classloader", null);
        setField(term65550, term65550.getClass(), "principals", null);
        setField(term65550, term65550.getClass(), "permissions", null);
        setBooleanField(term65550, term65550.getClass(), "hasAllPerm", false);
        setBooleanField(term65550, term65550.getClass(), "staticPermissions", false);
        setField(term65550, term65550.getClass(), "key", null);
        setElement(term65523, 8, term65550);
        setField(term65522, term65522.getClass(), "context", term65523);
        setBooleanField(term65522, term65522.getClass(), "isPrivileged", false);
        setBooleanField(term65522, term65522.getClass(), "isAuthorized", true);
        setField(term65555, term65555.getClass(), "context", null);
        setBooleanField(term65555, term65555.getClass(), "isPrivileged", false);
        setBooleanField(term65555, term65555.getClass(), "isAuthorized", false);
        setField(term65555, term65555.getClass(), "privilegedContext", null);
        setField(term65555, term65555.getClass(), "combiner", null);
        setField(term65555, term65555.getClass(), "permissions", null);
        setField(term65555, term65555.getClass(), "parent", null);
        setBooleanField(term65555, term65555.getClass(), "isWrapped", false);
        setBooleanField(term65555, term65555.getClass(), "isLimited", false);
        setField(term65555, term65555.getClass(), "limitedContext", null);
        setField(term65522, term65522.getClass(), "privilegedContext", term65555);
        setField(term65522, term65522.getClass(), "combiner", null);
        setField(term65522, term65522.getClass(), "permissions", null);
        setField(term65522, term65522.getClass(), "parent", null);
        setBooleanField(term65522, term65522.getClass(), "isWrapped", false);
        setBooleanField(term65522, term65522.getClass(), "isLimited", false);
        setField(term65522, term65522.getClass(), "limitedContext", null);
        setField(term65499, term65499.getClass(), "acc", term65522);
        setBooleanField(term65499, term65499.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term65499, term65499.getClass(), "isPosted", true);
        setBooleanField(term65499, term65499.getClass(), "isSystemGenerated", false);
        setField(term65499, term65499.getClass(), "source", term65565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term65499;
        callMethod(klass, "mouseClicked", argTypes, term65498, args);
    }

};


