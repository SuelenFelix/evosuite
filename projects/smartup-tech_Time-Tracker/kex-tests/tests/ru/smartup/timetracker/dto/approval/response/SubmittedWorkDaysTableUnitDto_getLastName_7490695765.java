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

public class SubmittedWorkDaysTableUnitDto_getLastName_7490695765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27434;

    public SubmittedWorkDaysTableUnitDto_getLastName_7490695765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27462 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27463 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27463, term27463.getClass(), "fastTime", 1664732674090L);
        setField(term27463, term27463.getClass(), "cdate", null);
        setField(term27462, term27462.getClass(), "date", term27463);
        setFloatField(term27462, term27462.getClass(), "hours", 0.93280405F);
        Object term27466 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27467 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27467, term27467.getClass(), "fastTime", 1699925062576L);
        setField(term27467, term27467.getClass(), "cdate", null);
        setField(term27466, term27466.getClass(), "date", term27467);
        setFloatField(term27466, term27466.getClass(), "hours", 0.7046975F);
        Object term27470 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27471 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27471, term27471.getClass(), "fastTime", 1706636196274L);
        setField(term27471, term27471.getClass(), "cdate", null);
        setField(term27470, term27470.getClass(), "date", term27471);
        setFloatField(term27470, term27470.getClass(), "hours", 0.20434368F);
        Object term27474 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27475 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27475, term27475.getClass(), "fastTime", 1714093306769L);
        setField(term27475, term27475.getClass(), "cdate", null);
        setField(term27474, term27474.getClass(), "date", term27475);
        setFloatField(term27474, term27474.getClass(), "hours", 0.6896952F);
        Object term27478 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27479 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27479, term27479.getClass(), "fastTime", 1792469628390L);
        setField(term27479, term27479.getClass(), "cdate", null);
        setField(term27478, term27478.getClass(), "date", term27479);
        setFloatField(term27478, term27478.getClass(), "hours", 0.4131598F);
        Object term27482 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term27483 = newInstance(Class.forName("java.util.Date"));
        setLongField(term27483, term27483.getClass(), "fastTime", 1268276869683L);
        setField(term27483, term27483.getClass(), "cdate", null);
        setField(term27482, term27482.getClass(), "date", term27483);
        setFloatField(term27482, term27482.getClass(), "hours", 0.6693176F);
        ArrayList term27460 = new ArrayList();
        ((ArrayList) term27460).add(term27462);
        ((ArrayList) term27460).add(term27466);
        ((ArrayList) term27460).add(term27470);
        ((ArrayList) term27460).add(term27474);
        ((ArrayList) term27460).add(term27478);
        ((ArrayList) term27460).add(term27482);
        ArrayList term27495 = new ArrayList();
        ((ArrayList) term27495).add((Object)null);
        ((ArrayList) term27495).add((Object)null);
        ((ArrayList) term27495).add((Object)null);
        ((ArrayList) term27495).add((Object)null);
        ((ArrayList) term27495).add((Object)null);
        ((ArrayList) term27495).add((Object)null);
        Object term27490 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27490, term27490.getClass(), "projectId", -1347358701);
        setField(term27490, term27490.getClass(), "projectName", "");
        setLongField(term27490, term27490.getClass(), "taskId", 3662777917800385964L);
        setField(term27490, term27490.getClass(), "taskName", "");
        setField(term27490, term27490.getClass(), "trackUnits", term27495);
        ArrayList term27503 = new ArrayList();
        ((ArrayList) term27503).add((Object)null);
        ((ArrayList) term27503).add((Object)null);
        ((ArrayList) term27503).add((Object)null);
        ((ArrayList) term27503).add((Object)null);
        ((ArrayList) term27503).add((Object)null);
        ((ArrayList) term27503).add((Object)null);
        ((ArrayList) term27503).add((Object)null);
        Object term27498 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27498, term27498.getClass(), "projectId", 806595993);
        setField(term27498, term27498.getClass(), "projectName", "");
        setLongField(term27498, term27498.getClass(), "taskId", 7799452759993694308L);
        setField(term27498, term27498.getClass(), "taskName", "");
        setField(term27498, term27498.getClass(), "trackUnits", term27503);
        ArrayList term27511 = new ArrayList();
        ((ArrayList) term27511).add((Object)null);
        ((ArrayList) term27511).add((Object)null);
        ((ArrayList) term27511).add((Object)null);
        ((ArrayList) term27511).add((Object)null);
        ((ArrayList) term27511).add((Object)null);
        Object term27506 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27506, term27506.getClass(), "projectId", 548228925);
        setField(term27506, term27506.getClass(), "projectName", "");
        setLongField(term27506, term27506.getClass(), "taskId", -1465819833800717311L);
        setField(term27506, term27506.getClass(), "taskName", "");
        setField(term27506, term27506.getClass(), "trackUnits", term27511);
        ArrayList term27519 = new ArrayList();
        ((ArrayList) term27519).add((Object)null);
        ((ArrayList) term27519).add((Object)null);
        ((ArrayList) term27519).add((Object)null);
        ((ArrayList) term27519).add((Object)null);
        Object term27514 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term27514, term27514.getClass(), "projectId", -749861210);
        setField(term27514, term27514.getClass(), "projectName", "");
        setLongField(term27514, term27514.getClass(), "taskId", -8306611953768020559L);
        setField(term27514, term27514.getClass(), "taskName", "");
        setField(term27514, term27514.getClass(), "trackUnits", term27519);
        ArrayList term27488 = new ArrayList();
        ((ArrayList) term27488).add(term27490);
        ((ArrayList) term27488).add(term27498);
        ((ArrayList) term27488).add(term27506);
        ((ArrayList) term27488).add(term27514);
        term27434 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term27434, term27434.getClass(), "employeeId", -165587447);
        setField(term27434, term27434.getClass(), "firstName", "RTTvrwwhou");
        setField(term27434, term27434.getClass(), "lastName", "lRORwXipuk");
        setField(term27434, term27434.getClass(), "summaryTrackUnits", term27460);
        setField(term27434, term27434.getClass(), "projectTrackUnits", term27488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term27434, args);
    }

};


