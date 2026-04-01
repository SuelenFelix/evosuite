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

public class AssignmentSelf_3_mouseClicked_17127591342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278687;
     Object term278688;

    public AssignmentSelf_3_mouseClicked_17127591342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278687 = newInstance(Class.forName("core.task.self.AssignmentSelf$3"));
        setField(term278687, term278687.getClass(), "this$0", null);
        term278688 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term278701 = (byte[]) newByteArray(0);
        Object term278704 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term278705 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term278706 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term278707 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term278708 = (Object[]) newArray("java.security.Principal", 4);
        Object term278711 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term278716 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term278726 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term278688, term278688.getClass(), "x", 908188015);
        setIntField(term278688, term278688.getClass(), "y", 1448289766);
        setIntField(term278688, term278688.getClass(), "xAbs", 1377148923);
        setIntField(term278688, term278688.getClass(), "yAbs", 540775467);
        setIntField(term278688, term278688.getClass(), "clickCount", -2083028527);
        setBooleanField(term278688, term278688.getClass(), "causedByTouchEvent", true);
        setIntField(term278688, term278688.getClass(), "button", 1631605263);
        setBooleanField(term278688, term278688.getClass(), "popupTrigger", true);
        setBooleanField(term278688, term278688.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term278688, term278688.getClass(), "when", -5935517391653614345L);
        setIntField(term278688, term278688.getClass(), "modifiers", -1378134881);
        setBooleanField(term278688, term278688.getClass(), "canAccessSystemClipboard", false);
        setField(term278688, term278688.getClass(), "bdata", term278701);
        setIntField(term278688, term278688.getClass(), "id", -1887131478);
        setBooleanField(term278688, term278688.getClass(), "consumed", false);
        setField(term278707, term278707.getClass(), "location", null);
        setField(term278707, term278707.getClass(), "signers", null);
        setField(term278707, term278707.getClass(), "certs", null);
        setField(term278707, term278707.getClass(), "sp", null);
        setField(term278707, term278707.getClass(), "factory", null);
        setField(term278707, term278707.getClass(), "locationNoFragString", null);
        setField(term278706, term278706.getClass(), "codesource", term278707);
        setField(term278706, term278706.getClass(), "classloader", null);
        setField(term278706, term278706.getClass(), "principals", term278708);
        setField(term278706, term278706.getClass(), "permissions", null);
        setBooleanField(term278706, term278706.getClass(), "hasAllPerm", false);
        setBooleanField(term278706, term278706.getClass(), "staticPermissions", false);
        setField(term278706, term278706.getClass(), "key", null);
        setElement(term278705, 0, term278706);
        setField(term278711, term278711.getClass(), "codesource", null);
        setField(term278711, term278711.getClass(), "classloader", null);
        setField(term278711, term278711.getClass(), "principals", null);
        setField(term278711, term278711.getClass(), "permissions", null);
        setBooleanField(term278711, term278711.getClass(), "hasAllPerm", false);
        setBooleanField(term278711, term278711.getClass(), "staticPermissions", false);
        setField(term278711, term278711.getClass(), "key", null);
        setElement(term278705, 1, term278711);
        setField(term278704, term278704.getClass(), "context", term278705);
        setBooleanField(term278704, term278704.getClass(), "isPrivileged", false);
        setBooleanField(term278704, term278704.getClass(), "isAuthorized", true);
        setField(term278716, term278716.getClass(), "context", null);
        setBooleanField(term278716, term278716.getClass(), "isPrivileged", false);
        setBooleanField(term278716, term278716.getClass(), "isAuthorized", false);
        setField(term278716, term278716.getClass(), "privilegedContext", null);
        setField(term278716, term278716.getClass(), "combiner", null);
        setField(term278716, term278716.getClass(), "permissions", null);
        setField(term278716, term278716.getClass(), "parent", null);
        setBooleanField(term278716, term278716.getClass(), "isWrapped", false);
        setBooleanField(term278716, term278716.getClass(), "isLimited", false);
        setField(term278716, term278716.getClass(), "limitedContext", null);
        setField(term278704, term278704.getClass(), "privilegedContext", term278716);
        setField(term278704, term278704.getClass(), "combiner", null);
        setField(term278704, term278704.getClass(), "permissions", null);
        setField(term278704, term278704.getClass(), "parent", null);
        setBooleanField(term278704, term278704.getClass(), "isWrapped", false);
        setBooleanField(term278704, term278704.getClass(), "isLimited", false);
        setField(term278704, term278704.getClass(), "limitedContext", null);
        setField(term278688, term278688.getClass(), "acc", term278704);
        setBooleanField(term278688, term278688.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term278688, term278688.getClass(), "isPosted", false);
        setBooleanField(term278688, term278688.getClass(), "isSystemGenerated", false);
        setField(term278688, term278688.getClass(), "source", term278726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.self.AssignmentSelf$3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term278688;
        callMethod(klass, "mouseClicked", argTypes, term278687, args);
    }

};


