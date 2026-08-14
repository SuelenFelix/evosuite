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

public class Movie_setMovieId_6521052195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;
     Object term600;

    public Movie_setMovieId_6521052195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term572 = new Integer(-522618178);
        Double term586 = new Double(0.5183269973490326);
        term571 = newInstance(Class.forName("com.selimhorri.pack.model.Movie"));
        setField(term571, term571.getClass(), "movieId", term572);
        setField(term571, term571.getClass(), "title", "xOEqzGAmDU");
        setField(term571, term571.getClass(), "imdbRating", term586);
        setField(term571, term571.getClass(), "director", "eZFUvlxvGV");
        term600 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.model.Movie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term600;
        callMethod(klass, "setMovieId", argTypes, term571, args);
    }

};


