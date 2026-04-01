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

public class ModuleHandler_ModuleYear_1_mouseReleased_3980773763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327595;
     Object term327596;

    public ModuleHandler_ModuleYear_1_mouseReleased_3980773763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327595 = newInstance(Class.forName("core.module.ModuleHandler$ModuleYear$1"));
        setField(term327595, term327595.getClass(), "this$0", null);
        term327596 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term327609 = (byte[]) newByteArray(9);
        Object term327621 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term327622 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term327623 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term327624 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term327625 = (Object[]) newArray("java.security.Principal", 2);
        Object term327628 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term327631 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term327634 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term327637 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term327642 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term327652 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term327596, term327596.getClass(), "x", 755500171);
        setIntField(term327596, term327596.getClass(), "y", -535062491);
        setIntField(term327596, term327596.getClass(), "xAbs", -147381920);
        setIntField(term327596, term327596.getClass(), "yAbs", -7568006);
        setIntField(term327596, term327596.getClass(), "clickCount", 1952367361);
        setBooleanField(term327596, term327596.getClass(), "causedByTouchEvent", true);
        setIntField(term327596, term327596.getClass(), "button", -715290594);
        setBooleanField(term327596, term327596.getClass(), "popupTrigger", false);
        setBooleanField(term327596, term327596.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term327596, term327596.getClass(), "when", 8765880103547975810L);
        setIntField(term327596, term327596.getClass(), "modifiers", -860371306);
        setBooleanField(term327596, term327596.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term327609, 0, (byte) -81);
        setByteElement(term327609, 1, (byte) 127);
        setByteElement(term327609, 2, (byte) -24);
        setByteElement(term327609, 3, (byte) -89);
        setByteElement(term327609, 4, (byte) -35);
        setByteElement(term327609, 5, (byte) -59);
        setByteElement(term327609, 6, (byte) 73);
        setByteElement(term327609, 7, (byte) 94);
        setByteElement(term327609, 8, (byte) 114);
        setField(term327596, term327596.getClass(), "bdata", term327609);
        setIntField(term327596, term327596.getClass(), "id", -125626789);
        setBooleanField(term327596, term327596.getClass(), "consumed", true);
        setField(term327624, term327624.getClass(), "location", null);
        setField(term327624, term327624.getClass(), "signers", null);
        setField(term327624, term327624.getClass(), "certs", null);
        setField(term327624, term327624.getClass(), "sp", null);
        setField(term327624, term327624.getClass(), "factory", null);
        setField(term327624, term327624.getClass(), "locationNoFragString", null);
        setField(term327623, term327623.getClass(), "codesource", term327624);
        setField(term327623, term327623.getClass(), "classloader", null);
        setField(term327623, term327623.getClass(), "principals", term327625);
        setField(term327623, term327623.getClass(), "permissions", null);
        setBooleanField(term327623, term327623.getClass(), "hasAllPerm", false);
        setBooleanField(term327623, term327623.getClass(), "staticPermissions", false);
        setField(term327623, term327623.getClass(), "key", null);
        setElement(term327622, 0, term327623);
        setField(term327628, term327628.getClass(), "codesource", null);
        setField(term327628, term327628.getClass(), "classloader", null);
        setField(term327628, term327628.getClass(), "principals", null);
        setField(term327628, term327628.getClass(), "permissions", null);
        setBooleanField(term327628, term327628.getClass(), "hasAllPerm", false);
        setBooleanField(term327628, term327628.getClass(), "staticPermissions", false);
        setField(term327628, term327628.getClass(), "key", null);
        setElement(term327622, 1, term327628);
        setField(term327631, term327631.getClass(), "codesource", null);
        setField(term327631, term327631.getClass(), "classloader", null);
        setField(term327631, term327631.getClass(), "principals", null);
        setField(term327631, term327631.getClass(), "permissions", null);
        setBooleanField(term327631, term327631.getClass(), "hasAllPerm", false);
        setBooleanField(term327631, term327631.getClass(), "staticPermissions", false);
        setField(term327631, term327631.getClass(), "key", null);
        setElement(term327622, 2, term327631);
        setField(term327634, term327634.getClass(), "codesource", null);
        setField(term327634, term327634.getClass(), "classloader", null);
        setField(term327634, term327634.getClass(), "principals", null);
        setField(term327634, term327634.getClass(), "permissions", null);
        setBooleanField(term327634, term327634.getClass(), "hasAllPerm", false);
        setBooleanField(term327634, term327634.getClass(), "staticPermissions", false);
        setField(term327634, term327634.getClass(), "key", null);
        setElement(term327622, 3, term327634);
        setField(term327637, term327637.getClass(), "codesource", null);
        setField(term327637, term327637.getClass(), "classloader", null);
        setField(term327637, term327637.getClass(), "principals", null);
        setField(term327637, term327637.getClass(), "permissions", null);
        setBooleanField(term327637, term327637.getClass(), "hasAllPerm", false);
        setBooleanField(term327637, term327637.getClass(), "staticPermissions", false);
        setField(term327637, term327637.getClass(), "key", null);
        setElement(term327622, 4, term327637);
        setField(term327621, term327621.getClass(), "context", term327622);
        setBooleanField(term327621, term327621.getClass(), "isPrivileged", true);
        setBooleanField(term327621, term327621.getClass(), "isAuthorized", true);
        setField(term327642, term327642.getClass(), "context", null);
        setBooleanField(term327642, term327642.getClass(), "isPrivileged", false);
        setBooleanField(term327642, term327642.getClass(), "isAuthorized", false);
        setField(term327642, term327642.getClass(), "privilegedContext", null);
        setField(term327642, term327642.getClass(), "combiner", null);
        setField(term327642, term327642.getClass(), "permissions", null);
        setField(term327642, term327642.getClass(), "parent", null);
        setBooleanField(term327642, term327642.getClass(), "isWrapped", false);
        setBooleanField(term327642, term327642.getClass(), "isLimited", false);
        setField(term327642, term327642.getClass(), "limitedContext", null);
        setField(term327621, term327621.getClass(), "privilegedContext", term327642);
        setField(term327621, term327621.getClass(), "combiner", null);
        setField(term327621, term327621.getClass(), "permissions", null);
        setField(term327621, term327621.getClass(), "parent", null);
        setBooleanField(term327621, term327621.getClass(), "isWrapped", false);
        setBooleanField(term327621, term327621.getClass(), "isLimited", false);
        setField(term327621, term327621.getClass(), "limitedContext", null);
        setField(term327596, term327596.getClass(), "acc", term327621);
        setBooleanField(term327596, term327596.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term327596, term327596.getClass(), "isPosted", true);
        setBooleanField(term327596, term327596.getClass(), "isSystemGenerated", true);
        setField(term327596, term327596.getClass(), "source", term327652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleYear$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term327596;
        callMethod(klass, "mouseReleased", argTypes, term327595, args);
    }

};


