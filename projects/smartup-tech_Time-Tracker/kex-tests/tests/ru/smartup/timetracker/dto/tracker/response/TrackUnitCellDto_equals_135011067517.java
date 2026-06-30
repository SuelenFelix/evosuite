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

public class TrackUnitCellDto_equals_135011067517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3880;
     Object term3912;

    public TrackUnitCellDto_equals_135011067517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3880 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3882 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3880, term3880.getClass(), "id", 5127676408959197577L);
        setLongField(term3882, term3882.getClass(), "fastTime", 1437757323580L);
        setField(term3882, term3882.getClass(), "cdate", null);
        setField(term3880, term3880.getClass(), "workDay", term3882);
        setFloatField(term3880, term3880.getClass(), "hours", 0.76550204F);
        setBooleanField(term3880, term3880.getClass(), "blocked", false);
        setBooleanField(term3880, term3880.getClass(), "billable", false);
        setField(term3880, term3880.getClass(), "comment", "kuTXqwMtDB");
        setField(term3880, term3880.getClass(), "rejectReason", "Ghbwtircqb");
        setBooleanField(term3880, term3880.getClass(), "rejected", true);
        term3912 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3912;
        callMethod(klass, "equals", argTypes, term3880, args);
    }

};


