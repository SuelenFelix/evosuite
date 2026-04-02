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
import java.lang.Integer;

public class TopKFrequentWords_topKFrequent_343076151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261;
     Object term262;
     Object term323;

    public TopKFrequentWords_topKFrequent_343076151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261 = newInstance(Class.forName("leetcode.medium.TopKFrequentWords"));
        term262 = (Object[]) newArray("java.lang.String", 5);
        setElement(term262, 0, "PAEBtnZtTD");
        setElement(term262, 1, "sjlJAEtRrb");
        setElement(term262, 2, "MuLcgQHgqz");
        setElement(term262, 3, "xxtlPwDYFs");
        setElement(term262, 4, "jJCZpVmanW");
        term323 = new Integer(-1371869594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.TopKFrequentWords");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term262;
        args[1] = term323;
        callMethod(klass, "topKFrequent", argTypes, term261, args);
    }

};


