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

public class ProductCategory_setId_14675208164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1044;
     Object term1078;

    public ProductCategory_setId_14675208164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1045 = new Long(6617340557564669657L);
        HashMap term1060 = new HashMap();
        Set<Object> term1090 =  ((Map) term1060).keySet();
        HashSet term1059 = new HashSet((Collection<? extends Object>) term1090);
        term1044 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        setField(term1044, term1044.getClass(), "id", term1045);
        setField(term1044, term1044.getClass(), "categoryName", "EKjQdtKxAM");
        setField(term1044, term1044.getClass(), "products", term1059);
        term1078 = new Long(2936323121573284007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1078;
        callMethod(klass, "setId", argTypes, term1044, args);
    }

};


