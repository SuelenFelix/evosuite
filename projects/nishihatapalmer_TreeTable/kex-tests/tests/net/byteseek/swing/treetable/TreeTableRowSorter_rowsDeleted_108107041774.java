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

public class TreeTableRowSorter_rowsDeleted_108107041774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105142;
     Object term105145;
     Object term105147;

    public TreeTableRowSorter_rowsDeleted_108107041774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105142 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105142, term105142.getClass(), "model", null);
        setField(term105142, term105142.getClass(), "sortKeys", null);
        setField(term105142, term105142.getClass(), "defaultSortKeys", null);
        setField(term105142, term105142.getClass(), "unsortableColumns", null);
        setField(term105142, term105142.getClass(), "nodeComparator", null);
        setField(term105142, term105142.getClass(), "sortStrategy", null);
        setField(term105142, term105142.getClass(), "viewToModelIndex", null);
        setField(term105142, term105142.getClass(), "modelToViewIndex", null);
        setIntField(term105142, term105142.getClass(), "lastRowCount", 0);
        setBooleanField(term105142, term105142.getClass(), "rebuildIndices", false);
        setField(term105142, term105142.getClass(), "listenerList", null);
        term105145 = new Integer(0);
        term105147 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term105145;
        args[1] = term105147;
        callMethod(klass, "rowsDeleted", argTypes, term105142, args);
    }

};


