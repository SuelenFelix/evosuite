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

public class Order_setId_20343023167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2453;
     Object term2512;

    public Order_setId_20343023167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2454 = new Long(-2792969772767139843L);
        Long term2477 = new Long(6313343355456678206L);
        Integer term2491 = new Integer(-749861210);
        HashMap term2494 = new HashMap();
        Set<Object> term2534 =  ((Map) term2494).keySet();
        HashSet term2493 = new HashSet((Collection<? extends Object>) term2534);
        term2453 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term2456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2460 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2476 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term2453, term2453.getClass(), "id", term2454);
        setIntField(term2456, term2456.getClass(), "year", 2014);
        setShortField(term2456, term2456.getClass(), "month", (short) 5);
        setShortField(term2456, term2456.getClass(), "day", (short) 20);
        setField(term2453, term2453.getClass(), "orderDate", term2456);
        setIntField(term2460, term2460.getClass(), "year", 2017);
        setShortField(term2460, term2460.getClass(), "month", (short) 10);
        setShortField(term2460, term2460.getClass(), "day", (short) 22);
        setField(term2453, term2453.getClass(), "deliveryDate", term2460);
        setField(term2453, term2453.getClass(), "status", "OrVSjRJVwa");
        setField(term2476, term2476.getClass(), "id", term2477);
        setField(term2476, term2476.getClass(), "name", "cdZEcINJAM");
        setField(term2476, term2476.getClass(), "tier", term2491);
        setField(term2453, term2453.getClass(), "customer", term2476);
        setField(term2453, term2453.getClass(), "products", term2493);
        term2512 = new Long(2777168805269959396L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2512;
        callMethod(klass, "setId", argTypes, term2453, args);
    }

};


