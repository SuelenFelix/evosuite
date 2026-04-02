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
import java.lang.Integer;

public class TwoSumIV_findTarget_16623049441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12553;
     Object term12554;
     Object term12572;

    public TwoSumIV_findTarget_16623049441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12553 = newInstance(Class.forName("leetcode.TwoSumIV"));
        term12554 = newInstance(Class.forName("util.TreeNode"));
        Object term12556 = newInstance(Class.forName("util.TreeNode"));
        Object term12558 = newInstance(Class.forName("util.TreeNode"));
        Object term12560 = newInstance(Class.forName("util.TreeNode"));
        Object term12562 = newInstance(Class.forName("util.TreeNode"));
        Object term12564 = newInstance(Class.forName("util.TreeNode"));
        Object term12566 = newInstance(Class.forName("util.TreeNode"));
        Object term12568 = newInstance(Class.forName("util.TreeNode"));
        Object term12570 = newInstance(Class.forName("util.TreeNode"));
        setIntField(term12554, term12554.getClass(), "val", -1886360357);
        setIntField(term12556, term12556.getClass(), "val", -235867268);
        setIntField(term12558, term12558.getClass(), "val", -972330704);
        setIntField(term12560, term12560.getClass(), "val", 134173297);
        setIntField(term12562, term12562.getClass(), "val", 2025698852);
        setField(term12562, term12562.getClass(), "left", null);
        setField(term12562, term12562.getClass(), "right", term12556);
        setField(term12560, term12560.getClass(), "left", term12562);
        setIntField(term12564, term12564.getClass(), "val", -899109027);
        setField(term12564, term12564.getClass(), "left", null);
        setField(term12564, term12564.getClass(), "right", null);
        setField(term12560, term12560.getClass(), "right", term12564);
        setField(term12558, term12558.getClass(), "left", term12560);
        setIntField(term12566, term12566.getClass(), "val", 498801287);
        setIntField(term12568, term12568.getClass(), "val", 969573395);
        setField(term12568, term12568.getClass(), "left", term12564);
        setField(term12568, term12568.getClass(), "right", term12554);
        setField(term12566, term12566.getClass(), "left", term12568);
        setIntField(term12570, term12570.getClass(), "val", 113961338);
        setField(term12570, term12570.getClass(), "left", null);
        setField(term12570, term12570.getClass(), "right", term12556);
        setField(term12566, term12566.getClass(), "right", term12570);
        setField(term12558, term12558.getClass(), "right", term12566);
        setField(term12556, term12556.getClass(), "left", term12558);
        setField(term12556, term12556.getClass(), "right", term12566);
        setField(term12554, term12554.getClass(), "left", term12556);
        setField(term12554, term12554.getClass(), "right", term12562);
        term12572 = new Integer(-694297070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.TwoSumIV");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.TreeNode");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term12554;
        args[1] = term12572;
        callMethod(klass, "findTarget", argTypes, term12553, args);
    }

};


