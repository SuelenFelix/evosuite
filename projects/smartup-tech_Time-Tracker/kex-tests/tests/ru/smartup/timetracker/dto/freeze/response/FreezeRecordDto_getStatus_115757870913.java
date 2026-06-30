package ru.smartup.timetracker.dto.freeze.response;

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
import static ru.smartup.timetracker.dto.freeze.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FreezeRecordDto_getStatus_115757870913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5514;

    public FreezeRecordDto_getStatus_115757870913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5514 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto"));
        setField(term5514, term5514.getClass(), "freezeDate", null);
        setField(term5514, term5514.getClass(), "status", null);
        setField(term5514, term5514.getClass(), "employees", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term5514, args);
    }

};


