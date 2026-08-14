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

public class Product_setOrders_6121648310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term628;
     Object term663;

    public Product_setOrders_6121648310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term629 = new Long(3090901538358721367L);
        Double term655 = new Double(0.15917839663695388);
        HashMap term658 = new HashMap();
        Set<Object> term696 =  ((Map) term658).keySet();
        HashSet term657 = new HashSet((Collection<? extends Object>) term696);
        term628 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product"));
        setField(term628, term628.getClass(), "id", term629);
        setField(term628, term628.getClass(), "name", "xvkbvaEGYd");
        setField(term628, term628.getClass(), "category", "HBGNxdNURv");
        setField(term628, term628.getClass(), "price", term655);
        setField(term628, term628.getClass(), "orders", term657);
        HashMap term664 = new HashMap();
        Set<Object> term697 =  ((Map) term664).keySet();
        term663 = new HashSet((Collection<? extends Object>) term697);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term663;
        callMethod(klass, "setOrders", argTypes, term628, args);
    }

};


