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

public class TreeTableModel_treeNodesChanged_89556559845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98172;

    public TreeTableModel_treeNodesChanged_89556559845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98172 = newInstance(Class.forName("javax.swing.event.TreeModelEvent"));
        Object term98173 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98174 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98175 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98176 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98177 = newInstance(Class.forName("java.lang.Object"));
        Object term98178 = newInstance(Class.forName("java.lang.Object"));
        Object term98179 = newInstance(Class.forName("java.lang.Object"));
        int[] term98180 = (int[]) newIntArray(2);
        Object[] term98183 = (Object[]) newArray("java.lang.Object", 1);
        Object term98184 = newInstance(Class.forName("java.lang.Object"));
        setField(term98176, term98176.getClass(), "parentPath", null);
        setField(term98176, term98176.getClass(), "lastPathComponent", null);
        setField(term98175, term98175.getClass(), "parentPath", term98176);
        setField(term98175, term98175.getClass(), "lastPathComponent", term98177);
        setField(term98174, term98174.getClass(), "parentPath", term98175);
        setField(term98174, term98174.getClass(), "lastPathComponent", term98178);
        setField(term98173, term98173.getClass(), "parentPath", term98174);
        setField(term98173, term98173.getClass(), "lastPathComponent", term98179);
        setField(term98172, term98172.getClass(), "path", term98173);
        setIntElement(term98180, 0, 34167717);
        setIntElement(term98180, 1, -514195141);
        setField(term98172, term98172.getClass(), "childIndices", term98180);
        setElement(term98183, 0, term98184);
        setField(term98172, term98172.getClass(), "children", term98183);
        setField(term98172, term98172.getClass(), "source", term98178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.TreeModelEvent");
        Object[] args = new Object[1];
        args[0] = term98172;
        callMethod(klass, "treeNodesChanged", argTypes, null, args);
    }

};


