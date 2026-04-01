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
import java.lang.Integer;

public class TableUtils_findSortKeyIndex_40692119311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370035;
     Object term370047;

    public TableUtils_findSortKeyIndex_40692119311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term370038 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term370040 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term370038, term370038.getClass(), "column", 923353564);
        setField(term370040, term370040.getClass(), "name", "");
        setIntField(term370040, term370040.getClass(), "ordinal", 0);
        setField(term370038, term370038.getClass(), "sortOrder", term370040);
        Object term370044 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term370044, term370044.getClass(), "column", 2013647768);
        setField(term370044, term370044.getClass(), "sortOrder", term370040);
        term370035 = new LinkedList();
        ((LinkedList) term370035).add(term370038);
        ((LinkedList) term370035).add(term370044);
        term370047 = new Integer(1706579212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term370035;
        args[1] = term370047;
        callMethod(klass, "findSortKeyIndex", argTypes, null, args);
    }

};


