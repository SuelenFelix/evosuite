package core;

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
import static core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Board_12_mouseClicked_3469234882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225203;
     Object term225204;

    public Board_12_mouseClicked_3469234882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225203 = newInstance(Class.forName("core.Board$12"));
        setField(term225203, term225203.getClass(), "this$0", null);
        term225204 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term225217 = (byte[]) newByteArray(7);
        Object term225227 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term225228 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term225229 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225230 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term225231 = (Object[]) newArray("java.security.Principal", 8);
        Object term225234 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225237 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225240 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225243 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225246 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225249 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225252 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term225257 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term225267 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term225204, term225204.getClass(), "x", 1232958763);
        setIntField(term225204, term225204.getClass(), "y", -1702132549);
        setIntField(term225204, term225204.getClass(), "xAbs", -1786136772);
        setIntField(term225204, term225204.getClass(), "yAbs", -1510967747);
        setIntField(term225204, term225204.getClass(), "clickCount", -2014792457);
        setBooleanField(term225204, term225204.getClass(), "causedByTouchEvent", true);
        setIntField(term225204, term225204.getClass(), "button", 1957633116);
        setBooleanField(term225204, term225204.getClass(), "popupTrigger", false);
        setBooleanField(term225204, term225204.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term225204, term225204.getClass(), "when", 5246058710498845622L);
        setIntField(term225204, term225204.getClass(), "modifiers", 1428598210);
        setBooleanField(term225204, term225204.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term225217, 0, (byte) -112);
        setByteElement(term225217, 1, (byte) 81);
        setByteElement(term225217, 2, (byte) 65);
        setByteElement(term225217, 3, (byte) -44);
        setByteElement(term225217, 4, (byte) 33);
        setByteElement(term225217, 5, (byte) -74);
        setByteElement(term225217, 6, (byte) -84);
        setField(term225204, term225204.getClass(), "bdata", term225217);
        setIntField(term225204, term225204.getClass(), "id", 1071776561);
        setBooleanField(term225204, term225204.getClass(), "consumed", false);
        setField(term225230, term225230.getClass(), "location", null);
        setField(term225230, term225230.getClass(), "signers", null);
        setField(term225230, term225230.getClass(), "certs", null);
        setField(term225230, term225230.getClass(), "sp", null);
        setField(term225230, term225230.getClass(), "factory", null);
        setField(term225230, term225230.getClass(), "locationNoFragString", null);
        setField(term225229, term225229.getClass(), "codesource", term225230);
        setField(term225229, term225229.getClass(), "classloader", null);
        setField(term225229, term225229.getClass(), "principals", term225231);
        setField(term225229, term225229.getClass(), "permissions", null);
        setBooleanField(term225229, term225229.getClass(), "hasAllPerm", false);
        setBooleanField(term225229, term225229.getClass(), "staticPermissions", false);
        setField(term225229, term225229.getClass(), "key", null);
        setElement(term225228, 0, term225229);
        setField(term225234, term225234.getClass(), "codesource", null);
        setField(term225234, term225234.getClass(), "classloader", null);
        setField(term225234, term225234.getClass(), "principals", null);
        setField(term225234, term225234.getClass(), "permissions", null);
        setBooleanField(term225234, term225234.getClass(), "hasAllPerm", false);
        setBooleanField(term225234, term225234.getClass(), "staticPermissions", false);
        setField(term225234, term225234.getClass(), "key", null);
        setElement(term225228, 1, term225234);
        setField(term225237, term225237.getClass(), "codesource", null);
        setField(term225237, term225237.getClass(), "classloader", null);
        setField(term225237, term225237.getClass(), "principals", null);
        setField(term225237, term225237.getClass(), "permissions", null);
        setBooleanField(term225237, term225237.getClass(), "hasAllPerm", false);
        setBooleanField(term225237, term225237.getClass(), "staticPermissions", false);
        setField(term225237, term225237.getClass(), "key", null);
        setElement(term225228, 2, term225237);
        setField(term225240, term225240.getClass(), "codesource", null);
        setField(term225240, term225240.getClass(), "classloader", null);
        setField(term225240, term225240.getClass(), "principals", null);
        setField(term225240, term225240.getClass(), "permissions", null);
        setBooleanField(term225240, term225240.getClass(), "hasAllPerm", false);
        setBooleanField(term225240, term225240.getClass(), "staticPermissions", false);
        setField(term225240, term225240.getClass(), "key", null);
        setElement(term225228, 3, term225240);
        setField(term225243, term225243.getClass(), "codesource", null);
        setField(term225243, term225243.getClass(), "classloader", null);
        setField(term225243, term225243.getClass(), "principals", null);
        setField(term225243, term225243.getClass(), "permissions", null);
        setBooleanField(term225243, term225243.getClass(), "hasAllPerm", false);
        setBooleanField(term225243, term225243.getClass(), "staticPermissions", false);
        setField(term225243, term225243.getClass(), "key", null);
        setElement(term225228, 4, term225243);
        setField(term225246, term225246.getClass(), "codesource", null);
        setField(term225246, term225246.getClass(), "classloader", null);
        setField(term225246, term225246.getClass(), "principals", null);
        setField(term225246, term225246.getClass(), "permissions", null);
        setBooleanField(term225246, term225246.getClass(), "hasAllPerm", false);
        setBooleanField(term225246, term225246.getClass(), "staticPermissions", false);
        setField(term225246, term225246.getClass(), "key", null);
        setElement(term225228, 5, term225246);
        setField(term225249, term225249.getClass(), "codesource", null);
        setField(term225249, term225249.getClass(), "classloader", null);
        setField(term225249, term225249.getClass(), "principals", null);
        setField(term225249, term225249.getClass(), "permissions", null);
        setBooleanField(term225249, term225249.getClass(), "hasAllPerm", false);
        setBooleanField(term225249, term225249.getClass(), "staticPermissions", false);
        setField(term225249, term225249.getClass(), "key", null);
        setElement(term225228, 6, term225249);
        setField(term225252, term225252.getClass(), "codesource", null);
        setField(term225252, term225252.getClass(), "classloader", null);
        setField(term225252, term225252.getClass(), "principals", null);
        setField(term225252, term225252.getClass(), "permissions", null);
        setBooleanField(term225252, term225252.getClass(), "hasAllPerm", false);
        setBooleanField(term225252, term225252.getClass(), "staticPermissions", false);
        setField(term225252, term225252.getClass(), "key", null);
        setElement(term225228, 7, term225252);
        setField(term225227, term225227.getClass(), "context", term225228);
        setBooleanField(term225227, term225227.getClass(), "isPrivileged", false);
        setBooleanField(term225227, term225227.getClass(), "isAuthorized", true);
        setField(term225257, term225257.getClass(), "context", null);
        setBooleanField(term225257, term225257.getClass(), "isPrivileged", false);
        setBooleanField(term225257, term225257.getClass(), "isAuthorized", false);
        setField(term225257, term225257.getClass(), "privilegedContext", null);
        setField(term225257, term225257.getClass(), "combiner", null);
        setField(term225257, term225257.getClass(), "permissions", null);
        setField(term225257, term225257.getClass(), "parent", null);
        setBooleanField(term225257, term225257.getClass(), "isWrapped", false);
        setBooleanField(term225257, term225257.getClass(), "isLimited", false);
        setField(term225257, term225257.getClass(), "limitedContext", null);
        setField(term225227, term225227.getClass(), "privilegedContext", term225257);
        setField(term225227, term225227.getClass(), "combiner", null);
        setField(term225227, term225227.getClass(), "permissions", null);
        setField(term225227, term225227.getClass(), "parent", null);
        setBooleanField(term225227, term225227.getClass(), "isWrapped", false);
        setBooleanField(term225227, term225227.getClass(), "isLimited", false);
        setField(term225227, term225227.getClass(), "limitedContext", null);
        setField(term225204, term225204.getClass(), "acc", term225227);
        setBooleanField(term225204, term225204.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term225204, term225204.getClass(), "isPosted", false);
        setBooleanField(term225204, term225204.getClass(), "isSystemGenerated", true);
        setField(term225204, term225204.getClass(), "source", term225267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$12");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term225204;
        callMethod(klass, "mouseClicked", argTypes, term225203, args);
    }

};


