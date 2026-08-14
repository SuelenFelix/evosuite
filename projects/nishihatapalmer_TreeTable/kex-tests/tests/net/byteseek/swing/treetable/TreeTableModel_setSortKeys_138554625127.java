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
import java.lang.Object;

public class TreeTableModel_setSortKeys_138554625127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98110;

    public TreeTableModel_setSortKeys_138554625127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98110 = (Object[]) newArray("javax.swing.RowSorter$SortKey", 3);
        Object term98111 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98113 = newInstance(Class.forName("javax.swing.SortOrder"));
        Object term98126 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98128 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98130 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term98111, term98111.getClass(), "column", -1703625118);
        setField(term98113, term98113.getClass(), "name", "ASCENDING");
        setIntField(term98113, term98113.getClass(), "ordinal", 0);
        setField(term98111, term98111.getClass(), "sortOrder", term98113);
        setElement(term98110, 0, term98111);
        setIntField(term98126, term98126.getClass(), "column", 1104108112);
        setField(term98126, term98126.getClass(), "sortOrder", term98113);
        setElement(term98110, 1, term98126);
        setIntField(term98128, term98128.getClass(), "column", 1648665618);
        setField(term98130, term98130.getClass(), "name", "DESCENDING");
        setIntField(term98130, term98130.getClass(), "ordinal", 1);
        setField(term98128, term98128.getClass(), "sortOrder", term98130);
        setElement(term98110, 2, term98128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("javax.swing.RowSorter$SortKey"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term98110;
        callMethod(klass, "setSortKeys", argTypes, null, args);
    }

};


