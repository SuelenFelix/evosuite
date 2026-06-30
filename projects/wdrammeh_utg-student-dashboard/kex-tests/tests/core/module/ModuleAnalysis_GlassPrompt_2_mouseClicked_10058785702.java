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

public class ModuleAnalysis_GlassPrompt_2_mouseClicked_10058785702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55100;
     Object term55125;

    public ModuleAnalysis_GlassPrompt_2_mouseClicked_10058785702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55100 = newInstance(Class.forName("core.module.ModuleAnalysis$GlassPrompt$2"));
        setField(term55100, term55100.getClass(), "val$tutorName", "MnovcqFhCl");
        setField(term55100, term55100.getClass(), "val$year", "qYtAeLzOhW");
        setField(term55100, term55100.getClass(), "this$0", null);
        term55125 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term55138 = (byte[]) newByteArray(6);
        Object term55147 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term55148 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term55149 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term55150 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term55151 = (Object[]) newArray("java.security.Principal", 6);
        Object term55154 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term55157 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term55160 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term55163 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term55166 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term55169 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term55172 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term55177 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term55187 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term55125, term55125.getClass(), "x", -1351605385);
        setIntField(term55125, term55125.getClass(), "y", 278355793);
        setIntField(term55125, term55125.getClass(), "xAbs", -310648604);
        setIntField(term55125, term55125.getClass(), "yAbs", -648200466);
        setIntField(term55125, term55125.getClass(), "clickCount", 2007134147);
        setBooleanField(term55125, term55125.getClass(), "causedByTouchEvent", false);
        setIntField(term55125, term55125.getClass(), "button", 993388358);
        setBooleanField(term55125, term55125.getClass(), "popupTrigger", true);
        setBooleanField(term55125, term55125.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term55125, term55125.getClass(), "when", 6375119433582206027L);
        setIntField(term55125, term55125.getClass(), "modifiers", -765191335);
        setBooleanField(term55125, term55125.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term55138, 0, (byte) -54);
        setByteElement(term55138, 1, (byte) -10);
        setByteElement(term55138, 2, (byte) 79);
        setByteElement(term55138, 3, (byte) -119);
        setByteElement(term55138, 4, (byte) -66);
        setByteElement(term55138, 5, (byte) 83);
        setField(term55125, term55125.getClass(), "bdata", term55138);
        setIntField(term55125, term55125.getClass(), "id", -1697741155);
        setBooleanField(term55125, term55125.getClass(), "consumed", true);
        setField(term55150, term55150.getClass(), "location", null);
        setField(term55150, term55150.getClass(), "signers", null);
        setField(term55150, term55150.getClass(), "certs", null);
        setField(term55150, term55150.getClass(), "sp", null);
        setField(term55150, term55150.getClass(), "factory", null);
        setField(term55150, term55150.getClass(), "locationNoFragString", null);
        setField(term55149, term55149.getClass(), "codesource", term55150);
        setField(term55149, term55149.getClass(), "classloader", null);
        setField(term55149, term55149.getClass(), "principals", term55151);
        setField(term55149, term55149.getClass(), "permissions", null);
        setBooleanField(term55149, term55149.getClass(), "hasAllPerm", false);
        setBooleanField(term55149, term55149.getClass(), "staticPermissions", false);
        setField(term55149, term55149.getClass(), "key", null);
        setElement(term55148, 0, term55149);
        setField(term55154, term55154.getClass(), "codesource", null);
        setField(term55154, term55154.getClass(), "classloader", null);
        setField(term55154, term55154.getClass(), "principals", null);
        setField(term55154, term55154.getClass(), "permissions", null);
        setBooleanField(term55154, term55154.getClass(), "hasAllPerm", false);
        setBooleanField(term55154, term55154.getClass(), "staticPermissions", false);
        setField(term55154, term55154.getClass(), "key", null);
        setElement(term55148, 1, term55154);
        setField(term55157, term55157.getClass(), "codesource", null);
        setField(term55157, term55157.getClass(), "classloader", null);
        setField(term55157, term55157.getClass(), "principals", null);
        setField(term55157, term55157.getClass(), "permissions", null);
        setBooleanField(term55157, term55157.getClass(), "hasAllPerm", false);
        setBooleanField(term55157, term55157.getClass(), "staticPermissions", false);
        setField(term55157, term55157.getClass(), "key", null);
        setElement(term55148, 2, term55157);
        setField(term55160, term55160.getClass(), "codesource", null);
        setField(term55160, term55160.getClass(), "classloader", null);
        setField(term55160, term55160.getClass(), "principals", null);
        setField(term55160, term55160.getClass(), "permissions", null);
        setBooleanField(term55160, term55160.getClass(), "hasAllPerm", false);
        setBooleanField(term55160, term55160.getClass(), "staticPermissions", false);
        setField(term55160, term55160.getClass(), "key", null);
        setElement(term55148, 3, term55160);
        setField(term55163, term55163.getClass(), "codesource", null);
        setField(term55163, term55163.getClass(), "classloader", null);
        setField(term55163, term55163.getClass(), "principals", null);
        setField(term55163, term55163.getClass(), "permissions", null);
        setBooleanField(term55163, term55163.getClass(), "hasAllPerm", false);
        setBooleanField(term55163, term55163.getClass(), "staticPermissions", false);
        setField(term55163, term55163.getClass(), "key", null);
        setElement(term55148, 4, term55163);
        setField(term55166, term55166.getClass(), "codesource", null);
        setField(term55166, term55166.getClass(), "classloader", null);
        setField(term55166, term55166.getClass(), "principals", null);
        setField(term55166, term55166.getClass(), "permissions", null);
        setBooleanField(term55166, term55166.getClass(), "hasAllPerm", false);
        setBooleanField(term55166, term55166.getClass(), "staticPermissions", false);
        setField(term55166, term55166.getClass(), "key", null);
        setElement(term55148, 5, term55166);
        setField(term55169, term55169.getClass(), "codesource", null);
        setField(term55169, term55169.getClass(), "classloader", null);
        setField(term55169, term55169.getClass(), "principals", null);
        setField(term55169, term55169.getClass(), "permissions", null);
        setBooleanField(term55169, term55169.getClass(), "hasAllPerm", false);
        setBooleanField(term55169, term55169.getClass(), "staticPermissions", false);
        setField(term55169, term55169.getClass(), "key", null);
        setElement(term55148, 6, term55169);
        setField(term55172, term55172.getClass(), "codesource", null);
        setField(term55172, term55172.getClass(), "classloader", null);
        setField(term55172, term55172.getClass(), "principals", null);
        setField(term55172, term55172.getClass(), "permissions", null);
        setBooleanField(term55172, term55172.getClass(), "hasAllPerm", false);
        setBooleanField(term55172, term55172.getClass(), "staticPermissions", false);
        setField(term55172, term55172.getClass(), "key", null);
        setElement(term55148, 7, term55172);
        setField(term55147, term55147.getClass(), "context", term55148);
        setBooleanField(term55147, term55147.getClass(), "isPrivileged", false);
        setBooleanField(term55147, term55147.getClass(), "isAuthorized", true);
        setField(term55177, term55177.getClass(), "context", null);
        setBooleanField(term55177, term55177.getClass(), "isPrivileged", false);
        setBooleanField(term55177, term55177.getClass(), "isAuthorized", false);
        setField(term55177, term55177.getClass(), "privilegedContext", null);
        setField(term55177, term55177.getClass(), "combiner", null);
        setField(term55177, term55177.getClass(), "permissions", null);
        setField(term55177, term55177.getClass(), "parent", null);
        setBooleanField(term55177, term55177.getClass(), "isWrapped", false);
        setBooleanField(term55177, term55177.getClass(), "isLimited", false);
        setField(term55177, term55177.getClass(), "limitedContext", null);
        setField(term55147, term55147.getClass(), "privilegedContext", term55177);
        setField(term55147, term55147.getClass(), "combiner", null);
        setField(term55147, term55147.getClass(), "permissions", null);
        setField(term55147, term55147.getClass(), "parent", null);
        setBooleanField(term55147, term55147.getClass(), "isWrapped", false);
        setBooleanField(term55147, term55147.getClass(), "isLimited", false);
        setField(term55147, term55147.getClass(), "limitedContext", null);
        setField(term55125, term55125.getClass(), "acc", term55147);
        setBooleanField(term55125, term55125.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term55125, term55125.getClass(), "isPosted", false);
        setBooleanField(term55125, term55125.getClass(), "isSystemGenerated", false);
        setField(term55125, term55125.getClass(), "source", term55187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$GlassPrompt$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term55125;
        callMethod(klass, "mouseClicked", argTypes, term55100, args);
    }

};


