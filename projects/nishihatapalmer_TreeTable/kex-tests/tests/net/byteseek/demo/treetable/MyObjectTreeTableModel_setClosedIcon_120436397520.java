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

public class MyObjectTreeTableModel_setClosedIcon_120436397520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42561;

    public MyObjectTreeTableModel_setClosedIcon_120436397520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42561 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term42561, term42561.getClass(), "leafIcon", null);
        setField(term42561, term42561.getClass(), "openIcon", null);
        setField(term42561, term42561.getClass(), "closedIcon", null);
        setField(term42561, term42561.getClass(), "rootNode", null);
        setField(term42561, term42561.getClass(), "table", null);
        setBooleanField(term42561, term42561.getClass(), "showRoot", false);
        setField(term42561, term42561.getClass(), "expandKeys", null);
        setField(term42561, term42561.getClass(), "collapseKeys", null);
        setField(term42561, term42561.getClass(), "toggleKeys", null);
        setField(term42561, term42561.getClass(), "navigateParent", null);
        setField(term42561, term42561.getClass(), "navigateChildren", null);
        setBooleanField(term42561, term42561.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term42561, term42561.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term42561, term42561.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term42561, term42561.getClass(), "sortKeys", null);
        setField(term42561, term42561.getClass(), "defaultSortKeys", null);
        setField(term42561, term42561.getClass(), "sortStrategy", null);
        setField(term42561, term42561.getClass(), "groupingComparator", null);
        setField(term42561, term42561.getClass(), "filterPredicate", null);
        setIntField(term42561, term42561.getClass(), "linearScanThreshold", 0);
        setField(term42561, term42561.getClass(), "defaultColumnSortStrategy", null);
        setField(term42561, term42561.getClass(), "columnModel", null);
        setField(term42561, term42561.getClass(), "displayedNodes", null);
        setField(term42561, term42561.getClass(), "expandedNodeCounts", null);
        setField(term42561, term42561.getClass(), "tableMouseListener", null);
        setField(term42561, term42561.getClass(), "eventListeners", null);
        setField(term42561, term42561.getClass(), "clickHandler", null);
        setField(term42561, term42561.getClass(), "oldHeaderRenderer", null);
        setField(term42561, term42561.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.Icon");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setClosedIcon", argTypes, term42561, args);
    }

};


