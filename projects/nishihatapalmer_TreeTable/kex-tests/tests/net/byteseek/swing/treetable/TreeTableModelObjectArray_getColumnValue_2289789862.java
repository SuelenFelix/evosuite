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

public class TreeTableModelObjectArray_getColumnValue_2289789862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3601;
     Object term3607;

    public TreeTableModelObjectArray_getColumnValue_2289789862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3601 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableModelObjectArray"));
        setField(term3601, term3601.getClass(), "columnModel", null);
        setField(term3601, term3601.getClass(), "rootNode", null);
        setField(term3601, term3601.getClass(), "table", null);
        setBooleanField(term3601, term3601.getClass(), "showRoot", false);
        setField(term3601, term3601.getClass(), "expandKeys", null);
        setField(term3601, term3601.getClass(), "collapseKeys", null);
        setField(term3601, term3601.getClass(), "toggleKeys", null);
        setField(term3601, term3601.getClass(), "navigateParent", null);
        setField(term3601, term3601.getClass(), "navigateChildren", null);
        setBooleanField(term3601, term3601.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term3601, term3601.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term3601, term3601.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term3601, term3601.getClass(), "sortKeys", null);
        setField(term3601, term3601.getClass(), "defaultSortKeys", null);
        setField(term3601, term3601.getClass(), "sortStrategy", null);
        setField(term3601, term3601.getClass(), "groupingComparator", null);
        setField(term3601, term3601.getClass(), "filterPredicate", null);
        setIntField(term3601, term3601.getClass(), "linearScanThreshold", 0);
        setField(term3601, term3601.getClass(), "defaultColumnSortStrategy", null);
        setField(term3601, term3601.getClass(), "displayedNodes", null);
        setField(term3601, term3601.getClass(), "expandedNodeCounts", null);
        setField(term3601, term3601.getClass(), "tableMouseListener", null);
        setField(term3601, term3601.getClass(), "eventListeners", null);
        setField(term3601, term3601.getClass(), "clickHandler", null);
        setField(term3601, term3601.getClass(), "oldHeaderRenderer", null);
        setField(term3601, term3601.getClass(), "listenerList", null);
        term3607 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModelObjectArray");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3607;
        callMethod(klass, "getColumnValue", argTypes, term3601, args);
    }

};


