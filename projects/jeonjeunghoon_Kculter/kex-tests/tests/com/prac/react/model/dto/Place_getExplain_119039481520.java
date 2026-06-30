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

public class Place_getExplain_119039481520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7311;

    public Place_getExplain_119039481520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7311 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term7311, term7311.getClass(), "placeNum", 1596070772);
        setField(term7311, term7311.getClass(), "keyHash", "nRvKihUSPj");
        setIntField(term7311, term7311.getClass(), "placeType", 97029295);
        setField(term7311, term7311.getClass(), "culture", "BbNeQJpYPr");
        setField(term7311, term7311.getClass(), "kpop", "riMtzCoxNj");
        setDoubleField(term7311, term7311.getClass(), "lat", 0.24259014218848696);
        setDoubleField(term7311, term7311.getClass(), "lng", 0.1544348383112728);
        setIntField(term7311, term7311.getClass(), "status", -1371869594);
        setField(term7311, term7311.getClass(), "name", "YAXkVjQZcV");
        setField(term7311, term7311.getClass(), "explain", "pumvwBWvpy");
        setField(term7311, term7311.getClass(), "address", "HwLHeGLyhe");
        setField(term7311, term7311.getClass(), "fileUrl", "RDnkgWkcbz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExplain", argTypes, term7311, args);
    }

};


