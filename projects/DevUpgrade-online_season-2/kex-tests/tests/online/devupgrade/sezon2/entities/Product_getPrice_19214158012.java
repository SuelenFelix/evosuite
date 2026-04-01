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
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Float;

public class Product_getPrice_19214158012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2591;
     Object term2597;
     Object term2599;

    public Product_getPrice_19214158012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2592 = new Integer(-1870495012);
        term2591 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term2591, term2591.getClass(), "id", term2592);
        setFloatField(term2591, term2591.getClass(), "price", 0.017911553F);
        setFloatField(term2591, term2591.getClass(), "pricePoPrzecinku", 0.53359526F);
        setBooleanField(term2591, term2591.getClass(), "isPriceGetOnce", true);
        term2597 = new Boolean(false);
        term2599 = new Float(0.13238746F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.Product");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("java.lang.Float");
        Object[] args = new Object[2];
        args[0] = term2597;
        args[1] = term2599;
        callMethod(klass, "getPrice", argTypes, term2591, args);
    }

};


