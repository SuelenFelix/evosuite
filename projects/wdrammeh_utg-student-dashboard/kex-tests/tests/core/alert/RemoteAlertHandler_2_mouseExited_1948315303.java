package core.alert;

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
import static core.alert.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RemoteAlertHandler_2_mouseExited_1948315303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1131;
     Object term1132;

    public RemoteAlertHandler_2_mouseExited_1948315303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1131 = newInstance(Class.forName("core.alert.RemoteAlertHandler$2"));
        term1132 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term1145 = (byte[]) newByteArray(5);
        Object term1153 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1154 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term1155 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1156 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1157 = (Object[]) newArray("java.security.Principal", 0);
        Object term1160 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1165 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1175 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term1132, term1132.getClass(), "x", 458147407);
        setIntField(term1132, term1132.getClass(), "y", -184153539);
        setIntField(term1132, term1132.getClass(), "xAbs", 493620644);
        setIntField(term1132, term1132.getClass(), "yAbs", 1328271830);
        setIntField(term1132, term1132.getClass(), "clickCount", 1596070772);
        setBooleanField(term1132, term1132.getClass(), "causedByTouchEvent", true);
        setIntField(term1132, term1132.getClass(), "button", 97029295);
        setBooleanField(term1132, term1132.getClass(), "popupTrigger", true);
        setBooleanField(term1132, term1132.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term1132, term1132.getClass(), "when", -8257434502486459194L);
        setIntField(term1132, term1132.getClass(), "modifiers", -1371869594);
        setBooleanField(term1132, term1132.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term1145, 0, (byte) 79);
        setByteElement(term1145, 1, (byte) -119);
        setByteElement(term1145, 2, (byte) -66);
        setByteElement(term1145, 3, (byte) 83);
        setByteElement(term1145, 4, (byte) 74);
        setField(term1132, term1132.getClass(), "bdata", term1145);
        setIntField(term1132, term1132.getClass(), "id", -2095575670);
        setBooleanField(term1132, term1132.getClass(), "consumed", true);
        setField(term1156, term1156.getClass(), "location", null);
        setField(term1156, term1156.getClass(), "signers", null);
        setField(term1156, term1156.getClass(), "certs", null);
        setField(term1156, term1156.getClass(), "sp", null);
        setField(term1156, term1156.getClass(), "factory", null);
        setField(term1156, term1156.getClass(), "locationNoFragString", null);
        setField(term1155, term1155.getClass(), "codesource", term1156);
        setField(term1155, term1155.getClass(), "classloader", null);
        setField(term1155, term1155.getClass(), "principals", term1157);
        setField(term1155, term1155.getClass(), "permissions", null);
        setBooleanField(term1155, term1155.getClass(), "hasAllPerm", false);
        setBooleanField(term1155, term1155.getClass(), "staticPermissions", false);
        setField(term1155, term1155.getClass(), "key", null);
        setElement(term1154, 0, term1155);
        setField(term1160, term1160.getClass(), "codesource", null);
        setField(term1160, term1160.getClass(), "classloader", null);
        setField(term1160, term1160.getClass(), "principals", null);
        setField(term1160, term1160.getClass(), "permissions", null);
        setBooleanField(term1160, term1160.getClass(), "hasAllPerm", false);
        setBooleanField(term1160, term1160.getClass(), "staticPermissions", false);
        setField(term1160, term1160.getClass(), "key", null);
        setElement(term1154, 1, term1160);
        setField(term1153, term1153.getClass(), "context", term1154);
        setBooleanField(term1153, term1153.getClass(), "isPrivileged", false);
        setBooleanField(term1153, term1153.getClass(), "isAuthorized", true);
        setField(term1165, term1165.getClass(), "context", null);
        setBooleanField(term1165, term1165.getClass(), "isPrivileged", false);
        setBooleanField(term1165, term1165.getClass(), "isAuthorized", false);
        setField(term1165, term1165.getClass(), "privilegedContext", null);
        setField(term1165, term1165.getClass(), "combiner", null);
        setField(term1165, term1165.getClass(), "permissions", null);
        setField(term1165, term1165.getClass(), "parent", null);
        setBooleanField(term1165, term1165.getClass(), "isWrapped", false);
        setBooleanField(term1165, term1165.getClass(), "isLimited", false);
        setField(term1165, term1165.getClass(), "limitedContext", null);
        setField(term1153, term1153.getClass(), "privilegedContext", term1165);
        setField(term1153, term1153.getClass(), "combiner", null);
        setField(term1153, term1153.getClass(), "permissions", null);
        setField(term1153, term1153.getClass(), "parent", null);
        setBooleanField(term1153, term1153.getClass(), "isWrapped", false);
        setBooleanField(term1153, term1153.getClass(), "isLimited", false);
        setField(term1153, term1153.getClass(), "limitedContext", null);
        setField(term1132, term1132.getClass(), "acc", term1153);
        setBooleanField(term1132, term1132.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term1132, term1132.getClass(), "isPosted", true);
        setBooleanField(term1132, term1132.getClass(), "isSystemGenerated", false);
        setField(term1132, term1132.getClass(), "source", term1175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.alert.RemoteAlertHandler$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term1132;
        callMethod(klass, "mouseExited", argTypes, term1131, args);
    }

};


