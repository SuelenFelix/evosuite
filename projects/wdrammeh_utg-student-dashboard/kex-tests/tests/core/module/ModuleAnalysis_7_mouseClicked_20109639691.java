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
import java.util.ArrayList;
import java.lang.Object;

public class ModuleAnalysis_7_mouseClicked_20109639691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75276;
     Object term75293;

    public ModuleAnalysis_7_mouseClicked_20109639691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term75289 = new ArrayList();
        term75276 = newInstance(Class.forName("core.module.ModuleAnalysis$7"));
        setField(term75276, term75276.getClass(), "val$yearTex", "XebAeSnCKZ");
        setField(term75276, term75276.getClass(), "val$fractionalYear", term75289);
        setField(term75276, term75276.getClass(), "this$0", null);
        term75293 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term75306 = (byte[]) newByteArray(4);
        Object term75313 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term75314 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term75315 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term75316 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term75317 = (Object[]) newArray("java.security.Principal", 4);
        Object term75320 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term75323 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term75326 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term75329 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term75332 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term75337 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term75347 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term75293, term75293.getClass(), "x", 76650923);
        setIntField(term75293, term75293.getClass(), "y", 1003743923);
        setIntField(term75293, term75293.getClass(), "xAbs", 1887772522);
        setIntField(term75293, term75293.getClass(), "yAbs", 354196060);
        setIntField(term75293, term75293.getClass(), "clickCount", -1840305774);
        setBooleanField(term75293, term75293.getClass(), "causedByTouchEvent", true);
        setIntField(term75293, term75293.getClass(), "button", 1365087144);
        setBooleanField(term75293, term75293.getClass(), "popupTrigger", false);
        setBooleanField(term75293, term75293.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term75293, term75293.getClass(), "when", -2813493605142626659L);
        setIntField(term75293, term75293.getClass(), "modifiers", -1537255112);
        setBooleanField(term75293, term75293.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term75306, 0, (byte) 36);
        setByteElement(term75306, 1, (byte) 118);
        setByteElement(term75306, 2, (byte) 106);
        setByteElement(term75306, 3, (byte) 98);
        setField(term75293, term75293.getClass(), "bdata", term75306);
        setIntField(term75293, term75293.getClass(), "id", 934477462);
        setBooleanField(term75293, term75293.getClass(), "consumed", false);
        setField(term75316, term75316.getClass(), "location", null);
        setField(term75316, term75316.getClass(), "signers", null);
        setField(term75316, term75316.getClass(), "certs", null);
        setField(term75316, term75316.getClass(), "sp", null);
        setField(term75316, term75316.getClass(), "factory", null);
        setField(term75316, term75316.getClass(), "locationNoFragString", null);
        setField(term75315, term75315.getClass(), "codesource", term75316);
        setField(term75315, term75315.getClass(), "classloader", null);
        setField(term75315, term75315.getClass(), "principals", term75317);
        setField(term75315, term75315.getClass(), "permissions", null);
        setBooleanField(term75315, term75315.getClass(), "hasAllPerm", false);
        setBooleanField(term75315, term75315.getClass(), "staticPermissions", false);
        setField(term75315, term75315.getClass(), "key", null);
        setElement(term75314, 0, term75315);
        setField(term75320, term75320.getClass(), "codesource", null);
        setField(term75320, term75320.getClass(), "classloader", null);
        setField(term75320, term75320.getClass(), "principals", null);
        setField(term75320, term75320.getClass(), "permissions", null);
        setBooleanField(term75320, term75320.getClass(), "hasAllPerm", false);
        setBooleanField(term75320, term75320.getClass(), "staticPermissions", false);
        setField(term75320, term75320.getClass(), "key", null);
        setElement(term75314, 1, term75320);
        setField(term75323, term75323.getClass(), "codesource", null);
        setField(term75323, term75323.getClass(), "classloader", null);
        setField(term75323, term75323.getClass(), "principals", null);
        setField(term75323, term75323.getClass(), "permissions", null);
        setBooleanField(term75323, term75323.getClass(), "hasAllPerm", false);
        setBooleanField(term75323, term75323.getClass(), "staticPermissions", false);
        setField(term75323, term75323.getClass(), "key", null);
        setElement(term75314, 2, term75323);
        setField(term75326, term75326.getClass(), "codesource", null);
        setField(term75326, term75326.getClass(), "classloader", null);
        setField(term75326, term75326.getClass(), "principals", null);
        setField(term75326, term75326.getClass(), "permissions", null);
        setBooleanField(term75326, term75326.getClass(), "hasAllPerm", false);
        setBooleanField(term75326, term75326.getClass(), "staticPermissions", false);
        setField(term75326, term75326.getClass(), "key", null);
        setElement(term75314, 3, term75326);
        setField(term75329, term75329.getClass(), "codesource", null);
        setField(term75329, term75329.getClass(), "classloader", null);
        setField(term75329, term75329.getClass(), "principals", null);
        setField(term75329, term75329.getClass(), "permissions", null);
        setBooleanField(term75329, term75329.getClass(), "hasAllPerm", false);
        setBooleanField(term75329, term75329.getClass(), "staticPermissions", false);
        setField(term75329, term75329.getClass(), "key", null);
        setElement(term75314, 4, term75329);
        setField(term75332, term75332.getClass(), "codesource", null);
        setField(term75332, term75332.getClass(), "classloader", null);
        setField(term75332, term75332.getClass(), "principals", null);
        setField(term75332, term75332.getClass(), "permissions", null);
        setBooleanField(term75332, term75332.getClass(), "hasAllPerm", false);
        setBooleanField(term75332, term75332.getClass(), "staticPermissions", false);
        setField(term75332, term75332.getClass(), "key", null);
        setElement(term75314, 5, term75332);
        setField(term75313, term75313.getClass(), "context", term75314);
        setBooleanField(term75313, term75313.getClass(), "isPrivileged", false);
        setBooleanField(term75313, term75313.getClass(), "isAuthorized", false);
        setField(term75337, term75337.getClass(), "context", null);
        setBooleanField(term75337, term75337.getClass(), "isPrivileged", false);
        setBooleanField(term75337, term75337.getClass(), "isAuthorized", false);
        setField(term75337, term75337.getClass(), "privilegedContext", null);
        setField(term75337, term75337.getClass(), "combiner", null);
        setField(term75337, term75337.getClass(), "permissions", null);
        setField(term75337, term75337.getClass(), "parent", null);
        setBooleanField(term75337, term75337.getClass(), "isWrapped", false);
        setBooleanField(term75337, term75337.getClass(), "isLimited", false);
        setField(term75337, term75337.getClass(), "limitedContext", null);
        setField(term75313, term75313.getClass(), "privilegedContext", term75337);
        setField(term75313, term75313.getClass(), "combiner", null);
        setField(term75313, term75313.getClass(), "permissions", null);
        setField(term75313, term75313.getClass(), "parent", null);
        setBooleanField(term75313, term75313.getClass(), "isWrapped", false);
        setBooleanField(term75313, term75313.getClass(), "isLimited", false);
        setField(term75313, term75313.getClass(), "limitedContext", null);
        setField(term75293, term75293.getClass(), "acc", term75313);
        setBooleanField(term75293, term75293.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term75293, term75293.getClass(), "isPosted", true);
        setBooleanField(term75293, term75293.getClass(), "isSystemGenerated", true);
        setField(term75293, term75293.getClass(), "source", term75347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$7");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term75293;
        callMethod(klass, "mouseClicked", argTypes, term75276, args);
    }

};


