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

public class TreeTableRowSorter_setAllColumnsSortable_74233770380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105180;

    public TreeTableRowSorter_setAllColumnsSortable_74233770380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105180 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105180, term105180.getClass(), "model", null);
        setField(term105180, term105180.getClass(), "sortKeys", null);
        setField(term105180, term105180.getClass(), "defaultSortKeys", null);
        setField(term105180, term105180.getClass(), "unsortableColumns", null);
        setField(term105180, term105180.getClass(), "nodeComparator", null);
        setField(term105180, term105180.getClass(), "sortStrategy", null);
        setField(term105180, term105180.getClass(), "viewToModelIndex", null);
        setField(term105180, term105180.getClass(), "modelToViewIndex", null);
        setIntField(term105180, term105180.getClass(), "lastRowCount", 0);
        setBooleanField(term105180, term105180.getClass(), "rebuildIndices", false);
        setField(term105180, term105180.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setAllColumnsSortable", argTypes, term105180, args);
    }

};


