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
import java.lang.Boolean;

public class TreeTableRowSorter_setRebuildIndices_114284153598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105662;
     Object term105665;

    public TreeTableRowSorter_setRebuildIndices_114284153598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105662 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105662, term105662.getClass(), "model", null);
        setField(term105662, term105662.getClass(), "sortKeys", null);
        setField(term105662, term105662.getClass(), "defaultSortKeys", null);
        setField(term105662, term105662.getClass(), "unsortableColumns", null);
        setField(term105662, term105662.getClass(), "nodeComparator", null);
        setField(term105662, term105662.getClass(), "sortStrategy", null);
        setField(term105662, term105662.getClass(), "viewToModelIndex", null);
        setField(term105662, term105662.getClass(), "modelToViewIndex", null);
        setIntField(term105662, term105662.getClass(), "lastRowCount", 0);
        setBooleanField(term105662, term105662.getClass(), "rebuildIndices", false);
        setField(term105662, term105662.getClass(), "listenerList", null);
        term105665 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term105665;
        callMethod(klass, "setRebuildIndices", argTypes, term105662, args);
    }

};


