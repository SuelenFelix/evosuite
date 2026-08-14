package com.patika.model;

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
import static com.patika.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WriterDto_WriterDtoBuilder_writerSurname_15154366769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6728;

    public WriterDto_WriterDtoBuilder_writerSurname_15154366769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6728 = newInstance(Class.forName("com.patika.model.WriterDto$WriterDtoBuilder"));
        setField(term6728, term6728.getClass(), "writerName", null);
        setField(term6728, term6728.getClass(), "writerSurname", null);
        setField(term6728, term6728.getClass(), "writerAddress", null);
        setDoubleField(term6728, term6728.getClass(), "writerTelephoneNumber", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto$WriterDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writerSurname", argTypes, term6728, args);
    }

};


