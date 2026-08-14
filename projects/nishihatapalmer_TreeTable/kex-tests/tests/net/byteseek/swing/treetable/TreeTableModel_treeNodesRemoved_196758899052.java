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

public class TreeTableModel_treeNodesRemoved_196758899052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98265;
     Object term98266;

    public TreeTableModel_treeNodesRemoved_196758899052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98265 = (int[]) newIntArray(0);
        term98266 = (Object[]) newArray("java.lang.Object", 9);
        Object term98267 = newInstance(Class.forName("java.lang.Object"));
        Object term98268 = newInstance(Class.forName("java.lang.Object"));
        Object term98269 = newInstance(Class.forName("java.lang.Object"));
        Object term98270 = newInstance(Class.forName("java.lang.Object"));
        Object term98271 = newInstance(Class.forName("java.lang.Object"));
        Object term98272 = newInstance(Class.forName("java.lang.Object"));
        Object term98273 = newInstance(Class.forName("java.lang.Object"));
        Object term98274 = newInstance(Class.forName("java.lang.Object"));
        Object term98275 = newInstance(Class.forName("java.lang.Object"));
        setElement(term98266, 0, term98267);
        setElement(term98266, 1, term98268);
        setElement(term98266, 2, term98269);
        setElement(term98266, 3, term98270);
        setElement(term98266, 4, term98271);
        setElement(term98266, 5, term98272);
        setElement(term98266, 6, term98273);
        setElement(term98266, 7, term98274);
        setElement(term98266, 8, term98275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term98265;
        args[2] = term98266;
        callMethod(klass, "treeNodesRemoved", argTypes, null, args);
    }

};


