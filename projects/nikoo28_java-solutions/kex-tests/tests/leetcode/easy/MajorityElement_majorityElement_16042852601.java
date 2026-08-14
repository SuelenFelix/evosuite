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

public class MajorityElement_majorityElement_16042852601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2616;
     Object term2617;

    public MajorityElement_majorityElement_16042852601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2616 = newInstance(Class.forName("leetcode.easy.MajorityElement"));
        term2617 = (int[]) newIntArray(6);
        setIntElement(term2617, 0, -1840305774);
        setIntElement(term2617, 1, 1365087144);
        setIntElement(term2617, 2, -1537255112);
        setIntElement(term2617, 3, 934477462);
        setIntElement(term2617, 4, 4900410);
        setIntElement(term2617, 5, -1252345779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.MajorityElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2617;
        callMethod(klass, "majorityElement", argTypes, term2616, args);
    }

};


