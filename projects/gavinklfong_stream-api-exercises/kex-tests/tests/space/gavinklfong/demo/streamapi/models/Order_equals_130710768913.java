package space.gavinklfong.demo.streamapi.models;

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
import static space.gavinklfong.demo.streamapi.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Order_equals_130710768913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2975;
     Object term3021;

    public Order_equals_130710768913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2976 = new Long(-5317408542996378156L);
        Long term2999 = new Long(3345606904545902400L);
        Integer term3013 = new Integer(842904495);
        HashMap term3016 = new HashMap();
        Set<Object> term3042 =  ((Map) term3016).keySet();
        HashSet term3015 = new HashSet((Collection<? extends Object>) term3042);
        term2975 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term2978 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2998 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term2975, term2975.getClass(), "id", term2976);
        setIntField(term2978, term2978.getClass(), "year", 2018);
        setShortField(term2978, term2978.getClass(), "month", (short) 1);
        setShortField(term2978, term2978.getClass(), "day", (short) 29);
        setField(term2975, term2975.getClass(), "orderDate", term2978);
        setIntField(term2982, term2982.getClass(), "year", 2010);
        setShortField(term2982, term2982.getClass(), "month", (short) 9);
        setShortField(term2982, term2982.getClass(), "day", (short) 25);
        setField(term2975, term2975.getClass(), "deliveryDate", term2982);
        setField(term2975, term2975.getClass(), "status", "hzdUbcLZhZ");
        setField(term2998, term2998.getClass(), "id", term2999);
        setField(term2998, term2998.getClass(), "name", "GlxnEJvYeC");
        setField(term2998, term2998.getClass(), "tier", term3013);
        setField(term2975, term2975.getClass(), "customer", term2998);
        setField(term2975, term2975.getClass(), "products", term3015);
        term3021 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3021;
        callMethod(klass, "equals", argTypes, term2975, args);
    }

};


