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

public class Place_getName_85810623918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6969;

    public Place_getName_85810623918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6969 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term6969, term6969.getClass(), "placeNum", -1048298087);
        setField(term6969, term6969.getClass(), "keyHash", "ZfBIVGBQOE");
        setIntField(term6969, term6969.getClass(), "placeType", 292681826);
        setField(term6969, term6969.getClass(), "culture", "QSrDQfEsTR");
        setField(term6969, term6969.getClass(), "kpop", "PsqusYmejD");
        setDoubleField(term6969, term6969.getClass(), "lat", 0.8924855581421237);
        setDoubleField(term6969, term6969.getClass(), "lng", 0.32237559209193944);
        setIntField(term6969, term6969.getClass(), "status", 458147407);
        setField(term6969, term6969.getClass(), "name", "NTWMiBEaDF");
        setField(term6969, term6969.getClass(), "explain", "SPBstwKFVr");
        setField(term6969, term6969.getClass(), "address", "WxYUTuqmIq");
        setField(term6969, term6969.getClass(), "fileUrl", "OeQLvhVERT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term6969, args);
    }

};


