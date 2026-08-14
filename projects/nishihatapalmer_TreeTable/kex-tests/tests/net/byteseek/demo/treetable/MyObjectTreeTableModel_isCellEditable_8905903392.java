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
     Object term36375;
     Object term36381;
     Object term36383;

    public MyObjectTreeTableModel_isCellEditable_8905903392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36375 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term36375, term36375.getClass(), "leafIcon", null);
        setField(term36375, term36375.getClass(), "openIcon", null);
        setField(term36375, term36375.getClass(), "closedIcon", null);
        setField(term36375, term36375.getClass(), "rootNode", null);
        setField(term36375, term36375.getClass(), "table", null);
        setBooleanField(term36375, term36375.getClass(), "showRoot", false);
        setField(term36375, term36375.getClass(), "expandKeys", null);
        setField(term36375, term36375.getClass(), "collapseKeys", null);
        setField(term36375, term36375.getClass(), "toggleKeys", null);
        setField(term36375, term36375.getClass(), "navigateParent", null);
        setField(term36375, term36375.getClass(), "navigateChildren", null);
        setBooleanField(term36375, term36375.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term36375, term36375.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term36375, term36375.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term36375, term36375.getClass(), "sortKeys", null);
        setField(term36375, term36375.getClass(), "defaultSortKeys", null);
        setField(term36375, term36375.getClass(), "sortStrategy", null);
        setField(term36375, term36375.getClass(), "groupingComparator", null);
        setField(term36375, term36375.getClass(), "filterPredicate", null);
        setIntField(term36375, term36375.getClass(), "linearScanThreshold", 0);
        setField(term36375, term36375.getClass(), "defaultColumnSortStrategy", null);
        setField(term36375, term36375.getClass(), "columnModel", null);
        setField(term36375, term36375.getClass(), "displayedNodes", null);
        setField(term36375, term36375.getClass(), "expandedNodeCounts", null);
        setField(term36375, term36375.getClass(), "tableMouseListener", null);
        setField(term36375, term36375.getClass(), "eventListeners", null);
        setField(term36375, term36375.getClass(), "clickHandler", null);
        setField(term36375, term36375.getClass(), "oldHeaderRenderer", null);
        setField(term36375, term36375.getClass(), "listenerList", null);
        term36381 = new Integer(0);
        term36383 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term36381;
        args[1] = term36383;
        callMethod(klass, "isCellEditable", argTypes, term36375, args);
    }

};


