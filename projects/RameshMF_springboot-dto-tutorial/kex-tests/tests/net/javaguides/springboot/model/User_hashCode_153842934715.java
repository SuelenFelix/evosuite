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
import java.lang.Object;

public class User_hashCode_153842934715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2075;

    public User_hashCode_153842934715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2075 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term2125 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2075, term2075.getClass(), "id", 6855071767938501807L);
        setField(term2075, term2075.getClass(), "email", "swZVeJAxjt");
        setField(term2075, term2075.getClass(), "firstName", "xOcJIiQQDu");
        setField(term2075, term2075.getClass(), "lastName", "GVizqqzXpy");
        setField(term2075, term2075.getClass(), "password", "JqXGgAhZPl");
        setLongField(term2125, term2125.getClass(), "id", -5892135042702373494L);
        setField(term2125, term2125.getClass(), "place", "jiKYgYHqIS");
        setField(term2125, term2125.getClass(), "description", "DfISiziTgG");
        setDoubleField(term2125, term2125.getClass(), "longitude", 0.37161417339133307);
        setDoubleField(term2125, term2125.getClass(), "latitude", 0.6805867182029153);
        setField(term2075, term2075.getClass(), "location", term2125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2075, args);
    }

};


