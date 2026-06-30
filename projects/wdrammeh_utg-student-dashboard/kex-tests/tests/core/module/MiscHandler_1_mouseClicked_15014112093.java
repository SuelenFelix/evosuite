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

public class MiscHandler_1_mouseClicked_15014112093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87434;
     Object term87435;

    public MiscHandler_1_mouseClicked_15014112093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87434 = newInstance(Class.forName("core.module.MiscHandler$1"));
        setField(term87434, term87434.getClass(), "this$0", null);
        term87435 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term87448 = (byte[]) newByteArray(9);
        Object term87460 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term87461 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term87462 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term87463 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term87464 = (Object[]) newArray("java.security.Principal", 5);
        Object term87467 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term87470 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term87473 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term87476 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term87479 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term87484 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term87494 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term87435, term87435.getClass(), "x", -43719302);
        setIntField(term87435, term87435.getClass(), "y", 1024134939);
        setIntField(term87435, term87435.getClass(), "xAbs", 109078154);
        setIntField(term87435, term87435.getClass(), "yAbs", -314165467);
        setIntField(term87435, term87435.getClass(), "clickCount", 963694071);
        setBooleanField(term87435, term87435.getClass(), "causedByTouchEvent", false);
        setIntField(term87435, term87435.getClass(), "button", -995785731);
        setBooleanField(term87435, term87435.getClass(), "popupTrigger", false);
        setBooleanField(term87435, term87435.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term87435, term87435.getClass(), "when", -4365849114644724155L);
        setIntField(term87435, term87435.getClass(), "modifiers", 1349815364);
        setBooleanField(term87435, term87435.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term87448, 0, (byte) 106);
        setByteElement(term87448, 1, (byte) -57);
        setByteElement(term87448, 2, (byte) -103);
        setByteElement(term87448, 3, (byte) 98);
        setByteElement(term87448, 4, (byte) 79);
        setByteElement(term87448, 5, (byte) 61);
        setByteElement(term87448, 6, (byte) -92);
        setByteElement(term87448, 7, (byte) -42);
        setByteElement(term87448, 8, (byte) 116);
        setField(term87435, term87435.getClass(), "bdata", term87448);
        setIntField(term87435, term87435.getClass(), "id", 2128383340);
        setBooleanField(term87435, term87435.getClass(), "consumed", true);
        setField(term87463, term87463.getClass(), "location", null);
        setField(term87463, term87463.getClass(), "signers", null);
        setField(term87463, term87463.getClass(), "certs", null);
        setField(term87463, term87463.getClass(), "sp", null);
        setField(term87463, term87463.getClass(), "factory", null);
        setField(term87463, term87463.getClass(), "locationNoFragString", null);
        setField(term87462, term87462.getClass(), "codesource", term87463);
        setField(term87462, term87462.getClass(), "classloader", null);
        setField(term87462, term87462.getClass(), "principals", term87464);
        setField(term87462, term87462.getClass(), "permissions", null);
        setBooleanField(term87462, term87462.getClass(), "hasAllPerm", false);
        setBooleanField(term87462, term87462.getClass(), "staticPermissions", false);
        setField(term87462, term87462.getClass(), "key", null);
        setElement(term87461, 0, term87462);
        setField(term87467, term87467.getClass(), "codesource", null);
        setField(term87467, term87467.getClass(), "classloader", null);
        setField(term87467, term87467.getClass(), "principals", null);
        setField(term87467, term87467.getClass(), "permissions", null);
        setBooleanField(term87467, term87467.getClass(), "hasAllPerm", false);
        setBooleanField(term87467, term87467.getClass(), "staticPermissions", false);
        setField(term87467, term87467.getClass(), "key", null);
        setElement(term87461, 1, term87467);
        setField(term87470, term87470.getClass(), "codesource", null);
        setField(term87470, term87470.getClass(), "classloader", null);
        setField(term87470, term87470.getClass(), "principals", null);
        setField(term87470, term87470.getClass(), "permissions", null);
        setBooleanField(term87470, term87470.getClass(), "hasAllPerm", false);
        setBooleanField(term87470, term87470.getClass(), "staticPermissions", false);
        setField(term87470, term87470.getClass(), "key", null);
        setElement(term87461, 2, term87470);
        setField(term87473, term87473.getClass(), "codesource", null);
        setField(term87473, term87473.getClass(), "classloader", null);
        setField(term87473, term87473.getClass(), "principals", null);
        setField(term87473, term87473.getClass(), "permissions", null);
        setBooleanField(term87473, term87473.getClass(), "hasAllPerm", false);
        setBooleanField(term87473, term87473.getClass(), "staticPermissions", false);
        setField(term87473, term87473.getClass(), "key", null);
        setElement(term87461, 3, term87473);
        setField(term87476, term87476.getClass(), "codesource", null);
        setField(term87476, term87476.getClass(), "classloader", null);
        setField(term87476, term87476.getClass(), "principals", null);
        setField(term87476, term87476.getClass(), "permissions", null);
        setBooleanField(term87476, term87476.getClass(), "hasAllPerm", false);
        setBooleanField(term87476, term87476.getClass(), "staticPermissions", false);
        setField(term87476, term87476.getClass(), "key", null);
        setElement(term87461, 4, term87476);
        setField(term87479, term87479.getClass(), "codesource", null);
        setField(term87479, term87479.getClass(), "classloader", null);
        setField(term87479, term87479.getClass(), "principals", null);
        setField(term87479, term87479.getClass(), "permissions", null);
        setBooleanField(term87479, term87479.getClass(), "hasAllPerm", false);
        setBooleanField(term87479, term87479.getClass(), "staticPermissions", false);
        setField(term87479, term87479.getClass(), "key", null);
        setElement(term87461, 5, term87479);
        setField(term87460, term87460.getClass(), "context", term87461);
        setBooleanField(term87460, term87460.getClass(), "isPrivileged", false);
        setBooleanField(term87460, term87460.getClass(), "isAuthorized", false);
        setField(term87484, term87484.getClass(), "context", null);
        setBooleanField(term87484, term87484.getClass(), "isPrivileged", false);
        setBooleanField(term87484, term87484.getClass(), "isAuthorized", false);
        setField(term87484, term87484.getClass(), "privilegedContext", null);
        setField(term87484, term87484.getClass(), "combiner", null);
        setField(term87484, term87484.getClass(), "permissions", null);
        setField(term87484, term87484.getClass(), "parent", null);
        setBooleanField(term87484, term87484.getClass(), "isWrapped", false);
        setBooleanField(term87484, term87484.getClass(), "isLimited", false);
        setField(term87484, term87484.getClass(), "limitedContext", null);
        setField(term87460, term87460.getClass(), "privilegedContext", term87484);
        setField(term87460, term87460.getClass(), "combiner", null);
        setField(term87460, term87460.getClass(), "permissions", null);
        setField(term87460, term87460.getClass(), "parent", null);
        setBooleanField(term87460, term87460.getClass(), "isWrapped", false);
        setBooleanField(term87460, term87460.getClass(), "isLimited", false);
        setField(term87460, term87460.getClass(), "limitedContext", null);
        setField(term87435, term87435.getClass(), "acc", term87460);
        setBooleanField(term87435, term87435.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term87435, term87435.getClass(), "isPosted", true);
        setBooleanField(term87435, term87435.getClass(), "isSystemGenerated", false);
        setField(term87435, term87435.getClass(), "source", term87494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term87435;
        callMethod(klass, "mouseClicked", argTypes, term87434, args);
    }

};


