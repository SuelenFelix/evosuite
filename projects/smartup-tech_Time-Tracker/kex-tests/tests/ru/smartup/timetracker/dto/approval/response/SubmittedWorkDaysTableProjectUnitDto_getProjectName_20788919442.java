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

public class SubmittedWorkDaysTableProjectUnitDto_getProjectName_20788919442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13571;

    public SubmittedWorkDaysTableProjectUnitDto_getProjectName_20788919442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13600 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13602 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13600, term13600.getClass(), "trackUnitId", 2062173786000223358L);
        setLongField(term13602, term13602.getClass(), "fastTime", 1863631094992L);
        setField(term13602, term13602.getClass(), "cdate", null);
        setField(term13600, term13600.getClass(), "date", term13602);
        setFloatField(term13600, term13600.getClass(), "hours", 0.96323884F);
        Object term13605 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13607 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13605, term13605.getClass(), "trackUnitId", -8658027316505137504L);
        setLongField(term13607, term13607.getClass(), "fastTime", 1882638884364L);
        setField(term13607, term13607.getClass(), "cdate", null);
        setField(term13605, term13605.getClass(), "date", term13607);
        setFloatField(term13605, term13605.getClass(), "hours", 0.43692183F);
        Object term13610 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13612 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13610, term13610.getClass(), "trackUnitId", 414749984815662075L);
        setLongField(term13612, term13612.getClass(), "fastTime", 1437757323580L);
        setField(term13612, term13612.getClass(), "cdate", null);
        setField(term13610, term13610.getClass(), "date", term13612);
        setFloatField(term13610, term13610.getClass(), "hours", 0.80973893F);
        Object term13615 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13617 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13615, term13615.getClass(), "trackUnitId", 463622836963501975L);
        setLongField(term13617, term13617.getClass(), "fastTime", 1668569229825L);
        setField(term13617, term13617.getClass(), "cdate", null);
        setField(term13615, term13615.getClass(), "date", term13617);
        setFloatField(term13615, term13615.getClass(), "hours", 0.7633268F);
        ArrayList term13598 = new ArrayList();
        ((ArrayList) term13598).add(term13600);
        ((ArrayList) term13598).add(term13605);
        ((ArrayList) term13598).add(term13610);
        ((ArrayList) term13598).add(term13615);
        term13571 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term13571, term13571.getClass(), "projectId", -244121226);
        setField(term13571, term13571.getClass(), "projectName", "yGtHPyvYiQ");
        setLongField(term13571, term13571.getClass(), "taskId", -1610676979013636850L);
        setField(term13571, term13571.getClass(), "taskName", "MvRIxilFMJ");
        setField(term13571, term13571.getClass(), "trackUnits", term13598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectName", argTypes, term13571, args);
    }

};


