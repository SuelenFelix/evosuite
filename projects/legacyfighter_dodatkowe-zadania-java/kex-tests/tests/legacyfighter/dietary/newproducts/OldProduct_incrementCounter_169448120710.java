package legacyfighter.dietary.newproducts;

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
import static legacyfighter.dietary.newproducts.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OldProduct_incrementCounter_169448120710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886;

    public OldProduct_incrementCounter_169448120710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term886 = newInstance(Class.forName("legacyfighter.dietary.newproducts.OldProduct"));
        setField(term886, term886.getClass(), "serialNumber", null);
        setField(term886, term886.getClass(), "price", null);
        setField(term886, term886.getClass(), "desc", null);
        setField(term886, term886.getClass(), "counter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.newproducts.OldProduct");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "incrementCounter", argTypes, term886, args);
    }

};


