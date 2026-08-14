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

public class Location_hashCode_113534958114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3159;

    public Location_hashCode_113534958114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3159 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term3159, term3159.getClass(), "id", -3842548265506930260L);
        setField(term3159, term3159.getClass(), "place", "gCWtLVKVVe");
        setField(term3159, term3159.getClass(), "description", "fWKJoSoCwE");
        setDoubleField(term3159, term3159.getClass(), "longitude", 0.13246999699526574);
        setDoubleField(term3159, term3159.getClass(), "latitude", 0.9126850255993704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3159, args);
    }

};


