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

public class Board_7_mouseClicked_3119695102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341947;
     Object term341948;

    public Board_7_mouseClicked_3119695102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341947 = newInstance(Class.forName("core.Board$7"));
        setField(term341947, term341947.getClass(), "this$0", null);
        term341948 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term341961 = (byte[]) newByteArray(3);
        Object term341967 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term341968 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term341969 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term341970 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term341971 = (Object[]) newArray("java.security.Principal", 9);
        Object term341974 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term341979 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term341989 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term341948, term341948.getClass(), "x", 630174216);
        setIntField(term341948, term341948.getClass(), "y", -1081282297);
        setIntField(term341948, term341948.getClass(), "xAbs", 1331103887);
        setIntField(term341948, term341948.getClass(), "yAbs", 637911543);
        setIntField(term341948, term341948.getClass(), "clickCount", -779100899);
        setBooleanField(term341948, term341948.getClass(), "causedByTouchEvent", false);
        setIntField(term341948, term341948.getClass(), "button", -1750603840);
        setBooleanField(term341948, term341948.getClass(), "popupTrigger", true);
        setBooleanField(term341948, term341948.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term341948, term341948.getClass(), "when", 7950532649535587877L);
        setIntField(term341948, term341948.getClass(), "modifiers", 2088919651);
        setBooleanField(term341948, term341948.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term341961, 0, (byte) -52);
        setByteElement(term341961, 1, (byte) -33);
        setByteElement(term341961, 2, (byte) 16);
        setField(term341948, term341948.getClass(), "bdata", term341961);
        setIntField(term341948, term341948.getClass(), "id", 949997254);
        setBooleanField(term341948, term341948.getClass(), "consumed", false);
        setField(term341970, term341970.getClass(), "location", null);
        setField(term341970, term341970.getClass(), "signers", null);
        setField(term341970, term341970.getClass(), "certs", null);
        setField(term341970, term341970.getClass(), "sp", null);
        setField(term341970, term341970.getClass(), "factory", null);
        setField(term341970, term341970.getClass(), "locationNoFragString", null);
        setField(term341969, term341969.getClass(), "codesource", term341970);
        setField(term341969, term341969.getClass(), "classloader", null);
        setField(term341969, term341969.getClass(), "principals", term341971);
        setField(term341969, term341969.getClass(), "permissions", null);
        setBooleanField(term341969, term341969.getClass(), "hasAllPerm", false);
        setBooleanField(term341969, term341969.getClass(), "staticPermissions", false);
        setField(term341969, term341969.getClass(), "key", null);
        setElement(term341968, 0, term341969);
        setField(term341974, term341974.getClass(), "codesource", null);
        setField(term341974, term341974.getClass(), "classloader", null);
        setField(term341974, term341974.getClass(), "principals", null);
        setField(term341974, term341974.getClass(), "permissions", null);
        setBooleanField(term341974, term341974.getClass(), "hasAllPerm", false);
        setBooleanField(term341974, term341974.getClass(), "staticPermissions", false);
        setField(term341974, term341974.getClass(), "key", null);
        setElement(term341968, 1, term341974);
        setField(term341967, term341967.getClass(), "context", term341968);
        setBooleanField(term341967, term341967.getClass(), "isPrivileged", true);
        setBooleanField(term341967, term341967.getClass(), "isAuthorized", false);
        setField(term341979, term341979.getClass(), "context", null);
        setBooleanField(term341979, term341979.getClass(), "isPrivileged", false);
        setBooleanField(term341979, term341979.getClass(), "isAuthorized", false);
        setField(term341979, term341979.getClass(), "privilegedContext", null);
        setField(term341979, term341979.getClass(), "combiner", null);
        setField(term341979, term341979.getClass(), "permissions", null);
        setField(term341979, term341979.getClass(), "parent", null);
        setBooleanField(term341979, term341979.getClass(), "isWrapped", false);
        setBooleanField(term341979, term341979.getClass(), "isLimited", false);
        setField(term341979, term341979.getClass(), "limitedContext", null);
        setField(term341967, term341967.getClass(), "privilegedContext", term341979);
        setField(term341967, term341967.getClass(), "combiner", null);
        setField(term341967, term341967.getClass(), "permissions", null);
        setField(term341967, term341967.getClass(), "parent", null);
        setBooleanField(term341967, term341967.getClass(), "isWrapped", false);
        setBooleanField(term341967, term341967.getClass(), "isLimited", false);
        setField(term341967, term341967.getClass(), "limitedContext", null);
        setField(term341948, term341948.getClass(), "acc", term341967);
        setBooleanField(term341948, term341948.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term341948, term341948.getClass(), "isPosted", true);
        setBooleanField(term341948, term341948.getClass(), "isSystemGenerated", true);
        setField(term341948, term341948.getClass(), "source", term341989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$7");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term341948;
        callMethod(klass, "mouseClicked", argTypes, term341947, args);
    }

};


