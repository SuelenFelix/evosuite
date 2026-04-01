package com.folksdev.movie.dto;

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
import static com.folksdev.movie.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;

public class BaseMovieRequest_getDuration_8365524833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3351;

    public BaseMovieRequest_getDuration_8365524833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3356 = new Integer(0);
        Integer term3358 = new Integer(0);
        ArrayList term3360 = new ArrayList();
        ArrayList term3364 = new ArrayList();
        term3351 = newInstance(Class.forName("com.folksdev.movie.dto.BaseMovieRequest"));
        setField(term3351, term3351.getClass(), "description", "");
        setField(term3351, term3351.getClass(), "imdbUrl", "");
        setField(term3351, term3351.getClass(), "duration", term3356);
        setField(term3351, term3351.getClass(), "featuredYear", term3358);
        setField(term3351, term3351.getClass(), "genresType", term3360);
        setField(term3351, term3351.getClass(), "actorIds", term3364);
        setField(term3351, term3351.getClass(), "publisherId", "");
        setField(term3351, term3351.getClass(), "directorId", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.BaseMovieRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term3351, args);
    }

};


