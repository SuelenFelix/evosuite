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

public class SummerHandler_1_mouseClicked_19336997703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98050;
     Object term98051;

    public SummerHandler_1_mouseClicked_19336997703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98050 = newInstance(Class.forName("core.module.SummerHandler$1"));
        setField(term98050, term98050.getClass(), "this$0", null);
        term98051 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term98064 = (byte[]) newByteArray(9);
        Object term98076 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term98077 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term98078 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98079 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term98080 = (Object[]) newArray("java.security.Principal", 1);
        Object term98083 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98086 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98089 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98092 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98095 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98100 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term98110 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term98051, term98051.getClass(), "x", -834193529);
        setIntField(term98051, term98051.getClass(), "y", 335780735);
        setIntField(term98051, term98051.getClass(), "xAbs", -1541981599);
        setIntField(term98051, term98051.getClass(), "yAbs", 1605456363);
        setIntField(term98051, term98051.getClass(), "clickCount", 2059896693);
        setBooleanField(term98051, term98051.getClass(), "causedByTouchEvent", true);
        setIntField(term98051, term98051.getClass(), "button", 2109912812);
        setBooleanField(term98051, term98051.getClass(), "popupTrigger", false);
        setBooleanField(term98051, term98051.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term98051, term98051.getClass(), "when", 6855071767938501807L);
        setIntField(term98051, term98051.getClass(), "modifiers", 1841286431);
        setBooleanField(term98051, term98051.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term98064, 0, (byte) 123);
        setByteElement(term98064, 1, (byte) -5);
        setByteElement(term98064, 2, (byte) 84);
        setByteElement(term98064, 3, (byte) -97);
        setByteElement(term98064, 4, (byte) -24);
        setByteElement(term98064, 5, (byte) 88);
        setByteElement(term98064, 6, (byte) 96);
        setByteElement(term98064, 7, (byte) 70);
        setByteElement(term98064, 8, (byte) 48);
        setField(term98051, term98051.getClass(), "bdata", term98064);
        setIntField(term98051, term98051.getClass(), "id", -1723168189);
        setBooleanField(term98051, term98051.getClass(), "consumed", false);
        setField(term98079, term98079.getClass(), "location", null);
        setField(term98079, term98079.getClass(), "signers", null);
        setField(term98079, term98079.getClass(), "certs", null);
        setField(term98079, term98079.getClass(), "sp", null);
        setField(term98079, term98079.getClass(), "factory", null);
        setField(term98079, term98079.getClass(), "locationNoFragString", null);
        setField(term98078, term98078.getClass(), "codesource", term98079);
        setField(term98078, term98078.getClass(), "classloader", null);
        setField(term98078, term98078.getClass(), "principals", term98080);
        setField(term98078, term98078.getClass(), "permissions", null);
        setBooleanField(term98078, term98078.getClass(), "hasAllPerm", false);
        setBooleanField(term98078, term98078.getClass(), "staticPermissions", false);
        setField(term98078, term98078.getClass(), "key", null);
        setElement(term98077, 0, term98078);
        setField(term98083, term98083.getClass(), "codesource", null);
        setField(term98083, term98083.getClass(), "classloader", null);
        setField(term98083, term98083.getClass(), "principals", null);
        setField(term98083, term98083.getClass(), "permissions", null);
        setBooleanField(term98083, term98083.getClass(), "hasAllPerm", false);
        setBooleanField(term98083, term98083.getClass(), "staticPermissions", false);
        setField(term98083, term98083.getClass(), "key", null);
        setElement(term98077, 1, term98083);
        setField(term98086, term98086.getClass(), "codesource", null);
        setField(term98086, term98086.getClass(), "classloader", null);
        setField(term98086, term98086.getClass(), "principals", null);
        setField(term98086, term98086.getClass(), "permissions", null);
        setBooleanField(term98086, term98086.getClass(), "hasAllPerm", false);
        setBooleanField(term98086, term98086.getClass(), "staticPermissions", false);
        setField(term98086, term98086.getClass(), "key", null);
        setElement(term98077, 2, term98086);
        setField(term98089, term98089.getClass(), "codesource", null);
        setField(term98089, term98089.getClass(), "classloader", null);
        setField(term98089, term98089.getClass(), "principals", null);
        setField(term98089, term98089.getClass(), "permissions", null);
        setBooleanField(term98089, term98089.getClass(), "hasAllPerm", false);
        setBooleanField(term98089, term98089.getClass(), "staticPermissions", false);
        setField(term98089, term98089.getClass(), "key", null);
        setElement(term98077, 3, term98089);
        setField(term98092, term98092.getClass(), "codesource", null);
        setField(term98092, term98092.getClass(), "classloader", null);
        setField(term98092, term98092.getClass(), "principals", null);
        setField(term98092, term98092.getClass(), "permissions", null);
        setBooleanField(term98092, term98092.getClass(), "hasAllPerm", false);
        setBooleanField(term98092, term98092.getClass(), "staticPermissions", false);
        setField(term98092, term98092.getClass(), "key", null);
        setElement(term98077, 4, term98092);
        setField(term98095, term98095.getClass(), "codesource", null);
        setField(term98095, term98095.getClass(), "classloader", null);
        setField(term98095, term98095.getClass(), "principals", null);
        setField(term98095, term98095.getClass(), "permissions", null);
        setBooleanField(term98095, term98095.getClass(), "hasAllPerm", false);
        setBooleanField(term98095, term98095.getClass(), "staticPermissions", false);
        setField(term98095, term98095.getClass(), "key", null);
        setElement(term98077, 5, term98095);
        setField(term98076, term98076.getClass(), "context", term98077);
        setBooleanField(term98076, term98076.getClass(), "isPrivileged", true);
        setBooleanField(term98076, term98076.getClass(), "isAuthorized", true);
        setField(term98100, term98100.getClass(), "context", null);
        setBooleanField(term98100, term98100.getClass(), "isPrivileged", false);
        setBooleanField(term98100, term98100.getClass(), "isAuthorized", false);
        setField(term98100, term98100.getClass(), "privilegedContext", null);
        setField(term98100, term98100.getClass(), "combiner", null);
        setField(term98100, term98100.getClass(), "permissions", null);
        setField(term98100, term98100.getClass(), "parent", null);
        setBooleanField(term98100, term98100.getClass(), "isWrapped", false);
        setBooleanField(term98100, term98100.getClass(), "isLimited", false);
        setField(term98100, term98100.getClass(), "limitedContext", null);
        setField(term98076, term98076.getClass(), "privilegedContext", term98100);
        setField(term98076, term98076.getClass(), "combiner", null);
        setField(term98076, term98076.getClass(), "permissions", null);
        setField(term98076, term98076.getClass(), "parent", null);
        setBooleanField(term98076, term98076.getClass(), "isWrapped", false);
        setBooleanField(term98076, term98076.getClass(), "isLimited", false);
        setField(term98076, term98076.getClass(), "limitedContext", null);
        setField(term98051, term98051.getClass(), "acc", term98076);
        setBooleanField(term98051, term98051.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term98051, term98051.getClass(), "isPosted", false);
        setBooleanField(term98051, term98051.getClass(), "isSystemGenerated", false);
        setField(term98051, term98051.getClass(), "source", term98110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term98051;
        callMethod(klass, "mouseClicked", argTypes, term98050, args);
    }

};


