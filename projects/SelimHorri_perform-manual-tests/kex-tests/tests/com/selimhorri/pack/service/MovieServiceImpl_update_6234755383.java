package com.selimhorri.pack.service;

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
import static com.selimhorri.pack.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;

public class MovieServiceImpl_update_6234755383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52;

    public MovieServiceImpl_update_6234755383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term53 = new Integer(1484323161);
        Double term67 = new Double(0.3455959125047594);
        term52 = newInstance(Class.forName("com.selimhorri.pack.model.Movie"));
        setField(term52, term52.getClass(), "movieId", term53);
        setField(term52, term52.getClass(), "title", "MuLcgQHgqz");
        setField(term52, term52.getClass(), "imdbRating", term67);
        setField(term52, term52.getClass(), "director", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.service.MovieServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.selimhorri.pack.model.Movie");
        Object[] args = new Object[1];
        args[0] = term52;
        callMethod(klass, "update", argTypes, null, args);
    }

};


