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

public class Place_setExplain_200187583921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7471;

    public Place_setExplain_200187583921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7471 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term7471, term7471.getClass(), "placeNum", -2095575670);
        setField(term7471, term7471.getClass(), "keyHash", "IBpaxltauX");
        setIntField(term7471, term7471.getClass(), "placeType", 1225272962);
        setField(term7471, term7471.getClass(), "culture", "hePqROaplw");
        setField(term7471, term7471.getClass(), "kpop", "PJcSNDruWd");
        setDoubleField(term7471, term7471.getClass(), "lat", 0.5187846213101265);
        setDoubleField(term7471, term7471.getClass(), "lng", 0.045893173090043815);
        setIntField(term7471, term7471.getClass(), "status", 1324040357);
        setField(term7471, term7471.getClass(), "name", "VVNNlAePXF");
        setField(term7471, term7471.getClass(), "explain", "jnwVnmKAFv");
        setField(term7471, term7471.getClass(), "address", "TXyHhqeCjR");
        setField(term7471, term7471.getClass(), "fileUrl", "lZIgPZPgTu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iuCxnHGMoW";
        callMethod(klass, "setExplain", argTypes, term7471, args);
    }

};


