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

public class ModuleAnalysis_6_mouseClicked_20109639381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76768;
     Object term76785;

    public ModuleAnalysis_6_mouseClicked_20109639381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term76781 = new ArrayList();
        term76768 = newInstance(Class.forName("core.module.ModuleAnalysis$6"));
        setField(term76768, term76768.getClass(), "val$semTex", "oKhVzOKUFW");
        setField(term76768, term76768.getClass(), "val$fractionalSem", term76781);
        setField(term76768, term76768.getClass(), "this$0", null);
        term76785 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term76798 = (byte[]) newByteArray(0);
        Object term76801 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term76802 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term76803 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term76804 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term76805 = (Object[]) newArray("java.security.Principal", 1);
        Object term76808 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term76811 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term76814 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term76817 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term76822 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term76832 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term76785, term76785.getClass(), "x", -726681073);
        setIntField(term76785, term76785.getClass(), "y", -1724487863);
        setIntField(term76785, term76785.getClass(), "xAbs", -128490829);
        setIntField(term76785, term76785.getClass(), "yAbs", 202214133);
        setIntField(term76785, term76785.getClass(), "clickCount", 1543091617);
        setBooleanField(term76785, term76785.getClass(), "causedByTouchEvent", false);
        setIntField(term76785, term76785.getClass(), "button", -763166094);
        setBooleanField(term76785, term76785.getClass(), "popupTrigger", false);
        setBooleanField(term76785, term76785.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term76785, term76785.getClass(), "when", -8885298608300233488L);
        setIntField(term76785, term76785.getClass(), "modifiers", -222941705);
        setBooleanField(term76785, term76785.getClass(), "canAccessSystemClipboard", false);
        setField(term76785, term76785.getClass(), "bdata", term76798);
        setIntField(term76785, term76785.getClass(), "id", 291864719);
        setBooleanField(term76785, term76785.getClass(), "consumed", false);
        setField(term76804, term76804.getClass(), "location", null);
        setField(term76804, term76804.getClass(), "signers", null);
        setField(term76804, term76804.getClass(), "certs", null);
        setField(term76804, term76804.getClass(), "sp", null);
        setField(term76804, term76804.getClass(), "factory", null);
        setField(term76804, term76804.getClass(), "locationNoFragString", null);
        setField(term76803, term76803.getClass(), "codesource", term76804);
        setField(term76803, term76803.getClass(), "classloader", null);
        setField(term76803, term76803.getClass(), "principals", term76805);
        setField(term76803, term76803.getClass(), "permissions", null);
        setBooleanField(term76803, term76803.getClass(), "hasAllPerm", false);
        setBooleanField(term76803, term76803.getClass(), "staticPermissions", false);
        setField(term76803, term76803.getClass(), "key", null);
        setElement(term76802, 0, term76803);
        setField(term76808, term76808.getClass(), "codesource", null);
        setField(term76808, term76808.getClass(), "classloader", null);
        setField(term76808, term76808.getClass(), "principals", null);
        setField(term76808, term76808.getClass(), "permissions", null);
        setBooleanField(term76808, term76808.getClass(), "hasAllPerm", false);
        setBooleanField(term76808, term76808.getClass(), "staticPermissions", false);
        setField(term76808, term76808.getClass(), "key", null);
        setElement(term76802, 1, term76808);
        setField(term76811, term76811.getClass(), "codesource", null);
        setField(term76811, term76811.getClass(), "classloader", null);
        setField(term76811, term76811.getClass(), "principals", null);
        setField(term76811, term76811.getClass(), "permissions", null);
        setBooleanField(term76811, term76811.getClass(), "hasAllPerm", false);
        setBooleanField(term76811, term76811.getClass(), "staticPermissions", false);
        setField(term76811, term76811.getClass(), "key", null);
        setElement(term76802, 2, term76811);
        setField(term76814, term76814.getClass(), "codesource", null);
        setField(term76814, term76814.getClass(), "classloader", null);
        setField(term76814, term76814.getClass(), "principals", null);
        setField(term76814, term76814.getClass(), "permissions", null);
        setBooleanField(term76814, term76814.getClass(), "hasAllPerm", false);
        setBooleanField(term76814, term76814.getClass(), "staticPermissions", false);
        setField(term76814, term76814.getClass(), "key", null);
        setElement(term76802, 3, term76814);
        setField(term76817, term76817.getClass(), "codesource", null);
        setField(term76817, term76817.getClass(), "classloader", null);
        setField(term76817, term76817.getClass(), "principals", null);
        setField(term76817, term76817.getClass(), "permissions", null);
        setBooleanField(term76817, term76817.getClass(), "hasAllPerm", false);
        setBooleanField(term76817, term76817.getClass(), "staticPermissions", false);
        setField(term76817, term76817.getClass(), "key", null);
        setElement(term76802, 4, term76817);
        setField(term76801, term76801.getClass(), "context", term76802);
        setBooleanField(term76801, term76801.getClass(), "isPrivileged", false);
        setBooleanField(term76801, term76801.getClass(), "isAuthorized", true);
        setField(term76822, term76822.getClass(), "context", null);
        setBooleanField(term76822, term76822.getClass(), "isPrivileged", false);
        setBooleanField(term76822, term76822.getClass(), "isAuthorized", false);
        setField(term76822, term76822.getClass(), "privilegedContext", null);
        setField(term76822, term76822.getClass(), "combiner", null);
        setField(term76822, term76822.getClass(), "permissions", null);
        setField(term76822, term76822.getClass(), "parent", null);
        setBooleanField(term76822, term76822.getClass(), "isWrapped", false);
        setBooleanField(term76822, term76822.getClass(), "isLimited", false);
        setField(term76822, term76822.getClass(), "limitedContext", null);
        setField(term76801, term76801.getClass(), "privilegedContext", term76822);
        setField(term76801, term76801.getClass(), "combiner", null);
        setField(term76801, term76801.getClass(), "permissions", null);
        setField(term76801, term76801.getClass(), "parent", null);
        setBooleanField(term76801, term76801.getClass(), "isWrapped", false);
        setBooleanField(term76801, term76801.getClass(), "isLimited", false);
        setField(term76801, term76801.getClass(), "limitedContext", null);
        setField(term76785, term76785.getClass(), "acc", term76801);
        setBooleanField(term76785, term76785.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term76785, term76785.getClass(), "isPosted", false);
        setBooleanField(term76785, term76785.getClass(), "isSystemGenerated", true);
        setField(term76785, term76785.getClass(), "source", term76832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$6");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term76785;
        callMethod(klass, "mouseClicked", argTypes, term76768, args);
    }

};


