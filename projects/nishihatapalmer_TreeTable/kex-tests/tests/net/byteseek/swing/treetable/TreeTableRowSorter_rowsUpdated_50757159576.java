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
     Object term105578;
     Object term105581;
     Object term105583;
     Object term105585;

    public TreeTableRowSorter_rowsUpdated_50757159576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105578 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105578, term105578.getClass(), "model", null);
        setField(term105578, term105578.getClass(), "sortKeys", null);
        setField(term105578, term105578.getClass(), "defaultSortKeys", null);
        setField(term105578, term105578.getClass(), "unsortableColumns", null);
        setField(term105578, term105578.getClass(), "nodeComparator", null);
        setField(term105578, term105578.getClass(), "sortStrategy", null);
        setField(term105578, term105578.getClass(), "viewToModelIndex", null);
        setField(term105578, term105578.getClass(), "modelToViewIndex", null);
        setIntField(term105578, term105578.getClass(), "lastRowCount", 0);
        setBooleanField(term105578, term105578.getClass(), "rebuildIndices", false);
        setField(term105578, term105578.getClass(), "listenerList", null);
        term105581 = new Integer(0);
        term105583 = new Integer(0);
        term105585 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term105581;
        args[1] = term105583;
        args[2] = term105585;
        callMethod(klass, "rowsUpdated", argTypes, term105578, args);
    }

};


