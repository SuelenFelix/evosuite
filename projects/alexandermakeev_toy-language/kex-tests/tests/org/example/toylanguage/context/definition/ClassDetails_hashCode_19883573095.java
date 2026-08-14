package org.example.toylanguage.context.definition;

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
import static org.example.toylanguage.context.definition.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class ClassDetails_hashCode_19883573095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3093;

    public ClassDetails_hashCode_19883573095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3106 = new ArrayList();
        ((ArrayList) term3106).add("TLUhUnoanK");
        ((ArrayList) term3106).add("JXyQTIyIrU");
        ((ArrayList) term3106).add("uplmRQRGWr");
        term3093 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDetails"));
        setField(term3093, term3093.getClass(), "name", "lSidZunNtu");
        setField(term3093, term3093.getClass(), "properties", term3106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.ClassDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3093, args);
    }

};


