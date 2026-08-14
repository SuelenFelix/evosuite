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

public class Product_setCategory_14122031118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476;

    public Product_setCategory_14122031118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term477 = new Long(-4023935540989049732L);
        Double term503 = new Double(0.07802449704920456);
        HashMap term506 = new HashMap();
        Set<Object> term550 =  ((Map) term506).keySet();
        HashSet term505 = new HashSet((Collection<? extends Object>) term550);
        term476 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product"));
        setField(term476, term476.getClass(), "id", term477);
        setField(term476, term476.getClass(), "name", "rLHAoqXgPh");
        setField(term476, term476.getClass(), "category", "zUlRdimJtU");
        setField(term476, term476.getClass(), "price", term503);
        setField(term476, term476.getClass(), "orders", term505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tXfQjSqDzN";
        callMethod(klass, "setCategory", argTypes, term476, args);
    }

};


