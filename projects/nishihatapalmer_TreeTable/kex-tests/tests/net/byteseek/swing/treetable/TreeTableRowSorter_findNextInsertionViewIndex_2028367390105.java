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
     Object term105697;
     Object term105700;
     Object term105702;

    public TreeTableRowSorter_findNextInsertionViewIndex_2028367390105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105697 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105697, term105697.getClass(), "model", null);
        setField(term105697, term105697.getClass(), "sortKeys", null);
        setField(term105697, term105697.getClass(), "defaultSortKeys", null);
        setField(term105697, term105697.getClass(), "unsortableColumns", null);
        setField(term105697, term105697.getClass(), "nodeComparator", null);
        setField(term105697, term105697.getClass(), "sortStrategy", null);
        setField(term105697, term105697.getClass(), "viewToModelIndex", null);
        setField(term105697, term105697.getClass(), "modelToViewIndex", null);
        setIntField(term105697, term105697.getClass(), "lastRowCount", 0);
        setBooleanField(term105697, term105697.getClass(), "rebuildIndices", false);
        setField(term105697, term105697.getClass(), "listenerList", null);
        term105700 = new Integer(0);
        term105702 = new Integer(0);
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
        args[1] = term105700;
        args[2] = term105702;
        callMethod(klass, "findNextInsertionViewIndex", argTypes, term105697, args);
    }

};


