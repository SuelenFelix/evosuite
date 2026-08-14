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
import java.lang.Integer;

public class MaximumSumTwoNonOverlappingSubarrays_maxSumTwoNoOverlap_2768379151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4779;
     Object term4780;
     Object term4788;
     Object term4790;

    public MaximumSumTwoNonOverlappingSubarrays_maxSumTwoNoOverlap_2768379151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4779 = newInstance(Class.forName("leetcode.MaximumSumTwoNonOverlappingSubarrays"));
        term4780 = (int[]) newIntArray(7);
        setIntElement(term4780, 0, 1865070548);
        setIntElement(term4780, 1, 1904515443);
        setIntElement(term4780, 2, 1361126430);
        setIntElement(term4780, 3, 1728588701);
        setIntElement(term4780, 4, -355769268);
        setIntElement(term4780, 5, -114460662);
        setIntElement(term4780, 6, -355376034);
        term4788 = new Integer(588390599);
        term4790 = new Integer(-95969566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MaximumSumTwoNonOverlappingSubarrays");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term4780;
        args[1] = term4788;
        args[2] = term4790;
        callMethod(klass, "maxSumTwoNoOverlap", argTypes, term4779, args);
    }

};


