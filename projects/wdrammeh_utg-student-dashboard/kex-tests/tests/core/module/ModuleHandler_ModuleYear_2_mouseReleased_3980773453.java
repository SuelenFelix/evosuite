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

public class ModuleHandler_ModuleYear_2_mouseReleased_3980773453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118014;
     Object term118015;

    public ModuleHandler_ModuleYear_2_mouseReleased_3980773453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118014 = newInstance(Class.forName("core.module.ModuleHandler$ModuleYear$2"));
        setField(term118014, term118014.getClass(), "this$0", null);
        term118015 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term118028 = (byte[]) newByteArray(6);
        Object term118037 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term118038 = (Object[]) newArray("java.security.ProtectionDomain", 3);
        Object term118039 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term118040 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term118041 = (Object[]) newArray("java.security.Principal", 7);
        Object term118044 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term118047 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term118052 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term118062 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term118015, term118015.getClass(), "x", 919602316);
        setIntField(term118015, term118015.getClass(), "y", 1833713431);
        setIntField(term118015, term118015.getClass(), "xAbs", -706222608);
        setIntField(term118015, term118015.getClass(), "yAbs", -2003607923);
        setIntField(term118015, term118015.getClass(), "clickCount", 1378805929);
        setBooleanField(term118015, term118015.getClass(), "causedByTouchEvent", false);
        setIntField(term118015, term118015.getClass(), "button", 695052304);
        setBooleanField(term118015, term118015.getClass(), "popupTrigger", true);
        setBooleanField(term118015, term118015.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term118015, term118015.getClass(), "when", -1154553077993834885L);
        setIntField(term118015, term118015.getClass(), "modifiers", -179937218);
        setBooleanField(term118015, term118015.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term118028, 0, (byte) 122);
        setByteElement(term118028, 1, (byte) 83);
        setByteElement(term118028, 2, (byte) -123);
        setByteElement(term118028, 3, (byte) -76);
        setByteElement(term118028, 4, (byte) -115);
        setByteElement(term118028, 5, (byte) -48);
        setField(term118015, term118015.getClass(), "bdata", term118028);
        setIntField(term118015, term118015.getClass(), "id", 940896043);
        setBooleanField(term118015, term118015.getClass(), "consumed", false);
        setField(term118040, term118040.getClass(), "location", null);
        setField(term118040, term118040.getClass(), "signers", null);
        setField(term118040, term118040.getClass(), "certs", null);
        setField(term118040, term118040.getClass(), "sp", null);
        setField(term118040, term118040.getClass(), "factory", null);
        setField(term118040, term118040.getClass(), "locationNoFragString", null);
        setField(term118039, term118039.getClass(), "codesource", term118040);
        setField(term118039, term118039.getClass(), "classloader", null);
        setField(term118039, term118039.getClass(), "principals", term118041);
        setField(term118039, term118039.getClass(), "permissions", null);
        setBooleanField(term118039, term118039.getClass(), "hasAllPerm", false);
        setBooleanField(term118039, term118039.getClass(), "staticPermissions", false);
        setField(term118039, term118039.getClass(), "key", null);
        setElement(term118038, 0, term118039);
        setField(term118044, term118044.getClass(), "codesource", null);
        setField(term118044, term118044.getClass(), "classloader", null);
        setField(term118044, term118044.getClass(), "principals", null);
        setField(term118044, term118044.getClass(), "permissions", null);
        setBooleanField(term118044, term118044.getClass(), "hasAllPerm", false);
        setBooleanField(term118044, term118044.getClass(), "staticPermissions", false);
        setField(term118044, term118044.getClass(), "key", null);
        setElement(term118038, 1, term118044);
        setField(term118047, term118047.getClass(), "codesource", null);
        setField(term118047, term118047.getClass(), "classloader", null);
        setField(term118047, term118047.getClass(), "principals", null);
        setField(term118047, term118047.getClass(), "permissions", null);
        setBooleanField(term118047, term118047.getClass(), "hasAllPerm", false);
        setBooleanField(term118047, term118047.getClass(), "staticPermissions", false);
        setField(term118047, term118047.getClass(), "key", null);
        setElement(term118038, 2, term118047);
        setField(term118037, term118037.getClass(), "context", term118038);
        setBooleanField(term118037, term118037.getClass(), "isPrivileged", false);
        setBooleanField(term118037, term118037.getClass(), "isAuthorized", true);
        setField(term118052, term118052.getClass(), "context", null);
        setBooleanField(term118052, term118052.getClass(), "isPrivileged", false);
        setBooleanField(term118052, term118052.getClass(), "isAuthorized", false);
        setField(term118052, term118052.getClass(), "privilegedContext", null);
        setField(term118052, term118052.getClass(), "combiner", null);
        setField(term118052, term118052.getClass(), "permissions", null);
        setField(term118052, term118052.getClass(), "parent", null);
        setBooleanField(term118052, term118052.getClass(), "isWrapped", false);
        setBooleanField(term118052, term118052.getClass(), "isLimited", false);
        setField(term118052, term118052.getClass(), "limitedContext", null);
        setField(term118037, term118037.getClass(), "privilegedContext", term118052);
        setField(term118037, term118037.getClass(), "combiner", null);
        setField(term118037, term118037.getClass(), "permissions", null);
        setField(term118037, term118037.getClass(), "parent", null);
        setBooleanField(term118037, term118037.getClass(), "isWrapped", false);
        setBooleanField(term118037, term118037.getClass(), "isLimited", false);
        setField(term118037, term118037.getClass(), "limitedContext", null);
        setField(term118015, term118015.getClass(), "acc", term118037);
        setBooleanField(term118015, term118015.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term118015, term118015.getClass(), "isPosted", false);
        setBooleanField(term118015, term118015.getClass(), "isSystemGenerated", false);
        setField(term118015, term118015.getClass(), "source", term118062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleYear$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term118015;
        callMethod(klass, "mouseReleased", argTypes, term118014, args);
    }

};


