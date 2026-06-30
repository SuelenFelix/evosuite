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

public class SubmittedWorkDaysTableUnitDto_toString_45527438716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28805;

    public SubmittedWorkDaysTableUnitDto_toString_45527438716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28833 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term28834 = newInstance(Class.forName("java.util.Date"));
        setLongField(term28834, term28834.getClass(), "fastTime", 1462334405893L);
        setField(term28834, term28834.getClass(), "cdate", null);
        setField(term28833, term28833.getClass(), "date", term28834);
        setFloatField(term28833, term28833.getClass(), "hours", 0.0048968196F);
        Object term28837 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term28838 = newInstance(Class.forName("java.util.Date"));
        setLongField(term28838, term28838.getClass(), "fastTime", 1841185970410L);
        setField(term28838, term28838.getClass(), "cdate", null);
        setField(term28837, term28837.getClass(), "date", term28838);
        setFloatField(term28837, term28837.getClass(), "hours", 0.9113409F);
        Object term28841 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term28842 = newInstance(Class.forName("java.util.Date"));
        setLongField(term28842, term28842.getClass(), "fastTime", 1841243746236L);
        setField(term28842, term28842.getClass(), "cdate", null);
        setField(term28841, term28841.getClass(), "date", term28842);
        setFloatField(term28841, term28841.getClass(), "hours", 0.07447153F);
        Object term28845 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedSummaryWorkDay"));
        Object term28846 = newInstance(Class.forName("java.util.Date"));
        setLongField(term28846, term28846.getClass(), "fastTime", 1879363930046L);
        setField(term28846, term28846.getClass(), "cdate", null);
        setField(term28845, term28845.getClass(), "date", term28846);
        setFloatField(term28845, term28845.getClass(), "hours", 0.7444535F);
        ArrayList term28831 = new ArrayList();
        ((ArrayList) term28831).add(term28833);
        ((ArrayList) term28831).add(term28837);
        ((ArrayList) term28831).add(term28841);
        ((ArrayList) term28831).add(term28845);
        ArrayList term28858 = new ArrayList();
        ((ArrayList) term28858).add((Object)null);
        Object term28853 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term28853, term28853.getClass(), "projectId", -1533843432);
        setField(term28853, term28853.getClass(), "projectName", "");
        setLongField(term28853, term28853.getClass(), "taskId", -3271370917942710167L);
        setField(term28853, term28853.getClass(), "taskName", "");
        setField(term28853, term28853.getClass(), "trackUnits", term28858);
        ArrayList term28866 = new ArrayList();
        ((ArrayList) term28866).add((Object)null);
        ((ArrayList) term28866).add((Object)null);
        ((ArrayList) term28866).add((Object)null);
        ((ArrayList) term28866).add((Object)null);
        ((ArrayList) term28866).add((Object)null);
        ((ArrayList) term28866).add((Object)null);
        ((ArrayList) term28866).add((Object)null);
        ((ArrayList) term28866).add((Object)null);
        ((ArrayList) term28866).add((Object)null);
        Object term28861 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term28861, term28861.getClass(), "projectId", -123338791);
        setField(term28861, term28861.getClass(), "projectName", "");
        setLongField(term28861, term28861.getClass(), "taskId", 4628458998884457238L);
        setField(term28861, term28861.getClass(), "taskName", "");
        setField(term28861, term28861.getClass(), "trackUnits", term28866);
        ArrayList term28874 = new ArrayList();
        ((ArrayList) term28874).add((Object)null);
        ((ArrayList) term28874).add((Object)null);
        ((ArrayList) term28874).add((Object)null);
        ((ArrayList) term28874).add((Object)null);
        ((ArrayList) term28874).add((Object)null);
        ((ArrayList) term28874).add((Object)null);
        ((ArrayList) term28874).add((Object)null);
        ((ArrayList) term28874).add((Object)null);
        ((ArrayList) term28874).add((Object)null);
        Object term28869 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term28869, term28869.getClass(), "projectId", -1467089634);
        setField(term28869, term28869.getClass(), "projectName", "");
        setLongField(term28869, term28869.getClass(), "taskId", 3951346165629352117L);
        setField(term28869, term28869.getClass(), "taskName", "");
        setField(term28869, term28869.getClass(), "trackUnits", term28874);
        ArrayList term28851 = new ArrayList();
        ((ArrayList) term28851).add(term28853);
        ((ArrayList) term28851).add(term28861);
        ((ArrayList) term28851).add(term28869);
        term28805 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto"));
        setIntField(term28805, term28805.getClass(), "employeeId", -43417861);
        setField(term28805, term28805.getClass(), "firstName", "VePIumgrrU");
        setField(term28805, term28805.getClass(), "lastName", "DPwIqlszZo");
        setField(term28805, term28805.getClass(), "summaryTrackUnits", term28831);
        setField(term28805, term28805.getClass(), "projectTrackUnits", term28851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term28805, args);
    }

};


