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

public class MyObjectTreeTableModel_isCellEditable_8905903392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36399;
     Object term36405;
     Object term36407;

    public MyObjectTreeTableModel_isCellEditable_8905903392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36399 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term36399, term36399.getClass(), "leafIcon", null);
        setField(term36399, term36399.getClass(), "openIcon", null);
        setField(term36399, term36399.getClass(), "closedIcon", null);
        setField(term36399, term36399.getClass(), "rootNode", null);
        setField(term36399, term36399.getClass(), "table", null);
        setBooleanField(term36399, term36399.getClass(), "showRoot", false);
        setField(term36399, term36399.getClass(), "expandKeys", null);
        setField(term36399, term36399.getClass(), "collapseKeys", null);
        setField(term36399, term36399.getClass(), "toggleKeys", null);
        setField(term36399, term36399.getClass(), "navigateParent", null);
        setField(term36399, term36399.getClass(), "navigateChildren", null);
        setBooleanField(term36399, term36399.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term36399, term36399.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term36399, term36399.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term36399, term36399.getClass(), "sortKeys", null);
        setField(term36399, term36399.getClass(), "defaultSortKeys", null);
        setField(term36399, term36399.getClass(), "sortStrategy", null);
        setField(term36399, term36399.getClass(), "groupingComparator", null);
        setField(term36399, term36399.getClass(), "filterPredicate", null);
        setIntField(term36399, term36399.getClass(), "linearScanThreshold", 0);
        setField(term36399, term36399.getClass(), "defaultColumnSortStrategy", null);
        setField(term36399, term36399.getClass(), "columnModel", null);
        setField(term36399, term36399.getClass(), "displayedNodes", null);
        setField(term36399, term36399.getClass(), "expandedNodeCounts", null);
        setField(term36399, term36399.getClass(), "tableMouseListener", null);
        setField(term36399, term36399.getClass(), "eventListeners", null);
        setField(term36399, term36399.getClass(), "clickHandler", null);
        setField(term36399, term36399.getClass(), "oldHeaderRenderer", null);
        setField(term36399, term36399.getClass(), "listenerList", null);
        term36405 = new Integer(0);
        term36407 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term36405;
        args[1] = term36407;
        callMethod(klass, "isCellEditable", argTypes, term36399, args);
    }

};


