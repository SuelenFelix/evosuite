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

public class Order_hashCode_175579436415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3124;

    public Order_hashCode_175579436415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3125 = new Long(2957284484642534979L);
        Long term3148 = new Long(-4645802432501468482L);
        Integer term3162 = new Integer(267763294);
        HashMap term3165 = new HashMap();
        Set<Object> term3205 =  ((Map) term3165).keySet();
        HashSet term3164 = new HashSet((Collection<? extends Object>) term3205);
        term3124 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term3127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3131 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3147 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term3124, term3124.getClass(), "id", term3125);
        setIntField(term3127, term3127.getClass(), "year", 2023);
        setShortField(term3127, term3127.getClass(), "month", (short) 4);
        setShortField(term3127, term3127.getClass(), "day", (short) 10);
        setField(term3124, term3124.getClass(), "orderDate", term3127);
        setIntField(term3131, term3131.getClass(), "year", 2028);
        setShortField(term3131, term3131.getClass(), "month", (short) 3);
        setShortField(term3131, term3131.getClass(), "day", (short) 28);
        setField(term3124, term3124.getClass(), "deliveryDate", term3131);
        setField(term3124, term3124.getClass(), "status", "QwKYpiVQlL");
        setField(term3147, term3147.getClass(), "id", term3148);
        setField(term3147, term3147.getClass(), "name", "kSGsHNQQoW");
        setField(term3147, term3147.getClass(), "tier", term3162);
        setField(term3124, term3124.getClass(), "customer", term3147);
        setField(term3124, term3124.getClass(), "products", term3164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3124, args);
    }

};


