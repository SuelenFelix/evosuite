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

public class MyObjectTreeTableModel_getColumnComparator_58239424712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39875;
     Object term39881;

    public MyObjectTreeTableModel_getColumnComparator_58239424712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39875 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term39875, term39875.getClass(), "leafIcon", null);
        setField(term39875, term39875.getClass(), "openIcon", null);
        setField(term39875, term39875.getClass(), "closedIcon", null);
        setField(term39875, term39875.getClass(), "rootNode", null);
        setField(term39875, term39875.getClass(), "table", null);
        setBooleanField(term39875, term39875.getClass(), "showRoot", false);
        setField(term39875, term39875.getClass(), "expandKeys", null);
        setField(term39875, term39875.getClass(), "collapseKeys", null);
        setField(term39875, term39875.getClass(), "toggleKeys", null);
        setField(term39875, term39875.getClass(), "navigateParent", null);
        setField(term39875, term39875.getClass(), "navigateChildren", null);
        setBooleanField(term39875, term39875.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term39875, term39875.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term39875, term39875.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term39875, term39875.getClass(), "sortKeys", null);
        setField(term39875, term39875.getClass(), "defaultSortKeys", null);
        setField(term39875, term39875.getClass(), "sortStrategy", null);
        setField(term39875, term39875.getClass(), "groupingComparator", null);
        setField(term39875, term39875.getClass(), "filterPredicate", null);
        setIntField(term39875, term39875.getClass(), "linearScanThreshold", 0);
        setField(term39875, term39875.getClass(), "defaultColumnSortStrategy", null);
        setField(term39875, term39875.getClass(), "columnModel", null);
        setField(term39875, term39875.getClass(), "displayedNodes", null);
        setField(term39875, term39875.getClass(), "expandedNodeCounts", null);
        setField(term39875, term39875.getClass(), "tableMouseListener", null);
        setField(term39875, term39875.getClass(), "eventListeners", null);
        setField(term39875, term39875.getClass(), "clickHandler", null);
        setField(term39875, term39875.getClass(), "oldHeaderRenderer", null);
        setField(term39875, term39875.getClass(), "listenerList", null);
        term39881 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term39881;
        callMethod(klass, "getColumnComparator", argTypes, term39875, args);
    }

};


