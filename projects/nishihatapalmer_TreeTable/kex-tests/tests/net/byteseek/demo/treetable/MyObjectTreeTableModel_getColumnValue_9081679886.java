package net.byteseek.demo.treetable;

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
import static net.byteseek.demo.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class MyObjectTreeTableModel_getColumnValue_9081679886 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37762;
     Object term37768;

    public MyObjectTreeTableModel_getColumnValue_9081679886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37762 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term37762, term37762.getClass(), "leafIcon", null);
        setField(term37762, term37762.getClass(), "openIcon", null);
        setField(term37762, term37762.getClass(), "closedIcon", null);
        setField(term37762, term37762.getClass(), "rootNode", null);
        setField(term37762, term37762.getClass(), "table", null);
        setBooleanField(term37762, term37762.getClass(), "showRoot", false);
        setField(term37762, term37762.getClass(), "expandKeys", null);
        setField(term37762, term37762.getClass(), "collapseKeys", null);
        setField(term37762, term37762.getClass(), "toggleKeys", null);
        setField(term37762, term37762.getClass(), "navigateParent", null);
        setField(term37762, term37762.getClass(), "navigateChildren", null);
        setBooleanField(term37762, term37762.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term37762, term37762.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term37762, term37762.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term37762, term37762.getClass(), "sortKeys", null);
        setField(term37762, term37762.getClass(), "defaultSortKeys", null);
        setField(term37762, term37762.getClass(), "sortStrategy", null);
        setField(term37762, term37762.getClass(), "groupingComparator", null);
        setField(term37762, term37762.getClass(), "filterPredicate", null);
        setIntField(term37762, term37762.getClass(), "linearScanThreshold", 0);
        setField(term37762, term37762.getClass(), "defaultColumnSortStrategy", null);
        setField(term37762, term37762.getClass(), "columnModel", null);
        setField(term37762, term37762.getClass(), "displayedNodes", null);
        setField(term37762, term37762.getClass(), "expandedNodeCounts", null);
        setField(term37762, term37762.getClass(), "tableMouseListener", null);
        setField(term37762, term37762.getClass(), "eventListeners", null);
        setField(term37762, term37762.getClass(), "clickHandler", null);
        setField(term37762, term37762.getClass(), "oldHeaderRenderer", null);
        setField(term37762, term37762.getClass(), "listenerList", null);
        term37768 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term37768;
        callMethod(klass, "getColumnValue", argTypes, term37762, args);
    }

};


