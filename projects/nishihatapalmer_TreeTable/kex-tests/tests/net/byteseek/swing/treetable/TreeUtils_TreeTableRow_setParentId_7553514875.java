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

public class TreeUtils_TreeTableRow_setParentId_7553514875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80764;
     Object term80772;

    public TreeUtils_TreeTableRow_setParentId_7553514875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80764 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow"));
        Object term80765 = newInstance(Class.forName("java.lang.Object"));
        Object term80766 = newInstance(Class.forName("java.lang.Object"));
        Object[] term80767 = (Object[]) newArray("java.lang.Object", 4);
        Object term80768 = newInstance(Class.forName("java.lang.Object"));
        Object term80769 = newInstance(Class.forName("java.lang.Object"));
        Object term80770 = newInstance(Class.forName("java.lang.Object"));
        Object term80771 = newInstance(Class.forName("java.lang.Object"));
        setField(term80764, term80764.getClass(), "id", term80765);
        setField(term80764, term80764.getClass(), "parentId", term80766);
        setElement(term80767, 0, term80768);
        setElement(term80767, 1, term80769);
        setElement(term80767, 2, term80770);
        setElement(term80767, 3, term80771);
        setField(term80764, term80764.getClass(), "otherColumns", term80767);
        term80772 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term80772;
        callMethod(klass, "setParentId", argTypes, term80764, args);
    }

};


