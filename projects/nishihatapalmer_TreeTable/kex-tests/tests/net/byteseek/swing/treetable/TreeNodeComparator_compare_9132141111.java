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

public class TreeNodeComparator_compare_9132141111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369385;

    public TreeNodeComparator_compare_9132141111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369385 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeNodeComparator"));
        setField(term369385, term369385.getClass(), "model", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeNodeComparator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "compare", argTypes, term369385, args);
    }

};


