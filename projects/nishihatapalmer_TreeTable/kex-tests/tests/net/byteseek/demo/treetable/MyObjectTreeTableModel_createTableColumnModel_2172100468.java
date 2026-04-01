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

public class MyObjectTreeTableModel_createTableColumnModel_2172100468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38490;

    public MyObjectTreeTableModel_createTableColumnModel_2172100468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38490 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term38490, term38490.getClass(), "leafIcon", null);
        setField(term38490, term38490.getClass(), "openIcon", null);
        setField(term38490, term38490.getClass(), "closedIcon", null);
        setField(term38490, term38490.getClass(), "rootNode", null);
        setField(term38490, term38490.getClass(), "table", null);
        setBooleanField(term38490, term38490.getClass(), "showRoot", false);
        setField(term38490, term38490.getClass(), "expandKeys", null);
        setField(term38490, term38490.getClass(), "collapseKeys", null);
        setField(term38490, term38490.getClass(), "toggleKeys", null);
        setField(term38490, term38490.getClass(), "navigateParent", null);
        setField(term38490, term38490.getClass(), "navigateChildren", null);
        setBooleanField(term38490, term38490.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term38490, term38490.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term38490, term38490.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term38490, term38490.getClass(), "sortKeys", null);
        setField(term38490, term38490.getClass(), "defaultSortKeys", null);
        setField(term38490, term38490.getClass(), "sortStrategy", null);
        setField(term38490, term38490.getClass(), "groupingComparator", null);
        setField(term38490, term38490.getClass(), "filterPredicate", null);
        setIntField(term38490, term38490.getClass(), "linearScanThreshold", 0);
        setField(term38490, term38490.getClass(), "defaultColumnSortStrategy", null);
        setField(term38490, term38490.getClass(), "columnModel", null);
        setField(term38490, term38490.getClass(), "displayedNodes", null);
        setField(term38490, term38490.getClass(), "expandedNodeCounts", null);
        setField(term38490, term38490.getClass(), "tableMouseListener", null);
        setField(term38490, term38490.getClass(), "eventListeners", null);
        setField(term38490, term38490.getClass(), "clickHandler", null);
        setField(term38490, term38490.getClass(), "oldHeaderRenderer", null);
        setField(term38490, term38490.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createTableColumnModel", argTypes, term38490, args);
    }

};


