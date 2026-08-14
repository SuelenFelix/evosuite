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

public class TreeTableRowSorter_ensureIndicesHaveSpaceForIncrease_1539379977112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105318;
     Object term105321;

    public TreeTableRowSorter_ensureIndicesHaveSpaceForIncrease_1539379977112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105318 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105318, term105318.getClass(), "model", null);
        setField(term105318, term105318.getClass(), "sortKeys", null);
        setField(term105318, term105318.getClass(), "defaultSortKeys", null);
        setField(term105318, term105318.getClass(), "unsortableColumns", null);
        setField(term105318, term105318.getClass(), "nodeComparator", null);
        setField(term105318, term105318.getClass(), "sortStrategy", null);
        setField(term105318, term105318.getClass(), "viewToModelIndex", null);
        setField(term105318, term105318.getClass(), "modelToViewIndex", null);
        setIntField(term105318, term105318.getClass(), "lastRowCount", 0);
        setBooleanField(term105318, term105318.getClass(), "rebuildIndices", false);
        setField(term105318, term105318.getClass(), "listenerList", null);
        term105321 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term105321;
        callMethod(klass, "ensureIndicesHaveSpaceForIncrease", argTypes, term105318, args);
    }

};


