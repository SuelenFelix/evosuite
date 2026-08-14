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

public class Order_OrderBuilder_toString_763300918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1741;

    public Order_OrderBuilder_toString_763300918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1742 = new Long(-6137280723045949220L);
        Long term1765 = new Long(-7787918913179897745L);
        Integer term1779 = new Integer(1296895584);
        HashMap term1782 = new HashMap();
        Set<Object> term1816 =  ((Map) term1782).keySet();
        HashSet term1781 = new HashSet((Collection<? extends Object>) term1816);
        term1741 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder"));
        Object term1744 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1748 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1764 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term1741, term1741.getClass(), "id", term1742);
        setIntField(term1744, term1744.getClass(), "year", 2025);
        setShortField(term1744, term1744.getClass(), "month", (short) 2);
        setShortField(term1744, term1744.getClass(), "day", (short) 22);
        setField(term1741, term1741.getClass(), "orderDate", term1744);
        setIntField(term1748, term1748.getClass(), "year", 2016);
        setShortField(term1748, term1748.getClass(), "month", (short) 11);
        setShortField(term1748, term1748.getClass(), "day", (short) 8);
        setField(term1741, term1741.getClass(), "deliveryDate", term1748);
        setField(term1741, term1741.getClass(), "status", "Yrvtdcltri");
        setField(term1764, term1764.getClass(), "id", term1765);
        setField(term1764, term1764.getClass(), "name", "RxrsjXRVcT");
        setField(term1764, term1764.getClass(), "tier", term1779);
        setField(term1741, term1741.getClass(), "customer", term1764);
        setField(term1741, term1741.getClass(), "products", term1781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1741, args);
    }

};


