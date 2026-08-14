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

public class TableUtils_HeaderSortResizeMouseClickListener_mouseClicked_18038508111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4534;
     Object term4535;

    public TableUtils_HeaderSortResizeMouseClickListener_mouseClicked_18038508111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4534 = newInstance(Class.forName("net.byteseek.swing.treetable.TableUtils$HeaderSortResizeMouseClickListener"));
        term4535 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term4548 = (byte[]) newByteArray(0);
        Object term4551 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term4552 = (Object[]) newArray("java.security.ProtectionDomain", 7);
        Object term4553 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4554 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term4555 = (Object[]) newArray("java.security.Principal", 6);
        Object term4558 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4561 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4564 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4567 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4570 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4573 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4578 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term4588 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term4535, term4535.getClass(), "x", 1551099402);
        setIntField(term4535, term4535.getClass(), "y", -2027534003);
        setIntField(term4535, term4535.getClass(), "xAbs", 1063420942);
        setIntField(term4535, term4535.getClass(), "yAbs", 1375330971);
        setIntField(term4535, term4535.getClass(), "clickCount", -478195677);
        setBooleanField(term4535, term4535.getClass(), "causedByTouchEvent", false);
        setIntField(term4535, term4535.getClass(), "button", 972867650);
        setBooleanField(term4535, term4535.getClass(), "popupTrigger", false);
        setBooleanField(term4535, term4535.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term4535, term4535.getClass(), "when", -8257434502486459194L);
        setIntField(term4535, term4535.getClass(), "modifiers", 1655935355);
        setBooleanField(term4535, term4535.getClass(), "canAccessSystemClipboard", false);
        setField(term4535, term4535.getClass(), "bdata", term4548);
        setIntField(term4535, term4535.getClass(), "id", -481533957);
        setBooleanField(term4535, term4535.getClass(), "consumed", false);
        setField(term4554, term4554.getClass(), "location", null);
        setField(term4554, term4554.getClass(), "signers", null);
        setField(term4554, term4554.getClass(), "certs", null);
        setField(term4554, term4554.getClass(), "sp", null);
        setField(term4554, term4554.getClass(), "factory", null);
        setField(term4554, term4554.getClass(), "locationNoFragString", null);
        setField(term4553, term4553.getClass(), "codesource", term4554);
        setField(term4553, term4553.getClass(), "classloader", null);
        setField(term4553, term4553.getClass(), "principals", term4555);
        setField(term4553, term4553.getClass(), "permissions", null);
        setBooleanField(term4553, term4553.getClass(), "hasAllPerm", false);
        setBooleanField(term4553, term4553.getClass(), "staticPermissions", false);
        setField(term4553, term4553.getClass(), "key", null);
        setElement(term4552, 0, term4553);
        setField(term4558, term4558.getClass(), "codesource", null);
        setField(term4558, term4558.getClass(), "classloader", null);
        setField(term4558, term4558.getClass(), "principals", null);
        setField(term4558, term4558.getClass(), "permissions", null);
        setBooleanField(term4558, term4558.getClass(), "hasAllPerm", false);
        setBooleanField(term4558, term4558.getClass(), "staticPermissions", false);
        setField(term4558, term4558.getClass(), "key", null);
        setElement(term4552, 1, term4558);
        setField(term4561, term4561.getClass(), "codesource", null);
        setField(term4561, term4561.getClass(), "classloader", null);
        setField(term4561, term4561.getClass(), "principals", null);
        setField(term4561, term4561.getClass(), "permissions", null);
        setBooleanField(term4561, term4561.getClass(), "hasAllPerm", false);
        setBooleanField(term4561, term4561.getClass(), "staticPermissions", false);
        setField(term4561, term4561.getClass(), "key", null);
        setElement(term4552, 2, term4561);
        setField(term4564, term4564.getClass(), "codesource", null);
        setField(term4564, term4564.getClass(), "classloader", null);
        setField(term4564, term4564.getClass(), "principals", null);
        setField(term4564, term4564.getClass(), "permissions", null);
        setBooleanField(term4564, term4564.getClass(), "hasAllPerm", false);
        setBooleanField(term4564, term4564.getClass(), "staticPermissions", false);
        setField(term4564, term4564.getClass(), "key", null);
        setElement(term4552, 3, term4564);
        setField(term4567, term4567.getClass(), "codesource", null);
        setField(term4567, term4567.getClass(), "classloader", null);
        setField(term4567, term4567.getClass(), "principals", null);
        setField(term4567, term4567.getClass(), "permissions", null);
        setBooleanField(term4567, term4567.getClass(), "hasAllPerm", false);
        setBooleanField(term4567, term4567.getClass(), "staticPermissions", false);
        setField(term4567, term4567.getClass(), "key", null);
        setElement(term4552, 4, term4567);
        setField(term4570, term4570.getClass(), "codesource", null);
        setField(term4570, term4570.getClass(), "classloader", null);
        setField(term4570, term4570.getClass(), "principals", null);
        setField(term4570, term4570.getClass(), "permissions", null);
        setBooleanField(term4570, term4570.getClass(), "hasAllPerm", false);
        setBooleanField(term4570, term4570.getClass(), "staticPermissions", false);
        setField(term4570, term4570.getClass(), "key", null);
        setElement(term4552, 5, term4570);
        setField(term4573, term4573.getClass(), "codesource", null);
        setField(term4573, term4573.getClass(), "classloader", null);
        setField(term4573, term4573.getClass(), "principals", null);
        setField(term4573, term4573.getClass(), "permissions", null);
        setBooleanField(term4573, term4573.getClass(), "hasAllPerm", false);
        setBooleanField(term4573, term4573.getClass(), "staticPermissions", false);
        setField(term4573, term4573.getClass(), "key", null);
        setElement(term4552, 6, term4573);
        setField(term4551, term4551.getClass(), "context", term4552);
        setBooleanField(term4551, term4551.getClass(), "isPrivileged", false);
        setBooleanField(term4551, term4551.getClass(), "isAuthorized", false);
        setField(term4578, term4578.getClass(), "context", null);
        setBooleanField(term4578, term4578.getClass(), "isPrivileged", false);
        setBooleanField(term4578, term4578.getClass(), "isAuthorized", false);
        setField(term4578, term4578.getClass(), "privilegedContext", null);
        setField(term4578, term4578.getClass(), "combiner", null);
        setField(term4578, term4578.getClass(), "permissions", null);
        setField(term4578, term4578.getClass(), "parent", null);
        setBooleanField(term4578, term4578.getClass(), "isWrapped", false);
        setBooleanField(term4578, term4578.getClass(), "isLimited", false);
        setField(term4578, term4578.getClass(), "limitedContext", null);
        setField(term4551, term4551.getClass(), "privilegedContext", term4578);
        setField(term4551, term4551.getClass(), "combiner", null);
        setField(term4551, term4551.getClass(), "permissions", null);
        setField(term4551, term4551.getClass(), "parent", null);
        setBooleanField(term4551, term4551.getClass(), "isWrapped", false);
        setBooleanField(term4551, term4551.getClass(), "isLimited", false);
        setField(term4551, term4551.getClass(), "limitedContext", null);
        setField(term4535, term4535.getClass(), "acc", term4551);
        setBooleanField(term4535, term4535.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term4535, term4535.getClass(), "isPosted", false);
        setBooleanField(term4535, term4535.getClass(), "isSystemGenerated", true);
        setField(term4535, term4535.getClass(), "source", term4588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils$HeaderSortResizeMouseClickListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term4535;
        callMethod(klass, "mouseClicked", argTypes, term4534, args);
    }

};


