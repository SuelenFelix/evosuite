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

public class Place_setStatus_40149509917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6807;
     Object term6897;

    public Place_setStatus_40149509917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6807 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term6807, term6807.getClass(), "placeNum", 1632125673);
        setField(term6807, term6807.getClass(), "keyHash", "yUGCjlqgJE");
        setIntField(term6807, term6807.getClass(), "placeType", 454281060);
        setField(term6807, term6807.getClass(), "culture", "PXdVZyoJyC");
        setField(term6807, term6807.getClass(), "kpop", "vLerpqavFM");
        setDoubleField(term6807, term6807.getClass(), "lat", 0.29874017652881824);
        setDoubleField(term6807, term6807.getClass(), "lng", 0.32554480512985284);
        setIntField(term6807, term6807.getClass(), "status", -1786399638);
        setField(term6807, term6807.getClass(), "name", "qnvxzwuGKX");
        setField(term6807, term6807.getClass(), "explain", "EdPAvpluZg");
        setField(term6807, term6807.getClass(), "address", "DzHVBMqWtE");
        setField(term6807, term6807.getClass(), "fileUrl", "THZSpzBRYP");
        term6897 = new Integer(2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6897;
        callMethod(klass, "setStatus", argTypes, term6807, args);
    }

};


