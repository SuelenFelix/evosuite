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
import java.lang.Integer;

public class SubmittedWorkDaysTableProjectUnitDto_setProjectId_7844758596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13835;
     Object term13896;

    public SubmittedWorkDaysTableProjectUnitDto_setProjectId_7844758596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13864 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13866 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13864, term13864.getClass(), "trackUnitId", 5510783420697225605L);
        setLongField(term13866, term13866.getClass(), "fastTime", 1739417792956L);
        setField(term13866, term13866.getClass(), "cdate", null);
        setField(term13864, term13864.getClass(), "date", term13866);
        setFloatField(term13864, term13864.getClass(), "hours", 0.068145275F);
        Object term13869 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13871 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13869, term13869.getClass(), "trackUnitId", 6005241913654469005L);
        setLongField(term13871, term13871.getClass(), "fastTime", 1329640267573L);
        setField(term13871, term13871.getClass(), "cdate", null);
        setField(term13869, term13869.getClass(), "date", term13871);
        setFloatField(term13869, term13869.getClass(), "hours", 0.10667074F);
        Object term13874 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13876 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13874, term13874.getClass(), "trackUnitId", -1983291584002806658L);
        setLongField(term13876, term13876.getClass(), "fastTime", 1334853104718L);
        setField(term13876, term13876.getClass(), "cdate", null);
        setField(term13874, term13874.getClass(), "date", term13876);
        setFloatField(term13874, term13874.getClass(), "hours", 0.9571234F);
        Object term13879 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13881 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13879, term13879.getClass(), "trackUnitId", 5946780097489996391L);
        setLongField(term13881, term13881.getClass(), "fastTime", 1496859828764L);
        setField(term13881, term13881.getClass(), "cdate", null);
        setField(term13879, term13879.getClass(), "date", term13881);
        setFloatField(term13879, term13879.getClass(), "hours", 0.114929974F);
        Object term13884 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13886 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13884, term13884.getClass(), "trackUnitId", -8652538484981166496L);
        setLongField(term13886, term13886.getClass(), "fastTime", 1691868468367L);
        setField(term13886, term13886.getClass(), "cdate", null);
        setField(term13884, term13884.getClass(), "date", term13886);
        setFloatField(term13884, term13884.getClass(), "hours", 0.30926234F);
        Object term13889 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term13891 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13889, term13889.getClass(), "trackUnitId", 2701184207686293431L);
        setLongField(term13891, term13891.getClass(), "fastTime", 1442370534632L);
        setField(term13891, term13891.getClass(), "cdate", null);
        setField(term13889, term13889.getClass(), "date", term13891);
        setFloatField(term13889, term13889.getClass(), "hours", 0.37161416F);
        ArrayList term13862 = new ArrayList();
        ((ArrayList) term13862).add(term13864);
        ((ArrayList) term13862).add(term13869);
        ((ArrayList) term13862).add(term13874);
        ((ArrayList) term13862).add(term13879);
        ((ArrayList) term13862).add(term13884);
        ((ArrayList) term13862).add(term13889);
        term13835 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term13835, term13835.getClass(), "projectId", -226514366);
        setField(term13835, term13835.getClass(), "projectName", "WzMEhMXkKx");
        setLongField(term13835, term13835.getClass(), "taskId", 50358265865610362L);
        setField(term13835, term13835.getClass(), "taskName", "XOiDvlDhdc");
        setField(term13835, term13835.getClass(), "trackUnits", term13862);
        term13896 = new Integer(1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13896;
        callMethod(klass, "setProjectId", argTypes, term13835, args);
    }

};


