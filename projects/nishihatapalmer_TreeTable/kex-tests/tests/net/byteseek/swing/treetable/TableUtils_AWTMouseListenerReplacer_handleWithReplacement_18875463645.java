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

public class TableUtils_AWTMouseListenerReplacer_handleWithReplacement_18875463645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83748;
     Object term83750;

    public TableUtils_AWTMouseListenerReplacer_handleWithReplacement_18875463645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83748 = newInstance(Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer"));
        setField(term83748, term83748.getClass(), "component", null);
        setIntField(term83748, term83748.getClass(), "eventReplacementId", 5603560);
        setField(term83748, term83748.getClass(), "replacementListener", null);
        setField(term83748, term83748.getClass(), "removeListener", null);
        term83750 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term83763 = (byte[]) newByteArray(3);
        Object term83769 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term83770 = (Object[]) newArray("java.security.ProtectionDomain", 3);
        Object term83771 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83772 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term83773 = (Object[]) newArray("java.security.Principal", 5);
        Object term83776 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83779 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83784 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term83794 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term83750, term83750.getClass(), "x", -1973791064);
        setIntField(term83750, term83750.getClass(), "y", -2072158633);
        setIntField(term83750, term83750.getClass(), "xAbs", -355469363);
        setIntField(term83750, term83750.getClass(), "yAbs", 1465188553);
        setIntField(term83750, term83750.getClass(), "clickCount", 1633913667);
        setBooleanField(term83750, term83750.getClass(), "causedByTouchEvent", false);
        setIntField(term83750, term83750.getClass(), "button", 1292332296);
        setBooleanField(term83750, term83750.getClass(), "popupTrigger", true);
        setBooleanField(term83750, term83750.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term83750, term83750.getClass(), "when", 6811161968424632369L);
        setIntField(term83750, term83750.getClass(), "modifiers", -1415256843);
        setBooleanField(term83750, term83750.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term83763, 0, (byte) 78);
        setByteElement(term83763, 1, (byte) 87);
        setByteElement(term83763, 2, (byte) 121);
        setField(term83750, term83750.getClass(), "bdata", term83763);
        setIntField(term83750, term83750.getClass(), "id", 612177768);
        setBooleanField(term83750, term83750.getClass(), "consumed", true);
        setField(term83772, term83772.getClass(), "location", null);
        setField(term83772, term83772.getClass(), "signers", null);
        setField(term83772, term83772.getClass(), "certs", null);
        setField(term83772, term83772.getClass(), "sp", null);
        setField(term83772, term83772.getClass(), "factory", null);
        setField(term83772, term83772.getClass(), "locationNoFragString", null);
        setField(term83771, term83771.getClass(), "codesource", term83772);
        setField(term83771, term83771.getClass(), "classloader", null);
        setField(term83771, term83771.getClass(), "principals", term83773);
        setField(term83771, term83771.getClass(), "permissions", null);
        setBooleanField(term83771, term83771.getClass(), "hasAllPerm", false);
        setBooleanField(term83771, term83771.getClass(), "staticPermissions", false);
        setField(term83771, term83771.getClass(), "key", null);
        setElement(term83770, 0, term83771);
        setField(term83776, term83776.getClass(), "codesource", null);
        setField(term83776, term83776.getClass(), "classloader", null);
        setField(term83776, term83776.getClass(), "principals", null);
        setField(term83776, term83776.getClass(), "permissions", null);
        setBooleanField(term83776, term83776.getClass(), "hasAllPerm", false);
        setBooleanField(term83776, term83776.getClass(), "staticPermissions", false);
        setField(term83776, term83776.getClass(), "key", null);
        setElement(term83770, 1, term83776);
        setField(term83779, term83779.getClass(), "codesource", null);
        setField(term83779, term83779.getClass(), "classloader", null);
        setField(term83779, term83779.getClass(), "principals", null);
        setField(term83779, term83779.getClass(), "permissions", null);
        setBooleanField(term83779, term83779.getClass(), "hasAllPerm", false);
        setBooleanField(term83779, term83779.getClass(), "staticPermissions", false);
        setField(term83779, term83779.getClass(), "key", null);
        setElement(term83770, 2, term83779);
        setField(term83769, term83769.getClass(), "context", term83770);
        setBooleanField(term83769, term83769.getClass(), "isPrivileged", false);
        setBooleanField(term83769, term83769.getClass(), "isAuthorized", true);
        setField(term83784, term83784.getClass(), "context", null);
        setBooleanField(term83784, term83784.getClass(), "isPrivileged", false);
        setBooleanField(term83784, term83784.getClass(), "isAuthorized", false);
        setField(term83784, term83784.getClass(), "privilegedContext", null);
        setField(term83784, term83784.getClass(), "combiner", null);
        setField(term83784, term83784.getClass(), "permissions", null);
        setField(term83784, term83784.getClass(), "parent", null);
        setBooleanField(term83784, term83784.getClass(), "isWrapped", false);
        setBooleanField(term83784, term83784.getClass(), "isLimited", false);
        setField(term83784, term83784.getClass(), "limitedContext", null);
        setField(term83769, term83769.getClass(), "privilegedContext", term83784);
        setField(term83769, term83769.getClass(), "combiner", null);
        setField(term83769, term83769.getClass(), "permissions", null);
        setField(term83769, term83769.getClass(), "parent", null);
        setBooleanField(term83769, term83769.getClass(), "isWrapped", false);
        setBooleanField(term83769, term83769.getClass(), "isLimited", false);
        setField(term83769, term83769.getClass(), "limitedContext", null);
        setField(term83750, term83750.getClass(), "acc", term83769);
        setBooleanField(term83750, term83750.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term83750, term83750.getClass(), "isPosted", true);
        setBooleanField(term83750, term83750.getClass(), "isSystemGenerated", true);
        setField(term83750, term83750.getClass(), "source", term83794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term83750;
        callMethod(klass, "handleWithReplacement", argTypes, term83748, args);
    }

};


