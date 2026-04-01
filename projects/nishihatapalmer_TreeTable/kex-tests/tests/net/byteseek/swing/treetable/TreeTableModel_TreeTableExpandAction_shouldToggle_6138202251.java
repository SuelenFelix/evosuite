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

public class TreeTableModel_TreeTableExpandAction_shouldToggle_6138202251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2673;

    public TreeTableModel_TreeTableExpandAction_shouldToggle_6138202251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2673 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableExpandAction"));
        Object term2675 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term2676 = newInstance(Class.forName("java.lang.Object"));
        Object term2677 = newInstance(Class.forName("javax.swing.event.SwingPropertyChangeSupport"));
        Object term2679 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2680 = newInstance(Class.forName("java.lang.Object"));
        setField(term2673, term2673.getClass(), "this$0", null);
        setBooleanField(term2673, term2673.getClass(), "enabled", true);
        setField(term2675, term2675.getClass(), "table", term2676);
        setField(term2673, term2673.getClass(), "arrayTable", term2675);
        setBooleanField(term2677, term2677.getClass(), "notifyOnEDT", true);
        setField(term2679, term2679.getClass(), "map", null);
        setField(term2677, term2677.getClass(), "map", term2679);
        setField(term2677, term2677.getClass(), "source", term2680);
        setField(term2673, term2673.getClass(), "changeSupport", term2677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel$TreeTableExpandAction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "shouldToggle", argTypes, term2673, args);
    }

};


