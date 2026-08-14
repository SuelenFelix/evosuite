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
import java.lang.Long;

public class User_init_86772985717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3326;
     Object term3376;

    public User_init_86772985717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3326 = new Long(-1154553077993834885L);
        term3376 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term3376, term3376.getClass(), "id", -2850532706972744550L);
        setField(term3376, term3376.getClass(), "place", "GgZWSjxjyE");
        setField(term3376, term3376.getClass(), "description", "EeBVbzjcCI");
        setDoubleField(term3376, term3376.getClass(), "longitude", 0.016575281023182953);
        setDoubleField(term3376, term3376.getClass(), "latitude", 0.5308350402051779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("net.javaguides.springboot.model.Location");
        Object[] args = new Object[6];
        args[0] = term3326;
        args[1] = "LWyEaeIyAo";
        args[2] = "yVMkkQhvmN";
        args[3] = "mvrkADEgpp";
        args[4] = "pXOkjyeIRb";
        args[5] = term3376;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


