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
import java.lang.Float;

public class SubmittedHoursByProjectsDto_setSubmittedHours_19207430620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29301;
     Object term29305;

    public SubmittedHoursByProjectsDto_setSubmittedHours_19207430620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29301 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByProjectsDto"));
        setIntField(term29301, term29301.getClass(), "projectId", 0);
        setField(term29301, term29301.getClass(), "projectName", null);
        setFloatField(term29301, term29301.getClass(), "submittedHours", 0.0F);
        setFloatField(term29301, term29301.getClass(), "totalHours", 0.0F);
        term29305 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term29305;
        callMethod(klass, "setSubmittedHours", argTypes, term29301, args);
    }

};


