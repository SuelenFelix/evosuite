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
     Object term80800;
     Object term80808;

    public TreeTableModel_TreeTableNavigateParentAction_actionPerformed_6091553391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80800 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableNavigateParentAction"));
        Object term80802 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term80803 = newInstance(Class.forName("java.lang.Object"));
        Object term80804 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term80806 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term80807 = newInstance(Class.forName("java.lang.Object"));
        setField(term80800, term80800.getClass(), "this$0", null);
        setBooleanField(term80800, term80800.getClass(), "enabled", true);
        setField(term80802, term80802.getClass(), "table", term80803);
        setField(term80800, term80800.getClass(), "arrayTable", term80802);
        setBooleanField(term80804, term80804.getClass(), "notifyOnEDT", true);
        setField(term80806, term80806.getClass(), "map", null);
        setField(term80804, term80804.getClass(), "map", term80806);
        setField(term80804, term80804.getClass(), "source", term80807);
        setField(term80800, term80800.getClass(), "changeSupport", term80804);
        term80808 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term80823 = (byte[]) newByteArray(4);
        Object term80830 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term80831 = (Object[]) newArray("java.security.ProtectionDomain", 7);
        Object term80832 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term80833 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term80834 = (Object[]) newArray("java.security.Principal", 8);
        Object term80837 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term80840 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term80843 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term80846 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term80849 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term80852 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term80857 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term80867 = newInstance(Class.forName("java.lang.Object"));
        setField(term80808, term80808.getClass(), "actionCommand", "uWHnvSvaPl");
        setLongField(term80808, term80808.getClass(), "when", 5270370404989704783L);
        setIntField(term80808, term80808.getClass(), "modifiers", 633598642);
        setByteElement(term80823, 0, (byte) 87);
        setByteElement(term80823, 1, (byte) 121);
        setByteElement(term80823, 2, (byte) -99);
        setByteElement(term80823, 3, (byte) -2);
        setField(term80808, term80808.getClass(), "bdata", term80823);
        setIntField(term80808, term80808.getClass(), "id", 1862841859);
        setBooleanField(term80808, term80808.getClass(), "consumed", false);
        setField(term80833, term80833.getClass(), "location", null);
        setField(term80833, term80833.getClass(), "signers", null);
        setField(term80833, term80833.getClass(), "certs", null);
        setField(term80833, term80833.getClass(), "sp", null);
        setField(term80833, term80833.getClass(), "factory", null);
        setField(term80833, term80833.getClass(), "locationNoFragString", null);
        setField(term80832, term80832.getClass(), "codesource", term80833);
        setField(term80832, term80832.getClass(), "classloader", null);
        setField(term80832, term80832.getClass(), "principals", term80834);
        setField(term80832, term80832.getClass(), "permissions", null);
        setBooleanField(term80832, term80832.getClass(), "hasAllPerm", false);
        setBooleanField(term80832, term80832.getClass(), "staticPermissions", false);
        setField(term80832, term80832.getClass(), "key", null);
        setElement(term80831, 0, term80832);
        setField(term80837, term80837.getClass(), "codesource", null);
        setField(term80837, term80837.getClass(), "classloader", null);
        setField(term80837, term80837.getClass(), "principals", null);
        setField(term80837, term80837.getClass(), "permissions", null);
        setBooleanField(term80837, term80837.getClass(), "hasAllPerm", false);
        setBooleanField(term80837, term80837.getClass(), "staticPermissions", false);
        setField(term80837, term80837.getClass(), "key", null);
        setElement(term80831, 1, term80837);
        setField(term80840, term80840.getClass(), "codesource", null);
        setField(term80840, term80840.getClass(), "classloader", null);
        setField(term80840, term80840.getClass(), "principals", null);
        setField(term80840, term80840.getClass(), "permissions", null);
        setBooleanField(term80840, term80840.getClass(), "hasAllPerm", false);
        setBooleanField(term80840, term80840.getClass(), "staticPermissions", false);
        setField(term80840, term80840.getClass(), "key", null);
        setElement(term80831, 2, term80840);
        setField(term80843, term80843.getClass(), "codesource", null);
        setField(term80843, term80843.getClass(), "classloader", null);
        setField(term80843, term80843.getClass(), "principals", null);
        setField(term80843, term80843.getClass(), "permissions", null);
        setBooleanField(term80843, term80843.getClass(), "hasAllPerm", false);
        setBooleanField(term80843, term80843.getClass(), "staticPermissions", false);
        setField(term80843, term80843.getClass(), "key", null);
        setElement(term80831, 3, term80843);
        setField(term80846, term80846.getClass(), "codesource", null);
        setField(term80846, term80846.getClass(), "classloader", null);
        setField(term80846, term80846.getClass(), "principals", null);
        setField(term80846, term80846.getClass(), "permissions", null);
        setBooleanField(term80846, term80846.getClass(), "hasAllPerm", false);
        setBooleanField(term80846, term80846.getClass(), "staticPermissions", false);
        setField(term80846, term80846.getClass(), "key", null);
        setElement(term80831, 4, term80846);
        setField(term80849, term80849.getClass(), "codesource", null);
        setField(term80849, term80849.getClass(), "classloader", null);
        setField(term80849, term80849.getClass(), "principals", null);
        setField(term80849, term80849.getClass(), "permissions", null);
        setBooleanField(term80849, term80849.getClass(), "hasAllPerm", false);
        setBooleanField(term80849, term80849.getClass(), "staticPermissions", false);
        setField(term80849, term80849.getClass(), "key", null);
        setElement(term80831, 5, term80849);
        setField(term80852, term80852.getClass(), "codesource", null);
        setField(term80852, term80852.getClass(), "classloader", null);
        setField(term80852, term80852.getClass(), "principals", null);
        setField(term80852, term80852.getClass(), "permissions", null);
        setBooleanField(term80852, term80852.getClass(), "hasAllPerm", false);
        setBooleanField(term80852, term80852.getClass(), "staticPermissions", false);
        setField(term80852, term80852.getClass(), "key", null);
        setElement(term80831, 6, term80852);
        setField(term80830, term80830.getClass(), "context", term80831);
        setBooleanField(term80830, term80830.getClass(), "isPrivileged", false);
        setBooleanField(term80830, term80830.getClass(), "isAuthorized", true);
        setField(term80857, term80857.getClass(), "context", null);
        setBooleanField(term80857, term80857.getClass(), "isPrivileged", false);
        setBooleanField(term80857, term80857.getClass(), "isAuthorized", false);
        setField(term80857, term80857.getClass(), "privilegedContext", null);
        setField(term80857, term80857.getClass(), "combiner", null);
        setField(term80857, term80857.getClass(), "permissions", null);
        setField(term80857, term80857.getClass(), "parent", null);
        setBooleanField(term80857, term80857.getClass(), "isWrapped", false);
        setBooleanField(term80857, term80857.getClass(), "isLimited", false);
        setField(term80857, term80857.getClass(), "limitedContext", null);
        setField(term80830, term80830.getClass(), "privilegedContext", term80857);
        setField(term80830, term80830.getClass(), "combiner", null);
        setField(term80830, term80830.getClass(), "permissions", null);
        setField(term80830, term80830.getClass(), "parent", null);
        setBooleanField(term80830, term80830.getClass(), "isWrapped", false);
        setBooleanField(term80830, term80830.getClass(), "isLimited", false);
        setField(term80830, term80830.getClass(), "limitedContext", null);
        setField(term80808, term80808.getClass(), "acc", term80830);
        setBooleanField(term80808, term80808.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term80808, term80808.getClass(), "isPosted", false);
        setBooleanField(term80808, term80808.getClass(), "isSystemGenerated", true);
        setField(term80808, term80808.getClass(), "source", term80867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableNavigateParentAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term80808;
        callMethod(klass, "actionPerformed", argTypes, term80800, args);
    }

};


