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

public class TreeTableRowSorter_checkInsertionPoint_84919386117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105349;
     Object term105352;
     Object term105354;

    public TreeTableRowSorter_checkInsertionPoint_84919386117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105349 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105349, term105349.getClass(), "model", null);
        setField(term105349, term105349.getClass(), "sortKeys", null);
        setField(term105349, term105349.getClass(), "defaultSortKeys", null);
        setField(term105349, term105349.getClass(), "unsortableColumns", null);
        setField(term105349, term105349.getClass(), "nodeComparator", null);
        setField(term105349, term105349.getClass(), "sortStrategy", null);
        setField(term105349, term105349.getClass(), "viewToModelIndex", null);
        setField(term105349, term105349.getClass(), "modelToViewIndex", null);
        setIntField(term105349, term105349.getClass(), "lastRowCount", 0);
        setBooleanField(term105349, term105349.getClass(), "rebuildIndices", false);
        setField(term105349, term105349.getClass(), "listenerList", null);
        term105352 = new Integer(0);
        term105354 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term105352;
        args[1] = term105354;
        callMethod(klass, "checkInsertionPoint", argTypes, term105349, args);
    }

};


