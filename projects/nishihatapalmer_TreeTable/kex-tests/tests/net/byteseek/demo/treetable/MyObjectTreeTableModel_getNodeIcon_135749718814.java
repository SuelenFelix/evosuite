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

public class MyObjectTreeTableModel_getNodeIcon_135749718814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40563;

    public MyObjectTreeTableModel_getNodeIcon_135749718814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40563 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term40563, term40563.getClass(), "leafIcon", null);
        setField(term40563, term40563.getClass(), "openIcon", null);
        setField(term40563, term40563.getClass(), "closedIcon", null);
        setField(term40563, term40563.getClass(), "rootNode", null);
        setField(term40563, term40563.getClass(), "table", null);
        setBooleanField(term40563, term40563.getClass(), "showRoot", false);
        setField(term40563, term40563.getClass(), "expandKeys", null);
        setField(term40563, term40563.getClass(), "collapseKeys", null);
        setField(term40563, term40563.getClass(), "toggleKeys", null);
        setField(term40563, term40563.getClass(), "navigateParent", null);
        setField(term40563, term40563.getClass(), "navigateChildren", null);
        setBooleanField(term40563, term40563.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term40563, term40563.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term40563, term40563.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term40563, term40563.getClass(), "sortKeys", null);
        setField(term40563, term40563.getClass(), "defaultSortKeys", null);
        setField(term40563, term40563.getClass(), "sortStrategy", null);
        setField(term40563, term40563.getClass(), "groupingComparator", null);
        setField(term40563, term40563.getClass(), "filterPredicate", null);
        setIntField(term40563, term40563.getClass(), "linearScanThreshold", 0);
        setField(term40563, term40563.getClass(), "defaultColumnSortStrategy", null);
        setField(term40563, term40563.getClass(), "columnModel", null);
        setField(term40563, term40563.getClass(), "displayedNodes", null);
        setField(term40563, term40563.getClass(), "expandedNodeCounts", null);
        setField(term40563, term40563.getClass(), "tableMouseListener", null);
        setField(term40563, term40563.getClass(), "eventListeners", null);
        setField(term40563, term40563.getClass(), "clickHandler", null);
        setField(term40563, term40563.getClass(), "oldHeaderRenderer", null);
        setField(term40563, term40563.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getNodeIcon", argTypes, term40563, args);
    }

};


