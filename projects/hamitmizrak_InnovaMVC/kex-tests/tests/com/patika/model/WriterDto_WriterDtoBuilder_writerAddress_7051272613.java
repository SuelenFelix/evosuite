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

public class WriterDto_WriterDtoBuilder_writerAddress_7051272613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243;

    public WriterDto_WriterDtoBuilder_writerAddress_7051272613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243 = newInstance(Class.forName("com.patika.model.WriterDto$WriterDtoBuilder"));
        setField(term243, term243.getClass(), "writerName", "hRNSzYYIrc");
        setField(term243, term243.getClass(), "writerSurname", "RMFIsYGgne");
        setField(term243, term243.getClass(), "writerAddress", "NRdvgJlhkX");
        setDoubleField(term243, term243.getClass(), "writerTelephoneNumber", 0.5523635872663106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.WriterDto$WriterDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uuaPigETmJ";
        callMethod(klass, "writerAddress", argTypes, term243, args);
    }

};


