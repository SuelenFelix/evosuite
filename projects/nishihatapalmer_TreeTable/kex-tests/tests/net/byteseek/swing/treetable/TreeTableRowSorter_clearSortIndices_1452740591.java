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

public class TreeTableRowSorter_clearSortIndices_1452740591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105639;

    public TreeTableRowSorter_clearSortIndices_1452740591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105639 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105639, term105639.getClass(), "model", null);
        setField(term105639, term105639.getClass(), "sortKeys", null);
        setField(term105639, term105639.getClass(), "defaultSortKeys", null);
        setField(term105639, term105639.getClass(), "unsortableColumns", null);
        setField(term105639, term105639.getClass(), "nodeComparator", null);
        setField(term105639, term105639.getClass(), "sortStrategy", null);
        setField(term105639, term105639.getClass(), "viewToModelIndex", null);
        setField(term105639, term105639.getClass(), "modelToViewIndex", null);
        setIntField(term105639, term105639.getClass(), "lastRowCount", 0);
        setBooleanField(term105639, term105639.getClass(), "rebuildIndices", false);
        setField(term105639, term105639.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearSortIndices", argTypes, term105639, args);
    }

};


