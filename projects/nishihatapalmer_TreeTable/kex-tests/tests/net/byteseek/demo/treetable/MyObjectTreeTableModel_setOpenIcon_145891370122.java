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

public class MyObjectTreeTableModel_setOpenIcon_145891370122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43241;

    public MyObjectTreeTableModel_setOpenIcon_145891370122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43241 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel"));
        setField(term43241, term43241.getClass(), "leafIcon", null);
        setField(term43241, term43241.getClass(), "openIcon", null);
        setField(term43241, term43241.getClass(), "closedIcon", null);
        setField(term43241, term43241.getClass(), "rootNode", null);
        setField(term43241, term43241.getClass(), "table", null);
        setBooleanField(term43241, term43241.getClass(), "showRoot", false);
        setField(term43241, term43241.getClass(), "expandKeys", null);
        setField(term43241, term43241.getClass(), "collapseKeys", null);
        setField(term43241, term43241.getClass(), "toggleKeys", null);
        setField(term43241, term43241.getClass(), "navigateParent", null);
        setField(term43241, term43241.getClass(), "navigateChildren", null);
        setBooleanField(term43241, term43241.getClass(), "collapseOnParentNavigation", false);
        setBooleanField(term43241, term43241.getClass(), "expandOnChildNavigation", false);
        setBooleanField(term43241, term43241.getClass(), "showExpandHandleIfNoChildren", false);
        setField(term43241, term43241.getClass(), "sortKeys", null);
        setField(term43241, term43241.getClass(), "defaultSortKeys", null);
        setField(term43241, term43241.getClass(), "sortStrategy", null);
        setField(term43241, term43241.getClass(), "groupingComparator", null);
        setField(term43241, term43241.getClass(), "filterPredicate", null);
        setIntField(term43241, term43241.getClass(), "linearScanThreshold", 0);
        setField(term43241, term43241.getClass(), "defaultColumnSortStrategy", null);
        setField(term43241, term43241.getClass(), "columnModel", null);
        setField(term43241, term43241.getClass(), "displayedNodes", null);
        setField(term43241, term43241.getClass(), "expandedNodeCounts", null);
        setField(term43241, term43241.getClass(), "tableMouseListener", null);
        setField(term43241, term43241.getClass(), "eventListeners", null);
        setField(term43241, term43241.getClass(), "clickHandler", null);
        setField(term43241, term43241.getClass(), "oldHeaderRenderer", null);
        setField(term43241, term43241.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectTreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.Icon");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOpenIcon", argTypes, term43241, args);
    }

};


