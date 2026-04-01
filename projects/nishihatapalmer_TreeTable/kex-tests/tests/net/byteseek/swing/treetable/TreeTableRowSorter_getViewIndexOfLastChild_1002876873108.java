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

public class TreeTableRowSorter_getViewIndexOfLastChild_1002876873108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105718;
     Object term105721;

    public TreeTableRowSorter_getViewIndexOfLastChild_1002876873108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105718 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105718, term105718.getClass(), "model", null);
        setField(term105718, term105718.getClass(), "sortKeys", null);
        setField(term105718, term105718.getClass(), "defaultSortKeys", null);
        setField(term105718, term105718.getClass(), "unsortableColumns", null);
        setField(term105718, term105718.getClass(), "nodeComparator", null);
        setField(term105718, term105718.getClass(), "sortStrategy", null);
        setField(term105718, term105718.getClass(), "viewToModelIndex", null);
        setField(term105718, term105718.getClass(), "modelToViewIndex", null);
        setIntField(term105718, term105718.getClass(), "lastRowCount", 0);
        setBooleanField(term105718, term105718.getClass(), "rebuildIndices", false);
        setField(term105718, term105718.getClass(), "listenerList", null);
        term105721 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term105721;
        callMethod(klass, "getViewIndexOfLastChild", argTypes, term105718, args);
    }

};


