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

public class Place_toString_27365150026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8337;

    public Place_toString_27365150026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8337 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term8337, term8337.getClass(), "placeNum", 1375330971);
        setField(term8337, term8337.getClass(), "keyHash", "eOJfbiZLnb");
        setIntField(term8337, term8337.getClass(), "placeType", -478195677);
        setField(term8337, term8337.getClass(), "culture", "nKZKnxWYCK");
        setField(term8337, term8337.getClass(), "kpop", "JOqQxuzRuZ");
        setDoubleField(term8337, term8337.getClass(), "lat", 0.09067063848644474);
        setDoubleField(term8337, term8337.getClass(), "lng", 0.268304014379393);
        setIntField(term8337, term8337.getClass(), "status", 972867650);
        setField(term8337, term8337.getClass(), "name", "RSaoipUlsg");
        setField(term8337, term8337.getClass(), "explain", "cSHGbqKqlN");
        setField(term8337, term8337.getClass(), "address", "pFAfANnxup");
        setField(term8337, term8337.getClass(), "fileUrl", "FbSIUZyBXZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8337, args);
    }

};


