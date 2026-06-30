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

public class TrackUnitCellDto_isBillable_8305396645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3200;

    public TrackUnitCellDto_isBillable_8305396645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3200 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3202 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3200, term3200.getClass(), "id", 5270370404989704783L);
        setLongField(term3202, term3202.getClass(), "fastTime", 1442639565302L);
        setField(term3202, term3202.getClass(), "cdate", null);
        setField(term3200, term3200.getClass(), "workDay", term3202);
        setFloatField(term3200, term3200.getClass(), "hours", 0.8783184F);
        setBooleanField(term3200, term3200.getClass(), "blocked", true);
        setBooleanField(term3200, term3200.getClass(), "billable", true);
        setField(term3200, term3200.getClass(), "comment", "hRNSzYYIrc");
        setField(term3200, term3200.getClass(), "rejectReason", "RMFIsYGgne");
        setBooleanField(term3200, term3200.getClass(), "rejected", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBillable", argTypes, term3200, args);
    }

};


