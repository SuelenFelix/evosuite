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

public class FrontMember_getMemberName_4614505914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8955;

    public FrontMember_getMemberName_4614505914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8955 = newInstance(Class.forName("com.prac.react.model.dto.FrontMember"));
        setField(term8955, term8955.getClass(), "memberHash", "MgLCedQfoj");
        setField(term8955, term8955.getClass(), "memberName", "zgKiINdgNu");
        setField(term8955, term8955.getClass(), "pfUrl", "zLMTXDQHYH");
        setField(term8955, term8955.getClass(), "mgHash", "PqywFWJlpE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.FrontMember");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemberName", argTypes, term8955, args);
    }

};


