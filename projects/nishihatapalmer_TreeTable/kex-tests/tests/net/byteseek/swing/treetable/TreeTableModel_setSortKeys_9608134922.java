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

public class TreeTableModel_setSortKeys_9608134922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98956;

    public TreeTableModel_setSortKeys_9608134922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term98959 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98961 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term98959, term98959.getClass(), "column", -752870423);
        setField(term98961, term98961.getClass(), "name", "");
        setIntField(term98961, term98961.getClass(), "ordinal", 0);
        setField(term98959, term98959.getClass(), "sortOrder", term98961);
        Object term98965 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98967 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term98965, term98965.getClass(), "column", -1698809299);
        setField(term98967, term98967.getClass(), "name", null);
        setIntField(term98967, term98967.getClass(), "ordinal", 1);
        setField(term98965, term98965.getClass(), "sortOrder", term98967);
        Object term98970 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term98970, term98970.getClass(), "column", 401512128);
        setField(term98970, term98970.getClass(), "sortOrder", term98961);
        term98956 = new LinkedList();
        ((LinkedList) term98956).add(term98959);
        ((LinkedList) term98956).add(term98965);
        ((LinkedList) term98956).add(term98970);
        ((LinkedList) term98956).add((Object)null);
        ((LinkedList) term98956).add((Object)null);
        ((LinkedList) term98956).add((Object)null);
        ((LinkedList) term98956).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term98956;
        callMethod(klass, "setSortKeys", argTypes, null, args);
    }

};


