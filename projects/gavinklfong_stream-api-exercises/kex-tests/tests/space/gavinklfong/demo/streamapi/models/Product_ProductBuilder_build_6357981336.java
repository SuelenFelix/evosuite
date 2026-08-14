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

public class Product_ProductBuilder_build_6357981336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4075;

    public Product_ProductBuilder_build_6357981336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4076 = new Long(3746407492061591608L);
        Double term4102 = new Double(0.8248232334502307);
        HashMap term4105 = new HashMap();
        Set<Object> term4137 =  ((Map) term4105).keySet();
        HashSet term4104 = new HashSet((Collection<? extends Object>) term4137);
        term4075 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder"));
        setField(term4075, term4075.getClass(), "id", term4076);
        setField(term4075, term4075.getClass(), "name", "FBYRIDZvmW");
        setField(term4075, term4075.getClass(), "category", "IyjLfrDZrV");
        setField(term4075, term4075.getClass(), "price", term4102);
        setField(term4075, term4075.getClass(), "orders", term4104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4075, args);
    }

};


