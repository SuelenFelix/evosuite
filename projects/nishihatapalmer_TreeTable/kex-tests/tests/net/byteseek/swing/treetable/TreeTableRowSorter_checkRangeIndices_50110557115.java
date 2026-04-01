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

public class TreeTableRowSorter_checkRangeIndices_50110557115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105757;
     Object term105760;
     Object term105762;

    public TreeTableRowSorter_checkRangeIndices_50110557115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105757 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105757, term105757.getClass(), "model", null);
        setField(term105757, term105757.getClass(), "sortKeys", null);
        setField(term105757, term105757.getClass(), "defaultSortKeys", null);
        setField(term105757, term105757.getClass(), "unsortableColumns", null);
        setField(term105757, term105757.getClass(), "nodeComparator", null);
        setField(term105757, term105757.getClass(), "sortStrategy", null);
        setField(term105757, term105757.getClass(), "viewToModelIndex", null);
        setField(term105757, term105757.getClass(), "modelToViewIndex", null);
        setIntField(term105757, term105757.getClass(), "lastRowCount", 0);
        setBooleanField(term105757, term105757.getClass(), "rebuildIndices", false);
        setField(term105757, term105757.getClass(), "listenerList", null);
        term105760 = new Integer(0);
        term105762 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term105760;
        args[1] = term105762;
        callMethod(klass, "checkRangeIndices", argTypes, term105757, args);
    }

};


