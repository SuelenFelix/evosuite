package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Integer;

public class TwoSumIV_inorder_3716626832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13164;
     Object term13165;
     Object term13183;

    public TwoSumIV_inorder_3716626832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13164 = newInstance(Class.forName("leetcode.TwoSumIV"));
        term13165 = newInstance(Class.forName("util.TreeNode"));
        Object term13167 = newInstance(Class.forName("util.TreeNode"));
        Object term13169 = newInstance(Class.forName("util.TreeNode"));
        Object term13171 = newInstance(Class.forName("util.TreeNode"));
        Object term13173 = newInstance(Class.forName("util.TreeNode"));
        Object term13175 = newInstance(Class.forName("util.TreeNode"));
        Object term13177 = newInstance(Class.forName("util.TreeNode"));
        Object term13179 = newInstance(Class.forName("util.TreeNode"));
        Object term13181 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term13165, term13165.getClass(), "val", 833477776);
        setIntField(term13167, term13167.getClass(), "val", 2043960707);
        setIntField(term13169, term13169.getClass(), "val", 272179554);
        setIntField(term13171, term13171.getClass(), "val", 1717711536);
        setIntField(term13173, term13173.getClass(), "val", -606339607);
        setField(term13173, term13173.getClass(), "left", null);
        setField(term13173, term13173.getClass(), "right", term13167);
        setField(term13171, term13171.getClass(), "left", term13173);
        setIntField(term13175, term13175.getClass(), "val", 712181359);
        setField(term13175, term13175.getClass(), "left", null);
        setField(term13175, term13175.getClass(), "right", null);
        setField(term13171, term13171.getClass(), "right", term13175);
        setField(term13169, term13169.getClass(), "left", term13171);
        setIntField(term13177, term13177.getClass(), "val", -552996061);
        setIntField(term13179, term13179.getClass(), "val", -153013117);
        setField(term13179, term13179.getClass(), "left", term13175);
        setField(term13179, term13179.getClass(), "right", term13165);
        setField(term13177, term13177.getClass(), "left", term13179);
        setIntField(term13181, term13181.getClass(), "val", 800440712);
        setField(term13181, term13181.getClass(), "left", null);
        setField(term13181, term13181.getClass(), "right", term13167);
        setField(term13177, term13177.getClass(), "right", term13181);
        setField(term13169, term13169.getClass(), "right", term13177);
        setField(term13167, term13167.getClass(), "left", term13169);
        setField(term13167, term13167.getClass(), "right", term13177);
        setField(term13165, term13165.getClass(), "left", term13167);
        setField(term13165, term13165.getClass(), "right", term13173);
        Integer term13186 = new Integer(-1888585309);
        Integer term13189 = new Integer(683666002);
        Integer term13192 = new Integer(1596213415);
        Integer term13195 = new Integer(-268815336);
        term13183 = new LinkedList();
        ((LinkedList) term13183).add(term13186);
        ((LinkedList) term13183).add(term13189);
        ((LinkedList) term13183).add(term13192);
        ((LinkedList) term13183).add(term13195);
        ((LinkedList) term13183).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.TwoSumIV");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term13165;
        args[1] = term13183;
        callMethod(klass, "inorder", argTypes, term13164, args);
    }

};


