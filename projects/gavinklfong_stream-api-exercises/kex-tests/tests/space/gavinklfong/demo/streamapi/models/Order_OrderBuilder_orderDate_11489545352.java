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

public class Order_OrderBuilder_orderDate_11489545352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1194;
     Object term1249;

    public Order_OrderBuilder_orderDate_11489545352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1195 = new Long(-7423063312741500355L);
        Long term1218 = new Long(-8992404862613425105L);
        Integer term1232 = new Integer(-615654495);
        HashMap term1235 = new HashMap();
        Set<Object> term1273 =  ((Map) term1235).keySet();
        HashSet term1234 = new HashSet((Collection<? extends Object>) term1273);
        term1194 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder"));
        Object term1197 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1201 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1217 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term1194, term1194.getClass(), "id", term1195);
        setIntField(term1197, term1197.getClass(), "year", 2014);
        setShortField(term1197, term1197.getClass(), "month", (short) 1);
        setShortField(term1197, term1197.getClass(), "day", (short) 23);
        setField(term1194, term1194.getClass(), "orderDate", term1197);
        setIntField(term1201, term1201.getClass(), "year", 2014);
        setShortField(term1201, term1201.getClass(), "month", (short) 9);
        setShortField(term1201, term1201.getClass(), "day", (short) 16);
        setField(term1194, term1194.getClass(), "deliveryDate", term1201);
        setField(term1194, term1194.getClass(), "status", "QpYltHAdyY");
        setField(term1217, term1217.getClass(), "id", term1218);
        setField(term1217, term1217.getClass(), "name", "lbmSGBwIiV");
        setField(term1217, term1217.getClass(), "tier", term1232);
        setField(term1194, term1194.getClass(), "customer", term1217);
        setField(term1194, term1194.getClass(), "products", term1234);
        term1249 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1249, term1249.getClass(), "year", 2026);
        setShortField(term1249, term1249.getClass(), "month", (short) 7);
        setShortField(term1249, term1249.getClass(), "day", (short) 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term1249;
        callMethod(klass, "orderDate", argTypes, term1194, args);
    }

};


