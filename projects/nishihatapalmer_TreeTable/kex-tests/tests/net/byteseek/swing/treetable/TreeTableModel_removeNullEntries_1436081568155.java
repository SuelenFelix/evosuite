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

public class TreeTableModel_removeNullEntries_1436081568155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98668;

    public TreeTableModel_removeNullEntries_1436081568155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term98671 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98673 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term98671, term98671.getClass(), "column", 1622857008);
        setField(term98673, term98673.getClass(), "name", "");
        setIntField(term98673, term98673.getClass(), "ordinal", 1);
        setField(term98671, term98671.getClass(), "sortOrder", term98673);
        term98668 = new LinkedList();
        ((LinkedList) term98668).add(term98671);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term98668;
        callMethod(klass, "removeNullEntries", argTypes, null, args);
    }

};


