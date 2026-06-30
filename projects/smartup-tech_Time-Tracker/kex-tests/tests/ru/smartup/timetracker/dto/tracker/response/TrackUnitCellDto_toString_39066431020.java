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

public class TrackUnitCellDto_toString_39066431020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4038;

    public TrackUnitCellDto_toString_39066431020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4038 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term4040 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term4038, term4038.getClass(), "id", 8428634514691209827L);
        setLongField(term4040, term4040.getClass(), "fastTime", 1550698994689L);
        setField(term4040, term4040.getClass(), "cdate", null);
        setField(term4038, term4038.getClass(), "workDay", term4040);
        setFloatField(term4038, term4038.getClass(), "hours", 0.20144695F);
        setBooleanField(term4038, term4038.getClass(), "blocked", false);
        setBooleanField(term4038, term4038.getClass(), "billable", false);
        setField(term4038, term4038.getClass(), "comment", "wSQxaModmm");
        setField(term4038, term4038.getClass(), "rejectReason", "UlajhuVLaP");
        setBooleanField(term4038, term4038.getClass(), "rejected", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4038, args);
    }

};


