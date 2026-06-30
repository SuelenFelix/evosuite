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

public class ModuleAnalysis_GlassPrompt_1_mouseClicked_10058785392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56285;
     Object term56423;

    public ModuleAnalysis_GlassPrompt_1_mouseClicked_10058785392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56285 = newInstance(Class.forName("core.module.ModuleAnalysis$GlassPrompt$1"));
        Object term56286 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term56286, term56286.getClass(), "score", 0.2852810965221698);
        setField(term56286, term56286.getClass(), "code", "XjDhvToxJy");
        setField(term56286, term56286.getClass(), "name", "nxSTJflLQy");
        setField(term56286, term56286.getClass(), "year", "FlHzxEfFzI");
        setField(term56286, term56286.getClass(), "semester", "aSATgQUpoe");
        setField(term56286, term56286.getClass(), "lecturer", "VkPSXewZfB");
        setBooleanField(term56286, term56286.getClass(), "isLecturerEditable", false);
        setField(term56286, term56286.getClass(), "campus", "ubodzJoMGW");
        setField(term56286, term56286.getClass(), "room", "weddIktxOA");
        setField(term56286, term56286.getClass(), "day", "uSlMeISsDD");
        setField(term56286, term56286.getClass(), "time", "WdCiTDUKqn");
        setField(term56286, term56286.getClass(), "requirement", "PSizQDoxxe");
        setIntField(term56286, term56286.getClass(), "creditHours", -1127721881);
        setBooleanField(term56286, term56286.getClass(), "isConfirmed", true);
        setField(term56286, term56286.getClass(), "status", "mKaHyMybrK");
        setField(term56285, term56285.getClass(), "val$c", term56286);
        setField(term56285, term56285.getClass(), "this$0", null);
        term56423 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term56436 = (byte[]) newByteArray(5);
        Object term56444 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term56445 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term56446 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term56447 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term56448 = (Object[]) newArray("java.security.Principal", 9);
        Object term56451 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term56454 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term56457 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term56460 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term56465 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term56475 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term56423, term56423.getClass(), "x", -146054762);
        setIntField(term56423, term56423.getClass(), "y", 798043553);
        setIntField(term56423, term56423.getClass(), "xAbs", 533197381);
        setIntField(term56423, term56423.getClass(), "yAbs", 1048271679);
        setIntField(term56423, term56423.getClass(), "clickCount", -1529797673);
        setBooleanField(term56423, term56423.getClass(), "causedByTouchEvent", true);
        setIntField(term56423, term56423.getClass(), "button", -868676396);
        setBooleanField(term56423, term56423.getClass(), "popupTrigger", true);
        setBooleanField(term56423, term56423.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term56423, term56423.getClass(), "when", -8257434502486459194L);
        setIntField(term56423, term56423.getClass(), "modifiers", 1922684808);
        setBooleanField(term56423, term56423.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term56436, 0, (byte) 74);
        setByteElement(term56436, 1, (byte) -71);
        setByteElement(term56436, 2, (byte) 49);
        setByteElement(term56436, 3, (byte) -54);
        setByteElement(term56436, 4, (byte) 67);
        setField(term56423, term56423.getClass(), "bdata", term56436);
        setIntField(term56423, term56423.getClass(), "id", -2005784375);
        setBooleanField(term56423, term56423.getClass(), "consumed", true);
        setField(term56447, term56447.getClass(), "location", null);
        setField(term56447, term56447.getClass(), "signers", null);
        setField(term56447, term56447.getClass(), "certs", null);
        setField(term56447, term56447.getClass(), "sp", null);
        setField(term56447, term56447.getClass(), "factory", null);
        setField(term56447, term56447.getClass(), "locationNoFragString", null);
        setField(term56446, term56446.getClass(), "codesource", term56447);
        setField(term56446, term56446.getClass(), "classloader", null);
        setField(term56446, term56446.getClass(), "principals", term56448);
        setField(term56446, term56446.getClass(), "permissions", null);
        setBooleanField(term56446, term56446.getClass(), "hasAllPerm", false);
        setBooleanField(term56446, term56446.getClass(), "staticPermissions", false);
        setField(term56446, term56446.getClass(), "key", null);
        setElement(term56445, 0, term56446);
        setField(term56451, term56451.getClass(), "codesource", null);
        setField(term56451, term56451.getClass(), "classloader", null);
        setField(term56451, term56451.getClass(), "principals", null);
        setField(term56451, term56451.getClass(), "permissions", null);
        setBooleanField(term56451, term56451.getClass(), "hasAllPerm", false);
        setBooleanField(term56451, term56451.getClass(), "staticPermissions", false);
        setField(term56451, term56451.getClass(), "key", null);
        setElement(term56445, 1, term56451);
        setField(term56454, term56454.getClass(), "codesource", null);
        setField(term56454, term56454.getClass(), "classloader", null);
        setField(term56454, term56454.getClass(), "principals", null);
        setField(term56454, term56454.getClass(), "permissions", null);
        setBooleanField(term56454, term56454.getClass(), "hasAllPerm", false);
        setBooleanField(term56454, term56454.getClass(), "staticPermissions", false);
        setField(term56454, term56454.getClass(), "key", null);
        setElement(term56445, 2, term56454);
        setField(term56457, term56457.getClass(), "codesource", null);
        setField(term56457, term56457.getClass(), "classloader", null);
        setField(term56457, term56457.getClass(), "principals", null);
        setField(term56457, term56457.getClass(), "permissions", null);
        setBooleanField(term56457, term56457.getClass(), "hasAllPerm", false);
        setBooleanField(term56457, term56457.getClass(), "staticPermissions", false);
        setField(term56457, term56457.getClass(), "key", null);
        setElement(term56445, 3, term56457);
        setField(term56460, term56460.getClass(), "codesource", null);
        setField(term56460, term56460.getClass(), "classloader", null);
        setField(term56460, term56460.getClass(), "principals", null);
        setField(term56460, term56460.getClass(), "permissions", null);
        setBooleanField(term56460, term56460.getClass(), "hasAllPerm", false);
        setBooleanField(term56460, term56460.getClass(), "staticPermissions", false);
        setField(term56460, term56460.getClass(), "key", null);
        setElement(term56445, 4, term56460);
        setField(term56444, term56444.getClass(), "context", term56445);
        setBooleanField(term56444, term56444.getClass(), "isPrivileged", true);
        setBooleanField(term56444, term56444.getClass(), "isAuthorized", false);
        setField(term56465, term56465.getClass(), "context", null);
        setBooleanField(term56465, term56465.getClass(), "isPrivileged", false);
        setBooleanField(term56465, term56465.getClass(), "isAuthorized", false);
        setField(term56465, term56465.getClass(), "privilegedContext", null);
        setField(term56465, term56465.getClass(), "combiner", null);
        setField(term56465, term56465.getClass(), "permissions", null);
        setField(term56465, term56465.getClass(), "parent", null);
        setBooleanField(term56465, term56465.getClass(), "isWrapped", false);
        setBooleanField(term56465, term56465.getClass(), "isLimited", false);
        setField(term56465, term56465.getClass(), "limitedContext", null);
        setField(term56444, term56444.getClass(), "privilegedContext", term56465);
        setField(term56444, term56444.getClass(), "combiner", null);
        setField(term56444, term56444.getClass(), "permissions", null);
        setField(term56444, term56444.getClass(), "parent", null);
        setBooleanField(term56444, term56444.getClass(), "isWrapped", false);
        setBooleanField(term56444, term56444.getClass(), "isLimited", false);
        setField(term56444, term56444.getClass(), "limitedContext", null);
        setField(term56423, term56423.getClass(), "acc", term56444);
        setBooleanField(term56423, term56423.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term56423, term56423.getClass(), "isPosted", false);
        setBooleanField(term56423, term56423.getClass(), "isSystemGenerated", true);
        setField(term56423, term56423.getClass(), "source", term56475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$GlassPrompt$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term56423;
        callMethod(klass, "mouseClicked", argTypes, term56285, args);
    }

};


