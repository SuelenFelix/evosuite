package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AddTwoNumbersII_addTwoNumbers_1642818681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3676;
     Object term3677;
     Object term3687;

    public AddTwoNumbersII_addTwoNumbers_1642818681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3676 = newInstance(Class.forName("leetcode.medium.AddTwoNumbersII"));
        term3677 = newInstance(Class.forName("util.ListNode"));
        Object term3679 = newInstance(Class.forName("util.ListNode"));
        Object term3681 = newInstance(Class.forName("util.ListNode"));
        Object term3683 = newInstance(Class.forName("util.ListNode"));
        Object term3685 = newInstance(Class.forName("util.ListNode"));
        setIntField(term3677, term3677.getClass(), "val", -1641507499);
        setIntField(term3679, term3679.getClass(), "val", -33436796);
        setIntField(term3681, term3681.getClass(), "val", -1527326823);
        setIntField(term3683, term3683.getClass(), "val", 469871899);
        setIntField(term3685, term3685.getClass(), "val", -1348703436);
        setField(term3685, term3685.getClass(), "next", null);
        setField(term3683, term3683.getClass(), "next", term3685);
        setField(term3681, term3681.getClass(), "next", term3683);
        setField(term3679, term3679.getClass(), "next", term3681);
        setField(term3677, term3677.getClass(), "next", term3679);
        term3687 = newInstance(Class.forName("util.ListNode"));
        Object term3689 = newInstance(Class.forName("util.ListNode"));
        Object term3691 = newInstance(Class.forName("util.ListNode"));
        Object term3693 = newInstance(Class.forName("util.ListNode"));
        Object term3695 = newInstance(Class.forName("util.ListNode"));
        setIntField(term3687, term3687.getClass(), "val", 2084868811);
        setIntField(term3689, term3689.getClass(), "val", 314478878);
        setIntField(term3691, term3691.getClass(), "val", 1425342686);
        setIntField(term3693, term3693.getClass(), "val", -1042470635);
        setIntField(term3695, term3695.getClass(), "val", -524352937);
        setField(term3695, term3695.getClass(), "next", null);
        setField(term3693, term3693.getClass(), "next", term3695);
        setField(term3691, term3691.getClass(), "next", term3693);
        setField(term3689, term3689.getClass(), "next", term3691);
        setField(term3687, term3687.getClass(), "next", term3689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.AddTwoNumbersII");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.ListNode");
        argTypes[1] = Class.forName("util.ListNode");
        Object[] args = new Object[2];
        args[0] = term3677;
        args[1] = term3687;
        callMethod(klass, "addTwoNumbers", argTypes, term3676, args);
    }

};


