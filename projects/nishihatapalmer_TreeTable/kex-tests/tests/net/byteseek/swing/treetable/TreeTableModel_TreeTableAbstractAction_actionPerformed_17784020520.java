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

public class TreeTableModel_TreeTableAbstractAction_actionPerformed_17784020520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369773;

    public TreeTableModel_TreeTableAbstractAction_actionPerformed_17784020520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369773 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term369788 = (byte[]) newByteArray(4);
        Object term369795 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term369796 = (Object[]) newArray("java.security.ProtectionDomain", 9);
        Object term369797 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term369798 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term369799 = (Object[]) newArray("java.security.Principal", 4);
        Object term369802 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term369805 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term369808 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term369811 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term369814 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term369817 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term369820 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term369823 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term369828 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term369838 = newInstance(Class.forName("java.lang.Object"));
        setField(term369773, term369773.getClass(), "actionCommand", "MvRIxilFMJ");
        setLongField(term369773, term369773.getClass(), "when", -5963439350418910964L);
        setIntField(term369773, term369773.getClass(), "modifiers", -1740998635);
        setByteElement(term369788, 0, (byte) -61);
        setByteElement(term369788, 1, (byte) -85);
        setByteElement(term369788, 2, (byte) -22);
        setByteElement(term369788, 3, (byte) 93);
        setField(term369773, term369773.getClass(), "bdata", term369788);
        setIntField(term369773, term369773.getClass(), "id", 183857482);
        setBooleanField(term369773, term369773.getClass(), "consumed", false);
        setField(term369798, term369798.getClass(), "location", null);
        setField(term369798, term369798.getClass(), "signers", null);
        setField(term369798, term369798.getClass(), "certs", null);
        setField(term369798, term369798.getClass(), "sp", null);
        setField(term369798, term369798.getClass(), "factory", null);
        setField(term369798, term369798.getClass(), "locationNoFragString", null);
        setField(term369797, term369797.getClass(), "codesource", term369798);
        setField(term369797, term369797.getClass(), "classloader", null);
        setField(term369797, term369797.getClass(), "principals", term369799);
        setField(term369797, term369797.getClass(), "permissions", null);
        setBooleanField(term369797, term369797.getClass(), "hasAllPerm", false);
        setBooleanField(term369797, term369797.getClass(), "staticPermissions", false);
        setField(term369797, term369797.getClass(), "key", null);
        setElement(term369796, 0, term369797);
        setField(term369802, term369802.getClass(), "codesource", null);
        setField(term369802, term369802.getClass(), "classloader", null);
        setField(term369802, term369802.getClass(), "principals", null);
        setField(term369802, term369802.getClass(), "permissions", null);
        setBooleanField(term369802, term369802.getClass(), "hasAllPerm", false);
        setBooleanField(term369802, term369802.getClass(), "staticPermissions", false);
        setField(term369802, term369802.getClass(), "key", null);
        setElement(term369796, 1, term369802);
        setField(term369805, term369805.getClass(), "codesource", null);
        setField(term369805, term369805.getClass(), "classloader", null);
        setField(term369805, term369805.getClass(), "principals", null);
        setField(term369805, term369805.getClass(), "permissions", null);
        setBooleanField(term369805, term369805.getClass(), "hasAllPerm", false);
        setBooleanField(term369805, term369805.getClass(), "staticPermissions", false);
        setField(term369805, term369805.getClass(), "key", null);
        setElement(term369796, 2, term369805);
        setField(term369808, term369808.getClass(), "codesource", null);
        setField(term369808, term369808.getClass(), "classloader", null);
        setField(term369808, term369808.getClass(), "principals", null);
        setField(term369808, term369808.getClass(), "permissions", null);
        setBooleanField(term369808, term369808.getClass(), "hasAllPerm", false);
        setBooleanField(term369808, term369808.getClass(), "staticPermissions", false);
        setField(term369808, term369808.getClass(), "key", null);
        setElement(term369796, 3, term369808);
        setField(term369811, term369811.getClass(), "codesource", null);
        setField(term369811, term369811.getClass(), "classloader", null);
        setField(term369811, term369811.getClass(), "principals", null);
        setField(term369811, term369811.getClass(), "permissions", null);
        setBooleanField(term369811, term369811.getClass(), "hasAllPerm", false);
        setBooleanField(term369811, term369811.getClass(), "staticPermissions", false);
        setField(term369811, term369811.getClass(), "key", null);
        setElement(term369796, 4, term369811);
        setField(term369814, term369814.getClass(), "codesource", null);
        setField(term369814, term369814.getClass(), "classloader", null);
        setField(term369814, term369814.getClass(), "principals", null);
        setField(term369814, term369814.getClass(), "permissions", null);
        setBooleanField(term369814, term369814.getClass(), "hasAllPerm", false);
        setBooleanField(term369814, term369814.getClass(), "staticPermissions", false);
        setField(term369814, term369814.getClass(), "key", null);
        setElement(term369796, 5, term369814);
        setField(term369817, term369817.getClass(), "codesource", null);
        setField(term369817, term369817.getClass(), "classloader", null);
        setField(term369817, term369817.getClass(), "principals", null);
        setField(term369817, term369817.getClass(), "permissions", null);
        setBooleanField(term369817, term369817.getClass(), "hasAllPerm", false);
        setBooleanField(term369817, term369817.getClass(), "staticPermissions", false);
        setField(term369817, term369817.getClass(), "key", null);
        setElement(term369796, 6, term369817);
        setField(term369820, term369820.getClass(), "codesource", null);
        setField(term369820, term369820.getClass(), "classloader", null);
        setField(term369820, term369820.getClass(), "principals", null);
        setField(term369820, term369820.getClass(), "permissions", null);
        setBooleanField(term369820, term369820.getClass(), "hasAllPerm", false);
        setBooleanField(term369820, term369820.getClass(), "staticPermissions", false);
        setField(term369820, term369820.getClass(), "key", null);
        setElement(term369796, 7, term369820);
        setField(term369823, term369823.getClass(), "codesource", null);
        setField(term369823, term369823.getClass(), "classloader", null);
        setField(term369823, term369823.getClass(), "principals", null);
        setField(term369823, term369823.getClass(), "permissions", null);
        setBooleanField(term369823, term369823.getClass(), "hasAllPerm", false);
        setBooleanField(term369823, term369823.getClass(), "staticPermissions", false);
        setField(term369823, term369823.getClass(), "key", null);
        setElement(term369796, 8, term369823);
        setField(term369795, term369795.getClass(), "context", term369796);
        setBooleanField(term369795, term369795.getClass(), "isPrivileged", false);
        setBooleanField(term369795, term369795.getClass(), "isAuthorized", true);
        setField(term369828, term369828.getClass(), "context", null);
        setBooleanField(term369828, term369828.getClass(), "isPrivileged", false);
        setBooleanField(term369828, term369828.getClass(), "isAuthorized", false);
        setField(term369828, term369828.getClass(), "privilegedContext", null);
        setField(term369828, term369828.getClass(), "combiner", null);
        setField(term369828, term369828.getClass(), "permissions", null);
        setField(term369828, term369828.getClass(), "parent", null);
        setBooleanField(term369828, term369828.getClass(), "isWrapped", false);
        setBooleanField(term369828, term369828.getClass(), "isLimited", false);
        setField(term369828, term369828.getClass(), "limitedContext", null);
        setField(term369795, term369795.getClass(), "privilegedContext", term369828);
        setField(term369795, term369795.getClass(), "combiner", null);
        setField(term369795, term369795.getClass(), "permissions", null);
        setField(term369795, term369795.getClass(), "parent", null);
        setBooleanField(term369795, term369795.getClass(), "isWrapped", false);
        setBooleanField(term369795, term369795.getClass(), "isLimited", false);
        setField(term369795, term369795.getClass(), "limitedContext", null);
        setField(term369773, term369773.getClass(), "acc", term369795);
        setBooleanField(term369773, term369773.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term369773, term369773.getClass(), "isPosted", false);
        setBooleanField(term369773, term369773.getClass(), "isSystemGenerated", true);
        setField(term369773, term369773.getClass(), "source", term369838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableAbstractAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term369773;
        callMethod(klass, "actionPerformed", argTypes, null, args);
    }

};


