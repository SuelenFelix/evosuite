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

public class TreeTableModel_insertChildNodesToModel_152431795261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98316;

    public TreeTableModel_insertChildNodesToModel_152431795261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98316 = (int[]) newIntArray(7);
        setIntElement(term98316, 0, -100681578);
        setIntElement(term98316, 1, 296568835);
        setIntElement(term98316, 2, 1431951992);
        setIntElement(term98316, 3, -1608123016);
        setIntElement(term98316, 4, -896473214);
        setIntElement(term98316, 5, 401203924);
        setIntElement(term98316, 6, -1212399479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term98316;
        callMethod(klass, "insertChildNodesToModel", argTypes, null, args);
    }

};


