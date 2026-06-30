package ru.smartup.timetracker.dto.approval.response;

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
import static ru.smartup.timetracker.dto.approval.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Float;

public class SubmittedWorkDayUnitDto_init_13457198130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29329;
     Object term29331;
     Object term29333;

    public SubmittedWorkDayUnitDto_init_13457198130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29329 = new Long(-4187265590402169996L);
        term29331 = newInstance(Class.forName("java.util.Date"));
        setLongField(term29331, term29331.getClass(), "fastTime", 1268663155151L);
        setField(term29331, term29331.getClass(), "cdate", null);
        term29333 = new Float(0.54699636F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.util.Date");
        argTypes[2] = float.class;
        Object[] args = new Object[3];
        args[0] = term29329;
        args[1] = term29331;
        args[2] = term29333;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


