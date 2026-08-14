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

public class TreeTableRowSorter_setSortKeys_138133034566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105114;

    public TreeTableRowSorter_setSortKeys_138133034566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105114 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105114, term105114.getClass(), "model", null);
        setField(term105114, term105114.getClass(), "sortKeys", null);
        setField(term105114, term105114.getClass(), "defaultSortKeys", null);
        setField(term105114, term105114.getClass(), "unsortableColumns", null);
        setField(term105114, term105114.getClass(), "nodeComparator", null);
        setField(term105114, term105114.getClass(), "sortStrategy", null);
        setField(term105114, term105114.getClass(), "viewToModelIndex", null);
        setField(term105114, term105114.getClass(), "modelToViewIndex", null);
        setIntField(term105114, term105114.getClass(), "lastRowCount", 0);
        setBooleanField(term105114, term105114.getClass(), "rebuildIndices", false);
        setField(term105114, term105114.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSortKeys", argTypes, term105114, args);
    }

};


