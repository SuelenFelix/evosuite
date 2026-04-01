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

public class TreeTableRowSorter_rowsInserted_206317846214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100846;
     Object term100941;
     Object term100943;

    public TreeTableRowSorter_rowsInserted_206317846214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100849 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100851 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100849, term100849.getClass(), "column", -82632953);
        setField(term100851, term100851.getClass(), "name", null);
        setIntField(term100851, term100851.getClass(), "ordinal", 2);
        setField(term100849, term100849.getClass(), "sortOrder", term100851);
        Object term100853 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100853, term100853.getClass(), "column", -1473876284);
        setField(term100853, term100853.getClass(), "sortOrder", term100851);
        Object term100855 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100857 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100855, term100855.getClass(), "column", -1389314671);
        setField(term100857, term100857.getClass(), "name", null);
        setIntField(term100857, term100857.getClass(), "ordinal", 1);
        setField(term100855, term100855.getClass(), "sortOrder", term100857);
        Object term100859 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100861 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100859, term100859.getClass(), "column", -499699841);
        setField(term100861, term100861.getClass(), "name", null);
        setIntField(term100861, term100861.getClass(), "ordinal", 0);
        setField(term100859, term100859.getClass(), "sortOrder", term100861);
        Object term100863 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100863, term100863.getClass(), "column", 360972386);
        setField(term100863, term100863.getClass(), "sortOrder", term100857);
        Object term100865 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100865, term100865.getClass(), "column", -2063884849);
        setField(term100865, term100865.getClass(), "sortOrder", term100857);
        ArrayList term100847 = new ArrayList();
        ((ArrayList) term100847).add(term100849);
        ((ArrayList) term100847).add(term100853);
        ((ArrayList) term100847).add(term100855);
        ((ArrayList) term100847).add(term100859);
        ((ArrayList) term100847).add(term100863);
        ((ArrayList) term100847).add(term100865);
        ArrayList term100869 = new ArrayList();
        HashMap term100874 = new HashMap();
        Set<Object> term100945 =  ((Map) term100874).keySet();
        HashSet term100873 = new HashSet((Collection<? extends Object>) term100945);
        ArrayList term100903 = new ArrayList();
        ArrayList term100906 = new ArrayList();
        HashSet term100909 = new HashSet();
        ArrayList term100926 = new ArrayList();
        ArrayList term100929 = new ArrayList();
        HashSet term100932 = new HashSet();
        term100846 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100900 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term100901 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100902 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100910 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term100911 = (int[]) newIntArray(8);
        Object term100922 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term100924 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100925 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term100936 = (int[]) newIntArray(0);
        Object term100939 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100940 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100846, term100846.getClass(), "model", null);
        setField(term100846, term100846.getClass(), "sortKeys", term100847);
        setField(term100846, term100846.getClass(), "defaultSortKeys", term100869);
        setField(term100846, term100846.getClass(), "unsortableColumns", term100873);
        setField(term100846, term100846.getClass(), "nodeComparator", null);
        setField(term100846, term100846.getClass(), "sortStrategy", null);
        setField(term100902, term100902.getClass(), "model", null);
        setField(term100902, term100902.getClass(), "sortKeys", term100903);
        setField(term100902, term100902.getClass(), "defaultSortKeys", term100906);
        setField(term100902, term100902.getClass(), "unsortableColumns", term100909);
        setField(term100902, term100902.getClass(), "nodeComparator", null);
        setField(term100902, term100902.getClass(), "sortStrategy", null);
        setField(term100902, term100902.getClass(), "viewToModelIndex", term100910);
        setIntElement(term100911, 0, 1054887169);
        setIntElement(term100911, 1, 692873905);
        setIntElement(term100911, 2, 1734759369);
        setIntElement(term100911, 3, 1841493736);
        setIntElement(term100911, 4, 320739944);
        setIntElement(term100911, 5, 760218111);
        setIntElement(term100911, 6, -1986366126);
        setIntElement(term100911, 7, -1963228619);
        setField(term100902, term100902.getClass(), "modelToViewIndex", term100911);
        setIntField(term100902, term100902.getClass(), "lastRowCount", -709868952);
        setBooleanField(term100902, term100902.getClass(), "rebuildIndices", true);
        setField(term100922, term100922.getClass(), "listenerList", null);
        setField(term100902, term100902.getClass(), "listenerList", term100922);
        setField(term100901, term100901.getClass(), "rowSorter", term100902);
        setIntField(term100901, term100901.getClass(), "modelIndex", 847207929);
        setElement(term100900, 0, term100901);
        setField(term100925, term100925.getClass(), "model", null);
        setField(term100925, term100925.getClass(), "sortKeys", term100926);
        setField(term100925, term100925.getClass(), "defaultSortKeys", term100929);
        setField(term100925, term100925.getClass(), "unsortableColumns", term100932);
        setField(term100925, term100925.getClass(), "nodeComparator", null);
        setField(term100925, term100925.getClass(), "sortStrategy", null);
        setField(term100925, term100925.getClass(), "viewToModelIndex", null);
        setField(term100925, term100925.getClass(), "modelToViewIndex", null);
        setIntField(term100925, term100925.getClass(), "lastRowCount", 0);
        setBooleanField(term100925, term100925.getClass(), "rebuildIndices", false);
        setField(term100925, term100925.getClass(), "listenerList", null);
        setField(term100924, term100924.getClass(), "rowSorter", term100925);
        setIntField(term100924, term100924.getClass(), "modelIndex", -1665928103);
        setElement(term100900, 1, term100924);
        setField(term100846, term100846.getClass(), "viewToModelIndex", term100900);
        setField(term100846, term100846.getClass(), "modelToViewIndex", term100936);
        setIntField(term100846, term100846.getClass(), "lastRowCount", 1574458332);
        setBooleanField(term100846, term100846.getClass(), "rebuildIndices", false);
        setField(term100939, term100939.getClass(), "listenerList", term100940);
        setField(term100846, term100846.getClass(), "listenerList", term100939);
        term100941 = new Integer(-975856245);
        term100943 = new Integer(-1023366103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term100941;
        args[1] = term100943;
        callMethod(klass, "rowsInserted", argTypes, term100846, args);
    }

};


