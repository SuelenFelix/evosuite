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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class TreeTableRowSorter_getViewIndexOfLastChild_100287687349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104500;
     Object term104580;

    public TreeTableRowSorter_getViewIndexOfLastChild_100287687349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term104501 = new ArrayList();
        ArrayList term104505 = new ArrayList();
        HashMap term104510 = new HashMap();
        Set<Object> term104582 =  ((Map) term104510).keySet();
        HashSet term104509 = new HashSet((Collection<? extends Object>) term104582);
        ArrayList term104527 = new ArrayList();
        ((ArrayList) term104527).add((Object)null);
        ((ArrayList) term104527).add((Object)null);
        ((ArrayList) term104527).add((Object)null);
        ((ArrayList) term104527).add((Object)null);
        ((ArrayList) term104527).add((Object)null);
        ((ArrayList) term104527).add((Object)null);
        ArrayList term104530 = new ArrayList();
        HashSet term104533 = new HashSet();
        ArrayList term104544 = new ArrayList();
        ((ArrayList) term104544).add((Object)null);
        ((ArrayList) term104544).add((Object)null);
        ((ArrayList) term104544).add((Object)null);
        ((ArrayList) term104544).add((Object)null);
        ((ArrayList) term104544).add((Object)null);
        ((ArrayList) term104544).add((Object)null);
        ((ArrayList) term104544).add((Object)null);
        ((ArrayList) term104544).add((Object)null);
        ArrayList term104547 = new ArrayList();
        HashSet term104550 = new HashSet();
        term104500 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104524 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 5);
        Object term104525 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104526 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104534 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        int[] term104535 = (int[]) newIntArray(2);
        Object term104540 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term104542 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104543 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term104554 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104555 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term104559 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104560 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term104564 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104565 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term104569 = (int[]) newIntArray(6);
        Object term104578 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term104579 = (Object[]) newArray("java.lang.Object", 0);
        setField(term104500, term104500.getClass(), "model", null);
        setField(term104500, term104500.getClass(), "sortKeys", term104501);
        setField(term104500, term104500.getClass(), "defaultSortKeys", term104505);
        setField(term104500, term104500.getClass(), "unsortableColumns", term104509);
        setField(term104500, term104500.getClass(), "nodeComparator", null);
        setField(term104500, term104500.getClass(), "sortStrategy", null);
        setField(term104526, term104526.getClass(), "model", null);
        setField(term104526, term104526.getClass(), "sortKeys", term104527);
        setField(term104526, term104526.getClass(), "defaultSortKeys", term104530);
        setField(term104526, term104526.getClass(), "unsortableColumns", term104533);
        setField(term104526, term104526.getClass(), "nodeComparator", null);
        setField(term104526, term104526.getClass(), "sortStrategy", null);
        setField(term104526, term104526.getClass(), "viewToModelIndex", term104534);
        setIntElement(term104535, 0, -2105349391);
        setIntElement(term104535, 1, -1176968921);
        setField(term104526, term104526.getClass(), "modelToViewIndex", term104535);
        setIntField(term104526, term104526.getClass(), "lastRowCount", -1986225025);
        setBooleanField(term104526, term104526.getClass(), "rebuildIndices", false);
        setField(term104540, term104540.getClass(), "listenerList", null);
        setField(term104526, term104526.getClass(), "listenerList", term104540);
        setField(term104525, term104525.getClass(), "rowSorter", term104526);
        setIntField(term104525, term104525.getClass(), "modelIndex", -838689952);
        setElement(term104524, 0, term104525);
        setField(term104543, term104543.getClass(), "model", null);
        setField(term104543, term104543.getClass(), "sortKeys", term104544);
        setField(term104543, term104543.getClass(), "defaultSortKeys", term104547);
        setField(term104543, term104543.getClass(), "unsortableColumns", term104550);
        setField(term104543, term104543.getClass(), "nodeComparator", null);
        setField(term104543, term104543.getClass(), "sortStrategy", null);
        setField(term104543, term104543.getClass(), "viewToModelIndex", null);
        setField(term104543, term104543.getClass(), "modelToViewIndex", null);
        setIntField(term104543, term104543.getClass(), "lastRowCount", 0);
        setBooleanField(term104543, term104543.getClass(), "rebuildIndices", false);
        setField(term104543, term104543.getClass(), "listenerList", null);
        setField(term104542, term104542.getClass(), "rowSorter", term104543);
        setIntField(term104542, term104542.getClass(), "modelIndex", -307464652);
        setElement(term104524, 1, term104542);
        setField(term104555, term104555.getClass(), "model", null);
        setField(term104555, term104555.getClass(), "sortKeys", null);
        setField(term104555, term104555.getClass(), "defaultSortKeys", null);
        setField(term104555, term104555.getClass(), "unsortableColumns", null);
        setField(term104555, term104555.getClass(), "nodeComparator", null);
        setField(term104555, term104555.getClass(), "sortStrategy", null);
        setField(term104555, term104555.getClass(), "viewToModelIndex", null);
        setField(term104555, term104555.getClass(), "modelToViewIndex", null);
        setIntField(term104555, term104555.getClass(), "lastRowCount", 0);
        setBooleanField(term104555, term104555.getClass(), "rebuildIndices", false);
        setField(term104555, term104555.getClass(), "listenerList", null);
        setField(term104554, term104554.getClass(), "rowSorter", term104555);
        setIntField(term104554, term104554.getClass(), "modelIndex", 460605690);
        setElement(term104524, 2, term104554);
        setField(term104560, term104560.getClass(), "model", null);
        setField(term104560, term104560.getClass(), "sortKeys", null);
        setField(term104560, term104560.getClass(), "defaultSortKeys", null);
        setField(term104560, term104560.getClass(), "unsortableColumns", null);
        setField(term104560, term104560.getClass(), "nodeComparator", null);
        setField(term104560, term104560.getClass(), "sortStrategy", null);
        setField(term104560, term104560.getClass(), "viewToModelIndex", null);
        setField(term104560, term104560.getClass(), "modelToViewIndex", null);
        setIntField(term104560, term104560.getClass(), "lastRowCount", 0);
        setBooleanField(term104560, term104560.getClass(), "rebuildIndices", false);
        setField(term104560, term104560.getClass(), "listenerList", null);
        setField(term104559, term104559.getClass(), "rowSorter", term104560);
        setIntField(term104559, term104559.getClass(), "modelIndex", 2119231643);
        setElement(term104524, 3, term104559);
        setField(term104565, term104565.getClass(), "model", null);
        setField(term104565, term104565.getClass(), "sortKeys", null);
        setField(term104565, term104565.getClass(), "defaultSortKeys", null);
        setField(term104565, term104565.getClass(), "unsortableColumns", null);
        setField(term104565, term104565.getClass(), "nodeComparator", null);
        setField(term104565, term104565.getClass(), "sortStrategy", null);
        setField(term104565, term104565.getClass(), "viewToModelIndex", null);
        setField(term104565, term104565.getClass(), "modelToViewIndex", null);
        setIntField(term104565, term104565.getClass(), "lastRowCount", 0);
        setBooleanField(term104565, term104565.getClass(), "rebuildIndices", false);
        setField(term104565, term104565.getClass(), "listenerList", null);
        setField(term104564, term104564.getClass(), "rowSorter", term104565);
        setIntField(term104564, term104564.getClass(), "modelIndex", -315380004);
        setElement(term104524, 4, term104564);
        setField(term104500, term104500.getClass(), "viewToModelIndex", term104524);
        setIntElement(term104569, 0, 688546450);
        setIntElement(term104569, 1, 115635779);
        setIntElement(term104569, 2, -1081685171);
        setIntElement(term104569, 3, 1511699134);
        setIntElement(term104569, 4, 185647247);
        setIntElement(term104569, 5, 720814309);
        setField(term104500, term104500.getClass(), "modelToViewIndex", term104569);
        setIntField(term104500, term104500.getClass(), "lastRowCount", 964137425);
        setBooleanField(term104500, term104500.getClass(), "rebuildIndices", false);
        setField(term104578, term104578.getClass(), "listenerList", term104579);
        setField(term104500, term104500.getClass(), "listenerList", term104578);
        term104580 = new Integer(-1378885614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term104580;
        callMethod(klass, "getViewIndexOfLastChild", argTypes, term104500, args);
    }

};


