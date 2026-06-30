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

public class ProductWithCurrency_getPrice_10145063462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609;

    public ProductWithCurrency_getPrice_10145063462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term622 = new Integer(1442160736);
        term609 = newInstance(Class.forName("online.devupgrade.sezon2.entities.ProductWithCurrency"));
        setField(term609, term609.getClass(), "currency", "RYdKCNNMBR");
        setField(term609, term609.getClass(), "id", term622);
        setFloatField(term609, term609.getClass(), "price", 0.20737511F);
        setFloatField(term609, term609.getClass(), "pricePoPrzecinku", 0.1610204F);
        setBooleanField(term609, term609.getClass(), "isPriceGetOnce", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.ProductWithCurrency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term609, args);
    }

};


