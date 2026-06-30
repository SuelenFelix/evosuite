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
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class SubmittedHoursByWeekAndProjectDto_init_16523892250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;
     Object term29;
     Object term43;
     Object enum0;
     Object term56;
     Object term58;

    public SubmittedHoursByWeekAndProjectDto_init_16523892250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Long(2442117782898005296L);
        term3 = new Integer(568599855);
        term29 = new Long(6375119433582206027L);
        term43 = new Float(0.13238746F);
        Class<? extends Object> term153 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term152 = ((Class) term153).getDeclaredField((String) "CREATED");
        ((Field) term152).setAccessible(true);
        enum0 = ((Field) term152).get((Object) null);
        term56 = new Boolean(false);
        term58 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term58, term58.getClass(), "year", 2012);
        setShortField(term58, term58.getClass(), "month", (short) 8);
        setShortField(term58, term58.getClass(), "day", (short) 25);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByWeekAndProjectDto");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = long.class;
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = float.class;
        argTypes[7] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        argTypes[8] = boolean.class;
        argTypes[9] = Class.forName("java.time.LocalDate");
        argTypes[10] = Class.forName("java.lang.String");
        Object[] args = new Object[11];
        args[0] = term1;
        args[1] = term3;
        args[2] = "PAEBtnZtTD";
        args[3] = "sjlJAEtRrb";
        args[4] = term29;
        args[5] = "MuLcgQHgqz";
        args[6] = term43;
        args[7] = enum0;
        args[8] = term56;
        args[9] = term58;
        args[10] = "xxtlPwDYFs";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


