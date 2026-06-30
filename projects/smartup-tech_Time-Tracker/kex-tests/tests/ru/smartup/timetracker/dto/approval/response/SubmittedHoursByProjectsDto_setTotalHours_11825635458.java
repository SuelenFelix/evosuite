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

public class SubmittedHoursByProjectsDto_setTotalHours_11825635458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29141;
     Object term29157;

    public SubmittedHoursByProjectsDto_setTotalHours_11825635458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29141 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByProjectsDto"));
        setIntField(term29141, term29141.getClass(), "projectId", 574481092);
        setField(term29141, term29141.getClass(), "projectName", "ZLQamJFBmu");
        setFloatField(term29141, term29141.getClass(), "submittedHours", 0.11979389F);
        setFloatField(term29141, term29141.getClass(), "totalHours", 0.39897245F);
        term29157 = new Float(0.4555542F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByProjectsDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term29157;
        callMethod(klass, "setTotalHours", argTypes, term29141, args);
    }

};


