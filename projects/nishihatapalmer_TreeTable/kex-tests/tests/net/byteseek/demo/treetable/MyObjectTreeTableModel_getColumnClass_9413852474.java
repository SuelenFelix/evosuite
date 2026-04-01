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
     Object term37055;
     Object term37061;

    public MyObjectTreeTableModel_getColumnClass_9413852474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37055 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term37055, term37055.getClass(), "leafIcon", null);
        setField(term37055, term37055.getClass(), "openIcon", null);
        setField(term37055, term37055.getClass(), "closedIcon", null);
        setField(term37055, term37055.getClass(), "rootNode", null);
        setField(term37055, term37055.getClass(), "table", null);
        setBooleanField(term37055, term37055.getClass(), "showRoot", false);
        setField(term37055, term37055.getClass(), "expandKeys", null);
        setField(term37055, term37055.getClass(), "collapseKeys", null);
        setField(term37055, term37055.getClass(), "toggleKeys", null);
        setField(term37055, term37055.getClass(), "navigateParent", null);
        setField(term37055, term37055.getClass(), "navigateChildren", null);
        setBooleanField(term37055, term37055.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term37055, term37055.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term37055, term37055.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term37055, term37055.getClass(), "sortKeys", null);
        setField(term37055, term37055.getClass(), "defaultSortKeys", null);
        setField(term37055, term37055.getClass(), "sortStrategy", null);
        setField(term37055, term37055.getClass(), "groupingComparator", null);
        setField(term37055, term37055.getClass(), "filterPredicate", null);
        setIntField(term37055, term37055.getClass(), "linearScanThreshold", 0);
        setField(term37055, term37055.getClass(), "defaultColumnSortStrategy", null);
        setField(term37055, term37055.getClass(), "columnModel", null);
        setField(term37055, term37055.getClass(), "displayedNodes", null);
        setField(term37055, term37055.getClass(), "expandedNodeCounts", null);
        setField(term37055, term37055.getClass(), "tableMouseListener", null);
        setField(term37055, term37055.getClass(), "eventListeners", null);
        setField(term37055, term37055.getClass(), "clickHandler", null);
        setField(term37055, term37055.getClass(), "oldHeaderRenderer", null);
        setField(term37055, term37055.getClass(), "listenerList", null);
        term37061 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term37061;
        callMethod(klass, "getColumnClass", argTypes, term37055, args);
    }

};


