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

public class Product_ProductBuilder_category_10300165063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3843;

    public Product_ProductBuilder_category_10300165063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3844 = new Long(6553325891603936420L);
        Double term3870 = new Double(0.1523167696274942);
        HashMap term3873 = new HashMap();
        Set<Object> term3921 =  ((Map) term3873).keySet();
        HashSet term3872 = new HashSet((Collection<? extends Object>) term3921);
        term3843 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder"));
        setField(term3843, term3843.getClass(), "id", term3844);
        setField(term3843, term3843.getClass(), "name", "fSLHLeuNoa");
        setField(term3843, term3843.getClass(), "category", "IwgPFurObw");
        setField(term3843, term3843.getClass(), "price", term3870);
        setField(term3843, term3843.getClass(), "orders", term3872);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Product$ProductBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGQLusEtRN";
        callMethod(klass, "category", argTypes, term3843, args);
    }

};


