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
     Object term230805;
     Object term230806;

    public AssignmentSelf_MemberExhibitor_2_mouseDragged_11929369162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230805 = newInstance(Class.forName("core.task.self.AssignmentSelf$MemberExhibitor$2"));
        setField(term230805, term230805.getClass(), "this$0", null);
        term230806 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term230819 = (byte[]) newByteArray(3);
        Object term230825 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term230826 = (Object[]) newArray("java.security.ProtectionDomain", 3);
        Object term230827 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term230828 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term230829 = (Object[]) newArray("java.security.Principal", 0);
        Object term230832 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term230835 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term230840 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term230850 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term230806, term230806.getClass(), "x", 1544012770);
        setIntField(term230806, term230806.getClass(), "y", 1922068039);
        setIntField(term230806, term230806.getClass(), "xAbs", -410564443);
        setIntField(term230806, term230806.getClass(), "yAbs", 996017434);
        setIntField(term230806, term230806.getClass(), "clickCount", -983870300);
        setBooleanField(term230806, term230806.getClass(), "causedByTouchEvent", true);
        setIntField(term230806, term230806.getClass(), "button", 360715062);
        setBooleanField(term230806, term230806.getClass(), "popupTrigger", true);
        setBooleanField(term230806, term230806.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term230806, term230806.getClass(), "when", 8863790908271299748L);
        setIntField(term230806, term230806.getClass(), "modifiers", 1047409266);
        setBooleanField(term230806, term230806.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term230819, 0, (byte) 24);
        setByteElement(term230819, 1, (byte) 123);
        setByteElement(term230819, 2, (byte) -101);
        setField(term230806, term230806.getClass(), "bdata", term230819);
        setIntField(term230806, term230806.getClass(), "id", 1427248961);
        setBooleanField(term230806, term230806.getClass(), "consumed", false);
        setField(term230828, term230828.getClass(), "location", null);
        setField(term230828, term230828.getClass(), "signers", null);
        setField(term230828, term230828.getClass(), "certs", null);
        setField(term230828, term230828.getClass(), "sp", null);
        setField(term230828, term230828.getClass(), "factory", null);
        setField(term230828, term230828.getClass(), "locationNoFragString", null);
        setField(term230827, term230827.getClass(), "codesource", term230828);
        setField(term230827, term230827.getClass(), "classloader", null);
        setField(term230827, term230827.getClass(), "principals", term230829);
        setField(term230827, term230827.getClass(), "permissions", null);
        setBooleanField(term230827, term230827.getClass(), "hasAllPerm", false);
        setBooleanField(term230827, term230827.getClass(), "staticPermissions", false);
        setField(term230827, term230827.getClass(), "key", null);
        setElement(term230826, 0, term230827);
        setField(term230832, term230832.getClass(), "codesource", null);
        setField(term230832, term230832.getClass(), "classloader", null);
        setField(term230832, term230832.getClass(), "principals", null);
        setField(term230832, term230832.getClass(), "permissions", null);
        setBooleanField(term230832, term230832.getClass(), "hasAllPerm", false);
        setBooleanField(term230832, term230832.getClass(), "staticPermissions", false);
        setField(term230832, term230832.getClass(), "key", null);
        setElement(term230826, 1, term230832);
        setField(term230835, term230835.getClass(), "codesource", null);
        setField(term230835, term230835.getClass(), "classloader", null);
        setField(term230835, term230835.getClass(), "principals", null);
        setField(term230835, term230835.getClass(), "permissions", null);
        setBooleanField(term230835, term230835.getClass(), "hasAllPerm", false);
        setBooleanField(term230835, term230835.getClass(), "staticPermissions", false);
        setField(term230835, term230835.getClass(), "key", null);
        setElement(term230826, 2, term230835);
        setField(term230825, term230825.getClass(), "context", term230826);
        setBooleanField(term230825, term230825.getClass(), "isPrivileged", false);
        setBooleanField(term230825, term230825.getClass(), "isAuthorized", false);
        setField(term230840, term230840.getClass(), "context", null);
        setBooleanField(term230840, term230840.getClass(), "isPrivileged", false);
        setBooleanField(term230840, term230840.getClass(), "isAuthorized", false);
        setField(term230840, term230840.getClass(), "privilegedContext", null);
        setField(term230840, term230840.getClass(), "combiner", null);
        setField(term230840, term230840.getClass(), "permissions", null);
        setField(term230840, term230840.getClass(), "parent", null);
        setBooleanField(term230840, term230840.getClass(), "isWrapped", false);
        setBooleanField(term230840, term230840.getClass(), "isLimited", false);
        setField(term230840, term230840.getClass(), "limitedContext", null);
        setField(term230825, term230825.getClass(), "privilegedContext", term230840);
        setField(term230825, term230825.getClass(), "combiner", null);
        setField(term230825, term230825.getClass(), "permissions", null);
        setField(term230825, term230825.getClass(), "parent", null);
        setBooleanField(term230825, term230825.getClass(), "isWrapped", false);
        setBooleanField(term230825, term230825.getClass(), "isLimited", false);
        setField(term230825, term230825.getClass(), "limitedContext", null);
        setField(term230806, term230806.getClass(), "acc", term230825);
        setBooleanField(term230806, term230806.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term230806, term230806.getClass(), "isPosted", false);
        setBooleanField(term230806, term230806.getClass(), "isSystemGenerated", true);
        setField(term230806, term230806.getClass(), "source", term230850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$MemberExhibitor$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term230806;
        callMethod(klass, "mouseDragged", argTypes, term230805, args);
    }

};


