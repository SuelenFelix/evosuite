package io.github.moacirrf.netbeans.markdown.ui;

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
import static io.github.moacirrf.netbeans.markdown.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TopBar_3_actionPerformed_4584328242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65515;
     Object term65516;

    public TopBar_3_actionPerformed_4584328242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65515 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar$3"));
        setField(term65515, term65515.getClass(), "this$0", null);
        term65516 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term65531 = (byte[]) newByteArray(2);
        Object term65536 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term65537 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term65538 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65539 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term65540 = (Object[]) newArray("java.security.Principal", 3);
        Object term65543 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65546 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65549 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65552 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term65557 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term65567 = newInstance(Class.forName("java.lang.Object"));
        setField(term65516, term65516.getClass(), "actionCommand", "zUlRdimJtU");
        setLongField(term65516, term65516.getClass(), "when", -7237588299778557629L);
        setIntField(term65516, term65516.getClass(), "modifiers", -1656687479);
        setByteElement(term65531, 0, (byte) -61);
        setByteElement(term65531, 1, (byte) -85);
        setField(term65516, term65516.getClass(), "bdata", term65531);
        setIntField(term65516, term65516.getClass(), "id", -249614216);
        setBooleanField(term65516, term65516.getClass(), "consumed", true);
        setField(term65539, term65539.getClass(), "location", null);
        setField(term65539, term65539.getClass(), "signers", null);
        setField(term65539, term65539.getClass(), "certs", null);
        setField(term65539, term65539.getClass(), "sp", null);
        setField(term65539, term65539.getClass(), "factory", null);
        setField(term65539, term65539.getClass(), "locationNoFragString", null);
        setField(term65538, term65538.getClass(), "codesource", term65539);
        setField(term65538, term65538.getClass(), "classloader", null);
        setField(term65538, term65538.getClass(), "principals", term65540);
        setField(term65538, term65538.getClass(), "permissions", null);
        setBooleanField(term65538, term65538.getClass(), "hasAllPerm", false);
        setBooleanField(term65538, term65538.getClass(), "staticPermissions", false);
        setField(term65538, term65538.getClass(), "key", null);
        setElement(term65537, 0, term65538);
        setField(term65543, term65543.getClass(), "codesource", null);
        setField(term65543, term65543.getClass(), "classloader", null);
        setField(term65543, term65543.getClass(), "principals", null);
        setField(term65543, term65543.getClass(), "permissions", null);
        setBooleanField(term65543, term65543.getClass(), "hasAllPerm", false);
        setBooleanField(term65543, term65543.getClass(), "staticPermissions", false);
        setField(term65543, term65543.getClass(), "key", null);
        setElement(term65537, 1, term65543);
        setField(term65546, term65546.getClass(), "codesource", null);
        setField(term65546, term65546.getClass(), "classloader", null);
        setField(term65546, term65546.getClass(), "principals", null);
        setField(term65546, term65546.getClass(), "permissions", null);
        setBooleanField(term65546, term65546.getClass(), "hasAllPerm", false);
        setBooleanField(term65546, term65546.getClass(), "staticPermissions", false);
        setField(term65546, term65546.getClass(), "key", null);
        setElement(term65537, 2, term65546);
        setField(term65549, term65549.getClass(), "codesource", null);
        setField(term65549, term65549.getClass(), "classloader", null);
        setField(term65549, term65549.getClass(), "principals", null);
        setField(term65549, term65549.getClass(), "permissions", null);
        setBooleanField(term65549, term65549.getClass(), "hasAllPerm", false);
        setBooleanField(term65549, term65549.getClass(), "staticPermissions", false);
        setField(term65549, term65549.getClass(), "key", null);
        setElement(term65537, 3, term65549);
        setField(term65552, term65552.getClass(), "codesource", null);
        setField(term65552, term65552.getClass(), "classloader", null);
        setField(term65552, term65552.getClass(), "principals", null);
        setField(term65552, term65552.getClass(), "permissions", null);
        setBooleanField(term65552, term65552.getClass(), "hasAllPerm", false);
        setBooleanField(term65552, term65552.getClass(), "staticPermissions", false);
        setField(term65552, term65552.getClass(), "key", null);
        setElement(term65537, 4, term65552);
        setField(term65536, term65536.getClass(), "context", term65537);
        setBooleanField(term65536, term65536.getClass(), "isPrivileged", true);
        setBooleanField(term65536, term65536.getClass(), "isAuthorized", true);
        setField(term65557, term65557.getClass(), "context", null);
        setBooleanField(term65557, term65557.getClass(), "isPrivileged", false);
        setBooleanField(term65557, term65557.getClass(), "isAuthorized", false);
        setField(term65557, term65557.getClass(), "privilegedContext", null);
        setField(term65557, term65557.getClass(), "combiner", null);
        setField(term65557, term65557.getClass(), "permissions", null);
        setField(term65557, term65557.getClass(), "parent", null);
        setBooleanField(term65557, term65557.getClass(), "isWrapped", false);
        setBooleanField(term65557, term65557.getClass(), "isLimited", false);
        setField(term65557, term65557.getClass(), "limitedContext", null);
        setField(term65536, term65536.getClass(), "privilegedContext", term65557);
        setField(term65536, term65536.getClass(), "combiner", null);
        setField(term65536, term65536.getClass(), "permissions", null);
        setField(term65536, term65536.getClass(), "parent", null);
        setBooleanField(term65536, term65536.getClass(), "isWrapped", false);
        setBooleanField(term65536, term65536.getClass(), "isLimited", false);
        setField(term65536, term65536.getClass(), "limitedContext", null);
        setField(term65516, term65516.getClass(), "acc", term65536);
        setBooleanField(term65516, term65516.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term65516, term65516.getClass(), "isPosted", false);
        setBooleanField(term65516, term65516.getClass(), "isSystemGenerated", false);
        setField(term65516, term65516.getClass(), "source", term65567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term65516;
        callMethod(klass, "actionPerformed", argTypes, term65515, args);
    }

};


