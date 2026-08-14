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

public class Product_setPrice_10947515849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561;
     Object term605;

    public Product_setPrice_10947515849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term562 = new Long(4100236067313034103L);
        Double term588 = new Double(0.25937345430928016);
        HashMap term591 = new HashMap();
        Set<Object> term627 =  ((Map) term591).keySet();
        HashSet term590 = new HashSet((Collection<? extends Object>) term627);
        term561 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product"));
        setField(term561, term561.getClass(), "id", term562);
        setField(term561, term561.getClass(), "name", "BjugTaMcxJ");
        setField(term561, term561.getClass(), "category", "vGiuZVPJNH");
        setField(term561, term561.getClass(), "price", term588);
        setField(term561, term561.getClass(), "orders", term590);
        term605 = new Double(0.6862221294683138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term605;
        callMethod(klass, "setPrice", argTypes, term561, args);
    }

};


