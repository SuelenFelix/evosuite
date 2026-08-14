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

public class Order_OrderBuilder_customer_14026342815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1450;
     Object term1503;

    public Order_OrderBuilder_customer_14026342815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1451 = new Long(8680715663951713735L);
        Long term1474 = new Long(-4905558793519537969L);
        Integer term1488 = new Integer(1107176718);
        HashMap term1491 = new HashMap();
        Set<Object> term1540 =  ((Map) term1491).keySet();
        HashSet term1490 = new HashSet((Collection<? extends Object>) term1540);
        term1450 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder"));
        Object term1453 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1457 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1473 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term1450, term1450.getClass(), "id", term1451);
        setIntField(term1453, term1453.getClass(), "year", 2018);
        setShortField(term1453, term1453.getClass(), "month", (short) 6);
        setShortField(term1453, term1453.getClass(), "day", (short) 16);
        setField(term1450, term1450.getClass(), "orderDate", term1453);
        setIntField(term1457, term1457.getClass(), "year", 2028);
        setShortField(term1457, term1457.getClass(), "month", (short) 4);
        setShortField(term1457, term1457.getClass(), "day", (short) 18);
        setField(term1450, term1450.getClass(), "deliveryDate", term1457);
        setField(term1450, term1450.getClass(), "status", "HEaTkWYBgv");
        setField(term1473, term1473.getClass(), "id", term1474);
        setField(term1473, term1473.getClass(), "name", "MpJsPKLTIU");
        setField(term1473, term1473.getClass(), "tier", term1488);
        setField(term1450, term1450.getClass(), "customer", term1473);
        setField(term1450, term1450.getClass(), "products", term1490);
        Long term1504 = new Long(-5967061076297699457L);
        Integer term1518 = new Integer(96566506);
        term1503 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term1503, term1503.getClass(), "id", term1504);
        setField(term1503, term1503.getClass(), "name", "TVxGTjeDcu");
        setField(term1503, term1503.getClass(), "tier", term1518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("space.gavinklfong.demo.streamapi.models.Customer");
        Object[] args = new Object[1];
        args[0] = term1503;
        callMethod(klass, "customer", argTypes, term1450, args);
    }

};


