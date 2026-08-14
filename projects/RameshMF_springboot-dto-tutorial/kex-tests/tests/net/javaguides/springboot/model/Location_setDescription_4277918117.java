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

public class Location_setDescription_4277918117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2883;

    public Location_setDescription_4277918117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2883 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2883, term2883.getClass(), "id", 4784595517102746672L);
        setField(term2883, term2883.getClass(), "place", "XOiDvlDhdc");
        setField(term2883, term2883.getClass(), "description", "AdxvLJhNLe");
        setDoubleField(term2883, term2883.getClass(), "longitude", 0.6862221294683138);
        setDoubleField(term2883, term2883.getClass(), "latitude", 0.15917839663695388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lHfTrWKMPk";
        callMethod(klass, "setDescription", argTypes, term2883, args);
    }

};


