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
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Integer;

public class TreeTableColumnSortStrategy_truncateList_92410469318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28089;
     Object term28132;
     Object term28135;

    public TreeTableColumnSortStrategy_truncateList_92410469318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28138 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term28137 = ((Class) term28138).getDeclaredField((String) "ADD_TO_END");
        ((Field) term28137).setAccessible(true);
        Object enum58 = ((Field) term28137).get((Object) null);
        Class<? extends Object> term28550 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term28549 = ((Class) term28550).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term28549).setAccessible(true);
        Object enum59 = ((Field) term28549).get((Object) null);
        Class<? extends Object> term28986 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term28985 = ((Class) term28986).getDeclaredField((String) "REMOVE");
        ((Field) term28985).setAccessible(true);
        Object enum60 = ((Field) term28985).get((Object) null);
        term28089 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term28089, term28089.getClass(), "maximumSortKeys", 3);
        setField(term28089, term28089.getClass(), "newSortKeyPosition", enum58);
        setField(term28089, term28089.getClass(), "updateSortKeyPosition", enum59);
        setField(term28089, term28089.getClass(), "removeSortKeyAction", enum60);
        term28132 = new LinkedList();
        term28135 = new Integer(683666002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term28132;
        args[1] = term28135;
        callMethod(klass, "truncateList", argTypes, term28089, args);
    }

};


