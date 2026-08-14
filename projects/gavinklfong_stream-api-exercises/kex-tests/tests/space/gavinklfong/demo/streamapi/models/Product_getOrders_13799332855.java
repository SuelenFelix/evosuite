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
import java.lang.Double;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Product_getOrders_13799332855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;

    public Product_getOrders_13799332855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term248 = new Long(2443640364875054177L);
        Double term274 = new Double(0.2779719046761513);
        HashMap term277 = new HashMap();
        Set<Object> term315 =  ((Map) term277).keySet();
        HashSet term276 = new HashSet((Collection<? extends Object>) term315);
        term247 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product"));
        setField(term247, term247.getClass(), "id", term248);
        setField(term247, term247.getClass(), "name", "wGmYcqUkgE");
        setField(term247, term247.getClass(), "category", "idgaQsnJpQ");
        setField(term247, term247.getClass(), "price", term274);
        setField(term247, term247.getClass(), "orders", term276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrders", argTypes, term247, args);
    }

};


