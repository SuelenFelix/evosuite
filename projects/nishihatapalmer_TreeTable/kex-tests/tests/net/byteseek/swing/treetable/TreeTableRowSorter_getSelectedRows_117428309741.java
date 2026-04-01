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

public class TreeTableRowSorter_getSelectedRows_117428309741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103625;

    public TreeTableRowSorter_getSelectedRows_117428309741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103628 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103630 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103628, term103628.getClass(), "column", 1697296048);
        setField(term103630, term103630.getClass(), "name", null);
        setIntField(term103630, term103630.getClass(), "ordinal", 1);
        setField(term103628, term103628.getClass(), "sortOrder", term103630);
        Object term103632 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103634 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103632, term103632.getClass(), "column", 1302075623);
        setField(term103634, term103634.getClass(), "name", null);
        setIntField(term103634, term103634.getClass(), "ordinal", 0);
        setField(term103632, term103632.getClass(), "sortOrder", term103634);
        Object term103636 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103636, term103636.getClass(), "column", 1238707613);
        setField(term103636, term103636.getClass(), "sortOrder", term103634);
        Object term103638 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103640 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103638, term103638.getClass(), "column", 1961351136);
        setField(term103640, term103640.getClass(), "name", null);
        setIntField(term103640, term103640.getClass(), "ordinal", 2);
        setField(term103638, term103638.getClass(), "sortOrder", term103640);
        Object term103642 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103642, term103642.getClass(), "column", -1546528470);
        setField(term103642, term103642.getClass(), "sortOrder", term103630);
        Object term103644 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103644, term103644.getClass(), "column", -1518971561);
        setField(term103644, term103644.getClass(), "sortOrder", term103640);
        Object term103646 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103646, term103646.getClass(), "column", 1513663171);
        setField(term103646, term103646.getClass(), "sortOrder", term103634);
        ArrayList term103626 = new ArrayList();
        ((ArrayList) term103626).add(term103628);
        ((ArrayList) term103626).add(term103632);
        ((ArrayList) term103626).add(term103636);
        ((ArrayList) term103626).add(term103638);
        ((ArrayList) term103626).add(term103642);
        ((ArrayList) term103626).add(term103644);
        ((ArrayList) term103626).add(term103646);
        ArrayList term103650 = new ArrayList();
        HashMap term103655 = new HashMap();
        Set<Object> term103692 =  ((Map) term103655).keySet();
        HashSet term103654 = new HashSet((Collection<? extends Object>) term103692);
        term103625 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103681 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term103682 = (int[]) newIntArray(5);
        Object term103690 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term103691 = (Object[]) newArray("java.lang.Object", 0);
        setField(term103625, term103625.getClass(), "model", null);
        setField(term103625, term103625.getClass(), "sortKeys", term103626);
        setField(term103625, term103625.getClass(), "defaultSortKeys", term103650);
        setField(term103625, term103625.getClass(), "unsortableColumns", term103654);
        setField(term103625, term103625.getClass(), "nodeComparator", null);
        setField(term103625, term103625.getClass(), "sortStrategy", null);
        setField(term103625, term103625.getClass(), "viewToModelIndex", term103681);
        setIntElement(term103682, 0, 1527034193);
        setIntElement(term103682, 1, 1309545946);
        setIntElement(term103682, 2, -1457812682);
        setIntElement(term103682, 3, -161850441);
        setIntElement(term103682, 4, 1486351894);
        setField(term103625, term103625.getClass(), "modelToViewIndex", term103682);
        setIntField(term103625, term103625.getClass(), "lastRowCount", 1352463113);
        setBooleanField(term103625, term103625.getClass(), "rebuildIndices", false);
        setField(term103690, term103690.getClass(), "listenerList", term103691);
        setField(term103625, term103625.getClass(), "listenerList", term103690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectedRows", argTypes, term103625, args);
    }

};


