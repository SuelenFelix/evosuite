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

public class Order_getCustomer_9688890375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305;

    public Order_getCustomer_9688890375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2306 = new Long(-6367418587326372844L);
        Long term2329 = new Long(6371581018571997173L);
        Integer term2343 = new Integer(-426764678);
        HashMap term2346 = new HashMap();
        Set<Object> term2378 =  ((Map) term2346).keySet();
        HashSet term2345 = new HashSet((Collection<? extends Object>) term2378);
        term2305 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term2308 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2328 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term2305, term2305.getClass(), "id", term2306);
        setIntField(term2308, term2308.getClass(), "year", 2025);
        setShortField(term2308, term2308.getClass(), "month", (short) 6);
        setShortField(term2308, term2308.getClass(), "day", (short) 17);
        setField(term2305, term2305.getClass(), "orderDate", term2308);
        setIntField(term2312, term2312.getClass(), "year", 2021);
        setShortField(term2312, term2312.getClass(), "month", (short) 4);
        setShortField(term2312, term2312.getClass(), "day", (short) 16);
        setField(term2305, term2305.getClass(), "deliveryDate", term2312);
        setField(term2305, term2305.getClass(), "status", "ngeHWMRjnn");
        setField(term2328, term2328.getClass(), "id", term2329);
        setField(term2328, term2328.getClass(), "name", "FOKfDXQxMM");
        setField(term2328, term2328.getClass(), "tier", term2343);
        setField(term2305, term2305.getClass(), "customer", term2328);
        setField(term2305, term2305.getClass(), "products", term2345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomer", argTypes, term2305, args);
    }

};


