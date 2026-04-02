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
import java.lang.Integer;

public class CapacityToShipPackagesWithinDDays_shipWithinDays_8756197551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3698;
     Object term3699;
     Object term3703;

    public CapacityToShipPackagesWithinDDays_shipWithinDays_8756197551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3698 = newInstance(Class.forName("leetcode.medium.CapacityToShipPackagesWithinDDays"));
        term3699 = (int[]) newIntArray(3);
        setIntElement(term3699, 0, -499699841);
        setIntElement(term3699, 1, 360972386);
        setIntElement(term3699, 2, -2063884849);
        term3703 = new Integer(1054887169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.CapacityToShipPackagesWithinDDays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3699;
        args[1] = term3703;
        callMethod(klass, "shipWithinDays", argTypes, term3698, args);
    }

};


