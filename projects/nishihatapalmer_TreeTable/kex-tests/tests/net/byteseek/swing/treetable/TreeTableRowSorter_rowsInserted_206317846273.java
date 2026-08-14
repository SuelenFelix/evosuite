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

public class TreeTableRowSorter_rowsInserted_206317846273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105135;
     Object term105138;
     Object term105140;

    public TreeTableRowSorter_rowsInserted_206317846273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105135 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105135, term105135.getClass(), "model", null);
        setField(term105135, term105135.getClass(), "sortKeys", null);
        setField(term105135, term105135.getClass(), "defaultSortKeys", null);
        setField(term105135, term105135.getClass(), "unsortableColumns", null);
        setField(term105135, term105135.getClass(), "nodeComparator", null);
        setField(term105135, term105135.getClass(), "sortStrategy", null);
        setField(term105135, term105135.getClass(), "viewToModelIndex", null);
        setField(term105135, term105135.getClass(), "modelToViewIndex", null);
        setIntField(term105135, term105135.getClass(), "lastRowCount", 0);
        setBooleanField(term105135, term105135.getClass(), "rebuildIndices", false);
        setField(term105135, term105135.getClass(), "listenerList", null);
        term105138 = new Integer(0);
        term105140 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term105138;
        args[1] = term105140;
        callMethod(klass, "rowsInserted", argTypes, term105135, args);
    }

};


