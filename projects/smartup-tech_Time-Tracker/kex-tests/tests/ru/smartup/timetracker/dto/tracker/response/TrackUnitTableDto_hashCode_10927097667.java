package ru.smartup.timetracker.dto.tracker.response;

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
import static ru.smartup.timetracker.dto.tracker.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class TrackUnitTableDto_hashCode_10927097667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10550;

    public TrackUnitTableDto_hashCode_10927097667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10598 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term10597 = ((Class) term10598).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term10597).setAccessible(true);
        Object enum17 = ((Field) term10597).get((Object) null);
        Object term10553 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term10555 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term10553, term10553.getClass(), "blocked", false);
        setIntField(term10555, term10555.getClass(), "year", 2015);
        setShortField(term10555, term10555.getClass(), "month", (short) 9);
        setShortField(term10555, term10555.getClass(), "day", (short) 15);
        setField(term10553, term10553.getClass(), "date", term10555);
        setField(term10553, term10553.getClass(), "status", enum17);
        setFloatField(term10553, term10553.getClass(), "standardHours", 0.88196456F);
        Class<? extends Object> term11004 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term11003 = ((Class) term11004).getDeclaredField((String) "WEEKEND");
        ((Field) term11003).setAccessible(true);
        Object enum18 = ((Field) term11003).get((Object) null);
        Object term10562 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term10564 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term10562, term10562.getClass(), "blocked", true);
        setIntField(term10564, term10564.getClass(), "year", 2022);
        setShortField(term10564, term10564.getClass(), "month", (short) 8);
        setShortField(term10564, term10564.getClass(), "day", (short) 8);
        setField(term10562, term10562.getClass(), "date", term10564);
        setField(term10562, term10562.getClass(), "status", enum18);
        setFloatField(term10562, term10562.getClass(), "standardHours", 0.8818646F);
        ArrayList term10551 = new ArrayList();
        ((ArrayList) term10551).add(term10553);
        ((ArrayList) term10551).add(term10562);
        ArrayList term10582 = new ArrayList();
        ((ArrayList) term10582).add((Object)null);
        ((ArrayList) term10582).add((Object)null);
        ((ArrayList) term10582).add((Object)null);
        ((ArrayList) term10582).add((Object)null);
        ((ArrayList) term10582).add((Object)null);
        ((ArrayList) term10582).add((Object)null);
        ((ArrayList) term10582).add((Object)null);
        ((ArrayList) term10582).add((Object)null);
        ((ArrayList) term10582).add((Object)null);
        Object term10575 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term10575, term10575.getClass(), "employeeId", 683666002);
        setIntField(term10575, term10575.getClass(), "projectId", 1596213415);
        setField(term10575, term10575.getClass(), "projectName", "");
        setLongField(term10575, term10575.getClass(), "taskId", 3381333711768010594L);
        setField(term10575, term10575.getClass(), "taskName", "");
        setBooleanField(term10575, term10575.getClass(), "observed", false);
        setField(term10575, term10575.getClass(), "units", term10582);
        ArrayList term10592 = new ArrayList();
        ((ArrayList) term10592).add((Object)null);
        ((ArrayList) term10592).add((Object)null);
        ((ArrayList) term10592).add((Object)null);
        Object term10585 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term10585, term10585.getClass(), "employeeId", -268815336);
        setIntField(term10585, term10585.getClass(), "projectId", -1210583429);
        setField(term10585, term10585.getClass(), "projectName", "");
        setLongField(term10585, term10585.getClass(), "taskId", 2145420811068634601L);
        setField(term10585, term10585.getClass(), "taskName", "");
        setBooleanField(term10585, term10585.getClass(), "observed", true);
        setField(term10585, term10585.getClass(), "units", term10592);
        ArrayList term10573 = new ArrayList();
        ((ArrayList) term10573).add(term10575);
        ((ArrayList) term10573).add(term10585);
        term10550 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDto"));
        setField(term10550, term10550.getClass(), "days", term10551);
        setField(term10550, term10550.getClass(), "data", term10573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10550, args);
    }

};


