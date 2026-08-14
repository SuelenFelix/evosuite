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

public class Order_setProducts_14509891512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2892;
     Object term2947;

    public Order_setProducts_14509891512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2893 = new Long(-758819117507836512L);
        Long term2916 = new Long(-1855660992126411308L);
        Integer term2930 = new Integer(1959097203);
        HashMap term2933 = new HashMap();
        Set<Object> term2973 =  ((Map) term2933).keySet();
        HashSet term2932 = new HashSet((Collection<? extends Object>) term2973);
        term2892 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        Object term2895 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2899 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2915 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Customer"));
        setField(term2892, term2892.getClass(), "id", term2893);
        setIntField(term2895, term2895.getClass(), "year", 2010);
        setShortField(term2895, term2895.getClass(), "month", (short) 5);
        setShortField(term2895, term2895.getClass(), "day", (short) 21);
        setField(term2892, term2892.getClass(), "orderDate", term2895);
        setIntField(term2899, term2899.getClass(), "year", 2013);
        setShortField(term2899, term2899.getClass(), "month", (short) 7);
        setShortField(term2899, term2899.getClass(), "day", (short) 26);
        setField(term2892, term2892.getClass(), "deliveryDate", term2899);
        setField(term2892, term2892.getClass(), "status", "IeoToWsQWU");
        setField(term2915, term2915.getClass(), "id", term2916);
        setField(term2915, term2915.getClass(), "name", "QxiiHtQAzN");
        setField(term2915, term2915.getClass(), "tier", term2930);
        setField(term2892, term2892.getClass(), "customer", term2915);
        setField(term2892, term2892.getClass(), "products", term2932);
        HashMap term2948 = new HashMap();
        Set<Object> term2974 =  ((Map) term2948).keySet();
        term2947 = new HashSet((Collection<? extends Object>) term2974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term2947;
        callMethod(klass, "setProducts", argTypes, term2892, args);
    }

};


