package icu.samnyan.aqua.sega.general.model;

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
import static icu.samnyan.aqua.sega.general.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PropertyEntry_canEqual_13865543989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2726;
     Object term2752;

    public PropertyEntry_canEqual_13865543989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2726 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.PropertyEntry"));
        setLongField(term2726, term2726.getClass(), "id", 2486810210675247493L);
        setField(term2726, term2726.getClass(), "propertyKey", "xOcJIiQQDu");
        setField(term2726, term2726.getClass(), "propertyValue", "GVizqqzXpy");
        term2752 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.PropertyEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2752;
        callMethod(klass, "canEqual", argTypes, term2726, args);
    }

};


