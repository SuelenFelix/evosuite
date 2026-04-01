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
     Object term285928;
     Object term285945;

    public ModuleAnalysis_7_mouseClicked_20109639691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term285941 = new ArrayList();
        term285928 = newInstance(Class.forName("core.module.ModuleAnalysis$7"));
        setField(term285928, term285928.getClass(), "val$yearTex", "xQuVexkiVz");
        setField(term285928, term285928.getClass(), "val$fractionalYear", term285941);
        setField(term285928, term285928.getClass(), "this$0", null);
        term285945 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term285958 = (byte[]) newByteArray(3);
        Object term285964 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term285965 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term285966 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term285967 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term285968 = (Object[]) newArray("java.security.Principal", 1);
        Object term285973 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term285983 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term285945, term285945.getClass(), "x", 1565529799);
        setIntField(term285945, term285945.getClass(), "y", -1144608643);
        setIntField(term285945, term285945.getClass(), "xAbs", -2020428308);
        setIntField(term285945, term285945.getClass(), "yAbs", -226298436);
        setIntField(term285945, term285945.getClass(), "clickCount", -1570350431);
        setBooleanField(term285945, term285945.getClass(), "causedByTouchEvent", false);
        setIntField(term285945, term285945.getClass(), "button", -1378803474);
        setBooleanField(term285945, term285945.getClass(), "popupTrigger", true);
        setBooleanField(term285945, term285945.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term285945, term285945.getClass(), "when", 3086974592680165932L);
        setIntField(term285945, term285945.getClass(), "modifiers", 699225584);
        setBooleanField(term285945, term285945.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term285958, 0, (byte) 123);
        setByteElement(term285958, 1, (byte) 16);
        setByteElement(term285958, 2, (byte) 2);
        setField(term285945, term285945.getClass(), "bdata", term285958);
        setIntField(term285945, term285945.getClass(), "id", -577432675);
        setBooleanField(term285945, term285945.getClass(), "consumed", false);
        setField(term285967, term285967.getClass(), "location", null);
        setField(term285967, term285967.getClass(), "signers", null);
        setField(term285967, term285967.getClass(), "certs", null);
        setField(term285967, term285967.getClass(), "sp", null);
        setField(term285967, term285967.getClass(), "factory", null);
        setField(term285967, term285967.getClass(), "locationNoFragString", null);
        setField(term285966, term285966.getClass(), "codesource", term285967);
        setField(term285966, term285966.getClass(), "classloader", null);
        setField(term285966, term285966.getClass(), "principals", term285968);
        setField(term285966, term285966.getClass(), "permissions", null);
        setBooleanField(term285966, term285966.getClass(), "hasAllPerm", false);
        setBooleanField(term285966, term285966.getClass(), "staticPermissions", false);
        setField(term285966, term285966.getClass(), "key", null);
        setElement(term285965, 0, term285966);
        setField(term285964, term285964.getClass(), "context", term285965);
        setBooleanField(term285964, term285964.getClass(), "isPrivileged", false);
        setBooleanField(term285964, term285964.getClass(), "isAuthorized", true);
        setField(term285973, term285973.getClass(), "context", null);
        setBooleanField(term285973, term285973.getClass(), "isPrivileged", false);
        setBooleanField(term285973, term285973.getClass(), "isAuthorized", false);
        setField(term285973, term285973.getClass(), "privilegedContext", null);
        setField(term285973, term285973.getClass(), "combiner", null);
        setField(term285973, term285973.getClass(), "permissions", null);
        setField(term285973, term285973.getClass(), "parent", null);
        setBooleanField(term285973, term285973.getClass(), "isWrapped", false);
        setBooleanField(term285973, term285973.getClass(), "isLimited", false);
        setField(term285973, term285973.getClass(), "limitedContext", null);
        setField(term285964, term285964.getClass(), "privilegedContext", term285973);
        setField(term285964, term285964.getClass(), "combiner", null);
        setField(term285964, term285964.getClass(), "permissions", null);
        setField(term285964, term285964.getClass(), "parent", null);
        setBooleanField(term285964, term285964.getClass(), "isWrapped", false);
        setBooleanField(term285964, term285964.getClass(), "isLimited", false);
        setField(term285964, term285964.getClass(), "limitedContext", null);
        setField(term285945, term285945.getClass(), "acc", term285964);
        setBooleanField(term285945, term285945.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term285945, term285945.getClass(), "isPosted", false);
        setBooleanField(term285945, term285945.getClass(), "isSystemGenerated", false);
        setField(term285945, term285945.getClass(), "source", term285983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$7");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term285945;
        callMethod(klass, "mouseClicked", argTypes, term285928, args);
    }

};


