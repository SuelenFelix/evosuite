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

public class FrontMember_getMgHash_15265825628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9355;

    public FrontMember_getMgHash_15265825628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9355 = newInstance(Class.forName("com.prac.react.model.dto.FrontMember"));
        setField(term9355, term9355.getClass(), "memberHash", "HhEaSXWvrY");
        setField(term9355, term9355.getClass(), "memberName", "CVRGEomOth");
        setField(term9355, term9355.getClass(), "pfUrl", "vSeruUyNWX");
        setField(term9355, term9355.getClass(), "mgHash", "UkKvaeJfEC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.FrontMember");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMgHash", argTypes, term9355, args);
    }

};


