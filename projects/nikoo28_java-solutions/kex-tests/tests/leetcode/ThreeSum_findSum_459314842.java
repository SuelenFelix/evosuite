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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ThreeSum_findSum_459314842 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11964;
     Object term11965;
     Object term11969;
     Object term11971;
     Object term11973;

    public ThreeSum_findSum_459314842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11964 = newInstance(Class.forName("leetcode.ThreeSum"));
        term11965 = (int[]) newIntArray(3);
        setIntElement(term11965, 0, 216265002);
        setIntElement(term11965, 1, -97405660);
        setIntElement(term11965, 2, 872278468);
        term11969 = new Integer(-1003390920);
        term11971 = new Integer(-2052568448);
        HashMap term11974 = new HashMap();
        Set<Object> term11982 =  ((Map) term11974).keySet();
        term11973 = new HashSet((Collection<? extends Object>) term11982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ThreeSum");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.util.Set");
        Object[] args = new Object[4];
        args[0] = term11965;
        args[1] = term11969;
        args[2] = term11971;
        args[3] = term11973;
        callMethod(klass, "findSum", argTypes, term11964, args);
    }

};


