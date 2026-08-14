package io.github.moacirrf.netbeans.markdown.ui.export;

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
import static io.github.moacirrf.netbeans.markdown.ui.export.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExportPane_2_actionPerformed_10960477142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44813;
     Object term44814;

    public ExportPane_2_actionPerformed_10960477142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44813 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane$2"));
        setField(term44813, term44813.getClass(), "this$0", null);
        term44814 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term44829 = (byte[]) newByteArray(1);
        Object term44833 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term44834 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term44835 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term44836 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term44837 = (Object[]) newArray("java.security.Principal", 7);
        Object term44840 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term44843 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term44846 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term44849 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term44852 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term44857 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term44867 = newInstance(Class.forName("java.lang.Object"));
        setField(term44814, term44814.getClass(), "actionCommand", "OJJtVNPyKZ");
        setLongField(term44814, term44814.getClass(), "when", -8400487765614892086L);
        setIntField(term44814, term44814.getClass(), "modifiers", -227365013);
        setByteElement(term44829, 0, (byte) -29);
        setField(term44814, term44814.getClass(), "bdata", term44829);
        setIntField(term44814, term44814.getClass(), "id", 11724947);
        setBooleanField(term44814, term44814.getClass(), "consumed", false);
        setField(term44836, term44836.getClass(), "location", null);
        setField(term44836, term44836.getClass(), "signers", null);
        setField(term44836, term44836.getClass(), "certs", null);
        setField(term44836, term44836.getClass(), "sp", null);
        setField(term44836, term44836.getClass(), "factory", null);
        setField(term44836, term44836.getClass(), "locationNoFragString", null);
        setField(term44835, term44835.getClass(), "codesource", term44836);
        setField(term44835, term44835.getClass(), "classloader", null);
        setField(term44835, term44835.getClass(), "principals", term44837);
        setField(term44835, term44835.getClass(), "permissions", null);
        setBooleanField(term44835, term44835.getClass(), "hasAllPerm", false);
        setBooleanField(term44835, term44835.getClass(), "staticPermissions", false);
        setField(term44835, term44835.getClass(), "key", null);
        setElement(term44834, 0, term44835);
        setField(term44840, term44840.getClass(), "codesource", null);
        setField(term44840, term44840.getClass(), "classloader", null);
        setField(term44840, term44840.getClass(), "principals", null);
        setField(term44840, term44840.getClass(), "permissions", null);
        setBooleanField(term44840, term44840.getClass(), "hasAllPerm", false);
        setBooleanField(term44840, term44840.getClass(), "staticPermissions", false);
        setField(term44840, term44840.getClass(), "key", null);
        setElement(term44834, 1, term44840);
        setField(term44843, term44843.getClass(), "codesource", null);
        setField(term44843, term44843.getClass(), "classloader", null);
        setField(term44843, term44843.getClass(), "principals", null);
        setField(term44843, term44843.getClass(), "permissions", null);
        setBooleanField(term44843, term44843.getClass(), "hasAllPerm", false);
        setBooleanField(term44843, term44843.getClass(), "staticPermissions", false);
        setField(term44843, term44843.getClass(), "key", null);
        setElement(term44834, 2, term44843);
        setField(term44846, term44846.getClass(), "codesource", null);
        setField(term44846, term44846.getClass(), "classloader", null);
        setField(term44846, term44846.getClass(), "principals", null);
        setField(term44846, term44846.getClass(), "permissions", null);
        setBooleanField(term44846, term44846.getClass(), "hasAllPerm", false);
        setBooleanField(term44846, term44846.getClass(), "staticPermissions", false);
        setField(term44846, term44846.getClass(), "key", null);
        setElement(term44834, 3, term44846);
        setField(term44849, term44849.getClass(), "codesource", null);
        setField(term44849, term44849.getClass(), "classloader", null);
        setField(term44849, term44849.getClass(), "principals", null);
        setField(term44849, term44849.getClass(), "permissions", null);
        setBooleanField(term44849, term44849.getClass(), "hasAllPerm", false);
        setBooleanField(term44849, term44849.getClass(), "staticPermissions", false);
        setField(term44849, term44849.getClass(), "key", null);
        setElement(term44834, 4, term44849);
        setField(term44852, term44852.getClass(), "codesource", null);
        setField(term44852, term44852.getClass(), "classloader", null);
        setField(term44852, term44852.getClass(), "principals", null);
        setField(term44852, term44852.getClass(), "permissions", null);
        setBooleanField(term44852, term44852.getClass(), "hasAllPerm", false);
        setBooleanField(term44852, term44852.getClass(), "staticPermissions", false);
        setField(term44852, term44852.getClass(), "key", null);
        setElement(term44834, 5, term44852);
        setField(term44833, term44833.getClass(), "context", term44834);
        setBooleanField(term44833, term44833.getClass(), "isPrivileged", false);
        setBooleanField(term44833, term44833.getClass(), "isAuthorized", false);
        setField(term44857, term44857.getClass(), "context", null);
        setBooleanField(term44857, term44857.getClass(), "isPrivileged", false);
        setBooleanField(term44857, term44857.getClass(), "isAuthorized", false);
        setField(term44857, term44857.getClass(), "privilegedContext", null);
        setField(term44857, term44857.getClass(), "combiner", null);
        setField(term44857, term44857.getClass(), "permissions", null);
        setField(term44857, term44857.getClass(), "parent", null);
        setBooleanField(term44857, term44857.getClass(), "isWrapped", false);
        setBooleanField(term44857, term44857.getClass(), "isLimited", false);
        setField(term44857, term44857.getClass(), "limitedContext", null);
        setField(term44833, term44833.getClass(), "privilegedContext", term44857);
        setField(term44833, term44833.getClass(), "combiner", null);
        setField(term44833, term44833.getClass(), "permissions", null);
        setField(term44833, term44833.getClass(), "parent", null);
        setBooleanField(term44833, term44833.getClass(), "isWrapped", false);
        setBooleanField(term44833, term44833.getClass(), "isLimited", false);
        setField(term44833, term44833.getClass(), "limitedContext", null);
        setField(term44814, term44814.getClass(), "acc", term44833);
        setBooleanField(term44814, term44814.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term44814, term44814.getClass(), "isPosted", false);
        setBooleanField(term44814, term44814.getClass(), "isSystemGenerated", false);
        setField(term44814, term44814.getClass(), "source", term44867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term44814;
        callMethod(klass, "actionPerformed", argTypes, term44813, args);
    }

};


