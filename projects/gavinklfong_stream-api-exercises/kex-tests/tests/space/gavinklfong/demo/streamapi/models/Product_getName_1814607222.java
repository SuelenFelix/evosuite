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

public class Product_getName_1814607222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68;

    public Product_getName_1814607222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term69 = new Long(-4920224193275732920L);
        Double term95 = new Double(0.40176586625454525);
        HashMap term98 = new HashMap();
        Set<Object> term126 =  ((Map) term98).keySet();
        HashSet term97 = new HashSet((Collection<? extends Object>) term126);
        term68 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product"));
        setField(term68, term68.getClass(), "id", term69);
        setField(term68, term68.getClass(), "name", "BYqFIqCKAV");
        setField(term68, term68.getClass(), "category", "vrQLuWIDJX");
        setField(term68, term68.getClass(), "price", term95);
        setField(term68, term68.getClass(), "orders", term97);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term68, args);
    }

};


