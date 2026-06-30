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
import java.lang.String;
import java.lang.Object;
import java.lang.Float;

public class MetaDayInfoDto_init_19586224991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22153;
     Object enum39;
     Object term22169;

    public MetaDayInfoDto_init_19586224991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22153 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term22153, term22153.getClass(), "year", 2020);
        setShortField(term22153, term22153.getClass(), "month", (short) 8);
        setShortField(term22153, term22153.getClass(), "day", (short) 12);
        Class<? extends Object> term22172 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term22171 = ((Class) term22172).getDeclaredField((String) "WORK_DAY");
        ((Field) term22171).setAccessible(true);
        enum39 = ((Field) term22171).get((Object) null);
        term22169 = new Float(0.4426849F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.MetaDayInfoDto");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.time.LocalDate");
        argTypes[1] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        argTypes[2] = float.class;
        Object[] args = new Object[3];
        args[0] = term22153;
        args[1] = enum39;
        args[2] = term22169;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


