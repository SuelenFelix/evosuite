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
import java.util.LinkedList;

public class TrackUnitTableDto_setDays_13085398043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7767;
     Object term7865;

    public TrackUnitTableDto_setDays_13085398043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7909 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term7908 = ((Class) term7909).getDeclaredField((String) "WEEKEND");
        ((Field) term7908).setAccessible(true);
        Object enum11 = ((Field) term7908).get((Object) null);
        Object term7770 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term7772 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term7770, term7770.getClass(), "blocked", true);
        setIntField(term7772, term7772.getClass(), "year", 2024);
        setShortField(term7772, term7772.getClass(), "month", (short) 1);
        setShortField(term7772, term7772.getClass(), "day", (short) 24);
        setField(term7770, term7770.getClass(), "date", term7772);
        setField(term7770, term7770.getClass(), "status", enum11);
        setFloatField(term7770, term7770.getClass(), "standardHours", 0.25778466F);
        ArrayList term7768 = new ArrayList();
        ((ArrayList) term7768).add(term7770);
        ArrayList term7790 = new ArrayList();
        ((ArrayList) term7790).add((Object)null);
        ((ArrayList) term7790).add((Object)null);
        ((ArrayList) term7790).add((Object)null);
        ((ArrayList) term7790).add((Object)null);
        ((ArrayList) term7790).add((Object)null);
        ((ArrayList) term7790).add((Object)null);
        ((ArrayList) term7790).add((Object)null);
        Object term7783 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term7783, term7783.getClass(), "employeeId", -1786399638);
        setIntField(term7783, term7783.getClass(), "projectId", 2055867847);
        setField(term7783, term7783.getClass(), "projectName", "");
        setLongField(term7783, term7783.getClass(), "taskId", 4513004407927379358L);
        setField(term7783, term7783.getClass(), "taskName", "");
        setBooleanField(term7783, term7783.getClass(), "observed", true);
        setField(term7783, term7783.getClass(), "units", term7790);
        ArrayList term7800 = new ArrayList();
        ((ArrayList) term7800).add((Object)null);
        ((ArrayList) term7800).add((Object)null);
        Object term7793 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term7793, term7793.getClass(), "employeeId", -1048298087);
        setIntField(term7793, term7793.getClass(), "projectId", 292681826);
        setField(term7793, term7793.getClass(), "projectName", "");
        setLongField(term7793, term7793.getClass(), "taskId", -4598158870068953328L);
        setField(term7793, term7793.getClass(), "taskName", "");
        setBooleanField(term7793, term7793.getClass(), "observed", false);
        setField(term7793, term7793.getClass(), "units", term7800);
        ArrayList term7810 = new ArrayList();
        ((ArrayList) term7810).add((Object)null);
        ((ArrayList) term7810).add((Object)null);
        Object term7803 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term7803, term7803.getClass(), "employeeId", 458147407);
        setIntField(term7803, term7803.getClass(), "projectId", -184153539);
        setField(term7803, term7803.getClass(), "projectName", "");
        setLongField(term7803, term7803.getClass(), "taskId", -1333707622307134180L);
        setField(term7803, term7803.getClass(), "taskName", "");
        setBooleanField(term7803, term7803.getClass(), "observed", false);
        setField(term7803, term7803.getClass(), "units", term7810);
        ArrayList term7820 = new ArrayList();
        ((ArrayList) term7820).add((Object)null);
        Object term7813 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term7813, term7813.getClass(), "employeeId", 493620644);
        setIntField(term7813, term7813.getClass(), "projectId", 1328271830);
        setField(term7813, term7813.getClass(), "projectName", "");
        setLongField(term7813, term7813.getClass(), "taskId", 1457594663983990440L);
        setField(term7813, term7813.getClass(), "taskName", "");
        setBooleanField(term7813, term7813.getClass(), "observed", true);
        setField(term7813, term7813.getClass(), "units", term7820);
        ArrayList term7830 = new ArrayList();
        Object term7823 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term7823, term7823.getClass(), "employeeId", 1596070772);
        setIntField(term7823, term7823.getClass(), "projectId", 97029295);
        setField(term7823, term7823.getClass(), "projectName", "");
        setLongField(term7823, term7823.getClass(), "taskId", 3452833434644634217L);
        setField(term7823, term7823.getClass(), "taskName", "");
        setBooleanField(term7823, term7823.getClass(), "observed", false);
        setField(term7823, term7823.getClass(), "units", term7830);
        ArrayList term7840 = new ArrayList();
        ((ArrayList) term7840).add((Object)null);
        ((ArrayList) term7840).add((Object)null);
        ((ArrayList) term7840).add((Object)null);
        ((ArrayList) term7840).add((Object)null);
        ((ArrayList) term7840).add((Object)null);
        ((ArrayList) term7840).add((Object)null);
        ((ArrayList) term7840).add((Object)null);
        ((ArrayList) term7840).add((Object)null);
        Object term7833 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term7833, term7833.getClass(), "employeeId", -1371869594);
        setIntField(term7833, term7833.getClass(), "projectId", -2095575670);
        setField(term7833, term7833.getClass(), "projectName", "");
        setLongField(term7833, term7833.getClass(), "taskId", -8603648071751666348L);
        setField(term7833, term7833.getClass(), "taskName", "");
        setBooleanField(term7833, term7833.getClass(), "observed", true);
        setField(term7833, term7833.getClass(), "units", term7840);
        ArrayList term7850 = new ArrayList();
        Object term7843 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term7843, term7843.getClass(), "employeeId", 1225272962);
        setIntField(term7843, term7843.getClass(), "projectId", 1324040357);
        setField(term7843, term7843.getClass(), "projectName", "");
        setLongField(term7843, term7843.getClass(), "taskId", -7884871963229073324L);
        setField(term7843, term7843.getClass(), "taskName", "");
        setBooleanField(term7843, term7843.getClass(), "observed", true);
        setField(term7843, term7843.getClass(), "units", term7850);
        ArrayList term7860 = new ArrayList();
        Object term7853 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term7853, term7853.getClass(), "employeeId", -1588772968);
        setIntField(term7853, term7853.getClass(), "projectId", -93135961);
        setField(term7853, term7853.getClass(), "projectName", "");
        setLongField(term7853, term7853.getClass(), "taskId", -8649738738252714180L);
        setField(term7853, term7853.getClass(), "taskName", "");
        setBooleanField(term7853, term7853.getClass(), "observed", false);
        setField(term7853, term7853.getClass(), "units", term7860);
        ArrayList term7781 = new ArrayList();
        ((ArrayList) term7781).add(term7783);
        ((ArrayList) term7781).add(term7793);
        ((ArrayList) term7781).add(term7803);
        ((ArrayList) term7781).add(term7813);
        ((ArrayList) term7781).add(term7823);
        ((ArrayList) term7781).add(term7833);
        ((ArrayList) term7781).add(term7843);
        ((ArrayList) term7781).add(term7853);
        term7767 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDto"));
        setField(term7767, term7767.getClass(), "days", term7768);
        setField(term7767, term7767.getClass(), "data", term7781);
        Class<? extends Object> term8297 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term8296 = ((Class) term8297).getDeclaredField((String) "WORK_DAY");
        ((Field) term8296).setAccessible(true);
        Object enum12 = ((Field) term8296).get((Object) null);
        Object term7868 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term7870 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term7868, term7868.getClass(), "blocked", false);
        setIntField(term7870, term7870.getClass(), "year", 2029);
        setShortField(term7870, term7870.getClass(), "month", (short) 1);
        setShortField(term7870, term7870.getClass(), "day", (short) 20);
        setField(term7868, term7868.getClass(), "date", term7870);
        setField(term7868, term7868.getClass(), "status", enum12);
        setFloatField(term7868, term7868.getClass(), "standardHours", 0.53083503F);
        Object term7879 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term7881 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term7879, term7879.getClass(), "blocked", true);
        setIntField(term7881, term7881.getClass(), "year", 2029);
        setShortField(term7881, term7881.getClass(), "month", (short) 8);
        setShortField(term7881, term7881.getClass(), "day", (short) 28);
        setField(term7879, term7879.getClass(), "date", term7881);
        setField(term7879, term7879.getClass(), "status", enum12);
        setFloatField(term7879, term7879.getClass(), "standardHours", 0.5195638F);
        Object term7887 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        setBooleanField(term7887, term7887.getClass(), "blocked", false);
        setField(term7887, term7887.getClass(), "date", null);
        setField(term7887, term7887.getClass(), "status", null);
        setFloatField(term7887, term7887.getClass(), "standardHours", 0.71547955F);
        term7865 = new LinkedList();
        ((LinkedList) term7865).add(term7868);
        ((LinkedList) term7865).add(term7879);
        ((LinkedList) term7865).add(term7887);
        ((LinkedList) term7865).add((Object)null);
        ((LinkedList) term7865).add((Object)null);
        ((LinkedList) term7865).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term7865;
        callMethod(klass, "setDays", argTypes, term7767, args);
    }

};


