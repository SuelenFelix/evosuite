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
     Object term4538;
     Object term4539;

    public TableUtils_HeaderSortResizeMouseClickListener_mouseClicked_18038508111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4538 = newInstance(Class.forName("net.byteseek.swing.treetable.TableUtils$HeaderSortResizeMouseClickListener"));
        term4539 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term4552 = (byte[]) newByteArray(0);
        Object term4555 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term4556 = (Object[]) newArray("java.security.ProtectionDomain", 7);
        Object term4557 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4558 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term4559 = (Object[]) newArray("java.security.Principal", 6);
        Object term4562 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4565 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4568 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4571 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4574 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4577 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4582 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term4592 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term4539, term4539.getClass(), "x", 1551099402);
        setIntField(term4539, term4539.getClass(), "y", -2027534003);
        setIntField(term4539, term4539.getClass(), "xAbs", 1063420942);
        setIntField(term4539, term4539.getClass(), "yAbs", 1375330971);
        setIntField(term4539, term4539.getClass(), "clickCount", -478195677);
        setBooleanField(term4539, term4539.getClass(), "causedByTouchEvent", false);
        setIntField(term4539, term4539.getClass(), "button", 972867650);
        setBooleanField(term4539, term4539.getClass(), "popupTrigger", false);
        setBooleanField(term4539, term4539.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term4539, term4539.getClass(), "when", -8257434502486459194L);
        setIntField(term4539, term4539.getClass(), "modifiers", 1655935355);
        setBooleanField(term4539, term4539.getClass(), "canAccessSystemClipboard", false);
        setField(term4539, term4539.getClass(), "bdata", term4552);
        setIntField(term4539, term4539.getClass(), "id", -481533957);
        setBooleanField(term4539, term4539.getClass(), "consumed", false);
        setField(term4558, term4558.getClass(), "location", null);
        setField(term4558, term4558.getClass(), "signers", null);
        setField(term4558, term4558.getClass(), "certs", null);
        setField(term4558, term4558.getClass(), "sp", null);
        setField(term4558, term4558.getClass(), "factory", null);
        setField(term4558, term4558.getClass(), "locationNoFragString", null);
        setField(term4557, term4557.getClass(), "codesource", term4558);
        setField(term4557, term4557.getClass(), "classloader", null);
        setField(term4557, term4557.getClass(), "principals", term4559);
        setField(term4557, term4557.getClass(), "permissions", null);
        setBooleanField(term4557, term4557.getClass(), "hasAllPerm", false);
        setBooleanField(term4557, term4557.getClass(), "staticPermissions", false);
        setField(term4557, term4557.getClass(), "key", null);
        setElement(term4556, 0, term4557);
        setField(term4562, term4562.getClass(), "codesource", null);
        setField(term4562, term4562.getClass(), "classloader", null);
        setField(term4562, term4562.getClass(), "principals", null);
        setField(term4562, term4562.getClass(), "permissions", null);
        setBooleanField(term4562, term4562.getClass(), "hasAllPerm", false);
        setBooleanField(term4562, term4562.getClass(), "staticPermissions", false);
        setField(term4562, term4562.getClass(), "key", null);
        setElement(term4556, 1, term4562);
        setField(term4565, term4565.getClass(), "codesource", null);
        setField(term4565, term4565.getClass(), "classloader", null);
        setField(term4565, term4565.getClass(), "principals", null);
        setField(term4565, term4565.getClass(), "permissions", null);
        setBooleanField(term4565, term4565.getClass(), "hasAllPerm", false);
        setBooleanField(term4565, term4565.getClass(), "staticPermissions", false);
        setField(term4565, term4565.getClass(), "key", null);
        setElement(term4556, 2, term4565);
        setField(term4568, term4568.getClass(), "codesource", null);
        setField(term4568, term4568.getClass(), "classloader", null);
        setField(term4568, term4568.getClass(), "principals", null);
        setField(term4568, term4568.getClass(), "permissions", null);
        setBooleanField(term4568, term4568.getClass(), "hasAllPerm", false);
        setBooleanField(term4568, term4568.getClass(), "staticPermissions", false);
        setField(term4568, term4568.getClass(), "key", null);
        setElement(term4556, 3, term4568);
        setField(term4571, term4571.getClass(), "codesource", null);
        setField(term4571, term4571.getClass(), "classloader", null);
        setField(term4571, term4571.getClass(), "principals", null);
        setField(term4571, term4571.getClass(), "permissions", null);
        setBooleanField(term4571, term4571.getClass(), "hasAllPerm", false);
        setBooleanField(term4571, term4571.getClass(), "staticPermissions", false);
        setField(term4571, term4571.getClass(), "key", null);
        setElement(term4556, 4, term4571);
        setField(term4574, term4574.getClass(), "codesource", null);
        setField(term4574, term4574.getClass(), "classloader", null);
        setField(term4574, term4574.getClass(), "principals", null);
        setField(term4574, term4574.getClass(), "permissions", null);
        setBooleanField(term4574, term4574.getClass(), "hasAllPerm", false);
        setBooleanField(term4574, term4574.getClass(), "staticPermissions", false);
        setField(term4574, term4574.getClass(), "key", null);
        setElement(term4556, 5, term4574);
        setField(term4577, term4577.getClass(), "codesource", null);
        setField(term4577, term4577.getClass(), "classloader", null);
        setField(term4577, term4577.getClass(), "principals", null);
        setField(term4577, term4577.getClass(), "permissions", null);
        setBooleanField(term4577, term4577.getClass(), "hasAllPerm", false);
        setBooleanField(term4577, term4577.getClass(), "staticPermissions", false);
        setField(term4577, term4577.getClass(), "key", null);
        setElement(term4556, 6, term4577);
        setField(term4555, term4555.getClass(), "context", term4556);
        setBooleanField(term4555, term4555.getClass(), "isPrivileged", false);
        setBooleanField(term4555, term4555.getClass(), "isAuthorized", false);
        setField(term4582, term4582.getClass(), "context", null);
        setBooleanField(term4582, term4582.getClass(), "isPrivileged", false);
        setBooleanField(term4582, term4582.getClass(), "isAuthorized", false);
        setField(term4582, term4582.getClass(), "privilegedContext", null);
        setField(term4582, term4582.getClass(), "combiner", null);
        setField(term4582, term4582.getClass(), "permissions", null);
        setField(term4582, term4582.getClass(), "parent", null);
        setBooleanField(term4582, term4582.getClass(), "isWrapped", false);
        setBooleanField(term4582, term4582.getClass(), "isLimited", false);
        setField(term4582, term4582.getClass(), "limitedContext", null);
        setField(term4555, term4555.getClass(), "privilegedContext", term4582);
        setField(term4555, term4555.getClass(), "combiner", null);
        setField(term4555, term4555.getClass(), "permissions", null);
        setField(term4555, term4555.getClass(), "parent", null);
        setBooleanField(term4555, term4555.getClass(), "isWrapped", false);
        setBooleanField(term4555, term4555.getClass(), "isLimited", false);
        setField(term4555, term4555.getClass(), "limitedContext", null);
        setField(term4539, term4539.getClass(), "acc", term4555);
        setBooleanField(term4539, term4539.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term4539, term4539.getClass(), "isPosted", false);
        setBooleanField(term4539, term4539.getClass(), "isSystemGenerated", true);
        setField(term4539, term4539.getClass(), "source", term4592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils$HeaderSortResizeMouseClickListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term4539;
        callMethod(klass, "mouseClicked", argTypes, term4538, args);
    }

};


