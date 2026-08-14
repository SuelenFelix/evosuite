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

public class User_equals_108974267212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2772;
     Object term2850;

    public User_equals_108974267212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2772 = newInstance(Class.forName("net.javaguides.springboot.model.User"));
        Object term2822 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2772, term2772.getClass(), "id", 4784595517102746672L);
        setField(term2772, term2772.getClass(), "email", "iNwOJRBEjp");
        setField(term2772, term2772.getClass(), "firstName", "XylxrMBraH");
        setField(term2772, term2772.getClass(), "lastName", "pORebkoRdD");
        setField(term2772, term2772.getClass(), "password", "mXGCWJDOqA");
        setLongField(term2822, term2822.getClass(), "id", -7612550318181586304L);
        setField(term2822, term2822.getClass(), "place", "dpNsDgfPso");
        setField(term2822, term2822.getClass(), "description", "hCWPJQKpdc");
        setDoubleField(term2822, term2822.getClass(), "longitude", 0.3227335400819148);
        setDoubleField(term2822, term2822.getClass(), "latitude", 0.43337207054070237);
        setField(term2772, term2772.getClass(), "location", term2822);
        term2850 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2850;
        callMethod(klass, "equals", argTypes, term2772, args);
    }

};


