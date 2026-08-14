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

public class TreeTableRowSorter_getModelRowCount_39628556311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99901;

    public TreeTableRowSorter_getModelRowCount_39628556311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99904 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99906 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term99904, term99904.getClass(), "column", 1068256001);
        setField(term99906, term99906.getClass(), "name", null);
        setIntField(term99906, term99906.getClass(), "ordinal", 2);
        setField(term99904, term99904.getClass(), "sortOrder", term99906);
        Object term99908 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99908, term99908.getClass(), "column", 1139078354);
        setField(term99908, term99908.getClass(), "sortOrder", term99906);
        Object term99910 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99912 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term99910, term99910.getClass(), "column", -691164974);
        setField(term99912, term99912.getClass(), "name", null);
        setIntField(term99912, term99912.getClass(), "ordinal", 1);
        setField(term99910, term99910.getClass(), "sortOrder", term99912);
        Object term99914 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99914, term99914.getClass(), "column", -761675396);
        setField(term99914, term99914.getClass(), "sortOrder", term99912);
        Object term99916 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99918 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term99916, term99916.getClass(), "column", -1954860951);
        setField(term99918, term99918.getClass(), "name", null);
        setIntField(term99918, term99918.getClass(), "ordinal", 0);
        setField(term99916, term99916.getClass(), "sortOrder", term99918);
        Object term99920 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99920, term99920.getClass(), "column", -2078879114);
        setField(term99920, term99920.getClass(), "sortOrder", term99918);
        Object term99922 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99922, term99922.getClass(), "column", -1186882318);
        setField(term99922, term99922.getClass(), "sortOrder", term99906);
        ArrayList term99902 = new ArrayList();
        ((ArrayList) term99902).add(term99904);
        ((ArrayList) term99902).add(term99908);
        ((ArrayList) term99902).add(term99910);
        ((ArrayList) term99902).add(term99914);
        ((ArrayList) term99902).add(term99916);
        ((ArrayList) term99902).add(term99920);
        ((ArrayList) term99902).add(term99922);
        ArrayList term99926 = new ArrayList();
        HashMap term99931 = new HashMap();
        Set<Object> term100015 =  ((Map) term99931).keySet();
        HashSet term99930 = new HashSet((Collection<? extends Object>) term100015);
        ArrayList term99968 = new ArrayList();
        ((ArrayList) term99968).add((Object)null);
        ((ArrayList) term99968).add((Object)null);
        ((ArrayList) term99968).add((Object)null);
        ((ArrayList) term99968).add((Object)null);
        ((ArrayList) term99968).add((Object)null);
        ((ArrayList) term99968).add((Object)null);
        ArrayList term99971 = new ArrayList();
        HashSet term99974 = new HashSet();
        ArrayList term99988 = new ArrayList();
        ((ArrayList) term99988).add((Object)null);
        ((ArrayList) term99988).add((Object)null);
        ((ArrayList) term99988).add((Object)null);
        ArrayList term99991 = new ArrayList();
        HashSet term99994 = new HashSet();
        term99901 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term99965 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 4);
        Object term99966 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99967 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term99975 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term99976 = (int[]) newIntArray(5);
        Object term99984 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term99986 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99987 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term99998 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99999 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term100003 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100004 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term100008 = (int[]) newIntArray(2);
        Object term100013 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100014 = (Object[]) newArray("java.lang.Object", 0);
        setField(term99901, term99901.getClass(), "model", null);
        setField(term99901, term99901.getClass(), "sortKeys", term99902);
        setField(term99901, term99901.getClass(), "defaultSortKeys", term99926);
        setField(term99901, term99901.getClass(), "unsortableColumns", term99930);
        setField(term99901, term99901.getClass(), "nodeComparator", null);
        setField(term99901, term99901.getClass(), "sortStrategy", null);
        setField(term99967, term99967.getClass(), "model", null);
        setField(term99967, term99967.getClass(), "sortKeys", term99968);
        setField(term99967, term99967.getClass(), "defaultSortKeys", term99971);
        setField(term99967, term99967.getClass(), "unsortableColumns", term99974);
        setField(term99967, term99967.getClass(), "nodeComparator", null);
        setField(term99967, term99967.getClass(), "sortStrategy", null);
        setField(term99967, term99967.getClass(), "viewToModelIndex", term99975);
        setIntElement(term99976, 0, 303007547);
        setIntElement(term99976, 1, 1498738343);
        setIntElement(term99976, 2, -1635571857);
        setIntElement(term99976, 3, 1407309162);
        setIntElement(term99976, 4, -534033672);
        setField(term99967, term99967.getClass(), "modelToViewIndex", term99976);
        setIntField(term99967, term99967.getClass(), "lastRowCount", -1162790806);
        setBooleanField(term99967, term99967.getClass(), "rebuildIndices", false);
        setField(term99984, term99984.getClass(), "listenerList", null);
        setField(term99967, term99967.getClass(), "listenerList", term99984);
        setField(term99966, term99966.getClass(), "rowSorter", term99967);
        setIntField(term99966, term99966.getClass(), "modelIndex", -1264595049);
        setElement(term99965, 0, term99966);
        setField(term99987, term99987.getClass(), "model", null);
        setField(term99987, term99987.getClass(), "sortKeys", term99988);
        setField(term99987, term99987.getClass(), "defaultSortKeys", term99991);
        setField(term99987, term99987.getClass(), "unsortableColumns", term99994);
        setField(term99987, term99987.getClass(), "nodeComparator", null);
        setField(term99987, term99987.getClass(), "sortStrategy", null);
        setField(term99987, term99987.getClass(), "viewToModelIndex", null);
        setField(term99987, term99987.getClass(), "modelToViewIndex", null);
        setIntField(term99987, term99987.getClass(), "lastRowCount", 0);
        setBooleanField(term99987, term99987.getClass(), "rebuildIndices", false);
        setField(term99987, term99987.getClass(), "listenerList", null);
        setField(term99986, term99986.getClass(), "rowSorter", term99987);
        setIntField(term99986, term99986.getClass(), "modelIndex", -2058884635);
        setElement(term99965, 1, term99986);
        setField(term99999, term99999.getClass(), "model", null);
        setField(term99999, term99999.getClass(), "sortKeys", null);
        setField(term99999, term99999.getClass(), "defaultSortKeys", null);
        setField(term99999, term99999.getClass(), "unsortableColumns", null);
        setField(term99999, term99999.getClass(), "nodeComparator", null);
        setField(term99999, term99999.getClass(), "sortStrategy", null);
        setField(term99999, term99999.getClass(), "viewToModelIndex", null);
        setField(term99999, term99999.getClass(), "modelToViewIndex", null);
        setIntField(term99999, term99999.getClass(), "lastRowCount", 0);
        setBooleanField(term99999, term99999.getClass(), "rebuildIndices", false);
        setField(term99999, term99999.getClass(), "listenerList", null);
        setField(term99998, term99998.getClass(), "rowSorter", term99999);
        setIntField(term99998, term99998.getClass(), "modelIndex", 1064185088);
        setElement(term99965, 2, term99998);
        setField(term100004, term100004.getClass(), "model", null);
        setField(term100004, term100004.getClass(), "sortKeys", null);
        setField(term100004, term100004.getClass(), "defaultSortKeys", null);
        setField(term100004, term100004.getClass(), "unsortableColumns", null);
        setField(term100004, term100004.getClass(), "nodeComparator", null);
        setField(term100004, term100004.getClass(), "sortStrategy", null);
        setField(term100004, term100004.getClass(), "viewToModelIndex", null);
        setField(term100004, term100004.getClass(), "modelToViewIndex", null);
        setIntField(term100004, term100004.getClass(), "lastRowCount", 0);
        setBooleanField(term100004, term100004.getClass(), "rebuildIndices", false);
        setField(term100004, term100004.getClass(), "listenerList", null);
        setField(term100003, term100003.getClass(), "rowSorter", term100004);
        setIntField(term100003, term100003.getClass(), "modelIndex", -1249782654);
        setElement(term99965, 3, term100003);
        setField(term99901, term99901.getClass(), "viewToModelIndex", term99965);
        setIntElement(term100008, 0, 399302934);
        setIntElement(term100008, 1, -1823255084);
        setField(term99901, term99901.getClass(), "modelToViewIndex", term100008);
        setIntField(term99901, term99901.getClass(), "lastRowCount", 793345010);
        setBooleanField(term99901, term99901.getClass(), "rebuildIndices", false);
        setField(term100013, term100013.getClass(), "listenerList", term100014);
        setField(term99901, term99901.getClass(), "listenerList", term100013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModelRowCount", argTypes, term99901, args);
    }

};


