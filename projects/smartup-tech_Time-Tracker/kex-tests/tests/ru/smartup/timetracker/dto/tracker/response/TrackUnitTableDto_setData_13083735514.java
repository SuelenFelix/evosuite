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

public class TrackUnitTableDto_setData_13083735514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8687;
     Object term8792;

    public TrackUnitTableDto_setData_13083735514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8796 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.ProductionCalendarDayEnum");
        Field term8795 = ((Class) term8796).getDeclaredField((String) "WORK_DAY");
        ((Field) term8795).setAccessible(true);
        Object enum13 = ((Field) term8795).get((Object) null);
        Object term8690 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term8692 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term8690, term8690.getClass(), "blocked", false);
        setIntField(term8692, term8692.getClass(), "year", 2027);
        setShortField(term8692, term8692.getClass(), "month", (short) 3);
        setShortField(term8692, term8692.getClass(), "day", (short) 14);
        setField(term8690, term8690.getClass(), "date", term8692);
        setField(term8690, term8690.getClass(), "status", enum13);
        setFloatField(term8690, term8690.getClass(), "standardHours", 0.0022646189F);
        Object term8699 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDayDto"));
        Object term8701 = newInstance(Class.forName("java.time.LocalDate"));
        setBooleanField(term8699, term8699.getClass(), "blocked", false);
        setIntField(term8701, term8701.getClass(), "year", 2018);
        setShortField(term8701, term8701.getClass(), "month", (short) 9);
        setShortField(term8701, term8701.getClass(), "day", (short) 27);
        setField(term8699, term8699.getClass(), "date", term8701);
        setField(term8699, term8699.getClass(), "status", enum13);
        setFloatField(term8699, term8699.getClass(), "standardHours", 0.99403065F);
        ArrayList term8688 = new ArrayList();
        ((ArrayList) term8688).add(term8690);
        ((ArrayList) term8688).add(term8699);
        ArrayList term8717 = new ArrayList();
        ((ArrayList) term8717).add((Object)null);
        ((ArrayList) term8717).add((Object)null);
        ((ArrayList) term8717).add((Object)null);
        Object term8710 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term8710, term8710.getClass(), "employeeId", -112921587);
        setIntField(term8710, term8710.getClass(), "projectId", 933028652);
        setField(term8710, term8710.getClass(), "projectName", "");
        setLongField(term8710, term8710.getClass(), "taskId", -7278883608542636188L);
        setField(term8710, term8710.getClass(), "taskName", "");
        setBooleanField(term8710, term8710.getClass(), "observed", false);
        setField(term8710, term8710.getClass(), "units", term8717);
        ArrayList term8727 = new ArrayList();
        ((ArrayList) term8727).add((Object)null);
        ((ArrayList) term8727).add((Object)null);
        ((ArrayList) term8727).add((Object)null);
        ((ArrayList) term8727).add((Object)null);
        ((ArrayList) term8727).add((Object)null);
        ((ArrayList) term8727).add((Object)null);
        Object term8720 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term8720, term8720.getClass(), "employeeId", 287287233);
        setIntField(term8720, term8720.getClass(), "projectId", 962840079);
        setField(term8720, term8720.getClass(), "projectName", "");
        setLongField(term8720, term8720.getClass(), "taskId", -2783999800714825789L);
        setField(term8720, term8720.getClass(), "taskName", "");
        setBooleanField(term8720, term8720.getClass(), "observed", true);
        setField(term8720, term8720.getClass(), "units", term8727);
        ArrayList term8737 = new ArrayList();
        ((ArrayList) term8737).add((Object)null);
        ((ArrayList) term8737).add((Object)null);
        ((ArrayList) term8737).add((Object)null);
        ((ArrayList) term8737).add((Object)null);
        ((ArrayList) term8737).add((Object)null);
        ((ArrayList) term8737).add((Object)null);
        ((ArrayList) term8737).add((Object)null);
        ((ArrayList) term8737).add((Object)null);
        Object term8730 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term8730, term8730.getClass(), "employeeId", 1540719661);
        setIntField(term8730, term8730.getClass(), "projectId", 1265463001);
        setField(term8730, term8730.getClass(), "projectName", "");
        setLongField(term8730, term8730.getClass(), "taskId", -8892586408602479513L);
        setField(term8730, term8730.getClass(), "taskName", "");
        setBooleanField(term8730, term8730.getClass(), "observed", false);
        setField(term8730, term8730.getClass(), "units", term8737);
        ArrayList term8747 = new ArrayList();
        ((ArrayList) term8747).add((Object)null);
        ((ArrayList) term8747).add((Object)null);
        ((ArrayList) term8747).add((Object)null);
        ((ArrayList) term8747).add((Object)null);
        ((ArrayList) term8747).add((Object)null);
        ((ArrayList) term8747).add((Object)null);
        ((ArrayList) term8747).add((Object)null);
        ((ArrayList) term8747).add((Object)null);
        ((ArrayList) term8747).add((Object)null);
        Object term8740 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term8740, term8740.getClass(), "employeeId", 335112684);
        setIntField(term8740, term8740.getClass(), "projectId", 1551099402);
        setField(term8740, term8740.getClass(), "projectName", "");
        setLongField(term8740, term8740.getClass(), "taskId", 3427570961451840069L);
        setField(term8740, term8740.getClass(), "taskName", "");
        setBooleanField(term8740, term8740.getClass(), "observed", false);
        setField(term8740, term8740.getClass(), "units", term8747);
        ArrayList term8757 = new ArrayList();
        ((ArrayList) term8757).add((Object)null);
        ((ArrayList) term8757).add((Object)null);
        ((ArrayList) term8757).add((Object)null);
        ((ArrayList) term8757).add((Object)null);
        ((ArrayList) term8757).add((Object)null);
        ((ArrayList) term8757).add((Object)null);
        ((ArrayList) term8757).add((Object)null);
        Object term8750 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term8750, term8750.getClass(), "employeeId", -2027534003);
        setIntField(term8750, term8750.getClass(), "projectId", 1063420942);
        setField(term8750, term8750.getClass(), "projectName", "");
        setLongField(term8750, term8750.getClass(), "taskId", 4502292577098212311L);
        setField(term8750, term8750.getClass(), "taskName", "");
        setBooleanField(term8750, term8750.getClass(), "observed", true);
        setField(term8750, term8750.getClass(), "units", term8757);
        ArrayList term8767 = new ArrayList();
        ((ArrayList) term8767).add((Object)null);
        ((ArrayList) term8767).add((Object)null);
        ((ArrayList) term8767).add((Object)null);
        Object term8760 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term8760, term8760.getClass(), "employeeId", 1375330971);
        setIntField(term8760, term8760.getClass(), "projectId", -478195677);
        setField(term8760, term8760.getClass(), "projectName", "");
        setLongField(term8760, term8760.getClass(), "taskId", -3730936709704460408L);
        setField(term8760, term8760.getClass(), "taskName", "");
        setBooleanField(term8760, term8760.getClass(), "observed", false);
        setField(term8760, term8760.getClass(), "units", term8767);
        ArrayList term8777 = new ArrayList();
        ((ArrayList) term8777).add((Object)null);
        ((ArrayList) term8777).add((Object)null);
        ((ArrayList) term8777).add((Object)null);
        ((ArrayList) term8777).add((Object)null);
        Object term8770 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term8770, term8770.getClass(), "employeeId", 972867650);
        setIntField(term8770, term8770.getClass(), "projectId", 1655935355);
        setField(term8770, term8770.getClass(), "projectName", "");
        setLongField(term8770, term8770.getClass(), "taskId", -8614778293741404325L);
        setField(term8770, term8770.getClass(), "taskName", "");
        setBooleanField(term8770, term8770.getClass(), "observed", true);
        setField(term8770, term8770.getClass(), "units", term8777);
        ArrayList term8787 = new ArrayList();
        ((ArrayList) term8787).add((Object)null);
        ((ArrayList) term8787).add((Object)null);
        Object term8780 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term8780, term8780.getClass(), "employeeId", -481533957);
        setIntField(term8780, term8780.getClass(), "projectId", 1240914516);
        setField(term8780, term8780.getClass(), "projectName", "");
        setLongField(term8780, term8780.getClass(), "taskId", -5447369594017685765L);
        setField(term8780, term8780.getClass(), "taskName", "");
        setBooleanField(term8780, term8780.getClass(), "observed", false);
        setField(term8780, term8780.getClass(), "units", term8787);
        ArrayList term8708 = new ArrayList();
        ((ArrayList) term8708).add(term8710);
        ((ArrayList) term8708).add(term8720);
        ((ArrayList) term8708).add(term8730);
        ((ArrayList) term8708).add(term8740);
        ((ArrayList) term8708).add(term8750);
        ((ArrayList) term8708).add(term8760);
        ((ArrayList) term8708).add(term8770);
        ((ArrayList) term8708).add(term8780);
        term8687 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDto"));
        setField(term8687, term8687.getClass(), "days", term8688);
        setField(term8687, term8687.getClass(), "data", term8708);
        term8792 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitTableDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term8792;
        callMethod(klass, "setData", argTypes, term8687, args);
    }

};


