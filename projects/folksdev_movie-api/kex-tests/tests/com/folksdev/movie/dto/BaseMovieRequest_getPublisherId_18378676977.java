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

public class BaseMovieRequest_getPublisherId_18378676977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3435;

    public BaseMovieRequest_getPublisherId_18378676977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3440 = new Integer(0);
        Integer term3442 = new Integer(0);
        ArrayList term3444 = new ArrayList();
        ArrayList term3448 = new ArrayList();
        term3435 = newInstance(Class.forName("com.folksdev.movie.dto.BaseMovieRequest"));
        setField(term3435, term3435.getClass(), "description", "");
        setField(term3435, term3435.getClass(), "imdbUrl", "");
        setField(term3435, term3435.getClass(), "duration", term3440);
        setField(term3435, term3435.getClass(), "featuredYear", term3442);
        setField(term3435, term3435.getClass(), "genresType", term3444);
        setField(term3435, term3435.getClass(), "actorIds", term3448);
        setField(term3435, term3435.getClass(), "publisherId", "");
        setField(term3435, term3435.getClass(), "directorId", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.BaseMovieRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPublisherId", argTypes, term3435, args);
    }

};


