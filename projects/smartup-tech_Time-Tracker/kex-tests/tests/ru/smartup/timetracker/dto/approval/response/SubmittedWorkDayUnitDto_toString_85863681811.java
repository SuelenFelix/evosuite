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
import java.lang.Object;

public class SubmittedWorkDayUnitDto_toString_85863681811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29388;

    public SubmittedWorkDayUnitDto_toString_85863681811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29388 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term29390 = newInstance(Class.forName("java.util.Date"));
        setLongField(term29388, term29388.getClass(), "trackUnitId", 6848008460134431064L);
        setLongField(term29390, term29390.getClass(), "fastTime", 1318227522669L);
        setField(term29390, term29390.getClass(), "cdate", null);
        setField(term29388, term29388.getClass(), "date", term29390);
        setFloatField(term29388, term29388.getClass(), "hours", 0.8399796F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term29388, args);
    }

};


