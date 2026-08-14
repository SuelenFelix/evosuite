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

public class TreeTableRowSorter_rowsUpdated_50941863775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105149;
     Object term105152;
     Object term105154;

    public TreeTableRowSorter_rowsUpdated_50941863775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105149 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105149, term105149.getClass(), "model", null);
        setField(term105149, term105149.getClass(), "sortKeys", null);
        setField(term105149, term105149.getClass(), "defaultSortKeys", null);
        setField(term105149, term105149.getClass(), "unsortableColumns", null);
        setField(term105149, term105149.getClass(), "nodeComparator", null);
        setField(term105149, term105149.getClass(), "sortStrategy", null);
        setField(term105149, term105149.getClass(), "viewToModelIndex", null);
        setField(term105149, term105149.getClass(), "modelToViewIndex", null);
        setIntField(term105149, term105149.getClass(), "lastRowCount", 0);
        setBooleanField(term105149, term105149.getClass(), "rebuildIndices", false);
        setField(term105149, term105149.getClass(), "listenerList", null);
        term105152 = new Integer(0);
        term105154 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term105152;
        args[1] = term105154;
        callMethod(klass, "rowsUpdated", argTypes, term105149, args);
    }

};


