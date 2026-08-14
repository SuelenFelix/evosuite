package com.loomcom.symon;

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
import static com.loomcom.symon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Simulator_SetSpeedAction_actionPerformed_1456502271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73477;
     Object term73486;

    public Simulator_SetSpeedAction_actionPerformed_1456502271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73477 = newInstance(Class.forName("com.loomcom.symon.Simulator$SetSpeedAction"));
        Object term73480 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term73481 = newInstance(Class.forName("java.lang.Object"));
        Object term73482 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term73484 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term73485 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term73477, term73477.getClass(), "speed", 490271003);
        setField(term73477, term73477.getClass(), "this$0", null);
        setBooleanField(term73477, term73477.getClass(), "enabled", false);
        setField(term73480, term73480.getClass(), "table", term73481);
        setField(term73477, term73477.getClass(), "arrayTable", term73480);
        setBooleanField(term73482, term73482.getClass(), "notifyOnEDT", true);
        setField(term73484, term73484.getClass(), "map", null);
        setField(term73482, term73482.getClass(), "map", term73484);
        setField(term73482, term73482.getClass(), "source", term73485);
        setField(term73477, term73477.getClass(), "changeSupport", term73482);
        term73486 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term73501 = (byte[]) newByteArray(8);
        Object term73512 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term73513 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term73514 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term73515 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term73516 = (Object[]) newArray("java.security.Principal", 2);
        Object term73519 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term73522 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term73525 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term73528 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term73531 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term73536 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term73546 = newInstance(Class.forName("java.lang.Object"));
        setField(term73486, term73486.getClass(), "actionCommand", "bnsyeQXFdu");
        setLongField(term73486, term73486.getClass(), "when", -4855037955202452256L);
        setIntField(term73486, term73486.getClass(), "modifiers", 1541867826);
        setByteElement(term73501, 0, (byte) -15);
        setByteElement(term73501, 1, (byte) 36);
        setByteElement(term73501, 2, (byte) 118);
        setByteElement(term73501, 3, (byte) 106);
        setByteElement(term73501, 4, (byte) 98);
        setByteElement(term73501, 5, (byte) 67);
        setByteElement(term73501, 6, (byte) 66);
        setByteElement(term73501, 7, (byte) -121);
        setField(term73486, term73486.getClass(), "bdata", term73501);
        setIntField(term73486, term73486.getClass(), "id", -137176190);
        setBooleanField(term73486, term73486.getClass(), "consumed", true);
        setField(term73515, term73515.getClass(), "location", null);
        setField(term73515, term73515.getClass(), "signers", null);
        setField(term73515, term73515.getClass(), "certs", null);
        setField(term73515, term73515.getClass(), "sp", null);
        setField(term73515, term73515.getClass(), "factory", null);
        setField(term73515, term73515.getClass(), "locationNoFragString", null);
        setField(term73514, term73514.getClass(), "codesource", term73515);
        setField(term73514, term73514.getClass(), "classloader", null);
        setField(term73514, term73514.getClass(), "principals", term73516);
        setField(term73514, term73514.getClass(), "permissions", null);
        setBooleanField(term73514, term73514.getClass(), "hasAllPerm", false);
        setBooleanField(term73514, term73514.getClass(), "staticPermissions", false);
        setField(term73514, term73514.getClass(), "key", null);
        setElement(term73513, 0, term73514);
        setField(term73519, term73519.getClass(), "codesource", null);
        setField(term73519, term73519.getClass(), "classloader", null);
        setField(term73519, term73519.getClass(), "principals", null);
        setField(term73519, term73519.getClass(), "permissions", null);
        setBooleanField(term73519, term73519.getClass(), "hasAllPerm", false);
        setBooleanField(term73519, term73519.getClass(), "staticPermissions", false);
        setField(term73519, term73519.getClass(), "key", null);
        setElement(term73513, 1, term73519);
        setField(term73522, term73522.getClass(), "codesource", null);
        setField(term73522, term73522.getClass(), "classloader", null);
        setField(term73522, term73522.getClass(), "principals", null);
        setField(term73522, term73522.getClass(), "permissions", null);
        setBooleanField(term73522, term73522.getClass(), "hasAllPerm", false);
        setBooleanField(term73522, term73522.getClass(), "staticPermissions", false);
        setField(term73522, term73522.getClass(), "key", null);
        setElement(term73513, 2, term73522);
        setField(term73525, term73525.getClass(), "codesource", null);
        setField(term73525, term73525.getClass(), "classloader", null);
        setField(term73525, term73525.getClass(), "principals", null);
        setField(term73525, term73525.getClass(), "permissions", null);
        setBooleanField(term73525, term73525.getClass(), "hasAllPerm", false);
        setBooleanField(term73525, term73525.getClass(), "staticPermissions", false);
        setField(term73525, term73525.getClass(), "key", null);
        setElement(term73513, 3, term73525);
        setField(term73528, term73528.getClass(), "codesource", null);
        setField(term73528, term73528.getClass(), "classloader", null);
        setField(term73528, term73528.getClass(), "principals", null);
        setField(term73528, term73528.getClass(), "permissions", null);
        setBooleanField(term73528, term73528.getClass(), "hasAllPerm", false);
        setBooleanField(term73528, term73528.getClass(), "staticPermissions", false);
        setField(term73528, term73528.getClass(), "key", null);
        setElement(term73513, 4, term73528);
        setField(term73531, term73531.getClass(), "codesource", null);
        setField(term73531, term73531.getClass(), "classloader", null);
        setField(term73531, term73531.getClass(), "principals", null);
        setField(term73531, term73531.getClass(), "permissions", null);
        setBooleanField(term73531, term73531.getClass(), "hasAllPerm", false);
        setBooleanField(term73531, term73531.getClass(), "staticPermissions", false);
        setField(term73531, term73531.getClass(), "key", null);
        setElement(term73513, 5, term73531);
        setField(term73512, term73512.getClass(), "context", term73513);
        setBooleanField(term73512, term73512.getClass(), "isPrivileged", false);
        setBooleanField(term73512, term73512.getClass(), "isAuthorized", true);
        setField(term73536, term73536.getClass(), "context", null);
        setBooleanField(term73536, term73536.getClass(), "isPrivileged", false);
        setBooleanField(term73536, term73536.getClass(), "isAuthorized", false);
        setField(term73536, term73536.getClass(), "privilegedContext", null);
        setField(term73536, term73536.getClass(), "combiner", null);
        setField(term73536, term73536.getClass(), "permissions", null);
        setField(term73536, term73536.getClass(), "parent", null);
        setBooleanField(term73536, term73536.getClass(), "isWrapped", false);
        setBooleanField(term73536, term73536.getClass(), "isLimited", false);
        setField(term73536, term73536.getClass(), "limitedContext", null);
        setField(term73512, term73512.getClass(), "privilegedContext", term73536);
        setField(term73512, term73512.getClass(), "combiner", null);
        setField(term73512, term73512.getClass(), "permissions", null);
        setField(term73512, term73512.getClass(), "parent", null);
        setBooleanField(term73512, term73512.getClass(), "isWrapped", false);
        setBooleanField(term73512, term73512.getClass(), "isLimited", false);
        setField(term73512, term73512.getClass(), "limitedContext", null);
        setField(term73486, term73486.getClass(), "acc", term73512);
        setBooleanField(term73486, term73486.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term73486, term73486.getClass(), "isPosted", true);
        setBooleanField(term73486, term73486.getClass(), "isSystemGenerated", false);
        setField(term73486, term73486.getClass(), "source", term73546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$SetSpeedAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term73486;
        callMethod(klass, "actionPerformed", argTypes, term73477, args);
    }

};


