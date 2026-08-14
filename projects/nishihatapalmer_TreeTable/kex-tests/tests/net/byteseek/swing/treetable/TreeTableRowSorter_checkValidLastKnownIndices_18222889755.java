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
import java.lang.Integer;

public class TreeTableRowSorter_checkValidLastKnownIndices_18222889755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104694;
     Object term104764;
     Object term104766;

    public TreeTableRowSorter_checkValidLastKnownIndices_18222889755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104697 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104699 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104697, term104697.getClass(), "column", 969573395);
        setField(term104699, term104699.getClass(), "name", null);
        setIntField(term104699, term104699.getClass(), "ordinal", 1);
        setField(term104697, term104697.getClass(), "sortOrder", term104699);
        Object term104701 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104701, term104701.getClass(), "column", -899109027);
        setField(term104701, term104701.getClass(), "sortOrder", term104699);
        ArrayList term104695 = new ArrayList();
        ((ArrayList) term104695).add(term104697);
        ((ArrayList) term104695).add(term104701);
        ArrayList term104705 = new ArrayList();
        HashMap term104710 = new HashMap();
        Set<Object> term104768 =  ((Map) term104710).keySet();
        HashSet term104709 = new HashSet((Collection<? extends Object>) term104768);
        ArrayList term104718 = new ArrayList();
        ((ArrayList) term104718).add((Object)null);
        ((ArrayList) term104718).add((Object)null);
        ((ArrayList) term104718).add((Object)null);
        ((ArrayList) term104718).add((Object)null);
        ((ArrayList) term104718).add((Object)null);
        ((ArrayList) term104718).add((Object)null);
        ((ArrayList) term104718).add((Object)null);
        ((ArrayList) term104718).add((Object)null);
        ArrayList term104721 = new ArrayList();
        HashSet term104724 = new HashSet();
        ArrayList term104742 = new ArrayList();
        ((ArrayList) term104742).add((Object)null);
        ((ArrayList) term104742).add((Object)null);
        ArrayList term104745 = new ArrayList();
        HashSet term104748 = new HashSet();
        term104694 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104715 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term104716 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104717 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104725 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term104726 = (int[]) newIntArray(9);
        Object term104738 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term104740 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104741 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term104752 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104753 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term104757 = (int[]) newIntArray(2);
        Object term104762 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term104763 = (Object[]) newArray("java.lang.Object", 0);
        setField(term104694, term104694.getClass(), "model", null);
        setField(term104694, term104694.getClass(), "sortKeys", term104695);
        setField(term104694, term104694.getClass(), "defaultSortKeys", term104705);
        setField(term104694, term104694.getClass(), "unsortableColumns", term104709);
        setField(term104694, term104694.getClass(), "nodeComparator", null);
        setField(term104694, term104694.getClass(), "sortStrategy", null);
        setField(term104717, term104717.getClass(), "model", null);
        setField(term104717, term104717.getClass(), "sortKeys", term104718);
        setField(term104717, term104717.getClass(), "defaultSortKeys", term104721);
        setField(term104717, term104717.getClass(), "unsortableColumns", term104724);
        setField(term104717, term104717.getClass(), "nodeComparator", null);
        setField(term104717, term104717.getClass(), "sortStrategy", null);
        setField(term104717, term104717.getClass(), "viewToModelIndex", term104725);
        setIntElement(term104726, 0, 1496590861);
        setIntElement(term104726, 1, 1046957508);
        setIntElement(term104726, 2, -553500478);
        setIntElement(term104726, 3, 841910530);
        setIntElement(term104726, 4, -1415371559);
        setIntElement(term104726, 5, -2083858949);
        setIntElement(term104726, 6, -1878319299);
        setIntElement(term104726, 7, -690862846);
        setIntElement(term104726, 8, 805027262);
        setField(term104717, term104717.getClass(), "modelToViewIndex", term104726);
        setIntField(term104717, term104717.getClass(), "lastRowCount", 717389178);
        setBooleanField(term104717, term104717.getClass(), "rebuildIndices", false);
        setField(term104738, term104738.getClass(), "listenerList", null);
        setField(term104717, term104717.getClass(), "listenerList", term104738);
        setField(term104716, term104716.getClass(), "rowSorter", term104717);
        setIntField(term104716, term104716.getClass(), "modelIndex", -1265226052);
        setElement(term104715, 0, term104716);
        setField(term104741, term104741.getClass(), "model", null);
        setField(term104741, term104741.getClass(), "sortKeys", term104742);
        setField(term104741, term104741.getClass(), "defaultSortKeys", term104745);
        setField(term104741, term104741.getClass(), "unsortableColumns", term104748);
        setField(term104741, term104741.getClass(), "nodeComparator", null);
        setField(term104741, term104741.getClass(), "sortStrategy", null);
        setField(term104741, term104741.getClass(), "viewToModelIndex", null);
        setField(term104741, term104741.getClass(), "modelToViewIndex", null);
        setIntField(term104741, term104741.getClass(), "lastRowCount", 0);
        setBooleanField(term104741, term104741.getClass(), "rebuildIndices", false);
        setField(term104741, term104741.getClass(), "listenerList", null);
        setField(term104740, term104740.getClass(), "rowSorter", term104741);
        setIntField(term104740, term104740.getClass(), "modelIndex", 1970023149);
        setElement(term104715, 1, term104740);
        setField(term104753, term104753.getClass(), "model", null);
        setField(term104753, term104753.getClass(), "sortKeys", null);
        setField(term104753, term104753.getClass(), "defaultSortKeys", null);
        setField(term104753, term104753.getClass(), "unsortableColumns", null);
        setField(term104753, term104753.getClass(), "nodeComparator", null);
        setField(term104753, term104753.getClass(), "sortStrategy", null);
        setField(term104753, term104753.getClass(), "viewToModelIndex", null);
        setField(term104753, term104753.getClass(), "modelToViewIndex", null);
        setIntField(term104753, term104753.getClass(), "lastRowCount", 0);
        setBooleanField(term104753, term104753.getClass(), "rebuildIndices", false);
        setField(term104753, term104753.getClass(), "listenerList", null);
        setField(term104752, term104752.getClass(), "rowSorter", term104753);
        setIntField(term104752, term104752.getClass(), "modelIndex", -336351735);
        setElement(term104715, 2, term104752);
        setField(term104694, term104694.getClass(), "viewToModelIndex", term104715);
        setIntElement(term104757, 0, 1938932230);
        setIntElement(term104757, 1, 1128720609);
        setField(term104694, term104694.getClass(), "modelToViewIndex", term104757);
        setIntField(term104694, term104694.getClass(), "lastRowCount", 216265002);
        setBooleanField(term104694, term104694.getClass(), "rebuildIndices", false);
        setField(term104762, term104762.getClass(), "listenerList", term104763);
        setField(term104694, term104694.getClass(), "listenerList", term104762);
        term104764 = new Integer(-97405660);
        term104766 = new Integer(872278468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term104764;
        args[1] = term104766;
        callMethod(klass, "checkValidLastKnownIndices", argTypes, term104694, args);
    }

};


