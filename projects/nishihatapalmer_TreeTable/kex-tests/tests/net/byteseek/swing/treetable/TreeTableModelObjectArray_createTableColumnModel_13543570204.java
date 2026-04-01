package net.byteseek.swing.treetable;

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
import static net.byteseek.swing.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TreeTableModelObjectArray_createTableColumnModel_13543570204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4451;

    public TreeTableModelObjectArray_createTableColumnModel_13543570204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4451 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableModelObjectArray"));
        setField(term4451, term4451.getClass(), "columnModel", null);
        setField(term4451, term4451.getClass(), "rootNode", null);
        setField(term4451, term4451.getClass(), "table", null);
        setBooleanField(term4451, term4451.getClass(), "showRoot", false);
        setField(term4451, term4451.getClass(), "expandKeys", null);
        setField(term4451, term4451.getClass(), "collapseKeys", null);
        setField(term4451, term4451.getClass(), "toggleKeys", null);
        setField(term4451, term4451.getClass(), "navigateParent", null);
        setField(term4451, term4451.getClass(), "navigateChildren", null);
        setBooleanField(term4451, term4451.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term4451, term4451.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term4451, term4451.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term4451, term4451.getClass(), "sortKeys", null);
        setField(term4451, term4451.getClass(), "defaultSortKeys", null);
        setField(term4451, term4451.getClass(), "sortStrategy", null);
        setField(term4451, term4451.getClass(), "groupingComparator", null);
        setField(term4451, term4451.getClass(), "filterPredicate", null);
        setIntField(term4451, term4451.getClass(), "linearScanThreshold", 0);
        setField(term4451, term4451.getClass(), "defaultColumnSortStrategy", null);
        setField(term4451, term4451.getClass(), "displayedNodes", null);
        setField(term4451, term4451.getClass(), "expandedNodeCounts", null);
        setField(term4451, term4451.getClass(), "tableMouseListener", null);
        setField(term4451, term4451.getClass(), "eventListeners", null);
        setField(term4451, term4451.getClass(), "clickHandler", null);
        setField(term4451, term4451.getClass(), "oldHeaderRenderer", null);
        setField(term4451, term4451.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModelObjectArray");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createTableColumnModel", argTypes, term4451, args);
    }

};


