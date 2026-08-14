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

public class TreeTableModel_treeNodesInserted_172939843150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98217;

    public TreeTableModel_treeNodesInserted_172939843150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98217 = (int[]) newIntArray(7);
        setIntElement(term98217, 0, 626179200);
        setIntElement(term98217, 1, -511077684);
        setIntElement(term98217, 2, -711507760);
        setIntElement(term98217, 3, 1053773809);
        setIntElement(term98217, 4, 924127883);
        setIntElement(term98217, 5, -751079123);
        setIntElement(term98217, 6, -110837188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term98217;
        callMethod(klass, "treeNodesInserted", argTypes, null, args);
    }

};


