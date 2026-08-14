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

public class TreeTableRowSorter_getViewIndexOfLastChild_100287687349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104086;
     Object term104149;

    public TreeTableRowSorter_getViewIndexOfLastChild_100287687349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104089 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104091 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104089, term104089.getClass(), "column", -184659375);
        setField(term104091, term104091.getClass(), "name", null);
        setIntField(term104091, term104091.getClass(), "ordinal", 0);
        setField(term104089, term104089.getClass(), "sortOrder", term104091);
        Object term104093 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104095 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104093, term104093.getClass(), "column", 629005618);
        setField(term104095, term104095.getClass(), "name", null);
        setIntField(term104095, term104095.getClass(), "ordinal", 1);
        setField(term104093, term104093.getClass(), "sortOrder", term104095);
        Object term104097 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104099 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104097, term104097.getClass(), "column", -2006508013);
        setField(term104099, term104099.getClass(), "name", null);
        setIntField(term104099, term104099.getClass(), "ordinal", 2);
        setField(term104097, term104097.getClass(), "sortOrder", term104099);
        Object term104101 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104101, term104101.getClass(), "column", 974951631);
        setField(term104101, term104101.getClass(), "sortOrder", term104091);
        Object term104103 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104103, term104103.getClass(), "column", -942202284);
        setField(term104103, term104103.getClass(), "sortOrder", term104091);
        ArrayList term104087 = new ArrayList();
        ((ArrayList) term104087).add(term104089);
        ((ArrayList) term104087).add(term104093);
        ((ArrayList) term104087).add(term104097);
        ((ArrayList) term104087).add(term104101);
        ((ArrayList) term104087).add(term104103);
        ArrayList term104107 = new ArrayList();
        HashMap term104112 = new HashMap();
        Set<Object> term104151 =  ((Map) term104112).keySet();
        HashSet term104111 = new HashSet((Collection<? extends Object>) term104151);
        term104086 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104142 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term104143 = (int[]) newIntArray(1);
        Object term104147 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term104148 = (Object[]) newArray("java.lang.Object", 0);
        setField(term104086, term104086.getClass(), "model", null);
        setField(term104086, term104086.getClass(), "sortKeys", term104087);
        setField(term104086, term104086.getClass(), "defaultSortKeys", term104107);
        setField(term104086, term104086.getClass(), "unsortableColumns", term104111);
        setField(term104086, term104086.getClass(), "nodeComparator", null);
        setField(term104086, term104086.getClass(), "sortStrategy", null);
        setField(term104086, term104086.getClass(), "viewToModelIndex", term104142);
        setIntElement(term104143, 0, -2083254556);
        setField(term104086, term104086.getClass(), "modelToViewIndex", term104143);
        setIntField(term104086, term104086.getClass(), "lastRowCount", 1452346261);
        setBooleanField(term104086, term104086.getClass(), "rebuildIndices", false);
        setField(term104147, term104147.getClass(), "listenerList", term104148);
        setField(term104086, term104086.getClass(), "listenerList", term104147);
        term104149 = new Integer(-548776693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term104149;
        callMethod(klass, "getViewIndexOfLastChild", argTypes, term104086, args);
    }

};


