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

public class TreeTableRowSorter_checkValidIndex_85143621116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105764;
     Object term105767;
     Object term105769;

    public TreeTableRowSorter_checkValidIndex_85143621116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105764 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105764, term105764.getClass(), "model", null);
        setField(term105764, term105764.getClass(), "sortKeys", null);
        setField(term105764, term105764.getClass(), "defaultSortKeys", null);
        setField(term105764, term105764.getClass(), "unsortableColumns", null);
        setField(term105764, term105764.getClass(), "nodeComparator", null);
        setField(term105764, term105764.getClass(), "sortStrategy", null);
        setField(term105764, term105764.getClass(), "viewToModelIndex", null);
        setField(term105764, term105764.getClass(), "modelToViewIndex", null);
        setIntField(term105764, term105764.getClass(), "lastRowCount", 0);
        setBooleanField(term105764, term105764.getClass(), "rebuildIndices", false);
        setField(term105764, term105764.getClass(), "listenerList", null);
        term105767 = new Integer(0);
        term105769 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term105767;
        args[1] = term105769;
        callMethod(klass, "checkValidIndex", argTypes, term105764, args);
    }

};


