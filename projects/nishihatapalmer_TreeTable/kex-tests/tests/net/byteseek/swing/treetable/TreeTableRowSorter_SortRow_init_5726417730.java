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

public class TreeTableRowSorter_SortRow_init_5726417730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369432;
     Object term369496;

    public TreeTableRowSorter_SortRow_init_5726417730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term369433 = new ArrayList();
        ArrayList term369437 = new ArrayList();
        HashMap term369442 = new HashMap();
        Set<Object> term369498 =  ((Map) term369442).keySet();
        HashSet term369441 = new HashSet((Collection<? extends Object>) term369498);
        ArrayList term369450 = new ArrayList();
        ((ArrayList) term369450).add((Object)null);
        ((ArrayList) term369450).add((Object)null);
        ((ArrayList) term369450).add((Object)null);
        ((ArrayList) term369450).add((Object)null);
        ((ArrayList) term369450).add((Object)null);
        ArrayList term369453 = new ArrayList();
        HashSet term369456 = new HashSet();
        ArrayList term369470 = new ArrayList();
        ((ArrayList) term369470).add((Object)null);
        ((ArrayList) term369470).add((Object)null);
        ArrayList term369473 = new ArrayList();
        HashSet term369476 = new HashSet();
        term369432 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term369447 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term369448 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369449 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term369457 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        int[] term369458 = (int[]) newIntArray(5);
        Object term369466 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term369468 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369469 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term369480 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369481 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term369485 = (int[]) newIntArray(6);
        Object term369494 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term369495 = (Object[]) newArray("java.lang.Object", 0);
        setField(term369432, term369432.getClass(), "model", null);
        setField(term369432, term369432.getClass(), "sortKeys", term369433);
        setField(term369432, term369432.getClass(), "defaultSortKeys", term369437);
        setField(term369432, term369432.getClass(), "unsortableColumns", term369441);
        setField(term369432, term369432.getClass(), "nodeComparator", null);
        setField(term369432, term369432.getClass(), "sortStrategy", null);
        setField(term369449, term369449.getClass(), "model", null);
        setField(term369449, term369449.getClass(), "sortKeys", term369450);
        setField(term369449, term369449.getClass(), "defaultSortKeys", term369453);
        setField(term369449, term369449.getClass(), "unsortableColumns", term369456);
        setField(term369449, term369449.getClass(), "nodeComparator", null);
        setField(term369449, term369449.getClass(), "sortStrategy", null);
        setField(term369449, term369449.getClass(), "viewToModelIndex", term369457);
        setIntElement(term369458, 0, -1504228047);
        setIntElement(term369458, 1, 1642235898);
        setIntElement(term369458, 2, -719765151);
        setIntElement(term369458, 3, 2039931383);
        setIntElement(term369458, 4, -2109330879);
        setField(term369449, term369449.getClass(), "modelToViewIndex", term369458);
        setIntField(term369449, term369449.getClass(), "lastRowCount", -1576801556);
        setBooleanField(term369449, term369449.getClass(), "rebuildIndices", false);
        setField(term369466, term369466.getClass(), "listenerList", null);
        setField(term369449, term369449.getClass(), "listenerList", term369466);
        setField(term369448, term369448.getClass(), "rowSorter", term369449);
        setIntField(term369448, term369448.getClass(), "modelIndex", -1572718384);
        setElement(term369447, 0, term369448);
        setField(term369469, term369469.getClass(), "model", null);
        setField(term369469, term369469.getClass(), "sortKeys", term369470);
        setField(term369469, term369469.getClass(), "defaultSortKeys", term369473);
        setField(term369469, term369469.getClass(), "unsortableColumns", term369476);
        setField(term369469, term369469.getClass(), "nodeComparator", null);
        setField(term369469, term369469.getClass(), "sortStrategy", null);
        setField(term369469, term369469.getClass(), "viewToModelIndex", null);
        setField(term369469, term369469.getClass(), "modelToViewIndex", null);
        setIntField(term369469, term369469.getClass(), "lastRowCount", 0);
        setBooleanField(term369469, term369469.getClass(), "rebuildIndices", false);
        setField(term369469, term369469.getClass(), "listenerList", null);
        setField(term369468, term369468.getClass(), "rowSorter", term369469);
        setIntField(term369468, term369468.getClass(), "modelIndex", 1623201205);
        setElement(term369447, 1, term369468);
        setField(term369481, term369481.getClass(), "model", null);
        setField(term369481, term369481.getClass(), "sortKeys", null);
        setField(term369481, term369481.getClass(), "defaultSortKeys", null);
        setField(term369481, term369481.getClass(), "unsortableColumns", null);
        setField(term369481, term369481.getClass(), "nodeComparator", null);
        setField(term369481, term369481.getClass(), "sortStrategy", null);
        setField(term369481, term369481.getClass(), "viewToModelIndex", null);
        setField(term369481, term369481.getClass(), "modelToViewIndex", null);
        setIntField(term369481, term369481.getClass(), "lastRowCount", 0);
        setBooleanField(term369481, term369481.getClass(), "rebuildIndices", false);
        setField(term369481, term369481.getClass(), "listenerList", null);
        setField(term369480, term369480.getClass(), "rowSorter", term369481);
        setIntField(term369480, term369480.getClass(), "modelIndex", 259489188);
        setElement(term369447, 2, term369480);
        setField(term369432, term369432.getClass(), "viewToModelIndex", term369447);
        setIntElement(term369485, 0, 1709072289);
        setIntElement(term369485, 1, 688786687);
        setIntElement(term369485, 2, 1934256188);
        setIntElement(term369485, 3, 1127725248);
        setIntElement(term369485, 4, 1789414533);
        setIntElement(term369485, 5, -1774273964);
        setField(term369432, term369432.getClass(), "modelToViewIndex", term369485);
        setIntField(term369432, term369432.getClass(), "lastRowCount", -1765697393);
        setBooleanField(term369432, term369432.getClass(), "rebuildIndices", true);
        setField(term369494, term369494.getClass(), "listenerList", term369495);
        setField(term369432, term369432.getClass(), "listenerList", term369494);
        term369496 = new Integer(2101925650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term369432;
        args[1] = term369496;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


