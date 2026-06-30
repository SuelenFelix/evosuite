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

public class DiscountEntity_getId_117832848018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2405;

    public DiscountEntity_getId_117832848018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2405 = newInstance(Class.forName("online.devupgrade.sezon2.entities.DiscountEntity"));
        setField(term2405, term2405.getClass(), "id", null);
        setField(term2405, term2405.getClass(), "value", null);
        setField(term2405, term2405.getClass(), "roles", null);
        setField(term2405, term2405.getClass(), "included", null);
        setField(term2405, term2405.getClass(), "excluded", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("online.devupgrade.sezon2.entities.DiscountEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2405, args);
    }

};


