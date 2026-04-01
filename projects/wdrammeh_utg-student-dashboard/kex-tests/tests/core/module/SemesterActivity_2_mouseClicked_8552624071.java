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

public class SemesterActivity_2_mouseClicked_8552624071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320128;
     Object term320129;

    public SemesterActivity_2_mouseClicked_8552624071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320128 = newInstance(Class.forName("core.module.SemesterActivity$2"));
        setField(term320128, term320128.getClass(), "this$0", null);
        term320129 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term320142 = (byte[]) newByteArray(0);
        Object term320145 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term320146 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term320147 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term320148 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term320149 = (Object[]) newArray("java.security.Principal", 4);
        Object term320154 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term320164 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term320129, term320129.getClass(), "x", 619484749);
        setIntField(term320129, term320129.getClass(), "y", 490271003);
        setIntField(term320129, term320129.getClass(), "xAbs", 1541867826);
        setIntField(term320129, term320129.getClass(), "yAbs", -137176190);
        setIntField(term320129, term320129.getClass(), "clickCount", 348263044);
        setBooleanField(term320129, term320129.getClass(), "causedByTouchEvent", true);
        setIntField(term320129, term320129.getClass(), "button", 1394815305);
        setBooleanField(term320129, term320129.getClass(), "popupTrigger", false);
        setBooleanField(term320129, term320129.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term320129, term320129.getClass(), "when", -6490254947459640565L);
        setIntField(term320129, term320129.getClass(), "modifiers", -315070279);
        setBooleanField(term320129, term320129.getClass(), "canAccessSystemClipboard", true);
        setField(term320129, term320129.getClass(), "bdata", term320142);
        setIntField(term320129, term320129.getClass(), "id", 62449386);
        setBooleanField(term320129, term320129.getClass(), "consumed", true);
        setField(term320148, term320148.getClass(), "location", null);
        setField(term320148, term320148.getClass(), "signers", null);
        setField(term320148, term320148.getClass(), "certs", null);
        setField(term320148, term320148.getClass(), "sp", null);
        setField(term320148, term320148.getClass(), "factory", null);
        setField(term320148, term320148.getClass(), "locationNoFragString", null);
        setField(term320147, term320147.getClass(), "codesource", term320148);
        setField(term320147, term320147.getClass(), "classloader", null);
        setField(term320147, term320147.getClass(), "principals", term320149);
        setField(term320147, term320147.getClass(), "permissions", null);
        setBooleanField(term320147, term320147.getClass(), "hasAllPerm", false);
        setBooleanField(term320147, term320147.getClass(), "staticPermissions", false);
        setField(term320147, term320147.getClass(), "key", null);
        setElement(term320146, 0, term320147);
        setField(term320145, term320145.getClass(), "context", term320146);
        setBooleanField(term320145, term320145.getClass(), "isPrivileged", false);
        setBooleanField(term320145, term320145.getClass(), "isAuthorized", false);
        setField(term320154, term320154.getClass(), "context", null);
        setBooleanField(term320154, term320154.getClass(), "isPrivileged", false);
        setBooleanField(term320154, term320154.getClass(), "isAuthorized", false);
        setField(term320154, term320154.getClass(), "privilegedContext", null);
        setField(term320154, term320154.getClass(), "combiner", null);
        setField(term320154, term320154.getClass(), "permissions", null);
        setField(term320154, term320154.getClass(), "parent", null);
        setBooleanField(term320154, term320154.getClass(), "isWrapped", false);
        setBooleanField(term320154, term320154.getClass(), "isLimited", false);
        setField(term320154, term320154.getClass(), "limitedContext", null);
        setField(term320145, term320145.getClass(), "privilegedContext", term320154);
        setField(term320145, term320145.getClass(), "combiner", null);
        setField(term320145, term320145.getClass(), "permissions", null);
        setField(term320145, term320145.getClass(), "parent", null);
        setBooleanField(term320145, term320145.getClass(), "isWrapped", false);
        setBooleanField(term320145, term320145.getClass(), "isLimited", false);
        setField(term320145, term320145.getClass(), "limitedContext", null);
        setField(term320129, term320129.getClass(), "acc", term320145);
        setBooleanField(term320129, term320129.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term320129, term320129.getClass(), "isPosted", false);
        setBooleanField(term320129, term320129.getClass(), "isSystemGenerated", true);
        setField(term320129, term320129.getClass(), "source", term320164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SemesterActivity$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term320129;
        callMethod(klass, "mouseClicked", argTypes, term320128, args);
    }

};


