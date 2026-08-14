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

public class Movie_MovieBuilder_director_15967707284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174;

    public Movie_MovieBuilder_director_15967707284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term175 = new Integer(-1922583790);
        Double term189 = new Double(0.28570734989730284);
        term174 = newInstance(Class.forName("com.selimhorri.pack.model.Movie$MovieBuilder"));
        setField(term174, term174.getClass(), "movieId", term175);
        setField(term174, term174.getClass(), "title", "MjGYSRKTNF");
        setField(term174, term174.getClass(), "imdbRating", term189);
        setField(term174, term174.getClass(), "director", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Movie$MovieBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RMFIsYGgne";
        callMethod(klass, "director", argTypes, term174, args);
    }

};


