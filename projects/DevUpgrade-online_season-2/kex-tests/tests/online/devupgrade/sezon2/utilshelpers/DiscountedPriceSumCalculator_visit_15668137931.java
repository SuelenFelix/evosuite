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
import java.lang.Object;
import java.util.LinkedList;
import java.util.LinkedHashMap;

public class DiscountedPriceSumCalculator_visit_15668137931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1889;
     Object term1891;
     Object term1894;

    public DiscountedPriceSumCalculator_visit_15668137931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1889 = newInstance(Class.forName("online.devupgrade.sezon2.utilshelpers.DiscountedPriceSumCalculator"));
        Object term1890 = newInstance(Class.forName("online.devupgrade.sezon2.utilshelpers.SumProvider"));
        setField(term1889, term1889.getClass(), "sumMantisa", term1890);
        term1891 = new LinkedList();
        LinkedHashMap term1895 = new LinkedHashMap();
        term1894 = newInstance(Class.forName("java.util.Optional"));
        setField(term1894, term1894.getClass(), "value", term1895);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.utilshelpers.DiscountedPriceSumCalculator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.Optional");
        Object[] args = new Object[2];
        args[0] = term1891;
        args[1] = term1894;
        callMethod(klass, "visit", argTypes, term1889, args);
    }

};


