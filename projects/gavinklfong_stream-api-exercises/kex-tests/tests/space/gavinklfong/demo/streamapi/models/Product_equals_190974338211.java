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

public class Product_equals_190974338211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698;
     Object term736;

    public Product_equals_190974338211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term699 = new Long(-1885698929232124806L);
        Double term725 = new Double(0.13246999699526574);
        HashMap term728 = new HashMap();
        Set<Object> term757 =  ((Map) term728).keySet();
        HashSet term727 = new HashSet((Collection<? extends Object>) term757);
        term698 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product"));
        setField(term698, term698.getClass(), "id", term699);
        setField(term698, term698.getClass(), "name", "beAMpkroCQ");
        setField(term698, term698.getClass(), "category", "uSUvKAyuvd");
        setField(term698, term698.getClass(), "price", term725);
        setField(term698, term698.getClass(), "orders", term727);
        term736 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term736;
        callMethod(klass, "equals", argTypes, term698, args);
    }

};


