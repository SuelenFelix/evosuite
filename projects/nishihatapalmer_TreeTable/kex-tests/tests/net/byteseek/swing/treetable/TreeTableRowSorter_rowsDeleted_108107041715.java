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

public class TreeTableRowSorter_rowsDeleted_108107041715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100954;
     Object term101021;
     Object term101023;

    public TreeTableRowSorter_rowsDeleted_108107041715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100957 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100959 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100957, term100957.getClass(), "column", 81427089);
        setField(term100959, term100959.getClass(), "name", null);
        setIntField(term100959, term100959.getClass(), "ordinal", 2);
        setField(term100957, term100957.getClass(), "sortOrder", term100959);
        Object term100961 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100961, term100961.getClass(), "column", 755951489);
        setField(term100961, term100961.getClass(), "sortOrder", term100959);
        Object term100963 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100965 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100963, term100963.getClass(), "column", 1175146356);
        setField(term100965, term100965.getClass(), "name", null);
        setIntField(term100965, term100965.getClass(), "ordinal", 1);
        setField(term100963, term100963.getClass(), "sortOrder", term100965);
        Object term100967 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100967, term100967.getClass(), "column", -2137419728);
        setField(term100967, term100967.getClass(), "sortOrder", term100965);
        Object term100969 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100969, term100969.getClass(), "column", 1558810715);
        setField(term100969, term100969.getClass(), "sortOrder", term100959);
        Object term100971 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100971, term100971.getClass(), "column", -382652403);
        setField(term100971, term100971.getClass(), "sortOrder", term100959);
        ArrayList term100955 = new ArrayList();
        ((ArrayList) term100955).add(term100957);
        ((ArrayList) term100955).add(term100961);
        ((ArrayList) term100955).add(term100963);
        ((ArrayList) term100955).add(term100967);
        ((ArrayList) term100955).add(term100969);
        ((ArrayList) term100955).add(term100971);
        ArrayList term100975 = new ArrayList();
        HashMap term100980 = new HashMap();
        Set<Object> term101025 =  ((Map) term100980).keySet();
        HashSet term100979 = new HashSet((Collection<? extends Object>) term101025);
        term100954 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101010 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term101011 = (int[]) newIntArray(5);
        Object term101019 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term101020 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100954, term100954.getClass(), "model", null);
        setField(term100954, term100954.getClass(), "sortKeys", term100955);
        setField(term100954, term100954.getClass(), "defaultSortKeys", term100975);
        setField(term100954, term100954.getClass(), "unsortableColumns", term100979);
        setField(term100954, term100954.getClass(), "nodeComparator", null);
        setField(term100954, term100954.getClass(), "sortStrategy", null);
        setField(term100954, term100954.getClass(), "viewToModelIndex", term101010);
        setIntElement(term101011, 0, -2126539433);
        setIntElement(term101011, 1, 196952878);
        setIntElement(term101011, 2, 802673242);
        setIntElement(term101011, 3, -1808638031);
        setIntElement(term101011, 4, -1514240086);
        setField(term100954, term100954.getClass(), "modelToViewIndex", term101011);
        setIntField(term100954, term100954.getClass(), "lastRowCount", 2052244839);
        setBooleanField(term100954, term100954.getClass(), "rebuildIndices", false);
        setField(term101019, term101019.getClass(), "listenerList", term101020);
        setField(term100954, term100954.getClass(), "listenerList", term101019);
        term101021 = new Integer(-1763480506);
        term101023 = new Integer(-1541297110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term101021;
        args[1] = term101023;
        callMethod(klass, "rowsDeleted", argTypes, term100954, args);
    }

};


