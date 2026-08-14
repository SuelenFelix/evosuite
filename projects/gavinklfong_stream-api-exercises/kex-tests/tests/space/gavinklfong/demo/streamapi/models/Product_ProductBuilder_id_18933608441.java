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

public class Product_ProductBuilder_id_18933608441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3696;
     Object term3742;

    public Product_ProductBuilder_id_18933608441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3697 = new Long(2359134970522271046L);
        Double term3723 = new Double(0.4973631574706634);
        HashMap term3726 = new HashMap();
        Set<Object> term3764 =  ((Map) term3726).keySet();
        HashSet term3725 = new HashSet((Collection<? extends Object>) term3764);
        term3696 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder"));
        setField(term3696, term3696.getClass(), "id", term3697);
        setField(term3696, term3696.getClass(), "name", "AIvyeIdskz");
        setField(term3696, term3696.getClass(), "category", "iSQqMWMRlU");
        setField(term3696, term3696.getClass(), "price", term3723);
        setField(term3696, term3696.getClass(), "orders", term3725);
        term3742 = new Long(5307759455220911721L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3742;
        callMethod(klass, "id", argTypes, term3696, args);
    }

};


