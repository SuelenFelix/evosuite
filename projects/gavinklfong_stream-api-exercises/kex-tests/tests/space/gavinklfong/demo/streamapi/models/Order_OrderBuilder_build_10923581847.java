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

public class Order_OrderBuilder_build_10923581847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1671;

    public Order_OrderBuilder_build_10923581847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1672 = new Long(353705949229610067L);
        Long term1695 = new Long(3288572082902580031L);
        Integer term1709 = new Integer(-461771056);
        HashMap term1712 = new HashMap();
        Set<Object> term1740 =  ((Map) term1712).keySet();
        HashSet term1711 = new HashSet((Collection<? extends Object>) term1740);
        term1671 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder"));
        Object term1674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1678 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1694 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term1671, term1671.getClass(), "id", term1672);
        setIntField(term1674, term1674.getClass(), "year", 2014);
        setShortField(term1674, term1674.getClass(), "month", (short) 2);
        setShortField(term1674, term1674.getClass(), "day", (short) 26);
        setField(term1671, term1671.getClass(), "orderDate", term1674);
        setIntField(term1678, term1678.getClass(), "year", 2023);
        setShortField(term1678, term1678.getClass(), "month", (short) 10);
        setShortField(term1678, term1678.getClass(), "day", (short) 21);
        setField(term1671, term1671.getClass(), "deliveryDate", term1678);
        setField(term1671, term1671.getClass(), "status", "vfennwtmqe");
        setField(term1694, term1694.getClass(), "id", term1695);
        setField(term1694, term1694.getClass(), "name", "zZxoNkohbw");
        setField(term1694, term1694.getClass(), "tier", term1709);
        setField(term1671, term1671.getClass(), "customer", term1694);
        setField(term1671, term1671.getClass(), "products", term1711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1671, args);
    }

};


