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
     Object term161962;
     Object term161987;

    public ModuleAnalysis_GlassPrompt_2_mouseClicked_10058785702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161962 = newInstance(Class.forName("core.module.ModuleAnalysis$GlassPrompt$2"));
        setField(term161962, term161962.getClass(), "val$tutorName", "YVLRenzuoR");
        setField(term161962, term161962.getClass(), "val$year", "JukEMhPWql");
        setField(term161962, term161962.getClass(), "this$0", null);
        term161987 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term162000 = (byte[]) newByteArray(9);
        Object term162012 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term162013 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term162014 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term162015 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term162016 = (Object[]) newArray("java.security.Principal", 1);
        Object term162019 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term162024 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term162034 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term161987, term161987.getClass(), "x", -269528550);
        setIntField(term161987, term161987.getClass(), "y", 2108571355);
        setIntField(term161987, term161987.getClass(), "xAbs", 1909966089);
        setIntField(term161987, term161987.getClass(), "yAbs", 1827255916);
        setIntField(term161987, term161987.getClass(), "clickCount", 2039815750);
        setBooleanField(term161987, term161987.getClass(), "causedByTouchEvent", false);
        setIntField(term161987, term161987.getClass(), "button", 2079590265);
        setBooleanField(term161987, term161987.getClass(), "popupTrigger", true);
        setBooleanField(term161987, term161987.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term161987, term161987.getClass(), "when", -4360569253593381888L);
        setIntField(term161987, term161987.getClass(), "modifiers", -435079567);
        setBooleanField(term161987, term161987.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term162000, 0, (byte) 100);
        setByteElement(term162000, 1, (byte) 106);
        setByteElement(term162000, 2, (byte) -57);
        setByteElement(term162000, 3, (byte) -103);
        setByteElement(term162000, 4, (byte) 98);
        setByteElement(term162000, 5, (byte) 79);
        setByteElement(term162000, 6, (byte) 61);
        setByteElement(term162000, 7, (byte) -92);
        setByteElement(term162000, 8, (byte) -42);
        setField(term161987, term161987.getClass(), "bdata", term162000);
        setIntField(term161987, term161987.getClass(), "id", -1017617829);
        setBooleanField(term161987, term161987.getClass(), "consumed", false);
        setField(term162015, term162015.getClass(), "location", null);
        setField(term162015, term162015.getClass(), "signers", null);
        setField(term162015, term162015.getClass(), "certs", null);
        setField(term162015, term162015.getClass(), "sp", null);
        setField(term162015, term162015.getClass(), "factory", null);
        setField(term162015, term162015.getClass(), "locationNoFragString", null);
        setField(term162014, term162014.getClass(), "codesource", term162015);
        setField(term162014, term162014.getClass(), "classloader", null);
        setField(term162014, term162014.getClass(), "principals", term162016);
        setField(term162014, term162014.getClass(), "permissions", null);
        setBooleanField(term162014, term162014.getClass(), "hasAllPerm", false);
        setBooleanField(term162014, term162014.getClass(), "staticPermissions", false);
        setField(term162014, term162014.getClass(), "key", null);
        setElement(term162013, 0, term162014);
        setField(term162019, term162019.getClass(), "codesource", null);
        setField(term162019, term162019.getClass(), "classloader", null);
        setField(term162019, term162019.getClass(), "principals", null);
        setField(term162019, term162019.getClass(), "permissions", null);
        setBooleanField(term162019, term162019.getClass(), "hasAllPerm", false);
        setBooleanField(term162019, term162019.getClass(), "staticPermissions", false);
        setField(term162019, term162019.getClass(), "key", null);
        setElement(term162013, 1, term162019);
        setField(term162012, term162012.getClass(), "context", term162013);
        setBooleanField(term162012, term162012.getClass(), "isPrivileged", true);
        setBooleanField(term162012, term162012.getClass(), "isAuthorized", false);
        setField(term162024, term162024.getClass(), "context", null);
        setBooleanField(term162024, term162024.getClass(), "isPrivileged", false);
        setBooleanField(term162024, term162024.getClass(), "isAuthorized", false);
        setField(term162024, term162024.getClass(), "privilegedContext", null);
        setField(term162024, term162024.getClass(), "combiner", null);
        setField(term162024, term162024.getClass(), "permissions", null);
        setField(term162024, term162024.getClass(), "parent", null);
        setBooleanField(term162024, term162024.getClass(), "isWrapped", false);
        setBooleanField(term162024, term162024.getClass(), "isLimited", false);
        setField(term162024, term162024.getClass(), "limitedContext", null);
        setField(term162012, term162012.getClass(), "privilegedContext", term162024);
        setField(term162012, term162012.getClass(), "combiner", null);
        setField(term162012, term162012.getClass(), "permissions", null);
        setField(term162012, term162012.getClass(), "parent", null);
        setBooleanField(term162012, term162012.getClass(), "isWrapped", false);
        setBooleanField(term162012, term162012.getClass(), "isLimited", false);
        setField(term162012, term162012.getClass(), "limitedContext", null);
        setField(term161987, term161987.getClass(), "acc", term162012);
        setBooleanField(term161987, term161987.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term161987, term161987.getClass(), "isPosted", false);
        setBooleanField(term161987, term161987.getClass(), "isSystemGenerated", false);
        setField(term161987, term161987.getClass(), "source", term162034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$GlassPrompt$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term161987;
        callMethod(klass, "mouseClicked", argTypes, term161962, args);
    }

};


