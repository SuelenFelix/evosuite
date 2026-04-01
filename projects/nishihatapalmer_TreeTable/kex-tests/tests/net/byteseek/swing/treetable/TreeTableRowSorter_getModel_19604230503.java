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

public class TreeTableRowSorter_getModel_19604230503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99829;

    public TreeTableRowSorter_getModel_19604230503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99832 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99834 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term99832, term99832.getClass(), "column", -280113263);
        setField(term99834, term99834.getClass(), "name", null);
        setIntField(term99834, term99834.getClass(), "ordinal", 0);
        setField(term99832, term99832.getClass(), "sortOrder", term99834);
        Object term99836 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99838 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term99836, term99836.getClass(), "column", 529625347);
        setField(term99838, term99838.getClass(), "name", null);
        setIntField(term99838, term99838.getClass(), "ordinal", 1);
        setField(term99836, term99836.getClass(), "sortOrder", term99838);
        Object term99840 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99840, term99840.getClass(), "column", 1409095253);
        setField(term99840, term99840.getClass(), "sortOrder", term99834);
        ArrayList term99830 = new ArrayList();
        ((ArrayList) term99830).add(term99832);
        ((ArrayList) term99830).add(term99836);
        ((ArrayList) term99830).add(term99840);
        ArrayList term99844 = new ArrayList();
        HashMap term99849 = new HashMap();
        Set<Object> term99909 =  ((Map) term99849).keySet();
        HashSet term99848 = new HashSet((Collection<? extends Object>) term99909);
        ArrayList term99878 = new ArrayList();
        ((ArrayList) term99878).add((Object)null);
        ((ArrayList) term99878).add((Object)null);
        ((ArrayList) term99878).add((Object)null);
        ArrayList term99881 = new ArrayList();
        HashSet term99884 = new HashSet();
        term99829 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term99875 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 1);
        Object term99876 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99877 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term99885 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        int[] term99886 = (int[]) newIntArray(9);
        Object term99898 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        int[] term99900 = (int[]) newIntArray(4);
        Object term99907 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term99908 = (Object[]) newArray("java.lang.Object", 0);
        setField(term99829, term99829.getClass(), "model", null);
        setField(term99829, term99829.getClass(), "sortKeys", term99830);
        setField(term99829, term99829.getClass(), "defaultSortKeys", term99844);
        setField(term99829, term99829.getClass(), "unsortableColumns", term99848);
        setField(term99829, term99829.getClass(), "nodeComparator", null);
        setField(term99829, term99829.getClass(), "sortStrategy", null);
        setField(term99877, term99877.getClass(), "model", null);
        setField(term99877, term99877.getClass(), "sortKeys", term99878);
        setField(term99877, term99877.getClass(), "defaultSortKeys", term99881);
        setField(term99877, term99877.getClass(), "unsortableColumns", term99884);
        setField(term99877, term99877.getClass(), "nodeComparator", null);
        setField(term99877, term99877.getClass(), "sortStrategy", null);
        setField(term99877, term99877.getClass(), "viewToModelIndex", term99885);
        setIntElement(term99886, 0, 1418551216);
        setIntElement(term99886, 1, -626779272);
        setIntElement(term99886, 2, -1150062870);
        setIntElement(term99886, 3, -886200503);
        setIntElement(term99886, 4, 1136393691);
        setIntElement(term99886, 5, -1288536479);
        setIntElement(term99886, 6, 1092038167);
        setIntElement(term99886, 7, 1879729823);
        setIntElement(term99886, 8, 1443855558);
        setField(term99877, term99877.getClass(), "modelToViewIndex", term99886);
        setIntField(term99877, term99877.getClass(), "lastRowCount", -1933419449);
        setBooleanField(term99877, term99877.getClass(), "rebuildIndices", true);
        setField(term99898, term99898.getClass(), "listenerList", null);
        setField(term99877, term99877.getClass(), "listenerList", term99898);
        setField(term99876, term99876.getClass(), "rowSorter", term99877);
        setIntField(term99876, term99876.getClass(), "modelIndex", -1804322375);
        setElement(term99875, 0, term99876);
        setField(term99829, term99829.getClass(), "viewToModelIndex", term99875);
        setIntElement(term99900, 0, 1595814906);
        setIntElement(term99900, 1, -834193529);
        setIntElement(term99900, 2, 335780735);
        setIntElement(term99900, 3, -1541981599);
        setField(term99829, term99829.getClass(), "modelToViewIndex", term99900);
        setIntField(term99829, term99829.getClass(), "lastRowCount", 1605456363);
        setBooleanField(term99829, term99829.getClass(), "rebuildIndices", false);
        setField(term99907, term99907.getClass(), "listenerList", term99908);
        setField(term99829, term99829.getClass(), "listenerList", term99907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModel", argTypes, term99829, args);
    }

};


