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

public class TreeTableRowSorter_buildModelToViewIndex_57542812035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103120;

    public TreeTableRowSorter_buildModelToViewIndex_57542812035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103123 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103125 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103123, term103123.getClass(), "column", -217226756);
        setField(term103125, term103125.getClass(), "name", null);
        setIntField(term103125, term103125.getClass(), "ordinal", 2);
        setField(term103123, term103123.getClass(), "sortOrder", term103125);
        Object term103127 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103129 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103127, term103127.getClass(), "column", 1608000247);
        setField(term103129, term103129.getClass(), "name", null);
        setIntField(term103129, term103129.getClass(), "ordinal", 1);
        setField(term103127, term103127.getClass(), "sortOrder", term103129);
        Object term103131 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103131, term103131.getClass(), "column", 1354560887);
        setField(term103131, term103131.getClass(), "sortOrder", term103125);
        Object term103133 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103133, term103133.getClass(), "column", -749474542);
        setField(term103133, term103133.getClass(), "sortOrder", term103129);
        ArrayList term103121 = new ArrayList();
        ((ArrayList) term103121).add(term103123);
        ((ArrayList) term103121).add(term103127);
        ((ArrayList) term103121).add(term103131);
        ((ArrayList) term103121).add(term103133);
        ArrayList term103137 = new ArrayList();
        HashMap term103142 = new HashMap();
        Set<Object> term103176 =  ((Map) term103142).keySet();
        HashSet term103141 = new HashSet((Collection<? extends Object>) term103176);
        term103120 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103164 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term103165 = (int[]) newIntArray(6);
        Object term103174 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term103175 = (Object[]) newArray("java.lang.Object", 0);
        setField(term103120, term103120.getClass(), "model", null);
        setField(term103120, term103120.getClass(), "sortKeys", term103121);
        setField(term103120, term103120.getClass(), "defaultSortKeys", term103137);
        setField(term103120, term103120.getClass(), "unsortableColumns", term103141);
        setField(term103120, term103120.getClass(), "nodeComparator", null);
        setField(term103120, term103120.getClass(), "sortStrategy", null);
        setField(term103120, term103120.getClass(), "viewToModelIndex", term103164);
        setIntElement(term103165, 0, -47907780);
        setIntElement(term103165, 1, 1131462369);
        setIntElement(term103165, 2, -1161206731);
        setIntElement(term103165, 3, -992847709);
        setIntElement(term103165, 4, 1125156671);
        setIntElement(term103165, 5, 1203107925);
        setField(term103120, term103120.getClass(), "modelToViewIndex", term103165);
        setIntField(term103120, term103120.getClass(), "lastRowCount", 1825448944);
        setBooleanField(term103120, term103120.getClass(), "rebuildIndices", true);
        setField(term103174, term103174.getClass(), "listenerList", term103175);
        setField(term103120, term103120.getClass(), "listenerList", term103174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildModelToViewIndex", argTypes, term103120, args);
    }

};


