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
     Object term278633;
     Object term278634;

    public AssignmentSelf_3_mouseEntered_14751675701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278633 = newInstance(Class.forName("core.task.self.AssignmentSelf$3"));
        setField(term278633, term278633.getClass(), "this$0", null);
        term278634 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term278647 = (byte[]) newByteArray(7);
        Object term278657 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term278658 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term278659 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term278660 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term278661 = (Object[]) newArray("java.security.Principal", 1);
        Object term278664 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term278669 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term278679 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term278634, term278634.getClass(), "x", -1867539151);
        setIntField(term278634, term278634.getClass(), "y", -816430246);
        setIntField(term278634, term278634.getClass(), "xAbs", 1754193865);
        setIntField(term278634, term278634.getClass(), "yAbs", 25277058);
        setIntField(term278634, term278634.getClass(), "clickCount", -949634053);
        setBooleanField(term278634, term278634.getClass(), "causedByTouchEvent", false);
        setIntField(term278634, term278634.getClass(), "button", 1495471055);
        setBooleanField(term278634, term278634.getClass(), "popupTrigger", false);
        setBooleanField(term278634, term278634.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term278634, term278634.getClass(), "when", -3718250311794019732L);
        setIntField(term278634, term278634.getClass(), "modifiers", -583415628);
        setBooleanField(term278634, term278634.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term278647, 0, (byte) -53);
        setByteElement(term278647, 1, (byte) -8);
        setByteElement(term278647, 2, (byte) -9);
        setByteElement(term278647, 3, (byte) 97);
        setByteElement(term278647, 4, (byte) -46);
        setByteElement(term278647, 5, (byte) 14);
        setByteElement(term278647, 6, (byte) 34);
        setField(term278634, term278634.getClass(), "bdata", term278647);
        setIntField(term278634, term278634.getClass(), "id", -1488660931);
        setBooleanField(term278634, term278634.getClass(), "consumed", true);
        setField(term278660, term278660.getClass(), "location", null);
        setField(term278660, term278660.getClass(), "signers", null);
        setField(term278660, term278660.getClass(), "certs", null);
        setField(term278660, term278660.getClass(), "sp", null);
        setField(term278660, term278660.getClass(), "factory", null);
        setField(term278660, term278660.getClass(), "locationNoFragString", null);
        setField(term278659, term278659.getClass(), "codesource", term278660);
        setField(term278659, term278659.getClass(), "classloader", null);
        setField(term278659, term278659.getClass(), "principals", term278661);
        setField(term278659, term278659.getClass(), "permissions", null);
        setBooleanField(term278659, term278659.getClass(), "hasAllPerm", false);
        setBooleanField(term278659, term278659.getClass(), "staticPermissions", false);
        setField(term278659, term278659.getClass(), "key", null);
        setElement(term278658, 0, term278659);
        setField(term278664, term278664.getClass(), "codesource", null);
        setField(term278664, term278664.getClass(), "classloader", null);
        setField(term278664, term278664.getClass(), "principals", null);
        setField(term278664, term278664.getClass(), "permissions", null);
        setBooleanField(term278664, term278664.getClass(), "hasAllPerm", false);
        setBooleanField(term278664, term278664.getClass(), "staticPermissions", false);
        setField(term278664, term278664.getClass(), "key", null);
        setElement(term278658, 1, term278664);
        setField(term278657, term278657.getClass(), "context", term278658);
        setBooleanField(term278657, term278657.getClass(), "isPrivileged", true);
        setBooleanField(term278657, term278657.getClass(), "isAuthorized", false);
        setField(term278669, term278669.getClass(), "context", null);
        setBooleanField(term278669, term278669.getClass(), "isPrivileged", false);
        setBooleanField(term278669, term278669.getClass(), "isAuthorized", false);
        setField(term278669, term278669.getClass(), "privilegedContext", null);
        setField(term278669, term278669.getClass(), "combiner", null);
        setField(term278669, term278669.getClass(), "permissions", null);
        setField(term278669, term278669.getClass(), "parent", null);
        setBooleanField(term278669, term278669.getClass(), "isWrapped", false);
        setBooleanField(term278669, term278669.getClass(), "isLimited", false);
        setField(term278669, term278669.getClass(), "limitedContext", null);
        setField(term278657, term278657.getClass(), "privilegedContext", term278669);
        setField(term278657, term278657.getClass(), "combiner", null);
        setField(term278657, term278657.getClass(), "permissions", null);
        setField(term278657, term278657.getClass(), "parent", null);
        setBooleanField(term278657, term278657.getClass(), "isWrapped", false);
        setBooleanField(term278657, term278657.getClass(), "isLimited", false);
        setField(term278657, term278657.getClass(), "limitedContext", null);
        setField(term278634, term278634.getClass(), "acc", term278657);
        setBooleanField(term278634, term278634.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term278634, term278634.getClass(), "isPosted", true);
        setBooleanField(term278634, term278634.getClass(), "isSystemGenerated", false);
        setField(term278634, term278634.getClass(), "source", term278679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term278634;
        callMethod(klass, "mouseEntered", argTypes, term278633, args);
    }

};


