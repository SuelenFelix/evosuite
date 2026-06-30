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

public class SubmittedHoursByProjectsDto_getProjectId_9722873761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28933;

    public SubmittedHoursByProjectsDto_getProjectId_9722873761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28933 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByProjectsDto"));
        setIntField(term28933, term28933.getClass(), "projectId", 413548937);
        setField(term28933, term28933.getClass(), "projectName", "lLiSiPCciB");
        setFloatField(term28933, term28933.getClass(), "submittedHours", 0.8221641F);
        setFloatField(term28933, term28933.getClass(), "totalHours", 0.28105962F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedHoursByProjectsDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectId", argTypes, term28933, args);
    }

};


