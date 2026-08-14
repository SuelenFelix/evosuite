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

public class TreeTableRowSorter_getFilteredChildIndex_714939584109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105301;

    public TreeTableRowSorter_getFilteredChildIndex_714939584109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105301 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105301, term105301.getClass(), "model", null);
        setField(term105301, term105301.getClass(), "sortKeys", null);
        setField(term105301, term105301.getClass(), "defaultSortKeys", null);
        setField(term105301, term105301.getClass(), "unsortableColumns", null);
        setField(term105301, term105301.getClass(), "nodeComparator", null);
        setField(term105301, term105301.getClass(), "sortStrategy", null);
        setField(term105301, term105301.getClass(), "viewToModelIndex", null);
        setField(term105301, term105301.getClass(), "modelToViewIndex", null);
        setIntField(term105301, term105301.getClass(), "lastRowCount", 0);
        setBooleanField(term105301, term105301.getClass(), "rebuildIndices", false);
        setField(term105301, term105301.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getFilteredChildIndex", argTypes, term105301, args);
    }

};


