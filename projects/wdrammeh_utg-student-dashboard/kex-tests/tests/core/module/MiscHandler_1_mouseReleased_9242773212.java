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

public class MiscHandler_1_mouseReleased_9242773212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87386;
     Object term87387;

    public MiscHandler_1_mouseReleased_9242773212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87386 = newInstance(Class.forName("core.module.MiscHandler$1"));
        setField(term87386, term87386.getClass(), "this$0", null);
        term87387 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term87400 = (byte[]) newByteArray(4);
        Object term87407 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term87408 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term87409 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term87410 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term87411 = (Object[]) newArray("java.security.Principal", 2);
        Object term87414 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term87419 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term87429 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term87387, term87387.getClass(), "x", -838848221);
        setIntField(term87387, term87387.getClass(), "y", 1163761623);
        setIntField(term87387, term87387.getClass(), "xAbs", 718742281);
        setIntField(term87387, term87387.getClass(), "yAbs", 1532723756);
        setIntField(term87387, term87387.getClass(), "clickCount", -124088550);
        setBooleanField(term87387, term87387.getClass(), "causedByTouchEvent", false);
        setIntField(term87387, term87387.getClass(), "button", 777492093);
        setBooleanField(term87387, term87387.getClass(), "popupTrigger", true);
        setBooleanField(term87387, term87387.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term87387, term87387.getClass(), "when", 8059786003080744426L);
        setIntField(term87387, term87387.getClass(), "modifiers", 1414025609);
        setBooleanField(term87387, term87387.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term87400, 0, (byte) -74);
        setByteElement(term87400, 1, (byte) -123);
        setByteElement(term87400, 2, (byte) -23);
        setByteElement(term87400, 3, (byte) 100);
        setField(term87387, term87387.getClass(), "bdata", term87400);
        setIntField(term87387, term87387.getClass(), "id", 255145822);
        setBooleanField(term87387, term87387.getClass(), "consumed", false);
        setField(term87410, term87410.getClass(), "location", null);
        setField(term87410, term87410.getClass(), "signers", null);
        setField(term87410, term87410.getClass(), "certs", null);
        setField(term87410, term87410.getClass(), "sp", null);
        setField(term87410, term87410.getClass(), "factory", null);
        setField(term87410, term87410.getClass(), "locationNoFragString", null);
        setField(term87409, term87409.getClass(), "codesource", term87410);
        setField(term87409, term87409.getClass(), "classloader", null);
        setField(term87409, term87409.getClass(), "principals", term87411);
        setField(term87409, term87409.getClass(), "permissions", null);
        setBooleanField(term87409, term87409.getClass(), "hasAllPerm", false);
        setBooleanField(term87409, term87409.getClass(), "staticPermissions", false);
        setField(term87409, term87409.getClass(), "key", null);
        setElement(term87408, 0, term87409);
        setField(term87414, term87414.getClass(), "codesource", null);
        setField(term87414, term87414.getClass(), "classloader", null);
        setField(term87414, term87414.getClass(), "principals", null);
        setField(term87414, term87414.getClass(), "permissions", null);
        setBooleanField(term87414, term87414.getClass(), "hasAllPerm", false);
        setBooleanField(term87414, term87414.getClass(), "staticPermissions", false);
        setField(term87414, term87414.getClass(), "key", null);
        setElement(term87408, 1, term87414);
        setField(term87407, term87407.getClass(), "context", term87408);
        setBooleanField(term87407, term87407.getClass(), "isPrivileged", true);
        setBooleanField(term87407, term87407.getClass(), "isAuthorized", true);
        setField(term87419, term87419.getClass(), "context", null);
        setBooleanField(term87419, term87419.getClass(), "isPrivileged", false);
        setBooleanField(term87419, term87419.getClass(), "isAuthorized", false);
        setField(term87419, term87419.getClass(), "privilegedContext", null);
        setField(term87419, term87419.getClass(), "combiner", null);
        setField(term87419, term87419.getClass(), "permissions", null);
        setField(term87419, term87419.getClass(), "parent", null);
        setBooleanField(term87419, term87419.getClass(), "isWrapped", false);
        setBooleanField(term87419, term87419.getClass(), "isLimited", false);
        setField(term87419, term87419.getClass(), "limitedContext", null);
        setField(term87407, term87407.getClass(), "privilegedContext", term87419);
        setField(term87407, term87407.getClass(), "combiner", null);
        setField(term87407, term87407.getClass(), "permissions", null);
        setField(term87407, term87407.getClass(), "parent", null);
        setBooleanField(term87407, term87407.getClass(), "isWrapped", false);
        setBooleanField(term87407, term87407.getClass(), "isLimited", false);
        setField(term87407, term87407.getClass(), "limitedContext", null);
        setField(term87387, term87387.getClass(), "acc", term87407);
        setBooleanField(term87387, term87387.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term87387, term87387.getClass(), "isPosted", true);
        setBooleanField(term87387, term87387.getClass(), "isSystemGenerated", true);
        setField(term87387, term87387.getClass(), "source", term87429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term87387;
        callMethod(klass, "mouseReleased", argTypes, term87386, args);
    }

};


