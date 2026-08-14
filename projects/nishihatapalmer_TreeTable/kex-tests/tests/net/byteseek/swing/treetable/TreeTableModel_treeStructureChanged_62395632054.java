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

public class TreeTableModel_treeStructureChanged_62395632054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98276;

    public TreeTableModel_treeStructureChanged_62395632054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98276 = newInstance(Class.forName("javax.swing.event.TreeModelEvent"));
        Object term98277 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98278 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98279 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98280 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98281 = newInstance(Class.forName("java.lang.Object"));
        Object term98282 = newInstance(Class.forName("java.lang.Object"));
        Object term98283 = newInstance(Class.forName("java.lang.Object"));
        int[] term98284 = (int[]) newIntArray(3);
        Object[] term98288 = (Object[]) newArray("java.lang.Object", 6);
        Object term98289 = newInstance(Class.forName("java.lang.Object"));
        Object term98290 = newInstance(Class.forName("java.lang.Object"));
        Object term98291 = newInstance(Class.forName("java.lang.Object"));
        Object term98292 = newInstance(Class.forName("java.lang.Object"));
        Object term98293 = newInstance(Class.forName("java.lang.Object"));
        setField(term98280, term98280.getClass(), "parentPath", null);
        setField(term98280, term98280.getClass(), "lastPathComponent", null);
        setField(term98279, term98279.getClass(), "parentPath", term98280);
        setField(term98279, term98279.getClass(), "lastPathComponent", term98281);
        setField(term98278, term98278.getClass(), "parentPath", term98279);
        setField(term98278, term98278.getClass(), "lastPathComponent", term98282);
        setField(term98277, term98277.getClass(), "parentPath", term98278);
        setField(term98277, term98277.getClass(), "lastPathComponent", term98283);
        setField(term98276, term98276.getClass(), "path", term98277);
        setIntElement(term98284, 0, 1499735894);
        setIntElement(term98284, 1, 716486048);
        setIntElement(term98284, 2, -466708718);
        setField(term98276, term98276.getClass(), "childIndices", term98284);
        setElement(term98288, 0, term98289);
        setElement(term98288, 1, term98282);
        setElement(term98288, 2, term98283);
        setElement(term98288, 3, term98290);
        setElement(term98288, 4, term98291);
        setElement(term98288, 5, term98292);
        setField(term98276, term98276.getClass(), "children", term98288);
        setField(term98276, term98276.getClass(), "source", term98293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.TreeModelEvent");
        Object[] args = new Object[1];
        args[0] = term98276;
        callMethod(klass, "treeStructureChanged", argTypes, null, args);
    }

};


