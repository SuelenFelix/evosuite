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

public class MyObjectTreeTableModel_setColumnValue_115745414210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39230;
     Object term39236;

    public MyObjectTreeTableModel_setColumnValue_115745414210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39230 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term39230, term39230.getClass(), "leafIcon", null);
        setField(term39230, term39230.getClass(), "openIcon", null);
        setField(term39230, term39230.getClass(), "closedIcon", null);
        setField(term39230, term39230.getClass(), "rootNode", null);
        setField(term39230, term39230.getClass(), "table", null);
        setBooleanField(term39230, term39230.getClass(), "showRoot", false);
        setField(term39230, term39230.getClass(), "expandKeys", null);
        setField(term39230, term39230.getClass(), "collapseKeys", null);
        setField(term39230, term39230.getClass(), "toggleKeys", null);
        setField(term39230, term39230.getClass(), "navigateParent", null);
        setField(term39230, term39230.getClass(), "navigateChildren", null);
        setBooleanField(term39230, term39230.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term39230, term39230.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term39230, term39230.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term39230, term39230.getClass(), "sortKeys", null);
        setField(term39230, term39230.getClass(), "defaultSortKeys", null);
        setField(term39230, term39230.getClass(), "sortStrategy", null);
        setField(term39230, term39230.getClass(), "groupingComparator", null);
        setField(term39230, term39230.getClass(), "filterPredicate", null);
        setIntField(term39230, term39230.getClass(), "linearScanThreshold", 0);
        setField(term39230, term39230.getClass(), "defaultColumnSortStrategy", null);
        setField(term39230, term39230.getClass(), "columnModel", null);
        setField(term39230, term39230.getClass(), "displayedNodes", null);
        setField(term39230, term39230.getClass(), "expandedNodeCounts", null);
        setField(term39230, term39230.getClass(), "tableMouseListener", null);
        setField(term39230, term39230.getClass(), "eventListeners", null);
        setField(term39230, term39230.getClass(), "clickHandler", null);
        setField(term39230, term39230.getClass(), "oldHeaderRenderer", null);
        setField(term39230, term39230.getClass(), "listenerList", null);
        term39236 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.Object");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term39236;
        args[2] = null;
        callMethod(klass, "setColumnValue", argTypes, term39230, args);
    }

};


