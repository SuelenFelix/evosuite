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

public class TrackUnitCellDto_setComment_59458897914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3678;

    public TrackUnitCellDto_setComment_59458897914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3678 = newInstance(Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto"));
        Object term3680 = newInstance(Class.forName("java.sql.Date"));
        setLongField(term3678, term3678.getClass(), "id", -5476826692763582090L);
        setLongField(term3680, term3680.getClass(), "fastTime", 1706078172457L);
        setField(term3680, term3680.getClass(), "cdate", null);
        setField(term3678, term3678.getClass(), "workDay", term3680);
        setFloatField(term3678, term3678.getClass(), "hours", 0.9985961F);
        setBooleanField(term3678, term3678.getClass(), "blocked", false);
        setBooleanField(term3678, term3678.getClass(), "billable", false);
        setField(term3678, term3678.getClass(), "comment", "flxyYxBRtu");
        setField(term3678, term3678.getClass(), "rejectReason", "OclPbYPkcH");
        setBooleanField(term3678, term3678.getClass(), "rejected", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.tracker.response.TrackUnitCellDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IoAlmYsBwc";
        callMethod(klass, "setComment", argTypes, term3678, args);
    }

};


