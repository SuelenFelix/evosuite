package online.devupgrade.sezon2.utilshelpers;

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
import static online.devupgrade.sezon2.utilshelpers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OrderPriceSumCalculator_visit_21389702153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1888;

    public OrderPriceSumCalculator_visit_21389702153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1888 = newInstance(Class.forName("online.devupgrade.sezon2.utilshelpers.OrderPriceSumCalculator"));
        setField(term1888, term1888.getClass(), "sumMantisa", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.utilshelpers.OrderPriceSumCalculator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.Optional");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "visit", argTypes, term1888, args);
    }

};


