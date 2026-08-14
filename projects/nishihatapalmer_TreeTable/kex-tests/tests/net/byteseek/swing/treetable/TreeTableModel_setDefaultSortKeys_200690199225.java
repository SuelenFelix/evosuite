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

public class TreeTableModel_setDefaultSortKeys_200690199225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98029;

    public TreeTableModel_setDefaultSortKeys_200690199225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98029 = (Object[]) newArray("javax.swing.RowSorter$SortKey", 7);
        Object term98030 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98032 = newInstance(Class.forName("javax.swing.SortOrder"));
        Object term98046 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98048 = newInstance(Class.forName("javax.swing.SortOrder"));
        Object term98061 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98063 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98065 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98067 = newInstance(Class.forName("javax.swing.SortOrder"));
        Object term98079 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98081 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term98030, term98030.getClass(), "column", -1777140369);
        setField(term98032, term98032.getClass(), "name", "DESCENDING");
        setIntField(term98032, term98032.getClass(), "ordinal", 1);
        setField(term98030, term98030.getClass(), "sortOrder", term98032);
        setElement(term98029, 0, term98030);
        setIntField(term98046, term98046.getClass(), "column", 993627098);
        setField(term98048, term98048.getClass(), "name", "ASCENDING");
        setIntField(term98048, term98048.getClass(), "ordinal", 0);
        setField(term98046, term98046.getClass(), "sortOrder", term98048);
        setElement(term98029, 1, term98046);
        setIntField(term98061, term98061.getClass(), "column", 872295704);
        setField(term98061, term98061.getClass(), "sortOrder", term98032);
        setElement(term98029, 2, term98061);
        setIntField(term98063, term98063.getClass(), "column", 86041387);
        setField(term98063, term98063.getClass(), "sortOrder", term98048);
        setElement(term98029, 3, term98063);
        setIntField(term98065, term98065.getClass(), "column", 1010721666);
        setField(term98067, term98067.getClass(), "name", "UNSORTED");
        setIntField(term98067, term98067.getClass(), "ordinal", 2);
        setField(term98065, term98065.getClass(), "sortOrder", term98067);
        setElement(term98029, 4, term98065);
        setIntField(term98079, term98079.getClass(), "column", 27043781);
        setField(term98079, term98079.getClass(), "sortOrder", term98032);
        setElement(term98029, 5, term98079);
        setIntField(term98081, term98081.getClass(), "column", -1367122405);
        setField(term98081, term98081.getClass(), "sortOrder", term98032);
        setElement(term98029, 6, term98081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("javax.swing.RowSorter$SortKey"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term98029;
        callMethod(klass, "setDefaultSortKeys", argTypes, null, args);
    }

};


