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

public class MiscHandler_1_mousePressed_4461481741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87333;
     Object term87334;

    public MiscHandler_1_mousePressed_4461481741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87333 = newInstance(Class.forName("core.module.MiscHandler$1"));
        setField(term87333, term87333.getClass(), "this$0", null);
        term87334 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term87347 = (byte[]) newByteArray(5);
        Object term87355 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term87356 = (Object[]) newArray("java.security.ProtectionDomain", 3);
        Object term87357 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term87358 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term87359 = (Object[]) newArray("java.security.Principal", 9);
        Object term87362 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term87365 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term87370 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term87380 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term87334, term87334.getClass(), "x", -1538936030);
        setIntField(term87334, term87334.getClass(), "y", -752870423);
        setIntField(term87334, term87334.getClass(), "xAbs", -1698809299);
        setIntField(term87334, term87334.getClass(), "yAbs", 401512128);
        setIntField(term87334, term87334.getClass(), "clickCount", -2069930777);
        setBooleanField(term87334, term87334.getClass(), "causedByTouchEvent", false);
        setIntField(term87334, term87334.getClass(), "button", 1543696412);
        setBooleanField(term87334, term87334.getClass(), "popupTrigger", true);
        setBooleanField(term87334, term87334.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term87334, term87334.getClass(), "when", -2585684163342970173L);
        setIntField(term87334, term87334.getClass(), "modifiers", -1385748168);
        setBooleanField(term87334, term87334.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term87347, 0, (byte) -61);
        setByteElement(term87347, 1, (byte) -85);
        setByteElement(term87347, 2, (byte) -22);
        setByteElement(term87347, 3, (byte) 93);
        setByteElement(term87347, 4, (byte) 69);
        setField(term87334, term87334.getClass(), "bdata", term87347);
        setIntField(term87334, term87334.getClass(), "id", -270592367);
        setBooleanField(term87334, term87334.getClass(), "consumed", true);
        setField(term87358, term87358.getClass(), "location", null);
        setField(term87358, term87358.getClass(), "signers", null);
        setField(term87358, term87358.getClass(), "certs", null);
        setField(term87358, term87358.getClass(), "sp", null);
        setField(term87358, term87358.getClass(), "factory", null);
        setField(term87358, term87358.getClass(), "locationNoFragString", null);
        setField(term87357, term87357.getClass(), "codesource", term87358);
        setField(term87357, term87357.getClass(), "classloader", null);
        setField(term87357, term87357.getClass(), "principals", term87359);
        setField(term87357, term87357.getClass(), "permissions", null);
        setBooleanField(term87357, term87357.getClass(), "hasAllPerm", false);
        setBooleanField(term87357, term87357.getClass(), "staticPermissions", false);
        setField(term87357, term87357.getClass(), "key", null);
        setElement(term87356, 0, term87357);
        setField(term87362, term87362.getClass(), "codesource", null);
        setField(term87362, term87362.getClass(), "classloader", null);
        setField(term87362, term87362.getClass(), "principals", null);
        setField(term87362, term87362.getClass(), "permissions", null);
        setBooleanField(term87362, term87362.getClass(), "hasAllPerm", false);
        setBooleanField(term87362, term87362.getClass(), "staticPermissions", false);
        setField(term87362, term87362.getClass(), "key", null);
        setElement(term87356, 1, term87362);
        setField(term87365, term87365.getClass(), "codesource", null);
        setField(term87365, term87365.getClass(), "classloader", null);
        setField(term87365, term87365.getClass(), "principals", null);
        setField(term87365, term87365.getClass(), "permissions", null);
        setBooleanField(term87365, term87365.getClass(), "hasAllPerm", false);
        setBooleanField(term87365, term87365.getClass(), "staticPermissions", false);
        setField(term87365, term87365.getClass(), "key", null);
        setElement(term87356, 2, term87365);
        setField(term87355, term87355.getClass(), "context", term87356);
        setBooleanField(term87355, term87355.getClass(), "isPrivileged", true);
        setBooleanField(term87355, term87355.getClass(), "isAuthorized", false);
        setField(term87370, term87370.getClass(), "context", null);
        setBooleanField(term87370, term87370.getClass(), "isPrivileged", false);
        setBooleanField(term87370, term87370.getClass(), "isAuthorized", false);
        setField(term87370, term87370.getClass(), "privilegedContext", null);
        setField(term87370, term87370.getClass(), "combiner", null);
        setField(term87370, term87370.getClass(), "permissions", null);
        setField(term87370, term87370.getClass(), "parent", null);
        setBooleanField(term87370, term87370.getClass(), "isWrapped", false);
        setBooleanField(term87370, term87370.getClass(), "isLimited", false);
        setField(term87370, term87370.getClass(), "limitedContext", null);
        setField(term87355, term87355.getClass(), "privilegedContext", term87370);
        setField(term87355, term87355.getClass(), "combiner", null);
        setField(term87355, term87355.getClass(), "permissions", null);
        setField(term87355, term87355.getClass(), "parent", null);
        setBooleanField(term87355, term87355.getClass(), "isWrapped", false);
        setBooleanField(term87355, term87355.getClass(), "isLimited", false);
        setField(term87355, term87355.getClass(), "limitedContext", null);
        setField(term87334, term87334.getClass(), "acc", term87355);
        setBooleanField(term87334, term87334.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term87334, term87334.getClass(), "isPosted", true);
        setBooleanField(term87334, term87334.getClass(), "isSystemGenerated", false);
        setField(term87334, term87334.getClass(), "source", term87380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term87334;
        callMethod(klass, "mousePressed", argTypes, term87333, args);
    }

};


