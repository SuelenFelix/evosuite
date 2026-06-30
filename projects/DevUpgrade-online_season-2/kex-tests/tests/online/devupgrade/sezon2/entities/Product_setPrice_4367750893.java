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
import java.lang.Float;

public class Product_setPrice_4367750893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2601;
     Object term2607;

    public Product_setPrice_4367750893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2602 = new Integer(-1310015129);
        term2601 = newInstance(Class.forName("online.devupgrade.sezon2.entities.Product"));
        setField(term2601, term2601.getClass(), "id", term2602);
        setFloatField(term2601, term2601.getClass(), "price", 0.6826852F);
        setFloatField(term2601, term2601.getClass(), "pricePoPrzecinku", 0.5725602F);
        setBooleanField(term2601, term2601.getClass(), "isPriceGetOnce", false);
        term2607 = new Float(0.2707036F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Float");
        Object[] args = new Object[1];
        args[0] = term2607;
        callMethod(klass, "setPrice", argTypes, term2601, args);
    }

};


