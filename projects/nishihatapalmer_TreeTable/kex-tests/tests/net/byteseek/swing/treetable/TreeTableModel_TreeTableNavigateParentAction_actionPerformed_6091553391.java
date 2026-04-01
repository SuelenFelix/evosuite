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

public class TreeTableModel_TreeTableNavigateParentAction_actionPerformed_6091553391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81474;
     Object term81482;

    public TreeTableModel_TreeTableNavigateParentAction_actionPerformed_6091553391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81474 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableNavigateParentAction"));
        Object term81476 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term81477 = newInstance(Class.forName("java.lang.Object"));
        Object term81478 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term81480 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term81481 = newInstance(Class.forName("java.lang.Object"));
        setField(term81474, term81474.getClass(), "this$0", null);
        setBooleanField(term81474, term81474.getClass(), "enabled", true);
        setField(term81476, term81476.getClass(), "table", term81477);
        setField(term81474, term81474.getClass(), "arrayTable", term81476);
        setBooleanField(term81478, term81478.getClass(), "notifyOnEDT", true);
        setField(term81480, term81480.getClass(), "map", null);
        setField(term81478, term81478.getClass(), "map", term81480);
        setField(term81478, term81478.getClass(), "source", term81481);
        setField(term81474, term81474.getClass(), "changeSupport", term81478);
        term81482 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term81497 = (byte[]) newByteArray(0);
        Object term81500 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term81501 = (Object[]) newArray("java.security.ProtectionDomain", 9);
        Object term81502 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term81503 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term81504 = (Object[]) newArray("java.security.Principal", 7);
        Object term81507 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term81510 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term81513 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term81516 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term81519 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term81522 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term81525 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term81528 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term81533 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term81543 = newInstance(Class.forName("java.lang.Object"));
        setField(term81482, term81482.getClass(), "actionCommand", "uWHnvSvaPl");
        setLongField(term81482, term81482.getClass(), "when", 5270370404989704783L);
        setIntField(term81482, term81482.getClass(), "modifiers", -27944011);
        setField(term81482, term81482.getClass(), "bdata", term81497);
        setIntField(term81482, term81482.getClass(), "id", -20614472);
        setBooleanField(term81482, term81482.getClass(), "consumed", false);
        setField(term81503, term81503.getClass(), "location", null);
        setField(term81503, term81503.getClass(), "signers", null);
        setField(term81503, term81503.getClass(), "certs", null);
        setField(term81503, term81503.getClass(), "sp", null);
        setField(term81503, term81503.getClass(), "factory", null);
        setField(term81503, term81503.getClass(), "locationNoFragString", null);
        setField(term81502, term81502.getClass(), "codesource", term81503);
        setField(term81502, term81502.getClass(), "classloader", null);
        setField(term81502, term81502.getClass(), "principals", term81504);
        setField(term81502, term81502.getClass(), "permissions", null);
        setBooleanField(term81502, term81502.getClass(), "hasAllPerm", false);
        setBooleanField(term81502, term81502.getClass(), "staticPermissions", false);
        setField(term81502, term81502.getClass(), "key", null);
        setElement(term81501, 0, term81502);
        setField(term81507, term81507.getClass(), "codesource", null);
        setField(term81507, term81507.getClass(), "classloader", null);
        setField(term81507, term81507.getClass(), "principals", null);
        setField(term81507, term81507.getClass(), "permissions", null);
        setBooleanField(term81507, term81507.getClass(), "hasAllPerm", false);
        setBooleanField(term81507, term81507.getClass(), "staticPermissions", false);
        setField(term81507, term81507.getClass(), "key", null);
        setElement(term81501, 1, term81507);
        setField(term81510, term81510.getClass(), "codesource", null);
        setField(term81510, term81510.getClass(), "classloader", null);
        setField(term81510, term81510.getClass(), "principals", null);
        setField(term81510, term81510.getClass(), "permissions", null);
        setBooleanField(term81510, term81510.getClass(), "hasAllPerm", false);
        setBooleanField(term81510, term81510.getClass(), "staticPermissions", false);
        setField(term81510, term81510.getClass(), "key", null);
        setElement(term81501, 2, term81510);
        setField(term81513, term81513.getClass(), "codesource", null);
        setField(term81513, term81513.getClass(), "classloader", null);
        setField(term81513, term81513.getClass(), "principals", null);
        setField(term81513, term81513.getClass(), "permissions", null);
        setBooleanField(term81513, term81513.getClass(), "hasAllPerm", false);
        setBooleanField(term81513, term81513.getClass(), "staticPermissions", false);
        setField(term81513, term81513.getClass(), "key", null);
        setElement(term81501, 3, term81513);
        setField(term81516, term81516.getClass(), "codesource", null);
        setField(term81516, term81516.getClass(), "classloader", null);
        setField(term81516, term81516.getClass(), "principals", null);
        setField(term81516, term81516.getClass(), "permissions", null);
        setBooleanField(term81516, term81516.getClass(), "hasAllPerm", false);
        setBooleanField(term81516, term81516.getClass(), "staticPermissions", false);
        setField(term81516, term81516.getClass(), "key", null);
        setElement(term81501, 4, term81516);
        setField(term81519, term81519.getClass(), "codesource", null);
        setField(term81519, term81519.getClass(), "classloader", null);
        setField(term81519, term81519.getClass(), "principals", null);
        setField(term81519, term81519.getClass(), "permissions", null);
        setBooleanField(term81519, term81519.getClass(), "hasAllPerm", false);
        setBooleanField(term81519, term81519.getClass(), "staticPermissions", false);
        setField(term81519, term81519.getClass(), "key", null);
        setElement(term81501, 5, term81519);
        setField(term81522, term81522.getClass(), "codesource", null);
        setField(term81522, term81522.getClass(), "classloader", null);
        setField(term81522, term81522.getClass(), "principals", null);
        setField(term81522, term81522.getClass(), "permissions", null);
        setBooleanField(term81522, term81522.getClass(), "hasAllPerm", false);
        setBooleanField(term81522, term81522.getClass(), "staticPermissions", false);
        setField(term81522, term81522.getClass(), "key", null);
        setElement(term81501, 6, term81522);
        setField(term81525, term81525.getClass(), "codesource", null);
        setField(term81525, term81525.getClass(), "classloader", null);
        setField(term81525, term81525.getClass(), "principals", null);
        setField(term81525, term81525.getClass(), "permissions", null);
        setBooleanField(term81525, term81525.getClass(), "hasAllPerm", false);
        setBooleanField(term81525, term81525.getClass(), "staticPermissions", false);
        setField(term81525, term81525.getClass(), "key", null);
        setElement(term81501, 7, term81525);
        setField(term81528, term81528.getClass(), "codesource", null);
        setField(term81528, term81528.getClass(), "classloader", null);
        setField(term81528, term81528.getClass(), "principals", null);
        setField(term81528, term81528.getClass(), "permissions", null);
        setBooleanField(term81528, term81528.getClass(), "hasAllPerm", false);
        setBooleanField(term81528, term81528.getClass(), "staticPermissions", false);
        setField(term81528, term81528.getClass(), "key", null);
        setElement(term81501, 8, term81528);
        setField(term81500, term81500.getClass(), "context", term81501);
        setBooleanField(term81500, term81500.getClass(), "isPrivileged", false);
        setBooleanField(term81500, term81500.getClass(), "isAuthorized", true);
        setField(term81533, term81533.getClass(), "context", null);
        setBooleanField(term81533, term81533.getClass(), "isPrivileged", false);
        setBooleanField(term81533, term81533.getClass(), "isAuthorized", false);
        setField(term81533, term81533.getClass(), "privilegedContext", null);
        setField(term81533, term81533.getClass(), "combiner", null);
        setField(term81533, term81533.getClass(), "permissions", null);
        setField(term81533, term81533.getClass(), "parent", null);
        setBooleanField(term81533, term81533.getClass(), "isWrapped", false);
        setBooleanField(term81533, term81533.getClass(), "isLimited", false);
        setField(term81533, term81533.getClass(), "limitedContext", null);
        setField(term81500, term81500.getClass(), "privilegedContext", term81533);
        setField(term81500, term81500.getClass(), "combiner", null);
        setField(term81500, term81500.getClass(), "permissions", null);
        setField(term81500, term81500.getClass(), "parent", null);
        setBooleanField(term81500, term81500.getClass(), "isWrapped", false);
        setBooleanField(term81500, term81500.getClass(), "isLimited", false);
        setField(term81500, term81500.getClass(), "limitedContext", null);
        setField(term81482, term81482.getClass(), "acc", term81500);
        setBooleanField(term81482, term81482.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term81482, term81482.getClass(), "isPosted", false);
        setBooleanField(term81482, term81482.getClass(), "isSystemGenerated", true);
        setField(term81482, term81482.getClass(), "source", term81543);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableNavigateParentAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term81482;
        callMethod(klass, "actionPerformed", argTypes, term81474, args);
    }

};


