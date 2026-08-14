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

public class TreeNodeComparator_compareValues_14940835072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369279;
     Object term369280;

    public TreeNodeComparator_compareValues_14940835072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369279 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeNodeComparator"));
        setField(term369279, term369279.getClass(), "model", null);
        term369280 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term369282 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term369280, term369280.getClass(), "column", 666379561);
        setField(term369282, term369282.getClass(), "name", "UNSORTED");
        setIntField(term369282, term369282.getClass(), "ordinal", 2);
        setField(term369280, term369280.getClass(), "sortOrder", term369282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeNodeComparator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[2] = Class.forName("javax.swing.RowSorter$SortKey");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term369280;
        callMethod(klass, "compareValues", argTypes, term369279, args);
    }

};


