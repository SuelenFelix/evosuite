package net.javaguides.springboot.model;

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
import static net.javaguides.springboot.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Location_getDescription_3247409952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2619;

    public Location_getDescription_3247409952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2619 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2619, term2619.getClass(), "id", -8708192233349544946L);
        setField(term2619, term2619.getClass(), "place", "OEXDRUKcFl");
        setField(term2619, term2619.getClass(), "description", "RYdKCNNMBR");
        setDoubleField(term2619, term2619.getClass(), "longitude", 0.22651340641904605);
        setDoubleField(term2619, term2619.getClass(), "latitude", 0.8878841294187743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term2619, args);
    }

};


