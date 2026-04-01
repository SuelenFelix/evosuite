package org.openRealmOfStars.gui.labels;

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
import static org.openRealmOfStars.gui.labels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StarFieldTextArea_CreditMouseListener_mouseClicked_19387550541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3970;
     Object term3971;

    public StarFieldTextArea_CreditMouseListener_mouseClicked_19387550541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3970 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea$CreditMouseListener"));
        setField(term3970, term3970.getClass(), "this$0", null);
        term3971 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term3984 = (byte[]) newByteArray(3);
        Object term3990 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term3991 = (Object[]) newArray("java.security.ProtectionDomain", 7);
        Object term3992 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term3993 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term3994 = (Object[]) newArray("java.security.Principal", 6);
        Object term3997 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4000 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4003 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4006 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4009 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4012 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term4017 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term4027 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term3971, term3971.getClass(), "x", -2003192918);
        setIntField(term3971, term3971.getClass(), "y", -1362856620);
        setIntField(term3971, term3971.getClass(), "xAbs", -1835839814);
        setIntField(term3971, term3971.getClass(), "yAbs", -1404350380);
        setIntField(term3971, term3971.getClass(), "clickCount", -2013924238);
        setBooleanField(term3971, term3971.getClass(), "causedByTouchEvent", false);
        setIntField(term3971, term3971.getClass(), "button", 579006268);
        setBooleanField(term3971, term3971.getClass(), "popupTrigger", false);
        setBooleanField(term3971, term3971.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term3971, term3971.getClass(), "when", 2442117782898005296L);
        setIntField(term3971, term3971.getClass(), "modifiers", -1694747156);
        setBooleanField(term3971, term3971.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term3984, 0, (byte) 47);
        setByteElement(term3984, 1, (byte) 48);
        setByteElement(term3984, 2, (byte) 89);
        setField(term3971, term3971.getClass(), "bdata", term3984);
        setIntField(term3971, term3971.getClass(), "id", 1466373988);
        setBooleanField(term3971, term3971.getClass(), "consumed", false);
        setField(term3993, term3993.getClass(), "location", null);
        setField(term3993, term3993.getClass(), "signers", null);
        setField(term3993, term3993.getClass(), "certs", null);
        setField(term3993, term3993.getClass(), "sp", null);
        setField(term3993, term3993.getClass(), "factory", null);
        setField(term3993, term3993.getClass(), "locationNoFragString", null);
        setField(term3992, term3992.getClass(), "codesource", term3993);
        setField(term3992, term3992.getClass(), "classloader", null);
        setField(term3992, term3992.getClass(), "principals", term3994);
        setField(term3992, term3992.getClass(), "permissions", null);
        setBooleanField(term3992, term3992.getClass(), "hasAllPerm", false);
        setBooleanField(term3992, term3992.getClass(), "staticPermissions", false);
        setField(term3992, term3992.getClass(), "key", null);
        setElement(term3991, 0, term3992);
        setField(term3997, term3997.getClass(), "codesource", null);
        setField(term3997, term3997.getClass(), "classloader", null);
        setField(term3997, term3997.getClass(), "principals", null);
        setField(term3997, term3997.getClass(), "permissions", null);
        setBooleanField(term3997, term3997.getClass(), "hasAllPerm", false);
        setBooleanField(term3997, term3997.getClass(), "staticPermissions", false);
        setField(term3997, term3997.getClass(), "key", null);
        setElement(term3991, 1, term3997);
        setField(term4000, term4000.getClass(), "codesource", null);
        setField(term4000, term4000.getClass(), "classloader", null);
        setField(term4000, term4000.getClass(), "principals", null);
        setField(term4000, term4000.getClass(), "permissions", null);
        setBooleanField(term4000, term4000.getClass(), "hasAllPerm", false);
        setBooleanField(term4000, term4000.getClass(), "staticPermissions", false);
        setField(term4000, term4000.getClass(), "key", null);
        setElement(term3991, 2, term4000);
        setField(term4003, term4003.getClass(), "codesource", null);
        setField(term4003, term4003.getClass(), "classloader", null);
        setField(term4003, term4003.getClass(), "principals", null);
        setField(term4003, term4003.getClass(), "permissions", null);
        setBooleanField(term4003, term4003.getClass(), "hasAllPerm", false);
        setBooleanField(term4003, term4003.getClass(), "staticPermissions", false);
        setField(term4003, term4003.getClass(), "key", null);
        setElement(term3991, 3, term4003);
        setField(term4006, term4006.getClass(), "codesource", null);
        setField(term4006, term4006.getClass(), "classloader", null);
        setField(term4006, term4006.getClass(), "principals", null);
        setField(term4006, term4006.getClass(), "permissions", null);
        setBooleanField(term4006, term4006.getClass(), "hasAllPerm", false);
        setBooleanField(term4006, term4006.getClass(), "staticPermissions", false);
        setField(term4006, term4006.getClass(), "key", null);
        setElement(term3991, 4, term4006);
        setField(term4009, term4009.getClass(), "codesource", null);
        setField(term4009, term4009.getClass(), "classloader", null);
        setField(term4009, term4009.getClass(), "principals", null);
        setField(term4009, term4009.getClass(), "permissions", null);
        setBooleanField(term4009, term4009.getClass(), "hasAllPerm", false);
        setBooleanField(term4009, term4009.getClass(), "staticPermissions", false);
        setField(term4009, term4009.getClass(), "key", null);
        setElement(term3991, 5, term4009);
        setField(term4012, term4012.getClass(), "codesource", null);
        setField(term4012, term4012.getClass(), "classloader", null);
        setField(term4012, term4012.getClass(), "principals", null);
        setField(term4012, term4012.getClass(), "permissions", null);
        setBooleanField(term4012, term4012.getClass(), "hasAllPerm", false);
        setBooleanField(term4012, term4012.getClass(), "staticPermissions", false);
        setField(term4012, term4012.getClass(), "key", null);
        setElement(term3991, 6, term4012);
        setField(term3990, term3990.getClass(), "context", term3991);
        setBooleanField(term3990, term3990.getClass(), "isPrivileged", false);
        setBooleanField(term3990, term3990.getClass(), "isAuthorized", true);
        setField(term4017, term4017.getClass(), "context", null);
        setBooleanField(term4017, term4017.getClass(), "isPrivileged", false);
        setBooleanField(term4017, term4017.getClass(), "isAuthorized", false);
        setField(term4017, term4017.getClass(), "privilegedContext", null);
        setField(term4017, term4017.getClass(), "combiner", null);
        setField(term4017, term4017.getClass(), "permissions", null);
        setField(term4017, term4017.getClass(), "parent", null);
        setBooleanField(term4017, term4017.getClass(), "isWrapped", false);
        setBooleanField(term4017, term4017.getClass(), "isLimited", false);
        setField(term4017, term4017.getClass(), "limitedContext", null);
        setField(term3990, term3990.getClass(), "privilegedContext", term4017);
        setField(term3990, term3990.getClass(), "combiner", null);
        setField(term3990, term3990.getClass(), "permissions", null);
        setField(term3990, term3990.getClass(), "parent", null);
        setBooleanField(term3990, term3990.getClass(), "isWrapped", false);
        setBooleanField(term3990, term3990.getClass(), "isLimited", false);
        setField(term3990, term3990.getClass(), "limitedContext", null);
        setField(term3971, term3971.getClass(), "acc", term3990);
        setBooleanField(term3971, term3971.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term3971, term3971.getClass(), "isPosted", false);
        setBooleanField(term3971, term3971.getClass(), "isSystemGenerated", false);
        setField(term3971, term3971.getClass(), "source", term4027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.StarFieldTextArea$CreditMouseListener");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term3971;
        callMethod(klass, "mouseClicked", argTypes, term3970, args);
    }

};


