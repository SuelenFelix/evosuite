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
     Object term161041;
     Object term161054;

    public ModuleAnalysis_GlassPrompt_3_mouseClicked_10058786012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161041 = newInstance(Class.forName("core.module.ModuleAnalysis$GlassPrompt$3"));
        setField(term161041, term161041.getClass(), "val$tutorName", "paPzDETzIq");
        setField(term161041, term161041.getClass(), "this$0", null);
        term161054 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term161067 = (byte[]) newByteArray(3);
        Object term161073 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term161074 = (Object[]) newArray("java.security.ProtectionDomain", 9);
        Object term161075 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term161076 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term161077 = (Object[]) newArray("java.security.Principal", 4);
        Object term161080 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term161083 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term161086 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term161089 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term161092 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term161095 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term161098 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term161101 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term161106 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term161116 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term161054, term161054.getClass(), "x", -1592307668);
        setIntField(term161054, term161054.getClass(), "y", -203832871);
        setIntField(term161054, term161054.getClass(), "xAbs", 1151963130);
        setIntField(term161054, term161054.getClass(), "yAbs", -1855819749);
        setIntField(term161054, term161054.getClass(), "clickCount", 1059048043);
        setBooleanField(term161054, term161054.getClass(), "causedByTouchEvent", false);
        setIntField(term161054, term161054.getClass(), "button", 537273345);
        setBooleanField(term161054, term161054.getClass(), "popupTrigger", false);
        setBooleanField(term161054, term161054.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term161054, term161054.getClass(), "when", -1333707622307134180L);
        setIntField(term161054, term161054.getClass(), "modifiers", -346107257);
        setBooleanField(term161054, term161054.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term161067, 0, (byte) -74);
        setByteElement(term161067, 1, (byte) -123);
        setByteElement(term161067, 2, (byte) -23);
        setField(term161054, term161054.getClass(), "bdata", term161067);
        setIntField(term161054, term161054.getClass(), "id", -1577393360);
        setBooleanField(term161054, term161054.getClass(), "consumed", true);
        setField(term161076, term161076.getClass(), "location", null);
        setField(term161076, term161076.getClass(), "signers", null);
        setField(term161076, term161076.getClass(), "certs", null);
        setField(term161076, term161076.getClass(), "sp", null);
        setField(term161076, term161076.getClass(), "factory", null);
        setField(term161076, term161076.getClass(), "locationNoFragString", null);
        setField(term161075, term161075.getClass(), "codesource", term161076);
        setField(term161075, term161075.getClass(), "classloader", null);
        setField(term161075, term161075.getClass(), "principals", term161077);
        setField(term161075, term161075.getClass(), "permissions", null);
        setBooleanField(term161075, term161075.getClass(), "hasAllPerm", false);
        setBooleanField(term161075, term161075.getClass(), "staticPermissions", false);
        setField(term161075, term161075.getClass(), "key", null);
        setElement(term161074, 0, term161075);
        setField(term161080, term161080.getClass(), "codesource", null);
        setField(term161080, term161080.getClass(), "classloader", null);
        setField(term161080, term161080.getClass(), "principals", null);
        setField(term161080, term161080.getClass(), "permissions", null);
        setBooleanField(term161080, term161080.getClass(), "hasAllPerm", false);
        setBooleanField(term161080, term161080.getClass(), "staticPermissions", false);
        setField(term161080, term161080.getClass(), "key", null);
        setElement(term161074, 1, term161080);
        setField(term161083, term161083.getClass(), "codesource", null);
        setField(term161083, term161083.getClass(), "classloader", null);
        setField(term161083, term161083.getClass(), "principals", null);
        setField(term161083, term161083.getClass(), "permissions", null);
        setBooleanField(term161083, term161083.getClass(), "hasAllPerm", false);
        setBooleanField(term161083, term161083.getClass(), "staticPermissions", false);
        setField(term161083, term161083.getClass(), "key", null);
        setElement(term161074, 2, term161083);
        setField(term161086, term161086.getClass(), "codesource", null);
        setField(term161086, term161086.getClass(), "classloader", null);
        setField(term161086, term161086.getClass(), "principals", null);
        setField(term161086, term161086.getClass(), "permissions", null);
        setBooleanField(term161086, term161086.getClass(), "hasAllPerm", false);
        setBooleanField(term161086, term161086.getClass(), "staticPermissions", false);
        setField(term161086, term161086.getClass(), "key", null);
        setElement(term161074, 3, term161086);
        setField(term161089, term161089.getClass(), "codesource", null);
        setField(term161089, term161089.getClass(), "classloader", null);
        setField(term161089, term161089.getClass(), "principals", null);
        setField(term161089, term161089.getClass(), "permissions", null);
        setBooleanField(term161089, term161089.getClass(), "hasAllPerm", false);
        setBooleanField(term161089, term161089.getClass(), "staticPermissions", false);
        setField(term161089, term161089.getClass(), "key", null);
        setElement(term161074, 4, term161089);
        setField(term161092, term161092.getClass(), "codesource", null);
        setField(term161092, term161092.getClass(), "classloader", null);
        setField(term161092, term161092.getClass(), "principals", null);
        setField(term161092, term161092.getClass(), "permissions", null);
        setBooleanField(term161092, term161092.getClass(), "hasAllPerm", false);
        setBooleanField(term161092, term161092.getClass(), "staticPermissions", false);
        setField(term161092, term161092.getClass(), "key", null);
        setElement(term161074, 5, term161092);
        setField(term161095, term161095.getClass(), "codesource", null);
        setField(term161095, term161095.getClass(), "classloader", null);
        setField(term161095, term161095.getClass(), "principals", null);
        setField(term161095, term161095.getClass(), "permissions", null);
        setBooleanField(term161095, term161095.getClass(), "hasAllPerm", false);
        setBooleanField(term161095, term161095.getClass(), "staticPermissions", false);
        setField(term161095, term161095.getClass(), "key", null);
        setElement(term161074, 6, term161095);
        setField(term161098, term161098.getClass(), "codesource", null);
        setField(term161098, term161098.getClass(), "classloader", null);
        setField(term161098, term161098.getClass(), "principals", null);
        setField(term161098, term161098.getClass(), "permissions", null);
        setBooleanField(term161098, term161098.getClass(), "hasAllPerm", false);
        setBooleanField(term161098, term161098.getClass(), "staticPermissions", false);
        setField(term161098, term161098.getClass(), "key", null);
        setElement(term161074, 7, term161098);
        setField(term161101, term161101.getClass(), "codesource", null);
        setField(term161101, term161101.getClass(), "classloader", null);
        setField(term161101, term161101.getClass(), "principals", null);
        setField(term161101, term161101.getClass(), "permissions", null);
        setBooleanField(term161101, term161101.getClass(), "hasAllPerm", false);
        setBooleanField(term161101, term161101.getClass(), "staticPermissions", false);
        setField(term161101, term161101.getClass(), "key", null);
        setElement(term161074, 8, term161101);
        setField(term161073, term161073.getClass(), "context", term161074);
        setBooleanField(term161073, term161073.getClass(), "isPrivileged", true);
        setBooleanField(term161073, term161073.getClass(), "isAuthorized", true);
        setField(term161106, term161106.getClass(), "context", null);
        setBooleanField(term161106, term161106.getClass(), "isPrivileged", false);
        setBooleanField(term161106, term161106.getClass(), "isAuthorized", false);
        setField(term161106, term161106.getClass(), "privilegedContext", null);
        setField(term161106, term161106.getClass(), "combiner", null);
        setField(term161106, term161106.getClass(), "permissions", null);
        setField(term161106, term161106.getClass(), "parent", null);
        setBooleanField(term161106, term161106.getClass(), "isWrapped", false);
        setBooleanField(term161106, term161106.getClass(), "isLimited", false);
        setField(term161106, term161106.getClass(), "limitedContext", null);
        setField(term161073, term161073.getClass(), "privilegedContext", term161106);
        setField(term161073, term161073.getClass(), "combiner", null);
        setField(term161073, term161073.getClass(), "permissions", null);
        setField(term161073, term161073.getClass(), "parent", null);
        setBooleanField(term161073, term161073.getClass(), "isWrapped", false);
        setBooleanField(term161073, term161073.getClass(), "isLimited", false);
        setField(term161073, term161073.getClass(), "limitedContext", null);
        setField(term161054, term161054.getClass(), "acc", term161073);
        setBooleanField(term161054, term161054.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term161054, term161054.getClass(), "isPosted", true);
        setBooleanField(term161054, term161054.getClass(), "isSystemGenerated", true);
        setField(term161054, term161054.getClass(), "source", term161116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$GlassPrompt$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term161054;
        callMethod(klass, "mouseClicked", argTypes, term161041, args);
    }

};


