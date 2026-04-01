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

public class TreeTableRowSorter_removeSortedRowsFromIndices_1681897228111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105733;
     Object term105736;
     Object term105738;

    public TreeTableRowSorter_removeSortedRowsFromIndices_1681897228111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105733 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105733, term105733.getClass(), "model", null);
        setField(term105733, term105733.getClass(), "sortKeys", null);
        setField(term105733, term105733.getClass(), "defaultSortKeys", null);
        setField(term105733, term105733.getClass(), "unsortableColumns", null);
        setField(term105733, term105733.getClass(), "nodeComparator", null);
        setField(term105733, term105733.getClass(), "sortStrategy", null);
        setField(term105733, term105733.getClass(), "viewToModelIndex", null);
        setField(term105733, term105733.getClass(), "modelToViewIndex", null);
        setIntField(term105733, term105733.getClass(), "lastRowCount", 0);
        setBooleanField(term105733, term105733.getClass(), "rebuildIndices", false);
        setField(term105733, term105733.getClass(), "listenerList", null);
        term105736 = new Integer(0);
        term105738 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term105736;
        args[1] = term105738;
        callMethod(klass, "removeSortedRowsFromIndices", argTypes, term105733, args);
    }

};


