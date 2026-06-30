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

public class ModuleAnalysis_GlassPrompt_3_mouseClicked_10058786012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54111;
     Object term54124;

    public ModuleAnalysis_GlassPrompt_3_mouseClicked_10058786012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54111 = newInstance(Class.forName("core.module.ModuleAnalysis$GlassPrompt$3"));
        setField(term54111, term54111.getClass(), "val$tutorName", "GsWxOwXvSu");
        setField(term54111, term54111.getClass(), "this$0", null);
        term54124 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term54137 = (byte[]) newByteArray(7);
        Object term54147 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term54148 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term54149 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term54150 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term54151 = (Object[]) newArray("java.security.Principal", 4);
        Object term54154 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term54157 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term54160 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term54163 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term54166 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term54171 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term54181 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term54124, term54124.getClass(), "x", 1252951645);
        setIntField(term54124, term54124.getClass(), "y", 574481092);
        setIntField(term54124, term54124.getClass(), "xAbs", -310528004);
        setIntField(term54124, term54124.getClass(), "yAbs", -634976996);
        setIntField(term54124, term54124.getClass(), "clickCount", -1015274146);
        setBooleanField(term54124, term54124.getClass(), "causedByTouchEvent", false);
        setIntField(term54124, term54124.getClass(), "button", -49052672);
        setBooleanField(term54124, term54124.getClass(), "popupTrigger", true);
        setBooleanField(term54124, term54124.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term54124, term54124.getClass(), "when", 2442117782898005296L);
        setIntField(term54124, term54124.getClass(), "modifiers", 339372704);
        setBooleanField(term54124, term54124.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term54137, 0, (byte) 47);
        setByteElement(term54137, 1, (byte) 48);
        setByteElement(term54137, 2, (byte) 89);
        setByteElement(term54137, 3, (byte) 75);
        setByteElement(term54137, 4, (byte) 18);
        setByteElement(term54137, 5, (byte) -58);
        setByteElement(term54137, 6, (byte) -29);
        setField(term54124, term54124.getClass(), "bdata", term54137);
        setIntField(term54124, term54124.getClass(), "id", -851097944);
        setBooleanField(term54124, term54124.getClass(), "consumed", true);
        setField(term54150, term54150.getClass(), "location", null);
        setField(term54150, term54150.getClass(), "signers", null);
        setField(term54150, term54150.getClass(), "certs", null);
        setField(term54150, term54150.getClass(), "sp", null);
        setField(term54150, term54150.getClass(), "factory", null);
        setField(term54150, term54150.getClass(), "locationNoFragString", null);
        setField(term54149, term54149.getClass(), "codesource", term54150);
        setField(term54149, term54149.getClass(), "classloader", null);
        setField(term54149, term54149.getClass(), "principals", term54151);
        setField(term54149, term54149.getClass(), "permissions", null);
        setBooleanField(term54149, term54149.getClass(), "hasAllPerm", false);
        setBooleanField(term54149, term54149.getClass(), "staticPermissions", false);
        setField(term54149, term54149.getClass(), "key", null);
        setElement(term54148, 0, term54149);
        setField(term54154, term54154.getClass(), "codesource", null);
        setField(term54154, term54154.getClass(), "classloader", null);
        setField(term54154, term54154.getClass(), "principals", null);
        setField(term54154, term54154.getClass(), "permissions", null);
        setBooleanField(term54154, term54154.getClass(), "hasAllPerm", false);
        setBooleanField(term54154, term54154.getClass(), "staticPermissions", false);
        setField(term54154, term54154.getClass(), "key", null);
        setElement(term54148, 1, term54154);
        setField(term54157, term54157.getClass(), "codesource", null);
        setField(term54157, term54157.getClass(), "classloader", null);
        setField(term54157, term54157.getClass(), "principals", null);
        setField(term54157, term54157.getClass(), "permissions", null);
        setBooleanField(term54157, term54157.getClass(), "hasAllPerm", false);
        setBooleanField(term54157, term54157.getClass(), "staticPermissions", false);
        setField(term54157, term54157.getClass(), "key", null);
        setElement(term54148, 2, term54157);
        setField(term54160, term54160.getClass(), "codesource", null);
        setField(term54160, term54160.getClass(), "classloader", null);
        setField(term54160, term54160.getClass(), "principals", null);
        setField(term54160, term54160.getClass(), "permissions", null);
        setBooleanField(term54160, term54160.getClass(), "hasAllPerm", false);
        setBooleanField(term54160, term54160.getClass(), "staticPermissions", false);
        setField(term54160, term54160.getClass(), "key", null);
        setElement(term54148, 3, term54160);
        setField(term54163, term54163.getClass(), "codesource", null);
        setField(term54163, term54163.getClass(), "classloader", null);
        setField(term54163, term54163.getClass(), "principals", null);
        setField(term54163, term54163.getClass(), "permissions", null);
        setBooleanField(term54163, term54163.getClass(), "hasAllPerm", false);
        setBooleanField(term54163, term54163.getClass(), "staticPermissions", false);
        setField(term54163, term54163.getClass(), "key", null);
        setElement(term54148, 4, term54163);
        setField(term54166, term54166.getClass(), "codesource", null);
        setField(term54166, term54166.getClass(), "classloader", null);
        setField(term54166, term54166.getClass(), "principals", null);
        setField(term54166, term54166.getClass(), "permissions", null);
        setBooleanField(term54166, term54166.getClass(), "hasAllPerm", false);
        setBooleanField(term54166, term54166.getClass(), "staticPermissions", false);
        setField(term54166, term54166.getClass(), "key", null);
        setElement(term54148, 5, term54166);
        setField(term54147, term54147.getClass(), "context", term54148);
        setBooleanField(term54147, term54147.getClass(), "isPrivileged", true);
        setBooleanField(term54147, term54147.getClass(), "isAuthorized", true);
        setField(term54171, term54171.getClass(), "context", null);
        setBooleanField(term54171, term54171.getClass(), "isPrivileged", false);
        setBooleanField(term54171, term54171.getClass(), "isAuthorized", false);
        setField(term54171, term54171.getClass(), "privilegedContext", null);
        setField(term54171, term54171.getClass(), "combiner", null);
        setField(term54171, term54171.getClass(), "permissions", null);
        setField(term54171, term54171.getClass(), "parent", null);
        setBooleanField(term54171, term54171.getClass(), "isWrapped", false);
        setBooleanField(term54171, term54171.getClass(), "isLimited", false);
        setField(term54171, term54171.getClass(), "limitedContext", null);
        setField(term54147, term54147.getClass(), "privilegedContext", term54171);
        setField(term54147, term54147.getClass(), "combiner", null);
        setField(term54147, term54147.getClass(), "permissions", null);
        setField(term54147, term54147.getClass(), "parent", null);
        setBooleanField(term54147, term54147.getClass(), "isWrapped", false);
        setBooleanField(term54147, term54147.getClass(), "isLimited", false);
        setField(term54147, term54147.getClass(), "limitedContext", null);
        setField(term54124, term54124.getClass(), "acc", term54147);
        setBooleanField(term54124, term54124.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term54124, term54124.getClass(), "isPosted", false);
        setBooleanField(term54124, term54124.getClass(), "isSystemGenerated", true);
        setField(term54124, term54124.getClass(), "source", term54181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$GlassPrompt$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term54124;
        callMethod(klass, "mouseClicked", argTypes, term54111, args);
    }

};


