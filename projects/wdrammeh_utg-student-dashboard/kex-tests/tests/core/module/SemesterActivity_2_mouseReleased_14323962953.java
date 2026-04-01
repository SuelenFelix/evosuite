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

public class SemesterActivity_2_mouseReleased_14323962953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320223;
     Object term320224;

    public SemesterActivity_2_mouseReleased_14323962953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320223 = newInstance(Class.forName("core.module.SemesterActivity$2"));
        setField(term320223, term320223.getClass(), "this$0", null);
        term320224 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term320237 = (byte[]) newByteArray(8);
        Object term320248 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term320249 = (Object[]) newArray("java.security.ProtectionDomain", 4);
        Object term320250 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term320251 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term320252 = (Object[]) newArray("java.security.Principal", 2);
        Object term320255 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term320258 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term320261 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term320266 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term320276 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term320224, term320224.getClass(), "x", 1963462917);
        setIntField(term320224, term320224.getClass(), "y", 552203554);
        setIntField(term320224, term320224.getClass(), "xAbs", 1645215896);
        setIntField(term320224, term320224.getClass(), "yAbs", -914100840);
        setIntField(term320224, term320224.getClass(), "clickCount", 1806294616);
        setBooleanField(term320224, term320224.getClass(), "causedByTouchEvent", false);
        setIntField(term320224, term320224.getClass(), "button", 1766086753);
        setBooleanField(term320224, term320224.getClass(), "popupTrigger", false);
        setBooleanField(term320224, term320224.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term320224, term320224.getClass(), "when", 3077284143733577490L);
        setIntField(term320224, term320224.getClass(), "modifiers", -1211119545);
        setBooleanField(term320224, term320224.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term320237, 0, (byte) -118);
        setByteElement(term320237, 1, (byte) 69);
        setByteElement(term320237, 2, (byte) 112);
        setByteElement(term320237, 3, (byte) 77);
        setByteElement(term320237, 4, (byte) -1);
        setByteElement(term320237, 5, (byte) -83);
        setByteElement(term320237, 6, (byte) -63);
        setByteElement(term320237, 7, (byte) 108);
        setField(term320224, term320224.getClass(), "bdata", term320237);
        setIntField(term320224, term320224.getClass(), "id", 1584121590);
        setBooleanField(term320224, term320224.getClass(), "consumed", true);
        setField(term320251, term320251.getClass(), "location", null);
        setField(term320251, term320251.getClass(), "signers", null);
        setField(term320251, term320251.getClass(), "certs", null);
        setField(term320251, term320251.getClass(), "sp", null);
        setField(term320251, term320251.getClass(), "factory", null);
        setField(term320251, term320251.getClass(), "locationNoFragString", null);
        setField(term320250, term320250.getClass(), "codesource", term320251);
        setField(term320250, term320250.getClass(), "classloader", null);
        setField(term320250, term320250.getClass(), "principals", term320252);
        setField(term320250, term320250.getClass(), "permissions", null);
        setBooleanField(term320250, term320250.getClass(), "hasAllPerm", false);
        setBooleanField(term320250, term320250.getClass(), "staticPermissions", false);
        setField(term320250, term320250.getClass(), "key", null);
        setElement(term320249, 0, term320250);
        setField(term320255, term320255.getClass(), "codesource", null);
        setField(term320255, term320255.getClass(), "classloader", null);
        setField(term320255, term320255.getClass(), "principals", null);
        setField(term320255, term320255.getClass(), "permissions", null);
        setBooleanField(term320255, term320255.getClass(), "hasAllPerm", false);
        setBooleanField(term320255, term320255.getClass(), "staticPermissions", false);
        setField(term320255, term320255.getClass(), "key", null);
        setElement(term320249, 1, term320255);
        setField(term320258, term320258.getClass(), "codesource", null);
        setField(term320258, term320258.getClass(), "classloader", null);
        setField(term320258, term320258.getClass(), "principals", null);
        setField(term320258, term320258.getClass(), "permissions", null);
        setBooleanField(term320258, term320258.getClass(), "hasAllPerm", false);
        setBooleanField(term320258, term320258.getClass(), "staticPermissions", false);
        setField(term320258, term320258.getClass(), "key", null);
        setElement(term320249, 2, term320258);
        setField(term320261, term320261.getClass(), "codesource", null);
        setField(term320261, term320261.getClass(), "classloader", null);
        setField(term320261, term320261.getClass(), "principals", null);
        setField(term320261, term320261.getClass(), "permissions", null);
        setBooleanField(term320261, term320261.getClass(), "hasAllPerm", false);
        setBooleanField(term320261, term320261.getClass(), "staticPermissions", false);
        setField(term320261, term320261.getClass(), "key", null);
        setElement(term320249, 3, term320261);
        setField(term320248, term320248.getClass(), "context", term320249);
        setBooleanField(term320248, term320248.getClass(), "isPrivileged", true);
        setBooleanField(term320248, term320248.getClass(), "isAuthorized", false);
        setField(term320266, term320266.getClass(), "context", null);
        setBooleanField(term320266, term320266.getClass(), "isPrivileged", false);
        setBooleanField(term320266, term320266.getClass(), "isAuthorized", false);
        setField(term320266, term320266.getClass(), "privilegedContext", null);
        setField(term320266, term320266.getClass(), "combiner", null);
        setField(term320266, term320266.getClass(), "permissions", null);
        setField(term320266, term320266.getClass(), "parent", null);
        setBooleanField(term320266, term320266.getClass(), "isWrapped", false);
        setBooleanField(term320266, term320266.getClass(), "isLimited", false);
        setField(term320266, term320266.getClass(), "limitedContext", null);
        setField(term320248, term320248.getClass(), "privilegedContext", term320266);
        setField(term320248, term320248.getClass(), "combiner", null);
        setField(term320248, term320248.getClass(), "permissions", null);
        setField(term320248, term320248.getClass(), "parent", null);
        setBooleanField(term320248, term320248.getClass(), "isWrapped", false);
        setBooleanField(term320248, term320248.getClass(), "isLimited", false);
        setField(term320248, term320248.getClass(), "limitedContext", null);
        setField(term320224, term320224.getClass(), "acc", term320248);
        setBooleanField(term320224, term320224.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term320224, term320224.getClass(), "isPosted", true);
        setBooleanField(term320224, term320224.getClass(), "isSystemGenerated", true);
        setField(term320224, term320224.getClass(), "source", term320276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SemesterActivity$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term320224;
        callMethod(klass, "mouseReleased", argTypes, term320223, args);
    }

};


