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

public class Order_setCustomer_3796607111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2789;
     Object term2844;

    public Order_setCustomer_3796607111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2790 = new Long(8621736372873134417L);
        Long term2813 = new Long(5106927272042726665L);
        Integer term2827 = new Integer(-1254072822);
        HashMap term2830 = new HashMap();
        Set<Object> term2881 =  ((Map) term2830).keySet();
        HashSet term2829 = new HashSet((Collection<? extends Object>) term2881);
        term2789 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term2792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2796 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2812 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term2789, term2789.getClass(), "id", term2790);
        setIntField(term2792, term2792.getClass(), "year", 2017);
        setShortField(term2792, term2792.getClass(), "month", (short) 1);
        setShortField(term2792, term2792.getClass(), "day", (short) 4);
        setField(term2789, term2789.getClass(), "orderDate", term2792);
        setIntField(term2796, term2796.getClass(), "year", 2024);
        setShortField(term2796, term2796.getClass(), "month", (short) 4);
        setShortField(term2796, term2796.getClass(), "day", (short) 1);
        setField(term2789, term2789.getClass(), "deliveryDate", term2796);
        setField(term2789, term2789.getClass(), "status", "yJKKddLqMb");
        setField(term2812, term2812.getClass(), "id", term2813);
        setField(term2812, term2812.getClass(), "name", "LWEYaXeKBe");
        setField(term2812, term2812.getClass(), "tier", term2827);
        setField(term2789, term2789.getClass(), "customer", term2812);
        setField(term2789, term2789.getClass(), "products", term2829);
        Long term2845 = new Long(-2938034344303060228L);
        Integer term2859 = new Integer(534834644);
        term2844 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term2844, term2844.getClass(), "id", term2845);
        setField(term2844, term2844.getClass(), "name", "DoUKDhlGCY");
        setField(term2844, term2844.getClass(), "tier", term2859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("space.gavinklfong.demo.streamapi.models.Customer");
        Object[] args = new Object[1];
        args[0] = term2844;
        callMethod(klass, "setCustomer", argTypes, term2789, args);
    }

};


