package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SubmittedWorkDaysForEmployees_getTrackUnitHours_127747616210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56851;

    public SubmittedWorkDaysForEmployees_getTrackUnitHours_127747616210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56851 = newInstance(Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees"));
        Object term56877 = newInstance(Class.forName("java.util.Date"));
        setIntField(term56851, term56851.getClass(), "employeeId", 1152356969);
        setField(term56851, term56851.getClass(), "firstName", "VoghngXfsK");
        setField(term56851, term56851.getClass(), "lastName", "GbahCBMvct");
        setLongField(term56877, term56877.getClass(), "fastTime", 1818968525805L);
        setField(term56877, term56877.getClass(), "cdate", null);
        setField(term56851, term56851.getClass(), "trackUnitWorkDay", term56877);
        setIntField(term56851, term56851.getClass(), "projectId", -1667990367);
        setField(term56851, term56851.getClass(), "projectName", "iiHBhsNFgk");
        setLongField(term56851, term56851.getClass(), "trackUnitId", -6587807377747738663L);
        setLongField(term56851, term56851.getClass(), "taskId", -6301101997917060727L);
        setField(term56851, term56851.getClass(), "taskName", "HknsTajwxJ");
        setFloatField(term56851, term56851.getClass(), "trackUnitHours", 0.12414467F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrackUnitHours", argTypes, term56851, args);
    }

};


