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

public class Order_getId_18306232221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1991;

    public Order_getId_18306232221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1992 = new Long(-3189918180129674609L);
        Long term2015 = new Long(5271284328066798769L);
        Integer term2029 = new Integer(-1504890659);
        HashMap term2032 = new HashMap();
        Set<Object> term2066 =  ((Map) term2032).keySet();
        HashSet term2031 = new HashSet((Collection<? extends Object>) term2066);
        term1991 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term1994 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1998 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2014 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term1991, term1991.getClass(), "id", term1992);
        setIntField(term1994, term1994.getClass(), "year", 2010);
        setShortField(term1994, term1994.getClass(), "month", (short) 5);
        setShortField(term1994, term1994.getClass(), "day", (short) 19);
        setField(term1991, term1991.getClass(), "orderDate", term1994);
        setIntField(term1998, term1998.getClass(), "year", 2015);
        setShortField(term1998, term1998.getClass(), "month", (short) 6);
        setShortField(term1998, term1998.getClass(), "day", (short) 22);
        setField(term1991, term1991.getClass(), "deliveryDate", term1998);
        setField(term1991, term1991.getClass(), "status", "IHsXSAFYKi");
        setField(term2014, term2014.getClass(), "id", term2015);
        setField(term2014, term2014.getClass(), "name", "KyGbLglqbW");
        setField(term2014, term2014.getClass(), "tier", term2029);
        setField(term1991, term1991.getClass(), "customer", term2014);
        setField(term1991, term1991.getClass(), "products", term2031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1991, args);
    }

};


