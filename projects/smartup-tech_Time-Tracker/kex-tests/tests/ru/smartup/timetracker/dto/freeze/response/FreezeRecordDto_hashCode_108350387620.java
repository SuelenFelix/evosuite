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

public class FreezeRecordDto_hashCode_108350387620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5521;

    public FreezeRecordDto_hashCode_108350387620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5521 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto"));
        setField(term5521, term5521.getClass(), "freezeDate", null);
        setField(term5521, term5521.getClass(), "status", null);
        setField(term5521, term5521.getClass(), "employees", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5521, args);
    }

};


