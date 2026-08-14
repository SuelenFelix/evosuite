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

public class Product_ProductBuilder_price_114981484312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4208;

    public Product_ProductBuilder_price_114981484312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4208 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder"));
        setField(term4208, term4208.getClass(), "id", null);
        setField(term4208, term4208.getClass(), "name", null);
        setField(term4208, term4208.getClass(), "category", null);
        setField(term4208, term4208.getClass(), "price", null);
        setField(term4208, term4208.getClass(), "orders", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "price", argTypes, term4208, args);
    }

};


