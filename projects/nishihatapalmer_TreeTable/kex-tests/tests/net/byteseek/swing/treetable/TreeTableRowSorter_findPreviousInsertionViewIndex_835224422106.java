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
import java.lang.Integer;

public class TreeTableRowSorter_findPreviousInsertionViewIndex_835224422106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105282;
     Object term105285;
     Object term105287;

    public TreeTableRowSorter_findPreviousInsertionViewIndex_835224422106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105282 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105282, term105282.getClass(), "model", null);
        setField(term105282, term105282.getClass(), "sortKeys", null);
        setField(term105282, term105282.getClass(), "defaultSortKeys", null);
        setField(term105282, term105282.getClass(), "unsortableColumns", null);
        setField(term105282, term105282.getClass(), "nodeComparator", null);
        setField(term105282, term105282.getClass(), "sortStrategy", null);
        setField(term105282, term105282.getClass(), "viewToModelIndex", null);
        setField(term105282, term105282.getClass(), "modelToViewIndex", null);
        setIntField(term105282, term105282.getClass(), "lastRowCount", 0);
        setBooleanField(term105282, term105282.getClass(), "rebuildIndices", false);
        setField(term105282, term105282.getClass(), "listenerList", null);
        term105285 = new Integer(0);
        term105287 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term105285;
        args[2] = term105287;
        callMethod(klass, "findPreviousInsertionViewIndex", argTypes, term105282, args);
    }

};


