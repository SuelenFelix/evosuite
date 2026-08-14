package net.byteseek.swing.treetable;

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
import static net.byteseek.swing.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TreeTableModel_TreeTableNavigateChildrenAction_actionPerformed_12863552421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4453;
     Object term4461;

    public TreeTableModel_TreeTableNavigateChildrenAction_actionPerformed_12863552421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4453 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableNavigateChildrenAction"));
        Object term4455 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term4456 = newInstance(Class.forName("java.lang.Object"));
        Object term4457 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term4459 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term4460 = newInstance(Class.forName("java.lang.Object"));
        setField(term4453, term4453.getClass(), "this$0", null);
        setBooleanField(term4453, term4453.getClass(), "enabled", false);
        setField(term4455, term4455.getClass(), "table", term4456);
        setField(term4453, term4453.getClass(), "arrayTable", term4455);
        setBooleanField(term4457, term4457.getClass(), "notifyOnEDT", true);
        setField(term4459, term4459.getClass(), "map", null);
        setField(term4457, term4457.getClass(), "map", term4459);
        setField(term4457, term4457.getClass(), "source", term4460);
        setField(term4453, term4453.getClass(), "changeSupport", term4457);
        term4461 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term4476 = (byte[]) newByteArray(8);
        Object term4487 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term4488 = (Object[]) newArray("java.security.ProtectionDomain", 0);
        Object term4491 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term4492 = (Object[]) newArray("java.security.ProtectionDomain", 0);
        Object term4495 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term4496 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term4499 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term4513 = newInstance(Class.forName("java.lang.Object"));
        setField(term4461, term4461.getClass(), "actionCommand", "LQFpaHEwXR");
        setLongField(term4461, term4461.getClass(), "when", 6375119433582206027L);
        setIntField(term4461, term4461.getClass(), "modifiers", 962840079);
        setByteElement(term4476, 0, (byte) -58);
        setByteElement(term4476, 1, (byte) -29);
        setByteElement(term4476, 2, (byte) -54);
        setByteElement(term4476, 3, (byte) -10);
        setByteElement(term4476, 4, (byte) 79);
        setByteElement(term4476, 5, (byte) -119);
        setByteElement(term4476, 6, (byte) -66);
        setByteElement(term4476, 7, (byte) 83);
        setField(term4461, term4461.getClass(), "bdata", term4476);
        setIntField(term4461, term4461.getClass(), "id", 1540719661);
        setBooleanField(term4461, term4461.getClass(), "consumed", true);
        setField(term4487, term4487.getClass(), "context", term4488);
        setBooleanField(term4487, term4487.getClass(), "isPrivileged", false);
        setBooleanField(term4487, term4487.getClass(), "isAuthorized", false);
        setField(term4491, term4491.getClass(), "context", term4492);
        setBooleanField(term4491, term4491.getClass(), "isPrivileged", true);
        setBooleanField(term4491, term4491.getClass(), "isAuthorized", true);
        setField(term4495, term4495.getClass(), "context", term4496);
        setBooleanField(term4495, term4495.getClass(), "isPrivileged", false);
        setBooleanField(term4495, term4495.getClass(), "isAuthorized", false);
        setField(term4499, term4499.getClass(), "context", null);
        setBooleanField(term4499, term4499.getClass(), "isPrivileged", false);
        setBooleanField(term4499, term4499.getClass(), "isAuthorized", false);
        setField(term4499, term4499.getClass(), "privilegedContext", null);
        setField(term4499, term4499.getClass(), "combiner", null);
        setField(term4499, term4499.getClass(), "permissions", null);
        setField(term4499, term4499.getClass(), "parent", null);
        setBooleanField(term4499, term4499.getClass(), "isWrapped", false);
        setBooleanField(term4499, term4499.getClass(), "isLimited", false);
        setField(term4499, term4499.getClass(), "limitedContext", null);
        setField(term4495, term4495.getClass(), "privilegedContext", term4499);
        setField(term4495, term4495.getClass(), "combiner", null);
        setField(term4495, term4495.getClass(), "permissions", null);
        setField(term4495, term4495.getClass(), "parent", null);
        setBooleanField(term4495, term4495.getClass(), "isWrapped", false);
        setBooleanField(term4495, term4495.getClass(), "isLimited", false);
        setField(term4495, term4495.getClass(), "limitedContext", null);
        setField(term4491, term4491.getClass(), "privilegedContext", term4495);
        setField(term4491, term4491.getClass(), "combiner", null);
        setField(term4491, term4491.getClass(), "permissions", null);
        setField(term4491, term4491.getClass(), "parent", null);
        setBooleanField(term4491, term4491.getClass(), "isWrapped", false);
        setBooleanField(term4491, term4491.getClass(), "isLimited", false);
        setField(term4491, term4491.getClass(), "limitedContext", null);
        setField(term4487, term4487.getClass(), "privilegedContext", term4491);
        setField(term4487, term4487.getClass(), "combiner", null);
        setField(term4487, term4487.getClass(), "permissions", null);
        setField(term4487, term4487.getClass(), "parent", null);
        setBooleanField(term4487, term4487.getClass(), "isWrapped", false);
        setBooleanField(term4487, term4487.getClass(), "isLimited", false);
        setField(term4487, term4487.getClass(), "limitedContext", null);
        setField(term4461, term4461.getClass(), "acc", term4487);
        setBooleanField(term4461, term4461.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term4461, term4461.getClass(), "isPosted", false);
        setBooleanField(term4461, term4461.getClass(), "isSystemGenerated", false);
        setField(term4461, term4461.getClass(), "source", term4513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableNavigateChildrenAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term4461;
        callMethod(klass, "actionPerformed", argTypes, term4453, args);
    }

};


