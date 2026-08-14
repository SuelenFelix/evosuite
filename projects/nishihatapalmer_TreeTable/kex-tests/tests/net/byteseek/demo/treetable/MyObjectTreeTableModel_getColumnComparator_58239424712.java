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
     Object term39841;
     Object term39847;

    public MyObjectTreeTableModel_getColumnComparator_58239424712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39841 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term39841, term39841.getClass(), "leafIcon", null);
        setField(term39841, term39841.getClass(), "openIcon", null);
        setField(term39841, term39841.getClass(), "closedIcon", null);
        setField(term39841, term39841.getClass(), "rootNode", null);
        setField(term39841, term39841.getClass(), "table", null);
        setBooleanField(term39841, term39841.getClass(), "showRoot", false);
        setField(term39841, term39841.getClass(), "expandKeys", null);
        setField(term39841, term39841.getClass(), "collapseKeys", null);
        setField(term39841, term39841.getClass(), "toggleKeys", null);
        setField(term39841, term39841.getClass(), "navigateParent", null);
        setField(term39841, term39841.getClass(), "navigateChildren", null);
        setBooleanField(term39841, term39841.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term39841, term39841.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term39841, term39841.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term39841, term39841.getClass(), "sortKeys", null);
        setField(term39841, term39841.getClass(), "defaultSortKeys", null);
        setField(term39841, term39841.getClass(), "sortStrategy", null);
        setField(term39841, term39841.getClass(), "groupingComparator", null);
        setField(term39841, term39841.getClass(), "filterPredicate", null);
        setIntField(term39841, term39841.getClass(), "linearScanThreshold", 0);
        setField(term39841, term39841.getClass(), "defaultColumnSortStrategy", null);
        setField(term39841, term39841.getClass(), "columnModel", null);
        setField(term39841, term39841.getClass(), "displayedNodes", null);
        setField(term39841, term39841.getClass(), "expandedNodeCounts", null);
        setField(term39841, term39841.getClass(), "tableMouseListener", null);
        setField(term39841, term39841.getClass(), "eventListeners", null);
        setField(term39841, term39841.getClass(), "clickHandler", null);
        setField(term39841, term39841.getClass(), "oldHeaderRenderer", null);
        setField(term39841, term39841.getClass(), "listenerList", null);
        term39847 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term39847;
        callMethod(klass, "getColumnComparator", argTypes, term39841, args);
    }

};


