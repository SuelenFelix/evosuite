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

public class TreeTableModel_getLastPathNode_156660330360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98297;

    public TreeTableModel_getLastPathNode_156660330360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98297 = newInstance(Class.forName("javax.swing.event.TreeModelEvent"));
        Object term98298 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98299 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98300 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98301 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98302 = newInstance(Class.forName("java.lang.Object"));
        Object term98303 = newInstance(Class.forName("java.lang.Object"));
        Object term98304 = newInstance(Class.forName("java.lang.Object"));
        int[] term98305 = (int[]) newIntArray(2);
        Object[] term98308 = (Object[]) newArray("java.lang.Object", 9);
        Object term98309 = newInstance(Class.forName("java.lang.Object"));
        Object term98310 = newInstance(Class.forName("java.lang.Object"));
        Object term98311 = newInstance(Class.forName("java.lang.Object"));
        Object term98312 = newInstance(Class.forName("java.lang.Object"));
        Object term98313 = newInstance(Class.forName("java.lang.Object"));
        setField(term98301, term98301.getClass(), "parentPath", null);
        setField(term98301, term98301.getClass(), "lastPathComponent", null);
        setField(term98300, term98300.getClass(), "parentPath", term98301);
        setField(term98300, term98300.getClass(), "lastPathComponent", term98302);
        setField(term98299, term98299.getClass(), "parentPath", term98300);
        setField(term98299, term98299.getClass(), "lastPathComponent", term98303);
        setField(term98298, term98298.getClass(), "parentPath", term98299);
        setField(term98298, term98298.getClass(), "lastPathComponent", term98304);
        setField(term98297, term98297.getClass(), "path", term98298);
        setIntElement(term98305, 0, 1038029515);
        setIntElement(term98305, 1, 1137154606);
        setField(term98297, term98297.getClass(), "childIndices", term98305);
        setElement(term98308, 0, term98309);
        setElement(term98308, 1, term98303);
        setElement(term98308, 2, term98304);
        setElement(term98308, 3, term98310);
        setElement(term98308, 4, term98311);
        setElement(term98308, 5, term98312);
        setElement(term98308, 6, term98313);
        setElement(term98308, 7, term98313);
        setElement(term98308, 8, term98309);
        setField(term98297, term98297.getClass(), "children", term98308);
        setField(term98297, term98297.getClass(), "source", term98303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.TreeModelEvent");
        Object[] args = new Object[1];
        args[0] = term98297;
        callMethod(klass, "getLastPathNode", argTypes, null, args);
    }

};


