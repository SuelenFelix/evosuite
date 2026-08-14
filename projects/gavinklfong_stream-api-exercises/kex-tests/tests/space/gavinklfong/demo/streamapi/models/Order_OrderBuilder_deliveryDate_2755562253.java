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

public class Order_OrderBuilder_deliveryDate_2755562253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1274;
     Object term1327;

    public Order_OrderBuilder_deliveryDate_2755562253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1275 = new Long(6940486570215409900L);
        Long term1298 = new Long(-7370364068296402536L);
        Integer term1312 = new Integer(691577392);
        HashMap term1315 = new HashMap();
        Set<Object> term1351 =  ((Map) term1315).keySet();
        HashSet term1314 = new HashSet((Collection<? extends Object>) term1351);
        term1274 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder"));
        Object term1277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1281 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1297 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term1274, term1274.getClass(), "id", term1275);
        setIntField(term1277, term1277.getClass(), "year", 2028);
        setShortField(term1277, term1277.getClass(), "month", (short) 9);
        setShortField(term1277, term1277.getClass(), "day", (short) 26);
        setField(term1274, term1274.getClass(), "orderDate", term1277);
        setIntField(term1281, term1281.getClass(), "year", 2022);
        setShortField(term1281, term1281.getClass(), "month", (short) 5);
        setShortField(term1281, term1281.getClass(), "day", (short) 25);
        setField(term1274, term1274.getClass(), "deliveryDate", term1281);
        setField(term1274, term1274.getClass(), "status", "mnHyQbMyld");
        setField(term1297, term1297.getClass(), "id", term1298);
        setField(term1297, term1297.getClass(), "name", "KHtaDOIcJZ");
        setField(term1297, term1297.getClass(), "tier", term1312);
        setField(term1274, term1274.getClass(), "customer", term1297);
        setField(term1274, term1274.getClass(), "products", term1314);
        term1327 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1327, term1327.getClass(), "year", 2014);
        setShortField(term1327, term1327.getClass(), "month", (short) 12);
        setShortField(term1327, term1327.getClass(), "day", (short) 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term1327;
        callMethod(klass, "deliveryDate", argTypes, term1274, args);
    }

};


