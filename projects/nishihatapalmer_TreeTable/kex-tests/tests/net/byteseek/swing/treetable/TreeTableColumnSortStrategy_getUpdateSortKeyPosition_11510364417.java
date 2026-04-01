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

public class TreeTableColumnSortStrategy_getUpdateSortKeyPosition_11510364417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13292;

    public TreeTableColumnSortStrategy_getUpdateSortKeyPosition_11510364417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13336 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term13335 = ((Class) term13336).getDeclaredField((String) "ADD_TO_END");
        ((Field) term13335).setAccessible(true);
        Object enum24 = ((Field) term13335).get((Object) null);
        Class<? extends Object> term13748 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term13747 = ((Class) term13748).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term13747).setAccessible(true);
        Object enum25 = ((Field) term13747).get((Object) null);
        Class<? extends Object> term14184 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term14183 = ((Class) term14184).getDeclaredField((String) "REMOVE");
        ((Field) term14183).setAccessible(true);
        Object enum26 = ((Field) term14183).get((Object) null);
        term13292 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term13292, term13292.getClass(), "maximumSortKeys", 3);
        setField(term13292, term13292.getClass(), "newSortKeyPosition", enum24);
        setField(term13292, term13292.getClass(), "updateSortKeyPosition", enum25);
        setField(term13292, term13292.getClass(), "removeSortKeyAction", enum26);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateSortKeyPosition", argTypes, term13292, args);
    }

};


