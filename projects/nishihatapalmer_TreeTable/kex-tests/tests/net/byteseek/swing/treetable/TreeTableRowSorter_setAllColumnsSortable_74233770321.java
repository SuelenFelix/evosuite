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

public class TreeTableRowSorter_setAllColumnsSortable_74233770321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101605;

    public TreeTableRowSorter_setAllColumnsSortable_74233770321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101608 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101610 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101608, term101608.getClass(), "column", -831921156);
        setField(term101610, term101610.getClass(), "name", null);
        setIntField(term101610, term101610.getClass(), "ordinal", 1);
        setField(term101608, term101608.getClass(), "sortOrder", term101610);
        Object term101612 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101614 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101612, term101612.getClass(), "column", -2085566906);
        setField(term101614, term101614.getClass(), "name", null);
        setIntField(term101614, term101614.getClass(), "ordinal", 0);
        setField(term101612, term101612.getClass(), "sortOrder", term101614);
        Object term101616 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101616, term101616.getClass(), "column", 1773193728);
        setField(term101616, term101616.getClass(), "sortOrder", term101614);
        Object term101618 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101618, term101618.getClass(), "column", -1341357647);
        setField(term101618, term101618.getClass(), "sortOrder", term101610);
        ArrayList term101606 = new ArrayList();
        ((ArrayList) term101606).add(term101608);
        ((ArrayList) term101606).add(term101612);
        ((ArrayList) term101606).add(term101616);
        ((ArrayList) term101606).add(term101618);
        ArrayList term101622 = new ArrayList();
        HashMap term101627 = new HashMap();
        Set<Object> term101693 =  ((Map) term101627).keySet();
        HashSet term101626 = new HashSet((Collection<? extends Object>) term101693);
        ArrayList term101648 = new ArrayList();
        ((ArrayList) term101648).add((Object)null);
        ((ArrayList) term101648).add((Object)null);
        ((ArrayList) term101648).add((Object)null);
        ((ArrayList) term101648).add((Object)null);
        ((ArrayList) term101648).add((Object)null);
        ((ArrayList) term101648).add((Object)null);
        ((ArrayList) term101648).add((Object)null);
        ((ArrayList) term101648).add((Object)null);
        ((ArrayList) term101648).add((Object)null);
        ArrayList term101651 = new ArrayList();
        HashSet term101654 = new HashSet();
        ArrayList term101665 = new ArrayList();
        ((ArrayList) term101665).add((Object)null);
        ((ArrayList) term101665).add((Object)null);
        ((ArrayList) term101665).add((Object)null);
        ((ArrayList) term101665).add((Object)null);
        ((ArrayList) term101665).add((Object)null);
        ((ArrayList) term101665).add((Object)null);
        ((ArrayList) term101665).add((Object)null);
        ArrayList term101668 = new ArrayList();
        HashSet term101671 = new HashSet();
        term101605 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101645 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term101646 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101647 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101655 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 5);
        int[] term101656 = (int[]) newIntArray(2);
        Object term101661 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term101663 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101664 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101675 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101676 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term101680 = (int[]) newIntArray(8);
        Object term101691 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term101692 = (Object[]) newArray("java.lang.Object", 0);
        setField(term101605, term101605.getClass(), "model", null);
        setField(term101605, term101605.getClass(), "sortKeys", term101606);
        setField(term101605, term101605.getClass(), "defaultSortKeys", term101622);
        setField(term101605, term101605.getClass(), "unsortableColumns", term101626);
        setField(term101605, term101605.getClass(), "nodeComparator", null);
        setField(term101605, term101605.getClass(), "sortStrategy", null);
        setField(term101647, term101647.getClass(), "model", null);
        setField(term101647, term101647.getClass(), "sortKeys", term101648);
        setField(term101647, term101647.getClass(), "defaultSortKeys", term101651);
        setField(term101647, term101647.getClass(), "unsortableColumns", term101654);
        setField(term101647, term101647.getClass(), "nodeComparator", null);
        setField(term101647, term101647.getClass(), "sortStrategy", null);
        setField(term101647, term101647.getClass(), "viewToModelIndex", term101655);
        setIntElement(term101656, 0, -1592307668);
        setIntElement(term101656, 1, -203832871);
        setField(term101647, term101647.getClass(), "modelToViewIndex", term101656);
        setIntField(term101647, term101647.getClass(), "lastRowCount", 1151963130);
        setBooleanField(term101647, term101647.getClass(), "rebuildIndices", true);
        setField(term101661, term101661.getClass(), "listenerList", null);
        setField(term101647, term101647.getClass(), "listenerList", term101661);
        setField(term101646, term101646.getClass(), "rowSorter", term101647);
        setIntField(term101646, term101646.getClass(), "modelIndex", -1855819749);
        setElement(term101645, 0, term101646);
        setField(term101664, term101664.getClass(), "model", null);
        setField(term101664, term101664.getClass(), "sortKeys", term101665);
        setField(term101664, term101664.getClass(), "defaultSortKeys", term101668);
        setField(term101664, term101664.getClass(), "unsortableColumns", term101671);
        setField(term101664, term101664.getClass(), "nodeComparator", null);
        setField(term101664, term101664.getClass(), "sortStrategy", null);
        setField(term101664, term101664.getClass(), "viewToModelIndex", null);
        setField(term101664, term101664.getClass(), "modelToViewIndex", null);
        setIntField(term101664, term101664.getClass(), "lastRowCount", 0);
        setBooleanField(term101664, term101664.getClass(), "rebuildIndices", false);
        setField(term101664, term101664.getClass(), "listenerList", null);
        setField(term101663, term101663.getClass(), "rowSorter", term101664);
        setIntField(term101663, term101663.getClass(), "modelIndex", 1059048043);
        setElement(term101645, 1, term101663);
        setField(term101676, term101676.getClass(), "model", null);
        setField(term101676, term101676.getClass(), "sortKeys", null);
        setField(term101676, term101676.getClass(), "defaultSortKeys", null);
        setField(term101676, term101676.getClass(), "unsortableColumns", null);
        setField(term101676, term101676.getClass(), "nodeComparator", null);
        setField(term101676, term101676.getClass(), "sortStrategy", null);
        setField(term101676, term101676.getClass(), "viewToModelIndex", null);
        setField(term101676, term101676.getClass(), "modelToViewIndex", null);
        setIntField(term101676, term101676.getClass(), "lastRowCount", 0);
        setBooleanField(term101676, term101676.getClass(), "rebuildIndices", false);
        setField(term101676, term101676.getClass(), "listenerList", null);
        setField(term101675, term101675.getClass(), "rowSorter", term101676);
        setIntField(term101675, term101675.getClass(), "modelIndex", 537273345);
        setElement(term101645, 2, term101675);
        setField(term101605, term101605.getClass(), "viewToModelIndex", term101645);
        setIntElement(term101680, 0, -346107257);
        setIntElement(term101680, 1, -1577393360);
        setIntElement(term101680, 2, 1112256038);
        setIntElement(term101680, 3, -441333794);
        setIntElement(term101680, 4, 1504698817);
        setIntElement(term101680, 5, -2018333791);
        setIntElement(term101680, 6, -742476678);
        setIntElement(term101680, 7, -824369460);
        setField(term101605, term101605.getClass(), "modelToViewIndex", term101680);
        setIntField(term101605, term101605.getClass(), "lastRowCount", -1573760035);
        setBooleanField(term101605, term101605.getClass(), "rebuildIndices", true);
        setField(term101691, term101691.getClass(), "listenerList", term101692);
        setField(term101605, term101605.getClass(), "listenerList", term101691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setAllColumnsSortable", argTypes, term101605, args);
    }

};


