package hackerrank.datastructures.trees;

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
import static hackerrank.datastructures.trees.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HeightOfABinaryTree_height_2192730911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term60;

    public HeightOfABinaryTree_height_2192730911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = newInstance(Class.forName("hackerrank.datastructures.trees.HeightOfABinaryTree"));
        term60 = newInstance(Class.forName("util.TreeNode"));
        Object term62 = newInstance(Class.forName("util.TreeNode"));
        Object term64 = newInstance(Class.forName("util.TreeNode"));
        Object term66 = newInstance(Class.forName("util.TreeNode"));
        Object term68 = newInstance(Class.forName("util.TreeNode"));
        Object term70 = newInstance(Class.forName("util.TreeNode"));
        Object term72 = newInstance(Class.forName("util.TreeNode"));
        Object term74 = newInstance(Class.forName("util.TreeNode"));
        Object term76 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term60, term60.getClass(), "val", -655067527);
        setIntField(term62, term62.getClass(), "val", -6029667);
        setIntField(term64, term64.getClass(), "val", -2068769794);
        setIntField(term66, term66.getClass(), "val", -117576464);
        setIntField(term68, term68.getClass(), "val", -1007160944);
        setField(term68, term68.getClass(), "left", null);
        setField(term68, term68.getClass(), "right", term62);
        setField(term66, term66.getClass(), "left", term68);
        setIntField(term70, term70.getClass(), "val", -244121226);
        setField(term70, term70.getClass(), "left", null);
        setField(term70, term70.getClass(), "right", null);
        setField(term66, term66.getClass(), "right", term70);
        setField(term64, term64.getClass(), "left", term66);
        setIntField(term72, term72.getClass(), "val", 865208305);
        setIntField(term74, term74.getClass(), "val", -1275173084);
        setField(term74, term74.getClass(), "left", term70);
        setField(term74, term74.getClass(), "right", term60);
        setField(term72, term72.getClass(), "left", term74);
        setIntField(term76, term76.getClass(), "val", 1135664017);
        setField(term76, term76.getClass(), "left", null);
        setField(term76, term76.getClass(), "right", term62);
        setField(term72, term72.getClass(), "right", term76);
        setField(term64, term64.getClass(), "right", term72);
        setField(term62, term62.getClass(), "left", term64);
        setField(term62, term62.getClass(), "right", term72);
        setField(term60, term60.getClass(), "left", term62);
        setField(term60, term60.getClass(), "right", term68);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.trees.HeightOfABinaryTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term60;
        callMethod(klass, "height", argTypes, term59, args);
    }

};


