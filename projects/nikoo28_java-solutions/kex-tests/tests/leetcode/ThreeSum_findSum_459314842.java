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
     Object term11549;
     Object term11550;
     Object term11554;
     Object term11556;
     Object term11558;

    public ThreeSum_findSum_459314842() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11549 = newInstance(Class.forName("leetcode.ThreeSum"));
        term11550 = (int[]) newIntArray(3);
        setIntElement(term11550, 0, -935912608);
        setIntElement(term11550, 1, 505087197);
        setIntElement(term11550, 2, 427005798);
        term11554 = new Integer(-993454505);
        term11556 = new Integer(-238353821);
        HashMap term11559 = new HashMap();
        Set<Object> term11584 =  ((Map) term11559).keySet();
        term11558 = new HashSet((Collection<? extends Object>) term11584);
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
        args[0] = term11550;
        args[1] = term11554;
        args[2] = term11556;
        args[3] = term11558;
        callMethod(klass, "findSum", argTypes, term11549, args);
    }

};


