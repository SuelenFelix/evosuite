package net.byteseek.swing.treetable;

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
import static net.byteseek.swing.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TreeTableModel_1_mouseClicked_12569644121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public TreeTableModel_1_mouseClicked_12569644121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableModel$1"));
        setField(term1, term1.getClass(), "this$0", null);
        term2 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term15 = (byte[]) newByteArray(5);
        Object term23 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term24 = (Object[]) newArray("java.security.ProtectionDomain", 4);
        Object term25 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term26 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term27 = (Object[]) newArray("java.security.Principal", 1);
        Object term30 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term33 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term36 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term41 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term51 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term2, term2.getClass(), "x", 1162663216);
        setIntField(term2, term2.getClass(), "y", 1484323161);
        setIntField(term2, term2.getClass(), "xAbs", 391863371);
        setIntField(term2, term2.getClass(), "yAbs", -1922583790);
        setIntField(term2, term2.getClass(), "clickCount", -616727354);
        setBooleanField(term2, term2.getClass(), "causedByTouchEvent", false);
        setIntField(term2, term2.getClass(), "button", -1955890973);
        setBooleanField(term2, term2.getClass(), "popupTrigger", false);
        setBooleanField(term2, term2.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term2, term2.getClass(), "when", 2442117782898005296L);
        setIntField(term2, term2.getClass(), "modifiers", -2038273078);
        setBooleanField(term2, term2.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term15, 0, (byte) 47);
        setByteElement(term15, 1, (byte) 48);
        setByteElement(term15, 2, (byte) 89);
        setByteElement(term15, 3, (byte) 75);
        setByteElement(term15, 4, (byte) 18);
        setField(term2, term2.getClass(), "bdata", term15);
        setIntField(term2, term2.getClass(), "id", 1227103734);
        setBooleanField(term2, term2.getClass(), "consumed", true);
        setField(term26, term26.getClass(), "location", null);
        setField(term26, term26.getClass(), "signers", null);
        setField(term26, term26.getClass(), "certs", null);
        setField(term26, term26.getClass(), "sp", null);
        setField(term26, term26.getClass(), "factory", null);
        setField(term26, term26.getClass(), "locationNoFragString", null);
        setField(term25, term25.getClass(), "codesource", term26);
        setField(term25, term25.getClass(), "classloader", null);
        setField(term25, term25.getClass(), "principals", term27);
        setField(term25, term25.getClass(), "permissions", null);
        setBooleanField(term25, term25.getClass(), "hasAllPerm", false);
        setBooleanField(term25, term25.getClass(), "staticPermissions", false);
        setField(term25, term25.getClass(), "key", null);
        setElement(term24, 0, term25);
        setField(term30, term30.getClass(), "codesource", null);
        setField(term30, term30.getClass(), "classloader", null);
        setField(term30, term30.getClass(), "principals", null);
        setField(term30, term30.getClass(), "permissions", null);
        setBooleanField(term30, term30.getClass(), "hasAllPerm", false);
        setBooleanField(term30, term30.getClass(), "staticPermissions", false);
        setField(term30, term30.getClass(), "key", null);
        setElement(term24, 1, term30);
        setField(term33, term33.getClass(), "codesource", null);
        setField(term33, term33.getClass(), "classloader", null);
        setField(term33, term33.getClass(), "principals", null);
        setField(term33, term33.getClass(), "permissions", null);
        setBooleanField(term33, term33.getClass(), "hasAllPerm", false);
        setBooleanField(term33, term33.getClass(), "staticPermissions", false);
        setField(term33, term33.getClass(), "key", null);
        setElement(term24, 2, term33);
        setField(term36, term36.getClass(), "codesource", null);
        setField(term36, term36.getClass(), "classloader", null);
        setField(term36, term36.getClass(), "principals", null);
        setField(term36, term36.getClass(), "permissions", null);
        setBooleanField(term36, term36.getClass(), "hasAllPerm", false);
        setBooleanField(term36, term36.getClass(), "staticPermissions", false);
        setField(term36, term36.getClass(), "key", null);
        setElement(term24, 3, term36);
        setField(term23, term23.getClass(), "context", term24);
        setBooleanField(term23, term23.getClass(), "isPrivileged", true);
        setBooleanField(term23, term23.getClass(), "isAuthorized", true);
        setField(term41, term41.getClass(), "context", null);
        setBooleanField(term41, term41.getClass(), "isPrivileged", false);
        setBooleanField(term41, term41.getClass(), "isAuthorized", false);
        setField(term41, term41.getClass(), "privilegedContext", null);
        setField(term41, term41.getClass(), "combiner", null);
        setField(term41, term41.getClass(), "permissions", null);
        setField(term41, term41.getClass(), "parent", null);
        setBooleanField(term41, term41.getClass(), "isWrapped", false);
        setBooleanField(term41, term41.getClass(), "isLimited", false);
        setField(term41, term41.getClass(), "limitedContext", null);
        setField(term23, term23.getClass(), "privilegedContext", term41);
        setField(term23, term23.getClass(), "combiner", null);
        setField(term23, term23.getClass(), "permissions", null);
        setField(term23, term23.getClass(), "parent", null);
        setBooleanField(term23, term23.getClass(), "isWrapped", false);
        setBooleanField(term23, term23.getClass(), "isLimited", false);
        setField(term23, term23.getClass(), "limitedContext", null);
        setField(term2, term2.getClass(), "acc", term23);
        setBooleanField(term2, term2.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term2, term2.getClass(), "isPosted", true);
        setBooleanField(term2, term2.getClass(), "isSystemGenerated", false);
        setField(term2, term2.getClass(), "source", term51);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "mouseClicked", argTypes, term1, args);
    }

};


