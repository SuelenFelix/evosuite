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

public class SubmittedWorkDaysTableUnitDto_canEqual_130833460731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28927;

    public SubmittedWorkDaysTableUnitDto_canEqual_130833460731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28927 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term28927, term28927.getClass(), "employeeId", 0);
        setField(term28927, term28927.getClass(), "firstName", null);
        setField(term28927, term28927.getClass(), "lastName", null);
        setField(term28927, term28927.getClass(), "summaryTrackUnits", null);
        setField(term28927, term28927.getClass(), "projectTrackUnits", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term28927, args);
    }

};


