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

public class TreeTableRowSorter_moveNodeToSiblingPosition_1718142263107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105711;
     Object term105714;
     Object term105716;

    public TreeTableRowSorter_moveNodeToSiblingPosition_1718142263107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105711 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        setField(term105711, term105711.getClass(), "model", null);
        setField(term105711, term105711.getClass(), "sortKeys", null);
        setField(term105711, term105711.getClass(), "defaultSortKeys", null);
        setField(term105711, term105711.getClass(), "unsortableColumns", null);
        setField(term105711, term105711.getClass(), "nodeComparator", null);
        setField(term105711, term105711.getClass(), "sortStrategy", null);
        setField(term105711, term105711.getClass(), "viewToModelIndex", null);
        setField(term105711, term105711.getClass(), "modelToViewIndex", null);
        setIntField(term105711, term105711.getClass(), "lastRowCount", 0);
        setBooleanField(term105711, term105711.getClass(), "rebuildIndices", false);
        setField(term105711, term105711.getClass(), "listenerList", null);
        term105714 = new Integer(0);
        term105716 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term105714;
        args[2] = term105716;
        callMethod(klass, "moveNodeToSiblingPosition", argTypes, term105711, args);
    }

};


