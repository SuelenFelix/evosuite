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

public class SubmittedWorkDaysTableProjectUnitDto_setProjectName_19758411287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13918;

    public SubmittedWorkDaysTableProjectUnitDto_setProjectName_19758411287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13947 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13949 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13947, term13947.getClass(), "trackUnitId", 2848819812340321742L);
        setLongField(term13949, term13949.getClass(), "fastTime", 1659994192918L);
        setField(term13949, term13949.getClass(), "cdate", null);
        setField(term13947, term13947.getClass(), "date", term13949);
        setFloatField(term13947, term13947.getClass(), "hours", 0.022591352F);
        Object term13952 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13954 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13952, term13952.getClass(), "trackUnitId", -8876856890348836498L);
        setLongField(term13954, term13954.getClass(), "fastTime", 1876872800559L);
        setField(term13954, term13954.getClass(), "cdate", null);
        setField(term13952, term13952.getClass(), "date", term13954);
        setFloatField(term13952, term13952.getClass(), "hours", 0.6805867F);
        ArrayList term13945 = new ArrayList();
        ((ArrayList) term13945).add(term13947);
        ((ArrayList) term13945).add(term13952);
        term13918 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term13918, term13918.getClass(), "projectId", -1087774327);
        setField(term13918, term13918.getClass(), "projectName", "AdxvLJhNLe");
        setLongField(term13918, term13918.getClass(), "taskId", 4474998035090263139L);
        setField(term13918, term13918.getClass(), "taskName", "lHfTrWKMPk");
        setField(term13918, term13918.getClass(), "trackUnits", term13945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDaAnsVTGV";
        callMethod(klass, "setProjectName", argTypes, term13918, args);
    }

};


