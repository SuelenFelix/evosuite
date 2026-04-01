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

public class BaseMovieRequest_getDirectorId_4933148058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3456;

    public BaseMovieRequest_getDirectorId_4933148058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3461 = new Integer(0);
        Integer term3463 = new Integer(0);
        ArrayList term3465 = new ArrayList();
        ArrayList term3469 = new ArrayList();
        term3456 = newInstance(Class.forName("com.folksdev.movie.dto.BaseMovieRequest"));
        setField(term3456, term3456.getClass(), "description", "");
        setField(term3456, term3456.getClass(), "imdbUrl", "");
        setField(term3456, term3456.getClass(), "duration", term3461);
        setField(term3456, term3456.getClass(), "featuredYear", term3463);
        setField(term3456, term3456.getClass(), "genresType", term3465);
        setField(term3456, term3456.getClass(), "actorIds", term3469);
        setField(term3456, term3456.getClass(), "publisherId", "");
        setField(term3456, term3456.getClass(), "directorId", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.BaseMovieRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDirectorId", argTypes, term3456, args);
    }

};


