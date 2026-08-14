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

public class TreeTableRowSorter_getDefaultSortKeys_208689021626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101652;

    public TreeTableRowSorter_getDefaultSortKeys_208689021626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101655 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101657 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101655, term101655.getClass(), "column", -1440013173);
        setField(term101657, term101657.getClass(), "name", null);
        setIntField(term101657, term101657.getClass(), "ordinal", 1);
        setField(term101655, term101655.getClass(), "sortOrder", term101657);
        Object term101659 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101661 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101659, term101659.getClass(), "column", -288126597);
        setField(term101661, term101661.getClass(), "name", null);
        setIntField(term101661, term101661.getClass(), "ordinal", 2);
        setField(term101659, term101659.getClass(), "sortOrder", term101661);
        Object term101663 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101665 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101663, term101663.getClass(), "column", -218831961);
        setField(term101665, term101665.getClass(), "name", null);
        setIntField(term101665, term101665.getClass(), "ordinal", 0);
        setField(term101663, term101663.getClass(), "sortOrder", term101665);
        Object term101667 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101667, term101667.getClass(), "column", 826765055);
        setField(term101667, term101667.getClass(), "sortOrder", term101661);
        ArrayList term101653 = new ArrayList();
        ((ArrayList) term101653).add(term101655);
        ((ArrayList) term101653).add(term101659);
        ((ArrayList) term101653).add(term101663);
        ((ArrayList) term101653).add(term101667);
        ArrayList term101671 = new ArrayList();
        HashMap term101676 = new HashMap();
        Set<Object> term101748 =  ((Map) term101676).keySet();
        HashSet term101675 = new HashSet((Collection<? extends Object>) term101748);
        ArrayList term101705 = new ArrayList();
        ((ArrayList) term101705).add((Object)null);
        ArrayList term101708 = new ArrayList();
        HashSet term101711 = new HashSet();
        ArrayList term101722 = new ArrayList();
        ((ArrayList) term101722).add((Object)null);
        ((ArrayList) term101722).add((Object)null);
        ((ArrayList) term101722).add((Object)null);
        ArrayList term101725 = new ArrayList();
        HashSet term101728 = new HashSet();
        term101652 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101702 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 4);
        Object term101703 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101704 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101712 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 4);
        int[] term101713 = (int[]) newIntArray(2);
        Object term101718 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term101720 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101721 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101732 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101733 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101737 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101738 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term101742 = (int[]) newIntArray(1);
        Object term101746 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term101747 = (Object[]) newArray("java.lang.Object", 0);
        setField(term101652, term101652.getClass(), "model", null);
        setField(term101652, term101652.getClass(), "sortKeys", term101653);
        setField(term101652, term101652.getClass(), "defaultSortKeys", term101671);
        setField(term101652, term101652.getClass(), "unsortableColumns", term101675);
        setField(term101652, term101652.getClass(), "nodeComparator", null);
        setField(term101652, term101652.getClass(), "sortStrategy", null);
        setField(term101704, term101704.getClass(), "model", null);
        setField(term101704, term101704.getClass(), "sortKeys", term101705);
        setField(term101704, term101704.getClass(), "defaultSortKeys", term101708);
        setField(term101704, term101704.getClass(), "unsortableColumns", term101711);
        setField(term101704, term101704.getClass(), "nodeComparator", null);
        setField(term101704, term101704.getClass(), "sortStrategy", null);
        setField(term101704, term101704.getClass(), "viewToModelIndex", term101712);
        setIntElement(term101713, 0, -1891353352);
        setIntElement(term101713, 1, 113007640);
        setField(term101704, term101704.getClass(), "modelToViewIndex", term101713);
        setIntField(term101704, term101704.getClass(), "lastRowCount", 1782226794);
        setBooleanField(term101704, term101704.getClass(), "rebuildIndices", false);
        setField(term101718, term101718.getClass(), "listenerList", null);
        setField(term101704, term101704.getClass(), "listenerList", term101718);
        setField(term101703, term101703.getClass(), "rowSorter", term101704);
        setIntField(term101703, term101703.getClass(), "modelIndex", 1115327577);
        setElement(term101702, 0, term101703);
        setField(term101721, term101721.getClass(), "model", null);
        setField(term101721, term101721.getClass(), "sortKeys", term101722);
        setField(term101721, term101721.getClass(), "defaultSortKeys", term101725);
        setField(term101721, term101721.getClass(), "unsortableColumns", term101728);
        setField(term101721, term101721.getClass(), "nodeComparator", null);
        setField(term101721, term101721.getClass(), "sortStrategy", null);
        setField(term101721, term101721.getClass(), "viewToModelIndex", null);
        setField(term101721, term101721.getClass(), "modelToViewIndex", null);
        setIntField(term101721, term101721.getClass(), "lastRowCount", 0);
        setBooleanField(term101721, term101721.getClass(), "rebuildIndices", false);
        setField(term101721, term101721.getClass(), "listenerList", null);
        setField(term101720, term101720.getClass(), "rowSorter", term101721);
        setIntField(term101720, term101720.getClass(), "modelIndex", 840704993);
        setElement(term101702, 1, term101720);
        setField(term101733, term101733.getClass(), "model", null);
        setField(term101733, term101733.getClass(), "sortKeys", null);
        setField(term101733, term101733.getClass(), "defaultSortKeys", null);
        setField(term101733, term101733.getClass(), "unsortableColumns", null);
        setField(term101733, term101733.getClass(), "nodeComparator", null);
        setField(term101733, term101733.getClass(), "sortStrategy", null);
        setField(term101733, term101733.getClass(), "viewToModelIndex", null);
        setField(term101733, term101733.getClass(), "modelToViewIndex", null);
        setIntField(term101733, term101733.getClass(), "lastRowCount", 0);
        setBooleanField(term101733, term101733.getClass(), "rebuildIndices", false);
        setField(term101733, term101733.getClass(), "listenerList", null);
        setField(term101732, term101732.getClass(), "rowSorter", term101733);
        setIntField(term101732, term101732.getClass(), "modelIndex", 1297035285);
        setElement(term101702, 2, term101732);
        setField(term101738, term101738.getClass(), "model", null);
        setField(term101738, term101738.getClass(), "sortKeys", null);
        setField(term101738, term101738.getClass(), "defaultSortKeys", null);
        setField(term101738, term101738.getClass(), "unsortableColumns", null);
        setField(term101738, term101738.getClass(), "nodeComparator", null);
        setField(term101738, term101738.getClass(), "sortStrategy", null);
        setField(term101738, term101738.getClass(), "viewToModelIndex", null);
        setField(term101738, term101738.getClass(), "modelToViewIndex", null);
        setIntField(term101738, term101738.getClass(), "lastRowCount", 0);
        setBooleanField(term101738, term101738.getClass(), "rebuildIndices", false);
        setField(term101738, term101738.getClass(), "listenerList", null);
        setField(term101737, term101737.getClass(), "rowSorter", term101738);
        setIntField(term101737, term101737.getClass(), "modelIndex", -826239685);
        setElement(term101702, 3, term101737);
        setField(term101652, term101652.getClass(), "viewToModelIndex", term101702);
        setIntElement(term101742, 0, -845551243);
        setField(term101652, term101652.getClass(), "modelToViewIndex", term101742);
        setIntField(term101652, term101652.getClass(), "lastRowCount", 370671198);
        setBooleanField(term101652, term101652.getClass(), "rebuildIndices", false);
        setField(term101746, term101746.getClass(), "listenerList", term101747);
        setField(term101652, term101652.getClass(), "listenerList", term101746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultSortKeys", argTypes, term101652, args);
    }

};


