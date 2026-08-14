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
     Object term13288;

    public TreeTableColumnSortStrategy_getUpdateSortKeyPosition_11510364417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13332 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term13331 = ((Class) term13332).getDeclaredField((String) "ADD_TO_END");
        ((Field) term13331).setAccessible(true);
        Object enum24 = ((Field) term13331).get((Object) null);
        Class<? extends Object> term13744 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term13743 = ((Class) term13744).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term13743).setAccessible(true);
        Object enum25 = ((Field) term13743).get((Object) null);
        Class<? extends Object> term14180 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term14179 = ((Class) term14180).getDeclaredField((String) "REMOVE");
        ((Field) term14179).setAccessible(true);
        Object enum26 = ((Field) term14179).get((Object) null);
        term13288 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term13288, term13288.getClass(), "maximumSortKeys", 3);
        setField(term13288, term13288.getClass(), "newSortKeyPosition", enum24);
        setField(term13288, term13288.getClass(), "updateSortKeyPosition", enum25);
        setField(term13288, term13288.getClass(), "removeSortKeyAction", enum26);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateSortKeyPosition", argTypes, term13288, args);
    }

};


