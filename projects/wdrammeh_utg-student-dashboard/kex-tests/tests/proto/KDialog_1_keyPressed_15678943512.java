package proto;

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
import static proto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class KDialog_1_keyPressed_15678943512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67669;
     Object term67670;

    public KDialog_1_keyPressed_15678943512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67669 = newInstance(Class.forName("proto.KDialog$1"));
        setField(term67669, term67669.getClass(), "this$0", null);
        term67670 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term67682 = (byte[]) newByteArray(1);
        Object term67686 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term67687 = (Object[]) newArray("java.security.ProtectionDomain", 7);
        Object term67688 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67689 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term67690 = (Object[]) newArray("java.security.Principal", 7);
        Object term67693 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67696 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67699 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67702 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67705 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67708 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67713 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term67723 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term67670, term67670.getClass(), "isProxyActive", true);
        setIntField(term67670, term67670.getClass(), "keyCode", -751079123);
        setCharField(term67670, term67670.getClass(), "keyChar", 'u');
        setIntField(term67670, term67670.getClass(), "keyLocation", -110837188);
        setLongField(term67670, term67670.getClass(), "rawCode", -3842548265506930260L);
        setLongField(term67670, term67670.getClass(), "primaryLevelUnicode", -5788180182343976541L);
        setLongField(term67670, term67670.getClass(), "scancode", 2936323121573284007L);
        setLongField(term67670, term67670.getClass(), "extendedKeyCode", -1154553077993834885L);
        setField(term67670, term67670.getClass(), "originalSource", null);
        setLongField(term67670, term67670.getClass(), "when", -2850532706972744550L);
        setIntField(term67670, term67670.getClass(), "modifiers", -271094506);
        setBooleanField(term67670, term67670.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term67682, 0, (byte) -16);
        setField(term67670, term67670.getClass(), "bdata", term67682);
        setIntField(term67670, term67670.getClass(), "id", 455632030);
        setBooleanField(term67670, term67670.getClass(), "consumed", false);
        setField(term67689, term67689.getClass(), "location", null);
        setField(term67689, term67689.getClass(), "signers", null);
        setField(term67689, term67689.getClass(), "certs", null);
        setField(term67689, term67689.getClass(), "sp", null);
        setField(term67689, term67689.getClass(), "factory", null);
        setField(term67689, term67689.getClass(), "locationNoFragString", null);
        setField(term67688, term67688.getClass(), "codesource", term67689);
        setField(term67688, term67688.getClass(), "classloader", null);
        setField(term67688, term67688.getClass(), "principals", term67690);
        setField(term67688, term67688.getClass(), "permissions", null);
        setBooleanField(term67688, term67688.getClass(), "hasAllPerm", false);
        setBooleanField(term67688, term67688.getClass(), "staticPermissions", false);
        setField(term67688, term67688.getClass(), "key", null);
        setElement(term67687, 0, term67688);
        setField(term67693, term67693.getClass(), "codesource", null);
        setField(term67693, term67693.getClass(), "classloader", null);
        setField(term67693, term67693.getClass(), "principals", null);
        setField(term67693, term67693.getClass(), "permissions", null);
        setBooleanField(term67693, term67693.getClass(), "hasAllPerm", false);
        setBooleanField(term67693, term67693.getClass(), "staticPermissions", false);
        setField(term67693, term67693.getClass(), "key", null);
        setElement(term67687, 1, term67693);
        setField(term67696, term67696.getClass(), "codesource", null);
        setField(term67696, term67696.getClass(), "classloader", null);
        setField(term67696, term67696.getClass(), "principals", null);
        setField(term67696, term67696.getClass(), "permissions", null);
        setBooleanField(term67696, term67696.getClass(), "hasAllPerm", false);
        setBooleanField(term67696, term67696.getClass(), "staticPermissions", false);
        setField(term67696, term67696.getClass(), "key", null);
        setElement(term67687, 2, term67696);
        setField(term67699, term67699.getClass(), "codesource", null);
        setField(term67699, term67699.getClass(), "classloader", null);
        setField(term67699, term67699.getClass(), "principals", null);
        setField(term67699, term67699.getClass(), "permissions", null);
        setBooleanField(term67699, term67699.getClass(), "hasAllPerm", false);
        setBooleanField(term67699, term67699.getClass(), "staticPermissions", false);
        setField(term67699, term67699.getClass(), "key", null);
        setElement(term67687, 3, term67699);
        setField(term67702, term67702.getClass(), "codesource", null);
        setField(term67702, term67702.getClass(), "classloader", null);
        setField(term67702, term67702.getClass(), "principals", null);
        setField(term67702, term67702.getClass(), "permissions", null);
        setBooleanField(term67702, term67702.getClass(), "hasAllPerm", false);
        setBooleanField(term67702, term67702.getClass(), "staticPermissions", false);
        setField(term67702, term67702.getClass(), "key", null);
        setElement(term67687, 4, term67702);
        setField(term67705, term67705.getClass(), "codesource", null);
        setField(term67705, term67705.getClass(), "classloader", null);
        setField(term67705, term67705.getClass(), "principals", null);
        setField(term67705, term67705.getClass(), "permissions", null);
        setBooleanField(term67705, term67705.getClass(), "hasAllPerm", false);
        setBooleanField(term67705, term67705.getClass(), "staticPermissions", false);
        setField(term67705, term67705.getClass(), "key", null);
        setElement(term67687, 5, term67705);
        setField(term67708, term67708.getClass(), "codesource", null);
        setField(term67708, term67708.getClass(), "classloader", null);
        setField(term67708, term67708.getClass(), "principals", null);
        setField(term67708, term67708.getClass(), "permissions", null);
        setBooleanField(term67708, term67708.getClass(), "hasAllPerm", false);
        setBooleanField(term67708, term67708.getClass(), "staticPermissions", false);
        setField(term67708, term67708.getClass(), "key", null);
        setElement(term67687, 6, term67708);
        setField(term67686, term67686.getClass(), "context", term67687);
        setBooleanField(term67686, term67686.getClass(), "isPrivileged", true);
        setBooleanField(term67686, term67686.getClass(), "isAuthorized", false);
        setField(term67713, term67713.getClass(), "context", null);
        setBooleanField(term67713, term67713.getClass(), "isPrivileged", false);
        setBooleanField(term67713, term67713.getClass(), "isAuthorized", false);
        setField(term67713, term67713.getClass(), "privilegedContext", null);
        setField(term67713, term67713.getClass(), "combiner", null);
        setField(term67713, term67713.getClass(), "permissions", null);
        setField(term67713, term67713.getClass(), "parent", null);
        setBooleanField(term67713, term67713.getClass(), "isWrapped", false);
        setBooleanField(term67713, term67713.getClass(), "isLimited", false);
        setField(term67713, term67713.getClass(), "limitedContext", null);
        setField(term67686, term67686.getClass(), "privilegedContext", term67713);
        setField(term67686, term67686.getClass(), "combiner", null);
        setField(term67686, term67686.getClass(), "permissions", null);
        setField(term67686, term67686.getClass(), "parent", null);
        setBooleanField(term67686, term67686.getClass(), "isWrapped", false);
        setBooleanField(term67686, term67686.getClass(), "isLimited", false);
        setField(term67686, term67686.getClass(), "limitedContext", null);
        setField(term67670, term67670.getClass(), "acc", term67686);
        setBooleanField(term67670, term67670.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term67670, term67670.getClass(), "isPosted", false);
        setBooleanField(term67670, term67670.getClass(), "isSystemGenerated", true);
        setField(term67670, term67670.getClass(), "source", term67723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KDialog$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term67670;
        callMethod(klass, "keyPressed", argTypes, term67669, args);
    }

};


