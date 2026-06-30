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

public class CreateMovieRequest_getTitle_2250352371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1700;

    public CreateMovieRequest_getTitle_2250352371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1737 = new Integer(1484323161);
        Integer term1739 = new Integer(391863371);
        ArrayList term1741 = new ArrayList();
        ArrayList term1745 = new ArrayList();
        ((ArrayList) term1745).add("ffYhPOzlUs");
        ((ArrayList) term1745).add("MLqYREekMl");
        ((ArrayList) term1745).add("ytSBIKXogI");
        ((ArrayList) term1745).add("nHXjMycHlU");
        term1700 = newInstance(Class.forName("com.folksdev.movie.dto.CreateMovieRequest"));
        setField(term1700, term1700.getClass(), "title", "JDswTTCZHV");
        setField(term1700, term1700.getClass(), "description", "onpbIeEKoi");
        setField(term1700, term1700.getClass(), "imdbUrl", "YRHGsAkhxb");
        setField(term1700, term1700.getClass(), "duration", term1737);
        setField(term1700, term1700.getClass(), "featuredYear", term1739);
        setField(term1700, term1700.getClass(), "genresType", term1741);
        setField(term1700, term1700.getClass(), "actorIds", term1745);
        setField(term1700, term1700.getClass(), "publisherId", "ieCtQFdkii");
        setField(term1700, term1700.getClass(), "directorId", "dEnhdmILtU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.CreateMovieRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term1700, args);
    }

};


