package ru.smartup.timetracker.dto;

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
import static ru.smartup.timetracker.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ResultDto_getParams_202219020815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126126;

    public ResultDto_getParams_202219020815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126126 = newInstance(Class.forName("ru.smartup.timetracker.dto.ResultDto"));
        setBooleanField(term126126, term126126.getClass(), "success", false);
        setField(term126126, term126126.getClass(), "params", null);
        setField(term126126, term126126.getClass(), "errorCode", null);
        setField(term126126, term126126.getClass(), "errorMessage", null);
        setField(term126126, term126126.getClass(), "validationErrors", null);
        setField(term126126, term126126.getClass(), "relatedEntities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.ResultDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParams", argTypes, term126126, args);
    }

};


