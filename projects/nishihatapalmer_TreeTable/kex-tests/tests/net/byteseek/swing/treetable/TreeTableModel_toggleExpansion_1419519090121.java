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
     Object term98402;

    public TreeTableModel_toggleExpansion_1419519090121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98402 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term98415 = (byte[]) newByteArray(7);
        Object term98425 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term98426 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term98427 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98428 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term98429 = (Object[]) newArray("java.security.Principal", 2);
        Object term98432 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98435 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98438 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98441 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98444 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98447 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98450 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98455 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term98465 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term98402, term98402.getClass(), "x", 783730213);
        setIntField(term98402, term98402.getClass(), "y", 1815951606);
        setIntField(term98402, term98402.getClass(), "xAbs", 1105016932);
        setIntField(term98402, term98402.getClass(), "yAbs", -365784998);
        setIntField(term98402, term98402.getClass(), "clickCount", -1893236300);
        setBooleanField(term98402, term98402.getClass(), "causedByTouchEvent", true);
        setIntField(term98402, term98402.getClass(), "button", -1858909368);
        setBooleanField(term98402, term98402.getClass(), "popupTrigger", true);
        setBooleanField(term98402, term98402.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term98402, term98402.getClass(), "when", -7237588299778557629L);
        setIntField(term98402, term98402.getClass(), "modifiers", -280113263);
        setBooleanField(term98402, term98402.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term98415, 0, (byte) 71);
        setByteElement(term98415, 1, (byte) 80);
        setByteElement(term98415, 2, (byte) 42);
        setByteElement(term98415, 3, (byte) 72);
        setByteElement(term98415, 4, (byte) 111);
        setByteElement(term98415, 5, (byte) 99);
        setByteElement(term98415, 6, (byte) -12);
        setField(term98402, term98402.getClass(), "bdata", term98415);
        setIntField(term98402, term98402.getClass(), "id", 529625347);
        setBooleanField(term98402, term98402.getClass(), "consumed", true);
        setField(term98428, term98428.getClass(), "location", null);
        setField(term98428, term98428.getClass(), "signers", null);
        setField(term98428, term98428.getClass(), "certs", null);
        setField(term98428, term98428.getClass(), "sp", null);
        setField(term98428, term98428.getClass(), "factory", null);
        setField(term98428, term98428.getClass(), "locationNoFragString", null);
        setField(term98427, term98427.getClass(), "codesource", term98428);
        setField(term98427, term98427.getClass(), "classloader", null);
        setField(term98427, term98427.getClass(), "principals", term98429);
        setField(term98427, term98427.getClass(), "permissions", null);
        setBooleanField(term98427, term98427.getClass(), "hasAllPerm", false);
        setBooleanField(term98427, term98427.getClass(), "staticPermissions", false);
        setField(term98427, term98427.getClass(), "key", null);
        setElement(term98426, 0, term98427);
        setField(term98432, term98432.getClass(), "codesource", null);
        setField(term98432, term98432.getClass(), "classloader", null);
        setField(term98432, term98432.getClass(), "principals", null);
        setField(term98432, term98432.getClass(), "permissions", null);
        setBooleanField(term98432, term98432.getClass(), "hasAllPerm", false);
        setBooleanField(term98432, term98432.getClass(), "staticPermissions", false);
        setField(term98432, term98432.getClass(), "key", null);
        setElement(term98426, 1, term98432);
        setField(term98435, term98435.getClass(), "codesource", null);
        setField(term98435, term98435.getClass(), "classloader", null);
        setField(term98435, term98435.getClass(), "principals", null);
        setField(term98435, term98435.getClass(), "permissions", null);
        setBooleanField(term98435, term98435.getClass(), "hasAllPerm", false);
        setBooleanField(term98435, term98435.getClass(), "staticPermissions", false);
        setField(term98435, term98435.getClass(), "key", null);
        setElement(term98426, 2, term98435);
        setField(term98438, term98438.getClass(), "codesource", null);
        setField(term98438, term98438.getClass(), "classloader", null);
        setField(term98438, term98438.getClass(), "principals", null);
        setField(term98438, term98438.getClass(), "permissions", null);
        setBooleanField(term98438, term98438.getClass(), "hasAllPerm", false);
        setBooleanField(term98438, term98438.getClass(), "staticPermissions", false);
        setField(term98438, term98438.getClass(), "key", null);
        setElement(term98426, 3, term98438);
        setField(term98441, term98441.getClass(), "codesource", null);
        setField(term98441, term98441.getClass(), "classloader", null);
        setField(term98441, term98441.getClass(), "principals", null);
        setField(term98441, term98441.getClass(), "permissions", null);
        setBooleanField(term98441, term98441.getClass(), "hasAllPerm", false);
        setBooleanField(term98441, term98441.getClass(), "staticPermissions", false);
        setField(term98441, term98441.getClass(), "key", null);
        setElement(term98426, 4, term98441);
        setField(term98444, term98444.getClass(), "codesource", null);
        setField(term98444, term98444.getClass(), "classloader", null);
        setField(term98444, term98444.getClass(), "principals", null);
        setField(term98444, term98444.getClass(), "permissions", null);
        setBooleanField(term98444, term98444.getClass(), "hasAllPerm", false);
        setBooleanField(term98444, term98444.getClass(), "staticPermissions", false);
        setField(term98444, term98444.getClass(), "key", null);
        setElement(term98426, 5, term98444);
        setField(term98447, term98447.getClass(), "codesource", null);
        setField(term98447, term98447.getClass(), "classloader", null);
        setField(term98447, term98447.getClass(), "principals", null);
        setField(term98447, term98447.getClass(), "permissions", null);
        setBooleanField(term98447, term98447.getClass(), "hasAllPerm", false);
        setBooleanField(term98447, term98447.getClass(), "staticPermissions", false);
        setField(term98447, term98447.getClass(), "key", null);
        setElement(term98426, 6, term98447);
        setField(term98450, term98450.getClass(), "codesource", null);
        setField(term98450, term98450.getClass(), "classloader", null);
        setField(term98450, term98450.getClass(), "principals", null);
        setField(term98450, term98450.getClass(), "permissions", null);
        setBooleanField(term98450, term98450.getClass(), "hasAllPerm", false);
        setBooleanField(term98450, term98450.getClass(), "staticPermissions", false);
        setField(term98450, term98450.getClass(), "key", null);
        setElement(term98426, 7, term98450);
        setField(term98425, term98425.getClass(), "context", term98426);
        setBooleanField(term98425, term98425.getClass(), "isPrivileged", true);
        setBooleanField(term98425, term98425.getClass(), "isAuthorized", false);
        setField(term98455, term98455.getClass(), "context", null);
        setBooleanField(term98455, term98455.getClass(), "isPrivileged", false);
        setBooleanField(term98455, term98455.getClass(), "isAuthorized", false);
        setField(term98455, term98455.getClass(), "privilegedContext", null);
        setField(term98455, term98455.getClass(), "combiner", null);
        setField(term98455, term98455.getClass(), "permissions", null);
        setField(term98455, term98455.getClass(), "parent", null);
        setBooleanField(term98455, term98455.getClass(), "isWrapped", false);
        setBooleanField(term98455, term98455.getClass(), "isLimited", false);
        setField(term98455, term98455.getClass(), "limitedContext", null);
        setField(term98425, term98425.getClass(), "privilegedContext", term98455);
        setField(term98425, term98425.getClass(), "combiner", null);
        setField(term98425, term98425.getClass(), "permissions", null);
        setField(term98425, term98425.getClass(), "parent", null);
        setBooleanField(term98425, term98425.getClass(), "isWrapped", false);
        setBooleanField(term98425, term98425.getClass(), "isLimited", false);
        setField(term98425, term98425.getClass(), "limitedContext", null);
        setField(term98402, term98402.getClass(), "acc", term98425);
        setBooleanField(term98402, term98402.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term98402, term98402.getClass(), "isPosted", true);
        setBooleanField(term98402, term98402.getClass(), "isSystemGenerated", true);
        setField(term98402, term98402.getClass(), "source", term98465);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term98402;
        callMethod(klass, "toggleExpansion", argTypes, null, args);
    }

};


