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
     Object term108564;
     Object term108565;

    public ModuleHandler_ModuleYear_1_mousePressed_800517712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108564 = newInstance(Class.forName("core.module.ModuleHandler$ModuleYear$1"));
        setField(term108564, term108564.getClass(), "this$0", null);
        term108565 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term108578 = (byte[]) newByteArray(2);
        Object term108583 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term108584 = (Object[]) newArray("java.security.ProtectionDomain", 9);
        Object term108585 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108586 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term108587 = (Object[]) newArray("java.security.Principal", 4);
        Object term108590 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108593 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108596 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108599 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108602 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108605 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108608 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108611 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term108616 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term108626 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term108565, term108565.getClass(), "x", -1619435313);
        setIntField(term108565, term108565.getClass(), "y", 1013801066);
        setIntField(term108565, term108565.getClass(), "xAbs", 1512541853);
        setIntField(term108565, term108565.getClass(), "yAbs", -965421502);
        setIntField(term108565, term108565.getClass(), "clickCount", 1319026002);
        setBooleanField(term108565, term108565.getClass(), "causedByTouchEvent", false);
        setIntField(term108565, term108565.getClass(), "button", -1368173231);
        setBooleanField(term108565, term108565.getClass(), "popupTrigger", true);
        setBooleanField(term108565, term108565.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term108565, term108565.getClass(), "when", -2068172595987555756L);
        setIntField(term108565, term108565.getClass(), "modifiers", 1956006038);
        setBooleanField(term108565, term108565.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term108578, 0, (byte) 7);
        setByteElement(term108578, 1, (byte) -96);
        setField(term108565, term108565.getClass(), "bdata", term108578);
        setIntField(term108565, term108565.getClass(), "id", -1062304878);
        setBooleanField(term108565, term108565.getClass(), "consumed", false);
        setField(term108586, term108586.getClass(), "location", null);
        setField(term108586, term108586.getClass(), "signers", null);
        setField(term108586, term108586.getClass(), "certs", null);
        setField(term108586, term108586.getClass(), "sp", null);
        setField(term108586, term108586.getClass(), "factory", null);
        setField(term108586, term108586.getClass(), "locationNoFragString", null);
        setField(term108585, term108585.getClass(), "codesource", term108586);
        setField(term108585, term108585.getClass(), "classloader", null);
        setField(term108585, term108585.getClass(), "principals", term108587);
        setField(term108585, term108585.getClass(), "permissions", null);
        setBooleanField(term108585, term108585.getClass(), "hasAllPerm", false);
        setBooleanField(term108585, term108585.getClass(), "staticPermissions", false);
        setField(term108585, term108585.getClass(), "key", null);
        setElement(term108584, 0, term108585);
        setField(term108590, term108590.getClass(), "codesource", null);
        setField(term108590, term108590.getClass(), "classloader", null);
        setField(term108590, term108590.getClass(), "principals", null);
        setField(term108590, term108590.getClass(), "permissions", null);
        setBooleanField(term108590, term108590.getClass(), "hasAllPerm", false);
        setBooleanField(term108590, term108590.getClass(), "staticPermissions", false);
        setField(term108590, term108590.getClass(), "key", null);
        setElement(term108584, 1, term108590);
        setField(term108593, term108593.getClass(), "codesource", null);
        setField(term108593, term108593.getClass(), "classloader", null);
        setField(term108593, term108593.getClass(), "principals", null);
        setField(term108593, term108593.getClass(), "permissions", null);
        setBooleanField(term108593, term108593.getClass(), "hasAllPerm", false);
        setBooleanField(term108593, term108593.getClass(), "staticPermissions", false);
        setField(term108593, term108593.getClass(), "key", null);
        setElement(term108584, 2, term108593);
        setField(term108596, term108596.getClass(), "codesource", null);
        setField(term108596, term108596.getClass(), "classloader", null);
        setField(term108596, term108596.getClass(), "principals", null);
        setField(term108596, term108596.getClass(), "permissions", null);
        setBooleanField(term108596, term108596.getClass(), "hasAllPerm", false);
        setBooleanField(term108596, term108596.getClass(), "staticPermissions", false);
        setField(term108596, term108596.getClass(), "key", null);
        setElement(term108584, 3, term108596);
        setField(term108599, term108599.getClass(), "codesource", null);
        setField(term108599, term108599.getClass(), "classloader", null);
        setField(term108599, term108599.getClass(), "principals", null);
        setField(term108599, term108599.getClass(), "permissions", null);
        setBooleanField(term108599, term108599.getClass(), "hasAllPerm", false);
        setBooleanField(term108599, term108599.getClass(), "staticPermissions", false);
        setField(term108599, term108599.getClass(), "key", null);
        setElement(term108584, 4, term108599);
        setField(term108602, term108602.getClass(), "codesource", null);
        setField(term108602, term108602.getClass(), "classloader", null);
        setField(term108602, term108602.getClass(), "principals", null);
        setField(term108602, term108602.getClass(), "permissions", null);
        setBooleanField(term108602, term108602.getClass(), "hasAllPerm", false);
        setBooleanField(term108602, term108602.getClass(), "staticPermissions", false);
        setField(term108602, term108602.getClass(), "key", null);
        setElement(term108584, 5, term108602);
        setField(term108605, term108605.getClass(), "codesource", null);
        setField(term108605, term108605.getClass(), "classloader", null);
        setField(term108605, term108605.getClass(), "principals", null);
        setField(term108605, term108605.getClass(), "permissions", null);
        setBooleanField(term108605, term108605.getClass(), "hasAllPerm", false);
        setBooleanField(term108605, term108605.getClass(), "staticPermissions", false);
        setField(term108605, term108605.getClass(), "key", null);
        setElement(term108584, 6, term108605);
        setField(term108608, term108608.getClass(), "codesource", null);
        setField(term108608, term108608.getClass(), "classloader", null);
        setField(term108608, term108608.getClass(), "principals", null);
        setField(term108608, term108608.getClass(), "permissions", null);
        setBooleanField(term108608, term108608.getClass(), "hasAllPerm", false);
        setBooleanField(term108608, term108608.getClass(), "staticPermissions", false);
        setField(term108608, term108608.getClass(), "key", null);
        setElement(term108584, 7, term108608);
        setField(term108611, term108611.getClass(), "codesource", null);
        setField(term108611, term108611.getClass(), "classloader", null);
        setField(term108611, term108611.getClass(), "principals", null);
        setField(term108611, term108611.getClass(), "permissions", null);
        setBooleanField(term108611, term108611.getClass(), "hasAllPerm", false);
        setBooleanField(term108611, term108611.getClass(), "staticPermissions", false);
        setField(term108611, term108611.getClass(), "key", null);
        setElement(term108584, 8, term108611);
        setField(term108583, term108583.getClass(), "context", term108584);
        setBooleanField(term108583, term108583.getClass(), "isPrivileged", false);
        setBooleanField(term108583, term108583.getClass(), "isAuthorized", false);
        setField(term108616, term108616.getClass(), "context", null);
        setBooleanField(term108616, term108616.getClass(), "isPrivileged", false);
        setBooleanField(term108616, term108616.getClass(), "isAuthorized", false);
        setField(term108616, term108616.getClass(), "privilegedContext", null);
        setField(term108616, term108616.getClass(), "combiner", null);
        setField(term108616, term108616.getClass(), "permissions", null);
        setField(term108616, term108616.getClass(), "parent", null);
        setBooleanField(term108616, term108616.getClass(), "isWrapped", false);
        setBooleanField(term108616, term108616.getClass(), "isLimited", false);
        setField(term108616, term108616.getClass(), "limitedContext", null);
        setField(term108583, term108583.getClass(), "privilegedContext", term108616);
        setField(term108583, term108583.getClass(), "combiner", null);
        setField(term108583, term108583.getClass(), "permissions", null);
        setField(term108583, term108583.getClass(), "parent", null);
        setBooleanField(term108583, term108583.getClass(), "isWrapped", false);
        setBooleanField(term108583, term108583.getClass(), "isLimited", false);
        setField(term108583, term108583.getClass(), "limitedContext", null);
        setField(term108565, term108565.getClass(), "acc", term108583);
        setBooleanField(term108565, term108565.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term108565, term108565.getClass(), "isPosted", false);
        setBooleanField(term108565, term108565.getClass(), "isSystemGenerated", false);
        setField(term108565, term108565.getClass(), "source", term108626);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleYear$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term108565;
        callMethod(klass, "mousePressed", argTypes, term108564, args);
    }

};


