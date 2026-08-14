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

public class MyObjectTreeTableModel_getColumnClass_9413852474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37029;
     Object term37035;

    public MyObjectTreeTableModel_getColumnClass_9413852474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37029 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term37029, term37029.getClass(), "leafIcon", null);
        setField(term37029, term37029.getClass(), "openIcon", null);
        setField(term37029, term37029.getClass(), "closedIcon", null);
        setField(term37029, term37029.getClass(), "rootNode", null);
        setField(term37029, term37029.getClass(), "table", null);
        setBooleanField(term37029, term37029.getClass(), "showRoot", false);
        setField(term37029, term37029.getClass(), "expandKeys", null);
        setField(term37029, term37029.getClass(), "collapseKeys", null);
        setField(term37029, term37029.getClass(), "toggleKeys", null);
        setField(term37029, term37029.getClass(), "navigateParent", null);
        setField(term37029, term37029.getClass(), "navigateChildren", null);
        setBooleanField(term37029, term37029.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term37029, term37029.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term37029, term37029.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term37029, term37029.getClass(), "sortKeys", null);
        setField(term37029, term37029.getClass(), "defaultSortKeys", null);
        setField(term37029, term37029.getClass(), "sortStrategy", null);
        setField(term37029, term37029.getClass(), "groupingComparator", null);
        setField(term37029, term37029.getClass(), "filterPredicate", null);
        setIntField(term37029, term37029.getClass(), "linearScanThreshold", 0);
        setField(term37029, term37029.getClass(), "defaultColumnSortStrategy", null);
        setField(term37029, term37029.getClass(), "columnModel", null);
        setField(term37029, term37029.getClass(), "displayedNodes", null);
        setField(term37029, term37029.getClass(), "expandedNodeCounts", null);
        setField(term37029, term37029.getClass(), "tableMouseListener", null);
        setField(term37029, term37029.getClass(), "eventListeners", null);
        setField(term37029, term37029.getClass(), "clickHandler", null);
        setField(term37029, term37029.getClass(), "oldHeaderRenderer", null);
        setField(term37029, term37029.getClass(), "listenerList", null);
        term37035 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term37035;
        callMethod(klass, "getColumnClass", argTypes, term37029, args);
    }

};


