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
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class SubmittedWorkDaysTableProjectUnitDto_setTrackUnits_136915862110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14192;
     Object term14228;

    public SubmittedWorkDaysTableProjectUnitDto_setTrackUnits_136915862110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14221 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14223 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14221, term14221.getClass(), "trackUnitId", 2354625302846375590L);
        setLongField(term14223, term14223.getClass(), "fastTime", 1741444563811L);
        setField(term14223, term14223.getClass(), "cdate", null);
        setField(term14221, term14221.getClass(), "date", term14223);
        setFloatField(term14221, term14221.getClass(), "hours", 0.52792794F);
        ArrayList term14219 = new ArrayList();
        ((ArrayList) term14219).add(term14221);
        term14192 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term14192, term14192.getClass(), "projectId", -1145578966);
        setField(term14192, term14192.getClass(), "projectName", "xJgPlLxpgC");
        setLongField(term14192, term14192.getClass(), "taskId", -5786861555969446503L);
        setField(term14192, term14192.getClass(), "taskName", "EYtfuJaxiM");
        setField(term14192, term14192.getClass(), "trackUnits", term14219);
        term14228 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term14228;
        callMethod(klass, "setTrackUnits", argTypes, term14192, args);
    }

};


