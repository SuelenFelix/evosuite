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
import java.lang.Long;

public class SubmittedWorkDaysTableProjectUnitDto_setTaskId_1484007078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14001;
     Object term14062;

    public SubmittedWorkDaysTableProjectUnitDto_setTaskId_1484007078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14030 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14032 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14030, term14030.getClass(), "trackUnitId", 6689117472719450333L);
        setLongField(term14032, term14032.getClass(), "fastTime", 1304532099366L);
        setField(term14032, term14032.getClass(), "cdate", null);
        setField(term14030, term14030.getClass(), "date", term14032);
        setFloatField(term14030, term14030.getClass(), "hours", 0.51208574F);
        Object term14035 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14037 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14035, term14035.getClass(), "trackUnitId", 5836128569274066678L);
        setLongField(term14037, term14037.getClass(), "fastTime", 1488725902101L);
        setField(term14037, term14037.getClass(), "cdate", null);
        setField(term14035, term14035.getClass(), "date", term14037);
        setFloatField(term14035, term14035.getClass(), "hours", 0.28528106F);
        Object term14040 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14042 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14040, term14040.getClass(), "trackUnitId", -2177368829816872572L);
        setLongField(term14042, term14042.getClass(), "fastTime", 1311560117361L);
        setField(term14042, term14042.getClass(), "cdate", null);
        setField(term14040, term14040.getClass(), "date", term14042);
        setFloatField(term14040, term14040.getClass(), "hours", 0.30827713F);
        Object term14045 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14047 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14045, term14045.getClass(), "trackUnitId", -8463029266761149071L);
        setLongField(term14047, term14047.getClass(), "fastTime", 1595517583842L);
        setField(term14047, term14047.getClass(), "cdate", null);
        setField(term14045, term14045.getClass(), "date", term14047);
        setFloatField(term14045, term14045.getClass(), "hours", 0.63008493F);
        Object term14050 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14052 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14050, term14050.getClass(), "trackUnitId", 3133860696238261492L);
        setLongField(term14052, term14052.getClass(), "fastTime", 1464421789888L);
        setField(term14052, term14052.getClass(), "cdate", null);
        setField(term14050, term14050.getClass(), "date", term14052);
        setFloatField(term14050, term14050.getClass(), "hours", 0.97831506F);
        Object term14055 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14057 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14055, term14055.getClass(), "trackUnitId", 7247160664318067468L);
        setLongField(term14057, term14057.getClass(), "fastTime", 1405279189488L);
        setField(term14057, term14057.getClass(), "cdate", null);
        setField(term14055, term14055.getClass(), "date", term14057);
        setFloatField(term14055, term14055.getClass(), "hours", 0.9737084F);
        ArrayList term14028 = new ArrayList();
        ((ArrayList) term14028).add(term14030);
        ((ArrayList) term14028).add(term14035);
        ((ArrayList) term14028).add(term14040);
        ((ArrayList) term14028).add(term14045);
        ((ArrayList) term14028).add(term14050);
        ((ArrayList) term14028).add(term14055);
        term14001 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term14001, term14001.getClass(), "projectId", -1530420153);
        setField(term14001, term14001.getClass(), "projectName", "mLUZFTfjle");
        setLongField(term14001, term14001.getClass(), "taskId", 846579494941632714L);
        setField(term14001, term14001.getClass(), "taskName", "xIeFjkHkOe");
        setField(term14001, term14001.getClass(), "trackUnits", term14028);
        term14062 = new Long(2135754395358000892L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term14062;
        callMethod(klass, "setTaskId", argTypes, term14001, args);
    }

};


