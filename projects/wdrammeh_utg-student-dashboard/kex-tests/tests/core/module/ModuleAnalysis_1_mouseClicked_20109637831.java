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

public class ModuleAnalysis_1_mouseClicked_20109637831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86114;
     Object term86115;

    public ModuleAnalysis_1_mouseClicked_20109637831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86114 = newInstance(Class.forName("core.module.ModuleAnalysis$1"));
        setField(term86114, term86114.getClass(), "this$0", null);
        term86115 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term86128 = (byte[]) newByteArray(6);
        Object term86137 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term86138 = (Object[]) newArray("java.security.ProtectionDomain", 4);
        Object term86139 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term86140 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term86141 = (Object[]) newArray("java.security.Principal", 1);
        Object term86144 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term86147 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term86150 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term86155 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term86165 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term86115, term86115.getClass(), "x", -1794965320);
        setIntField(term86115, term86115.getClass(), "y", 520504102);
        setIntField(term86115, term86115.getClass(), "xAbs", -457396133);
        setIntField(term86115, term86115.getClass(), "yAbs", -1793950607);
        setIntField(term86115, term86115.getClass(), "clickCount", 1091954101);
        setBooleanField(term86115, term86115.getClass(), "causedByTouchEvent", true);
        setIntField(term86115, term86115.getClass(), "button", 1895143076);
        setBooleanField(term86115, term86115.getClass(), "popupTrigger", false);
        setBooleanField(term86115, term86115.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term86115, term86115.getClass(), "when", 8428634514691209827L);
        setIntField(term86115, term86115.getClass(), "modifiers", 1981860404);
        setBooleanField(term86115, term86115.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term86128, 0, (byte) 80);
        setByteElement(term86128, 1, (byte) 42);
        setByteElement(term86128, 2, (byte) 72);
        setByteElement(term86128, 3, (byte) 111);
        setByteElement(term86128, 4, (byte) 99);
        setByteElement(term86128, 5, (byte) -12);
        setField(term86115, term86115.getClass(), "bdata", term86128);
        setIntField(term86115, term86115.getClass(), "id", 732174235);
        setBooleanField(term86115, term86115.getClass(), "consumed", false);
        setField(term86140, term86140.getClass(), "location", null);
        setField(term86140, term86140.getClass(), "signers", null);
        setField(term86140, term86140.getClass(), "certs", null);
        setField(term86140, term86140.getClass(), "sp", null);
        setField(term86140, term86140.getClass(), "factory", null);
        setField(term86140, term86140.getClass(), "locationNoFragString", null);
        setField(term86139, term86139.getClass(), "codesource", term86140);
        setField(term86139, term86139.getClass(), "classloader", null);
        setField(term86139, term86139.getClass(), "principals", term86141);
        setField(term86139, term86139.getClass(), "permissions", null);
        setBooleanField(term86139, term86139.getClass(), "hasAllPerm", false);
        setBooleanField(term86139, term86139.getClass(), "staticPermissions", false);
        setField(term86139, term86139.getClass(), "key", null);
        setElement(term86138, 0, term86139);
        setField(term86144, term86144.getClass(), "codesource", null);
        setField(term86144, term86144.getClass(), "classloader", null);
        setField(term86144, term86144.getClass(), "principals", null);
        setField(term86144, term86144.getClass(), "permissions", null);
        setBooleanField(term86144, term86144.getClass(), "hasAllPerm", false);
        setBooleanField(term86144, term86144.getClass(), "staticPermissions", false);
        setField(term86144, term86144.getClass(), "key", null);
        setElement(term86138, 1, term86144);
        setField(term86147, term86147.getClass(), "codesource", null);
        setField(term86147, term86147.getClass(), "classloader", null);
        setField(term86147, term86147.getClass(), "principals", null);
        setField(term86147, term86147.getClass(), "permissions", null);
        setBooleanField(term86147, term86147.getClass(), "hasAllPerm", false);
        setBooleanField(term86147, term86147.getClass(), "staticPermissions", false);
        setField(term86147, term86147.getClass(), "key", null);
        setElement(term86138, 2, term86147);
        setField(term86150, term86150.getClass(), "codesource", null);
        setField(term86150, term86150.getClass(), "classloader", null);
        setField(term86150, term86150.getClass(), "principals", null);
        setField(term86150, term86150.getClass(), "permissions", null);
        setBooleanField(term86150, term86150.getClass(), "hasAllPerm", false);
        setBooleanField(term86150, term86150.getClass(), "staticPermissions", false);
        setField(term86150, term86150.getClass(), "key", null);
        setElement(term86138, 3, term86150);
        setField(term86137, term86137.getClass(), "context", term86138);
        setBooleanField(term86137, term86137.getClass(), "isPrivileged", true);
        setBooleanField(term86137, term86137.getClass(), "isAuthorized", false);
        setField(term86155, term86155.getClass(), "context", null);
        setBooleanField(term86155, term86155.getClass(), "isPrivileged", false);
        setBooleanField(term86155, term86155.getClass(), "isAuthorized", false);
        setField(term86155, term86155.getClass(), "privilegedContext", null);
        setField(term86155, term86155.getClass(), "combiner", null);
        setField(term86155, term86155.getClass(), "permissions", null);
        setField(term86155, term86155.getClass(), "parent", null);
        setBooleanField(term86155, term86155.getClass(), "isWrapped", false);
        setBooleanField(term86155, term86155.getClass(), "isLimited", false);
        setField(term86155, term86155.getClass(), "limitedContext", null);
        setField(term86137, term86137.getClass(), "privilegedContext", term86155);
        setField(term86137, term86137.getClass(), "combiner", null);
        setField(term86137, term86137.getClass(), "permissions", null);
        setField(term86137, term86137.getClass(), "parent", null);
        setBooleanField(term86137, term86137.getClass(), "isWrapped", false);
        setBooleanField(term86137, term86137.getClass(), "isLimited", false);
        setField(term86137, term86137.getClass(), "limitedContext", null);
        setField(term86115, term86115.getClass(), "acc", term86137);
        setBooleanField(term86115, term86115.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term86115, term86115.getClass(), "isPosted", true);
        setBooleanField(term86115, term86115.getClass(), "isSystemGenerated", false);
        setField(term86115, term86115.getClass(), "source", term86165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term86115;
        callMethod(klass, "mouseClicked", argTypes, term86114, args);
    }

};


