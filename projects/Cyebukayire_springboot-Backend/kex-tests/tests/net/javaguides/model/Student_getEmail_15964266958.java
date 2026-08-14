package net.javaguides.model;

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
import static net.javaguides.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Student_getEmail_15964266958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521;

    public Student_getEmail_15964266958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term521 = newInstance(Class.forName("net.javaguides.model.Student"));
        setLongField(term521, term521.getClass(), "id", 6811161968424632369L);
        setField(term521, term521.getClass(), "names", "eZFUvlxvGV");
        setField(term521, term521.getClass(), "classes", "BYqFIqCKAV");
        setField(term521, term521.getClass(), "email", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.model.Student");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term521, args);
    }

};


