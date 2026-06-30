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

public class SubmittedWorkDaysTableUnitDto_getSummaryTrackUnits_11769670586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27544;

    public SubmittedWorkDaysTableUnitDto_getSummaryTrackUnits_11769670586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27572 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27573 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27573, term27573.getClass(), "fastTime", 1502420909766L);
        setField(term27573, term27573.getClass(), "cdate", null);
        setField(term27572, term27572.getClass(), "date", term27573);
        setFloatField(term27572, term27572.getClass(), "hours", 0.6117589F);
        ArrayList term27570 = new ArrayList();
        ((ArrayList) term27570).add(term27572);
        ArrayList term27585 = new ArrayList();
        ((ArrayList) term27585).add((Object)null);
        ((ArrayList) term27585).add((Object)null);
        ((ArrayList) term27585).add((Object)null);
        Object term27580 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27580, term27580.getClass(), "projectId", 937859191);
        setField(term27580, term27580.getClass(), "projectName", "");
        setLongField(term27580, term27580.getClass(), "taskId", -8692119547314358088L);
        setField(term27580, term27580.getClass(), "taskName", "");
        setField(term27580, term27580.getClass(), "trackUnits", term27585);
        ArrayList term27593 = new ArrayList();
        ((ArrayList) term27593).add((Object)null);
        ((ArrayList) term27593).add((Object)null);
        ((ArrayList) term27593).add((Object)null);
        ((ArrayList) term27593).add((Object)null);
        Object term27588 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27588, term27588.getClass(), "projectId", -916584829);
        setField(term27588, term27588.getClass(), "projectName", "");
        setLongField(term27588, term27588.getClass(), "taskId", -5534222035915952617L);
        setField(term27588, term27588.getClass(), "taskName", "");
        setField(term27588, term27588.getClass(), "trackUnits", term27593);
        ArrayList term27601 = new ArrayList();
        ((ArrayList) term27601).add((Object)null);
        Object term27596 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27596, term27596.getClass(), "projectId", -2131181468);
        setField(term27596, term27596.getClass(), "projectName", "");
        setLongField(term27596, term27596.getClass(), "taskId", 6895382576300001141L);
        setField(term27596, term27596.getClass(), "taskName", "");
        setField(term27596, term27596.getClass(), "trackUnits", term27601);
        ArrayList term27609 = new ArrayList();
        ((ArrayList) term27609).add((Object)null);
        ((ArrayList) term27609).add((Object)null);
        ((ArrayList) term27609).add((Object)null);
        ((ArrayList) term27609).add((Object)null);
        ((ArrayList) term27609).add((Object)null);
        ((ArrayList) term27609).add((Object)null);
        Object term27604 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27604, term27604.getClass(), "projectId", 282916351);
        setField(term27604, term27604.getClass(), "projectName", "");
        setLongField(term27604, term27604.getClass(), "taskId", -7400951017937830861L);
        setField(term27604, term27604.getClass(), "taskName", "");
        setField(term27604, term27604.getClass(), "trackUnits", term27609);
        ArrayList term27617 = new ArrayList();
        ((ArrayList) term27617).add((Object)null);
        ((ArrayList) term27617).add((Object)null);
        ((ArrayList) term27617).add((Object)null);
        ((ArrayList) term27617).add((Object)null);
        ((ArrayList) term27617).add((Object)null);
        Object term27612 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27612, term27612.getClass(), "projectId", 880977281);
        setField(term27612, term27612.getClass(), "projectName", "");
        setLongField(term27612, term27612.getClass(), "taskId", -7283193381993602128L);
        setField(term27612, term27612.getClass(), "taskName", "");
        setField(term27612, term27612.getClass(), "trackUnits", term27617);
        ArrayList term27578 = new ArrayList();
        ((ArrayList) term27578).add(term27580);
        ((ArrayList) term27578).add(term27588);
        ((ArrayList) term27578).add(term27596);
        ((ArrayList) term27578).add(term27604);
        ((ArrayList) term27578).add(term27612);
        term27544 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term27544, term27544.getClass(), "employeeId", 1694224101);
        setField(term27544, term27544.getClass(), "firstName", "JWodNQzjjV");
        setField(term27544, term27544.getClass(), "lastName", "CAgxWjhxNf");
        setField(term27544, term27544.getClass(), "summaryTrackUnits", term27570);
        setField(term27544, term27544.getClass(), "projectTrackUnits", term27578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSummaryTrackUnits", argTypes, term27544, args);
    }

};


