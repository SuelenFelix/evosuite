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

public class SubmittedWorkDaysTableUnitDto_hashCode_5548530332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28929;

    public SubmittedWorkDaysTableUnitDto_hashCode_5548530332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28929 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term28929, term28929.getClass(), "employeeId", 0);
        setField(term28929, term28929.getClass(), "firstName", null);
        setField(term28929, term28929.getClass(), "lastName", null);
        setField(term28929, term28929.getClass(), "summaryTrackUnits", null);
        setField(term28929, term28929.getClass(), "projectTrackUnits", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term28929, args);
    }

};


