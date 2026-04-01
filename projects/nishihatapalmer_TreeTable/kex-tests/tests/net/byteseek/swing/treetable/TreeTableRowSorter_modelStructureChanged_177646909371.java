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

public class TreeTableRowSorter_modelStructureChanged_177646909371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105551;

    public TreeTableRowSorter_modelStructureChanged_177646909371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105551 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105551, term105551.getClass(), "model", null);
        setField(term105551, term105551.getClass(), "sortKeys", null);
        setField(term105551, term105551.getClass(), "defaultSortKeys", null);
        setField(term105551, term105551.getClass(), "unsortableColumns", null);
        setField(term105551, term105551.getClass(), "nodeComparator", null);
        setField(term105551, term105551.getClass(), "sortStrategy", null);
        setField(term105551, term105551.getClass(), "viewToModelIndex", null);
        setField(term105551, term105551.getClass(), "modelToViewIndex", null);
        setIntField(term105551, term105551.getClass(), "lastRowCount", 0);
        setBooleanField(term105551, term105551.getClass(), "rebuildIndices", false);
        setField(term105551, term105551.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "modelStructureChanged", argTypes, term105551, args);
    }

};


