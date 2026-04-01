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
     Object term279919;
     Object term279920;

    public AssignmentSelf_2_mouseClicked_17127591031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279919 = newInstance(Class.forName("core.task.self.AssignmentSelf$2"));
        setField(term279919, term279919.getClass(), "this$0", null);
        term279920 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term279933 = (byte[]) newByteArray(0);
        Object term279936 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term279937 = (Object[]) newArray("java.security.ProtectionDomain", 4);
        Object term279938 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term279939 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term279940 = (Object[]) newArray("java.security.Principal", 2);
        Object term279943 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term279946 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term279949 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term279954 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term279964 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term279920, term279920.getClass(), "x", 2043960707);
        setIntField(term279920, term279920.getClass(), "y", 272179554);
        setIntField(term279920, term279920.getClass(), "xAbs", 1717711536);
        setIntField(term279920, term279920.getClass(), "yAbs", -606339607);
        setIntField(term279920, term279920.getClass(), "clickCount", 800440712);
        setBooleanField(term279920, term279920.getClass(), "causedByTouchEvent", true);
        setIntField(term279920, term279920.getClass(), "button", -1976407622);
        setBooleanField(term279920, term279920.getClass(), "popupTrigger", false);
        setBooleanField(term279920, term279920.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term279920, term279920.getClass(), "when", 768144790810175653L);
        setIntField(term279920, term279920.getClass(), "modifiers", -552996061);
        setBooleanField(term279920, term279920.getClass(), "canAccessSystemClipboard", true);
        setField(term279920, term279920.getClass(), "bdata", term279933);
        setIntField(term279920, term279920.getClass(), "id", -153013117);
        setBooleanField(term279920, term279920.getClass(), "consumed", false);
        setField(term279939, term279939.getClass(), "location", null);
        setField(term279939, term279939.getClass(), "signers", null);
        setField(term279939, term279939.getClass(), "certs", null);
        setField(term279939, term279939.getClass(), "sp", null);
        setField(term279939, term279939.getClass(), "factory", null);
        setField(term279939, term279939.getClass(), "locationNoFragString", null);
        setField(term279938, term279938.getClass(), "codesource", term279939);
        setField(term279938, term279938.getClass(), "classloader", null);
        setField(term279938, term279938.getClass(), "principals", term279940);
        setField(term279938, term279938.getClass(), "permissions", null);
        setBooleanField(term279938, term279938.getClass(), "hasAllPerm", false);
        setBooleanField(term279938, term279938.getClass(), "staticPermissions", false);
        setField(term279938, term279938.getClass(), "key", null);
        setElement(term279937, 0, term279938);
        setField(term279943, term279943.getClass(), "codesource", null);
        setField(term279943, term279943.getClass(), "classloader", null);
        setField(term279943, term279943.getClass(), "principals", null);
        setField(term279943, term279943.getClass(), "permissions", null);
        setBooleanField(term279943, term279943.getClass(), "hasAllPerm", false);
        setBooleanField(term279943, term279943.getClass(), "staticPermissions", false);
        setField(term279943, term279943.getClass(), "key", null);
        setElement(term279937, 1, term279943);
        setField(term279946, term279946.getClass(), "codesource", null);
        setField(term279946, term279946.getClass(), "classloader", null);
        setField(term279946, term279946.getClass(), "principals", null);
        setField(term279946, term279946.getClass(), "permissions", null);
        setBooleanField(term279946, term279946.getClass(), "hasAllPerm", false);
        setBooleanField(term279946, term279946.getClass(), "staticPermissions", false);
        setField(term279946, term279946.getClass(), "key", null);
        setElement(term279937, 2, term279946);
        setField(term279949, term279949.getClass(), "codesource", null);
        setField(term279949, term279949.getClass(), "classloader", null);
        setField(term279949, term279949.getClass(), "principals", null);
        setField(term279949, term279949.getClass(), "permissions", null);
        setBooleanField(term279949, term279949.getClass(), "hasAllPerm", false);
        setBooleanField(term279949, term279949.getClass(), "staticPermissions", false);
        setField(term279949, term279949.getClass(), "key", null);
        setElement(term279937, 3, term279949);
        setField(term279936, term279936.getClass(), "context", term279937);
        setBooleanField(term279936, term279936.getClass(), "isPrivileged", false);
        setBooleanField(term279936, term279936.getClass(), "isAuthorized", false);
        setField(term279954, term279954.getClass(), "context", null);
        setBooleanField(term279954, term279954.getClass(), "isPrivileged", false);
        setBooleanField(term279954, term279954.getClass(), "isAuthorized", false);
        setField(term279954, term279954.getClass(), "privilegedContext", null);
        setField(term279954, term279954.getClass(), "combiner", null);
        setField(term279954, term279954.getClass(), "permissions", null);
        setField(term279954, term279954.getClass(), "parent", null);
        setBooleanField(term279954, term279954.getClass(), "isWrapped", false);
        setBooleanField(term279954, term279954.getClass(), "isLimited", false);
        setField(term279954, term279954.getClass(), "limitedContext", null);
        setField(term279936, term279936.getClass(), "privilegedContext", term279954);
        setField(term279936, term279936.getClass(), "combiner", null);
        setField(term279936, term279936.getClass(), "permissions", null);
        setField(term279936, term279936.getClass(), "parent", null);
        setBooleanField(term279936, term279936.getClass(), "isWrapped", false);
        setBooleanField(term279936, term279936.getClass(), "isLimited", false);
        setField(term279936, term279936.getClass(), "limitedContext", null);
        setField(term279920, term279920.getClass(), "acc", term279936);
        setBooleanField(term279920, term279920.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term279920, term279920.getClass(), "isPosted", true);
        setBooleanField(term279920, term279920.getClass(), "isSystemGenerated", false);
        setField(term279920, term279920.getClass(), "source", term279964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term279920;
        callMethod(klass, "mouseClicked", argTypes, term279919, args);
    }

};


