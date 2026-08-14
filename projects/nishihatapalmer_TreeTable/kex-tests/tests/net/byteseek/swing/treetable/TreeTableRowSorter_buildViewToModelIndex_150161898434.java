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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TreeTableRowSorter_buildViewToModelIndex_150161898434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102433;

    public TreeTableRowSorter_buildViewToModelIndex_150161898434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102436 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102438 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102436, term102436.getClass(), "column", 1641117123);
        setField(term102438, term102438.getClass(), "name", null);
        setIntField(term102438, term102438.getClass(), "ordinal", 1);
        setField(term102436, term102436.getClass(), "sortOrder", term102438);
        Object term102440 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term102440, term102440.getClass(), "column", -1084408453);
        setField(term102440, term102440.getClass(), "sortOrder", term102438);
        ArrayList term102434 = new ArrayList();
        ((ArrayList) term102434).add(term102436);
        ((ArrayList) term102434).add(term102440);
        ArrayList term102444 = new ArrayList();
        HashMap term102449 = new HashMap();
        Set<Object> term102498 =  ((Map) term102449).keySet();
        HashSet term102448 = new HashSet((Collection<? extends Object>) term102498);
        ArrayList term102457 = new ArrayList();
        ((ArrayList) term102457).add((Object)null);
        ArrayList term102460 = new ArrayList();
        HashSet term102463 = new HashSet();
        ArrayList term102481 = new ArrayList();
        ArrayList term102484 = new ArrayList();
        HashSet term102487 = new HashSet();
        term102433 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102454 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term102455 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102456 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102464 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        int[] term102465 = (int[]) newIntArray(9);
        Object term102477 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term102479 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102480 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term102491 = (int[]) newIntArray(2);
        Object term102496 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term102497 = (Object[]) newArray("java.lang.Object", 0);
        setField(term102433, term102433.getClass(), "model", null);
        setField(term102433, term102433.getClass(), "sortKeys", term102434);
        setField(term102433, term102433.getClass(), "defaultSortKeys", term102444);
        setField(term102433, term102433.getClass(), "unsortableColumns", term102448);
        setField(term102433, term102433.getClass(), "nodeComparator", null);
        setField(term102433, term102433.getClass(), "sortStrategy", null);
        setField(term102456, term102456.getClass(), "model", null);
        setField(term102456, term102456.getClass(), "sortKeys", term102457);
        setField(term102456, term102456.getClass(), "defaultSortKeys", term102460);
        setField(term102456, term102456.getClass(), "unsortableColumns", term102463);
        setField(term102456, term102456.getClass(), "nodeComparator", null);
        setField(term102456, term102456.getClass(), "sortStrategy", null);
        setField(term102456, term102456.getClass(), "viewToModelIndex", term102464);
        setIntElement(term102465, 0, 1919079331);
        setIntElement(term102465, 1, 144872711);
        setIntElement(term102465, 2, -720037395);
        setIntElement(term102465, 3, 1232105469);
        setIntElement(term102465, 4, -1547322575);
        setIntElement(term102465, 5, -61444233);
        setIntElement(term102465, 6, -400720912);
        setIntElement(term102465, 7, 1266192397);
        setIntElement(term102465, 8, 218346781);
        setField(term102456, term102456.getClass(), "modelToViewIndex", term102465);
        setIntField(term102456, term102456.getClass(), "lastRowCount", -984660976);
        setBooleanField(term102456, term102456.getClass(), "rebuildIndices", true);
        setField(term102477, term102477.getClass(), "listenerList", null);
        setField(term102456, term102456.getClass(), "listenerList", term102477);
        setField(term102455, term102455.getClass(), "rowSorter", term102456);
        setIntField(term102455, term102455.getClass(), "modelIndex", -1419341969);
        setElement(term102454, 0, term102455);
        setField(term102480, term102480.getClass(), "model", null);
        setField(term102480, term102480.getClass(), "sortKeys", term102481);
        setField(term102480, term102480.getClass(), "defaultSortKeys", term102484);
        setField(term102480, term102480.getClass(), "unsortableColumns", term102487);
        setField(term102480, term102480.getClass(), "nodeComparator", null);
        setField(term102480, term102480.getClass(), "sortStrategy", null);
        setField(term102480, term102480.getClass(), "viewToModelIndex", null);
        setField(term102480, term102480.getClass(), "modelToViewIndex", null);
        setIntField(term102480, term102480.getClass(), "lastRowCount", 0);
        setBooleanField(term102480, term102480.getClass(), "rebuildIndices", false);
        setField(term102480, term102480.getClass(), "listenerList", null);
        setField(term102479, term102479.getClass(), "rowSorter", term102480);
        setIntField(term102479, term102479.getClass(), "modelIndex", -89522625);
        setElement(term102454, 1, term102479);
        setField(term102433, term102433.getClass(), "viewToModelIndex", term102454);
        setIntElement(term102491, 0, 1475906894);
        setIntElement(term102491, 1, -2004794532);
        setField(term102433, term102433.getClass(), "modelToViewIndex", term102491);
        setIntField(term102433, term102433.getClass(), "lastRowCount", 1232958763);
        setBooleanField(term102433, term102433.getClass(), "rebuildIndices", true);
        setField(term102496, term102496.getClass(), "listenerList", term102497);
        setField(term102433, term102433.getClass(), "listenerList", term102496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildViewToModelIndex", argTypes, term102433, args);
    }

};


