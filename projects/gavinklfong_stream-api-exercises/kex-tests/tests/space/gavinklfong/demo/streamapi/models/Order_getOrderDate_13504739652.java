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

public class Order_getOrderDate_13504739652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2067;

    public Order_getOrderDate_13504739652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2068 = new Long(6762397834421232825L);
        Long term2091 = new Long(-5414076154478910734L);
        Integer term2105 = new Integer(-1970452551);
        HashMap term2108 = new HashMap();
        Set<Object> term2144 =  ((Map) term2108).keySet();
        HashSet term2107 = new HashSet((Collection<? extends Object>) term2144);
        term2067 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term2070 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2074 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2090 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term2067, term2067.getClass(), "id", term2068);
        setIntField(term2070, term2070.getClass(), "year", 2011);
        setShortField(term2070, term2070.getClass(), "month", (short) 8);
        setShortField(term2070, term2070.getClass(), "day", (short) 29);
        setField(term2067, term2067.getClass(), "orderDate", term2070);
        setIntField(term2074, term2074.getClass(), "year", 2013);
        setShortField(term2074, term2074.getClass(), "month", (short) 6);
        setShortField(term2074, term2074.getClass(), "day", (short) 5);
        setField(term2067, term2067.getClass(), "deliveryDate", term2074);
        setField(term2067, term2067.getClass(), "status", "YEkxWsWaUl");
        setField(term2090, term2090.getClass(), "id", term2091);
        setField(term2090, term2090.getClass(), "name", "RINhPkhhct");
        setField(term2090, term2090.getClass(), "tier", term2105);
        setField(term2067, term2067.getClass(), "customer", term2090);
        setField(term2067, term2067.getClass(), "products", term2107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderDate", argTypes, term2067, args);
    }

};


