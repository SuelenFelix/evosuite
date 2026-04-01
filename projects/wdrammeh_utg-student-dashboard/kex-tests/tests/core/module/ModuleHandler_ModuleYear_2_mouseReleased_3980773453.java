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
     Object term337253;
     Object term337254;

    public ModuleHandler_ModuleYear_2_mouseReleased_3980773453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337253 = newInstance(Class.forName("core.module.ModuleHandler$ModuleYear$2"));
        setField(term337253, term337253.getClass(), "this$0", null);
        term337254 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term337267 = (byte[]) newByteArray(6);
        Object term337276 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term337277 = (Object[]) newArray("java.security.ProtectionDomain", 4);
        Object term337278 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term337279 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term337280 = (Object[]) newArray("java.security.Principal", 8);
        Object term337283 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term337286 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term337289 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term337294 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term337304 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term337254, term337254.getClass(), "x", 634968709);
        setIntField(term337254, term337254.getClass(), "y", 681482688);
        setIntField(term337254, term337254.getClass(), "xAbs", -1435288604);
        setIntField(term337254, term337254.getClass(), "yAbs", 364335952);
        setIntField(term337254, term337254.getClass(), "clickCount", 254542714);
        setBooleanField(term337254, term337254.getClass(), "causedByTouchEvent", true);
        setIntField(term337254, term337254.getClass(), "button", -51533463);
        setBooleanField(term337254, term337254.getClass(), "popupTrigger", false);
        setBooleanField(term337254, term337254.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term337254, term337254.getClass(), "when", -629491722907628764L);
        setIntField(term337254, term337254.getClass(), "modifiers", 2042811670);
        setBooleanField(term337254, term337254.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term337267, 0, (byte) 96);
        setByteElement(term337267, 1, (byte) 55);
        setByteElement(term337267, 2, (byte) -103);
        setByteElement(term337267, 3, (byte) -103);
        setByteElement(term337267, 4, (byte) -98);
        setByteElement(term337267, 5, (byte) -119);
        setField(term337254, term337254.getClass(), "bdata", term337267);
        setIntField(term337254, term337254.getClass(), "id", -1713263092);
        setBooleanField(term337254, term337254.getClass(), "consumed", true);
        setField(term337279, term337279.getClass(), "location", null);
        setField(term337279, term337279.getClass(), "signers", null);
        setField(term337279, term337279.getClass(), "certs", null);
        setField(term337279, term337279.getClass(), "sp", null);
        setField(term337279, term337279.getClass(), "factory", null);
        setField(term337279, term337279.getClass(), "locationNoFragString", null);
        setField(term337278, term337278.getClass(), "codesource", term337279);
        setField(term337278, term337278.getClass(), "classloader", null);
        setField(term337278, term337278.getClass(), "principals", term337280);
        setField(term337278, term337278.getClass(), "permissions", null);
        setBooleanField(term337278, term337278.getClass(), "hasAllPerm", false);
        setBooleanField(term337278, term337278.getClass(), "staticPermissions", false);
        setField(term337278, term337278.getClass(), "key", null);
        setElement(term337277, 0, term337278);
        setField(term337283, term337283.getClass(), "codesource", null);
        setField(term337283, term337283.getClass(), "classloader", null);
        setField(term337283, term337283.getClass(), "principals", null);
        setField(term337283, term337283.getClass(), "permissions", null);
        setBooleanField(term337283, term337283.getClass(), "hasAllPerm", false);
        setBooleanField(term337283, term337283.getClass(), "staticPermissions", false);
        setField(term337283, term337283.getClass(), "key", null);
        setElement(term337277, 1, term337283);
        setField(term337286, term337286.getClass(), "codesource", null);
        setField(term337286, term337286.getClass(), "classloader", null);
        setField(term337286, term337286.getClass(), "principals", null);
        setField(term337286, term337286.getClass(), "permissions", null);
        setBooleanField(term337286, term337286.getClass(), "hasAllPerm", false);
        setBooleanField(term337286, term337286.getClass(), "staticPermissions", false);
        setField(term337286, term337286.getClass(), "key", null);
        setElement(term337277, 2, term337286);
        setField(term337289, term337289.getClass(), "codesource", null);
        setField(term337289, term337289.getClass(), "classloader", null);
        setField(term337289, term337289.getClass(), "principals", null);
        setField(term337289, term337289.getClass(), "permissions", null);
        setBooleanField(term337289, term337289.getClass(), "hasAllPerm", false);
        setBooleanField(term337289, term337289.getClass(), "staticPermissions", false);
        setField(term337289, term337289.getClass(), "key", null);
        setElement(term337277, 3, term337289);
        setField(term337276, term337276.getClass(), "context", term337277);
        setBooleanField(term337276, term337276.getClass(), "isPrivileged", true);
        setBooleanField(term337276, term337276.getClass(), "isAuthorized", false);
        setField(term337294, term337294.getClass(), "context", null);
        setBooleanField(term337294, term337294.getClass(), "isPrivileged", false);
        setBooleanField(term337294, term337294.getClass(), "isAuthorized", false);
        setField(term337294, term337294.getClass(), "privilegedContext", null);
        setField(term337294, term337294.getClass(), "combiner", null);
        setField(term337294, term337294.getClass(), "permissions", null);
        setField(term337294, term337294.getClass(), "parent", null);
        setBooleanField(term337294, term337294.getClass(), "isWrapped", false);
        setBooleanField(term337294, term337294.getClass(), "isLimited", false);
        setField(term337294, term337294.getClass(), "limitedContext", null);
        setField(term337276, term337276.getClass(), "privilegedContext", term337294);
        setField(term337276, term337276.getClass(), "combiner", null);
        setField(term337276, term337276.getClass(), "permissions", null);
        setField(term337276, term337276.getClass(), "parent", null);
        setBooleanField(term337276, term337276.getClass(), "isWrapped", false);
        setBooleanField(term337276, term337276.getClass(), "isLimited", false);
        setField(term337276, term337276.getClass(), "limitedContext", null);
        setField(term337254, term337254.getClass(), "acc", term337276);
        setBooleanField(term337254, term337254.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term337254, term337254.getClass(), "isPosted", true);
        setBooleanField(term337254, term337254.getClass(), "isSystemGenerated", false);
        setField(term337254, term337254.getClass(), "source", term337304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleYear$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term337254;
        callMethod(klass, "mouseReleased", argTypes, term337253, args);
    }

};


