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
     Object term1050;
     Object term1082;

    public ProductCategory_setId_14675208164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1051 = new Long(6617340557564669657L);
        HashMap term1066 = new HashMap();
        Set<Object> term1094 =  ((Map) term1066).keySet();
        HashSet term1065 = new HashSet((Collection<? extends Object>) term1094);
        term1050 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        setField(term1050, term1050.getClass(), "id", term1051);
        setField(term1050, term1050.getClass(), "categoryName", "EKjQdtKxAM");
        setField(term1050, term1050.getClass(), "products", term1065);
        term1082 = new Long(2936323121573284007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1082;
        callMethod(klass, "setId", argTypes, term1050, args);
    }

};


