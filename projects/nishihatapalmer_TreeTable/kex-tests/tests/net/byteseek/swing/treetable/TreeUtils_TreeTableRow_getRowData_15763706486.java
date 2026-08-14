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

public class TreeUtils_TreeTableRow_getRowData_15763706486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80773;

    public TreeUtils_TreeTableRow_getRowData_15763706486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80773 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow"));
        Object term80774 = newInstance(Class.forName("java.lang.Object"));
        Object term80775 = newInstance(Class.forName("java.lang.Object"));
        Object[] term80776 = (Object[]) newArray("java.lang.Object", 5);
        Object term80777 = newInstance(Class.forName("java.lang.Object"));
        Object term80778 = newInstance(Class.forName("java.lang.Object"));
        Object term80779 = newInstance(Class.forName("java.lang.Object"));
        Object term80780 = newInstance(Class.forName("java.lang.Object"));
        Object term80781 = newInstance(Class.forName("java.lang.Object"));
        setField(term80773, term80773.getClass(), "id", term80774);
        setField(term80773, term80773.getClass(), "parentId", term80775);
        setElement(term80776, 0, term80777);
        setElement(term80776, 1, term80778);
        setElement(term80776, 2, term80779);
        setElement(term80776, 3, term80780);
        setElement(term80776, 4, term80781);
        setField(term80773, term80773.getClass(), "otherColumns", term80776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowData", argTypes, term80773, args);
    }

};


