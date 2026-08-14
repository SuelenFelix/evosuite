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

public class TreeTableRowSorter_restoreSelectedRows_458197291101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105255;

    public TreeTableRowSorter_restoreSelectedRows_458197291101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105255 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105255, term105255.getClass(), "model", null);
        setField(term105255, term105255.getClass(), "sortKeys", null);
        setField(term105255, term105255.getClass(), "defaultSortKeys", null);
        setField(term105255, term105255.getClass(), "unsortableColumns", null);
        setField(term105255, term105255.getClass(), "nodeComparator", null);
        setField(term105255, term105255.getClass(), "sortStrategy", null);
        setField(term105255, term105255.getClass(), "viewToModelIndex", null);
        setField(term105255, term105255.getClass(), "modelToViewIndex", null);
        setIntField(term105255, term105255.getClass(), "lastRowCount", 0);
        setBooleanField(term105255, term105255.getClass(), "rebuildIndices", false);
        setField(term105255, term105255.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "restoreSelectedRows", argTypes, term105255, args);
    }

};


