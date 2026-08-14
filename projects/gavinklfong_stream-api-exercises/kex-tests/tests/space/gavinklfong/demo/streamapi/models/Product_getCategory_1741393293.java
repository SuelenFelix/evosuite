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

public class Product_getCategory_1741393293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127;

    public Product_getCategory_1741393293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term128 = new Long(8059786003080744426L);
        Double term154 = new Double(0.2641345529914265);
        HashMap term157 = new HashMap();
        Set<Object> term185 =  ((Map) term157).keySet();
        HashSet term156 = new HashSet((Collection<? extends Object>) term185);
        term127 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product"));
        setField(term127, term127.getClass(), "id", term128);
        setField(term127, term127.getClass(), "name", "IoAlmYsBwc");
        setField(term127, term127.getClass(), "category", "TEParAifyi");
        setField(term127, term127.getClass(), "price", term154);
        setField(term127, term127.getClass(), "orders", term156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term127, args);
    }

};


