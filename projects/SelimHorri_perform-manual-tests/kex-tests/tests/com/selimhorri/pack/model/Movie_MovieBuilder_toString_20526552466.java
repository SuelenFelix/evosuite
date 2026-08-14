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

public class Movie_MovieBuilder_toString_20526552466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294;

    public Movie_MovieBuilder_toString_20526552466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term295 = new Integer(-1955890973);
        Double term309 = new Double(0.2641345529914265);
        term294 = newInstance(Class.forName("com.selimhorri.pack.model.Movie$MovieBuilder"));
        setField(term294, term294.getClass(), "movieId", term295);
        setField(term294, term294.getClass(), "title", "MxlszYVzRf");
        setField(term294, term294.getClass(), "imdbRating", term309);
        setField(term294, term294.getClass(), "director", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Movie$MovieBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term294, args);
    }

};


