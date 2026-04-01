package online.devupgrade.sezon2.entities;

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
import static online.devupgrade.sezon2.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class Product_getPrice_19214158017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2619;
     Object term2623;

    public Product_getPrice_19214158017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2619 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term2619, term2619.getClass(), "id", null);
        setFloatField(term2619, term2619.getClass(), "price", 0.0F);
        setFloatField(term2619, term2619.getClass(), "pricePoPrzecinku", 0.0F);
        setBooleanField(term2619, term2619.getClass(), "isPriceGetOnce", false);
        term2623 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.Product");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("java.lang.Float");
        Object[] args = new Object[2];
        args[0] = term2623;
        args[1] = null;
        callMethod(klass, "getPrice", argTypes, term2619, args);
    }

};


