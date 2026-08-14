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

public class TreeTableRowSorter_isSorting_153435136918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100722;

    public TreeTableRowSorter_isSorting_153435136918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term100723 = new ArrayList();
        ArrayList term100727 = new ArrayList();
        HashMap term100732 = new HashMap();
        Set<Object> term100818 =  ((Map) term100732).keySet();
        HashSet term100731 = new HashSet((Collection<? extends Object>) term100818);
        ArrayList term100773 = new ArrayList();
        ((ArrayList) term100773).add((Object)null);
        ((ArrayList) term100773).add((Object)null);
        ((ArrayList) term100773).add((Object)null);
        ((ArrayList) term100773).add((Object)null);
        ((ArrayList) term100773).add((Object)null);
        ((ArrayList) term100773).add((Object)null);
        ArrayList term100776 = new ArrayList();
        HashSet term100779 = new HashSet();
        ArrayList term100794 = new ArrayList();
        ((ArrayList) term100794).add((Object)null);
        ((ArrayList) term100794).add((Object)null);
        ArrayList term100797 = new ArrayList();
        HashSet term100800 = new HashSet();
        term100722 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100770 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term100771 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100772 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100780 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term100781 = (int[]) newIntArray(6);
        Object term100790 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term100792 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100793 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term100804 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100805 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term100809 = (int[]) newIntArray(4);
        Object term100816 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100817 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100722, term100722.getClass(), "model", null);
        setField(term100722, term100722.getClass(), "sortKeys", term100723);
        setField(term100722, term100722.getClass(), "defaultSortKeys", term100727);
        setField(term100722, term100722.getClass(), "unsortableColumns", term100731);
        setField(term100722, term100722.getClass(), "nodeComparator", null);
        setField(term100722, term100722.getClass(), "sortStrategy", null);
        setField(term100772, term100772.getClass(), "model", null);
        setField(term100772, term100772.getClass(), "sortKeys", term100773);
        setField(term100772, term100772.getClass(), "defaultSortKeys", term100776);
        setField(term100772, term100772.getClass(), "unsortableColumns", term100779);
        setField(term100772, term100772.getClass(), "nodeComparator", null);
        setField(term100772, term100772.getClass(), "sortStrategy", null);
        setField(term100772, term100772.getClass(), "viewToModelIndex", term100780);
        setIntElement(term100781, 0, 12581312);
        setIntElement(term100781, 1, 2087383644);
        setIntElement(term100781, 2, 405527523);
        setIntElement(term100781, 3, -1123526433);
        setIntElement(term100781, 4, 910269225);
        setIntElement(term100781, 5, -298852874);
        setField(term100772, term100772.getClass(), "modelToViewIndex", term100781);
        setIntField(term100772, term100772.getClass(), "lastRowCount", 1094297953);
        setBooleanField(term100772, term100772.getClass(), "rebuildIndices", false);
        setField(term100790, term100790.getClass(), "listenerList", null);
        setField(term100772, term100772.getClass(), "listenerList", term100790);
        setField(term100771, term100771.getClass(), "rowSorter", term100772);
        setIntField(term100771, term100771.getClass(), "modelIndex", -329141819);
        setElement(term100770, 0, term100771);
        setField(term100793, term100793.getClass(), "model", null);
        setField(term100793, term100793.getClass(), "sortKeys", term100794);
        setField(term100793, term100793.getClass(), "defaultSortKeys", term100797);
        setField(term100793, term100793.getClass(), "unsortableColumns", term100800);
        setField(term100793, term100793.getClass(), "nodeComparator", null);
        setField(term100793, term100793.getClass(), "sortStrategy", null);
        setField(term100793, term100793.getClass(), "viewToModelIndex", null);
        setField(term100793, term100793.getClass(), "modelToViewIndex", null);
        setIntField(term100793, term100793.getClass(), "lastRowCount", 0);
        setBooleanField(term100793, term100793.getClass(), "rebuildIndices", false);
        setField(term100793, term100793.getClass(), "listenerList", null);
        setField(term100792, term100792.getClass(), "rowSorter", term100793);
        setIntField(term100792, term100792.getClass(), "modelIndex", -963204620);
        setElement(term100770, 1, term100792);
        setField(term100805, term100805.getClass(), "model", null);
        setField(term100805, term100805.getClass(), "sortKeys", null);
        setField(term100805, term100805.getClass(), "defaultSortKeys", null);
        setField(term100805, term100805.getClass(), "unsortableColumns", null);
        setField(term100805, term100805.getClass(), "nodeComparator", null);
        setField(term100805, term100805.getClass(), "sortStrategy", null);
        setField(term100805, term100805.getClass(), "viewToModelIndex", null);
        setField(term100805, term100805.getClass(), "modelToViewIndex", null);
        setIntField(term100805, term100805.getClass(), "lastRowCount", 0);
        setBooleanField(term100805, term100805.getClass(), "rebuildIndices", false);
        setField(term100805, term100805.getClass(), "listenerList", null);
        setField(term100804, term100804.getClass(), "rowSorter", term100805);
        setIntField(term100804, term100804.getClass(), "modelIndex", 172898580);
        setElement(term100770, 2, term100804);
        setField(term100722, term100722.getClass(), "viewToModelIndex", term100770);
        setIntElement(term100809, 0, -777833461);
        setIntElement(term100809, 1, 1583691829);
        setIntElement(term100809, 2, -1468541076);
        setIntElement(term100809, 3, -1796760393);
        setField(term100722, term100722.getClass(), "modelToViewIndex", term100809);
        setIntField(term100722, term100722.getClass(), "lastRowCount", -2099267271);
        setBooleanField(term100722, term100722.getClass(), "rebuildIndices", true);
        setField(term100816, term100816.getClass(), "listenerList", term100817);
        setField(term100722, term100722.getClass(), "listenerList", term100816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSorting", argTypes, term100722, args);
    }

};


