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

public class SubmittedWorkDaysTableProjectUnitDto_equals_107960612511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14251;
     Object term14317;

    public SubmittedWorkDaysTableProjectUnitDto_equals_107960612511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14280 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14282 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14280, term14280.getClass(), "trackUnitId", -3936701866695933852L);
        setLongField(term14282, term14282.getClass(), "fastTime", 1761994701322L);
        setField(term14282, term14282.getClass(), "cdate", null);
        setField(term14280, term14280.getClass(), "date", term14282);
        setFloatField(term14280, term14280.getClass(), "hours", 0.24759698F);
        Object term14285 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14287 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14285, term14285.getClass(), "trackUnitId", 1215116475929634177L);
        setLongField(term14287, term14287.getClass(), "fastTime", 1695425269458L);
        setField(term14287, term14287.getClass(), "cdate", null);
        setField(term14285, term14285.getClass(), "date", term14287);
        setFloatField(term14285, term14285.getClass(), "hours", 0.32021916F);
        Object term14290 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14292 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14290, term14290.getClass(), "trackUnitId", 1597484336218508869L);
        setLongField(term14292, term14292.getClass(), "fastTime", 1362780563394L);
        setField(term14292, term14292.getClass(), "cdate", null);
        setField(term14290, term14290.getClass(), "date", term14292);
        setFloatField(term14290, term14290.getClass(), "hours", 0.8886614F);
        Object term14295 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14297 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14295, term14295.getClass(), "trackUnitId", -685023850445639859L);
        setLongField(term14297, term14297.getClass(), "fastTime", 1853963979281L);
        setField(term14297, term14297.getClass(), "cdate", null);
        setField(term14295, term14295.getClass(), "date", term14297);
        setFloatField(term14295, term14295.getClass(), "hours", 0.22651339F);
        Object term14300 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14302 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14300, term14300.getClass(), "trackUnitId", -6950146046121430355L);
        setLongField(term14302, term14302.getClass(), "fastTime", 1795936337628L);
        setField(term14302, term14302.getClass(), "cdate", null);
        setField(term14300, term14300.getClass(), "date", term14302);
        setFloatField(term14300, term14300.getClass(), "hours", 0.38555247F);
        Object term14305 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14307 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14305, term14305.getClass(), "trackUnitId", 1667122142089513324L);
        setLongField(term14307, term14307.getClass(), "fastTime", 1802995433545L);
        setField(term14307, term14307.getClass(), "cdate", null);
        setField(term14305, term14305.getClass(), "date", term14307);
        setFloatField(term14305, term14305.getClass(), "hours", 0.8878841F);
        Object term14310 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDayUnitDto"));
        Object term14312 = newInstance(Class.forName("java.util.Date"));
        setLongField(term14310, term14310.getClass(), "trackUnitId", -6342139649364011743L);
        setLongField(term14312, term14312.getClass(), "fastTime", 1843214817357L);
        setField(term14312, term14312.getClass(), "cdate", null);
        setField(term14310, term14310.getClass(), "date", term14312);
        setFloatField(term14310, term14310.getClass(), "hours", 0.2889229F);
        ArrayList term14278 = new ArrayList();
        ((ArrayList) term14278).add(term14280);
        ((ArrayList) term14278).add(term14285);
        ((ArrayList) term14278).add(term14290);
        ((ArrayList) term14278).add(term14295);
        ((ArrayList) term14278).add(term14300);
        ((ArrayList) term14278).add(term14305);
        ((ArrayList) term14278).add(term14310);
        term14251 = newInstance(Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto"));
        setIntField(term14251, term14251.getClass(), "projectId", 679763016);
        setField(term14251, term14251.getClass(), "projectName", "gCWtLVKVVe");
        setLongField(term14251, term14251.getClass(), "taskId", 7276637106827860087L);
        setField(term14251, term14251.getClass(), "taskName", "fWKJoSoCwE");
        setField(term14251, term14251.getClass(), "trackUnits", term14278);
        term14317 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.approval.response.SubmittedWorkDaysTableProjectUnitDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14317;
        callMethod(klass, "equals", argTypes, term14251, args);
    }

};


