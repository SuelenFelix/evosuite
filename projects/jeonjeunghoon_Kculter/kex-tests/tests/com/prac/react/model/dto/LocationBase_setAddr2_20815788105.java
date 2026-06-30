package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LocationBase_setAddr2_20815788105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27706;

    public LocationBase_setAddr2_20815788105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27706 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term27706, term27706.getClass(), "addr1", "uMzGGnJFYF");
        setField(term27706, term27706.getClass(), "addr2", "iAIRLRjFkP");
        setField(term27706, term27706.getClass(), "contenttypeid", "cdXvvxXVTz");
        setField(term27706, term27706.getClass(), "firstimage", "tXsfWIqIPn");
        setField(term27706, term27706.getClass(), "firstimage2", "tDmfqEyHaN");
        setField(term27706, term27706.getClass(), "mapx", "mTSMXFkWRr");
        setField(term27706, term27706.getClass(), "mapy", "qdIiMKwfzT");
        setField(term27706, term27706.getClass(), "tel", "qrmUWIxufo");
        setField(term27706, term27706.getClass(), "title", "SeWCUkXfZv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "woQcQRYwNH";
        callMethod(klass, "setAddr2", argTypes, term27706, args);
    }

};


