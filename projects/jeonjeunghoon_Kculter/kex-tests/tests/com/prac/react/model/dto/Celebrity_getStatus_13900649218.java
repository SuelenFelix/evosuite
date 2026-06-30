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

public class Celebrity_getStatus_13900649218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16581;

    public Celebrity_getStatus_13900649218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16581 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term16581, term16581.getClass(), "keyNum", -1703035419);
        setField(term16581, term16581.getClass(), "name", "WWyLFmYpAy");
        setIntField(term16581, term16581.getClass(), "likeCount", 765766290);
        setIntField(term16581, term16581.getClass(), "status", -1284825282);
        setField(term16581, term16581.getClass(), "explain", "vbSWeJWOQh");
        setField(term16581, term16581.getClass(), "fileUrl", "hyvFdAvkOr");
        setField(term16581, term16581.getClass(), "keyHash", "ewbQRtustW");
        setIntField(term16581, term16581.getClass(), "spot", -1941343035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term16581, args);
    }

};


