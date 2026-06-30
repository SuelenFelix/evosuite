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

public class TrackUnitRowDto_getUnits_5347998227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4768;

    public TrackUnitRowDto_getUnits_5347998227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4799 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4801 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4799, term4799.getClass(), "id", 2936323121573284007L);
        setLongField(term4801, term4801.getClass(), "fastTime", 1426018874434L);
        setField(term4801, term4801.getClass(), "cdate", null);
        setField(term4799, term4799.getClass(), "workDay", term4801);
        setFloatField(term4799, term4799.getClass(), "hours", 0.10577053F);
        setBooleanField(term4799, term4799.getClass(), "blocked", false);
        setBooleanField(term4799, term4799.getClass(), "billable", true);
        setField(term4799, term4799.getClass(), "comment", "");
        setField(term4799, term4799.getClass(), "rejectReason", "");
        setBooleanField(term4799, term4799.getClass(), "rejected", true);
        Object term4809 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4811 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4809, term4809.getClass(), "id", -1154553077993834885L);
        setLongField(term4811, term4811.getClass(), "fastTime", 1633004775487L);
        setField(term4811, term4811.getClass(), "cdate", null);
        setField(term4809, term4809.getClass(), "workDay", term4811);
        setFloatField(term4809, term4809.getClass(), "hours", 0.5840714F);
        setBooleanField(term4809, term4809.getClass(), "blocked", false);
        setBooleanField(term4809, term4809.getClass(), "billable", true);
        setField(term4809, term4809.getClass(), "comment", "");
        setField(term4809, term4809.getClass(), "rejectReason", "");
        setBooleanField(term4809, term4809.getClass(), "rejected", true);
        ArrayList term4797 = new ArrayList();
        ((ArrayList) term4797).add(term4799);
        ((ArrayList) term4797).add(term4809);
        term4768 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto"));
        setIntField(term4768, term4768.getClass(), "employeeId", 1134449235);
        setIntField(term4768, term4768.getClass(), "projectId", -883034806);
        setField(term4768, term4768.getClass(), "projectName", "SPpkrGcPRr");
        setLongField(term4768, term4768.getClass(), "taskId", -5788180182343976541L);
        setField(term4768, term4768.getClass(), "taskName", "sEccwbJKYE");
        setBooleanField(term4768, term4768.getClass(), "observed", false);
        setField(term4768, term4768.getClass(), "units", term4797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitRowDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUnits", argTypes, term4768, args);
    }

};


