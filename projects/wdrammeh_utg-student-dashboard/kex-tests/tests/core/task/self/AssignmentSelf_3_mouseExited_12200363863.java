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

public class AssignmentSelf_3_mouseExited_12200363863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278727;
     Object term278728;

    public AssignmentSelf_3_mouseExited_12200363863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278727 = newInstance(Class.forName("core.task.self.AssignmentSelf$3"));
        setField(term278727, term278727.getClass(), "this$0", null);
        term278728 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term278741 = (byte[]) newByteArray(5);
        Object term278749 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term278750 = (Object[]) newArray("java.security.ProtectionDomain", 0);
        Object term278753 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term278754 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term278755 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term278758 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term278763 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term278775 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term278728, term278728.getClass(), "x", -584949216);
        setIntField(term278728, term278728.getClass(), "y", 1646064199);
        setIntField(term278728, term278728.getClass(), "xAbs", -1135845415);
        setIntField(term278728, term278728.getClass(), "yAbs", -1361921586);
        setIntField(term278728, term278728.getClass(), "clickCount", 593679468);
        setBooleanField(term278728, term278728.getClass(), "causedByTouchEvent", true);
        setIntField(term278728, term278728.getClass(), "button", 747491);
        setBooleanField(term278728, term278728.getClass(), "popupTrigger", false);
        setBooleanField(term278728, term278728.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term278728, term278728.getClass(), "when", -6521561238735301071L);
        setIntField(term278728, term278728.getClass(), "modifiers", 734222768);
        setBooleanField(term278728, term278728.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term278741, 0, (byte) 126);
        setByteElement(term278741, 1, (byte) 7);
        setByteElement(term278741, 2, (byte) -96);
        setByteElement(term278741, 3, (byte) -22);
        setByteElement(term278741, 4, (byte) -5);
        setField(term278728, term278728.getClass(), "bdata", term278741);
        setIntField(term278728, term278728.getClass(), "id", 1545425140);
        setBooleanField(term278728, term278728.getClass(), "consumed", false);
        setField(term278749, term278749.getClass(), "context", term278750);
        setBooleanField(term278749, term278749.getClass(), "isPrivileged", false);
        setBooleanField(term278749, term278749.getClass(), "isAuthorized", true);
        setField(term278755, term278755.getClass(), "codesource", null);
        setField(term278755, term278755.getClass(), "classloader", null);
        setField(term278755, term278755.getClass(), "principals", null);
        setField(term278755, term278755.getClass(), "permissions", null);
        setBooleanField(term278755, term278755.getClass(), "hasAllPerm", false);
        setBooleanField(term278755, term278755.getClass(), "staticPermissions", false);
        setField(term278755, term278755.getClass(), "key", null);
        setElement(term278754, 0, term278755);
        setField(term278758, term278758.getClass(), "codesource", null);
        setField(term278758, term278758.getClass(), "classloader", null);
        setField(term278758, term278758.getClass(), "principals", null);
        setField(term278758, term278758.getClass(), "permissions", null);
        setBooleanField(term278758, term278758.getClass(), "hasAllPerm", false);
        setBooleanField(term278758, term278758.getClass(), "staticPermissions", false);
        setField(term278758, term278758.getClass(), "key", null);
        setElement(term278754, 1, term278758);
        setField(term278753, term278753.getClass(), "context", term278754);
        setBooleanField(term278753, term278753.getClass(), "isPrivileged", true);
        setBooleanField(term278753, term278753.getClass(), "isAuthorized", true);
        setField(term278763, term278763.getClass(), "context", null);
        setBooleanField(term278763, term278763.getClass(), "isPrivileged", false);
        setBooleanField(term278763, term278763.getClass(), "isAuthorized", false);
        setField(term278763, term278763.getClass(), "privilegedContext", null);
        setField(term278763, term278763.getClass(), "combiner", null);
        setField(term278763, term278763.getClass(), "permissions", null);
        setField(term278763, term278763.getClass(), "parent", null);
        setBooleanField(term278763, term278763.getClass(), "isWrapped", false);
        setBooleanField(term278763, term278763.getClass(), "isLimited", false);
        setField(term278763, term278763.getClass(), "limitedContext", null);
        setField(term278753, term278753.getClass(), "privilegedContext", term278763);
        setField(term278753, term278753.getClass(), "combiner", null);
        setField(term278753, term278753.getClass(), "permissions", null);
        setField(term278753, term278753.getClass(), "parent", null);
        setBooleanField(term278753, term278753.getClass(), "isWrapped", false);
        setBooleanField(term278753, term278753.getClass(), "isLimited", false);
        setField(term278753, term278753.getClass(), "limitedContext", null);
        setField(term278749, term278749.getClass(), "privilegedContext", term278753);
        setField(term278749, term278749.getClass(), "combiner", null);
        setField(term278749, term278749.getClass(), "permissions", null);
        setField(term278749, term278749.getClass(), "parent", null);
        setBooleanField(term278749, term278749.getClass(), "isWrapped", false);
        setBooleanField(term278749, term278749.getClass(), "isLimited", false);
        setField(term278749, term278749.getClass(), "limitedContext", null);
        setField(term278728, term278728.getClass(), "acc", term278749);
        setBooleanField(term278728, term278728.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term278728, term278728.getClass(), "isPosted", true);
        setBooleanField(term278728, term278728.getClass(), "isSystemGenerated", false);
        setField(term278728, term278728.getClass(), "source", term278775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term278728;
        callMethod(klass, "mouseExited", argTypes, term278727, args);
    }

};


