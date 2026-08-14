package leetcode.easy;

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
import static leetcode.easy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class InvertTree_invertTreeRecursive_18744411921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2760;
     Object term2761;

    public InvertTree_invertTreeRecursive_18744411921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2760 = newInstance(Class.forName("leetcode.easy.InvertTree"));
        term2761 = newInstance(Class.forName("util.TreeNode"));
        Object term2763 = newInstance(Class.forName("util.TreeNode"));
        Object term2765 = newInstance(Class.forName("util.TreeNode"));
        Object term2767 = newInstance(Class.forName("util.TreeNode"));
        Object term2769 = newInstance(Class.forName("util.TreeNode"));
        Object term2771 = newInstance(Class.forName("util.TreeNode"));
        Object term2773 = newInstance(Class.forName("util.TreeNode"));
        Object term2775 = newInstance(Class.forName("util.TreeNode"));
        Object term2777 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2761, term2761.getClass(), "val", -763166094);
        setIntField(term2763, term2763.getClass(), "val", -222941705);
        setIntField(term2765, term2765.getClass(), "val", 291864719);
        setIntField(term2767, term2767.getClass(), "val", -1549607466);
        setIntField(term2769, term2769.getClass(), "val", 853609788);
        setField(term2769, term2769.getClass(), "left", null);
        setField(term2769, term2769.getClass(), "right", term2763);
        setField(term2767, term2767.getClass(), "left", term2769);
        setIntField(term2771, term2771.getClass(), "val", -975748721);
        setField(term2771, term2771.getClass(), "left", null);
        setField(term2771, term2771.getClass(), "right", null);
        setField(term2767, term2767.getClass(), "right", term2771);
        setField(term2765, term2765.getClass(), "left", term2767);
        setIntField(term2773, term2773.getClass(), "val", 1639448749);
        setIntField(term2775, term2775.getClass(), "val", 873659088);
        setField(term2775, term2775.getClass(), "left", term2771);
        setField(term2775, term2775.getClass(), "right", term2761);
        setField(term2773, term2773.getClass(), "left", term2775);
        setIntField(term2777, term2777.getClass(), "val", -197820800);
        setField(term2777, term2777.getClass(), "left", null);
        setField(term2777, term2777.getClass(), "right", term2763);
        setField(term2773, term2773.getClass(), "right", term2777);
        setField(term2765, term2765.getClass(), "right", term2773);
        setField(term2763, term2763.getClass(), "left", term2765);
        setField(term2763, term2763.getClass(), "right", term2773);
        setField(term2761, term2761.getClass(), "left", term2763);
        setField(term2761, term2761.getClass(), "right", term2769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.InvertTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.TreeNode");
        Object[] args = new Object[1];
        args[0] = term2761;
        callMethod(klass, "invertTreeRecursive", argTypes, term2760, args);
    }

};


