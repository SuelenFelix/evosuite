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

public class Activity_setName_11861897669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6625;

    public Activity_setName_11861897669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6626 = new Long(-7268507582722666254L);
        term6625 = newInstance(Class.forName("com.alkemy.ong.domain.Activity"));
        setField(term6625, term6625.getClass(), "id", term6626);
        setField(term6625, term6625.getClass(), "content", "OwPIiBRuKK");
        setField(term6625, term6625.getClass(), "imageUrl", "sgfGySMODT");
        setField(term6625, term6625.getClass(), "name", "ndAITnOsny");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Activity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CVZnTiJucs";
        callMethod(klass, "setName", argTypes, term6625, args);
    }

};


