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

public class SubmittedWorkDaysTableProjectUnitDto_hashCode_152829280014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44995;

    public SubmittedWorkDaysTableProjectUnitDto_hashCode_152829280014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45024 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term45026 = newInstance(Class.forName("java.util.Date"));
        setLongField(term45024, term45024.getClass(), "trackUnitId", 8166095254618543564L);
        setLongField(term45026, term45026.getClass(), "fastTime", 1332871705432L);
        setField(term45026, term45026.getClass(), "cdate", null);
        setField(term45024, term45024.getClass(), "date", term45026);
        setFloatField(term45024, term45024.getClass(), "hours", 0.23823452F);
        Object term45029 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term45031 = newInstance(Class.forName("java.util.Date"));
        setLongField(term45029, term45029.getClass(), "trackUnitId", -4598158870068953328L);
        setLongField(term45031, term45031.getClass(), "fastTime", 1597233967116L);
        setField(term45031, term45031.getClass(), "cdate", null);
        setField(term45029, term45029.getClass(), "date", term45031);
        setFloatField(term45029, term45029.getClass(), "hours", 0.25258613F);
        Object term45034 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term45036 = newInstance(Class.forName("java.util.Date"));
        setLongField(term45034, term45034.getClass(), "trackUnitId", 138235087558060686L);
        setLongField(term45036, term45036.getClass(), "fastTime", 1276505397937L);
        setField(term45036, term45036.getClass(), "cdate", null);
        setField(term45034, term45034.getClass(), "date", term45036);
        setFloatField(term45034, term45034.getClass(), "hours", 0.6037093F);
        Object term45039 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term45041 = newInstance(Class.forName("java.util.Date"));
        setLongField(term45039, term45039.getClass(), "trackUnitId", 5381386339318883012L);
        setLongField(term45041, term45041.getClass(), "fastTime", 1278177575793L);
        setField(term45041, term45041.getClass(), "cdate", null);
        setField(term45039, term45039.getClass(), "date", term45041);
        setFloatField(term45039, term45039.getClass(), "hours", 0.78008145F);
        Object term45044 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term45046 = newInstance(Class.forName("java.util.Date"));
        setLongField(term45044, term45044.getClass(), "trackUnitId", -1333707622307134180L);
        setLongField(term45046, term45046.getClass(), "fastTime", 1272776321768L);
        setField(term45046, term45046.getClass(), "cdate", null);
        setField(term45044, term45044.getClass(), "date", term45046);
        setFloatField(term45044, term45044.getClass(), "hours", 0.48050702F);
        Object term45049 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term45051 = newInstance(Class.forName("java.util.Date"));
        setLongField(term45049, term45049.getClass(), "trackUnitId", -4360569253593381888L);
        setLongField(term45051, term45051.getClass(), "fastTime", 1597352397295L);
        setField(term45051, term45051.getClass(), "cdate", null);
        setField(term45049, term45049.getClass(), "date", term45051);
        setFloatField(term45049, term45049.getClass(), "hours", 0.38612437F);
        ArrayList term45022 = new ArrayList();
        ((ArrayList) term45022).add(term45024);
        ((ArrayList) term45022).add(term45029);
        ((ArrayList) term45022).add(term45034);
        ((ArrayList) term45022).add(term45039);
        ((ArrayList) term45022).add(term45044);
        ((ArrayList) term45022).add(term45049);
        term44995 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term44995, term44995.getClass(), "projectId", 663292551);
        setField(term44995, term44995.getClass(), "projectName", "VoghngXfsK");
        setLongField(term44995, term44995.getClass(), "taskId", -6301101997917060727L);
        setField(term44995, term44995.getClass(), "taskName", "GbahCBMvct");
        setField(term44995, term44995.getClass(), "trackUnits", term45022);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term44995, args);
    }

};


