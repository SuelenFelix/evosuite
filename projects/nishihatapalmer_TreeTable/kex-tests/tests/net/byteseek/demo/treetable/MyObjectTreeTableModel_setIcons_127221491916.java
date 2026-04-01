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

public class MyObjectTreeTableModel_setIcons_127221491916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41195;

    public MyObjectTreeTableModel_setIcons_127221491916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41195 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term41195, term41195.getClass(), "leafIcon", null);
        setField(term41195, term41195.getClass(), "openIcon", null);
        setField(term41195, term41195.getClass(), "closedIcon", null);
        setField(term41195, term41195.getClass(), "rootNode", null);
        setField(term41195, term41195.getClass(), "table", null);
        setBooleanField(term41195, term41195.getClass(), "showRoot", false);
        setField(term41195, term41195.getClass(), "expandKeys", null);
        setField(term41195, term41195.getClass(), "collapseKeys", null);
        setField(term41195, term41195.getClass(), "toggleKeys", null);
        setField(term41195, term41195.getClass(), "navigateParent", null);
        setField(term41195, term41195.getClass(), "navigateChildren", null);
        setBooleanField(term41195, term41195.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term41195, term41195.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term41195, term41195.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term41195, term41195.getClass(), "sortKeys", null);
        setField(term41195, term41195.getClass(), "defaultSortKeys", null);
        setField(term41195, term41195.getClass(), "sortStrategy", null);
        setField(term41195, term41195.getClass(), "groupingComparator", null);
        setField(term41195, term41195.getClass(), "filterPredicate", null);
        setIntField(term41195, term41195.getClass(), "linearScanThreshold", 0);
        setField(term41195, term41195.getClass(), "defaultColumnSortStrategy", null);
        setField(term41195, term41195.getClass(), "columnModel", null);
        setField(term41195, term41195.getClass(), "displayedNodes", null);
        setField(term41195, term41195.getClass(), "expandedNodeCounts", null);
        setField(term41195, term41195.getClass(), "tableMouseListener", null);
        setField(term41195, term41195.getClass(), "eventListeners", null);
        setField(term41195, term41195.getClass(), "clickHandler", null);
        setField(term41195, term41195.getClass(), "oldHeaderRenderer", null);
        setField(term41195, term41195.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setIcons", argTypes, term41195, args);
    }

};


