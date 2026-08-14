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

public class Order_toString_202841324216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3206;

    public Order_toString_202841324216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3207 = new Long(808761243947256536L);
        Long term3230 = new Long(5841040494527118725L);
        Integer term3244 = new Integer(34470066);
        HashMap term3247 = new HashMap();
        Set<Object> term3277 =  ((Map) term3247).keySet();
        HashSet term3246 = new HashSet((Collection<? extends Object>) term3277);
        term3206 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term3209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3213 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3229 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term3206, term3206.getClass(), "id", term3207);
        setIntField(term3209, term3209.getClass(), "year", 2019);
        setShortField(term3209, term3209.getClass(), "month", (short) 2);
        setShortField(term3209, term3209.getClass(), "day", (short) 12);
        setField(term3206, term3206.getClass(), "orderDate", term3209);
        setIntField(term3213, term3213.getClass(), "year", 2024);
        setShortField(term3213, term3213.getClass(), "month", (short) 5);
        setShortField(term3213, term3213.getClass(), "day", (short) 29);
        setField(term3206, term3206.getClass(), "deliveryDate", term3213);
        setField(term3206, term3206.getClass(), "status", "KIXGeHXdwi");
        setField(term3229, term3229.getClass(), "id", term3230);
        setField(term3229, term3229.getClass(), "name", "tTfdvLMwEE");
        setField(term3229, term3229.getClass(), "tier", term3244);
        setField(term3206, term3206.getClass(), "customer", term3229);
        setField(term3206, term3206.getClass(), "products", term3246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3206, args);
    }

};


