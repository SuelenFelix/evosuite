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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class TimeMap_binarySearchTimestamp_4934244043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3285;
     Object term3291;
     Object term3309;

    public TimeMap_binarySearchTimestamp_4934244043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3286 = new HashMap();
        term3285 = newInstance(Class.forName("leetcode.medium.TimeMap"));
        setField(term3285, term3285.getClass(), "entriesByKey", term3286);
        Object term3293 = newInstance(Class.forName("leetcode.medium.TimeStampedValue"));
        setIntField(term3293, term3293.getClass(), "timestamp", 263859424);
        setField(term3293, term3293.getClass(), "value", "xrwlQZdwCp");
        term3291 = new ArrayList();
        ((ArrayList) term3291).add(term3293);
        term3309 = new Integer(1436978289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.TimeMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3291;
        args[1] = term3309;
        callMethod(klass, "binarySearchTimestamp", argTypes, term3285, args);
    }

};


