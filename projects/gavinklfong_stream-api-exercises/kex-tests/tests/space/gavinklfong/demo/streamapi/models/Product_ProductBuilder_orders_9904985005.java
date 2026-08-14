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

public class Product_ProductBuilder_orders_9904985005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4001;
     Object term4047;

    public Product_ProductBuilder_orders_9904985005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4002 = new Long(-8743015685701431890L);
        Double term4028 = new Double(0.5975949169840026);
        HashMap term4031 = new HashMap();
        Set<Object> term4073 =  ((Map) term4031).keySet();
        HashSet term4030 = new HashSet((Collection<? extends Object>) term4073);
        term4001 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder"));
        setField(term4001, term4001.getClass(), "id", term4002);
        setField(term4001, term4001.getClass(), "name", "LBPwnVMEpP");
        setField(term4001, term4001.getClass(), "category", "cwALzyQVjH");
        setField(term4001, term4001.getClass(), "price", term4028);
        setField(term4001, term4001.getClass(), "orders", term4030);
        HashMap term4048 = new HashMap();
        Set<Object> term4074 =  ((Map) term4048).keySet();
        term4047 = new HashSet((Collection<? extends Object>) term4074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term4047;
        callMethod(klass, "orders", argTypes, term4001, args);
    }

};


