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

public class TreeUtils_TreeTableRow_setRowData_11183824607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80782;
     Object term80788;

    public TreeUtils_TreeTableRow_setRowData_11183824607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80782 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow"));
        Object term80783 = newInstance(Class.forName("java.lang.Object"));
        Object term80784 = newInstance(Class.forName("java.lang.Object"));
        Object[] term80785 = (Object[]) newArray("java.lang.Object", 2);
        Object term80786 = newInstance(Class.forName("java.lang.Object"));
        Object term80787 = newInstance(Class.forName("java.lang.Object"));
        setField(term80782, term80782.getClass(), "id", term80783);
        setField(term80782, term80782.getClass(), "parentId", term80784);
        setElement(term80785, 0, term80786);
        setElement(term80785, 1, term80787);
        setField(term80782, term80782.getClass(), "otherColumns", term80785);
        term80788 = (Object[]) newArray("java.lang.Object", 5);
        Object term80789 = newInstance(Class.forName("java.lang.Object"));
        Object term80790 = newInstance(Class.forName("java.lang.Object"));
        Object term80791 = newInstance(Class.forName("java.lang.Object"));
        Object term80792 = newInstance(Class.forName("java.lang.Object"));
        Object term80793 = newInstance(Class.forName("java.lang.Object"));
        setElement(term80788, 0, term80789);
        setElement(term80788, 1, term80790);
        setElement(term80788, 2, term80791);
        setElement(term80788, 3, term80792);
        setElement(term80788, 4, term80793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term80788;
        callMethod(klass, "setRowData", argTypes, term80782, args);
    }

};


