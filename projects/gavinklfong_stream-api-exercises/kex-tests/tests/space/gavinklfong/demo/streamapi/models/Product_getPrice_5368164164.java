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

public class Product_getPrice_5368164164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186;

    public Product_getPrice_5368164164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term187 = new Long(-2068172595987555756L);
        Double term213 = new Double(0.5183269973490326);
        HashMap term216 = new HashMap();
        Set<Object> term246 =  ((Map) term216).keySet();
        HashSet term215 = new HashSet((Collection<? extends Object>) term246);
        term186 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product"));
        setField(term186, term186.getClass(), "id", term187);
        setField(term186, term186.getClass(), "name", "UoYtihxVaS");
        setField(term186, term186.getClass(), "category", "JDswTTCZHV");
        setField(term186, term186.getClass(), "price", term213);
        setField(term186, term186.getClass(), "orders", term215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term186, args);
    }

};


