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

public class SubmittedWorkDaysTableProjectUnitDto_getTaskId_634490934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44201;

    public SubmittedWorkDaysTableProjectUnitDto_getTaskId_634490934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44230 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44232 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44230, term44230.getClass(), "trackUnitId", 846579494941632714L);
        setLongField(term44232, term44232.getClass(), "fastTime", 1668569229825L);
        setField(term44232, term44232.getClass(), "cdate", null);
        setField(term44230, term44230.getClass(), "date", term44232);
        setFloatField(term44230, term44230.getClass(), "hours", 0.24406976F);
        Object term44235 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44237 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44235, term44235.getClass(), "trackUnitId", 6689117472719450333L);
        setLongField(term44237, term44237.getClass(), "fastTime", 1725122217647L);
        setField(term44237, term44237.getClass(), "cdate", null);
        setField(term44235, term44235.getClass(), "date", term44237);
        setFloatField(term44235, term44235.getClass(), "hours", 0.6438162F);
        Object term44240 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44242 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44240, term44240.getClass(), "trackUnitId", 5836128569274066678L);
        setLongField(term44242, term44242.getClass(), "fastTime", 1550698994689L);
        setField(term44242, term44242.getClass(), "cdate", null);
        setField(term44240, term44240.getClass(), "date", term44242);
        setFloatField(term44240, term44240.getClass(), "hours", 0.79774547F);
        Object term44245 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44247 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44245, term44245.getClass(), "trackUnitId", -2177368829816872572L);
        setLongField(term44247, term44247.getClass(), "fastTime", 1804998087131L);
        setField(term44247, term44247.getClass(), "cdate", null);
        setField(term44245, term44245.getClass(), "date", term44247);
        setFloatField(term44245, term44245.getClass(), "hours", 0.4476599F);
        Object term44250 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44252 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44250, term44250.getClass(), "trackUnitId", -8463029266761149071L);
        setLongField(term44252, term44252.getClass(), "fastTime", 1538078916394L);
        setField(term44252, term44252.getClass(), "cdate", null);
        setField(term44250, term44250.getClass(), "date", term44252);
        setFloatField(term44250, term44250.getClass(), "hours", 0.5329919F);
        ArrayList term44228 = new ArrayList();
        ((ArrayList) term44228).add(term44230);
        ((ArrayList) term44228).add(term44235);
        ((ArrayList) term44228).add(term44240);
        ((ArrayList) term44228).add(term44245);
        ((ArrayList) term44228).add(term44250);
        term44201 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term44201, term44201.getClass(), "projectId", 229204365);
        setField(term44201, term44201.getClass(), "projectName", "mwmFMNEzkK");
        setLongField(term44201, term44201.getClass(), "taskId", -8876856890348836498L);
        setField(term44201, term44201.getClass(), "taskName", "kVAmKknVln");
        setField(term44201, term44201.getClass(), "trackUnits", term44228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTaskId", argTypes, term44201, args);
    }

};


