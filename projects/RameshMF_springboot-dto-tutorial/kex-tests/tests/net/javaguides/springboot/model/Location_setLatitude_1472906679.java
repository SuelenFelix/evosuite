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
import java.lang.Double;

public class Location_setLatitude_1472906679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3003;
     Object term3031;

    public Location_setLatitude_1472906679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3003 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term3003, term3003.getClass(), "id", -2170847986967241072L);
        setField(term3003, term3003.getClass(), "place", "xIeFjkHkOe");
        setField(term3003, term3003.getClass(), "description", "SdCKLMIYnX");
        setDoubleField(term3003, term3003.getClass(), "longitude", 0.9203805380592256);
        setDoubleField(term3003, term3003.getClass(), "latitude", 0.5804948995371725);
        term3031 = new Double(0.20737514139742264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term3031;
        callMethod(klass, "setLatitude", argTypes, term3003, args);
    }

};


