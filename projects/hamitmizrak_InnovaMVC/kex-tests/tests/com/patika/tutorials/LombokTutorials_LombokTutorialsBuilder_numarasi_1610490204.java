package com.patika.tutorials;

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
import static com.patika.tutorials.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LombokTutorials_LombokTutorialsBuilder_numarasi_1610490204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3774;

    public LombokTutorials_LombokTutorialsBuilder_numarasi_1610490204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3774 = newInstance(Class.forName("com.patika.tutorials.LombokTutorials$LombokTutorialsBuilder"));
        setField(term3774, term3774.getClass(), "adi", "BKLfkLiZTH");
        setField(term3774, term3774.getClass(), "soyadi", "SPpkrGcPRr");
        setField(term3774, term3774.getClass(), "numarasi", "sEccwbJKYE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.patika.tutorials.LombokTutorials$LombokTutorialsBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AWRooQKkdW";
        callMethod(klass, "numarasi", argTypes, term3774, args);
    }

};


