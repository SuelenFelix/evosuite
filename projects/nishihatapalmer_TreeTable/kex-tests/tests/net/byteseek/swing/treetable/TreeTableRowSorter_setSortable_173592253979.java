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
import java.lang.Boolean;

public class TreeTableRowSorter_setSortable_173592253979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105595;
     Object term105598;
     Object term105600;

    public TreeTableRowSorter_setSortable_173592253979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105595 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105595, term105595.getClass(), "model", null);
        setField(term105595, term105595.getClass(), "sortKeys", null);
        setField(term105595, term105595.getClass(), "defaultSortKeys", null);
        setField(term105595, term105595.getClass(), "unsortableColumns", null);
        setField(term105595, term105595.getClass(), "nodeComparator", null);
        setField(term105595, term105595.getClass(), "sortStrategy", null);
        setField(term105595, term105595.getClass(), "viewToModelIndex", null);
        setField(term105595, term105595.getClass(), "modelToViewIndex", null);
        setIntField(term105595, term105595.getClass(), "lastRowCount", 0);
        setBooleanField(term105595, term105595.getClass(), "rebuildIndices", false);
        setField(term105595, term105595.getClass(), "listenerList", null);
        term105598 = new Integer(0);
        term105600 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term105598;
        args[1] = term105600;
        callMethod(klass, "setSortable", argTypes, term105595, args);
    }

};


