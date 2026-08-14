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

public class TreeTableRowSorter_getRebuildIndices_39726003138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102836;

    public TreeTableRowSorter_getRebuildIndices_39726003138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102839 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102841 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102839, term102839.getClass(), "column", -615198242);
        setField(term102841, term102841.getClass(), "name", null);
        setIntField(term102841, term102841.getClass(), "ordinal", 2);
        setField(term102839, term102839.getClass(), "sortOrder", term102841);
        Object term102843 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102845 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102843, term102843.getClass(), "column", -491132382);
        setField(term102845, term102845.getClass(), "name", null);
        setIntField(term102845, term102845.getClass(), "ordinal", 1);
        setField(term102843, term102843.getClass(), "sortOrder", term102845);
        ArrayList term102837 = new ArrayList();
        ((ArrayList) term102837).add(term102839);
        ((ArrayList) term102837).add(term102843);
        ArrayList term102849 = new ArrayList();
        HashMap term102854 = new HashMap();
        Set<Object> term102933 =  ((Map) term102854).keySet();
        HashSet term102853 = new HashSet((Collection<? extends Object>) term102933);
        ArrayList term102887 = new ArrayList();
        ((ArrayList) term102887).add((Object)null);
        ArrayList term102890 = new ArrayList();
        HashSet term102893 = new HashSet();
        ArrayList term102904 = new ArrayList();
        ((ArrayList) term102904).add((Object)null);
        ((ArrayList) term102904).add((Object)null);
        ((ArrayList) term102904).add((Object)null);
        ((ArrayList) term102904).add((Object)null);
        ((ArrayList) term102904).add((Object)null);
        ((ArrayList) term102904).add((Object)null);
        ((ArrayList) term102904).add((Object)null);
        ((ArrayList) term102904).add((Object)null);
        ((ArrayList) term102904).add((Object)null);
        ArrayList term102907 = new ArrayList();
        HashSet term102910 = new HashSet();
        term102836 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102884 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term102885 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102886 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102894 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        int[] term102895 = (int[]) newIntArray(2);
        Object term102900 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term102902 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102903 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term102914 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102915 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term102919 = (int[]) newIntArray(9);
        Object term102931 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term102932 = (Object[]) newArray("java.lang.Object", 0);
        setField(term102836, term102836.getClass(), "model", null);
        setField(term102836, term102836.getClass(), "sortKeys", term102837);
        setField(term102836, term102836.getClass(), "defaultSortKeys", term102849);
        setField(term102836, term102836.getClass(), "unsortableColumns", term102853);
        setField(term102836, term102836.getClass(), "nodeComparator", null);
        setField(term102836, term102836.getClass(), "sortStrategy", null);
        setField(term102886, term102886.getClass(), "model", null);
        setField(term102886, term102886.getClass(), "sortKeys", term102887);
        setField(term102886, term102886.getClass(), "defaultSortKeys", term102890);
        setField(term102886, term102886.getClass(), "unsortableColumns", term102893);
        setField(term102886, term102886.getClass(), "nodeComparator", null);
        setField(term102886, term102886.getClass(), "sortStrategy", null);
        setField(term102886, term102886.getClass(), "viewToModelIndex", term102894);
        setIntElement(term102895, 0, 1047409266);
        setIntElement(term102895, 1, 1427248961);
        setField(term102886, term102886.getClass(), "modelToViewIndex", term102895);
        setIntField(term102886, term102886.getClass(), "lastRowCount", 1445291866);
        setBooleanField(term102886, term102886.getClass(), "rebuildIndices", false);
        setField(term102900, term102900.getClass(), "listenerList", null);
        setField(term102886, term102886.getClass(), "listenerList", term102900);
        setField(term102885, term102885.getClass(), "rowSorter", term102886);
        setIntField(term102885, term102885.getClass(), "modelIndex", -139927812);
        setElement(term102884, 0, term102885);
        setField(term102903, term102903.getClass(), "model", null);
        setField(term102903, term102903.getClass(), "sortKeys", term102904);
        setField(term102903, term102903.getClass(), "defaultSortKeys", term102907);
        setField(term102903, term102903.getClass(), "unsortableColumns", term102910);
        setField(term102903, term102903.getClass(), "nodeComparator", null);
        setField(term102903, term102903.getClass(), "sortStrategy", null);
        setField(term102903, term102903.getClass(), "viewToModelIndex", null);
        setField(term102903, term102903.getClass(), "modelToViewIndex", null);
        setIntField(term102903, term102903.getClass(), "lastRowCount", 0);
        setBooleanField(term102903, term102903.getClass(), "rebuildIndices", false);
        setField(term102903, term102903.getClass(), "listenerList", null);
        setField(term102902, term102902.getClass(), "rowSorter", term102903);
        setIntField(term102902, term102902.getClass(), "modelIndex", -2065157320);
        setElement(term102884, 1, term102902);
        setField(term102915, term102915.getClass(), "model", null);
        setField(term102915, term102915.getClass(), "sortKeys", null);
        setField(term102915, term102915.getClass(), "defaultSortKeys", null);
        setField(term102915, term102915.getClass(), "unsortableColumns", null);
        setField(term102915, term102915.getClass(), "nodeComparator", null);
        setField(term102915, term102915.getClass(), "sortStrategy", null);
        setField(term102915, term102915.getClass(), "viewToModelIndex", null);
        setField(term102915, term102915.getClass(), "modelToViewIndex", null);
        setIntField(term102915, term102915.getClass(), "lastRowCount", 0);
        setBooleanField(term102915, term102915.getClass(), "rebuildIndices", false);
        setField(term102915, term102915.getClass(), "listenerList", null);
        setField(term102914, term102914.getClass(), "rowSorter", term102915);
        setIntField(term102914, term102914.getClass(), "modelIndex", 1782011477);
        setElement(term102884, 2, term102914);
        setField(term102836, term102836.getClass(), "viewToModelIndex", term102884);
        setIntElement(term102919, 0, 2129957018);
        setIntElement(term102919, 1, 691663312);
        setIntElement(term102919, 2, -1236696275);
        setIntElement(term102919, 3, 575249858);
        setIntElement(term102919, 4, -297957951);
        setIntElement(term102919, 5, -1816920588);
        setIntElement(term102919, 6, 1674165862);
        setIntElement(term102919, 7, 1875252647);
        setIntElement(term102919, 8, -1298688401);
        setField(term102836, term102836.getClass(), "modelToViewIndex", term102919);
        setIntField(term102836, term102836.getClass(), "lastRowCount", 1907832341);
        setBooleanField(term102836, term102836.getClass(), "rebuildIndices", false);
        setField(term102931, term102931.getClass(), "listenerList", term102932);
        setField(term102836, term102836.getClass(), "listenerList", term102931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebuildIndices", argTypes, term102836, args);
    }

};


