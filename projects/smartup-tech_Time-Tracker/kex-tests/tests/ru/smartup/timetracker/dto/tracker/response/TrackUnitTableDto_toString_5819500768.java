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

public class TrackUnitTableDto_toString_5819500768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11391;

    public TrackUnitTableDto_toString_5819500768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11480 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term11479 = ((Class) term11480).getDeclaredField((String) "WORK_DAY");
        ((Field) term11479).setAccessible(true);
        Object enum19 = ((Field) term11479).get((Object) null);
        Object term11394 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term11396 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term11394, term11394.getClass(), "blocked", false);
        setIntField(term11396, term11396.getClass(), "year", 2029);
        setShortField(term11396, term11396.getClass(), "month", (short) 6);
        setShortField(term11396, term11396.getClass(), "day", (short) 22);
        setField(term11394, term11394.getClass(), "date", term11396);
        setField(term11394, term11394.getClass(), "status", enum19);
        setFloatField(term11394, term11394.getClass(), "standardHours", 0.090670586F);
        Class<? extends Object> term11871 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term11870 = ((Class) term11871).getDeclaredField((String) "SHORTENED_DAY");
        ((Field) term11870).setAccessible(true);
        Object enum20 = ((Field) term11870).get((Object) null);
        Object term11403 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term11405 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term11403, term11403.getClass(), "blocked", true);
        setIntField(term11405, term11405.getClass(), "year", 2011);
        setShortField(term11405, term11405.getClass(), "month", (short) 5);
        setShortField(term11405, term11405.getClass(), "day", (short) 4);
        setField(term11403, term11403.getClass(), "date", term11405);
        setField(term11403, term11403.getClass(), "status", enum20);
        setFloatField(term11403, term11403.getClass(), "standardHours", 0.54697996F);
        Object term11412 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term11414 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term11412, term11412.getClass(), "blocked", false);
        setIntField(term11414, term11414.getClass(), "year", 2017);
        setShortField(term11414, term11414.getClass(), "month", (short) 3);
        setShortField(term11414, term11414.getClass(), "day", (short) 5);
        setField(term11412, term11412.getClass(), "date", term11414);
        setField(term11412, term11412.getClass(), "status", enum19);
        setFloatField(term11412, term11412.getClass(), "standardHours", 0.268304F);
        Object term11419 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term11421 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term11419, term11419.getClass(), "blocked", true);
        setIntField(term11421, term11421.getClass(), "year", 2011);
        setShortField(term11421, term11421.getClass(), "month", (short) 7);
        setShortField(term11421, term11421.getClass(), "day", (short) 24);
        setField(term11419, term11419.getClass(), "date", term11421);
        setField(term11419, term11419.getClass(), "status", enum19);
        setFloatField(term11419, term11419.getClass(), "standardHours", 0.6116407F);
        Object term11426 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term11428 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term11426, term11426.getClass(), "blocked", false);
        setIntField(term11428, term11428.getClass(), "year", 2020);
        setShortField(term11428, term11428.getClass(), "month", (short) 7);
        setShortField(term11428, term11428.getClass(), "day", (short) 23);
        setField(term11426, term11426.getClass(), "date", term11428);
        setField(term11426, term11426.getClass(), "status", enum19);
        setFloatField(term11426, term11426.getClass(), "standardHours", 0.71719724F);
        ArrayList term11392 = new ArrayList();
        ((ArrayList) term11392).add(term11394);
        ((ArrayList) term11392).add(term11403);
        ((ArrayList) term11392).add(term11412);
        ((ArrayList) term11392).add(term11419);
        ((ArrayList) term11392).add(term11426);
        ArrayList term11444 = new ArrayList();
        ((ArrayList) term11444).add((Object)null);
        ((ArrayList) term11444).add((Object)null);
        ((ArrayList) term11444).add((Object)null);
        Object term11437 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term11437, term11437.getClass(), "employeeId", -663691365);
        setIntField(term11437, term11437.getClass(), "projectId", 339854490);
        setField(term11437, term11437.getClass(), "projectName", "");
        setLongField(term11437, term11437.getClass(), "taskId", 860079646007397083L);
        setField(term11437, term11437.getClass(), "taskName", "");
        setBooleanField(term11437, term11437.getClass(), "observed", true);
        setField(term11437, term11437.getClass(), "units", term11444);
        ArrayList term11454 = new ArrayList();
        ((ArrayList) term11454).add((Object)null);
        ((ArrayList) term11454).add((Object)null);
        ((ArrayList) term11454).add((Object)null);
        ((ArrayList) term11454).add((Object)null);
        ((ArrayList) term11454).add((Object)null);
        ((ArrayList) term11454).add((Object)null);
        ((ArrayList) term11454).add((Object)null);
        ((ArrayList) term11454).add((Object)null);
        Object term11447 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term11447, term11447.getClass(), "employeeId", -615654495);
        setIntField(term11447, term11447.getClass(), "projectId", -1476117762);
        setField(term11447, term11447.getClass(), "projectName", "");
        setLongField(term11447, term11447.getClass(), "taskId", -4043093655001688454L);
        setField(term11447, term11447.getClass(), "taskName", "");
        setBooleanField(term11447, term11447.getClass(), "observed", false);
        setField(term11447, term11447.getClass(), "units", term11454);
        ArrayList term11464 = new ArrayList();
        ((ArrayList) term11464).add((Object)null);
        ((ArrayList) term11464).add((Object)null);
        ((ArrayList) term11464).add((Object)null);
        ((ArrayList) term11464).add((Object)null);
        ((ArrayList) term11464).add((Object)null);
        ((ArrayList) term11464).add((Object)null);
        ((ArrayList) term11464).add((Object)null);
        ((ArrayList) term11464).add((Object)null);
        Object term11457 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term11457, term11457.getClass(), "employeeId", -341962980);
        setIntField(term11457, term11457.getClass(), "projectId", 1532716628);
        setField(term11457, term11457.getClass(), "projectName", "");
        setLongField(term11457, term11457.getClass(), "taskId", 394960377236392159L);
        setField(term11457, term11457.getClass(), "taskName", "");
        setBooleanField(term11457, term11457.getClass(), "observed", true);
        setField(term11457, term11457.getClass(), "units", term11464);
        ArrayList term11474 = new ArrayList();
        ((ArrayList) term11474).add((Object)null);
        Object term11467 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term11467, term11467.getClass(), "employeeId", -1801760683);
        setIntField(term11467, term11467.getClass(), "projectId", 1141317871);
        setField(term11467, term11467.getClass(), "projectName", "");
        setLongField(term11467, term11467.getClass(), "taskId", -2955854401507097864L);
        setField(term11467, term11467.getClass(), "taskName", "");
        setBooleanField(term11467, term11467.getClass(), "observed", true);
        setField(term11467, term11467.getClass(), "units", term11474);
        ArrayList term11435 = new ArrayList();
        ((ArrayList) term11435).add(term11437);
        ((ArrayList) term11435).add(term11447);
        ((ArrayList) term11435).add(term11457);
        ((ArrayList) term11435).add(term11467);
        term11391 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDto"));
        setField(term11391, term11391.getClass(), "days", term11392);
        setField(term11391, term11391.getClass(), "data", term11435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term11391, args);
    }

};


