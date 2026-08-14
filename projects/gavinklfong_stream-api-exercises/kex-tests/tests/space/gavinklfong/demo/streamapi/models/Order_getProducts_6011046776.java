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

public class Order_getProducts_6011046776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2379;

    public Order_getProducts_6011046776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2380 = new Long(-205762347192500511L);
        Long term2403 = new Long(-4987344934532917085L);
        Integer term2417 = new Integer(318591690);
        HashMap term2420 = new HashMap();
        Set<Object> term2452 =  ((Map) term2420).keySet();
        HashSet term2419 = new HashSet((Collection<? extends Object>) term2452);
        term2379 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term2382 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2386 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2402 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term2379, term2379.getClass(), "id", term2380);
        setIntField(term2382, term2382.getClass(), "year", 2024);
        setShortField(term2382, term2382.getClass(), "month", (short) 3);
        setShortField(term2382, term2382.getClass(), "day", (short) 18);
        setField(term2379, term2379.getClass(), "orderDate", term2382);
        setIntField(term2386, term2386.getClass(), "year", 2029);
        setShortField(term2386, term2386.getClass(), "month", (short) 2);
        setShortField(term2386, term2386.getClass(), "day", (short) 12);
        setField(term2379, term2379.getClass(), "deliveryDate", term2386);
        setField(term2379, term2379.getClass(), "status", "hEuycunsSe");
        setField(term2402, term2402.getClass(), "id", term2403);
        setField(term2402, term2402.getClass(), "name", "IMFzXhpNCx");
        setField(term2402, term2402.getClass(), "tier", term2417);
        setField(term2379, term2379.getClass(), "customer", term2402);
        setField(term2379, term2379.getClass(), "products", term2419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProducts", argTypes, term2379, args);
    }

};


