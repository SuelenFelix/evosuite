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

public class Movie_MovieBuilder_imdbRating_1565180113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123;
     Object term152;

    public Movie_MovieBuilder_imdbRating_1565180113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term124 = new Integer(391863371);
        Double term138 = new Double(0.5523635872663106);
        term123 = newInstance(Class.forName("com.selimhorri.pack.model.Movie$MovieBuilder"));
        setField(term123, term123.getClass(), "movieId", term124);
        setField(term123, term123.getClass(), "title", "EGtDIRbSSb");
        setField(term123, term123.getClass(), "imdbRating", term138);
        setField(term123, term123.getClass(), "director", "SzjVpOQTyS");
        term152 = new Double(0.544608645520025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Movie$MovieBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term152;
        callMethod(klass, "imdbRating", argTypes, term123, args);
    }

};


