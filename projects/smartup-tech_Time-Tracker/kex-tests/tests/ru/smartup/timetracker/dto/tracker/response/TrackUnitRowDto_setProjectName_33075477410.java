package ru.smartup.timetracker.dto.tracker.response;

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
import static ru.smartup.timetracker.dto.tracker.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TrackUnitRowDto_setProjectName_33075477410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5081;

    public TrackUnitRowDto_setProjectName_33075477410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5112 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term5114 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term5112, term5112.getClass(), "id", -8654565919063661957L);
        setLongField(term5114, term5114.getClass(), "fastTime", 1395479491666L);
        setField(term5114, term5114.getClass(), "cdate", null);
        setField(term5112, term5112.getClass(), "workDay", term5114);
        setFloatField(term5112, term5112.getClass(), "hours", 0.63008493F);
        setBooleanField(term5112, term5112.getClass(), "blocked", false);
        setBooleanField(term5112, term5112.getClass(), "billable", true);
        setField(term5112, term5112.getClass(), "comment", "");
        setField(term5112, term5112.getClass(), "rejectReason", "");
        setBooleanField(term5112, term5112.getClass(), "rejected", false);
        ArrayList term5110 = new ArrayList();
        ((ArrayList) term5110).add(term5112);
        term5081 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term5081, term5081.getClass(), "employeeId", -655067527);
        setIntField(term5081, term5081.getClass(), "projectId", -6029667);
        setField(term5081, term5081.getClass(), "projectName", "wfaXBpWAUH");
        setLongField(term5081, term5081.getClass(), "taskId", 305759998609888272L);
        setField(term5081, term5081.getClass(), "taskName", "VMeAzAHwZj");
        setBooleanField(term5081, term5081.getClass(), "observed", true);
        setField(term5081, term5081.getClass(), "units", term5110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LWyEaeIyAo";
        callMethod(klass, "setProjectName", argTypes, term5081, args);
    }

};


