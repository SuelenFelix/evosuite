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

public class LeafSimilar_leafSimilar_1442639931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2926;
     Object term2927;
     Object term2945;

    public LeafSimilar_leafSimilar_1442639931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2926 = newInstance(Class.forName("leetcode.LeafSimilar"));
        term2927 = newInstance(Class.forName("util.TreeNode"));
        Object term2929 = newInstance(Class.forName("util.TreeNode"));
        Object term2931 = newInstance(Class.forName("util.TreeNode"));
        Object term2933 = newInstance(Class.forName("util.TreeNode"));
        Object term2935 = newInstance(Class.forName("util.TreeNode"));
        Object term2937 = newInstance(Class.forName("util.TreeNode"));
        Object term2939 = newInstance(Class.forName("util.TreeNode"));
        Object term2941 = newInstance(Class.forName("util.TreeNode"));
        Object term2943 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2927, term2927.getClass(), "val", -439048495);
        setIntField(term2929, term2929.getClass(), "val", -1849105286);
        setIntField(term2931, term2931.getClass(), "val", 1334483645);
        setIntField(term2933, term2933.getClass(), "val", 917513193);
        setIntField(term2935, term2935.getClass(), "val", 787278105);
        setField(term2935, term2935.getClass(), "left", null);
        setField(term2935, term2935.getClass(), "right", term2929);
        setField(term2933, term2933.getClass(), "left", term2935);
        setIntField(term2937, term2937.getClass(), "val", 1723148410);
        setField(term2937, term2937.getClass(), "left", null);
        setField(term2937, term2937.getClass(), "right", null);
        setField(term2933, term2933.getClass(), "right", term2937);
        setField(term2931, term2931.getClass(), "left", term2933);
        setIntField(term2939, term2939.getClass(), "val", 320711637);
        setIntField(term2941, term2941.getClass(), "val", 1241164745);
        setField(term2941, term2941.getClass(), "left", term2937);
        setField(term2941, term2941.getClass(), "right", term2927);
        setField(term2939, term2939.getClass(), "left", term2941);
        setIntField(term2943, term2943.getClass(), "val", -2063843486);
        setField(term2943, term2943.getClass(), "left", null);
        setField(term2943, term2943.getClass(), "right", term2929);
        setField(term2939, term2939.getClass(), "right", term2943);
        setField(term2931, term2931.getClass(), "right", term2939);
        setField(term2929, term2929.getClass(), "left", term2931);
        setField(term2929, term2929.getClass(), "right", term2939);
        setField(term2927, term2927.getClass(), "left", term2929);
        setField(term2927, term2927.getClass(), "right", term2935);
        term2945 = newInstance(Class.forName("util.TreeNode"));
        Object term2947 = newInstance(Class.forName("util.TreeNode"));
        Object term2949 = newInstance(Class.forName("util.TreeNode"));
        Object term2951 = newInstance(Class.forName("util.TreeNode"));
        Object term2953 = newInstance(Class.forName("util.TreeNode"));
        Object term2955 = newInstance(Class.forName("util.TreeNode"));
        Object term2957 = newInstance(Class.forName("util.TreeNode"));
        Object term2959 = newInstance(Class.forName("util.TreeNode"));
        Object term2961 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term2945, term2945.getClass(), "val", -920797484);
        setIntField(term2947, term2947.getClass(), "val", -1631697577);
        setIntField(term2949, term2949.getClass(), "val", 765731371);
        setIntField(term2951, term2951.getClass(), "val", -1703035419);
        setIntField(term2953, term2953.getClass(), "val", 765766290);
        setField(term2953, term2953.getClass(), "left", null);
        setField(term2953, term2953.getClass(), "right", term2947);
        setField(term2951, term2951.getClass(), "left", term2953);
        setIntField(term2955, term2955.getClass(), "val", -1748391876);
        setField(term2955, term2955.getClass(), "left", null);
        setField(term2955, term2955.getClass(), "right", null);
        setField(term2951, term2951.getClass(), "right", term2955);
        setField(term2949, term2949.getClass(), "left", term2951);
        setIntField(term2957, term2957.getClass(), "val", 947897214);
        setIntField(term2959, term2959.getClass(), "val", 1496340209);
        setField(term2959, term2959.getClass(), "left", term2955);
        setField(term2959, term2959.getClass(), "right", term2945);
        setField(term2957, term2957.getClass(), "left", term2959);
        setIntField(term2961, term2961.getClass(), "val", -1284825282);
        setField(term2961, term2961.getClass(), "left", null);
        setField(term2961, term2961.getClass(), "right", term2947);
        setField(term2957, term2957.getClass(), "right", term2961);
        setField(term2949, term2949.getClass(), "right", term2957);
        setField(term2947, term2947.getClass(), "left", term2949);
        setField(term2947, term2947.getClass(), "right", term2957);
        setField(term2945, term2945.getClass(), "left", term2947);
        setField(term2945, term2945.getClass(), "right", term2953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.LeafSimilar");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = Class.forName("util.TreeNode");
        Object[] args = new Object[2];
        args[0] = term2927;
        args[1] = term2945;
        callMethod(klass, "leafSimilar", argTypes, term2926, args);
    }

};


