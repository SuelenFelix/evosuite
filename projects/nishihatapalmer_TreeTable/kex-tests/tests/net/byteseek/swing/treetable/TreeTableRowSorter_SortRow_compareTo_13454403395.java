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

public class TreeTableRowSorter_SortRow_compareTo_13454403395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369913;

    public TreeTableRowSorter_SortRow_compareTo_13454403395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369913 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        setField(term369913, term369913.getClass(), "rowSorter", null);
        setIntField(term369913, term369913.getClass(), "modelIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "compareTo", argTypes, term369913, args);
    }

};


