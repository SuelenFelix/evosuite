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

public class WriterDto_WriterDtoBuilder_toString_17704565746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6658;

    public WriterDto_WriterDtoBuilder_toString_17704565746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6658 = newInstance(Class.forName("com.patika.model.WriterDto$WriterDtoBuilder"));
        setField(term6658, term6658.getClass(), "writerName", "ndAITnOsny");
        setField(term6658, term6658.getClass(), "writerSurname", "CVZnTiJucs");
        setField(term6658, term6658.getClass(), "writerAddress", "ecHEQufXoq");
        setDoubleField(term6658, term6658.getClass(), "writerTelephoneNumber", 0.2641345529914265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto$WriterDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6658, args);
    }

};


