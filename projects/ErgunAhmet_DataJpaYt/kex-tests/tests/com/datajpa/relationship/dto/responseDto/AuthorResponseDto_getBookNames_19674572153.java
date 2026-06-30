package com.datajpa.relationship.dto.responseDto;

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
import static com.datajpa.relationship.dto.responseDto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class AuthorResponseDto_getBookNames_19674572153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3281;

    public AuthorResponseDto_getBookNames_19674572153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3282 = new Long(-7672528020740371001L);
        ArrayList term3296 = new ArrayList();
        ((ArrayList) term3296).add("pXOkjyeIRb");
        ((ArrayList) term3296).add("GgZWSjxjyE");
        ((ArrayList) term3296).add("EeBVbzjcCI");
        ((ArrayList) term3296).add("UfQtPRyWRC");
        ((ArrayList) term3296).add("FPvxVzzSvD");
        ((ArrayList) term3296).add("WHcwFgsGFC");
        term3281 = newInstance(Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto"));
        setField(term3281, term3281.getClass(), "id", term3282);
        setField(term3281, term3281.getClass(), "name", "mvrkADEgpp");
        setField(term3281, term3281.getClass(), "bookNames", term3296);
        setField(term3281, term3281.getClass(), "zipcodeName", "HzqpegHiRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.responseDto.AuthorResponseDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBookNames", argTypes, term3281, args);
    }

};


