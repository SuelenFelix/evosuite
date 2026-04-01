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

public class Place_setKpop_78980584411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5821;

    public Place_setKpop_78980584411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5821 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term5821, term5821.getClass(), "placeNum", -73683645);
        setField(term5821, term5821.getClass(), "keyHash", "doQLHkjpNm");
        setIntField(term5821, term5821.getClass(), "placeType", -226514366);
        setField(term5821, term5821.getClass(), "culture", "lCyLIcSuom");
        setField(term5821, term5821.getClass(), "kpop", "CGOpQSZZwI");
        setDoubleField(term5821, term5821.getClass(), "lat", 0.022483645678509023);
        setDoubleField(term5821, term5821.getClass(), "lng", 0.025133051616627267);
        setIntField(term5821, term5821.getClass(), "status", 1193880199);
        setField(term5821, term5821.getClass(), "name", "ypEdrstygY");
        setField(term5821, term5821.getClass(), "explain", "sNQFlATEeQ");
        setField(term5821, term5821.getClass(), "address", "ZKMLioamsY");
        setField(term5821, term5821.getClass(), "fileUrl", "WVbxuoDBcn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pvDEABOxLt";
        callMethod(klass, "setKpop", argTypes, term5821, args);
    }

};


