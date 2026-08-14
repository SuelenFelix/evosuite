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

public class Product_canEqual_158106128512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term758;
     Object term800;

    public Product_canEqual_158106128512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term759 = new Long(3238645206498300107L);
        Double term785 = new Double(0.5308350402051779);
        HashMap term788 = new HashMap();
        Set<Object> term821 =  ((Map) term788).keySet();
        HashSet term787 = new HashSet((Collection<? extends Object>) term821);
        term758 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product"));
        setField(term758, term758.getClass(), "id", term759);
        setField(term758, term758.getClass(), "name", "EKjQdtKxAM");
        setField(term758, term758.getClass(), "category", "TXZAIPQJHt");
        setField(term758, term758.getClass(), "price", term785);
        setField(term758, term758.getClass(), "orders", term787);
        term800 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term800;
        callMethod(klass, "canEqual", argTypes, term758, args);
    }

};


