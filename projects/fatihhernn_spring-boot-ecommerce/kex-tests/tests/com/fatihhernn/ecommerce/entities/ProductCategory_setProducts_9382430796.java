package com.fatihhernn.ecommerce.entities;

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
import static com.fatihhernn.ecommerce.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ProductCategory_setProducts_9382430796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156;
     Object term1182;

    public ProductCategory_setProducts_9382430796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1157 = new Long(305759998609888272L);
        HashMap term1172 = new HashMap();
        Set<Object> term1207 =  ((Map) term1172).keySet();
        HashSet term1171 = new HashSet((Collection<? extends Object>) term1207);
        term1156 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        setField(term1156, term1156.getClass(), "id", term1157);
        setField(term1156, term1156.getClass(), "categoryName", "jiUSjqwSIQ");
        setField(term1156, term1156.getClass(), "products", term1171);
        HashMap term1183 = new HashMap();
        Set<Object> term1208 =  ((Map) term1183).keySet();
        term1182 = new HashSet((Collection<? extends Object>) term1208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term1182;
        callMethod(klass, "setProducts", argTypes, term1156, args);
    }

};


