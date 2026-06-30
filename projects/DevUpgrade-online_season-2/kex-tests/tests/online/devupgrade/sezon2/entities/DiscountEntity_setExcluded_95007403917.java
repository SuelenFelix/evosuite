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

public class DiscountEntity_setExcluded_95007403917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2404;

    public DiscountEntity_setExcluded_95007403917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2404 = newInstance(Class.forName("online.devupgrade.sezon2.entities.DiscountEntity"));
        setField(term2404, term2404.getClass(), "id", null);
        setField(term2404, term2404.getClass(), "value", null);
        setField(term2404, term2404.getClass(), "roles", null);
        setField(term2404, term2404.getClass(), "included", null);
        setField(term2404, term2404.getClass(), "excluded", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.DiscountEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setExcluded", argTypes, term2404, args);
    }

};


