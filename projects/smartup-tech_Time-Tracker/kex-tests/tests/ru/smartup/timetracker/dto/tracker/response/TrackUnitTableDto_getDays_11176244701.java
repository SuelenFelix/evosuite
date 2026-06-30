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

public class TrackUnitTableDto_getDays_11176244701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6049;

    public TrackUnitTableDto_getDays_11176244701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6138 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term6137 = ((Class) term6138).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term6137).setAccessible(true);
        Object enum7 = ((Field) term6137).get((Object) null);
        Object term6052 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term6054 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term6052, term6052.getClass(), "blocked", false);
        setIntField(term6054, term6054.getClass(), "year", 2017);
        setShortField(term6054, term6054.getClass(), "month", (short) 5);
        setShortField(term6054, term6054.getClass(), "day", (short) 21);
        setField(term6052, term6052.getClass(), "date", term6054);
        setField(term6052, term6052.getClass(), "status", enum7);
        setFloatField(term6052, term6052.getClass(), "standardHours", 0.6862221F);
        Object term6061 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term6063 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term6061, term6061.getClass(), "blocked", true);
        setIntField(term6063, term6063.getClass(), "year", 2022);
        setShortField(term6063, term6063.getClass(), "month", (short) 2);
        setShortField(term6063, term6063.getClass(), "day", (short) 25);
        setField(term6061, term6061.getClass(), "date", term6063);
        setField(term6061, term6061.getClass(), "status", enum7);
        setFloatField(term6061, term6061.getClass(), "standardHours", 0.5602794F);
        Object term6068 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term6070 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term6068, term6068.getClass(), "blocked", true);
        setIntField(term6070, term6070.getClass(), "year", 2017);
        setShortField(term6070, term6070.getClass(), "month", (short) 7);
        setShortField(term6070, term6070.getClass(), "day", (short) 22);
        setField(term6068, term6068.getClass(), "date", term6070);
        setField(term6068, term6068.getClass(), "status", enum7);
        setFloatField(term6068, term6068.getClass(), "standardHours", 0.15917838F);
        Class<? extends Object> term6544 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term6543 = ((Class) term6544).getDeclaredField((String) "WEEKEND");
        ((Field) term6543).setAccessible(true);
        Object enum8 = ((Field) term6543).get((Object) null);
        Object term6075 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term6077 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term6075, term6075.getClass(), "blocked", true);
        setIntField(term6077, term6077.getClass(), "year", 2026);
        setShortField(term6077, term6077.getClass(), "month", (short) 12);
        setShortField(term6077, term6077.getClass(), "day", (short) 13);
        setField(term6075, term6075.getClass(), "date", term6077);
        setField(term6075, term6075.getClass(), "status", enum8);
        setFloatField(term6075, term6075.getClass(), "standardHours", 0.37164736F);
        Object term6084 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term6086 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term6084, term6084.getClass(), "blocked", true);
        setIntField(term6086, term6086.getClass(), "year", 2020);
        setShortField(term6086, term6086.getClass(), "month", (short) 5);
        setShortField(term6086, term6086.getClass(), "day", (short) 14);
        setField(term6084, term6084.getClass(), "date", term6086);
        setField(term6084, term6084.getClass(), "status", enum7);
        setFloatField(term6084, term6084.getClass(), "standardHours", 0.93741155F);
        ArrayList term6050 = new ArrayList();
        ((ArrayList) term6050).add(term6052);
        ((ArrayList) term6050).add(term6061);
        ((ArrayList) term6050).add(term6068);
        ((ArrayList) term6050).add(term6075);
        ((ArrayList) term6050).add(term6084);
        ArrayList term6102 = new ArrayList();
        ((ArrayList) term6102).add((Object)null);
        Object term6095 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term6095, term6095.getClass(), "employeeId", -1145578966);
        setIntField(term6095, term6095.getClass(), "projectId", 679763016);
        setField(term6095, term6095.getClass(), "projectName", "");
        setLongField(term6095, term6095.getClass(), "taskId", -6950146046121430355L);
        setField(term6095, term6095.getClass(), "taskName", "");
        setBooleanField(term6095, term6095.getClass(), "observed", true);
        setField(term6095, term6095.getClass(), "units", term6102);
        ArrayList term6112 = new ArrayList();
        ((ArrayList) term6112).add((Object)null);
        ((ArrayList) term6112).add((Object)null);
        Object term6105 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term6105, term6105.getClass(), "employeeId", 1962444399);
        setIntField(term6105, term6105.getClass(), "projectId", 767834723);
        setField(term6105, term6105.getClass(), "projectName", "");
        setLongField(term6105, term6105.getClass(), "taskId", -6342139649364011743L);
        setField(term6105, term6105.getClass(), "taskName", "");
        setBooleanField(term6105, term6105.getClass(), "observed", true);
        setField(term6105, term6105.getClass(), "units", term6112);
        ArrayList term6122 = new ArrayList();
        ((ArrayList) term6122).add((Object)null);
        ((ArrayList) term6122).add((Object)null);
        ((ArrayList) term6122).add((Object)null);
        ((ArrayList) term6122).add((Object)null);
        ((ArrayList) term6122).add((Object)null);
        ((ArrayList) term6122).add((Object)null);
        Object term6115 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term6115, term6115.getClass(), "employeeId", -602026508);
        setIntField(term6115, term6115.getClass(), "projectId", -157887805);
        setField(term6115, term6115.getClass(), "projectName", "");
        setLongField(term6115, term6115.getClass(), "taskId", -4822736661741380518L);
        setField(term6115, term6115.getClass(), "taskName", "");
        setBooleanField(term6115, term6115.getClass(), "observed", false);
        setField(term6115, term6115.getClass(), "units", term6122);
        ArrayList term6132 = new ArrayList();
        ((ArrayList) term6132).add((Object)null);
        Object term6125 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term6125, term6125.getClass(), "employeeId", 1876565163);
        setIntField(term6125, term6125.getClass(), "projectId", -817164822);
        setField(term6125, term6125.getClass(), "projectName", "");
        setLongField(term6125, term6125.getClass(), "taskId", 6273754186658578034L);
        setField(term6125, term6125.getClass(), "taskName", "");
        setBooleanField(term6125, term6125.getClass(), "observed", false);
        setField(term6125, term6125.getClass(), "units", term6132);
        ArrayList term6093 = new ArrayList();
        ((ArrayList) term6093).add(term6095);
        ((ArrayList) term6093).add(term6105);
        ((ArrayList) term6093).add(term6115);
        ((ArrayList) term6093).add(term6125);
        term6049 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDto"));
        setField(term6049, term6049.getClass(), "days", term6050);
        setField(term6049, term6049.getClass(), "data", term6093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDays", argTypes, term6049, args);
    }

};


