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

public class MyObjectTreeTableModel_setLeafIcon_73075207118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41893;

    public MyObjectTreeTableModel_setLeafIcon_73075207118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41893 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term41893, term41893.getClass(), "leafIcon", null);
        setField(term41893, term41893.getClass(), "openIcon", null);
        setField(term41893, term41893.getClass(), "closedIcon", null);
        setField(term41893, term41893.getClass(), "rootNode", null);
        setField(term41893, term41893.getClass(), "table", null);
        setBooleanField(term41893, term41893.getClass(), "showRoot", false);
        setField(term41893, term41893.getClass(), "expandKeys", null);
        setField(term41893, term41893.getClass(), "collapseKeys", null);
        setField(term41893, term41893.getClass(), "toggleKeys", null);
        setField(term41893, term41893.getClass(), "navigateParent", null);
        setField(term41893, term41893.getClass(), "navigateChildren", null);
        setBooleanField(term41893, term41893.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term41893, term41893.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term41893, term41893.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term41893, term41893.getClass(), "sortKeys", null);
        setField(term41893, term41893.getClass(), "defaultSortKeys", null);
        setField(term41893, term41893.getClass(), "sortStrategy", null);
        setField(term41893, term41893.getClass(), "groupingComparator", null);
        setField(term41893, term41893.getClass(), "filterPredicate", null);
        setIntField(term41893, term41893.getClass(), "linearScanThreshold", 0);
        setField(term41893, term41893.getClass(), "defaultColumnSortStrategy", null);
        setField(term41893, term41893.getClass(), "columnModel", null);
        setField(term41893, term41893.getClass(), "displayedNodes", null);
        setField(term41893, term41893.getClass(), "expandedNodeCounts", null);
        setField(term41893, term41893.getClass(), "tableMouseListener", null);
        setField(term41893, term41893.getClass(), "eventListeners", null);
        setField(term41893, term41893.getClass(), "clickHandler", null);
        setField(term41893, term41893.getClass(), "oldHeaderRenderer", null);
        setField(term41893, term41893.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.Icon");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLeafIcon", argTypes, term41893, args);
    }

};


