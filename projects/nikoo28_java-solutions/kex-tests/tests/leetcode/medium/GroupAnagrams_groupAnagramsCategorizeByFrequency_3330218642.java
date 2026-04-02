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

public class GroupAnagrams_groupAnagramsCategorizeByFrequency_3330218642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4060;
     Object term4061;

    public GroupAnagrams_groupAnagramsCategorizeByFrequency_3330218642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4060 = newInstance(Class.forName("leetcode.medium.GroupAnagrams"));
        term4061 = (Object[]) newArray("java.lang.String", 7);
        setElement(term4061, 0, "nGKItKLYNC");
        setElement(term4061, 1, "UiUYnPrcCi");
        setElement(term4061, 2, "UoYtihxVaS");
        setElement(term4061, 3, "JDswTTCZHV");
        setElement(term4061, 4, "onpbIeEKoi");
        setElement(term4061, 5, "YRHGsAkhxb");
        setElement(term4061, 6, "ffYhPOzlUs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.GroupAnagrams");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term4061;
        callMethod(klass, "groupAnagramsCategorizeByFrequency", argTypes, term4060, args);
    }

};


