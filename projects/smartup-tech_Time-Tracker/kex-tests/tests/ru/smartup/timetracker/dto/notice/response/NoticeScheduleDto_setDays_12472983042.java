package ru.smartup.timetracker.dto.notice.response;

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
import static ru.smartup.timetracker.dto.notice.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NoticeScheduleDto_setDays_12472983042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term19;

    public NoticeScheduleDto_setDays_12472983042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeScheduleDto"));
        int[] term14 = (int[]) newIntArray(4);
        setIntElement(term14, 0, -616727354);
        setIntElement(term14, 1, -1955890973);
        setIntElement(term14, 2, -2038273078);
        setIntElement(term14, 3, 1227103734);
        setField(term13, term13.getClass(), "days", term14);
        term19 = (int[]) newIntArray(3);
        setIntElement(term19, 0, -1339778481);
        setIntElement(term19, 1, 1725571209);
        setIntElement(term19, 2, -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeScheduleDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term19;
        callMethod(klass, "setDays", argTypes, term13, args);
    }

};


