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

public class NotAProductProductWithCurrency_getPrice_17382369613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844;

    public NotAProductProductWithCurrency_getPrice_17382369613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term844 = newInstance(Class.forName("online.devupgrade.sezon2.entities.NotAProductProductWithCurrency"));
        setField(term844, term844.getClass(), "currency", null);
        setField(term844, term844.getClass(), "id", null);
        setFloatField(term844, term844.getClass(), "price", 0.0F);
        setFloatField(term844, term844.getClass(), "pricePoPrzecinku", 0.0F);
        setBooleanField(term844, term844.getClass(), "isPriceGetOnce", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.NotAProductProductWithCurrency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term844, args);
    }

};


