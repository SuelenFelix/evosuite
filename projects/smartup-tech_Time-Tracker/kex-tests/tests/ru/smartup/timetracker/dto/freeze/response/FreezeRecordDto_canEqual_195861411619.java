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

public class FreezeRecordDto_canEqual_195861411619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5520;

    public FreezeRecordDto_canEqual_195861411619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5520 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto"));
        setField(term5520, term5520.getClass(), "freezeDate", null);
        setField(term5520, term5520.getClass(), "status", null);
        setField(term5520, term5520.getClass(), "employees", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.freeze.response.FreezeRecordDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term5520, args);
    }

};


