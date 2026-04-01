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
     Object term99747;

    public TreeTableRowSorter_init_12971120471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99747 = (Object[]) newArray("javax.swing.RowSorter$SortKey", 6);
        Object term99748 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99750 = newInstance(Class.forName("javax.swing.SortOrder"));
        Object term99764 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99766 = newInstance(Class.forName("javax.swing.SortOrder"));
        Object term99778 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99780 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99782 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99784 = newInstance(Class.forName("javax.swing.SortOrder"));
        Object term99797 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99748, term99748.getClass(), "column", 783730213);
        setField(term99750, term99750.getClass(), "name", "DESCENDING");
        setIntField(term99750, term99750.getClass(), "ordinal", 1);
        setField(term99748, term99748.getClass(), "sortOrder", term99750);
        setElement(term99747, 0, term99748);
        setIntField(term99764, term99764.getClass(), "column", 1815951606);
        setField(term99766, term99766.getClass(), "name", "UNSORTED");
        setIntField(term99766, term99766.getClass(), "ordinal", 2);
        setField(term99764, term99764.getClass(), "sortOrder", term99766);
        setElement(term99747, 1, term99764);
        setIntField(term99778, term99778.getClass(), "column", 1105016932);
        setField(term99778, term99778.getClass(), "sortOrder", term99766);
        setElement(term99747, 2, term99778);
        setIntField(term99780, term99780.getClass(), "column", -365784998);
        setField(term99780, term99780.getClass(), "sortOrder", term99750);
        setElement(term99747, 3, term99780);
        setIntField(term99782, term99782.getClass(), "column", -1893236300);
        setField(term99784, term99784.getClass(), "name", "ASCENDING");
        setIntField(term99784, term99784.getClass(), "ordinal", 0);
        setField(term99782, term99782.getClass(), "sortOrder", term99784);
        setElement(term99747, 4, term99782);
        setIntField(term99797, term99797.getClass(), "column", -1858909368);
        setField(term99797, term99797.getClass(), "sortOrder", term99750);
        setElement(term99747, 5, term99797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        argTypes[1] = Array.newInstance(Class.forName("javax.swing.RowSorter$SortKey"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term99747;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


