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

public class TreeTableRowSorter_rowsUpdated_50757159576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105156;
     Object term105159;
     Object term105161;
     Object term105163;

    public TreeTableRowSorter_rowsUpdated_50757159576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105156 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105156, term105156.getClass(), "model", null);
        setField(term105156, term105156.getClass(), "sortKeys", null);
        setField(term105156, term105156.getClass(), "defaultSortKeys", null);
        setField(term105156, term105156.getClass(), "unsortableColumns", null);
        setField(term105156, term105156.getClass(), "nodeComparator", null);
        setField(term105156, term105156.getClass(), "sortStrategy", null);
        setField(term105156, term105156.getClass(), "viewToModelIndex", null);
        setField(term105156, term105156.getClass(), "modelToViewIndex", null);
        setIntField(term105156, term105156.getClass(), "lastRowCount", 0);
        setBooleanField(term105156, term105156.getClass(), "rebuildIndices", false);
        setField(term105156, term105156.getClass(), "listenerList", null);
        term105159 = new Integer(0);
        term105161 = new Integer(0);
        term105163 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term105159;
        args[1] = term105161;
        args[2] = term105163;
        callMethod(klass, "rowsUpdated", argTypes, term105156, args);
    }

};


