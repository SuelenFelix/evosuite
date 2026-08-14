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

public class Order_getDeliveryDate_1288485393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2145;

    public Order_getDeliveryDate_1288485393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2146 = new Long(-4726601557653351735L);
        Long term2169 = new Long(-3502423991725415780L);
        Integer term2183 = new Integer(584893196);
        HashMap term2186 = new HashMap();
        Set<Object> term2224 =  ((Map) term2186).keySet();
        HashSet term2185 = new HashSet((Collection<? extends Object>) term2224);
        term2145 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term2148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2168 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term2145, term2145.getClass(), "id", term2146);
        setIntField(term2148, term2148.getClass(), "year", 2010);
        setShortField(term2148, term2148.getClass(), "month", (short) 9);
        setShortField(term2148, term2148.getClass(), "day", (short) 26);
        setField(term2145, term2145.getClass(), "orderDate", term2148);
        setIntField(term2152, term2152.getClass(), "year", 2012);
        setShortField(term2152, term2152.getClass(), "month", (short) 10);
        setShortField(term2152, term2152.getClass(), "day", (short) 7);
        setField(term2145, term2145.getClass(), "deliveryDate", term2152);
        setField(term2145, term2145.getClass(), "status", "YfgYGgzYER");
        setField(term2168, term2168.getClass(), "id", term2169);
        setField(term2168, term2168.getClass(), "name", "IDClvDZuqE");
        setField(term2168, term2168.getClass(), "tier", term2183);
        setField(term2145, term2145.getClass(), "customer", term2168);
        setField(term2145, term2145.getClass(), "products", term2185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeliveryDate", argTypes, term2145, args);
    }

};


