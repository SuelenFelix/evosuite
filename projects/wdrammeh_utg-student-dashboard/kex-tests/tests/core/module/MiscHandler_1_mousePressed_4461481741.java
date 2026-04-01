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

public class MiscHandler_1_mousePressed_4461481741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304967;
     Object term304968;

    public MiscHandler_1_mousePressed_4461481741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304967 = newInstance(Class.forName("core.module.MiscHandler$1"));
        setField(term304967, term304967.getClass(), "this$0", null);
        term304968 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term304981 = (byte[]) newByteArray(1);
        Object term304985 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term304986 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term304987 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term304988 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term304989 = (Object[]) newArray("java.security.Principal", 4);
        Object term304994 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term305004 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term304968, term304968.getClass(), "x", 1418222767);
        setIntField(term304968, term304968.getClass(), "y", 1862441057);
        setIntField(term304968, term304968.getClass(), "xAbs", 1889814117);
        setIntField(term304968, term304968.getClass(), "yAbs", -1336297368);
        setIntField(term304968, term304968.getClass(), "clickCount", 1535507114);
        setBooleanField(term304968, term304968.getClass(), "causedByTouchEvent", false);
        setIntField(term304968, term304968.getClass(), "button", -1174141307);
        setBooleanField(term304968, term304968.getClass(), "popupTrigger", false);
        setBooleanField(term304968, term304968.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term304968, term304968.getClass(), "when", 2722004046017350471L);
        setIntField(term304968, term304968.getClass(), "modifiers", -1603957392);
        setBooleanField(term304968, term304968.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term304981, 0, (byte) -10);
        setField(term304968, term304968.getClass(), "bdata", term304981);
        setIntField(term304968, term304968.getClass(), "id", -287005602);
        setBooleanField(term304968, term304968.getClass(), "consumed", true);
        setField(term304988, term304988.getClass(), "location", null);
        setField(term304988, term304988.getClass(), "signers", null);
        setField(term304988, term304988.getClass(), "certs", null);
        setField(term304988, term304988.getClass(), "sp", null);
        setField(term304988, term304988.getClass(), "factory", null);
        setField(term304988, term304988.getClass(), "locationNoFragString", null);
        setField(term304987, term304987.getClass(), "codesource", term304988);
        setField(term304987, term304987.getClass(), "classloader", null);
        setField(term304987, term304987.getClass(), "principals", term304989);
        setField(term304987, term304987.getClass(), "permissions", null);
        setBooleanField(term304987, term304987.getClass(), "hasAllPerm", false);
        setBooleanField(term304987, term304987.getClass(), "staticPermissions", false);
        setField(term304987, term304987.getClass(), "key", null);
        setElement(term304986, 0, term304987);
        setField(term304985, term304985.getClass(), "context", term304986);
        setBooleanField(term304985, term304985.getClass(), "isPrivileged", false);
        setBooleanField(term304985, term304985.getClass(), "isAuthorized", false);
        setField(term304994, term304994.getClass(), "context", null);
        setBooleanField(term304994, term304994.getClass(), "isPrivileged", false);
        setBooleanField(term304994, term304994.getClass(), "isAuthorized", false);
        setField(term304994, term304994.getClass(), "privilegedContext", null);
        setField(term304994, term304994.getClass(), "combiner", null);
        setField(term304994, term304994.getClass(), "permissions", null);
        setField(term304994, term304994.getClass(), "parent", null);
        setBooleanField(term304994, term304994.getClass(), "isWrapped", false);
        setBooleanField(term304994, term304994.getClass(), "isLimited", false);
        setField(term304994, term304994.getClass(), "limitedContext", null);
        setField(term304985, term304985.getClass(), "privilegedContext", term304994);
        setField(term304985, term304985.getClass(), "combiner", null);
        setField(term304985, term304985.getClass(), "permissions", null);
        setField(term304985, term304985.getClass(), "parent", null);
        setBooleanField(term304985, term304985.getClass(), "isWrapped", false);
        setBooleanField(term304985, term304985.getClass(), "isLimited", false);
        setField(term304985, term304985.getClass(), "limitedContext", null);
        setField(term304968, term304968.getClass(), "acc", term304985);
        setBooleanField(term304968, term304968.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term304968, term304968.getClass(), "isPosted", false);
        setBooleanField(term304968, term304968.getClass(), "isSystemGenerated", false);
        setField(term304968, term304968.getClass(), "source", term305004);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term304968;
        callMethod(klass, "mousePressed", argTypes, term304967, args);
    }

};


