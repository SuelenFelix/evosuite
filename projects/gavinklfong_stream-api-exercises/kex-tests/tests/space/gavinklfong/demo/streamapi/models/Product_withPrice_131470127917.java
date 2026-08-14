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

public class Product_withPrice_131470127917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1031;
     Object term1081;

    public Product_withPrice_131470127917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1032 = new Long(-5587528177305224828L);
        Double term1058 = new Double(0.19625398866403143);
        HashMap term1061 = new HashMap();
        Set<Object> term1103 =  ((Map) term1061).keySet();
        HashSet term1060 = new HashSet((Collection<? extends Object>) term1103);
        term1031 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product"));
        setField(term1031, term1031.getClass(), "id", term1032);
        setField(term1031, term1031.getClass(), "name", "YgQvdcBQKw");
        setField(term1031, term1031.getClass(), "category", "FiYYLuailz");
        setField(term1031, term1031.getClass(), "price", term1058);
        setField(term1031, term1031.getClass(), "orders", term1060);
        term1081 = new Double(0.008025683154629148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term1081;
        callMethod(klass, "withPrice", argTypes, term1031, args);
    }

};


