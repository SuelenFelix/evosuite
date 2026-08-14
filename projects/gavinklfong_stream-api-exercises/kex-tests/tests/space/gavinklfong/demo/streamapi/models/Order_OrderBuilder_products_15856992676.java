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

public class Order_OrderBuilder_products_15856992676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1551;
     Object term1604;

    public Order_OrderBuilder_products_15856992676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1552 = new Long(1550364590565203407L);
        Long term1575 = new Long(4530705892517898929L);
        Integer term1589 = new Integer(-343325701);
        HashMap term1592 = new HashMap();
        Set<Object> term1669 =  ((Map) term1592).keySet();
        HashSet term1591 = new HashSet((Collection<? extends Object>) term1669);
        term1551 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder"));
        Object term1554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1558 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1574 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term1551, term1551.getClass(), "id", term1552);
        setIntField(term1554, term1554.getClass(), "year", 2025);
        setShortField(term1554, term1554.getClass(), "month", (short) 11);
        setShortField(term1554, term1554.getClass(), "day", (short) 15);
        setField(term1551, term1551.getClass(), "orderDate", term1554);
        setIntField(term1558, term1558.getClass(), "year", 2024);
        setShortField(term1558, term1558.getClass(), "month", (short) 1);
        setShortField(term1558, term1558.getClass(), "day", (short) 1);
        setField(term1551, term1551.getClass(), "deliveryDate", term1558);
        setField(term1551, term1551.getClass(), "status", "ABPtcyCzkR");
        setField(term1574, term1574.getClass(), "id", term1575);
        setField(term1574, term1574.getClass(), "name", "QgHhxMyKvr");
        setField(term1574, term1574.getClass(), "tier", term1589);
        setField(term1551, term1551.getClass(), "customer", term1574);
        setField(term1551, term1551.getClass(), "products", term1591);
        HashMap term1605 = new HashMap();
        Set<Object> term1670 =  ((Map) term1605).keySet();
        term1604 = new HashSet((Collection<? extends Object>) term1670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term1604;
        callMethod(klass, "products", argTypes, term1551, args);
    }

};


