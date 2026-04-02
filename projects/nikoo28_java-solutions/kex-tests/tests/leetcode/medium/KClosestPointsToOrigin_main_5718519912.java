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

public class KClosestPointsToOrigin_main_5718519912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1726;

    public KClosestPointsToOrigin_main_5718519912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1726 = (Object[]) newArray("java.lang.String", 6);
        setElement(term1726, 0, "pCTimMblYc");
        setElement(term1726, 1, "hNxWaHcfhY");
        setElement(term1726, 2, "RkybSrpybU");
        setElement(term1726, 3, "xOEqzGAmDU");
        setElement(term1726, 4, "eZFUvlxvGV");
        setElement(term1726, 5, "BYqFIqCKAV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.KClosestPointsToOrigin");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1726;
        callMethod(klass, "main", argTypes, null, args);
    }

};


