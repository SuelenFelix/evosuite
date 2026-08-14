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

public class TreeTableRowSorter_needToSort_134907921231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102163;

    public TreeTableRowSorter_needToSort_134907921231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102166 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102168 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102166, term102166.getClass(), "column", 379523101);
        setField(term102168, term102168.getClass(), "name", null);
        setIntField(term102168, term102168.getClass(), "ordinal", 1);
        setField(term102166, term102166.getClass(), "sortOrder", term102168);
        Object term102170 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term102170, term102170.getClass(), "column", 1017354215);
        setField(term102170, term102170.getClass(), "sortOrder", term102168);
        Object term102172 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102174 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102172, term102172.getClass(), "column", 695330987);
        setField(term102174, term102174.getClass(), "name", null);
        setIntField(term102174, term102174.getClass(), "ordinal", 2);
        setField(term102172, term102172.getClass(), "sortOrder", term102174);
        Object term102176 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term102176, term102176.getClass(), "column", -267289967);
        setField(term102176, term102176.getClass(), "sortOrder", term102168);
        ArrayList term102164 = new ArrayList();
        ((ArrayList) term102164).add(term102166);
        ((ArrayList) term102164).add(term102170);
        ((ArrayList) term102164).add(term102172);
        ((ArrayList) term102164).add(term102176);
        ArrayList term102180 = new ArrayList();
        HashMap term102185 = new HashMap();
        Set<Object> term102230 =  ((Map) term102185).keySet();
        HashSet term102184 = new HashSet((Collection<? extends Object>) term102230);
        ArrayList term102210 = new ArrayList();
        ((ArrayList) term102210).add((Object)null);
        ((ArrayList) term102210).add((Object)null);
        ((ArrayList) term102210).add((Object)null);
        ((ArrayList) term102210).add((Object)null);
        ArrayList term102213 = new ArrayList();
        HashSet term102216 = new HashSet();
        term102163 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102207 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 1);
        Object term102208 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102209 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102217 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term102218 = (int[]) newIntArray(2);
        Object term102223 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        int[] term102225 = (int[]) newIntArray(0);
        Object term102228 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term102229 = (Object[]) newArray("java.lang.Object", 0);
        setField(term102163, term102163.getClass(), "model", null);
        setField(term102163, term102163.getClass(), "sortKeys", term102164);
        setField(term102163, term102163.getClass(), "defaultSortKeys", term102180);
        setField(term102163, term102163.getClass(), "unsortableColumns", term102184);
        setField(term102163, term102163.getClass(), "nodeComparator", null);
        setField(term102163, term102163.getClass(), "sortStrategy", null);
        setField(term102209, term102209.getClass(), "model", null);
        setField(term102209, term102209.getClass(), "sortKeys", term102210);
        setField(term102209, term102209.getClass(), "defaultSortKeys", term102213);
        setField(term102209, term102209.getClass(), "unsortableColumns", term102216);
        setField(term102209, term102209.getClass(), "nodeComparator", null);
        setField(term102209, term102209.getClass(), "sortStrategy", null);
        setField(term102209, term102209.getClass(), "viewToModelIndex", term102217);
        setIntElement(term102218, 0, -1255535445);
        setIntElement(term102218, 1, -2033952124);
        setField(term102209, term102209.getClass(), "modelToViewIndex", term102218);
        setIntField(term102209, term102209.getClass(), "lastRowCount", 560401653);
        setBooleanField(term102209, term102209.getClass(), "rebuildIndices", true);
        setField(term102223, term102223.getClass(), "listenerList", null);
        setField(term102209, term102209.getClass(), "listenerList", term102223);
        setField(term102208, term102208.getClass(), "rowSorter", term102209);
        setIntField(term102208, term102208.getClass(), "modelIndex", 1633691536);
        setElement(term102207, 0, term102208);
        setField(term102163, term102163.getClass(), "viewToModelIndex", term102207);
        setField(term102163, term102163.getClass(), "modelToViewIndex", term102225);
        setIntField(term102163, term102163.getClass(), "lastRowCount", 898165245);
        setBooleanField(term102163, term102163.getClass(), "rebuildIndices", true);
        setField(term102228, term102228.getClass(), "listenerList", term102229);
        setField(term102163, term102163.getClass(), "listenerList", term102228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "needToSort", argTypes, term102163, args);
    }

};


