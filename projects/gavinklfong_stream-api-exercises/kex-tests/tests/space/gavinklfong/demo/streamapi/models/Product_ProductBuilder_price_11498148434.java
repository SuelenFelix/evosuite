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

public class Product_ProductBuilder_price_11498148434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3932;
     Object term3978;

    public Product_ProductBuilder_price_11498148434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3933 = new Long(7917622690009120321L);
        Double term3959 = new Double(0.5548341997020813);
        HashMap term3962 = new HashMap();
        Set<Object> term4000 =  ((Map) term3962).keySet();
        HashSet term3961 = new HashSet((Collection<? extends Object>) term4000);
        term3932 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder"));
        setField(term3932, term3932.getClass(), "id", term3933);
        setField(term3932, term3932.getClass(), "name", "GwGUMPdvZq");
        setField(term3932, term3932.getClass(), "category", "iXRAYcFyfS");
        setField(term3932, term3932.getClass(), "price", term3959);
        setField(term3932, term3932.getClass(), "orders", term3961);
        term3978 = new Double(0.16828712051665362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term3978;
        callMethod(klass, "price", argTypes, term3932, args);
    }

};


