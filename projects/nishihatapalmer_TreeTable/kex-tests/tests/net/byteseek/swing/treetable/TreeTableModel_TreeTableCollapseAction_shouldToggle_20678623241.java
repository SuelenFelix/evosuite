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

public class TreeTableModel_TreeTableCollapseAction_shouldToggle_20678623241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2663;

    public TreeTableModel_TreeTableCollapseAction_shouldToggle_20678623241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2663 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableCollapseAction"));
        Object term2665 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term2666 = newInstance(Class.forName("java.lang.Object"));
        Object term2667 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term2669 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2670 = newInstance(Class.forName("java.lang.Object"));
        setField(term2663, term2663.getClass(), "this$0", null);
        setBooleanField(term2663, term2663.getClass(), "enabled", false);
        setField(term2665, term2665.getClass(), "table", term2666);
        setField(term2663, term2663.getClass(), "arrayTable", term2665);
        setBooleanField(term2667, term2667.getClass(), "notifyOnEDT", true);
        setField(term2669, term2669.getClass(), "map", null);
        setField(term2667, term2667.getClass(), "map", term2669);
        setField(term2667, term2667.getClass(), "source", term2670);
        setField(term2663, term2663.getClass(), "changeSupport", term2667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableCollapseAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "shouldToggle", argTypes, term2663, args);
    }

};


