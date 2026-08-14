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

public class Location_getId_14133836070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2523;

    public Location_getId_14133836070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2523 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2523, term2523.getClass(), "id", 6617340557564669657L);
        setField(term2523, term2523.getClass(), "place", "ZVecLZMLHF");
        setField(term2523, term2523.getClass(), "description", "fztQhjqwdP");
        setDoubleField(term2523, term2523.getClass(), "longitude", 0.3587267442738795);
        setDoubleField(term2523, term2523.getClass(), "latitude", 0.07802449704920456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2523, args);
    }

};


