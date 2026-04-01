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

public class TreeTableModel_toggleExpansion_1419519090121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99324;

    public TreeTableModel_toggleExpansion_1419519090121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99324 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term99337 = (byte[]) newByteArray(5);
        Object term99345 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term99346 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term99347 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term99348 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term99349 = (Object[]) newArray("java.security.Principal", 2);
        Object term99352 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term99355 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term99358 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term99361 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term99364 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term99367 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term99370 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term99375 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term99385 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term99324, term99324.getClass(), "x", -751079123);
        setIntField(term99324, term99324.getClass(), "y", -110837188);
        setIntField(term99324, term99324.getClass(), "xAbs", -271094506);
        setIntField(term99324, term99324.getClass(), "yAbs", 455632030);
        setIntField(term99324, term99324.getClass(), "clickCount", -1632929393);
        setBooleanField(term99324, term99324.getClass(), "causedByTouchEvent", true);
        setIntField(term99324, term99324.getClass(), "button", -431440129);
        setBooleanField(term99324, term99324.getClass(), "popupTrigger", true);
        setBooleanField(term99324, term99324.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term99324, term99324.getClass(), "when", -7237588299778557629L);
        setIntField(term99324, term99324.getClass(), "modifiers", -763576148);
        setBooleanField(term99324, term99324.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term99337, 0, (byte) -99);
        setByteElement(term99337, 1, (byte) -2);
        setByteElement(term99337, 2, (byte) -16);
        setByteElement(term99337, 3, (byte) -112);
        setByteElement(term99337, 4, (byte) -111);
        setField(term99324, term99324.getClass(), "bdata", term99337);
        setIntField(term99324, term99324.getClass(), "id", 1568948514);
        setBooleanField(term99324, term99324.getClass(), "consumed", true);
        setField(term99348, term99348.getClass(), "location", null);
        setField(term99348, term99348.getClass(), "signers", null);
        setField(term99348, term99348.getClass(), "certs", null);
        setField(term99348, term99348.getClass(), "sp", null);
        setField(term99348, term99348.getClass(), "factory", null);
        setField(term99348, term99348.getClass(), "locationNoFragString", null);
        setField(term99347, term99347.getClass(), "codesource", term99348);
        setField(term99347, term99347.getClass(), "classloader", null);
        setField(term99347, term99347.getClass(), "principals", term99349);
        setField(term99347, term99347.getClass(), "permissions", null);
        setBooleanField(term99347, term99347.getClass(), "hasAllPerm", false);
        setBooleanField(term99347, term99347.getClass(), "staticPermissions", false);
        setField(term99347, term99347.getClass(), "key", null);
        setElement(term99346, 0, term99347);
        setField(term99352, term99352.getClass(), "codesource", null);
        setField(term99352, term99352.getClass(), "classloader", null);
        setField(term99352, term99352.getClass(), "principals", null);
        setField(term99352, term99352.getClass(), "permissions", null);
        setBooleanField(term99352, term99352.getClass(), "hasAllPerm", false);
        setBooleanField(term99352, term99352.getClass(), "staticPermissions", false);
        setField(term99352, term99352.getClass(), "key", null);
        setElement(term99346, 1, term99352);
        setField(term99355, term99355.getClass(), "codesource", null);
        setField(term99355, term99355.getClass(), "classloader", null);
        setField(term99355, term99355.getClass(), "principals", null);
        setField(term99355, term99355.getClass(), "permissions", null);
        setBooleanField(term99355, term99355.getClass(), "hasAllPerm", false);
        setBooleanField(term99355, term99355.getClass(), "staticPermissions", false);
        setField(term99355, term99355.getClass(), "key", null);
        setElement(term99346, 2, term99355);
        setField(term99358, term99358.getClass(), "codesource", null);
        setField(term99358, term99358.getClass(), "classloader", null);
        setField(term99358, term99358.getClass(), "principals", null);
        setField(term99358, term99358.getClass(), "permissions", null);
        setBooleanField(term99358, term99358.getClass(), "hasAllPerm", false);
        setBooleanField(term99358, term99358.getClass(), "staticPermissions", false);
        setField(term99358, term99358.getClass(), "key", null);
        setElement(term99346, 3, term99358);
        setField(term99361, term99361.getClass(), "codesource", null);
        setField(term99361, term99361.getClass(), "classloader", null);
        setField(term99361, term99361.getClass(), "principals", null);
        setField(term99361, term99361.getClass(), "permissions", null);
        setBooleanField(term99361, term99361.getClass(), "hasAllPerm", false);
        setBooleanField(term99361, term99361.getClass(), "staticPermissions", false);
        setField(term99361, term99361.getClass(), "key", null);
        setElement(term99346, 4, term99361);
        setField(term99364, term99364.getClass(), "codesource", null);
        setField(term99364, term99364.getClass(), "classloader", null);
        setField(term99364, term99364.getClass(), "principals", null);
        setField(term99364, term99364.getClass(), "permissions", null);
        setBooleanField(term99364, term99364.getClass(), "hasAllPerm", false);
        setBooleanField(term99364, term99364.getClass(), "staticPermissions", false);
        setField(term99364, term99364.getClass(), "key", null);
        setElement(term99346, 5, term99364);
        setField(term99367, term99367.getClass(), "codesource", null);
        setField(term99367, term99367.getClass(), "classloader", null);
        setField(term99367, term99367.getClass(), "principals", null);
        setField(term99367, term99367.getClass(), "permissions", null);
        setBooleanField(term99367, term99367.getClass(), "hasAllPerm", false);
        setBooleanField(term99367, term99367.getClass(), "staticPermissions", false);
        setField(term99367, term99367.getClass(), "key", null);
        setElement(term99346, 6, term99367);
        setField(term99370, term99370.getClass(), "codesource", null);
        setField(term99370, term99370.getClass(), "classloader", null);
        setField(term99370, term99370.getClass(), "principals", null);
        setField(term99370, term99370.getClass(), "permissions", null);
        setBooleanField(term99370, term99370.getClass(), "hasAllPerm", false);
        setBooleanField(term99370, term99370.getClass(), "staticPermissions", false);
        setField(term99370, term99370.getClass(), "key", null);
        setElement(term99346, 7, term99370);
        setField(term99345, term99345.getClass(), "context", term99346);
        setBooleanField(term99345, term99345.getClass(), "isPrivileged", true);
        setBooleanField(term99345, term99345.getClass(), "isAuthorized", false);
        setField(term99375, term99375.getClass(), "context", null);
        setBooleanField(term99375, term99375.getClass(), "isPrivileged", false);
        setBooleanField(term99375, term99375.getClass(), "isAuthorized", false);
        setField(term99375, term99375.getClass(), "privilegedContext", null);
        setField(term99375, term99375.getClass(), "combiner", null);
        setField(term99375, term99375.getClass(), "permissions", null);
        setField(term99375, term99375.getClass(), "parent", null);
        setBooleanField(term99375, term99375.getClass(), "isWrapped", false);
        setBooleanField(term99375, term99375.getClass(), "isLimited", false);
        setField(term99375, term99375.getClass(), "limitedContext", null);
        setField(term99345, term99345.getClass(), "privilegedContext", term99375);
        setField(term99345, term99345.getClass(), "combiner", null);
        setField(term99345, term99345.getClass(), "permissions", null);
        setField(term99345, term99345.getClass(), "parent", null);
        setBooleanField(term99345, term99345.getClass(), "isWrapped", false);
        setBooleanField(term99345, term99345.getClass(), "isLimited", false);
        setField(term99345, term99345.getClass(), "limitedContext", null);
        setField(term99324, term99324.getClass(), "acc", term99345);
        setBooleanField(term99324, term99324.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term99324, term99324.getClass(), "isPosted", true);
        setBooleanField(term99324, term99324.getClass(), "isSystemGenerated", true);
        setField(term99324, term99324.getClass(), "source", term99385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term99324;
        callMethod(klass, "toggleExpansion", argTypes, null, args);
    }

};


