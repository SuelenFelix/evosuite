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

public class Place_getFileUrl_145849922924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7995;

    public Place_getFileUrl_145849922924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7995 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term7995, term7995.getClass(), "placeNum", 1540719661);
        setField(term7995, term7995.getClass(), "keyHash", "mLwibAPEsa");
        setIntField(term7995, term7995.getClass(), "placeType", 1265463001);
        setField(term7995, term7995.getClass(), "culture", "zsWKWiTFuo");
        setField(term7995, term7995.getClass(), "kpop", "UPUbwyHQKN");
        setDoubleField(term7995, term7995.getClass(), "lat", 0.16988691727397487);
        setDoubleField(term7995, term7995.getClass(), "lng", 0.39286935532362843);
        setIntField(term7995, term7995.getClass(), "status", 335112684);
        setField(term7995, term7995.getClass(), "name", "lgQkrXANyI");
        setField(term7995, term7995.getClass(), "explain", "MeTmRZXErV");
        setField(term7995, term7995.getClass(), "address", "jNxbVmoZgq");
        setField(term7995, term7995.getClass(), "fileUrl", "PvmBHIXaMY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileUrl", argTypes, term7995, args);
    }

};


