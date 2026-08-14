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

public class MovieServiceImpl_save_16085383622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public MovieServiceImpl_save_16085383622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4 = new Integer(1162663216);
        Double term18 = new Double(0.13238746331190498);
        term3 = newInstance(Class.forName("com.selimhorri.pack.model.Movie"));
        setField(term3, term3.getClass(), "movieId", term4);
        setField(term3, term3.getClass(), "title", "PAEBtnZtTD");
        setField(term3, term3.getClass(), "imdbRating", term18);
        setField(term3, term3.getClass(), "director", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.pack.service.MovieServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.selimhorri.pack.model.Movie");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "save", argTypes, null, args);
    }

};


