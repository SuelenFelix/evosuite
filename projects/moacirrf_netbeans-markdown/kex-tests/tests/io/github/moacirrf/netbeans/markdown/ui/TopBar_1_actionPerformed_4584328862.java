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

public class TopBar_1_actionPerformed_4584328862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69487;
     Object term69488;

    public TopBar_1_actionPerformed_4584328862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69487 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar$1"));
        setField(term69487, term69487.getClass(), "this$0", null);
        term69488 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term69503 = (byte[]) newByteArray(1);
        Object term69507 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term69508 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term69509 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term69510 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term69511 = (Object[]) newArray("java.security.Principal", 9);
        Object term69514 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term69517 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term69520 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term69523 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term69526 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term69531 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term69541 = newInstance(Class.forName("java.lang.Object"));
        setField(term69488, term69488.getClass(), "actionCommand", "iljANwuEjk");
        setLongField(term69488, term69488.getClass(), "when", -2813493605142626659L);
        setIntField(term69488, term69488.getClass(), "modifiers", -1835839814);
        setByteElement(term69503, 0, (byte) -103);
        setField(term69488, term69488.getClass(), "bdata", term69503);
        setIntField(term69488, term69488.getClass(), "id", -1404350380);
        setBooleanField(term69488, term69488.getClass(), "consumed", true);
        setField(term69510, term69510.getClass(), "location", null);
        setField(term69510, term69510.getClass(), "signers", null);
        setField(term69510, term69510.getClass(), "certs", null);
        setField(term69510, term69510.getClass(), "sp", null);
        setField(term69510, term69510.getClass(), "factory", null);
        setField(term69510, term69510.getClass(), "locationNoFragString", null);
        setField(term69509, term69509.getClass(), "codesource", term69510);
        setField(term69509, term69509.getClass(), "classloader", null);
        setField(term69509, term69509.getClass(), "principals", term69511);
        setField(term69509, term69509.getClass(), "permissions", null);
        setBooleanField(term69509, term69509.getClass(), "hasAllPerm", false);
        setBooleanField(term69509, term69509.getClass(), "staticPermissions", false);
        setField(term69509, term69509.getClass(), "key", null);
        setElement(term69508, 0, term69509);
        setField(term69514, term69514.getClass(), "codesource", null);
        setField(term69514, term69514.getClass(), "classloader", null);
        setField(term69514, term69514.getClass(), "principals", null);
        setField(term69514, term69514.getClass(), "permissions", null);
        setBooleanField(term69514, term69514.getClass(), "hasAllPerm", false);
        setBooleanField(term69514, term69514.getClass(), "staticPermissions", false);
        setField(term69514, term69514.getClass(), "key", null);
        setElement(term69508, 1, term69514);
        setField(term69517, term69517.getClass(), "codesource", null);
        setField(term69517, term69517.getClass(), "classloader", null);
        setField(term69517, term69517.getClass(), "principals", null);
        setField(term69517, term69517.getClass(), "permissions", null);
        setBooleanField(term69517, term69517.getClass(), "hasAllPerm", false);
        setBooleanField(term69517, term69517.getClass(), "staticPermissions", false);
        setField(term69517, term69517.getClass(), "key", null);
        setElement(term69508, 2, term69517);
        setField(term69520, term69520.getClass(), "codesource", null);
        setField(term69520, term69520.getClass(), "classloader", null);
        setField(term69520, term69520.getClass(), "principals", null);
        setField(term69520, term69520.getClass(), "permissions", null);
        setBooleanField(term69520, term69520.getClass(), "hasAllPerm", false);
        setBooleanField(term69520, term69520.getClass(), "staticPermissions", false);
        setField(term69520, term69520.getClass(), "key", null);
        setElement(term69508, 3, term69520);
        setField(term69523, term69523.getClass(), "codesource", null);
        setField(term69523, term69523.getClass(), "classloader", null);
        setField(term69523, term69523.getClass(), "principals", null);
        setField(term69523, term69523.getClass(), "permissions", null);
        setBooleanField(term69523, term69523.getClass(), "hasAllPerm", false);
        setBooleanField(term69523, term69523.getClass(), "staticPermissions", false);
        setField(term69523, term69523.getClass(), "key", null);
        setElement(term69508, 4, term69523);
        setField(term69526, term69526.getClass(), "codesource", null);
        setField(term69526, term69526.getClass(), "classloader", null);
        setField(term69526, term69526.getClass(), "principals", null);
        setField(term69526, term69526.getClass(), "permissions", null);
        setBooleanField(term69526, term69526.getClass(), "hasAllPerm", false);
        setBooleanField(term69526, term69526.getClass(), "staticPermissions", false);
        setField(term69526, term69526.getClass(), "key", null);
        setElement(term69508, 5, term69526);
        setField(term69507, term69507.getClass(), "context", term69508);
        setBooleanField(term69507, term69507.getClass(), "isPrivileged", true);
        setBooleanField(term69507, term69507.getClass(), "isAuthorized", true);
        setField(term69531, term69531.getClass(), "context", null);
        setBooleanField(term69531, term69531.getClass(), "isPrivileged", false);
        setBooleanField(term69531, term69531.getClass(), "isAuthorized", false);
        setField(term69531, term69531.getClass(), "privilegedContext", null);
        setField(term69531, term69531.getClass(), "combiner", null);
        setField(term69531, term69531.getClass(), "permissions", null);
        setField(term69531, term69531.getClass(), "parent", null);
        setBooleanField(term69531, term69531.getClass(), "isWrapped", false);
        setBooleanField(term69531, term69531.getClass(), "isLimited", false);
        setField(term69531, term69531.getClass(), "limitedContext", null);
        setField(term69507, term69507.getClass(), "privilegedContext", term69531);
        setField(term69507, term69507.getClass(), "combiner", null);
        setField(term69507, term69507.getClass(), "permissions", null);
        setField(term69507, term69507.getClass(), "parent", null);
        setBooleanField(term69507, term69507.getClass(), "isWrapped", false);
        setBooleanField(term69507, term69507.getClass(), "isLimited", false);
        setField(term69507, term69507.getClass(), "limitedContext", null);
        setField(term69488, term69488.getClass(), "acc", term69507);
        setBooleanField(term69488, term69488.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term69488, term69488.getClass(), "isPosted", false);
        setBooleanField(term69488, term69488.getClass(), "isSystemGenerated", true);
        setField(term69488, term69488.getClass(), "source", term69541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term69488;
        callMethod(klass, "actionPerformed", argTypes, term69487, args);
    }

};


