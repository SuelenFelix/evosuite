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

public class ProductWithCurrency_getCurrency_8814165811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581;

    public ProductWithCurrency_getCurrency_8814165811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term594 = new Integer(-1547384488);
        term581 = newInstance(Class.forName("online.devupgrade.sezon2.entities.ProductWithCurrency"));
        setField(term581, term581.getClass(), "currency", "OEXDRUKcFl");
        setField(term581, term581.getClass(), "id", term594);
        setFloatField(term581, term581.getClass(), "price", 0.5804949F);
        setFloatField(term581, term581.getClass(), "pricePoPrzecinku", 0.26573372F);
        setBooleanField(term581, term581.getClass(), "isPriceGetOnce", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.ProductWithCurrency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrency", argTypes, term581, args);
    }

};


