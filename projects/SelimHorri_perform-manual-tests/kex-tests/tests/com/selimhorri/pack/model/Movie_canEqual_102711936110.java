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

public class Movie_canEqual_102711936110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term865;
     Object term894;

    public Movie_canEqual_102711936110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term866 = new Integer(-1456670397);
        Double term880 = new Double(0.2779719046761513);
        term865 = newInstance(Class.forName("com.selimhorri.pack.model.Movie"));
        setField(term865, term865.getClass(), "movieId", term866);
        setField(term865, term865.getClass(), "title", "kuTXqwMtDB");
        setField(term865, term865.getClass(), "imdbRating", term880);
        setField(term865, term865.getClass(), "director", "Ghbwtircqb");
        term894 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Movie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term894;
        callMethod(klass, "canEqual", argTypes, term865, args);
    }

};


