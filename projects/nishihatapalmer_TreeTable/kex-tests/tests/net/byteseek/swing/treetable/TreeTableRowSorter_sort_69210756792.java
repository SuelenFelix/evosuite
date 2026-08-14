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

public class TreeTableRowSorter_sort_69210756792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105220;

    public TreeTableRowSorter_sort_69210756792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105220 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105220, term105220.getClass(), "model", null);
        setField(term105220, term105220.getClass(), "sortKeys", null);
        setField(term105220, term105220.getClass(), "defaultSortKeys", null);
        setField(term105220, term105220.getClass(), "unsortableColumns", null);
        setField(term105220, term105220.getClass(), "nodeComparator", null);
        setField(term105220, term105220.getClass(), "sortStrategy", null);
        setField(term105220, term105220.getClass(), "viewToModelIndex", null);
        setField(term105220, term105220.getClass(), "modelToViewIndex", null);
        setIntField(term105220, term105220.getClass(), "lastRowCount", 0);
        setBooleanField(term105220, term105220.getClass(), "rebuildIndices", false);
        setField(term105220, term105220.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sort", argTypes, term105220, args);
    }

};


