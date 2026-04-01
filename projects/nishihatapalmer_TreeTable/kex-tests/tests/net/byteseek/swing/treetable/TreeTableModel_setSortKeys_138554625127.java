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
     Object term99075;

    public TreeTableModel_setSortKeys_138554625127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99075 = (Object[]) newArray("javax.swing.RowSorter$SortKey", 4);
        Object term99076 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99078 = newInstance(Class.forName("javax.swing.SortOrder"));
        Object term99092 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99094 = newInstance(Class.forName("javax.swing.SortOrder"));
        Object term99107 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99109 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99076, term99076.getClass(), "column", -124088550);
        setField(term99078, term99078.getClass(), "name", "DESCENDING");
        setIntField(term99078, term99078.getClass(), "ordinal", 1);
        setField(term99076, term99076.getClass(), "sortOrder", term99078);
        setElement(term99075, 0, term99076);
        setIntField(term99092, term99092.getClass(), "column", 777492093);
        setField(term99094, term99094.getClass(), "name", "ASCENDING");
        setIntField(term99094, term99094.getClass(), "ordinal", 0);
        setField(term99092, term99092.getClass(), "sortOrder", term99094);
        setElement(term99075, 1, term99092);
        setIntField(term99107, term99107.getClass(), "column", 1414025609);
        setField(term99107, term99107.getClass(), "sortOrder", term99094);
        setElement(term99075, 2, term99107);
        setIntField(term99109, term99109.getClass(), "column", 255145822);
        setField(term99109, term99109.getClass(), "sortOrder", term99094);
        setElement(term99075, 3, term99109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("javax.swing.RowSorter$SortKey"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term99075;
        callMethod(klass, "setSortKeys", argTypes, null, args);
    }

};


