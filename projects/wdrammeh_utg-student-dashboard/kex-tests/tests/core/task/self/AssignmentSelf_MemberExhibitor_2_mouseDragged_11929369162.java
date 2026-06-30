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

public class AssignmentSelf_MemberExhibitor_2_mouseDragged_11929369162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31803;
     Object term31804;

    public AssignmentSelf_MemberExhibitor_2_mouseDragged_11929369162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31803 = newInstance(Class.forName("core.task.self.AssignmentSelf$MemberExhibitor$2"));
        setField(term31803, term31803.getClass(), "this$0", null);
        term31804 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term31817 = (byte[]) newByteArray(3);
        Object term31823 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term31824 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term31825 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term31826 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term31827 = (Object[]) newArray("java.security.Principal", 4);
        Object term31830 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term31833 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term31836 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term31839 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term31842 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term31847 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term31857 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term31804, term31804.getClass(), "x", -2013924238);
        setIntField(term31804, term31804.getClass(), "y", 579006268);
        setIntField(term31804, term31804.getClass(), "xAbs", -1694747156);
        setIntField(term31804, term31804.getClass(), "yAbs", 1466373988);
        setIntField(term31804, term31804.getClass(), "clickCount", -358526505);
        setBooleanField(term31804, term31804.getClass(), "causedByTouchEvent", true);
        setIntField(term31804, term31804.getClass(), "button", 1843268026);
        setBooleanField(term31804, term31804.getClass(), "popupTrigger", false);
        setBooleanField(term31804, term31804.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term31804, term31804.getClass(), "when", -3936701866695933852L);
        setIntField(term31804, term31804.getClass(), "modifiers", 954660603);
        setBooleanField(term31804, term31804.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term31817, 0, (byte) 47);
        setByteElement(term31817, 1, (byte) 48);
        setByteElement(term31817, 2, (byte) 89);
        setField(term31804, term31804.getClass(), "bdata", term31817);
        setIntField(term31804, term31804.getClass(), "id", -1351605385);
        setBooleanField(term31804, term31804.getClass(), "consumed", false);
        setField(term31826, term31826.getClass(), "location", null);
        setField(term31826, term31826.getClass(), "signers", null);
        setField(term31826, term31826.getClass(), "certs", null);
        setField(term31826, term31826.getClass(), "sp", null);
        setField(term31826, term31826.getClass(), "factory", null);
        setField(term31826, term31826.getClass(), "locationNoFragString", null);
        setField(term31825, term31825.getClass(), "codesource", term31826);
        setField(term31825, term31825.getClass(), "classloader", null);
        setField(term31825, term31825.getClass(), "principals", term31827);
        setField(term31825, term31825.getClass(), "permissions", null);
        setBooleanField(term31825, term31825.getClass(), "hasAllPerm", false);
        setBooleanField(term31825, term31825.getClass(), "staticPermissions", false);
        setField(term31825, term31825.getClass(), "key", null);
        setElement(term31824, 0, term31825);
        setField(term31830, term31830.getClass(), "codesource", null);
        setField(term31830, term31830.getClass(), "classloader", null);
        setField(term31830, term31830.getClass(), "principals", null);
        setField(term31830, term31830.getClass(), "permissions", null);
        setBooleanField(term31830, term31830.getClass(), "hasAllPerm", false);
        setBooleanField(term31830, term31830.getClass(), "staticPermissions", false);
        setField(term31830, term31830.getClass(), "key", null);
        setElement(term31824, 1, term31830);
        setField(term31833, term31833.getClass(), "codesource", null);
        setField(term31833, term31833.getClass(), "classloader", null);
        setField(term31833, term31833.getClass(), "principals", null);
        setField(term31833, term31833.getClass(), "permissions", null);
        setBooleanField(term31833, term31833.getClass(), "hasAllPerm", false);
        setBooleanField(term31833, term31833.getClass(), "staticPermissions", false);
        setField(term31833, term31833.getClass(), "key", null);
        setElement(term31824, 2, term31833);
        setField(term31836, term31836.getClass(), "codesource", null);
        setField(term31836, term31836.getClass(), "classloader", null);
        setField(term31836, term31836.getClass(), "principals", null);
        setField(term31836, term31836.getClass(), "permissions", null);
        setBooleanField(term31836, term31836.getClass(), "hasAllPerm", false);
        setBooleanField(term31836, term31836.getClass(), "staticPermissions", false);
        setField(term31836, term31836.getClass(), "key", null);
        setElement(term31824, 3, term31836);
        setField(term31839, term31839.getClass(), "codesource", null);
        setField(term31839, term31839.getClass(), "classloader", null);
        setField(term31839, term31839.getClass(), "principals", null);
        setField(term31839, term31839.getClass(), "permissions", null);
        setBooleanField(term31839, term31839.getClass(), "hasAllPerm", false);
        setBooleanField(term31839, term31839.getClass(), "staticPermissions", false);
        setField(term31839, term31839.getClass(), "key", null);
        setElement(term31824, 4, term31839);
        setField(term31842, term31842.getClass(), "codesource", null);
        setField(term31842, term31842.getClass(), "classloader", null);
        setField(term31842, term31842.getClass(), "principals", null);
        setField(term31842, term31842.getClass(), "permissions", null);
        setBooleanField(term31842, term31842.getClass(), "hasAllPerm", false);
        setBooleanField(term31842, term31842.getClass(), "staticPermissions", false);
        setField(term31842, term31842.getClass(), "key", null);
        setElement(term31824, 5, term31842);
        setField(term31823, term31823.getClass(), "context", term31824);
        setBooleanField(term31823, term31823.getClass(), "isPrivileged", true);
        setBooleanField(term31823, term31823.getClass(), "isAuthorized", false);
        setField(term31847, term31847.getClass(), "context", null);
        setBooleanField(term31847, term31847.getClass(), "isPrivileged", false);
        setBooleanField(term31847, term31847.getClass(), "isAuthorized", false);
        setField(term31847, term31847.getClass(), "privilegedContext", null);
        setField(term31847, term31847.getClass(), "combiner", null);
        setField(term31847, term31847.getClass(), "permissions", null);
        setField(term31847, term31847.getClass(), "parent", null);
        setBooleanField(term31847, term31847.getClass(), "isWrapped", false);
        setBooleanField(term31847, term31847.getClass(), "isLimited", false);
        setField(term31847, term31847.getClass(), "limitedContext", null);
        setField(term31823, term31823.getClass(), "privilegedContext", term31847);
        setField(term31823, term31823.getClass(), "combiner", null);
        setField(term31823, term31823.getClass(), "permissions", null);
        setField(term31823, term31823.getClass(), "parent", null);
        setBooleanField(term31823, term31823.getClass(), "isWrapped", false);
        setBooleanField(term31823, term31823.getClass(), "isLimited", false);
        setField(term31823, term31823.getClass(), "limitedContext", null);
        setField(term31804, term31804.getClass(), "acc", term31823);
        setBooleanField(term31804, term31804.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term31804, term31804.getClass(), "isPosted", false);
        setBooleanField(term31804, term31804.getClass(), "isSystemGenerated", true);
        setField(term31804, term31804.getClass(), "source", term31857);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$MemberExhibitor$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term31804;
        callMethod(klass, "mouseDragged", argTypes, term31803, args);
    }

};


