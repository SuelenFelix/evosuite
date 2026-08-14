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
     Object term83017;
     Object term83019;

    public TableUtils_AWTMouseListenerReplacer_handleWithReplacement_18875463645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83017 = newInstance(Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer"));
        setField(term83017, term83017.getClass(), "component", null);
        setIntField(term83017, term83017.getClass(), "eventReplacementId", -2110556060);
        setField(term83017, term83017.getClass(), "replacementListener", null);
        setField(term83017, term83017.getClass(), "removeListener", null);
        term83019 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term83032 = (byte[]) newByteArray(8);
        Object term83043 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term83044 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term83045 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83046 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term83047 = (Object[]) newArray("java.security.Principal", 7);
        Object term83050 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83053 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83056 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83059 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83064 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term83074 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term83019, term83019.getClass(), "x", 752615112);
        setIntField(term83019, term83019.getClass(), "y", -1674430871);
        setIntField(term83019, term83019.getClass(), "xAbs", 794352120);
        setIntField(term83019, term83019.getClass(), "yAbs", 340719678);
        setIntField(term83019, term83019.getClass(), "clickCount", 299791142);
        setBooleanField(term83019, term83019.getClass(), "causedByTouchEvent", false);
        setIntField(term83019, term83019.getClass(), "button", 1862191391);
        setBooleanField(term83019, term83019.getClass(), "popupTrigger", true);
        setBooleanField(term83019, term83019.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term83019, term83019.getClass(), "when", 6811161968424632369L);
        setIntField(term83019, term83019.getClass(), "modifiers", 1131398807);
        setBooleanField(term83019, term83019.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term83032, 0, (byte) 36);
        setByteElement(term83032, 1, (byte) 118);
        setByteElement(term83032, 2, (byte) 106);
        setByteElement(term83032, 3, (byte) 98);
        setByteElement(term83032, 4, (byte) 67);
        setByteElement(term83032, 5, (byte) 66);
        setByteElement(term83032, 6, (byte) -121);
        setByteElement(term83032, 7, (byte) -119);
        setField(term83019, term83019.getClass(), "bdata", term83032);
        setIntField(term83019, term83019.getClass(), "id", -344907703);
        setBooleanField(term83019, term83019.getClass(), "consumed", true);
        setField(term83046, term83046.getClass(), "location", null);
        setField(term83046, term83046.getClass(), "signers", null);
        setField(term83046, term83046.getClass(), "certs", null);
        setField(term83046, term83046.getClass(), "sp", null);
        setField(term83046, term83046.getClass(), "factory", null);
        setField(term83046, term83046.getClass(), "locationNoFragString", null);
        setField(term83045, term83045.getClass(), "codesource", term83046);
        setField(term83045, term83045.getClass(), "classloader", null);
        setField(term83045, term83045.getClass(), "principals", term83047);
        setField(term83045, term83045.getClass(), "permissions", null);
        setBooleanField(term83045, term83045.getClass(), "hasAllPerm", false);
        setBooleanField(term83045, term83045.getClass(), "staticPermissions", false);
        setField(term83045, term83045.getClass(), "key", null);
        setElement(term83044, 0, term83045);
        setField(term83050, term83050.getClass(), "codesource", null);
        setField(term83050, term83050.getClass(), "classloader", null);
        setField(term83050, term83050.getClass(), "principals", null);
        setField(term83050, term83050.getClass(), "permissions", null);
        setBooleanField(term83050, term83050.getClass(), "hasAllPerm", false);
        setBooleanField(term83050, term83050.getClass(), "staticPermissions", false);
        setField(term83050, term83050.getClass(), "key", null);
        setElement(term83044, 1, term83050);
        setField(term83053, term83053.getClass(), "codesource", null);
        setField(term83053, term83053.getClass(), "classloader", null);
        setField(term83053, term83053.getClass(), "principals", null);
        setField(term83053, term83053.getClass(), "permissions", null);
        setBooleanField(term83053, term83053.getClass(), "hasAllPerm", false);
        setBooleanField(term83053, term83053.getClass(), "staticPermissions", false);
        setField(term83053, term83053.getClass(), "key", null);
        setElement(term83044, 2, term83053);
        setField(term83056, term83056.getClass(), "codesource", null);
        setField(term83056, term83056.getClass(), "classloader", null);
        setField(term83056, term83056.getClass(), "principals", null);
        setField(term83056, term83056.getClass(), "permissions", null);
        setBooleanField(term83056, term83056.getClass(), "hasAllPerm", false);
        setBooleanField(term83056, term83056.getClass(), "staticPermissions", false);
        setField(term83056, term83056.getClass(), "key", null);
        setElement(term83044, 3, term83056);
        setField(term83059, term83059.getClass(), "codesource", null);
        setField(term83059, term83059.getClass(), "classloader", null);
        setField(term83059, term83059.getClass(), "principals", null);
        setField(term83059, term83059.getClass(), "permissions", null);
        setBooleanField(term83059, term83059.getClass(), "hasAllPerm", false);
        setBooleanField(term83059, term83059.getClass(), "staticPermissions", false);
        setField(term83059, term83059.getClass(), "key", null);
        setElement(term83044, 4, term83059);
        setField(term83043, term83043.getClass(), "context", term83044);
        setBooleanField(term83043, term83043.getClass(), "isPrivileged", false);
        setBooleanField(term83043, term83043.getClass(), "isAuthorized", true);
        setField(term83064, term83064.getClass(), "context", null);
        setBooleanField(term83064, term83064.getClass(), "isPrivileged", false);
        setBooleanField(term83064, term83064.getClass(), "isAuthorized", false);
        setField(term83064, term83064.getClass(), "privilegedContext", null);
        setField(term83064, term83064.getClass(), "combiner", null);
        setField(term83064, term83064.getClass(), "permissions", null);
        setField(term83064, term83064.getClass(), "parent", null);
        setBooleanField(term83064, term83064.getClass(), "isWrapped", false);
        setBooleanField(term83064, term83064.getClass(), "isLimited", false);
        setField(term83064, term83064.getClass(), "limitedContext", null);
        setField(term83043, term83043.getClass(), "privilegedContext", term83064);
        setField(term83043, term83043.getClass(), "combiner", null);
        setField(term83043, term83043.getClass(), "permissions", null);
        setField(term83043, term83043.getClass(), "parent", null);
        setBooleanField(term83043, term83043.getClass(), "isWrapped", false);
        setBooleanField(term83043, term83043.getClass(), "isLimited", false);
        setField(term83043, term83043.getClass(), "limitedContext", null);
        setField(term83019, term83019.getClass(), "acc", term83043);
        setBooleanField(term83019, term83019.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term83019, term83019.getClass(), "isPosted", true);
        setBooleanField(term83019, term83019.getClass(), "isSystemGenerated", true);
        setField(term83019, term83019.getClass(), "source", term83074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term83019;
        callMethod(klass, "handleWithReplacement", argTypes, term83017, args);
    }

};


