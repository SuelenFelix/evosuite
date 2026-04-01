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
     Object term99014;

    public TreeTableModel_setDefaultSortKeys_200690199225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99014 = (Object[]) newArray("javax.swing.RowSorter$SortKey", 7);
        Object term99015 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99017 = newInstance(Class.forName("javax.swing.SortOrder"));
        Object term99030 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99032 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99034 = newInstance(Class.forName("javax.swing.SortOrder"));
        Object term99048 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99050 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99052 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99054 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99015, term99015.getClass(), "column", 273590437);
        setField(term99017, term99017.getClass(), "name", "ASCENDING");
        setIntField(term99017, term99017.getClass(), "ordinal", 0);
        setField(term99015, term99015.getClass(), "sortOrder", term99017);
        setElement(term99014, 0, term99015);
        setIntField(term99030, term99030.getClass(), "column", -348612876);
        setField(term99030, term99030.getClass(), "sortOrder", term99017);
        setElement(term99014, 1, term99030);
        setIntField(term99032, term99032.getClass(), "column", 1302807565);
        setField(term99034, term99034.getClass(), "name", "DESCENDING");
        setIntField(term99034, term99034.getClass(), "ordinal", 1);
        setField(term99032, term99032.getClass(), "sortOrder", term99034);
        setElement(term99014, 2, term99032);
        setIntField(term99048, term99048.getClass(), "column", -838848221);
        setField(term99048, term99048.getClass(), "sortOrder", term99034);
        setElement(term99014, 3, term99048);
        setIntField(term99050, term99050.getClass(), "column", 1163761623);
        setField(term99050, term99050.getClass(), "sortOrder", term99017);
        setElement(term99014, 4, term99050);
        setIntField(term99052, term99052.getClass(), "column", 718742281);
        setField(term99052, term99052.getClass(), "sortOrder", term99017);
        setElement(term99014, 5, term99052);
        setIntField(term99054, term99054.getClass(), "column", 1532723756);
        setField(term99054, term99054.getClass(), "sortOrder", term99034);
        setElement(term99014, 6, term99054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("javax.swing.RowSorter$SortKey"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term99014;
        callMethod(klass, "setDefaultSortKeys", argTypes, null, args);
    }

};


