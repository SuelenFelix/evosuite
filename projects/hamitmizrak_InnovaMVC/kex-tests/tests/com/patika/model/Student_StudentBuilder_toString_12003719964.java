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

public class Student_StudentBuilder_toString_12003719964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7909;

    public Student_StudentBuilder_toString_12003719964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7909 = newInstance(Class.forName("com.patika.model.Student$StudentBuilder"));
        setField(term7909, term7909.getClass(), "adi", "MpJsPKLTIU");
        setField(term7909, term7909.getClass(), "soyadi", "IiNCZfdouL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.model.Student$StudentBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7909, args);
    }

};


