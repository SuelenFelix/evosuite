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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class TreeTableRowSorter_SortRow_setModelIndex_4165060103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369702;
     Object term369757;

    public TreeTableRowSorter_SortRow_setModelIndex_4165060103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term369706 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369706, term369706.getClass(), "column", -499081946);
        setField(term369706, term369706.getClass(), "sortOrder", null);
        Object term369708 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369708, term369708.getClass(), "column", 1834067063);
        setField(term369708, term369708.getClass(), "sortOrder", null);
        Object term369710 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369710, term369710.getClass(), "column", -1578513908);
        setField(term369710, term369710.getClass(), "sortOrder", null);
        Object term369712 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369712, term369712.getClass(), "column", 312330930);
        setField(term369712, term369712.getClass(), "sortOrder", null);
        Object term369714 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369714, term369714.getClass(), "column", 1635910980);
        setField(term369714, term369714.getClass(), "sortOrder", null);
        Object term369716 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369716, term369716.getClass(), "column", 1560346640);
        setField(term369716, term369716.getClass(), "sortOrder", null);
        Object term369718 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369718, term369718.getClass(), "column", 100626332);
        setField(term369718, term369718.getClass(), "sortOrder", null);
        Object term369720 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369720, term369720.getClass(), "column", 763794722);
        setField(term369720, term369720.getClass(), "sortOrder", null);
        ArrayList term369704 = new ArrayList();
        ((ArrayList) term369704).add(term369706);
        ((ArrayList) term369704).add(term369708);
        ((ArrayList) term369704).add(term369710);
        ((ArrayList) term369704).add(term369712);
        ((ArrayList) term369704).add(term369714);
        ((ArrayList) term369704).add(term369716);
        ((ArrayList) term369704).add(term369718);
        ((ArrayList) term369704).add(term369720);
        ArrayList term369724 = new ArrayList();
        HashMap term369729 = new HashMap();
        Set<Object> term369759 =  ((Map) term369729).keySet();
        HashSet term369728 = new HashSet((Collection<? extends Object>) term369759);
        term369702 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369703 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term369735 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term369736 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369737 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term369741 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369742 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term369746 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        int[] term369748 = (int[]) newIntArray(3);
        Object term369754 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term369755 = (Object[]) newArray("java.lang.Object", 0);
        setField(term369703, term369703.getClass(), "model", null);
        setField(term369703, term369703.getClass(), "sortKeys", term369704);
        setField(term369703, term369703.getClass(), "defaultSortKeys", term369724);
        setField(term369703, term369703.getClass(), "unsortableColumns", term369728);
        setField(term369703, term369703.getClass(), "nodeComparator", null);
        setField(term369703, term369703.getClass(), "sortStrategy", null);
        setField(term369737, term369737.getClass(), "model", null);
        setField(term369737, term369737.getClass(), "sortKeys", null);
        setField(term369737, term369737.getClass(), "defaultSortKeys", null);
        setField(term369737, term369737.getClass(), "unsortableColumns", null);
        setField(term369737, term369737.getClass(), "nodeComparator", null);
        setField(term369737, term369737.getClass(), "sortStrategy", null);
        setField(term369737, term369737.getClass(), "viewToModelIndex", null);
        setField(term369737, term369737.getClass(), "modelToViewIndex", null);
        setIntField(term369737, term369737.getClass(), "lastRowCount", -266870537);
        setBooleanField(term369737, term369737.getClass(), "rebuildIndices", false);
        setField(term369737, term369737.getClass(), "listenerList", null);
        setField(term369736, term369736.getClass(), "rowSorter", term369737);
        setIntField(term369736, term369736.getClass(), "modelIndex", -453010858);
        setElement(term369735, 0, term369736);
        setField(term369742, term369742.getClass(), "model", null);
        setField(term369742, term369742.getClass(), "sortKeys", null);
        setField(term369742, term369742.getClass(), "defaultSortKeys", null);
        setField(term369742, term369742.getClass(), "unsortableColumns", null);
        setField(term369742, term369742.getClass(), "nodeComparator", null);
        setField(term369742, term369742.getClass(), "sortStrategy", null);
        setField(term369742, term369742.getClass(), "viewToModelIndex", null);
        setField(term369742, term369742.getClass(), "modelToViewIndex", null);
        setIntField(term369742, term369742.getClass(), "lastRowCount", 0);
        setBooleanField(term369742, term369742.getClass(), "rebuildIndices", false);
        setField(term369742, term369742.getClass(), "listenerList", null);
        setField(term369741, term369741.getClass(), "rowSorter", term369742);
        setIntField(term369741, term369741.getClass(), "modelIndex", -1855427206);
        setElement(term369735, 1, term369741);
        setField(term369746, term369746.getClass(), "rowSorter", null);
        setIntField(term369746, term369746.getClass(), "modelIndex", 0);
        setElement(term369735, 2, term369746);
        setField(term369703, term369703.getClass(), "viewToModelIndex", term369735);
        setIntElement(term369748, 0, -647618746);
        setIntElement(term369748, 1, -91129577);
        setIntElement(term369748, 2, 1629059877);
        setField(term369703, term369703.getClass(), "modelToViewIndex", term369748);
        setIntField(term369703, term369703.getClass(), "lastRowCount", -649940550);
        setBooleanField(term369703, term369703.getClass(), "rebuildIndices", true);
        setField(term369754, term369754.getClass(), "listenerList", term369755);
        setField(term369703, term369703.getClass(), "listenerList", term369754);
        setField(term369702, term369702.getClass(), "rowSorter", term369703);
        setIntField(term369702, term369702.getClass(), "modelIndex", 36785954);
        term369757 = new Integer(-907057089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term369757;
        callMethod(klass, "setModelIndex", argTypes, term369702, args);
    }

};


