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

public class TreeTableRowSorter_removeSortIndices_653978390102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105258;
     Object term105261;
     Object term105263;

    public TreeTableRowSorter_removeSortIndices_653978390102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105258 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105258, term105258.getClass(), "model", null);
        setField(term105258, term105258.getClass(), "sortKeys", null);
        setField(term105258, term105258.getClass(), "defaultSortKeys", null);
        setField(term105258, term105258.getClass(), "unsortableColumns", null);
        setField(term105258, term105258.getClass(), "nodeComparator", null);
        setField(term105258, term105258.getClass(), "sortStrategy", null);
        setField(term105258, term105258.getClass(), "viewToModelIndex", null);
        setField(term105258, term105258.getClass(), "modelToViewIndex", null);
        setIntField(term105258, term105258.getClass(), "lastRowCount", 0);
        setBooleanField(term105258, term105258.getClass(), "rebuildIndices", false);
        setField(term105258, term105258.getClass(), "listenerList", null);
        term105261 = new Integer(0);
        term105263 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term105261;
        args[1] = term105263;
        callMethod(klass, "removeSortIndices", argTypes, term105258, args);
    }

};


