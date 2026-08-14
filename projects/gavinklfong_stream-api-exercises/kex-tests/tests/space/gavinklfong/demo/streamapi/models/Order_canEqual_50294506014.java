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

public class Order_canEqual_50294506014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3043;
     Object term3102;

    public Order_canEqual_50294506014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3044 = new Long(-6289397283685653555L);
        Long term3067 = new Long(4270489998641176236L);
        Integer term3081 = new Integer(1008080511);
        HashMap term3084 = new HashMap();
        Set<Object> term3123 =  ((Map) term3084).keySet();
        HashSet term3083 = new HashSet((Collection<? extends Object>) term3123);
        term3043 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term3046 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3050 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3066 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term3043, term3043.getClass(), "id", term3044);
        setIntField(term3046, term3046.getClass(), "year", 2022);
        setShortField(term3046, term3046.getClass(), "month", (short) 12);
        setShortField(term3046, term3046.getClass(), "day", (short) 22);
        setField(term3043, term3043.getClass(), "orderDate", term3046);
        setIntField(term3050, term3050.getClass(), "year", 2012);
        setShortField(term3050, term3050.getClass(), "month", (short) 3);
        setShortField(term3050, term3050.getClass(), "day", (short) 24);
        setField(term3043, term3043.getClass(), "deliveryDate", term3050);
        setField(term3043, term3043.getClass(), "status", "SLdOGaqmNv");
        setField(term3066, term3066.getClass(), "id", term3067);
        setField(term3066, term3066.getClass(), "name", "QZfhwDBzyR");
        setField(term3066, term3066.getClass(), "tier", term3081);
        setField(term3043, term3043.getClass(), "customer", term3066);
        setField(term3043, term3043.getClass(), "products", term3083);
        term3102 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3102;
        callMethod(klass, "canEqual", argTypes, term3043, args);
    }

};


