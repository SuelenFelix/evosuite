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

public class FrontMember_getMemberHash_2898573142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8755;

    public FrontMember_getMemberHash_2898573142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8755 = newInstance(Class.forName("com.prac.react.model.dto.FrontMember"));
        setField(term8755, term8755.getClass(), "memberHash", "bdyhHbDAmJ");
        setField(term8755, term8755.getClass(), "memberName", "BBXiTNHqGE");
        setField(term8755, term8755.getClass(), "pfUrl", "IEYhJmgCVd");
        setField(term8755, term8755.getClass(), "mgHash", "KSJeYkkvpk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.FrontMember");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemberHash", argTypes, term8755, args);
    }

};


