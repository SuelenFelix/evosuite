package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TreeNode_levelOrderTraversal_300791514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;

    public TreeNode_levelOrderTraversal_300791514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = newInstance(Class.forName("util.TreeNode"));
        Object term59 = newInstance(Class.forName("util.TreeNode"));
        Object term61 = newInstance(Class.forName("util.TreeNode"));
        Object term63 = newInstance(Class.forName("util.TreeNode"));
        Object term65 = newInstance(Class.forName("util.TreeNode"));
        Object term67 = newInstance(Class.forName("util.TreeNode"));
        Object term69 = newInstance(Class.forName("util.TreeNode"));
        Object term71 = newInstance(Class.forName("util.TreeNode"));
        Object term73 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term57, term57.getClass(), "val", -1179120542);
        setIntField(term59, term59.getClass(), "val", -73683645);
        setIntField(term61, term61.getClass(), "val", -226514366);
        setIntField(term63, term63.getClass(), "val", 1193880199);
        setIntField(term65, term65.getClass(), "val", -1087774327);
        setField(term65, term65.getClass(), "left", null);
        setField(term65, term65.getClass(), "right", term59);
        setField(term63, term63.getClass(), "left", term65);
        setIntField(term67, term67.getClass(), "val", 1962444399);
        setField(term67, term67.getClass(), "left", null);
        setField(term67, term67.getClass(), "right", null);
        setField(term63, term63.getClass(), "right", term67);
        setField(term61, term61.getClass(), "left", term63);
        setIntField(term69, term69.getClass(), "val", -1145578966);
        setIntField(term71, term71.getClass(), "val", 679763016);
        setField(term71, term71.getClass(), "left", term67);
        setField(term71, term71.getClass(), "right", term57);
        setField(term69, term69.getClass(), "left", term71);
        setIntField(term73, term73.getClass(), "val", -1530420153);
        setField(term73, term73.getClass(), "left", null);
        setField(term73, term73.getClass(), "right", term59);
        setField(term69, term69.getClass(), "right", term73);
        setField(term61, term61.getClass(), "right", term69);
        setField(term59, term59.getClass(), "left", term61);
        setField(term59, term59.getClass(), "right", term69);
        setField(term57, term57.getClass(), "left", term59);
        setField(term57, term57.getClass(), "right", term65);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.TreeNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term57;
        callMethod(klass, "levelOrderTraversal", argTypes, null, args);
    }

};


