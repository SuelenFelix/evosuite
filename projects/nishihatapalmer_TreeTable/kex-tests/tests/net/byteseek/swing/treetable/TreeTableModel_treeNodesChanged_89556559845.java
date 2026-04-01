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
     Object term99139;

    public TreeTableModel_treeNodesChanged_89556559845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99139 = newInstance(Class.forName("javax.swing.event.TreeModelEvent"));
        Object term99140 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99141 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99142 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99143 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99144 = newInstance(Class.forName("java.lang.Object"));
        Object term99145 = newInstance(Class.forName("java.lang.Object"));
        Object term99146 = newInstance(Class.forName("java.lang.Object"));
        int[] term99147 = (int[]) newIntArray(2);
        Object[] term99150 = (Object[]) newArray("java.lang.Object", 1);
        Object term99151 = newInstance(Class.forName("java.lang.Object"));
        setField(term99143, term99143.getClass(), "parentPath", null);
        setField(term99143, term99143.getClass(), "lastPathComponent", null);
        setField(term99142, term99142.getClass(), "parentPath", term99143);
        setField(term99142, term99142.getClass(), "lastPathComponent", term99144);
        setField(term99141, term99141.getClass(), "parentPath", term99142);
        setField(term99141, term99141.getClass(), "lastPathComponent", term99145);
        setField(term99140, term99140.getClass(), "parentPath", term99141);
        setField(term99140, term99140.getClass(), "lastPathComponent", term99146);
        setField(term99139, term99139.getClass(), "path", term99140);
        setIntElement(term99147, 0, -43719302);
        setIntElement(term99147, 1, 1024134939);
        setField(term99139, term99139.getClass(), "childIndices", term99147);
        setElement(term99150, 0, term99151);
        setField(term99139, term99139.getClass(), "children", term99150);
        setField(term99139, term99139.getClass(), "source", term99145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.TreeModelEvent");
        Object[] args = new Object[1];
        args[0] = term99139;
        callMethod(klass, "treeNodesChanged", argTypes, null, args);
    }

};


