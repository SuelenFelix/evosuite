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

public class Product_toString_95029701714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889;

    public Product_toString_95029701714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term890 = new Long(2209808079059619773L);
        Double term916 = new Double(0.0027299293098262956);
        HashMap term919 = new HashMap();
        Set<Object> term953 =  ((Map) term919).keySet();
        HashSet term918 = new HashSet((Collection<? extends Object>) term953);
        term889 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product"));
        setField(term889, term889.getClass(), "id", term890);
        setField(term889, term889.getClass(), "name", "VDokbsCuqq");
        setField(term889, term889.getClass(), "category", "xClUIcPECX");
        setField(term889, term889.getClass(), "price", term916);
        setField(term889, term889.getClass(), "orders", term918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term889, args);
    }

};


