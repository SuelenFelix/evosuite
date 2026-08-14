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

public class Order_getStatus_6449022184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2225;

    public Order_getStatus_6449022184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2226 = new Long(-3548672426577893003L);
        Long term2249 = new Long(1592020674405941254L);
        Integer term2263 = new Integer(389427431);
        HashMap term2266 = new HashMap();
        Set<Object> term2304 =  ((Map) term2266).keySet();
        HashSet term2265 = new HashSet((Collection<? extends Object>) term2304);
        term2225 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term2228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2248 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term2225, term2225.getClass(), "id", term2226);
        setIntField(term2228, term2228.getClass(), "year", 2020);
        setShortField(term2228, term2228.getClass(), "month", (short) 4);
        setShortField(term2228, term2228.getClass(), "day", (short) 27);
        setField(term2225, term2225.getClass(), "orderDate", term2228);
        setIntField(term2232, term2232.getClass(), "year", 2015);
        setShortField(term2232, term2232.getClass(), "month", (short) 1);
        setShortField(term2232, term2232.getClass(), "day", (short) 7);
        setField(term2225, term2225.getClass(), "deliveryDate", term2232);
        setField(term2225, term2225.getClass(), "status", "rOZkUKEoaf");
        setField(term2248, term2248.getClass(), "id", term2249);
        setField(term2248, term2248.getClass(), "name", "yLnzGqyHGL");
        setField(term2248, term2248.getClass(), "tier", term2263);
        setField(term2225, term2225.getClass(), "customer", term2248);
        setField(term2225, term2225.getClass(), "products", term2265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term2225, args);
    }

};


