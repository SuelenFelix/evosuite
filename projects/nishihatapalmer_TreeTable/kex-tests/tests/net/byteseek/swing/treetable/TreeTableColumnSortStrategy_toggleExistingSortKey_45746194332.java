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
import java.lang.Integer;

public class TreeTableColumnSortStrategy_toggleExistingSortKey_45746194332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29420;
     Object term29422;

    public TreeTableColumnSortStrategy_toggleExistingSortKey_45746194332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29420 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term29420, term29420.getClass(), "maximumSortKeys", 0);
        setField(term29420, term29420.getClass(), "newSortKeyPosition", null);
        setField(term29420, term29420.getClass(), "updateSortKeyPosition", null);
        setField(term29420, term29420.getClass(), "removeSortKeyAction", null);
        term29422 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29422;
        callMethod(klass, "toggleExistingSortKey", argTypes, term29420, args);
    }

};


