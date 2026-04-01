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
import java.lang.Integer;

public class Place_setPlaceNum_7802135223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4493;
     Object term4583;

    public Place_setPlaceNum_7802135223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4493 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term4493, term4493.getClass(), "placeNum", -1955890973);
        setField(term4493, term4493.getClass(), "keyHash", "kGMQdqJYyB");
        setIntField(term4493, term4493.getClass(), "placeType", -2038273078);
        setField(term4493, term4493.getClass(), "culture", "XJJNClzHRf");
        setField(term4493, term4493.getClass(), "kpop", "HDaezxQfQR");
        setDoubleField(term4493, term4493.getClass(), "lat", 0.6862221294683138);
        setDoubleField(term4493, term4493.getClass(), "lng", 0.15917839663695388);
        setIntField(term4493, term4493.getClass(), "status", 1227103734);
        setField(term4493, term4493.getClass(), "name", "iikZEapDlu");
        setField(term4493, term4493.getClass(), "explain", "nhoHrZfnIN");
        setField(term4493, term4493.getClass(), "address", "ZkMALXpEAZ");
        setField(term4493, term4493.getClass(), "fileUrl", "tXfQjSqDzN");
        term4583 = new Integer(-1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4583;
        callMethod(klass, "setPlaceNum", argTypes, term4493, args);
    }

};


