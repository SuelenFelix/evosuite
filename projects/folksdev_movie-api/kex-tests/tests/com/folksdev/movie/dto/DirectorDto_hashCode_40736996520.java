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

public class DirectorDto_hashCode_40736996520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3131;

    public DirectorDto_hashCode_40736996520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3131 = newInstance(Class.forName("com.folksdev.movie.dto.DirectorDto"));
        setField(term3131, term3131.getClass(), "id", null);
        setField(term3131, term3131.getClass(), "name", null);
        setField(term3131, term3131.getClass(), "lastName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.DirectorDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3131, args);
    }

};


