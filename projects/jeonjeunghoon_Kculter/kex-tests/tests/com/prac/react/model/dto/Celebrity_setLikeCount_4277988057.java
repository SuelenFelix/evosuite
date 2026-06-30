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

public class Celebrity_setLikeCount_4277988057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16486;
     Object term16539;

    public Celebrity_setLikeCount_4277988057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16486 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term16486, term16486.getClass(), "keyNum", 1241164745);
        setField(term16486, term16486.getClass(), "name", "QGcshsIIWo");
        setIntField(term16486, term16486.getClass(), "likeCount", 1723148410);
        setIntField(term16486, term16486.getClass(), "status", -920797484);
        setField(term16486, term16486.getClass(), "explain", "dPHtrzKWgf");
        setField(term16486, term16486.getClass(), "fileUrl", "olmFxfIVeh");
        setField(term16486, term16486.getClass(), "keyHash", "iSPirUEhXs");
        setIntField(term16486, term16486.getClass(), "spot", -1631697577);
        term16539 = new Integer(765731371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term16539;
        callMethod(klass, "setLikeCount", argTypes, term16486, args);
    }

};


