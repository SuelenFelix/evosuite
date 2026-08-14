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

public class User_setFirstName_12006060688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2106;

    public User_setFirstName_12006060688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2106 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term2156 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2106, term2106.getClass(), "id", 1233889271256172047L);
        setField(term2106, term2106.getClass(), "email", "TimdotUuNC");
        setField(term2106, term2106.getClass(), "firstName", "PkWMRdJcBb");
        setField(term2106, term2106.getClass(), "lastName", "jSpAteRute");
        setField(term2106, term2106.getClass(), "password", "swZVeJAxjt");
        setLongField(term2156, term2156.getClass(), "id", 6617340557564669657L);
        setField(term2156, term2156.getClass(), "place", "xOcJIiQQDu");
        setField(term2156, term2156.getClass(), "description", "GVizqqzXpy");
        setDoubleField(term2156, term2156.getClass(), "longitude", 0.6862221294683138);
        setDoubleField(term2156, term2156.getClass(), "latitude", 0.15917839663695388);
        setField(term2106, term2106.getClass(), "location", term2156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JqXGgAhZPl";
        callMethod(klass, "setFirstName", argTypes, term2106, args);
    }

};


