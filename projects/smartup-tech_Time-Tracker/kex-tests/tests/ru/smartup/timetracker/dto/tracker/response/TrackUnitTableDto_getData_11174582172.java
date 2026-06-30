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

public class TrackUnitTableDto_getData_11174582172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6931;

    public TrackUnitTableDto_getData_11174582172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6989 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term6988 = ((Class) term6989).getDeclaredField((String) "WORK_DAY");
        ((Field) term6988).setAccessible(true);
        Object enum9 = ((Field) term6988).get((Object) null);
        Object term6934 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term6936 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term6934, term6934.getClass(), "blocked", true);
        setIntField(term6936, term6936.getClass(), "year", 2025);
        setShortField(term6936, term6936.getClass(), "month", (short) 4);
        setShortField(term6936, term6936.getClass(), "day", (short) 23);
        setField(term6934, term6934.getClass(), "date", term6936);
        setField(term6934, term6934.getClass(), "status", enum9);
        setFloatField(term6934, term6934.getClass(), "standardHours", 0.1610204F);
        Class<? extends Object> term7380 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term7379 = ((Class) term7380).getDeclaredField((String) "WEEKEND");
        ((Field) term7379).setAccessible(true);
        Object enum10 = ((Field) term7379).get((Object) null);
        Object term6943 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term6945 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term6943, term6943.getClass(), "blocked", true);
        setIntField(term6945, term6945.getClass(), "year", 2012);
        setShortField(term6945, term6945.getClass(), "month", (short) 10);
        setShortField(term6945, term6945.getClass(), "day", (short) 1);
        setField(term6943, term6943.getClass(), "date", term6945);
        setField(term6943, term6943.getClass(), "status", enum10);
        setFloatField(term6943, term6943.getClass(), "standardHours", 0.791937F);
        ArrayList term6932 = new ArrayList();
        ((ArrayList) term6932).add(term6934);
        ((ArrayList) term6932).add(term6943);
        ArrayList term6963 = new ArrayList();
        ((ArrayList) term6963).add((Object)null);
        ((ArrayList) term6963).add((Object)null);
        ((ArrayList) term6963).add((Object)null);
        ((ArrayList) term6963).add((Object)null);
        Object term6956 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term6956, term6956.getClass(), "employeeId", -1016503459);
        setIntField(term6956, term6956.getClass(), "projectId", -1968847291);
        setField(term6956, term6956.getClass(), "projectName", "");
        setLongField(term6956, term6956.getClass(), "taskId", 8313800941204938919L);
        setField(term6956, term6956.getClass(), "taskName", "");
        setBooleanField(term6956, term6956.getClass(), "observed", true);
        setField(term6956, term6956.getClass(), "units", term6963);
        ArrayList term6973 = new ArrayList();
        ((ArrayList) term6973).add((Object)null);
        ((ArrayList) term6973).add((Object)null);
        ((ArrayList) term6973).add((Object)null);
        ((ArrayList) term6973).add((Object)null);
        ((ArrayList) term6973).add((Object)null);
        ((ArrayList) term6973).add((Object)null);
        ((ArrayList) term6973).add((Object)null);
        ((ArrayList) term6973).add((Object)null);
        ((ArrayList) term6973).add((Object)null);
        Object term6966 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term6966, term6966.getClass(), "employeeId", 579005622);
        setIntField(term6966, term6966.getClass(), "projectId", -14890619);
        setField(term6966, term6966.getClass(), "projectName", "");
        setLongField(term6966, term6966.getClass(), "taskId", 148047808219672941L);
        setField(term6966, term6966.getClass(), "taskName", "");
        setBooleanField(term6966, term6966.getClass(), "observed", true);
        setField(term6966, term6966.getClass(), "units", term6973);
        ArrayList term6983 = new ArrayList();
        ((ArrayList) term6983).add((Object)null);
        ((ArrayList) term6983).add((Object)null);
        ((ArrayList) term6983).add((Object)null);
        ((ArrayList) term6983).add((Object)null);
        Object term6976 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term6976, term6976.getClass(), "employeeId", 1632125673);
        setIntField(term6976, term6976.getClass(), "projectId", 454281060);
        setField(term6976, term6976.getClass(), "projectName", "");
        setLongField(term6976, term6976.getClass(), "taskId", 8802866251294305945L);
        setField(term6976, term6976.getClass(), "taskName", "");
        setBooleanField(term6976, term6976.getClass(), "observed", true);
        setField(term6976, term6976.getClass(), "units", term6983);
        ArrayList term6954 = new ArrayList();
        ((ArrayList) term6954).add(term6956);
        ((ArrayList) term6954).add(term6966);
        ((ArrayList) term6954).add(term6976);
        term6931 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDto"));
        setField(term6931, term6931.getClass(), "days", term6932);
        setField(term6931, term6931.getClass(), "data", term6954);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term6931, args);
    }

};


