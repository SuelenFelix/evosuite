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

public class SummerHandler_1_mouseReleased_17841336382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316243;
     Object term316244;

    public SummerHandler_1_mouseReleased_17841336382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316243 = newInstance(Class.forName("core.module.SummerHandler$1"));
        setField(term316243, term316243.getClass(), "this$0", null);
        term316244 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term316257 = (byte[]) newByteArray(6);
        Object term316266 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term316267 = (Object[]) newArray("java.security.ProtectionDomain", 3);
        Object term316268 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term316269 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term316270 = (Object[]) newArray("java.security.Principal", 1);
        Object term316273 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term316276 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term316281 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term316291 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term316244, term316244.getClass(), "x", -1224535182);
        setIntField(term316244, term316244.getClass(), "y", 1181771633);
        setIntField(term316244, term316244.getClass(), "xAbs", -21975974);
        setIntField(term316244, term316244.getClass(), "yAbs", -862969915);
        setIntField(term316244, term316244.getClass(), "clickCount", -1289681614);
        setBooleanField(term316244, term316244.getClass(), "causedByTouchEvent", false);
        setIntField(term316244, term316244.getClass(), "button", 496461454);
        setBooleanField(term316244, term316244.getClass(), "popupTrigger", true);
        setBooleanField(term316244, term316244.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term316244, term316244.getClass(), "when", -2195061939206930224L);
        setIntField(term316244, term316244.getClass(), "modifiers", -697047947);
        setBooleanField(term316244, term316244.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term316257, 0, (byte) -6);
        setByteElement(term316257, 1, (byte) 51);
        setByteElement(term316257, 2, (byte) 122);
        setByteElement(term316257, 3, (byte) 84);
        setByteElement(term316257, 4, (byte) -36);
        setByteElement(term316257, 5, (byte) 103);
        setField(term316244, term316244.getClass(), "bdata", term316257);
        setIntField(term316244, term316244.getClass(), "id", 505327656);
        setBooleanField(term316244, term316244.getClass(), "consumed", false);
        setField(term316269, term316269.getClass(), "location", null);
        setField(term316269, term316269.getClass(), "signers", null);
        setField(term316269, term316269.getClass(), "certs", null);
        setField(term316269, term316269.getClass(), "sp", null);
        setField(term316269, term316269.getClass(), "factory", null);
        setField(term316269, term316269.getClass(), "locationNoFragString", null);
        setField(term316268, term316268.getClass(), "codesource", term316269);
        setField(term316268, term316268.getClass(), "classloader", null);
        setField(term316268, term316268.getClass(), "principals", term316270);
        setField(term316268, term316268.getClass(), "permissions", null);
        setBooleanField(term316268, term316268.getClass(), "hasAllPerm", false);
        setBooleanField(term316268, term316268.getClass(), "staticPermissions", false);
        setField(term316268, term316268.getClass(), "key", null);
        setElement(term316267, 0, term316268);
        setField(term316273, term316273.getClass(), "codesource", null);
        setField(term316273, term316273.getClass(), "classloader", null);
        setField(term316273, term316273.getClass(), "principals", null);
        setField(term316273, term316273.getClass(), "permissions", null);
        setBooleanField(term316273, term316273.getClass(), "hasAllPerm", false);
        setBooleanField(term316273, term316273.getClass(), "staticPermissions", false);
        setField(term316273, term316273.getClass(), "key", null);
        setElement(term316267, 1, term316273);
        setField(term316276, term316276.getClass(), "codesource", null);
        setField(term316276, term316276.getClass(), "classloader", null);
        setField(term316276, term316276.getClass(), "principals", null);
        setField(term316276, term316276.getClass(), "permissions", null);
        setBooleanField(term316276, term316276.getClass(), "hasAllPerm", false);
        setBooleanField(term316276, term316276.getClass(), "staticPermissions", false);
        setField(term316276, term316276.getClass(), "key", null);
        setElement(term316267, 2, term316276);
        setField(term316266, term316266.getClass(), "context", term316267);
        setBooleanField(term316266, term316266.getClass(), "isPrivileged", true);
        setBooleanField(term316266, term316266.getClass(), "isAuthorized", true);
        setField(term316281, term316281.getClass(), "context", null);
        setBooleanField(term316281, term316281.getClass(), "isPrivileged", false);
        setBooleanField(term316281, term316281.getClass(), "isAuthorized", false);
        setField(term316281, term316281.getClass(), "privilegedContext", null);
        setField(term316281, term316281.getClass(), "combiner", null);
        setField(term316281, term316281.getClass(), "permissions", null);
        setField(term316281, term316281.getClass(), "parent", null);
        setBooleanField(term316281, term316281.getClass(), "isWrapped", false);
        setBooleanField(term316281, term316281.getClass(), "isLimited", false);
        setField(term316281, term316281.getClass(), "limitedContext", null);
        setField(term316266, term316266.getClass(), "privilegedContext", term316281);
        setField(term316266, term316266.getClass(), "combiner", null);
        setField(term316266, term316266.getClass(), "permissions", null);
        setField(term316266, term316266.getClass(), "parent", null);
        setBooleanField(term316266, term316266.getClass(), "isWrapped", false);
        setBooleanField(term316266, term316266.getClass(), "isLimited", false);
        setField(term316266, term316266.getClass(), "limitedContext", null);
        setField(term316244, term316244.getClass(), "acc", term316266);
        setBooleanField(term316244, term316244.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term316244, term316244.getClass(), "isPosted", false);
        setBooleanField(term316244, term316244.getClass(), "isSystemGenerated", false);
        setField(term316244, term316244.getClass(), "source", term316291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term316244;
        callMethod(klass, "mouseReleased", argTypes, term316243, args);
    }

};


