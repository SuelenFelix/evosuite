package ru.smartup.timetracker.email.template.impl;

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
import static ru.smartup.timetracker.email.template.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class UnfreezeHoursTemplate_getEmployeeRegistrationTemplateGenerator_1284918012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1655;
     Object term1656;

    public UnfreezeHoursTemplate_getEmployeeRegistrationTemplateGenerator_1284918012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1655 = newInstance(Class.forName("ru.smartup.timetracker.email.template.impl.UnfreezeHoursTemplate"));
        term1656 = newInstance(Class.forName("ru.smartup.timetracker.pojo.notice.NoticeUnfreeze"));
        Object term1657 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1657, term1657.getClass(), "year", 2012);
        setShortField(term1657, term1657.getClass(), "month", (short) 8);
        setShortField(term1657, term1657.getClass(), "day", (short) 25);
        setField(term1656, term1656.getClass(), "unfreezeRecordDate", term1657);
        setField(term1656, term1656.getClass(), "freezeDate", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.email.template.impl.UnfreezeHoursTemplate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.pojo.notice.NoticeUnfreeze");
        Object[] args = new Object[1];
        args[0] = term1656;
        callMethod(klass, "getEmployeeRegistrationTemplateGenerator", argTypes, term1655, args);
    }

};


