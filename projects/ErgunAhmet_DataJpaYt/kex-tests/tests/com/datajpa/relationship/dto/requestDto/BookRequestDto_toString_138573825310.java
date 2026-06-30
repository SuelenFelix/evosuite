package com.datajpa.relationship.dto.requestDto;

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
import static com.datajpa.relationship.dto.requestDto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Long;

public class BookRequestDto_toString_138573825310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1207;

    public BookRequestDto_toString_138573825310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1222 = new Long(6005241913654469005L);
        Long term1224 = new Long(-1983291584002806658L);
        Long term1226 = new Long(5946780097489996391L);
        ArrayList term1220 = new ArrayList();
        ((ArrayList) term1220).add(term1222);
        ((ArrayList) term1220).add(term1224);
        ((ArrayList) term1220).add(term1226);
        Long term1230 = new Long(-8652538484981166496L);
        term1207 = newInstance(Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto"));
        setField(term1207, term1207.getClass(), "name", "gGSMzuGICf");
        setField(term1207, term1207.getClass(), "authorIds", term1220);
        setField(term1207, term1207.getClass(), "categoryId", term1230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.dto.requestDto.BookRequestDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1207, args);
    }

};


