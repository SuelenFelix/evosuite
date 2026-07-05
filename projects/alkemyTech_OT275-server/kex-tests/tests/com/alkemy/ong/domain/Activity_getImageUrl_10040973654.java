package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Activity_getImageUrl_10040973654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6234;

    public Activity_getImageUrl_10040973654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6235 = new Long(1667122142089513324L);
        term6234 = newInstance(Class.forName("com.alkemy.ong.domain.Activity"));
        setField(term6234, term6234.getClass(), "id", term6235);
        setField(term6234, term6234.getClass(), "content", "jlraKkBWFA");
        setField(term6234, term6234.getClass(), "imageUrl", "mRBtFTxVdE");
        setField(term6234, term6234.getClass(), "name", "IVacFDAZcj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Activity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term6234, args);
    }

};


