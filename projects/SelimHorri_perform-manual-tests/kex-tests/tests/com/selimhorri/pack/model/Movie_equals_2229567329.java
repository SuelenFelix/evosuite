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

public class Movie_equals_2229567329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term815;
     Object term844;

    public Movie_equals_2229567329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term816 = new Integer(-1685132342);
        Double term830 = new Double(0.9828442029246764);
        term815 = newInstance(Class.forName("com.selimhorri.pack.model.Movie"));
        setField(term815, term815.getClass(), "movieId", term816);
        setField(term815, term815.getClass(), "title", "AijpHYOFuy");
        setField(term815, term815.getClass(), "imdbRating", term830);
        setField(term815, term815.getClass(), "director", "SbAoxhfrkn");
        term844 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Movie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term844;
        callMethod(klass, "equals", argTypes, term815, args);
    }

};


