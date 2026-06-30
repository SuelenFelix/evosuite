package ru.smartup.timetracker.dto.report.response;

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
import static ru.smartup.timetracker.dto.report.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class ReportHoursForProjectsDto_setTotalHoursNotFrozen_119165088622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term734;
     Object term757;

    public ReportHoursForProjectsDto_setTotalHoursNotFrozen_119165088622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term734 = newInstance(Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto"));
        setIntField(term734, term734.getClass(), "projectId", -2068769794);
        setField(term734, term734.getClass(), "projectName", "xOEqzGAmDU");
        setFloatField(term734, term734.getClass(), "billableHours", 0.54697996F);
        setFloatField(term734, term734.getClass(), "billableHoursFrozen", 0.268304F);
        setFloatField(term734, term734.getClass(), "billableHoursNotFrozen", 0.6116407F);
        setFloatField(term734, term734.getClass(), "unbillableHours", 0.71719724F);
        setFloatField(term734, term734.getClass(), "unbillableHoursFrozen", 0.25674725F);
        setFloatField(term734, term734.getClass(), "unbillableHoursNotFrozen", 0.9006361F);
        setFloatField(term734, term734.getClass(), "totalHours", 0.71533775F);
        setFloatField(term734, term734.getClass(), "totalHoursFrozen", 0.5644914F);
        setFloatField(term734, term734.getClass(), "totalHoursNotFrozen", 0.6949883F);
        term757 = new Float(0.5098958F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.report.response.ReportHoursForProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term757;
        callMethod(klass, "setTotalHoursNotFrozen", argTypes, term734, args);
    }

};


