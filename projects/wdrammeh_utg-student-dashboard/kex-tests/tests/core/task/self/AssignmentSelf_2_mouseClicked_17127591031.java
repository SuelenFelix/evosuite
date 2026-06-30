package core.task.self;

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
import static core.task.self.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AssignmentSelf_2_mouseClicked_17127591031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66642;
     Object term66643;

    public AssignmentSelf_2_mouseClicked_17127591031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66642 = newInstance(Class.forName("core.task.self.AssignmentSelf$2"));
        setField(term66642, term66642.getClass(), "this$0", null);
        term66643 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term66656 = (byte[]) newByteArray(4);
        Object term66663 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term66664 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term66665 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term66666 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term66667 = (Object[]) newArray("java.security.Principal", 1);
        Object term66670 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term66673 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term66676 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term66679 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term66682 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term66685 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term66688 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term66693 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term66703 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term66643, term66643.getClass(), "x", -1630069454);
        setIntField(term66643, term66643.getClass(), "y", 1499735894);
        setIntField(term66643, term66643.getClass(), "xAbs", 716486048);
        setIntField(term66643, term66643.getClass(), "yAbs", -466708718);
        setIntField(term66643, term66643.getClass(), "clickCount", 1038029515);
        setBooleanField(term66643, term66643.getClass(), "causedByTouchEvent", false);
        setIntField(term66643, term66643.getClass(), "button", 1137154606);
        setBooleanField(term66643, term66643.getClass(), "popupTrigger", true);
        setBooleanField(term66643, term66643.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term66643, term66643.getClass(), "when", 860079646007397083L);
        setIntField(term66643, term66643.getClass(), "modifiers", -100681578);
        setBooleanField(term66643, term66643.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term66656, 0, (byte) 98);
        setByteElement(term66656, 1, (byte) 67);
        setByteElement(term66656, 2, (byte) 66);
        setByteElement(term66656, 3, (byte) -121);
        setField(term66643, term66643.getClass(), "bdata", term66656);
        setIntField(term66643, term66643.getClass(), "id", 296568835);
        setBooleanField(term66643, term66643.getClass(), "consumed", true);
        setField(term66666, term66666.getClass(), "location", null);
        setField(term66666, term66666.getClass(), "signers", null);
        setField(term66666, term66666.getClass(), "certs", null);
        setField(term66666, term66666.getClass(), "sp", null);
        setField(term66666, term66666.getClass(), "factory", null);
        setField(term66666, term66666.getClass(), "locationNoFragString", null);
        setField(term66665, term66665.getClass(), "codesource", term66666);
        setField(term66665, term66665.getClass(), "classloader", null);
        setField(term66665, term66665.getClass(), "principals", term66667);
        setField(term66665, term66665.getClass(), "permissions", null);
        setBooleanField(term66665, term66665.getClass(), "hasAllPerm", false);
        setBooleanField(term66665, term66665.getClass(), "staticPermissions", false);
        setField(term66665, term66665.getClass(), "key", null);
        setElement(term66664, 0, term66665);
        setField(term66670, term66670.getClass(), "codesource", null);
        setField(term66670, term66670.getClass(), "classloader", null);
        setField(term66670, term66670.getClass(), "principals", null);
        setField(term66670, term66670.getClass(), "permissions", null);
        setBooleanField(term66670, term66670.getClass(), "hasAllPerm", false);
        setBooleanField(term66670, term66670.getClass(), "staticPermissions", false);
        setField(term66670, term66670.getClass(), "key", null);
        setElement(term66664, 1, term66670);
        setField(term66673, term66673.getClass(), "codesource", null);
        setField(term66673, term66673.getClass(), "classloader", null);
        setField(term66673, term66673.getClass(), "principals", null);
        setField(term66673, term66673.getClass(), "permissions", null);
        setBooleanField(term66673, term66673.getClass(), "hasAllPerm", false);
        setBooleanField(term66673, term66673.getClass(), "staticPermissions", false);
        setField(term66673, term66673.getClass(), "key", null);
        setElement(term66664, 2, term66673);
        setField(term66676, term66676.getClass(), "codesource", null);
        setField(term66676, term66676.getClass(), "classloader", null);
        setField(term66676, term66676.getClass(), "principals", null);
        setField(term66676, term66676.getClass(), "permissions", null);
        setBooleanField(term66676, term66676.getClass(), "hasAllPerm", false);
        setBooleanField(term66676, term66676.getClass(), "staticPermissions", false);
        setField(term66676, term66676.getClass(), "key", null);
        setElement(term66664, 3, term66676);
        setField(term66679, term66679.getClass(), "codesource", null);
        setField(term66679, term66679.getClass(), "classloader", null);
        setField(term66679, term66679.getClass(), "principals", null);
        setField(term66679, term66679.getClass(), "permissions", null);
        setBooleanField(term66679, term66679.getClass(), "hasAllPerm", false);
        setBooleanField(term66679, term66679.getClass(), "staticPermissions", false);
        setField(term66679, term66679.getClass(), "key", null);
        setElement(term66664, 4, term66679);
        setField(term66682, term66682.getClass(), "codesource", null);
        setField(term66682, term66682.getClass(), "classloader", null);
        setField(term66682, term66682.getClass(), "principals", null);
        setField(term66682, term66682.getClass(), "permissions", null);
        setBooleanField(term66682, term66682.getClass(), "hasAllPerm", false);
        setBooleanField(term66682, term66682.getClass(), "staticPermissions", false);
        setField(term66682, term66682.getClass(), "key", null);
        setElement(term66664, 5, term66682);
        setField(term66685, term66685.getClass(), "codesource", null);
        setField(term66685, term66685.getClass(), "classloader", null);
        setField(term66685, term66685.getClass(), "principals", null);
        setField(term66685, term66685.getClass(), "permissions", null);
        setBooleanField(term66685, term66685.getClass(), "hasAllPerm", false);
        setBooleanField(term66685, term66685.getClass(), "staticPermissions", false);
        setField(term66685, term66685.getClass(), "key", null);
        setElement(term66664, 6, term66685);
        setField(term66688, term66688.getClass(), "codesource", null);
        setField(term66688, term66688.getClass(), "classloader", null);
        setField(term66688, term66688.getClass(), "principals", null);
        setField(term66688, term66688.getClass(), "permissions", null);
        setBooleanField(term66688, term66688.getClass(), "hasAllPerm", false);
        setBooleanField(term66688, term66688.getClass(), "staticPermissions", false);
        setField(term66688, term66688.getClass(), "key", null);
        setElement(term66664, 7, term66688);
        setField(term66663, term66663.getClass(), "context", term66664);
        setBooleanField(term66663, term66663.getClass(), "isPrivileged", true);
        setBooleanField(term66663, term66663.getClass(), "isAuthorized", true);
        setField(term66693, term66693.getClass(), "context", null);
        setBooleanField(term66693, term66693.getClass(), "isPrivileged", false);
        setBooleanField(term66693, term66693.getClass(), "isAuthorized", false);
        setField(term66693, term66693.getClass(), "privilegedContext", null);
        setField(term66693, term66693.getClass(), "combiner", null);
        setField(term66693, term66693.getClass(), "permissions", null);
        setField(term66693, term66693.getClass(), "parent", null);
        setBooleanField(term66693, term66693.getClass(), "isWrapped", false);
        setBooleanField(term66693, term66693.getClass(), "isLimited", false);
        setField(term66693, term66693.getClass(), "limitedContext", null);
        setField(term66663, term66663.getClass(), "privilegedContext", term66693);
        setField(term66663, term66663.getClass(), "combiner", null);
        setField(term66663, term66663.getClass(), "permissions", null);
        setField(term66663, term66663.getClass(), "parent", null);
        setBooleanField(term66663, term66663.getClass(), "isWrapped", false);
        setBooleanField(term66663, term66663.getClass(), "isLimited", false);
        setField(term66663, term66663.getClass(), "limitedContext", null);
        setField(term66643, term66643.getClass(), "acc", term66663);
        setBooleanField(term66643, term66643.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term66643, term66643.getClass(), "isPosted", false);
        setBooleanField(term66643, term66643.getClass(), "isSystemGenerated", false);
        setField(term66643, term66643.getClass(), "source", term66703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term66643;
        callMethod(klass, "mouseClicked", argTypes, term66642, args);
    }

};


