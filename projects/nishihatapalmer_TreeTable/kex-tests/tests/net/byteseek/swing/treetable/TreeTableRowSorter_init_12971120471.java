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

public class TreeTableRowSorter_init_12971120471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98882;

    public TreeTableRowSorter_init_12971120471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98882 = (Object[]) newArray("javax.swing.RowSorter$SortKey", 6);
        Object term98883 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98885 = newInstance(Class.forName("javax.swing.SortOrder"));
        Object term98898 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98900 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98902 = newInstance(Class.forName("javax.swing.SortOrder"));
        Object term98916 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98918 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98920 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term98883, term98883.getClass(), "column", -944986533);
        setField(term98885, term98885.getClass(), "name", "ASCENDING");
        setIntField(term98885, term98885.getClass(), "ordinal", 0);
        setField(term98883, term98883.getClass(), "sortOrder", term98885);
        setElement(term98882, 0, term98883);
        setIntField(term98898, term98898.getClass(), "column", 1894454926);
        setField(term98898, term98898.getClass(), "sortOrder", term98885);
        setElement(term98882, 1, term98898);
        setIntField(term98900, term98900.getClass(), "column", 1415142780);
        setField(term98902, term98902.getClass(), "name", "DESCENDING");
        setIntField(term98902, term98902.getClass(), "ordinal", 1);
        setField(term98900, term98900.getClass(), "sortOrder", term98902);
        setElement(term98882, 2, term98900);
        setIntField(term98916, term98916.getClass(), "column", -574105759);
        setField(term98916, term98916.getClass(), "sortOrder", term98902);
        setElement(term98882, 3, term98916);
        setIntField(term98918, term98918.getClass(), "column", -1165271567);
        setField(term98918, term98918.getClass(), "sortOrder", term98885);
        setElement(term98882, 4, term98918);
        setIntField(term98920, term98920.getClass(), "column", 376834234);
        setField(term98920, term98920.getClass(), "sortOrder", term98885);
        setElement(term98882, 5, term98920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        argTypes[1] = Array.newInstance(Class.forName("javax.swing.RowSorter$SortKey"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term98882;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


