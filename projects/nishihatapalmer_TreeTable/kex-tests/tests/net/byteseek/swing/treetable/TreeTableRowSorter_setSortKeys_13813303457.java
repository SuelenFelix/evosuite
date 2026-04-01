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
import java.util.LinkedList;

public class TreeTableRowSorter_setSortKeys_13813303457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100234;
     Object term100273;

    public TreeTableRowSorter_setSortKeys_13813303457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100237 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100239 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100237, term100237.getClass(), "column", -1286686332);
        setField(term100239, term100239.getClass(), "name", null);
        setIntField(term100239, term100239.getClass(), "ordinal", 0);
        setField(term100237, term100237.getClass(), "sortOrder", term100239);
        ArrayList term100235 = new ArrayList();
        ((ArrayList) term100235).add(term100237);
        ArrayList term100243 = new ArrayList();
        HashMap term100248 = new HashMap();
        Set<Object> term100297 =  ((Map) term100248).keySet();
        HashSet term100247 = new HashSet((Collection<? extends Object>) term100297);
        term100234 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100262 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term100263 = (int[]) newIntArray(5);
        Object term100271 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100272 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100234, term100234.getClass(), "model", null);
        setField(term100234, term100234.getClass(), "sortKeys", term100235);
        setField(term100234, term100234.getClass(), "defaultSortKeys", term100243);
        setField(term100234, term100234.getClass(), "unsortableColumns", term100247);
        setField(term100234, term100234.getClass(), "nodeComparator", null);
        setField(term100234, term100234.getClass(), "sortStrategy", null);
        setField(term100234, term100234.getClass(), "viewToModelIndex", term100262);
        setIntElement(term100263, 0, -284885486);
        setIntElement(term100263, 1, 1791984446);
        setIntElement(term100263, 2, 804070622);
        setIntElement(term100263, 3, 1850364894);
        setIntElement(term100263, 4, 915367534);
        setField(term100234, term100234.getClass(), "modelToViewIndex", term100263);
        setIntField(term100234, term100234.getClass(), "lastRowCount", 1949983666);
        setBooleanField(term100234, term100234.getClass(), "rebuildIndices", false);
        setField(term100271, term100271.getClass(), "listenerList", term100272);
        setField(term100234, term100234.getClass(), "listenerList", term100271);
        Object term100276 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100278 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100276, term100276.getClass(), "column", 154111854);
        setField(term100278, term100278.getClass(), "name", "");
        setIntField(term100278, term100278.getClass(), "ordinal", 1);
        setField(term100276, term100276.getClass(), "sortOrder", term100278);
        Object term100282 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100284 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100282, term100282.getClass(), "column", 710986341);
        setField(term100284, term100284.getClass(), "name", null);
        setIntField(term100284, term100284.getClass(), "ordinal", 2);
        setField(term100282, term100282.getClass(), "sortOrder", term100284);
        Object term100287 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100287, term100287.getClass(), "column", -873958002);
        setField(term100287, term100287.getClass(), "sortOrder", term100239);
        term100273 = new LinkedList();
        ((LinkedList) term100273).add(term100276);
        ((LinkedList) term100273).add(term100282);
        ((LinkedList) term100273).add(term100287);
        ((LinkedList) term100273).add((Object)null);
        ((LinkedList) term100273).add((Object)null);
        ((LinkedList) term100273).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term100273;
        callMethod(klass, "setSortKeys", argTypes, term100234, args);
    }

};


