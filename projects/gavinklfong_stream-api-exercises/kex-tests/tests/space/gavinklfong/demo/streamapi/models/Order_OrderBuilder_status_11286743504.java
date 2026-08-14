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

public class Order_OrderBuilder_status_11286743504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1352;

    public Order_OrderBuilder_status_11286743504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1353 = new Long(4828755228445882127L);
        Long term1376 = new Long(970120292495348028L);
        Integer term1390 = new Integer(1072005683);
        HashMap term1393 = new HashMap();
        Set<Object> term1439 =  ((Map) term1393).keySet();
        HashSet term1392 = new HashSet((Collection<? extends Object>) term1439);
        term1352 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder"));
        Object term1355 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1359 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1375 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term1352, term1352.getClass(), "id", term1353);
        setIntField(term1355, term1355.getClass(), "year", 2023);
        setShortField(term1355, term1355.getClass(), "month", (short) 6);
        setShortField(term1355, term1355.getClass(), "day", (short) 30);
        setField(term1352, term1352.getClass(), "orderDate", term1355);
        setIntField(term1359, term1359.getClass(), "year", 2011);
        setShortField(term1359, term1359.getClass(), "month", (short) 11);
        setShortField(term1359, term1359.getClass(), "day", (short) 21);
        setField(term1352, term1352.getClass(), "deliveryDate", term1359);
        setField(term1352, term1352.getClass(), "status", "wgRGBNrTGP");
        setField(term1375, term1375.getClass(), "id", term1376);
        setField(term1375, term1375.getClass(), "name", "FIdNVptZpW");
        setField(term1375, term1375.getClass(), "tier", term1390);
        setField(term1352, term1352.getClass(), "customer", term1375);
        setField(term1352, term1352.getClass(), "products", term1392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dDHcmzPAmP";
        callMethod(klass, "status", argTypes, term1352, args);
    }

};


