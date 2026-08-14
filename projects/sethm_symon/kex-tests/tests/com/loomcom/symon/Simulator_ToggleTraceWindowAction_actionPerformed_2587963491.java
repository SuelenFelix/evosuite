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

public class Simulator_ToggleTraceWindowAction_actionPerformed_2587963491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35730;
     Object term35738;

    public Simulator_ToggleTraceWindowAction_actionPerformed_2587963491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35730 = newInstance(Class.forName("com.loomcom.symon.Simulator$ToggleTraceWindowAction"));
        Object term35732 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term35733 = newInstance(Class.forName("java.lang.Object"));
        Object term35734 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term35736 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term35737 = newInstance(Class.forName("java.lang.Object"));
        setField(term35730, term35730.getClass(), "this$0", null);
        setBooleanField(term35730, term35730.getClass(), "enabled", false);
        setField(term35732, term35732.getClass(), "table", term35733);
        setField(term35730, term35730.getClass(), "arrayTable", term35732);
        setBooleanField(term35734, term35734.getClass(), "notifyOnEDT", true);
        setField(term35736, term35736.getClass(), "map", null);
        setField(term35734, term35734.getClass(), "map", term35736);
        setField(term35734, term35734.getClass(), "source", term35737);
        setField(term35730, term35730.getClass(), "changeSupport", term35734);
        term35738 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term35753 = (byte[]) newByteArray(2);
        Object term35758 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term35759 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term35760 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term35761 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term35762 = (Object[]) newArray("java.security.Principal", 7);
        Object term35765 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term35768 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term35771 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term35774 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term35777 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term35782 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term35792 = newInstance(Class.forName("java.lang.Object"));
        setField(term35738, term35738.getClass(), "actionCommand", "fWKJoSoCwE");
        setLongField(term35738, term35738.getClass(), "when", -7278883608542636188L);
        setIntField(term35738, term35738.getClass(), "modifiers", 12581312);
        setByteElement(term35753, 0, (byte) 67);
        setByteElement(term35753, 1, (byte) 78);
        setField(term35738, term35738.getClass(), "bdata", term35753);
        setIntField(term35738, term35738.getClass(), "id", 2087383644);
        setBooleanField(term35738, term35738.getClass(), "consumed", false);
        setField(term35761, term35761.getClass(), "location", null);
        setField(term35761, term35761.getClass(), "signers", null);
        setField(term35761, term35761.getClass(), "certs", null);
        setField(term35761, term35761.getClass(), "sp", null);
        setField(term35761, term35761.getClass(), "factory", null);
        setField(term35761, term35761.getClass(), "locationNoFragString", null);
        setField(term35760, term35760.getClass(), "codesource", term35761);
        setField(term35760, term35760.getClass(), "classloader", null);
        setField(term35760, term35760.getClass(), "principals", term35762);
        setField(term35760, term35760.getClass(), "permissions", null);
        setBooleanField(term35760, term35760.getClass(), "hasAllPerm", false);
        setBooleanField(term35760, term35760.getClass(), "staticPermissions", false);
        setField(term35760, term35760.getClass(), "key", null);
        setElement(term35759, 0, term35760);
        setField(term35765, term35765.getClass(), "codesource", null);
        setField(term35765, term35765.getClass(), "classloader", null);
        setField(term35765, term35765.getClass(), "principals", null);
        setField(term35765, term35765.getClass(), "permissions", null);
        setBooleanField(term35765, term35765.getClass(), "hasAllPerm", false);
        setBooleanField(term35765, term35765.getClass(), "staticPermissions", false);
        setField(term35765, term35765.getClass(), "key", null);
        setElement(term35759, 1, term35765);
        setField(term35768, term35768.getClass(), "codesource", null);
        setField(term35768, term35768.getClass(), "classloader", null);
        setField(term35768, term35768.getClass(), "principals", null);
        setField(term35768, term35768.getClass(), "permissions", null);
        setBooleanField(term35768, term35768.getClass(), "hasAllPerm", false);
        setBooleanField(term35768, term35768.getClass(), "staticPermissions", false);
        setField(term35768, term35768.getClass(), "key", null);
        setElement(term35759, 2, term35768);
        setField(term35771, term35771.getClass(), "codesource", null);
        setField(term35771, term35771.getClass(), "classloader", null);
        setField(term35771, term35771.getClass(), "principals", null);
        setField(term35771, term35771.getClass(), "permissions", null);
        setBooleanField(term35771, term35771.getClass(), "hasAllPerm", false);
        setBooleanField(term35771, term35771.getClass(), "staticPermissions", false);
        setField(term35771, term35771.getClass(), "key", null);
        setElement(term35759, 3, term35771);
        setField(term35774, term35774.getClass(), "codesource", null);
        setField(term35774, term35774.getClass(), "classloader", null);
        setField(term35774, term35774.getClass(), "principals", null);
        setField(term35774, term35774.getClass(), "permissions", null);
        setBooleanField(term35774, term35774.getClass(), "hasAllPerm", false);
        setBooleanField(term35774, term35774.getClass(), "staticPermissions", false);
        setField(term35774, term35774.getClass(), "key", null);
        setElement(term35759, 4, term35774);
        setField(term35777, term35777.getClass(), "codesource", null);
        setField(term35777, term35777.getClass(), "classloader", null);
        setField(term35777, term35777.getClass(), "principals", null);
        setField(term35777, term35777.getClass(), "permissions", null);
        setBooleanField(term35777, term35777.getClass(), "hasAllPerm", false);
        setBooleanField(term35777, term35777.getClass(), "staticPermissions", false);
        setField(term35777, term35777.getClass(), "key", null);
        setElement(term35759, 5, term35777);
        setField(term35758, term35758.getClass(), "context", term35759);
        setBooleanField(term35758, term35758.getClass(), "isPrivileged", false);
        setBooleanField(term35758, term35758.getClass(), "isAuthorized", false);
        setField(term35782, term35782.getClass(), "context", null);
        setBooleanField(term35782, term35782.getClass(), "isPrivileged", false);
        setBooleanField(term35782, term35782.getClass(), "isAuthorized", false);
        setField(term35782, term35782.getClass(), "privilegedContext", null);
        setField(term35782, term35782.getClass(), "combiner", null);
        setField(term35782, term35782.getClass(), "permissions", null);
        setField(term35782, term35782.getClass(), "parent", null);
        setBooleanField(term35782, term35782.getClass(), "isWrapped", false);
        setBooleanField(term35782, term35782.getClass(), "isLimited", false);
        setField(term35782, term35782.getClass(), "limitedContext", null);
        setField(term35758, term35758.getClass(), "privilegedContext", term35782);
        setField(term35758, term35758.getClass(), "combiner", null);
        setField(term35758, term35758.getClass(), "permissions", null);
        setField(term35758, term35758.getClass(), "parent", null);
        setBooleanField(term35758, term35758.getClass(), "isWrapped", false);
        setBooleanField(term35758, term35758.getClass(), "isLimited", false);
        setField(term35758, term35758.getClass(), "limitedContext", null);
        setField(term35738, term35738.getClass(), "acc", term35758);
        setBooleanField(term35738, term35738.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term35738, term35738.getClass(), "isPosted", false);
        setBooleanField(term35738, term35738.getClass(), "isSystemGenerated", true);
        setField(term35738, term35738.getClass(), "source", term35792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$ToggleTraceWindowAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term35738;
        callMethod(klass, "actionPerformed", argTypes, term35730, args);
    }

};


