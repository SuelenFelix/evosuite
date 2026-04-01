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

public class TreeTableRowSorter_checkValidColumn_61367919754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105021;
     Object term105098;

    public TreeTableRowSorter_checkValidColumn_61367919754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term105024 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term105026 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term105024, term105024.getClass(), "column", -849064032);
        setField(term105026, term105026.getClass(), "name", null);
        setIntField(term105026, term105026.getClass(), "ordinal", 0);
        setField(term105024, term105024.getClass(), "sortOrder", term105026);
        Object term105028 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term105030 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term105028, term105028.getClass(), "column", -184659375);
        setField(term105030, term105030.getClass(), "name", null);
        setIntField(term105030, term105030.getClass(), "ordinal", 2);
        setField(term105028, term105028.getClass(), "sortOrder", term105030);
        ArrayList term105022 = new ArrayList();
        ((ArrayList) term105022).add(term105024);
        ((ArrayList) term105022).add(term105028);
        ArrayList term105034 = new ArrayList();
        HashMap term105039 = new HashMap();
        Set<Object> term105100 =  ((Map) term105039).keySet();
        HashSet term105038 = new HashSet((Collection<? extends Object>) term105100);
        ArrayList term105080 = new ArrayList();
        ((ArrayList) term105080).add((Object)null);
        ((ArrayList) term105080).add((Object)null);
        ((ArrayList) term105080).add((Object)null);
        ((ArrayList) term105080).add((Object)null);
        ((ArrayList) term105080).add((Object)null);
        ((ArrayList) term105080).add((Object)null);
        ((ArrayList) term105080).add((Object)null);
        ((ArrayList) term105080).add((Object)null);
        ((ArrayList) term105080).add((Object)null);
        ArrayList term105083 = new ArrayList();
        HashSet term105086 = new HashSet();
        term105021 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term105077 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 1);
        Object term105078 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term105079 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term105087 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        int[] term105088 = (int[]) newIntArray(0);
        Object term105091 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        int[] term105093 = (int[]) newIntArray(0);
        Object term105096 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term105097 = (Object[]) newArray("java.lang.Object", 0);
        setField(term105021, term105021.getClass(), "model", null);
        setField(term105021, term105021.getClass(), "sortKeys", term105022);
        setField(term105021, term105021.getClass(), "defaultSortKeys", term105034);
        setField(term105021, term105021.getClass(), "unsortableColumns", term105038);
        setField(term105021, term105021.getClass(), "nodeComparator", null);
        setField(term105021, term105021.getClass(), "sortStrategy", null);
        setField(term105079, term105079.getClass(), "model", null);
        setField(term105079, term105079.getClass(), "sortKeys", term105080);
        setField(term105079, term105079.getClass(), "defaultSortKeys", term105083);
        setField(term105079, term105079.getClass(), "unsortableColumns", term105086);
        setField(term105079, term105079.getClass(), "nodeComparator", null);
        setField(term105079, term105079.getClass(), "sortStrategy", null);
        setField(term105079, term105079.getClass(), "viewToModelIndex", term105087);
        setField(term105079, term105079.getClass(), "modelToViewIndex", term105088);
        setIntField(term105079, term105079.getClass(), "lastRowCount", -438794741);
        setBooleanField(term105079, term105079.getClass(), "rebuildIndices", true);
        setField(term105091, term105091.getClass(), "listenerList", null);
        setField(term105079, term105079.getClass(), "listenerList", term105091);
        setField(term105078, term105078.getClass(), "rowSorter", term105079);
        setIntField(term105078, term105078.getClass(), "modelIndex", -1400834481);
        setElement(term105077, 0, term105078);
        setField(term105021, term105021.getClass(), "viewToModelIndex", term105077);
        setField(term105021, term105021.getClass(), "modelToViewIndex", term105093);
        setIntField(term105021, term105021.getClass(), "lastRowCount", 957091706);
        setBooleanField(term105021, term105021.getClass(), "rebuildIndices", false);
        setField(term105096, term105096.getClass(), "listenerList", term105097);
        setField(term105021, term105021.getClass(), "listenerList", term105096);
        term105098 = new Integer(-2011802805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term105098;
        callMethod(klass, "checkValidColumn", argTypes, term105021, args);
    }

};


