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

public class SameTree_isSameTree_527993381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2822;
     Object term2823;
     Object term2841;

    public SameTree_isSameTree_527993381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2822 = newInstance(Class.forName("leetcode.easy.SameTree"));
        term2823 = newInstance(Class.forName("util.TreeNode"));
        Object term2825 = newInstance(Class.forName("util.TreeNode"));
        Object term2827 = newInstance(Class.forName("util.TreeNode"));
        Object term2829 = newInstance(Class.forName("util.TreeNode"));
        Object term2831 = newInstance(Class.forName("util.TreeNode"));
        Object term2833 = newInstance(Class.forName("util.TreeNode"));
        Object term2835 = newInstance(Class.forName("util.TreeNode"));
        Object term2837 = newInstance(Class.forName("util.TreeNode"));
        Object term2839 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2823, term2823.getClass(), "val", 2027686272);
        setIntField(term2825, term2825.getClass(), "val", -1494356104);
        setIntField(term2827, term2827.getClass(), "val", -695279311);
        setIntField(term2829, term2829.getClass(), "val", 114279242);
        setIntField(term2831, term2831.getClass(), "val", 990883365);
        setField(term2831, term2831.getClass(), "left", null);
        setField(term2831, term2831.getClass(), "right", term2825);
        setField(term2829, term2829.getClass(), "left", term2831);
        setIntField(term2833, term2833.getClass(), "val", 1713573821);
        setField(term2833, term2833.getClass(), "left", null);
        setField(term2833, term2833.getClass(), "right", null);
        setField(term2829, term2829.getClass(), "right", term2833);
        setField(term2827, term2827.getClass(), "left", term2829);
        setIntField(term2835, term2835.getClass(), "val", -1114668574);
        setIntField(term2837, term2837.getClass(), "val", 514511037);
        setField(term2837, term2837.getClass(), "left", term2833);
        setField(term2837, term2837.getClass(), "right", term2823);
        setField(term2835, term2835.getClass(), "left", term2837);
        setIntField(term2839, term2839.getClass(), "val", 633598642);
        setField(term2839, term2839.getClass(), "left", null);
        setField(term2839, term2839.getClass(), "right", term2825);
        setField(term2835, term2835.getClass(), "right", term2839);
        setField(term2827, term2827.getClass(), "right", term2835);
        setField(term2825, term2825.getClass(), "left", term2827);
        setField(term2825, term2825.getClass(), "right", term2835);
        setField(term2823, term2823.getClass(), "left", term2825);
        setField(term2823, term2823.getClass(), "right", term2831);
        term2841 = newInstance(Class.forName("util.TreeNode"));
        Object term2843 = newInstance(Class.forName("util.TreeNode"));
        Object term2845 = newInstance(Class.forName("util.TreeNode"));
        Object term2847 = newInstance(Class.forName("util.TreeNode"));
        Object term2849 = newInstance(Class.forName("util.TreeNode"));
        Object term2851 = newInstance(Class.forName("util.TreeNode"));
        Object term2853 = newInstance(Class.forName("util.TreeNode"));
        Object term2855 = newInstance(Class.forName("util.TreeNode"));
        Object term2857 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2841, term2841.getClass(), "val", 1956590498);
        setIntField(term2843, term2843.getClass(), "val", 1467356494);
        setIntField(term2845, term2845.getClass(), "val", -26316536);
        setIntField(term2847, term2847.getClass(), "val", 1716165145);
        setIntField(term2849, term2849.getClass(), "val", 1692937831);
        setField(term2849, term2849.getClass(), "left", null);
        setField(term2849, term2849.getClass(), "right", term2843);
        setField(term2847, term2847.getClass(), "left", term2849);
        setIntField(term2851, term2851.getClass(), "val", -1945635750);
        setField(term2851, term2851.getClass(), "left", null);
        setField(term2851, term2851.getClass(), "right", null);
        setField(term2847, term2847.getClass(), "right", term2851);
        setField(term2845, term2845.getClass(), "left", term2847);
        setIntField(term2853, term2853.getClass(), "val", 550892835);
        setIntField(term2855, term2855.getClass(), "val", 1237549886);
        setField(term2855, term2855.getClass(), "left", term2851);
        setField(term2855, term2855.getClass(), "right", term2841);
        setField(term2853, term2853.getClass(), "left", term2855);
        setIntField(term2857, term2857.getClass(), "val", -1539747985);
        setField(term2857, term2857.getClass(), "left", null);
        setField(term2857, term2857.getClass(), "right", term2843);
        setField(term2853, term2853.getClass(), "right", term2857);
        setField(term2845, term2845.getClass(), "right", term2853);
        setField(term2843, term2843.getClass(), "left", term2845);
        setField(term2843, term2843.getClass(), "right", term2853);
        setField(term2841, term2841.getClass(), "left", term2843);
        setField(term2841, term2841.getClass(), "right", term2849);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.SameTree");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = Class.forName("util.TreeNode");
        Object[] args = new Object[2];
        args[0] = term2823;
        args[1] = term2841;
        callMethod(klass, "isSameTree", argTypes, term2822, args);
    }

};


