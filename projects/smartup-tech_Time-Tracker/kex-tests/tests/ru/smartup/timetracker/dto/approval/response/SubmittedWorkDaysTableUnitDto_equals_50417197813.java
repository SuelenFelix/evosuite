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

public class SubmittedWorkDaysTableUnitDto_equals_50417197813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28425;
     Object term28519;

    public SubmittedWorkDaysTableUnitDto_equals_50417197813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28453 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term28454 = newInstance(Class.forName("java.util.Date"));
        setLongField(term28454, term28454.getClass(), "fastTime", 1585770433121L);
        setField(term28454, term28454.getClass(), "cdate", null);
        setField(term28453, term28453.getClass(), "date", term28454);
        setFloatField(term28453, term28453.getClass(), "hours", 0.21757495F);
        ArrayList term28451 = new ArrayList();
        ((ArrayList) term28451).add(term28453);
        ArrayList term28466 = new ArrayList();
        ((ArrayList) term28466).add((Object)null);
        ((ArrayList) term28466).add((Object)null);
        ((ArrayList) term28466).add((Object)null);
        ((ArrayList) term28466).add((Object)null);
        ((ArrayList) term28466).add((Object)null);
        ((ArrayList) term28466).add((Object)null);
        Object term28461 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term28461, term28461.getClass(), "projectId", -525257914);
        setField(term28461, term28461.getClass(), "projectName", "");
        setLongField(term28461, term28461.getClass(), "taskId", -4146453776626172590L);
        setField(term28461, term28461.getClass(), "taskName", "");
        setField(term28461, term28461.getClass(), "trackUnits", term28466);
        ArrayList term28474 = new ArrayList();
        ((ArrayList) term28474).add((Object)null);
        ((ArrayList) term28474).add((Object)null);
        ((ArrayList) term28474).add((Object)null);
        ((ArrayList) term28474).add((Object)null);
        Object term28469 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term28469, term28469.getClass(), "projectId", 147209682);
        setField(term28469, term28469.getClass(), "projectName", "");
        setLongField(term28469, term28469.getClass(), "taskId", 6269054578518955349L);
        setField(term28469, term28469.getClass(), "taskName", "");
        setField(term28469, term28469.getClass(), "trackUnits", term28474);
        ArrayList term28482 = new ArrayList();
        ((ArrayList) term28482).add((Object)null);
        ((ArrayList) term28482).add((Object)null);
        ((ArrayList) term28482).add((Object)null);
        ((ArrayList) term28482).add((Object)null);
        ((ArrayList) term28482).add((Object)null);
        ((ArrayList) term28482).add((Object)null);
        Object term28477 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term28477, term28477.getClass(), "projectId", 34470066);
        setField(term28477, term28477.getClass(), "projectName", "");
        setLongField(term28477, term28477.getClass(), "taskId", 8847748922379375307L);
        setField(term28477, term28477.getClass(), "taskName", "");
        setField(term28477, term28477.getClass(), "trackUnits", term28482);
        ArrayList term28490 = new ArrayList();
        ((ArrayList) term28490).add((Object)null);
        ((ArrayList) term28490).add((Object)null);
        ((ArrayList) term28490).add((Object)null);
        Object term28485 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term28485, term28485.getClass(), "projectId", 2058711405);
        setField(term28485, term28485.getClass(), "projectName", "");
        setLongField(term28485, term28485.getClass(), "taskId", 1350676497718116574L);
        setField(term28485, term28485.getClass(), "taskName", "");
        setField(term28485, term28485.getClass(), "trackUnits", term28490);
        ArrayList term28498 = new ArrayList();
        ((ArrayList) term28498).add((Object)null);
        ((ArrayList) term28498).add((Object)null);
        ((ArrayList) term28498).add((Object)null);
        ((ArrayList) term28498).add((Object)null);
        ((ArrayList) term28498).add((Object)null);
        ((ArrayList) term28498).add((Object)null);
        Object term28493 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term28493, term28493.getClass(), "projectId", 1743683601);
        setField(term28493, term28493.getClass(), "projectName", "");
        setLongField(term28493, term28493.getClass(), "taskId", -4477377284889705897L);
        setField(term28493, term28493.getClass(), "taskName", "");
        setField(term28493, term28493.getClass(), "trackUnits", term28498);
        ArrayList term28506 = new ArrayList();
        ((ArrayList) term28506).add((Object)null);
        ((ArrayList) term28506).add((Object)null);
        ((ArrayList) term28506).add((Object)null);
        ((ArrayList) term28506).add((Object)null);
        ((ArrayList) term28506).add((Object)null);
        ((ArrayList) term28506).add((Object)null);
        ((ArrayList) term28506).add((Object)null);
        Object term28501 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term28501, term28501.getClass(), "projectId", -945116798);
        setField(term28501, term28501.getClass(), "projectName", "");
        setLongField(term28501, term28501.getClass(), "taskId", 6323132402520425961L);
        setField(term28501, term28501.getClass(), "taskName", "");
        setField(term28501, term28501.getClass(), "trackUnits", term28506);
        ArrayList term28514 = new ArrayList();
        Object term28509 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term28509, term28509.getClass(), "projectId", 1593461795);
        setField(term28509, term28509.getClass(), "projectName", "");
        setLongField(term28509, term28509.getClass(), "taskId", -354905832180781372L);
        setField(term28509, term28509.getClass(), "taskName", "");
        setField(term28509, term28509.getClass(), "trackUnits", term28514);
        ArrayList term28459 = new ArrayList();
        ((ArrayList) term28459).add(term28461);
        ((ArrayList) term28459).add(term28469);
        ((ArrayList) term28459).add(term28477);
        ((ArrayList) term28459).add(term28485);
        ((ArrayList) term28459).add(term28493);
        ((ArrayList) term28459).add(term28501);
        ((ArrayList) term28459).add(term28509);
        term28425 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term28425, term28425.getClass(), "employeeId", 49950830);
        setField(term28425, term28425.getClass(), "firstName", "XMHwbfiHRl");
        setField(term28425, term28425.getClass(), "lastName", "bucTnYicnp");
        setField(term28425, term28425.getClass(), "summaryTrackUnits", term28451);
        setField(term28425, term28425.getClass(), "projectTrackUnits", term28459);
        term28519 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term28519;
        callMethod(klass, "equals", argTypes, term28425, args);
    }

};


