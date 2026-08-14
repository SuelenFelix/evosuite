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

public class Product_setId_9561860916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316;
     Object term364;

    public Product_setId_9561860916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term317 = new Long(4474998035090263139L);
        Double term343 = new Double(0.7633268466829064);
        HashMap term346 = new HashMap();
        Set<Object> term386 =  ((Map) term346).keySet();
        HashSet term345 = new HashSet((Collection<? extends Object>) term386);
        term316 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product"));
        setField(term316, term316.getClass(), "id", term317);
        setField(term316, term316.getClass(), "name", "fztQhjqwdP");
        setField(term316, term316.getClass(), "category", "eVpkWxjuki");
        setField(term316, term316.getClass(), "price", term343);
        setField(term316, term316.getClass(), "orders", term345);
        term364 = new Long(1215116475929634177L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term364;
        callMethod(klass, "setId", argTypes, term316, args);
    }

};


