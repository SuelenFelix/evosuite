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

public class SubmittedWorkDaysTableProjectUnitDto_getTaskName_9924130404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13708;

    public SubmittedWorkDaysTableProjectUnitDto_getTaskName_9924130404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13737 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13739 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13737, term13737.getClass(), "trackUnitId", 6682528376118987775L);
        setLongField(term13739, term13739.getClass(), "fastTime", 1538078916394L);
        setField(term13739, term13739.getClass(), "cdate", null);
        setField(term13737, term13737.getClass(), "date", term13739);
        setFloatField(term13737, term13737.getClass(), "hours", 0.38000882F);
        Object term13742 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13744 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13742, term13742.getClass(), "trackUnitId", 682356318767179819L);
        setLongField(term13744, term13744.getClass(), "fastTime", 1744090065937L);
        setField(term13744, term13744.getClass(), "cdate", null);
        setField(term13742, term13742.getClass(), "date", term13744);
        setFloatField(term13742, term13742.getClass(), "hours", 0.10577053F);
        Object term13747 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13749 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13747, term13747.getClass(), "trackUnitId", -7291743527973326814L);
        setLongField(term13749, term13749.getClass(), "fastTime", 1347400561385L);
        setField(term13749, term13749.getClass(), "cdate", null);
        setField(term13747, term13747.getClass(), "date", term13749);
        setFloatField(term13747, term13747.getClass(), "hours", 0.5840714F);
        Object term13752 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13754 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13752, term13752.getClass(), "trackUnitId", -5963439350418910964L);
        setLongField(term13754, term13754.getClass(), "fastTime", 1502158153899L);
        setField(term13754, term13754.getClass(), "cdate", null);
        setField(term13752, term13752.getClass(), "date", term13754);
        setFloatField(term13752, term13752.getClass(), "hours", 0.478669F);
        ArrayList term13735 = new ArrayList();
        ((ArrayList) term13735).add(term13737);
        ((ArrayList) term13735).add(term13742);
        ((ArrayList) term13735).add(term13747);
        ((ArrayList) term13735).add(term13752);
        term13708 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term13708, term13708.getClass(), "projectId", -1179120542);
        setField(term13708, term13708.getClass(), "projectName", "pORebkoRdD");
        setLongField(term13708, term13708.getClass(), "taskId", 41775768178052008L);
        setField(term13708, term13708.getClass(), "taskName", "mXGCWJDOqA");
        setField(term13708, term13708.getClass(), "trackUnits", term13735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskName", argTypes, term13708, args);
    }

};


