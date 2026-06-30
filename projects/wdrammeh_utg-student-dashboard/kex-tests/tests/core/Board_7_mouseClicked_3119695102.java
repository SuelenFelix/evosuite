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
     Object term341941;
     Object term341942;

    public Board_7_mouseClicked_3119695102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341941 = newInstance(Class.forName("core.Board$7"));
        setField(term341941, term341941.getClass(), "this$0", null);
        term341942 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term341955 = (byte[]) newByteArray(3);
        Object term341961 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term341962 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term341963 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term341964 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term341965 = (Object[]) newArray("java.security.Principal", 9);
        Object term341968 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term341973 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term341983 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term341942, term341942.getClass(), "x", 630174216);
        setIntField(term341942, term341942.getClass(), "y", -1081282297);
        setIntField(term341942, term341942.getClass(), "xAbs", 1331103887);
        setIntField(term341942, term341942.getClass(), "yAbs", 637911543);
        setIntField(term341942, term341942.getClass(), "clickCount", -779100899);
        setBooleanField(term341942, term341942.getClass(), "causedByTouchEvent", false);
        setIntField(term341942, term341942.getClass(), "button", -1750603840);
        setBooleanField(term341942, term341942.getClass(), "popupTrigger", true);
        setBooleanField(term341942, term341942.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term341942, term341942.getClass(), "when", 7950532649535587877L);
        setIntField(term341942, term341942.getClass(), "modifiers", 2088919651);
        setBooleanField(term341942, term341942.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term341955, 0, (byte) -52);
        setByteElement(term341955, 1, (byte) -33);
        setByteElement(term341955, 2, (byte) 16);
        setField(term341942, term341942.getClass(), "bdata", term341955);
        setIntField(term341942, term341942.getClass(), "id", 949997254);
        setBooleanField(term341942, term341942.getClass(), "consumed", false);
        setField(term341964, term341964.getClass(), "location", null);
        setField(term341964, term341964.getClass(), "signers", null);
        setField(term341964, term341964.getClass(), "certs", null);
        setField(term341964, term341964.getClass(), "sp", null);
        setField(term341964, term341964.getClass(), "factory", null);
        setField(term341964, term341964.getClass(), "locationNoFragString", null);
        setField(term341963, term341963.getClass(), "codesource", term341964);
        setField(term341963, term341963.getClass(), "classloader", null);
        setField(term341963, term341963.getClass(), "principals", term341965);
        setField(term341963, term341963.getClass(), "permissions", null);
        setBooleanField(term341963, term341963.getClass(), "hasAllPerm", false);
        setBooleanField(term341963, term341963.getClass(), "staticPermissions", false);
        setField(term341963, term341963.getClass(), "key", null);
        setElement(term341962, 0, term341963);
        setField(term341968, term341968.getClass(), "codesource", null);
        setField(term341968, term341968.getClass(), "classloader", null);
        setField(term341968, term341968.getClass(), "principals", null);
        setField(term341968, term341968.getClass(), "permissions", null);
        setBooleanField(term341968, term341968.getClass(), "hasAllPerm", false);
        setBooleanField(term341968, term341968.getClass(), "staticPermissions", false);
        setField(term341968, term341968.getClass(), "key", null);
        setElement(term341962, 1, term341968);
        setField(term341961, term341961.getClass(), "context", term341962);
        setBooleanField(term341961, term341961.getClass(), "isPrivileged", true);
        setBooleanField(term341961, term341961.getClass(), "isAuthorized", false);
        setField(term341973, term341973.getClass(), "context", null);
        setBooleanField(term341973, term341973.getClass(), "isPrivileged", false);
        setBooleanField(term341973, term341973.getClass(), "isAuthorized", false);
        setField(term341973, term341973.getClass(), "privilegedContext", null);
        setField(term341973, term341973.getClass(), "combiner", null);
        setField(term341973, term341973.getClass(), "permissions", null);
        setField(term341973, term341973.getClass(), "parent", null);
        setBooleanField(term341973, term341973.getClass(), "isWrapped", false);
        setBooleanField(term341973, term341973.getClass(), "isLimited", false);
        setField(term341973, term341973.getClass(), "limitedContext", null);
        setField(term341961, term341961.getClass(), "privilegedContext", term341973);
        setField(term341961, term341961.getClass(), "combiner", null);
        setField(term341961, term341961.getClass(), "permissions", null);
        setField(term341961, term341961.getClass(), "parent", null);
        setBooleanField(term341961, term341961.getClass(), "isWrapped", false);
        setBooleanField(term341961, term341961.getClass(), "isLimited", false);
        setField(term341961, term341961.getClass(), "limitedContext", null);
        setField(term341942, term341942.getClass(), "acc", term341961);
        setBooleanField(term341942, term341942.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term341942, term341942.getClass(), "isPosted", true);
        setBooleanField(term341942, term341942.getClass(), "isSystemGenerated", true);
        setField(term341942, term341942.getClass(), "source", term341983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board$7");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term341942;
        callMethod(klass, "mouseClicked", argTypes, term341941, args);
    }

};


