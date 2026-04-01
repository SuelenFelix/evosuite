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

public class NotAProductProductWithCurrency_getPrice_17382369611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term816;

    public NotAProductProductWithCurrency_getPrice_17382369611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term829 = new Integer(-556405712);
        term816 = newInstance(Class.forName("online.devupgrade.sezon2.entities.NotAProductProductWithCurrency"));
        setField(term816, term816.getClass(), "currency", "dpNsDgfPso");
        setField(term816, term816.getClass(), "id", term829);
        setFloatField(term816, term816.getClass(), "price", 0.24346101F);
        setFloatField(term816, term816.getClass(), "pricePoPrzecinku", 0.32273352F);
        setBooleanField(term816, term816.getClass(), "isPriceGetOnce", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.NotAProductProductWithCurrency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term816, args);
    }

};


