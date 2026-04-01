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
     Object term369921;

    public TreeTableModel_TreeTableAbstractAction_actionPerformed_17784020520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369921 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term369936 = (byte[]) newByteArray(9);
        Object term369948 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term369949 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term369950 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term369951 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term369952 = (Object[]) newArray("java.security.Principal", 5);
        Object term369955 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term369958 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term369961 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term369964 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term369969 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term369979 = newInstance(Class.forName("java.lang.Object"));
        setField(term369921, term369921.getClass(), "actionCommand", "MvRIxilFMJ");
        setLongField(term369921, term369921.getClass(), "when", -5963439350418910964L);
        setIntField(term369921, term369921.getClass(), "modifiers", 1013516042);
        setByteElement(term369936, 0, (byte) 106);
        setByteElement(term369936, 1, (byte) 98);
        setByteElement(term369936, 2, (byte) 67);
        setByteElement(term369936, 3, (byte) 66);
        setByteElement(term369936, 4, (byte) -121);
        setByteElement(term369936, 5, (byte) -119);
        setByteElement(term369936, 6, (byte) 71);
        setByteElement(term369936, 7, (byte) 80);
        setByteElement(term369936, 8, (byte) 42);
        setField(term369921, term369921.getClass(), "bdata", term369936);
        setIntField(term369921, term369921.getClass(), "id", 284652039);
        setBooleanField(term369921, term369921.getClass(), "consumed", false);
        setField(term369951, term369951.getClass(), "location", null);
        setField(term369951, term369951.getClass(), "signers", null);
        setField(term369951, term369951.getClass(), "certs", null);
        setField(term369951, term369951.getClass(), "sp", null);
        setField(term369951, term369951.getClass(), "factory", null);
        setField(term369951, term369951.getClass(), "locationNoFragString", null);
        setField(term369950, term369950.getClass(), "codesource", term369951);
        setField(term369950, term369950.getClass(), "classloader", null);
        setField(term369950, term369950.getClass(), "principals", term369952);
        setField(term369950, term369950.getClass(), "permissions", null);
        setBooleanField(term369950, term369950.getClass(), "hasAllPerm", false);
        setBooleanField(term369950, term369950.getClass(), "staticPermissions", false);
        setField(term369950, term369950.getClass(), "key", null);
        setElement(term369949, 0, term369950);
        setField(term369955, term369955.getClass(), "codesource", null);
        setField(term369955, term369955.getClass(), "classloader", null);
        setField(term369955, term369955.getClass(), "principals", null);
        setField(term369955, term369955.getClass(), "permissions", null);
        setBooleanField(term369955, term369955.getClass(), "hasAllPerm", false);
        setBooleanField(term369955, term369955.getClass(), "staticPermissions", false);
        setField(term369955, term369955.getClass(), "key", null);
        setElement(term369949, 1, term369955);
        setField(term369958, term369958.getClass(), "codesource", null);
        setField(term369958, term369958.getClass(), "classloader", null);
        setField(term369958, term369958.getClass(), "principals", null);
        setField(term369958, term369958.getClass(), "permissions", null);
        setBooleanField(term369958, term369958.getClass(), "hasAllPerm", false);
        setBooleanField(term369958, term369958.getClass(), "staticPermissions", false);
        setField(term369958, term369958.getClass(), "key", null);
        setElement(term369949, 2, term369958);
        setField(term369961, term369961.getClass(), "codesource", null);
        setField(term369961, term369961.getClass(), "classloader", null);
        setField(term369961, term369961.getClass(), "principals", null);
        setField(term369961, term369961.getClass(), "permissions", null);
        setBooleanField(term369961, term369961.getClass(), "hasAllPerm", false);
        setBooleanField(term369961, term369961.getClass(), "staticPermissions", false);
        setField(term369961, term369961.getClass(), "key", null);
        setElement(term369949, 3, term369961);
        setField(term369964, term369964.getClass(), "codesource", null);
        setField(term369964, term369964.getClass(), "classloader", null);
        setField(term369964, term369964.getClass(), "principals", null);
        setField(term369964, term369964.getClass(), "permissions", null);
        setBooleanField(term369964, term369964.getClass(), "hasAllPerm", false);
        setBooleanField(term369964, term369964.getClass(), "staticPermissions", false);
        setField(term369964, term369964.getClass(), "key", null);
        setElement(term369949, 4, term369964);
        setField(term369948, term369948.getClass(), "context", term369949);
        setBooleanField(term369948, term369948.getClass(), "isPrivileged", true);
        setBooleanField(term369948, term369948.getClass(), "isAuthorized", true);
        setField(term369969, term369969.getClass(), "context", null);
        setBooleanField(term369969, term369969.getClass(), "isPrivileged", false);
        setBooleanField(term369969, term369969.getClass(), "isAuthorized", false);
        setField(term369969, term369969.getClass(), "privilegedContext", null);
        setField(term369969, term369969.getClass(), "combiner", null);
        setField(term369969, term369969.getClass(), "permissions", null);
        setField(term369969, term369969.getClass(), "parent", null);
        setBooleanField(term369969, term369969.getClass(), "isWrapped", false);
        setBooleanField(term369969, term369969.getClass(), "isLimited", false);
        setField(term369969, term369969.getClass(), "limitedContext", null);
        setField(term369948, term369948.getClass(), "privilegedContext", term369969);
        setField(term369948, term369948.getClass(), "combiner", null);
        setField(term369948, term369948.getClass(), "permissions", null);
        setField(term369948, term369948.getClass(), "parent", null);
        setBooleanField(term369948, term369948.getClass(), "isWrapped", false);
        setBooleanField(term369948, term369948.getClass(), "isLimited", false);
        setField(term369948, term369948.getClass(), "limitedContext", null);
        setField(term369921, term369921.getClass(), "acc", term369948);
        setBooleanField(term369921, term369921.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term369921, term369921.getClass(), "isPosted", false);
        setBooleanField(term369921, term369921.getClass(), "isSystemGenerated", true);
        setField(term369921, term369921.getClass(), "source", term369979);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableAbstractAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term369921;
        callMethod(klass, "actionPerformed", argTypes, null, args);
    }

};


