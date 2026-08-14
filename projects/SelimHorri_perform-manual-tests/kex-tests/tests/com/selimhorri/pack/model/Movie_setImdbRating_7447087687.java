package com.selimhorri.pack.model;

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
import static com.selimhorri.pack.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;

public class Movie_setImdbRating_7447087687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693;
     Object term722;

    public Movie_setImdbRating_7447087687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term694 = new Integer(1585847225);
        Double term708 = new Double(0.1374549299694151);
        term693 = newInstance(Class.forName("com.selimhorri.pack.model.Movie"));
        setField(term693, term693.getClass(), "movieId", term694);
        setField(term693, term693.getClass(), "title", "OclPbYPkcH");
        setField(term693, term693.getClass(), "imdbRating", term708);
        setField(term693, term693.getClass(), "director", "IoAlmYsBwc");
        term722 = new Double(0.7031006357544823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Movie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term722;
        callMethod(klass, "setImdbRating", argTypes, term693, args);
    }

};


