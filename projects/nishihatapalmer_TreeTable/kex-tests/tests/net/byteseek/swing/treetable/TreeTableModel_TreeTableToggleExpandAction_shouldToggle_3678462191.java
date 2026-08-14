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

public class TreeTableModel_TreeTableToggleExpandAction_shouldToggle_3678462191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58;

    public TreeTableModel_TreeTableToggleExpandAction_shouldToggle_3678462191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableToggleExpandAction"));
        Object term60 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term61 = newInstance(Class.forName("java.lang.Object"));
        Object term62 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term64 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term65 = newInstance(Class.forName("java.lang.Object"));
        setField(term58, term58.getClass(), "this$0", null);
        setBooleanField(term58, term58.getClass(), "enabled", true);
        setField(term60, term60.getClass(), "table", term61);
        setField(term58, term58.getClass(), "arrayTable", term60);
        setBooleanField(term62, term62.getClass(), "notifyOnEDT", false);
        setField(term64, term64.getClass(), "map", null);
        setField(term62, term62.getClass(), "map", term64);
        setField(term62, term62.getClass(), "source", term65);
        setField(term58, term58.getClass(), "changeSupport", term62);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableToggleExpandAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "shouldToggle", argTypes, term58, args);
    }

};


