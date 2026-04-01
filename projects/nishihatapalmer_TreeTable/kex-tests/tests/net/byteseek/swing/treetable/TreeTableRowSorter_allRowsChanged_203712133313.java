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

public class TreeTableRowSorter_allRowsChanged_203712133313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100750;

    public TreeTableRowSorter_allRowsChanged_203712133313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100753 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100755 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100753, term100753.getClass(), "column", 1689228897);
        setField(term100755, term100755.getClass(), "name", null);
        setIntField(term100755, term100755.getClass(), "ordinal", 2);
        setField(term100753, term100753.getClass(), "sortOrder", term100755);
        Object term100757 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100759 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100757, term100757.getClass(), "column", 892205855);
        setField(term100759, term100759.getClass(), "name", null);
        setIntField(term100759, term100759.getClass(), "ordinal", 0);
        setField(term100757, term100757.getClass(), "sortOrder", term100759);
        Object term100761 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100761, term100761.getClass(), "column", 1955560079);
        setField(term100761, term100761.getClass(), "sortOrder", term100759);
        Object term100763 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100763, term100763.getClass(), "column", -1330529019);
        setField(term100763, term100763.getClass(), "sortOrder", term100759);
        Object term100765 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100765, term100765.getClass(), "column", 237134844);
        setField(term100765, term100765.getClass(), "sortOrder", term100755);
        Object term100767 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100767, term100767.getClass(), "column", 2076413861);
        setField(term100767, term100767.getClass(), "sortOrder", term100755);
        ArrayList term100751 = new ArrayList();
        ((ArrayList) term100751).add(term100753);
        ((ArrayList) term100751).add(term100757);
        ((ArrayList) term100751).add(term100761);
        ((ArrayList) term100751).add(term100763);
        ((ArrayList) term100751).add(term100765);
        ((ArrayList) term100751).add(term100767);
        ArrayList term100771 = new ArrayList();
        HashMap term100776 = new HashMap();
        Set<Object> term100840 =  ((Map) term100776).keySet();
        HashSet term100775 = new HashSet((Collection<? extends Object>) term100840);
        ArrayList term100805 = new ArrayList();
        ((ArrayList) term100805).add((Object)null);
        ((ArrayList) term100805).add((Object)null);
        ((ArrayList) term100805).add((Object)null);
        ((ArrayList) term100805).add((Object)null);
        ((ArrayList) term100805).add((Object)null);
        ((ArrayList) term100805).add((Object)null);
        ((ArrayList) term100805).add((Object)null);
        ((ArrayList) term100805).add((Object)null);
        ((ArrayList) term100805).add((Object)null);
        ArrayList term100808 = new ArrayList();
        HashSet term100811 = new HashSet();
        ArrayList term100825 = new ArrayList();
        ((ArrayList) term100825).add((Object)null);
        ((ArrayList) term100825).add((Object)null);
        ArrayList term100828 = new ArrayList();
        HashSet term100831 = new HashSet();
        term100750 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100802 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term100803 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100804 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100812 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        int[] term100813 = (int[]) newIntArray(5);
        Object term100821 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term100823 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100824 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term100835 = (int[]) newIntArray(0);
        Object term100838 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100839 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100750, term100750.getClass(), "model", null);
        setField(term100750, term100750.getClass(), "sortKeys", term100751);
        setField(term100750, term100750.getClass(), "defaultSortKeys", term100771);
        setField(term100750, term100750.getClass(), "unsortableColumns", term100775);
        setField(term100750, term100750.getClass(), "nodeComparator", null);
        setField(term100750, term100750.getClass(), "sortStrategy", null);
        setField(term100804, term100804.getClass(), "model", null);
        setField(term100804, term100804.getClass(), "sortKeys", term100805);
        setField(term100804, term100804.getClass(), "defaultSortKeys", term100808);
        setField(term100804, term100804.getClass(), "unsortableColumns", term100811);
        setField(term100804, term100804.getClass(), "nodeComparator", null);
        setField(term100804, term100804.getClass(), "sortStrategy", null);
        setField(term100804, term100804.getClass(), "viewToModelIndex", term100812);
        setIntElement(term100813, 0, -201010601);
        setIntElement(term100813, 1, 2060027076);
        setIntElement(term100813, 2, 2084868811);
        setIntElement(term100813, 3, 314478878);
        setIntElement(term100813, 4, 1425342686);
        setField(term100804, term100804.getClass(), "modelToViewIndex", term100813);
        setIntField(term100804, term100804.getClass(), "lastRowCount", -1042470635);
        setBooleanField(term100804, term100804.getClass(), "rebuildIndices", false);
        setField(term100821, term100821.getClass(), "listenerList", null);
        setField(term100804, term100804.getClass(), "listenerList", term100821);
        setField(term100803, term100803.getClass(), "rowSorter", term100804);
        setIntField(term100803, term100803.getClass(), "modelIndex", -524352937);
        setElement(term100802, 0, term100803);
        setField(term100824, term100824.getClass(), "model", null);
        setField(term100824, term100824.getClass(), "sortKeys", term100825);
        setField(term100824, term100824.getClass(), "defaultSortKeys", term100828);
        setField(term100824, term100824.getClass(), "unsortableColumns", term100831);
        setField(term100824, term100824.getClass(), "nodeComparator", null);
        setField(term100824, term100824.getClass(), "sortStrategy", null);
        setField(term100824, term100824.getClass(), "viewToModelIndex", null);
        setField(term100824, term100824.getClass(), "modelToViewIndex", null);
        setIntField(term100824, term100824.getClass(), "lastRowCount", 0);
        setBooleanField(term100824, term100824.getClass(), "rebuildIndices", false);
        setField(term100824, term100824.getClass(), "listenerList", null);
        setField(term100823, term100823.getClass(), "rowSorter", term100824);
        setIntField(term100823, term100823.getClass(), "modelIndex", 1472218987);
        setElement(term100802, 1, term100823);
        setField(term100750, term100750.getClass(), "viewToModelIndex", term100802);
        setField(term100750, term100750.getClass(), "modelToViewIndex", term100835);
        setIntField(term100750, term100750.getClass(), "lastRowCount", 805176809);
        setBooleanField(term100750, term100750.getClass(), "rebuildIndices", true);
        setField(term100838, term100838.getClass(), "listenerList", term100839);
        setField(term100750, term100750.getClass(), "listenerList", term100838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "allRowsChanged", argTypes, term100750, args);
    }

};


