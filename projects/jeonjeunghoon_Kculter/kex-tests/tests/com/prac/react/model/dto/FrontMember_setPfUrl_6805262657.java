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

public class FrontMember_setPfUrl_6805262657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9244;

    public FrontMember_setPfUrl_6805262657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9244 = newInstance(Class.forName("com.prac.react.model.dto.FrontMember"));
        setField(term9244, term9244.getClass(), "memberHash", "sOdkipUKRu");
        setField(term9244, term9244.getClass(), "memberName", "oKwCDqywym");
        setField(term9244, term9244.getClass(), "pfUrl", "zjZYTddemL");
        setField(term9244, term9244.getClass(), "mgHash", "QtrylgCLiF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.FrontMember");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "orEuhCStGM";
        callMethod(klass, "setPfUrl", argTypes, term9244, args);
    }

};


