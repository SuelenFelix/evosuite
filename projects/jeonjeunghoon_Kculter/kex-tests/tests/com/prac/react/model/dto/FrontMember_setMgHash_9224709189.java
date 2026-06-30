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

public class FrontMember_setMgHash_9224709189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9444;

    public FrontMember_setMgHash_9224709189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9444 = newInstance(Class.forName("com.prac.react.model.dto.FrontMember"));
        setField(term9444, term9444.getClass(), "memberHash", "WPxXsahPRq");
        setField(term9444, term9444.getClass(), "memberName", "IENRuqmwUU");
        setField(term9444, term9444.getClass(), "pfUrl", "GsWxOwXvSu");
        setField(term9444, term9444.getClass(), "mgHash", "bKBSncrMEZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.FrontMember");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "yeSXGqQExb";
        callMethod(klass, "setMgHash", argTypes, term9444, args);
    }

};


