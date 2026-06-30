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
import java.lang.Object;

public class TrackUnitCellDto_setWorkDay_179520210410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3462;
     Object term3494;

    public TrackUnitCellDto_setWorkDay_179520210410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3462 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3464 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3462, term3462.getClass(), "id", -2813493605142626659L);
        setLongField(term3464, term3464.getClass(), "fastTime", 1500721068023L);
        setField(term3464, term3464.getClass(), "cdate", null);
        setField(term3462, term3462.getClass(), "workDay", term3464);
        setFloatField(term3462, term3462.getClass(), "hours", 0.6076495F);
        setBooleanField(term3462, term3462.getClass(), "blocked", true);
        setBooleanField(term3462, term3462.getClass(), "billable", true);
        setField(term3462, term3462.getClass(), "comment", "HyxfbSQYBe");
        setField(term3462, term3462.getClass(), "rejectReason", "pCTimMblYc");
        setBooleanField(term3462, term3462.getClass(), "rejected", true);
        term3494 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3494, term3494.getClass(), "fastTime", 1797203628025L);
        setField(term3494, term3494.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Date");
        Object[] args = new Object[1];
        args[0] = term3494;
        callMethod(klass, "setWorkDay", argTypes, term3462, args);
    }

};


