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
     Object term67718;
     Object term67719;

    public KDialog_1_keyPressed_15678943512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67718 = newInstance(Class.forName("proto.KDialog$1"));
        setField(term67718, term67718.getClass(), "this$0", null);
        term67719 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term67731 = (byte[]) newByteArray(1);
        Object term67735 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term67736 = (Object[]) newArray("java.security.ProtectionDomain", 7);
        Object term67737 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67738 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term67739 = (Object[]) newArray("java.security.Principal", 7);
        Object term67742 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67745 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67748 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67751 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67754 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67757 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term67762 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term67772 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term67719, term67719.getClass(), "isProxyActive", false);
        setIntField(term67719, term67719.getClass(), "keyCode", -751079123);
        setCharField(term67719, term67719.getClass(), "keyChar", 'u');
        setIntField(term67719, term67719.getClass(), "keyLocation", -110837188);
        setLongField(term67719, term67719.getClass(), "rawCode", -3842548265506930260L);
        setLongField(term67719, term67719.getClass(), "primaryLevelUnicode", -5788180182343976541L);
        setLongField(term67719, term67719.getClass(), "scancode", 2936323121573284007L);
        setLongField(term67719, term67719.getClass(), "extendedKeyCode", -1154553077993834885L);
        setField(term67719, term67719.getClass(), "originalSource", null);
        setLongField(term67719, term67719.getClass(), "when", -2850532706972744550L);
        setIntField(term67719, term67719.getClass(), "modifiers", -271094506);
        setBooleanField(term67719, term67719.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term67731, 0, (byte) -16);
        setField(term67719, term67719.getClass(), "bdata", term67731);
        setIntField(term67719, term67719.getClass(), "id", 455632030);
        setBooleanField(term67719, term67719.getClass(), "consumed", true);
        setField(term67738, term67738.getClass(), "location", null);
        setField(term67738, term67738.getClass(), "signers", null);
        setField(term67738, term67738.getClass(), "certs", null);
        setField(term67738, term67738.getClass(), "sp", null);
        setField(term67738, term67738.getClass(), "factory", null);
        setField(term67738, term67738.getClass(), "locationNoFragString", null);
        setField(term67737, term67737.getClass(), "codesource", term67738);
        setField(term67737, term67737.getClass(), "classloader", null);
        setField(term67737, term67737.getClass(), "principals", term67739);
        setField(term67737, term67737.getClass(), "permissions", null);
        setBooleanField(term67737, term67737.getClass(), "hasAllPerm", false);
        setBooleanField(term67737, term67737.getClass(), "staticPermissions", false);
        setField(term67737, term67737.getClass(), "key", null);
        setElement(term67736, 0, term67737);
        setField(term67742, term67742.getClass(), "codesource", null);
        setField(term67742, term67742.getClass(), "classloader", null);
        setField(term67742, term67742.getClass(), "principals", null);
        setField(term67742, term67742.getClass(), "permissions", null);
        setBooleanField(term67742, term67742.getClass(), "hasAllPerm", false);
        setBooleanField(term67742, term67742.getClass(), "staticPermissions", false);
        setField(term67742, term67742.getClass(), "key", null);
        setElement(term67736, 1, term67742);
        setField(term67745, term67745.getClass(), "codesource", null);
        setField(term67745, term67745.getClass(), "classloader", null);
        setField(term67745, term67745.getClass(), "principals", null);
        setField(term67745, term67745.getClass(), "permissions", null);
        setBooleanField(term67745, term67745.getClass(), "hasAllPerm", false);
        setBooleanField(term67745, term67745.getClass(), "staticPermissions", false);
        setField(term67745, term67745.getClass(), "key", null);
        setElement(term67736, 2, term67745);
        setField(term67748, term67748.getClass(), "codesource", null);
        setField(term67748, term67748.getClass(), "classloader", null);
        setField(term67748, term67748.getClass(), "principals", null);
        setField(term67748, term67748.getClass(), "permissions", null);
        setBooleanField(term67748, term67748.getClass(), "hasAllPerm", false);
        setBooleanField(term67748, term67748.getClass(), "staticPermissions", false);
        setField(term67748, term67748.getClass(), "key", null);
        setElement(term67736, 3, term67748);
        setField(term67751, term67751.getClass(), "codesource", null);
        setField(term67751, term67751.getClass(), "classloader", null);
        setField(term67751, term67751.getClass(), "principals", null);
        setField(term67751, term67751.getClass(), "permissions", null);
        setBooleanField(term67751, term67751.getClass(), "hasAllPerm", false);
        setBooleanField(term67751, term67751.getClass(), "staticPermissions", false);
        setField(term67751, term67751.getClass(), "key", null);
        setElement(term67736, 4, term67751);
        setField(term67754, term67754.getClass(), "codesource", null);
        setField(term67754, term67754.getClass(), "classloader", null);
        setField(term67754, term67754.getClass(), "principals", null);
        setField(term67754, term67754.getClass(), "permissions", null);
        setBooleanField(term67754, term67754.getClass(), "hasAllPerm", false);
        setBooleanField(term67754, term67754.getClass(), "staticPermissions", false);
        setField(term67754, term67754.getClass(), "key", null);
        setElement(term67736, 5, term67754);
        setField(term67757, term67757.getClass(), "codesource", null);
        setField(term67757, term67757.getClass(), "classloader", null);
        setField(term67757, term67757.getClass(), "principals", null);
        setField(term67757, term67757.getClass(), "permissions", null);
        setBooleanField(term67757, term67757.getClass(), "hasAllPerm", false);
        setBooleanField(term67757, term67757.getClass(), "staticPermissions", false);
        setField(term67757, term67757.getClass(), "key", null);
        setElement(term67736, 6, term67757);
        setField(term67735, term67735.getClass(), "context", term67736);
        setBooleanField(term67735, term67735.getClass(), "isPrivileged", false);
        setBooleanField(term67735, term67735.getClass(), "isAuthorized", true);
        setField(term67762, term67762.getClass(), "context", null);
        setBooleanField(term67762, term67762.getClass(), "isPrivileged", false);
        setBooleanField(term67762, term67762.getClass(), "isAuthorized", false);
        setField(term67762, term67762.getClass(), "privilegedContext", null);
        setField(term67762, term67762.getClass(), "combiner", null);
        setField(term67762, term67762.getClass(), "permissions", null);
        setField(term67762, term67762.getClass(), "parent", null);
        setBooleanField(term67762, term67762.getClass(), "isWrapped", false);
        setBooleanField(term67762, term67762.getClass(), "isLimited", false);
        setField(term67762, term67762.getClass(), "limitedContext", null);
        setField(term67735, term67735.getClass(), "privilegedContext", term67762);
        setField(term67735, term67735.getClass(), "combiner", null);
        setField(term67735, term67735.getClass(), "permissions", null);
        setField(term67735, term67735.getClass(), "parent", null);
        setBooleanField(term67735, term67735.getClass(), "isWrapped", false);
        setBooleanField(term67735, term67735.getClass(), "isLimited", false);
        setField(term67735, term67735.getClass(), "limitedContext", null);
        setField(term67719, term67719.getClass(), "acc", term67735);
        setBooleanField(term67719, term67719.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term67719, term67719.getClass(), "isPosted", true);
        setBooleanField(term67719, term67719.getClass(), "isSystemGenerated", false);
        setField(term67719, term67719.getClass(), "source", term67772);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KDialog$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term67719;
        callMethod(klass, "keyPressed", argTypes, term67718, args);
    }

};


