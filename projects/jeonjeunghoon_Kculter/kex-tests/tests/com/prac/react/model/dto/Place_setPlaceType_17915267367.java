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

public class Place_setPlaceType_17915267367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5157;
     Object term5247;

    public Place_setPlaceType_17915267367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5157 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term5157, term5157.getClass(), "placeNum", 1048535127);
        setField(term5157, term5157.getClass(), "keyHash", "AHbZyFOmlo");
        setIntField(term5157, term5157.getClass(), "placeType", -655067527);
        setField(term5157, term5157.getClass(), "culture", "TwfWVQGiIj");
        setField(term5157, term5157.getClass(), "kpop", "gUvcueTURF");
        setDoubleField(term5157, term5157.getClass(), "lat", 0.7919370314903882);
        setDoubleField(term5157, term5157.getClass(), "lng", 0.2109867221632754);
        setIntField(term5157, term5157.getClass(), "status", -6029667);
        setField(term5157, term5157.getClass(), "name", "EwQBhZjCIT");
        setField(term5157, term5157.getClass(), "explain", "aSkmSwTnEw");
        setField(term5157, term5157.getClass(), "address", "xvkbvaEGYd");
        setField(term5157, term5157.getClass(), "fileUrl", "HBGNxdNURv");
        term5247 = new Integer(-2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5247;
        callMethod(klass, "setPlaceType", argTypes, term5157, args);
    }

};


