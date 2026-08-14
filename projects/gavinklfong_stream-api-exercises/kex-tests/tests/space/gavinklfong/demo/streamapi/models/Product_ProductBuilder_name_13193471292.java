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

public class Product_ProductBuilder_name_13193471292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3765;

    public Product_ProductBuilder_name_13193471292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3766 = new Long(8447690702287486582L);
        Double term3792 = new Double(0.8466752101793942);
        HashMap term3795 = new HashMap();
        Set<Object> term3832 =  ((Map) term3795).keySet();
        HashSet term3794 = new HashSet((Collection<? extends Object>) term3832);
        term3765 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder"));
        setField(term3765, term3765.getClass(), "id", term3766);
        setField(term3765, term3765.getClass(), "name", "JqbKrmVEMy");
        setField(term3765, term3765.getClass(), "category", "VygCEWaefB");
        setField(term3765, term3765.getClass(), "price", term3792);
        setField(term3765, term3765.getClass(), "orders", term3794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PqhYfEyDDA";
        callMethod(klass, "name", argTypes, term3765, args);
    }

};


