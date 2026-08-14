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

public class SubmittedWorkDaysTableProjectUnitDto_canEqual_27544349613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44913;
     Object term44974;

    public SubmittedWorkDaysTableProjectUnitDto_canEqual_27544349613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44942 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44944 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44942, term44942.getClass(), "trackUnitId", 4513004407927379358L);
        setLongField(term44944, term44944.getClass(), "fastTime", 1762147441299L);
        setField(term44944, term44944.getClass(), "cdate", null);
        setField(term44942, term44942.getClass(), "date", term44944);
        setFloatField(term44942, term44942.getClass(), "hours", 0.9457448F);
        Object term44947 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44949 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44947, term44947.getClass(), "trackUnitId", -7115418542247301000L);
        setLongField(term44949, term44949.getClass(), "fastTime", 1395479491666L);
        setField(term44949, term44949.getClass(), "cdate", null);
        setField(term44947, term44947.getClass(), "date", term44949);
        setFloatField(term44947, term44947.getClass(), "hours", 0.42393434F);
        Object term44952 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44954 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44952, term44952.getClass(), "trackUnitId", 8034714140377562739L);
        setLongField(term44954, term44954.getClass(), "fastTime", 1466008719289L);
        setField(term44954, term44954.getClass(), "cdate", null);
        setField(term44952, term44952.getClass(), "date", term44954);
        setFloatField(term44952, term44952.getClass(), "hours", 0.32382548F);
        Object term44957 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44959 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44957, term44957.getClass(), "trackUnitId", -2924531382671518368L);
        setLongField(term44959, term44959.getClass(), "fastTime", 1535838449065L);
        setField(term44959, term44959.getClass(), "cdate", null);
        setField(term44957, term44957.getClass(), "date", term44959);
        setFloatField(term44957, term44957.getClass(), "hours", 0.8069875F);
        Object term44962 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44964 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44962, term44962.getClass(), "trackUnitId", -3948863953565024517L);
        setLongField(term44964, term44964.getClass(), "fastTime", 1345923503543L);
        setField(term44964, term44964.getClass(), "cdate", null);
        setField(term44962, term44962.getClass(), "date", term44964);
        setFloatField(term44962, term44962.getClass(), "hours", 0.28438938F);
        Object term44967 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term44969 = newInstance(Class.forName("java.util.Date"));
        setLongField(term44967, term44967.getClass(), "trackUnitId", -6587807377747738663L);
        setLongField(term44969, term44969.getClass(), "fastTime", 1838357779277L);
        setField(term44969, term44969.getClass(), "cdate", null);
        setField(term44967, term44967.getClass(), "date", term44969);
        setFloatField(term44967, term44967.getClass(), "hours", 0.2114355F);
        ArrayList term44940 = new ArrayList();
        ((ArrayList) term44940).add(term44942);
        ((ArrayList) term44940).add(term44947);
        ((ArrayList) term44940).add(term44952);
        ((ArrayList) term44940).add(term44957);
        ((ArrayList) term44940).add(term44962);
        ((ArrayList) term44940).add(term44967);
        term44913 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term44913, term44913.getClass(), "projectId", -601863069);
        setField(term44913, term44913.getClass(), "projectName", "CNqMxLvtcJ");
        setLongField(term44913, term44913.getClass(), "taskId", 8802866251294305945L);
        setField(term44913, term44913.getClass(), "taskName", "ktbqerIaKW");
        setField(term44913, term44913.getClass(), "trackUnits", term44940);
        term44974 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term44974;
        callMethod(klass, "canEqual", argTypes, term44913, args);
    }

};


