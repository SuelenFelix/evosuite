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

public class Celebrity_toString_79987089618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17581;

    public Celebrity_toString_79987089618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17581 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term17581, term17581.getClass(), "keyNum", 644154104);
        setField(term17581, term17581.getClass(), "name", "tIsFcOGTUX");
        setIntField(term17581, term17581.getClass(), "likeCount", 76650923);
        setIntField(term17581, term17581.getClass(), "status", 1003743923);
        setField(term17581, term17581.getClass(), "explain", "XUVRcnELFP");
        setField(term17581, term17581.getClass(), "fileUrl", "xIeSbezmkD");
        setField(term17581, term17581.getClass(), "keyHash", "txUWLZRkSv");
        setIntField(term17581, term17581.getClass(), "spot", 1887772522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17581, args);
    }

};


