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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Integer;

public class TableUtils_findSortKeyIndex_40692119311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369889;
     Object term369918;

    public TableUtils_findSortKeyIndex_40692119311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term369892 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term369894 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term369892, term369892.getClass(), "column", 174682854);
        setField(term369894, term369894.getClass(), "name", "");
        setIntField(term369894, term369894.getClass(), "ordinal", 2);
        setField(term369892, term369892.getClass(), "sortOrder", term369894);
        Object term369898 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term369900 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term369898, term369898.getClass(), "column", -1618786023);
        setField(term369900, term369900.getClass(), "name", null);
        setIntField(term369900, term369900.getClass(), "ordinal", 0);
        setField(term369898, term369898.getClass(), "sortOrder", term369900);
        Object term369903 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369903, term369903.getClass(), "column", -316033780);
        setField(term369903, term369903.getClass(), "sortOrder", term369900);
        term369889 = new LinkedList();
        ((LinkedList) term369889).add(term369892);
        ((LinkedList) term369889).add(term369898);
        ((LinkedList) term369889).add(term369903);
        ((LinkedList) term369889).add((Object)null);
        ((LinkedList) term369889).add((Object)null);
        ((LinkedList) term369889).add((Object)null);
        ((LinkedList) term369889).add((Object)null);
        term369918 = new Integer(934758494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term369889;
        args[1] = term369918;
        callMethod(klass, "findSortKeyIndex", argTypes, null, args);
    }

};


