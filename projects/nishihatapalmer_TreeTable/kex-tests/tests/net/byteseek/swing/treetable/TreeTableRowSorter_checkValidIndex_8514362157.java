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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class TreeTableRowSorter_checkValidIndex_8514362157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105338;
     Object term105430;
     Object term105432;

    public TreeTableRowSorter_checkValidIndex_8514362157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term105339 = new ArrayList();
        ArrayList term105343 = new ArrayList();
        HashMap term105348 = new HashMap();
        Set<Object> term105434 =  ((Map) term105348).keySet();
        HashSet term105347 = new HashSet((Collection<? extends Object>) term105434);
        ArrayList term105377 = new ArrayList();
        ((ArrayList) term105377).add((Object)null);
        ((ArrayList) term105377).add((Object)null);
        ((ArrayList) term105377).add((Object)null);
        ArrayList term105380 = new ArrayList();
        HashSet term105383 = new HashSet();
        ArrayList term105394 = new ArrayList();
        ((ArrayList) term105394).add((Object)null);
        ArrayList term105397 = new ArrayList();
        HashSet term105400 = new HashSet();
        term105338 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term105374 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        Object term105375 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term105376 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term105384 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term105385 = (int[]) newIntArray(2);
        Object term105390 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term105392 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term105393 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term105404 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term105405 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term105409 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term105410 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term105414 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term105415 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term105419 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term105420 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term105424 = (int[]) newIntArray(1);
        Object term105428 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term105429 = (Object[]) newArray("java.lang.Object", 0);
        setField(term105338, term105338.getClass(), "model", null);
        setField(term105338, term105338.getClass(), "sortKeys", term105339);
        setField(term105338, term105338.getClass(), "defaultSortKeys", term105343);
        setField(term105338, term105338.getClass(), "unsortableColumns", term105347);
        setField(term105338, term105338.getClass(), "nodeComparator", null);
        setField(term105338, term105338.getClass(), "sortStrategy", null);
        setField(term105376, term105376.getClass(), "model", null);
        setField(term105376, term105376.getClass(), "sortKeys", term105377);
        setField(term105376, term105376.getClass(), "defaultSortKeys", term105380);
        setField(term105376, term105376.getClass(), "unsortableColumns", term105383);
        setField(term105376, term105376.getClass(), "nodeComparator", null);
        setField(term105376, term105376.getClass(), "sortStrategy", null);
        setField(term105376, term105376.getClass(), "viewToModelIndex", term105384);
        setIntElement(term105385, 0, -377697034);
        setIntElement(term105385, 1, 1102778743);
        setField(term105376, term105376.getClass(), "modelToViewIndex", term105385);
        setIntField(term105376, term105376.getClass(), "lastRowCount", 1300928519);
        setBooleanField(term105376, term105376.getClass(), "rebuildIndices", false);
        setField(term105390, term105390.getClass(), "listenerList", null);
        setField(term105376, term105376.getClass(), "listenerList", term105390);
        setField(term105375, term105375.getClass(), "rowSorter", term105376);
        setIntField(term105375, term105375.getClass(), "modelIndex", 338172676);
        setElement(term105374, 0, term105375);
        setField(term105393, term105393.getClass(), "model", null);
        setField(term105393, term105393.getClass(), "sortKeys", term105394);
        setField(term105393, term105393.getClass(), "defaultSortKeys", term105397);
        setField(term105393, term105393.getClass(), "unsortableColumns", term105400);
        setField(term105393, term105393.getClass(), "nodeComparator", null);
        setField(term105393, term105393.getClass(), "sortStrategy", null);
        setField(term105393, term105393.getClass(), "viewToModelIndex", null);
        setField(term105393, term105393.getClass(), "modelToViewIndex", null);
        setIntField(term105393, term105393.getClass(), "lastRowCount", 0);
        setBooleanField(term105393, term105393.getClass(), "rebuildIndices", false);
        setField(term105393, term105393.getClass(), "listenerList", null);
        setField(term105392, term105392.getClass(), "rowSorter", term105393);
        setIntField(term105392, term105392.getClass(), "modelIndex", -1896960942);
        setElement(term105374, 1, term105392);
        setField(term105405, term105405.getClass(), "model", null);
        setField(term105405, term105405.getClass(), "sortKeys", null);
        setField(term105405, term105405.getClass(), "defaultSortKeys", null);
        setField(term105405, term105405.getClass(), "unsortableColumns", null);
        setField(term105405, term105405.getClass(), "nodeComparator", null);
        setField(term105405, term105405.getClass(), "sortStrategy", null);
        setField(term105405, term105405.getClass(), "viewToModelIndex", null);
        setField(term105405, term105405.getClass(), "modelToViewIndex", null);
        setIntField(term105405, term105405.getClass(), "lastRowCount", 0);
        setBooleanField(term105405, term105405.getClass(), "rebuildIndices", false);
        setField(term105405, term105405.getClass(), "listenerList", null);
        setField(term105404, term105404.getClass(), "rowSorter", term105405);
        setIntField(term105404, term105404.getClass(), "modelIndex", -935912608);
        setElement(term105374, 2, term105404);
        setField(term105410, term105410.getClass(), "model", null);
        setField(term105410, term105410.getClass(), "sortKeys", null);
        setField(term105410, term105410.getClass(), "defaultSortKeys", null);
        setField(term105410, term105410.getClass(), "unsortableColumns", null);
        setField(term105410, term105410.getClass(), "nodeComparator", null);
        setField(term105410, term105410.getClass(), "sortStrategy", null);
        setField(term105410, term105410.getClass(), "viewToModelIndex", null);
        setField(term105410, term105410.getClass(), "modelToViewIndex", null);
        setIntField(term105410, term105410.getClass(), "lastRowCount", 0);
        setBooleanField(term105410, term105410.getClass(), "rebuildIndices", false);
        setField(term105410, term105410.getClass(), "listenerList", null);
        setField(term105409, term105409.getClass(), "rowSorter", term105410);
        setIntField(term105409, term105409.getClass(), "modelIndex", 505087197);
        setElement(term105374, 3, term105409);
        setField(term105415, term105415.getClass(), "model", null);
        setField(term105415, term105415.getClass(), "sortKeys", null);
        setField(term105415, term105415.getClass(), "defaultSortKeys", null);
        setField(term105415, term105415.getClass(), "unsortableColumns", null);
        setField(term105415, term105415.getClass(), "nodeComparator", null);
        setField(term105415, term105415.getClass(), "sortStrategy", null);
        setField(term105415, term105415.getClass(), "viewToModelIndex", null);
        setField(term105415, term105415.getClass(), "modelToViewIndex", null);
        setIntField(term105415, term105415.getClass(), "lastRowCount", 0);
        setBooleanField(term105415, term105415.getClass(), "rebuildIndices", false);
        setField(term105415, term105415.getClass(), "listenerList", null);
        setField(term105414, term105414.getClass(), "rowSorter", term105415);
        setIntField(term105414, term105414.getClass(), "modelIndex", 427005798);
        setElement(term105374, 4, term105414);
        setField(term105420, term105420.getClass(), "model", null);
        setField(term105420, term105420.getClass(), "sortKeys", null);
        setField(term105420, term105420.getClass(), "defaultSortKeys", null);
        setField(term105420, term105420.getClass(), "unsortableColumns", null);
        setField(term105420, term105420.getClass(), "nodeComparator", null);
        setField(term105420, term105420.getClass(), "sortStrategy", null);
        setField(term105420, term105420.getClass(), "viewToModelIndex", null);
        setField(term105420, term105420.getClass(), "modelToViewIndex", null);
        setIntField(term105420, term105420.getClass(), "lastRowCount", 0);
        setBooleanField(term105420, term105420.getClass(), "rebuildIndices", false);
        setField(term105420, term105420.getClass(), "listenerList", null);
        setField(term105419, term105419.getClass(), "rowSorter", term105420);
        setIntField(term105419, term105419.getClass(), "modelIndex", -993454505);
        setElement(term105374, 5, term105419);
        setField(term105338, term105338.getClass(), "viewToModelIndex", term105374);
        setIntElement(term105424, 0, -238353821);
        setField(term105338, term105338.getClass(), "modelToViewIndex", term105424);
        setIntField(term105338, term105338.getClass(), "lastRowCount", -818992228);
        setBooleanField(term105338, term105338.getClass(), "rebuildIndices", false);
        setField(term105428, term105428.getClass(), "listenerList", term105429);
        setField(term105338, term105338.getClass(), "listenerList", term105428);
        term105430 = new Integer(2087429143);
        term105432 = new Integer(-1892890104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term105430;
        args[1] = term105432;
        callMethod(klass, "checkValidIndex", argTypes, term105338, args);
    }

};


