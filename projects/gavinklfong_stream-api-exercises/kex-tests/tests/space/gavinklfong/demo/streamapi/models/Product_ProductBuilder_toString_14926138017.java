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

public class Product_ProductBuilder_toString_14926138017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4138;

    public Product_ProductBuilder_toString_14926138017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4139 = new Long(-8946539398468447729L);
        Double term4165 = new Double(0.9776553509238997);
        HashMap term4168 = new HashMap();
        Set<Object> term4204 =  ((Map) term4168).keySet();
        HashSet term4167 = new HashSet((Collection<? extends Object>) term4204);
        term4138 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder"));
        setField(term4138, term4138.getClass(), "id", term4139);
        setField(term4138, term4138.getClass(), "name", "lcCEhCpiZM");
        setField(term4138, term4138.getClass(), "category", "OPJlqMJxdq");
        setField(term4138, term4138.getClass(), "price", term4165);
        setField(term4138, term4138.getClass(), "orders", term4167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4138, args);
    }

};


