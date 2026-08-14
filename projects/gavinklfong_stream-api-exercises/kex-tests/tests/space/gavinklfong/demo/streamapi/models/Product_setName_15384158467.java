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

public class Product_setName_15384158467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387;

    public Product_setName_15384158467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term388 = new Long(1597484336218508869L);
        Double term414 = new Double(0.6805867182029153);
        HashMap term417 = new HashMap();
        Set<Object> term465 =  ((Map) term417).keySet();
        HashSet term416 = new HashSet((Collection<? extends Object>) term465);
        term387 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product"));
        setField(term387, term387.getClass(), "id", term388);
        setField(term387, term387.getClass(), "name", "LWyEaeIyAo");
        setField(term387, term387.getClass(), "category", "yVMkkQhvmN");
        setField(term387, term387.getClass(), "price", term414);
        setField(term387, term387.getClass(), "orders", term416);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sQvGcVjdEx";
        callMethod(klass, "setName", argTypes, term387, args);
    }

};


