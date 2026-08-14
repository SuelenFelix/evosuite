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

public class SubmittedWorkDaysTableProjectUnitDto_setProjectName_19758411288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44482;

    public SubmittedWorkDaysTableProjectUnitDto_setProjectName_19758411288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44511 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44513 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44511, term44511.getClass(), "trackUnitId", -3936701866695933852L);
        setLongField(term44513, term44513.getClass(), "fastTime", 1659994192918L);
        setField(term44513, term44513.getClass(), "cdate", null);
        setField(term44511, term44511.getClass(), "date", term44513);
        setFloatField(term44511, term44511.getClass(), "hours", 0.19656086F);
        Object term44516 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44518 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44516, term44516.getClass(), "trackUnitId", 1215116475929634177L);
        setLongField(term44518, term44518.getClass(), "fastTime", 1876872800559L);
        setField(term44518, term44518.getClass(), "cdate", null);
        setField(term44516, term44516.getClass(), "date", term44518);
        setFloatField(term44516, term44516.getClass(), "hours", 0.99575853F);
        Object term44521 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44523 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44521, term44521.getClass(), "trackUnitId", 1597484336218508869L);
        setLongField(term44523, term44523.getClass(), "fastTime", 1304532099366L);
        setField(term44523, term44523.getClass(), "cdate", null);
        setField(term44521, term44521.getClass(), "date", term44523);
        setFloatField(term44521, term44521.getClass(), "hours", 0.5778128F);
        Object term44526 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44528 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44526, term44526.getClass(), "trackUnitId", -685023850445639859L);
        setLongField(term44528, term44528.getClass(), "fastTime", 1488725902101L);
        setField(term44528, term44528.getClass(), "cdate", null);
        setField(term44526, term44526.getClass(), "date", term44528);
        setFloatField(term44526, term44526.getClass(), "hours", 0.16755807F);
        ArrayList term44509 = new ArrayList();
        ((ArrayList) term44509).add(term44511);
        ((ArrayList) term44509).add(term44516);
        ((ArrayList) term44509).add(term44521);
        ((ArrayList) term44509).add(term44526);
        term44482 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term44482, term44482.getClass(), "projectId", -2014576105);
        setField(term44482, term44482.getClass(), "projectName", "XebAeSnCKZ");
        setLongField(term44482, term44482.getClass(), "taskId", 7276637106827860087L);
        setField(term44482, term44482.getClass(), "taskName", "GeddnXjHGy");
        setField(term44482, term44482.getClass(), "trackUnits", term44509);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vLTbaoAxBm";
        callMethod(klass, "setProjectName", argTypes, term44482, args);
    }

};


