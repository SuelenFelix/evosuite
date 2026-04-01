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
     Object term37790;
     Object term37796;

    public MyObjectTreeTableModel_getColumnValue_9081679886() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37790 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term37790, term37790.getClass(), "leafIcon", null);
        setField(term37790, term37790.getClass(), "openIcon", null);
        setField(term37790, term37790.getClass(), "closedIcon", null);
        setField(term37790, term37790.getClass(), "rootNode", null);
        setField(term37790, term37790.getClass(), "table", null);
        setBooleanField(term37790, term37790.getClass(), "showRoot", false);
        setField(term37790, term37790.getClass(), "expandKeys", null);
        setField(term37790, term37790.getClass(), "collapseKeys", null);
        setField(term37790, term37790.getClass(), "toggleKeys", null);
        setField(term37790, term37790.getClass(), "navigateParent", null);
        setField(term37790, term37790.getClass(), "navigateChildren", null);
        setBooleanField(term37790, term37790.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term37790, term37790.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term37790, term37790.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term37790, term37790.getClass(), "sortKeys", null);
        setField(term37790, term37790.getClass(), "defaultSortKeys", null);
        setField(term37790, term37790.getClass(), "sortStrategy", null);
        setField(term37790, term37790.getClass(), "groupingComparator", null);
        setField(term37790, term37790.getClass(), "filterPredicate", null);
        setIntField(term37790, term37790.getClass(), "linearScanThreshold", 0);
        setField(term37790, term37790.getClass(), "defaultColumnSortStrategy", null);
        setField(term37790, term37790.getClass(), "columnModel", null);
        setField(term37790, term37790.getClass(), "displayedNodes", null);
        setField(term37790, term37790.getClass(), "expandedNodeCounts", null);
        setField(term37790, term37790.getClass(), "tableMouseListener", null);
        setField(term37790, term37790.getClass(), "eventListeners", null);
        setField(term37790, term37790.getClass(), "clickHandler", null);
        setField(term37790, term37790.getClass(), "oldHeaderRenderer", null);
        setField(term37790, term37790.getClass(), "listenerList", null);
        term37796 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term37796;
        callMethod(klass, "getColumnValue", argTypes, term37790, args);
    }

};


