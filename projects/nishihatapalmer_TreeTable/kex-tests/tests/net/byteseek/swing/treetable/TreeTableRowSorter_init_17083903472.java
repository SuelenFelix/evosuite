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

public class TreeTableRowSorter_init_17083903472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98941;

    public TreeTableRowSorter_init_17083903472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term98944 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98946 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term98944, term98944.getClass(), "column", -1911972560);
        setField(term98946, term98946.getClass(), "name", "");
        setIntField(term98946, term98946.getClass(), "ordinal", 0);
        setField(term98944, term98944.getClass(), "sortOrder", term98946);
        Object term98950 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98952 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term98950, term98950.getClass(), "column", -642716895);
        setField(term98952, term98952.getClass(), "name", null);
        setIntField(term98952, term98952.getClass(), "ordinal", 1);
        setField(term98950, term98950.getClass(), "sortOrder", term98952);
        term98941 = new LinkedList();
        ((LinkedList) term98941).add(term98944);
        ((LinkedList) term98941).add(term98950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term98941;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


