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

public class TreeTableRowSorter_findNextInsertionViewIndex_2028367390105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105275;
     Object term105278;
     Object term105280;

    public TreeTableRowSorter_findNextInsertionViewIndex_2028367390105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105275 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105275, term105275.getClass(), "model", null);
        setField(term105275, term105275.getClass(), "sortKeys", null);
        setField(term105275, term105275.getClass(), "defaultSortKeys", null);
        setField(term105275, term105275.getClass(), "unsortableColumns", null);
        setField(term105275, term105275.getClass(), "nodeComparator", null);
        setField(term105275, term105275.getClass(), "sortStrategy", null);
        setField(term105275, term105275.getClass(), "viewToModelIndex", null);
        setField(term105275, term105275.getClass(), "modelToViewIndex", null);
        setIntField(term105275, term105275.getClass(), "lastRowCount", 0);
        setBooleanField(term105275, term105275.getClass(), "rebuildIndices", false);
        setField(term105275, term105275.getClass(), "listenerList", null);
        term105278 = new Integer(0);
        term105280 = new Integer(0);
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
        args[1] = term105278;
        args[2] = term105280;
        callMethod(klass, "findNextInsertionViewIndex", argTypes, term105275, args);
    }

};


