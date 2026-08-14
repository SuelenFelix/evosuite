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

public class SubmittedWorkDaysTableProjectUnitDto_getProjectName_20788919443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44145;

    public SubmittedWorkDaysTableProjectUnitDto_getProjectName_20788919443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44174 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44176 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44174, term44174.getClass(), "trackUnitId", 2848819812340321742L);
        setLongField(term44176, term44176.getClass(), "fastTime", 1437757323580L);
        setField(term44176, term44176.getClass(), "cdate", null);
        setField(term44174, term44174.getClass(), "date", term44176);
        setFloatField(term44174, term44174.getClass(), "hours", 0.12414467F);
        ArrayList term44172 = new ArrayList();
        ((ArrayList) term44172).add(term44174);
        term44145 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term44145, term44145.getClass(), "projectId", 1398204340);
        setField(term44145, term44145.getClass(), "projectName", "BWxJSgKHRT");
        setLongField(term44145, term44145.getClass(), "taskId", 4474998035090263139L);
        setField(term44145, term44145.getClass(), "taskName", "AGXoIndFnm");
        setField(term44145, term44145.getClass(), "trackUnits", term44172);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectName", argTypes, term44145, args);
    }

};


