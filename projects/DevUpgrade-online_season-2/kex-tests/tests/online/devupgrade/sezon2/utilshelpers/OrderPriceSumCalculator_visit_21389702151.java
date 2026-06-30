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
import java.lang.Integer;
import java.util.LinkedHashMap;

public class OrderPriceSumCalculator_visit_21389702151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1853;
     Object term1855;
     Object term1865;

    public OrderPriceSumCalculator_visit_21389702151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1853 = newInstance(Class.forName("online.devupgrade.sezon2.utilshelpers.OrderPriceSumCalculator"));
        Object term1854 = newInstance(Class.forName("online.devupgrade.sezon2.utilshelpers.SumProvider"));
        setField(term1853, term1853.getClass(), "sumMantisa", term1854);
        Integer term1859 = new Integer(1162663216);
        Object term1858 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term1858, term1858.getClass(), "id", term1859);
        setFloatField(term1858, term1858.getClass(), "price", 0.13238746F);
        setFloatField(term1858, term1858.getClass(), "pricePoPrzecinku", 0.2707036F);
        setBooleanField(term1858, term1858.getClass(), "isPriceGetOnce", false);
        term1855 = new LinkedList();
        ((LinkedList) term1855).add(term1858);
        LinkedHashMap term1866 = new LinkedHashMap();
        term1865 = newInstance(Class.forName("java.util.Optional"));
        setField(term1865, term1865.getClass(), "value", term1866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.utilshelpers.OrderPriceSumCalculator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.Optional");
        Object[] args = new Object[2];
        args[0] = term1855;
        args[1] = term1865;
        callMethod(klass, "visit", argTypes, term1853, args);
    }

};


